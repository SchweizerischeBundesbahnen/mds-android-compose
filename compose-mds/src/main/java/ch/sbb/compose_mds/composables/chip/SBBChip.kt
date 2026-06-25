package ch.sbb.compose_mds.composables.chip

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.PreviewLightDark
import ch.sbb.compose_mds.sbbicons.SBBIcons
import ch.sbb.compose_mds.sbbicons.Small
import ch.sbb.compose_mds.sbbicons.small.CrossSmall
import ch.sbb.compose_mds.theme.SBBTheme

@Composable
fun SBBChip(
    label: String,
    amount: Int,
    modifier: Modifier = Modifier,
    onSelectedChange: ((Boolean) -> Unit)? = null,
    selected: Boolean = false,
    enabled: Boolean = onSelectedChange != null,
    interactionSource: MutableInteractionSource? = remember { MutableInteractionSource() },
    style: SBBChipStyle = SBBTheme.chip,
) {
    val colors by style.resolvedColors(enabled)
    Row(
        modifier =
            modifier
                .clip(style.layout.shape)
                .border(
                    border = style.borderStroke(enabled),
                    shape = style.layout.shape,
                ).background(
                    color = colors.background,
                ).selectable(
                    selected = selected,
                    enabled = enabled,
                    interactionSource = interactionSource,
                    onClick = { onSelectedChange?.invoke(!selected) },
                ).padding(style.layout.padding),
        horizontalArrangement = Arrangement.spacedBy(style.layout.labelGap),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            text = label,
            style = style.typography.label,
            color = colors.text,
        )
        if (selected) {
            Box(
                modifier =
                    Modifier
                        .size(size = style.layout.indicatorSize)
                        .background(
                            color = colors.backgroundClose,
                            shape = style.layout.indicatorShape,
                        ).align(Alignment.CenterVertically),
                contentAlignment = Alignment.Center,
            ) {
                Icon(
                    imageVector = SBBIcons.Small.CrossSmall,
                    contentDescription = null,
                    tint = colors.iconClose,
                )
            }
        } else {
            Box(
                modifier =
                    Modifier
                        .size(size = style.layout.indicatorSize)
                        .background(
                            color = colors.backgroundNumber,
                            shape = style.layout.indicatorShape,
                        ).align(Alignment.CenterVertically),
                contentAlignment = Alignment.Center,
            ) {
                Text(
                    text = "$amount",
                    style = style.typography.number,
                    textAlign = TextAlign.Center,
                    color = colors.textNumber,
                )
            }
        }
    }
}

@PreviewLightDark
@Composable
private fun Preview_SBBChip_Default() {
    SBBTheme {
        SBBChip(
            label = "Chip label",
            amount = 42,
            selected = false,
            enabled = true,
            onSelectedChange = {},
        )
    }
}

@PreviewLightDark
@Composable
private fun Preview_SBBChip_Selected() {
    SBBTheme {
        SBBChip(
            label = "Chip label",
            amount = 42,
            selected = true,
            enabled = true,
            onSelectedChange = {},
        )
    }
}

@PreviewLightDark
@Composable
private fun Preview_SBBChip_Disabled() {
    SBBTheme {
        SBBChip(
            label = "Chip label",
            amount = 1,
            selected = false,
            enabled = false,
            onSelectedChange = {},
        )
    }
}

@PreviewLightDark
@Composable
private fun Preview_SBBChip_Disabled_Selected() {
    SBBTheme {
        SBBChip(
            label = "Chip label",
            amount = 1,
            selected = true,
            enabled = false,
            onSelectedChange = {},
        )
    }
}
