package ch.sbb.compose_mds.composables.picker

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import ch.sbb.compose_mds.theme.SBBSpacing
import ch.sbb.compose_mds.theme.SBBTheme

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
            textStyle = style.layout.separatorStyle,
            horizontalPadding = SBBSpacing.XSmall,
        )
    SBBPickerWheelContainer(
        modifier = Modifier.width(separatorWidth) then modifier,
        highlightSelected = false,
        boxed = boxed,
    ) {
        Column(
            modifier = Modifier.height(style.itemSizes.pickerHeight),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(SBBSpacing.XXSmall),
        ) {
            Box(modifier = Modifier.weight(1f)) {
                VerticalDivider()
            }
            Text(text = separatorText, style = style.layout.separatorStyle)
            Box(modifier = Modifier.weight(1f)) {
                VerticalDivider()
            }
        }
    }
}
