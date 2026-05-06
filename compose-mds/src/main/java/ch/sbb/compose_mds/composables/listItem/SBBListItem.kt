package ch.sbb.compose_mds.composables.listItem

// medium icons imported above
import SBBTheme
import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.background
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.indication
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.Preview
import ch.sbb.compose_mds.sbbicons.Medium
import ch.sbb.compose_mds.sbbicons.SBBIcons
import ch.sbb.compose_mds.sbbicons.medium.AirplaneMedium
import ch.sbb.compose_mds.sbbicons.medium.AlarmClockMedium
import ch.sbb.compose_mds.sbbicons.medium.ArchiveBoxMedium
import ch.sbb.compose_mds.sbbicons.medium.ArrowRightMedium

// States & variants
enum class SBBListItemState { Default, Pressed, Disabled }

enum class SBBListItemVariant { Listed, Boxed }

// The composable
@Composable
fun SBBListItem(
    modifier: Modifier = Modifier,
    variant: SBBListItemVariant = SBBListItemVariant.Listed,
    state: SBBListItemState = SBBListItemState.Default,
    text: String,
    subtext: String? = null,
    onClick: (() -> Unit)? = null,
    leading: ImageVector? = null,
    trailing: ImageVector? = null,
    isLastElement: Boolean = false,
) {
    val bgColor =
        if (variant == SBBListItemVariant.Listed) {
            Color.Transparent
        } else {
            when (state) {
                SBBListItemState.Default -> LocalSBBListItemTokens.current.colors.background
                SBBListItemState.Pressed -> LocalSBBListItemTokens.current.colors.pressedBackground
                SBBListItemState.Disabled -> LocalSBBListItemTokens.current.colors.disabledBackground
            }
        }

    val contentColor =
        when (state) {
            SBBListItemState.Disabled -> LocalSBBListItemTokens.current.colors.disabledContent
            else -> LocalSBBListItemTokens.current.colors.content
        }

    val shape =
        if (variant == SBBListItemVariant.Boxed) LocalSBBListItemTokens.current.layout.shape else RectangleShape

    val paddingH = LocalSBBListItemTokens.current.layout.paddingHorizontal
    val paddingV = LocalSBBListItemTokens.current.layout.paddingVertical
    val gapIconText = LocalSBBListItemTokens.current.layout.gapBetweenIconAndText
    val gapTitleSub = LocalSBBListItemTokens.current.layout.gapBetweenTitleAndSubtext

    val animatedBg by animateColorAsState(bgColor)

    val interactionSource = remember { MutableInteractionSource() }
    val indication = LocalIndication.current

    val clickableModifier =
        if (onClick != null && state != SBBListItemState.Disabled) {
            modifier
                .clip(shape)
                .background(animatedBg)
                .indication(interactionSource, indication)
                .combinedClickable(
                    interactionSource = interactionSource,
                    indication = null, // we've already added indication above
                    onClick = onClick,
                    enabled = true,
                    role = Role.Button,
                )
        } else {
            modifier.clip(shape).background(animatedBg)
        }

    Column {
        Row(
            modifier =
                clickableModifier
                    .heightIn(min = LocalSBBListItemTokens.current.layout.minHeight)
                    .padding(horizontal = paddingH, vertical = paddingV),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
        ) {
            CompositionLocalProvider(LocalContentColor provides contentColor) {
                if (leading != null) {
                    Box(
                        modifier = Modifier.size(LocalSBBListItemTokens.current.layout.iconSize),
                        contentAlignment = Alignment.Center,
                    ) {
                        Icon(
                            imageVector = leading,
                            contentDescription = null,
                            tint = LocalContentColor.current,
                        )
                    }
                    Spacer(Modifier.width(gapIconText))
                }

                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text,
                        style = LocalSBBListItemTokens.current.typography.title,
                    )
                    if (subtext != null) {
                        Spacer(Modifier.height(gapTitleSub))
                        Text(
                            subtext,
                            style = LocalSBBListItemTokens.current.typography.subtext,
                        )
                    }
                }

                if (trailing != null) {
                    Spacer(Modifier.width(gapIconText))
                    Box(
                        modifier = Modifier.size(LocalSBBListItemTokens.current.layout.iconSize),
                        contentAlignment = Alignment.Center,
                    ) {
                        Icon(
                            imageVector = trailing,
                            contentDescription = null,
                            tint = LocalContentColor.current,
                        )
                    }
                }
            }
        }
    }
    if (!isLastElement && variant == SBBListItemVariant.Listed) HorizontalDivider()
}

@Preview(showBackground = true, name = "ListItem - Default")
@Composable
fun PreviewSBBListItem_Default() {
    SBBTheme {
        SBBListItem(
            text = "Item title",
            subtext = "Subtext example",
            leading = SBBIcons.Medium.AirplaneMedium,
        )
    }
}

@Preview(showBackground = true, name = "ListItem - Pressed")
@Composable
fun PreviewSBBListItem_Pressed() {
    SBBTheme {
        SBBListItem(
            text = "Pressed item",
            state = SBBListItemState.Pressed,
            leading = SBBIcons.Medium.AlarmClockMedium,
            isLastElement = true,
        )
    }
}

@Preview(showBackground = true, name = "ListItem - Disabled")
@Composable
fun PreviewSBBListItem_Disabled() {
    SBBTheme {
        SBBListItem(
            text = "Disabled item",
            state = SBBListItemState.Disabled,
            leading = SBBIcons.Medium.ArchiveBoxMedium,
            isLastElement = true,
        )
    }
}

@Preview(showBackground = true, name = "ListItem - Boxed Variant")
@Composable
fun PreviewSBBListItem_Boxed() {
    SBBTheme {
        SBBListItem(
            variant = SBBListItemVariant.Boxed,
            text = "Boxed item",
            subtext = "Boxed subtext",
            leading = SBBIcons.Medium.AirplaneMedium,
        )
    }
}

@Preview(showBackground = true, name = "ListItem - Trailing Icon")
@Composable
fun PreviewSBBListItem_IconRight() {
    SBBTheme {
        SBBListItem(
            text = "Icon right",
            subtext = "Icon right",
            trailing = SBBIcons.Medium.ArrowRightMedium,
            isLastElement = true,
        )
    }
}
