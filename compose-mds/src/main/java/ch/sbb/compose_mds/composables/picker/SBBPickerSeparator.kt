package ch.sbb.compose_mds.composables.picker

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import ch.sbb.compose_mds.theme.SBBSpacing
import ch.sbb.compose_mds.theme.SBBTheme

/**
 * A separator placed between two [SBBPickerWheel] when picking a range.
 *
 * @param separatorText The text shown in the middle of the separator.
 * @param modifier The modifier to be applied to the layout.
 * @param separatorText The text shown between the two [SBBTimePicker].
 * @param style Overrideable [SBBPickerStyle]. Default is the defined style in [SBBTheme].
 */
@Composable
fun SBBPickerSeparator(
    separatorText: String,
    modifier: Modifier = Modifier,
    style: SBBPickerStyle = SBBTheme.picker,
    boxed: Boolean = false,
) {
    val separatorWidth =
        rememberLabelWheelWidth(
            label = separatorText,
            textStyle = style.layout.separatorTextStyle,
            horizontalPadding = SBBSpacing.Zero,
        )
    SBBPickerWheelContainer(
        modifier = Modifier.width(separatorWidth) then modifier,
        highlightSelected = false,
        boxed = boxed,
        contentPadding = PaddingValues.Zero,
    ) {
        Column(
            modifier = Modifier.height(style.itemSizes.pickerHeight),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(SBBSpacing.XXSmall),
        ) {
            Box(modifier = Modifier.weight(1f)) {
                VerticalDivider()
            }
            Text(text = separatorText, style = style.layout.separatorTextStyle)
            Box(modifier = Modifier.weight(1f)) {
                VerticalDivider()
            }
        }
    }
}
