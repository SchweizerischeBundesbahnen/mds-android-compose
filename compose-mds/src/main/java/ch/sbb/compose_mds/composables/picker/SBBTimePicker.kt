package ch.sbb.compose_mds.composables.picker

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.PreviewLightDark
import ch.sbb.compose_mds.composables.container.SBBContentBox
import ch.sbb.compose_mds.theme.SBBTheme
import kotlinx.datetime.LocalTime

object SBBTimePicker {
    @Composable
    operator fun invoke(
        selectedTime: LocalTime,
        onTimeChange: (LocalTime) -> Unit,
        modifier: Modifier = Modifier,
        style: SBBPickerStyle = SBBTheme.picker,
        boxed: Boolean = false,
    ) {
        fun emitTime(
            newHour: Int = selectedTime.hour,
            newMinute: Int = selectedTime.minute,
        ) {
            onTimeChange(
                LocalTime(newHour, newMinute),
            )
        }

        SBBPickerWheelContainer(
            modifier = modifier,
            boxed = boxed,
        ) {
            HourPicker(
                modifier = Modifier.weight(1f),
                hour = selectedTime.hour,
                onSelectionChange = { emitTime(newHour = it) },
                textAlign = TextAlign.End,
                style = style,
            )

            MinutePicker(
                modifier = Modifier.weight(1f),
                minute = selectedTime.minute,
                onSelectionChange = { emitTime(newMinute = it) },
                textAlign = TextAlign.Start,
                style = style,
            )
        }
    }

    /**
     * A variant of the [SBBPickerWheel] to pick a [LocalTime]. It combines [HourPicker] and [MinutePicker].
     *
     * @param selectedTime The currently selected [LocalTime].
     * @param onTimeChange Callback when the [LocalTime] was changed.
     * @param modifier The modifier to be applied to the layout.
     * @param style Overrideable [SBBPickerStyle]. Default is the defined style in [SBBTheme].
     */
    @Composable
    fun Default(
        selectedTime: LocalTime,
        onTimeChange: (LocalTime) -> Unit,
        modifier: Modifier = Modifier,
        style: SBBPickerStyle = SBBTheme.picker,
    ) {
        invoke(
            selectedTime = selectedTime,
            onTimeChange = onTimeChange,
            modifier = modifier,
            style = style,
            boxed = false,
        )
    }

    /**
     * Boxed version of [SBBTimePicker.Default].
     */
    @Composable
    fun Boxed(
        selectedTime: LocalTime,
        onTimeChange: (LocalTime) -> Unit,
        modifier: Modifier = Modifier,
        style: SBBPickerStyle = SBBTheme.picker,
    ) {
        SBBContentBox(contentPadding = PaddingValues.Zero) {
            invoke(
                selectedTime = selectedTime,
                onTimeChange = onTimeChange,
                modifier = modifier,
                style = style,
                boxed = true,
            )
        }
    }
}

/**
 * A hour picker in 24h format implemented with a [SBBPickerWheel].
 *
 * @param hour The currently selected hour.
 * @param onSelectionChange Callback when the selected hour has changed.
 * @param modifier The modifier to be applied to the layout.
 * @param style Overrideable [SBBPickerStyle]. Default is the defined style in [SBBTheme].
 * @param textAlign The [TextAlign].
 */
@Composable
fun HourPicker(
    hour: Int,
    onSelectionChange: (Int) -> Unit,
    modifier: Modifier = Modifier,
    textAlign: TextAlign = TextAlign.Center,
    style: SBBPickerStyle = SBBTheme.picker,
) {
    SBBPickerWheel(
        modifier = modifier,
        items = List(24) { it },
        currentItem = hour,
        textSelector = { "$it".padStart(2, '0') },
        infinite = true,
        onSelectionChange = onSelectionChange,
        textAlign = textAlign,
        style = style,
    )
}

/**
 * A minute picker in 5 Minute steps implemented with a [SBBPickerWheel].
 *
 * @param minute The currently selected minute.
 * @param onSelectionChange Callback when the selected minute has changed.
 * @param modifier The modifier to be applied to the layout.
 * @param style Overrideable [SBBPickerStyle]. Default is the defined style in [SBBTheme].
 * @param textAlign The [TextAlign].
 */
@Composable
fun MinutePicker(
    minute: Int,
    onSelectionChange: (Int) -> Unit,
    modifier: Modifier = Modifier,
    textAlign: TextAlign = TextAlign.Center,
    style: SBBPickerStyle = SBBTheme.picker,
) {
    SBBPickerWheel(
        modifier = modifier,
        items = List(12) { it * 5 },
        currentItem = minute,
        textSelector = { "$it".padStart(2, '0') },
        infinite = true,
        onSelectionChange = onSelectionChange,
        textAlign = textAlign,
        style = style,
    )
}

@PreviewLightDark
@Composable
private fun Preview_SBB_TimePicker() {
    SBBTheme {
        SBBTimePicker.Default(
            selectedTime = LocalTime(22, 15),
            onTimeChange = { },
        )
    }
}
