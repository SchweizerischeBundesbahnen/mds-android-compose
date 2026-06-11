package ch.sbb.compose_mds.composables.listItem

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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import ch.sbb.compose_mds.composables.container.SBBContentBox
import ch.sbb.compose_mds.composables.listItem.SBBListItem.Custom
import ch.sbb.compose_mds.composables.listItem.SBBListItem.Default
import ch.sbb.compose_mds.composables.listItem.SBBListItem.Disabled
import ch.sbb.compose_mds.composables.listItem.SBBListItem.Link
import ch.sbb.compose_mds.sbbicons.Medium
import ch.sbb.compose_mds.sbbicons.SBBIcons
import ch.sbb.compose_mds.sbbicons.Small
import ch.sbb.compose_mds.sbbicons.medium.AirplaneMedium
import ch.sbb.compose_mds.sbbicons.medium.AlarmClockMedium
import ch.sbb.compose_mds.sbbicons.medium.ArchiveBoxMedium
import ch.sbb.compose_mds.sbbicons.medium.ArrowRightMedium
import ch.sbb.compose_mds.sbbicons.small.ChevronSmallRightSmall
import ch.sbb.compose_mds.sbbicons.small.FaceKingSmall
import ch.sbb.compose_mds.theme.SBBTheme

/**
 * Implementation of the SBB list-item.
 *
 * Available are the variants [Default], [Disabled], [Link] and [Custom].
 * they can be used as a List, wrapped in a [SBBList.Wrap] or as standalone [Boxed] versions.
 *
 * For full specification, please visit [digital.sbb.ch](https://digital.sbb.ch/en/design-system/mobile/components/list-item/).
 */
object SBBListItem {
    object Boxed {
        /**
         * Default boxed list item.
         *
         * @param modifier Modifier to apply to the item container.
         * @param leading Optional leading icon vector.
         * @param title Main title text shown for the item.
         * @param subtitle Optional subtitle text shown below the title.
         * @param trailing Optional trailing icon vector.
         * @param onClick Optional click callback - if provided the item is clickable.
         * @param enabled Whether the item is enabled (affects visual states).
         */
        @Composable
        fun Default(
            title: String,
            modifier: Modifier = Modifier,
            leading: ImageVector? = null,
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

        /**
         * Disabled variant of the boxed list item.
         *
         * @param modifier Modifier to apply to the item container.
         * @param leading Optional leading icon vector.
         * @param title Main title text shown for the item.
         * @param subtitle Optional subtitle text shown below the title.
         * @param trailing Optional trailing icon vector.
         */
        @Composable
        fun Disabled(
            title: String,
            modifier: Modifier = Modifier,
            leading: ImageVector? = null,
            subtitle: String? = null,
            trailing: ImageVector? = null,
        ) {
            Default(
                modifier = modifier,
                leading = leading,
                title = title,
                subtitle = subtitle,
                trailing = trailing,
                enabled = false,
            )
        }

        /**
         * Link variant - shows a trailing chevron by default and requires an onClick handler.
         *
         * @param modifier Modifier to apply to the item container.
         * @param title Main title text.
         * @param subtitle Optional subtitle text.
         * @param leading Optional leading icon vector.
         * @param onClick Click callback for the link.
         */
        @Composable
        fun Link(
            title: String,
            onClick: (() -> Unit),
            modifier: Modifier = Modifier,
            subtitle: String? = null,
            leading: ImageVector? = null,
        ) {
            Default(
                modifier = modifier,
                title = title,
                subtitle = subtitle,
                leading = leading,
                onClick = onClick,
                trailing = SBBIcons.Small.ChevronSmallRightSmall,
            )
        }

        /**
         * Fully custom boxed list item.
         *
         * Use this when you need to supply composable content for leading/title/subtitle/trailing
         * or when you want to tune layout/typography/color tokens for this specific item.
         *
         * @param modifier Modifier to apply to the item container.
         * @param interactionSource Optional interaction source for styling and ripple handling.
         * @param leading Optional composable for the leading slot.
         * @param leadingIcon Optional ImageVector fallback for the leading slot.
         * @param title Optional composable for the title slot.
         * @param titleText Optional title text fallback.
         * @param subtitle Optional composable for the subtitle slot.
         * @param subtitleText Optional subtitle text fallback.
         * @param trailing Optional composable for the trailing slot.
         * @param trailingIcon Optional ImageVector fallback for the trailing slot.
         * @param onClick Optional click callback - providing makes the item clickable.
         * @param onLongClick Optional long-click callback.
         * @param enabled Whether the item is enabled (affects visual states and clickability).
         * @param titleMaxLines Maximum number of lines for the title.
         * @param subtitleMaxLines Maximum number of lines for the subtitle.
         * @param style Style tokens for the list item.
         */
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
            titleMaxLines: Int = 1,
            subtitleMaxLines: Int = 1,
            style: SBBListItemStyle = SBBTheme.listItem,
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
                    titleMaxLines = titleMaxLines,
                    subtitleMaxLines = subtitleMaxLines,
                    style = style,
                )
            }
        }
    }

    /**
     * Default list item.
     *
     * A convenience wrapper that calls [Custom] with text parameters. Use inside lists or standalone.
     *
     * @param modifier Modifier to apply to the item container.
     * @param leading Optional leading icon vector.
     * @param title Main title text shown for the item.
     * @param subtitle Optional subtitle text shown below the title.
     * @param trailing Optional trailing icon vector.
     * @param onClick Optional click callback - if provided the item is clickable.
     * @param enabled Whether the item is enabled (affects visual states).
     */
    @Composable
    fun Default(
        title: String,
        modifier: Modifier = Modifier,
        leading: ImageVector? = null,
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

    /**
     * Disabled list item variant.
     *
     * Same as [Default] but rendered in a disabled state.
     *
     * @param modifier Modifier to apply to the item container.
     * @param leading Optional leading icon vector.
     * @param title Main title text shown for the item.
     * @param subtitle Optional subtitle text shown below the title.
     * @param trailing Optional trailing icon vector.
     */
    @Composable
    fun Disabled(
        title: String,
        modifier: Modifier = Modifier,
        leading: ImageVector? = null,
        subtitle: String? = null,
        trailing: ImageVector? = null,
    ) {
        Default(
            modifier = modifier,
            leading = leading,
            title = title,
            subtitle = subtitle,
            trailing = trailing,
            enabled = false,
        )
    }

    /**
     * Link list item convenience wrapper.
     *
     * Displays a trailing chevron and requires an [onClick] handler.
     *
     * @param modifier Modifier to apply to the item container.
     * @param title Main title text.
     * @param subtitle Optional subtitle text.
     * @param leading Optional leading icon vector.
     * @param onClick Click callback for the link.
     */
    @Composable
    fun Link(
        title: String,
        onClick: (() -> Unit),
        modifier: Modifier = Modifier,
        subtitle: String? = null,
        leading: ImageVector? = null,
    ) {
        Default(
            modifier = modifier,
            title = title,
            subtitle = subtitle,
            leading = leading,
            onClick = onClick,
            trailing = SBBIcons.Small.ChevronSmallRightSmall,
        )
    }

    /**
     * Fully custom list item.
     *
     * Use when you need to supply custom composables for slots or tune layout/typography/colors
     * via token parameters.
     *
     * @param modifier Modifier to apply to the item container.
     * @param interactionSource Optional interaction source for styling and ripple handling.
     * @param leading Optional composable for the leading slot.
     * @param leadingIcon Optional ImageVector fallback for the leading slot.
     * @param title Optional composable for the title slot.
     * @param titleText Optional title text fallback.
     * @param subtitle Optional composable for the subtitle slot.
     * @param subtitleText Optional subtitle text fallback.
     * @param trailing Optional composable for the trailing slot.
     * @param trailingIcon Optional ImageVector fallback for the trailing slot.
     * @param onClick Optional click callback - providing makes the item clickable.
     * @param onLongClick Optional long-click callback.
     * @param enabled Whether the item is enabled (affects visual states and clickability).
     * @param titleMaxLines Maximum number of lines for the title.
     * @param subtitleMaxLines Maximum number of lines for the subtitle.
     * @param style Style tokens for the list item.
     */
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
        titleMaxLines: Int = 1,
        subtitleMaxLines: Int = 1,
        style: SBBListItemStyle = SBBTheme.listItem,
    ) {
        val localContentColor by animateColorAsState(
            if (enabled) style.colors.content else style.colors.disabledContent,
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
                            style = style.typography.title,
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
                            style = style.typography.subtitle,
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
                    .defaultMinSize(minHeight = style.layout.minHeight)
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
                    ).padding(style.layout.padding),
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
                    Spacer(modifier = Modifier.width(style.layout.gapBetweenIconAndText))
                }

                // Title/subtitle column - Expanded
                Column(
                    modifier =
                        Modifier
                            .weight(1f)
                            .wrapContentHeight(align = Alignment.CenterVertically),
                ) {
                    titleContent()
                    if (subtitleContent != null) {
                        Spacer(modifier = Modifier.height(style.layout.gapBetweenTitleAndSubtitle))
                        subtitleContent()
                    }
                }

                if (trailingContent != null) {
                    Spacer(modifier = Modifier.width(style.layout.gapBetweenIconAndText))
                    trailingContent()
                }
            }
        }
    }
}

@Preview(showBackground = true, name = "ListItem - Default")
@Composable
private fun PreviewSBBListItem_Default() {
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
private fun PreviewSBBListItem_Pressed() {
    SBBTheme {
        SBBListItem.Boxed.Default(
            title = "Pressed item",
            leading = SBBIcons.Medium.AlarmClockMedium,
        )
    }
}

@Preview(showBackground = true, name = "ListItem - Disabled")
@Composable
private fun PreviewSBBListItem_Disabled() {
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
private fun PreviewSBBListItem_Boxed() {
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
private fun PreviewSBBListItem_IconRight() {
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
private fun PreviewSBBListItem_Title() {
    SBBTheme {
        SBBListItem.Boxed.Default(
            title = "Title",
        )
    }
}

@Preview(showBackground = true, name = "ListItem - Link")
@Composable
private fun PreviewSBBListItem_Link() {
    SBBTheme {
        SBBListItem.Boxed.Link(
            title = "Link",
            subtitle = "With subtitle and icon",
            leading = SBBIcons.Small.FaceKingSmall,
            onClick = {},
        )
    }
}
