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
        SBBDateTimePicker(
            onDateTimeChange = {},
        )
    }
}
