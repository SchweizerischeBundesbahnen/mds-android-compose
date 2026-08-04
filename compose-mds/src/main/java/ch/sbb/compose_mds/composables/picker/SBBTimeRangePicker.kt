package ch.sbb.compose_mds.composables.picker

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.PreviewLightDark
import ch.sbb.compose_mds.R
import ch.sbb.compose_mds.composables.container.SBBContentBox
import ch.sbb.compose_mds.theme.SBBTheme
import kotlinx.datetime.LocalTime

object SBBTimeRangePicker {
    @Composable
    operator fun invoke(
        startTime: LocalTime,
        endTime: LocalTime,
        onRangeChange: (LocalTime, LocalTime) -> Unit,
        modifier: Modifier = Modifier,
        separatorText: String = stringResource(R.string.picker_range_and),
        style: SBBPickerStyle = SBBTheme.picker,
        boxed: Boolean = false,
    ) {
        fun emitRange(
            newStart: LocalTime = startTime,
            newEnd: LocalTime = endTime,
        ) {
            onRangeChange(newStart, newEnd)
        }

        Row(
            modifier = modifier,
        ) {
            SBBTimePicker(
                modifier = Modifier.weight(1f),
                selectedTime = startTime,
                onTimeChange = { emitRange(newStart = it) },
                style = style,
                boxed = boxed,
            )

            SBBPickerSeparator(
                separatorText = separatorText,
                style = style,
                boxed = boxed,
            )

            SBBTimePicker(
                modifier = Modifier.weight(1f),
                selectedTime = endTime,
                onTimeChange = { emitRange(newEnd = it) },
                style = style,
                boxed = boxed,
            )
        }
    }

    @Composable
    fun Boxed(
        startTime: LocalTime,
        endTime: LocalTime,
        onRangeChange: (LocalTime, LocalTime) -> Unit,
        modifier: Modifier = Modifier,
        separatorText: String = stringResource(R.string.picker_range_and),
        style: SBBPickerStyle = SBBTheme.picker,
    ) {
        SBBContentBox(contentPadding = PaddingValues.Zero) {
            invoke(
                startTime = startTime,
                endTime = endTime,
                onRangeChange = onRangeChange,
                modifier = modifier,
                separatorText = separatorText,
                style = style,
                boxed = true,
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun Preview_SBB_TimeRangePicker() {
    SBBTheme {
        SBBTimeRangePicker(
            startTime = LocalTime(5, 25),
            endTime = LocalTime(22, 45),
            onRangeChange = { _, _ -> },
        )
    }
}
