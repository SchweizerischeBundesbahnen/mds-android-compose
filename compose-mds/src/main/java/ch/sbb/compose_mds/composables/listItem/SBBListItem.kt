package ch.sbb.compose_mds.composables.listItem

import SBBTheme
import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import ch.sbb.compose_mds.composables.container.SBBContentBox
import ch.sbb.compose_mds.sbbicons.Medium
import ch.sbb.compose_mds.sbbicons.SBBIcons
import ch.sbb.compose_mds.sbbicons.Small
import ch.sbb.compose_mds.sbbicons.medium.AirplaneMedium
import ch.sbb.compose_mds.sbbicons.medium.AlarmClockMedium
import ch.sbb.compose_mds.sbbicons.medium.ArchiveBoxMedium
import ch.sbb.compose_mds.sbbicons.medium.ArrowRightMedium
import ch.sbb.compose_mds.sbbicons.small.ChevronSmallRightSmall
import ch.sbb.compose_mds.sbbicons.small.FaceKingSmall

object SBBListItem {
    object Boxed {
        @Composable
        fun Default(
            modifier: Modifier = Modifier,
            leading: ImageVector? = null,
            title: String,
            subtitle: String? = null,
            trailing: ImageVector? = null,
            onClick: (() -> Unit)? = null,
            enabled: Boolean = true,
        ) {
            Custom(
                modifier = modifier,
                leadingIcon = leading,
                titleText = title,
                subtitleText = subtitle,
                trailingIcon = trailing,
                onClick = onClick,
                enabled = enabled,
            )
        }

        @Composable
        fun Disabled(
            modifier: Modifier = Modifier,
            leading: ImageVector? = null,
            title: String,
            subtitle: String? = null,
            trailing: ImageVector? = null,
            onClick: (() -> Unit)? = null,
        ) {
            Default(
                modifier = modifier,
                leading = leading,
                title = title,
                subtitle = subtitle,
                trailing = trailing,
                onClick = onClick,
                enabled = false,
            )
        }

        @Composable
        fun Link(
            modifier: Modifier = Modifier,
            title: String,
            subtitle: String? = null,
            leading: ImageVector? = null,
            onClick: (() -> Unit),
        ) {
            Custom(
                modifier = modifier,
                titleText = title,
                subtitleText = subtitle,
                leadingIcon = leading,
                onClick = onClick,
                trailingIcon = SBBIcons.Small.ChevronSmallRightSmall,
            )
        }

        @Composable
        fun Custom(
            modifier: Modifier = Modifier,
            interactionSource: MutableInteractionSource? = remember { MutableInteractionSource() },
            leading: (@Composable (() -> Unit))? = null,
            leadingIcon: ImageVector? = null,
            title: (@Composable (() -> Unit))? = null,
            titleText: String? = null,
            subtitle: (@Composable (() -> Unit))? = null,
            subtitleText: String? = null,
            trailing: (@Composable (() -> Unit))? = null,
            trailingIcon: ImageVector? = null,
            onClick: (() -> Unit)? = null,
            onLongClick: (() -> Unit)? = null,
            enabled: Boolean = (onClick != null) || (onLongClick != null),
            padding: PaddingValues = LocalSBBListItemStyle.current.layout.padding,
            trailingGapWidth: Dp = LocalSBBListItemStyle.current.layout.gapBetweenIconAndText,
            leadingGapWidth: Dp = LocalSBBListItemStyle.current.layout.gapBetweenIconAndText,
            subtitleGapHeight: Dp = LocalSBBListItemStyle.current.layout.gapBetweenTitleAndSubtitle,
            minHeight: Dp = LocalSBBListItemStyle.current.layout.minHeight,
            titleStyle: TextStyle = LocalSBBListItemStyle.current.typography.title,
            subtitleStyle: TextStyle = LocalSBBListItemStyle.current.typography.subtitle,
            contentColor: Color = LocalSBBListItemStyle.current.colors.content,
            disabledContentColor: Color = LocalSBBListItemStyle.current.colors.disabledContent,
            titleMaxLines: Int = 1,
            subtitleMaxLines: Int = 1,
        ) {
            SBBContentBox(contentPadding = PaddingValues.Zero) {
                SBBListItem.Custom(
                    modifier = modifier,
                    interactionSource = interactionSource,
                    leading = leading,
                    leadingIcon = leadingIcon,
                    title = title,
                    titleText = titleText,
                    subtitle = subtitle,
                    subtitleText = subtitleText,
                    trailing = trailing,
                    trailingIcon = trailingIcon,
                    onClick = onClick,
                    onLongClick = onLongClick,
                    enabled = enabled,
                    padding = padding,
                    trailingGapWidth = trailingGapWidth,
                    leadingGapWidth = leadingGapWidth,
                    subtitleGapHeight = subtitleGapHeight,
                    titleStyle = titleStyle,
                    subtitleStyle = subtitleStyle,
                    titleMaxLines = titleMaxLines,
                    contentColor = contentColor,
                    disabledContentColor = disabledContentColor,
                    subtitleMaxLines = subtitleMaxLines,
                    minHeight = minHeight,
                )
            }
        }
    }

    @Composable
    fun Default(
        modifier: Modifier = Modifier,
        leading: ImageVector? = null,
        title: String,
        subtitle: String? = null,
        trailing: ImageVector? = null,
        onClick: (() -> Unit)? = null,
        enabled: Boolean = true,
    ) {
        Custom(
            modifier = modifier,
            leadingIcon = leading,
            titleText = title,
            subtitleText = subtitle,
            trailingIcon = trailing,
            onClick = onClick,
            enabled = enabled,
        )
    }

    @Composable
    fun Disabled(
        modifier: Modifier = Modifier,
        leading: ImageVector? = null,
        title: String,
        subtitle: String? = null,
        trailing: ImageVector? = null,
        onClick: (() -> Unit)? = null,
    ) {
        Default(
            modifier = modifier,
            leading = leading,
            title = title,
            subtitle = subtitle,
            trailing = trailing,
            onClick = onClick,
            enabled = false,
        )
    }

    @Composable
    fun Link(
        modifier: Modifier = Modifier,
        title: String,
        subtitle: String? = null,
        leading: ImageVector? = null,
        onClick: (() -> Unit),
    ) {
        Custom(
            modifier = modifier,
            titleText = title,
            subtitleText = subtitle,
            leadingIcon = leading,
            onClick = onClick,
            trailingIcon = SBBIcons.Small.ChevronSmallRightSmall,
        )
    }

    @Composable
    fun Custom(
        modifier: Modifier = Modifier,
        interactionSource: MutableInteractionSource? = remember { MutableInteractionSource() },
        leading: (@Composable (() -> Unit))? = null,
        leadingIcon: ImageVector? = null,
        title: (@Composable (() -> Unit))? = null,
        titleText: String? = null,
        subtitle: (@Composable (() -> Unit))? = null,
        subtitleText: String? = null,
        trailing: (@Composable (() -> Unit))? = null,
        trailingIcon: ImageVector? = null,
        onClick: (() -> Unit)? = null,
        onLongClick: (() -> Unit)? = null,
        enabled: Boolean = (onClick != null) || (onLongClick != null),
        padding: PaddingValues = LocalSBBListItemStyle.current.layout.padding,
        trailingGapWidth: Dp = LocalSBBListItemStyle.current.layout.gapBetweenIconAndText,
        leadingGapWidth: Dp = LocalSBBListItemStyle.current.layout.gapBetweenIconAndText,
        subtitleGapHeight: Dp = LocalSBBListItemStyle.current.layout.gapBetweenTitleAndSubtitle,
        minHeight: Dp = LocalSBBListItemStyle.current.layout.minHeight,
        titleStyle: TextStyle = LocalSBBListItemStyle.current.typography.title,
        subtitleStyle: TextStyle = LocalSBBListItemStyle.current.typography.subtitle,
        contentColor: Color = LocalSBBListItemStyle.current.colors.content,
        disabledContentColor: Color = LocalSBBListItemStyle.current.colors.disabledContent,
        titleMaxLines: Int = 1,
        subtitleMaxLines: Int = 1,
    ) {
        val localContentColor by animateColorAsState(
            if (enabled) contentColor else disabledContentColor,
        )

        // Build leading/trailing composables from icon resource fallback
        val leadingContent: (@Composable (() -> Unit))? =
            when {
                leading != null -> {
                    leading
                }

                leadingIcon != null -> {
                    {
                        Icon(
                            imageVector = leadingIcon,
                            contentDescription = null,
                            tint = localContentColor,
                        )
                    }
                }

                else -> {
                    null
                }
            }

        val trailingContent: (@Composable (() -> Unit))? =
            when {
                trailing != null -> {
                    trailing
                }

                trailingIcon != null -> {
                    {
                        Icon(
                            imageVector = trailingIcon,
                            contentDescription = null,
                            tint = localContentColor,
                        )
                    }
                }

                else -> {
                    null
                }
            }

        // Title composable
        val titleContent: @Composable () -> Unit =
            when {
                title != null -> {
                    title
                }

                titleText != null -> {
                    {
                        Text(
                            text = titleText,
                            maxLines = titleMaxLines,
                            overflow = TextOverflow.Ellipsis,
                            style = titleStyle,
                            color = localContentColor,
                        )
                    }
                }

                else -> {
                    { /* nothing - caller should ensure one of them provided */ }
                }
            }

        val subtitleContent: (@Composable (() -> Unit))? =
            when {
                subtitle != null -> {
                    subtitle
                }

                subtitleText != null -> {
                    {
                        Text(
                            text = subtitleText,
                            maxLines = subtitleMaxLines,
                            style = subtitleStyle,
                        )
                    }
                }

                else -> {
                    null
                }
            }

        // Main item surface with click handling and min height
        Column(
            modifier =
                modifier
                    .fillMaxWidth()
                    .defaultMinSize(minHeight = minHeight)
                    .then(
                        if (onClick != null || onLongClick != null) {
                            Modifier.combinedClickable(
                                enabled = enabled,
                                onClick = { onClick?.invoke() },
                                onLongClick = onLongClick?.let { { it() } },
                                role = Role.Button,
                                interactionSource = interactionSource,
                            )
                        } else {
                            Modifier
                        },
                    )
                    .padding(padding),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Center,
        ) {
            // Content layout: leading | (title + optional subtitle) | trailing
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth(),
            ) {
                if (leadingContent != null) {
                    leadingContent()
                    Spacer(modifier = Modifier.width(leadingGapWidth))
                }

                // Title/subtitle column — Expanded
                Column(
                    modifier =
                        Modifier
                            .weight(1f)
                            .wrapContentHeight(align = Alignment.CenterVertically),
                ) {
                    titleContent()
                    if (subtitleContent != null) {
                        Spacer(modifier = Modifier.height(subtitleGapHeight))
                        subtitleContent()
                    }
                }

                if (trailingContent != null) {
                    Spacer(modifier = Modifier.width(trailingGapWidth))
                    trailingContent()
                }
            }
        }
    }
}

@Preview(showBackground = true, name = "ListItem - Default")
@Composable
fun PreviewSBBListItem_Default() {
    SBBTheme {
        SBBListItem.Boxed.Default(
            title = "Item title",
            subtitle = "Subtext example",
            leading = SBBIcons.Medium.AirplaneMedium,
        )
    }
}

@Preview(showBackground = true, name = "ListItem - Pressed")
@Composable
fun PreviewSBBListItem_Pressed() {
    SBBTheme {
        SBBListItem.Boxed.Default(
            title = "Pressed item",
            leading = SBBIcons.Medium.AlarmClockMedium,
        )
    }
}

@Preview(showBackground = true, name = "ListItem - Disabled")
@Composable
fun PreviewSBBListItem_Disabled() {
    SBBTheme {
        SBBListItem.Boxed.Disabled(
            title = "Disabled item",
            subtitle = "Disabled subtext",
            leading = SBBIcons.Medium.ArchiveBoxMedium,
        )
    }
}

@Preview(showBackground = true, name = "ListItem - Boxed Variant")
@Composable
fun PreviewSBBListItem_Boxed() {
    SBBTheme {
        SBBListItem.Boxed.Default(
            title = "Boxed item",
            subtitle = "Boxed subtext",
            leading = SBBIcons.Medium.AirplaneMedium,
        )
    }
}

@Preview(showBackground = true, name = "ListItem - Trailing Icon")
@Composable
fun PreviewSBBListItem_IconRight() {
    SBBTheme {
        SBBListItem.Boxed.Default(
            title = "Icon right",
            subtitle = "Icon right",
            trailing = SBBIcons.Medium.ArrowRightMedium,
        )
    }
}

@Preview(showBackground = true, name = "ListItem - Title")
@Composable
fun PreviewSBBListItem_Title() {
    SBBTheme {
        SBBListItem.Boxed.Default(
            title = "Title",
        )
    }
}

@Preview(showBackground = true, name = "ListItem - Link")
@Composable
fun PreviewSBBListItem_Link() {
    SBBTheme {
        SBBListItem.Boxed.Link(
            title = "Link",
            subtitle = "With subtitle and icon",
            leading = SBBIcons.Small.FaceKingSmall,
            onClick = {},
        )
    }
}
