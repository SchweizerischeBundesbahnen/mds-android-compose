package ch.sbb.compose_mds.composables.picker

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.PreviewLightDark
import ch.sbb.compose_mds.composables.container.SBBContentBox
import ch.sbb.compose_mds.theme.SBBTheme
import java.text.DateFormatSymbols
import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalDateRange
import kotlinx.datetime.Month
import kotlinx.datetime.YearMonth
import kotlinx.datetime.number
import kotlinx.datetime.yearMonth

object SBBDatePicker {
    @Composable
    operator fun invoke(
        selectedDate: LocalDate,
        onDateChange: (LocalDate) -> Unit,
        modifier: Modifier = Modifier,
        style: SBBPickerStyle = SBBTheme.picker,
        range: LocalDateRange =
            LocalDateRange(
                YearMonth(1900, Month.JANUARY).firstDay,
                YearMonth(2100, Month.DECEMBER).lastDay,
            ),
        boxed: Boolean = false,
    ) {
        val safeDate = selectedDate.coerceIn(range)

        LaunchedEffect(selectedDate, onDateChange) {
            if (safeDate != selectedDate) {
                onDateChange(safeDate)
            }
        }

        val year = safeDate.year
        val month = safeDate.month
        val day = safeDate.day

        fun emitDate(
            newYear: Int = year,
            newMonth: Month = month,
            newDay: Int = day,
        ) {
            val correctedDay = newDay.coerceIn(1, YearMonth(newYear, newMonth).lastDay.day)

            onDateChange(
                LocalDate(newYear, newMonth, correctedDay),
            )
        }

        SBBPickerWheelContainer(
            modifier = modifier,
            style = style,
            boxed = boxed,
        ) {
            DayPicker(
                date = safeDate,
                onSelectionChange = { emitDate(newDay = it) },
                style = style,
            )

            MonthPicker(
                modifier = Modifier.weight(1f),
                month = month,
                onSelectionChange = { emitDate(newMonth = it) },
                textAlign = TextAlign.Start,
                style = style,
            )

            YearPicker(
                range = range,
                year = year,
                onSelectionChange = { emitDate(newYear = it) },
                textAlign = TextAlign.Center,
                style = style,
            )
        }
    }

    /**
     * A variant of the [SBBPickerWheel] to pick a [LocalDate]. It combines [DayPicker], [MonthPicker] and [YearPicker].
     *
     * @param selectedDate The currently selected [LocalDate].
     * @param onDateChange Callback when the [LocalDate] was changed.
     * @param modifier The modifier to be applied to the layout.
     * @param style Overrideable [SBBPickerStyle]. Default is the defined style in [SBBTheme].
     * @param range The start and end of selectable [LocalDate].
     */
    @Composable
    fun Default(
        selectedDate: LocalDate,
        onDateChange: (LocalDate) -> Unit,
        modifier: Modifier = Modifier,
        style: SBBPickerStyle = SBBTheme.picker,
        range: LocalDateRange =
            LocalDateRange(
                YearMonth(1900, Month.JANUARY).firstDay,
                YearMonth(2100, Month.DECEMBER).lastDay,
            ),
    ) {
        invoke(
            selectedDate = selectedDate,
            onDateChange = onDateChange,
            modifier = modifier,
            style = style,
            range = range,
            boxed = false,
        )
    }

    /**
     * Boxed version of [SBBDatePicker.Default].
     */
    @Composable
    fun Boxed(
        selectedDate: LocalDate,
        onDateChange: (LocalDate) -> Unit,
        modifier: Modifier = Modifier,
        style: SBBPickerStyle = SBBTheme.picker,
        range: LocalDateRange =
            LocalDateRange(
                YearMonth(1900, Month.JANUARY).firstDay,
                YearMonth(2100, Month.DECEMBER).lastDay,
            ),
    ) {
        SBBContentBox(contentPadding = PaddingValues.Zero) {
            invoke(
                selectedDate = selectedDate,
                onDateChange = onDateChange,
                modifier = modifier,
                style = style,
                range = range,
                boxed = true,
            )
        }
    }
}

/**
 * A day picker implemented with a [SBBPickerWheel].
 *
 * @param date The currently selected [LocalDate]. Month and year are used to calculate the number of days in the selected [YearMonth].
 * @param onSelectionChange Callback when the selected element has changed.
 * @param modifier The modifier to be applied to the layout.
 * @param style Overrideable [SBBPickerStyle]. Default is the defined style in [SBBTheme].
 */
@Composable
fun DayPicker(
    date: LocalDate,
    onSelectionChange: (Int) -> Unit,
    modifier: Modifier = Modifier,
    style: SBBPickerStyle = SBBTheme.picker,
) {
    val dayWidth = rememberLabelWheelWidth("99.")
    SBBPickerWheel(
        modifier = Modifier.width(dayWidth) then modifier,
        items = date.yearMonth.days.map { it.day },
        currentItem = date.coerceIn(date.yearMonth.days).day,
        textSelector = { "${it.toString().padStart(2, '0')}." },
        infinite = true,
        onSelectionChange = onSelectionChange,
        style = style,
    )
}

/**
 * A month picker implemented with a [SBBPickerWheel].
 *
 * @param month The currently selected [Month].
 * @param onSelectionChange Callback when the selected element has changed.
 * @param textAlign The [TextAlign].
 * @param modifier The modifier to be applied to the layout.
 * @param style Overrideable [SBBPickerStyle]. Default is the defined style in [SBBTheme].
 */
@Composable
fun MonthPicker(
    month: Month,
    onSelectionChange: (Month) -> Unit,
    textAlign: TextAlign,
    modifier: Modifier = Modifier,
    style: SBBPickerStyle = SBBTheme.picker,
) {
    val locale = LocalConfiguration.current.locales[0]
    val monthLabels =
        remember(locale) {
            DateFormatSymbols.getInstance(locale).months
        }
    SBBPickerWheel(
        modifier = modifier,
        items = Month.entries,
        currentItem = month,
        textSelector = { monthLabels[it.number - 1] },
        infinite = true,
        onSelectionChange = onSelectionChange,
        textAlign = textAlign,
        style = style,
    )
}

/**
 * A year picker implemented with a [SBBPickerWheel].
 *
 * @param range Year range as [LocalDateRange].
 * @param year The currently selected year as [Int].
 * @param onSelectionChange Callback when the selected element has changed.
 * @param textAlign The [TextAlign].
 * @param modifier The modifier to be applied to the layout.
 * @param style Overrideable [SBBPickerStyle]. Default is the defined style in [SBBTheme].
 */
@Composable
fun YearPicker(
    range: LocalDateRange,
    year: Int,
    onSelectionChange: (Int) -> Unit,
    textAlign: TextAlign,
    modifier: Modifier = Modifier,
    style: SBBPickerStyle = SBBTheme.picker,
) {
    val years = range.distinctBy { it.year }.map { it.year }
    val yearWidth = rememberLabelWheelWidth("9999")

    SBBPickerWheel(
        modifier = Modifier.width(yearWidth) then modifier,
        items = years,
        currentItem = year,
        textSelector = { it.toString() },
        infinite = false,
        onSelectionChange = onSelectionChange,
        textAlign = textAlign,
        style = style,
    )
}

@PreviewLightDark
@Composable
private fun Preview_SBB_DatePicker() {
    SBBTheme {
        SBBDatePicker.Default(
            selectedDate = LocalDate(2026, 7, 15),
            onDateChange = {},
        )
    }
}
