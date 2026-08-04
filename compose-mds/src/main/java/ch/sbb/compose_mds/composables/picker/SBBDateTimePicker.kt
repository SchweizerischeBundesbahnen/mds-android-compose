package ch.sbb.compose_mds.composables.picker

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewLightDark
import ch.sbb.compose_mds.R
import ch.sbb.compose_mds.composables.container.SBBContentBox
import ch.sbb.compose_mds.theme.SBBTheme
import kotlin.time.Clock
import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalDateRange
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.LocalTime
import kotlinx.datetime.Month
import kotlinx.datetime.TimeZone
import kotlinx.datetime.YearMonth
import kotlinx.datetime.format
import kotlinx.datetime.toLocalDateTime

object DateTimePicker

/**
 * current time as [LocalDateTime]
 */
val DateTimePicker.now
    get() = Clock.System.now().toLocalDateTime(TimeZone.currentSystemDefault())

object SBBDateTimePicker {
    @Composable
    operator fun invoke(
        onDateTimeChange: (LocalDateTime) -> Unit,
        modifier: Modifier = Modifier,
        style: SBBPickerStyle = SBBTheme.picker,
        selectedDateTime: LocalDateTime = DateTimePicker.now,
        dateRange: LocalDateRange =
            LocalDateRange(
                YearMonth(DateTimePicker.now.year - 1, Month.JANUARY).firstDay,
                YearMonth(DateTimePicker.now.year + 1, Month.DECEMBER).lastDay,
            ),
        boxed: Boolean = false,
    ) {
        fun emitDateTime(
            newDate: LocalDate = selectedDateTime.date,
            newHour: Int = selectedDateTime.hour,
            newMinute: Int = selectedDateTime.minute,
        ) {
            onDateTimeChange(LocalDateTime(newDate, LocalTime(newHour, newMinute)))
        }

        val timeWidth = rememberLabelWheelWidth("99")
        SBBPickerWheelContainer(
            modifier = modifier,
            style = style,
            boxed = boxed,
        ) {
            CombinedDatePicker(
                modifier = Modifier.weight(1f),
                date = selectedDateTime.date,
                range = dateRange,
                onDateChange = { emitDateTime(newDate = it) },
                textAlign = TextAlign.End,
                style = style,
            )
            HourPicker(
                modifier = Modifier.width(timeWidth),
                hour = selectedDateTime.hour,
                onSelectionChange = { emitDateTime(newHour = it) },
                style = style,
            )

            MinutePicker(
                modifier = Modifier.width(timeWidth),
                minute = selectedDateTime.minute,
                onSelectionChange = { emitDateTime(newMinute = it) },
                style = style,
            )
        }
    }

    /**
     * A variant of the [SBBPickerWheel] to pick a [LocalDateTime]. It combines [CombinedDatePicker], [HourPicker] and [MinutePicker].
     *
     * @param onDateTimeChange Callback when the [LocalDateTime] was changed.
     * @param modifier The modifier to be applied to the layout.
     * @param selectedDateTime The currently selected [LocalDateTime].
     * @param style Overrideable [SBBPickerStyle]. Default is the defined style in [SBBTheme].
     * @param range The start and end [LocalDate].
     */
    @Composable
    fun Default(
        onDateTimeChange: (LocalDateTime) -> Unit,
        modifier: Modifier = Modifier,
        selectedDateTime: LocalDateTime = DateTimePicker.now,
        style: SBBPickerStyle = SBBTheme.picker,
        range: LocalDateRange =
            LocalDateRange(
                YearMonth(DateTimePicker.now.year - 1, Month.JANUARY).firstDay,
                YearMonth(DateTimePicker.now.year + 1, Month.DECEMBER).lastDay,
            ),
    ) {
        invoke(
            onDateTimeChange = onDateTimeChange,
            modifier = modifier,
            style = style,
            selectedDateTime = selectedDateTime,
            dateRange = range,
            boxed = false,
        )
    }

    /**
     * Boxed version of [SBBDateTimePicker.Default].
     */
    @Composable
    fun Boxed(
        onDateTimeChange: (LocalDateTime) -> Unit,
        modifier: Modifier = Modifier,
        style: SBBPickerStyle = SBBTheme.picker,
        selectedDateTime: LocalDateTime = DateTimePicker.now,
        dateRange: LocalDateRange =
            LocalDateRange(
                YearMonth(DateTimePicker.now.year - 1, Month.JANUARY).firstDay,
                YearMonth(DateTimePicker.now.year + 1, Month.DECEMBER).lastDay,
            ),
    ) {
        SBBContentBox(contentPadding = PaddingValues.Zero) {
            invoke(
                onDateTimeChange = onDateTimeChange,
                modifier = modifier,
                style = style,
                selectedDateTime = selectedDateTime,
                dateRange = dateRange,
                boxed = true,
            )
        }
    }
}

/**
 * A combined date picker implemented with a [SBBPickerWheel].
 *
 * @param date The currently selected [LocalDate].
 * @param range The start and end of selectable [LocalDate].
 * @param onDateChange Callback when the selected [LocalDate] has changed.
 * @param modifier The modifier to be applied to the layout.
 * @param style Overrideable [SBBPickerStyle]. Default is the defined style in [SBBTheme].
 * @param textAlign The [TextAlign].
 */
@Composable
fun CombinedDatePicker(
    date: LocalDate,
    range: LocalDateRange,
    onDateChange: (LocalDate) -> Unit,
    modifier: Modifier = Modifier,
    style: SBBPickerStyle = SBBTheme.picker,
    textAlign: TextAlign = TextAlign.Center,
) {
    val dateFormatter = style.layout.rememberDateFormat()

    val today = DateTimePicker.now
    val todayText = stringResource(R.string.picker_today)
    SBBPickerWheel(
        modifier = modifier,
        items = range.sorted(),
        currentItem = date,
        textSelector = {
            if (it == today.date) {
                todayText
            } else {
                it.format(dateFormatter)
            }
        },
        infinite = false,
        onSelectionChange = onDateChange,
        textAlign = textAlign,
        style = style,
    )
}

@PreviewLightDark
@Preview
@Composable
private fun Preview_SBB_DateTimePicker() {
    SBBTheme {
        SBBDateTimePicker.Default(
            onDateTimeChange = {},
        )
    }
}
