package ch.sbb.compose_mds.composables.notificationBox

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.style.ExperimentalFoundationStyleApi
import androidx.compose.foundation.style.Style
import androidx.compose.foundation.style.styleable
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.PreviewLightDark
import ch.sbb.compose_mds.sbbicons.SBBIcons
import ch.sbb.compose_mds.sbbicons.Small
import ch.sbb.compose_mds.sbbicons.small.ChevronSmallRightSmall
import ch.sbb.compose_mds.theme.SBBTheme

typealias OnClose = () -> Unit
typealias OnClick = () -> Unit

/***
 * Implementation of the SBB Notification-Box.
 *
 * For a complete definition of the component, please visit [digital.sbb.ch](https://digital.sbb.ch/de/design-system/mobile/components/notification-box/)
 */
@ExperimentalFoundationStyleApi
object SBBNotificationBox {
    /**
     * Alert variant of [SBBNotificationBox].
     *
     * [style] is applied after the default alert styles to make every standard Styles property
     * customizable for this instance.
     */
    @Composable
    fun Alert(
        text: String,
        modifier: Modifier = Modifier,
        title: String? = null,
        hasIcon: Boolean = true,
        isCloseable: Boolean = false,
        onClose: OnClose? = null,
        onClick: OnClick? = null,
        maxLines: Int = 3,
        interactionIcon: ImageVector? = SBBIcons.Small.ChevronSmallRightSmall,
        style: Style = Style,
    ) {
        SBBNotificationBoxInternal(
            modifier = modifier,
            tokens = SBBTheme.notificationBox.alert,
            style = style,
            title = title,
            text = text,
            hasIcon = hasIcon,
            isCloseable = isCloseable,
            onClose = onClose,
            onClick = onClick,
            maxLines = maxLines,
            interactionIcon = interactionIcon,
        )
    }

    /** Warning variant of [SBBNotificationBox]. */
    @Composable
    fun Warning(
        text: String,
        modifier: Modifier = Modifier,
        title: String? = null,
        hasIcon: Boolean = true,
        isCloseable: Boolean = false,
        onClose: OnClose? = null,
        onClick: OnClick? = null,
        maxLines: Int = 3,
        interactionIcon: ImageVector? = SBBIcons.Small.ChevronSmallRightSmall,
        style: Style = Style,
    ) {
        SBBNotificationBoxInternal(
            modifier = modifier,
            tokens = SBBTheme.notificationBox.warning,
            style = style,
            title = title,
            text = text,
            hasIcon = hasIcon,
            isCloseable = isCloseable,
            onClose = onClose,
            onClick = onClick,
            maxLines = maxLines,
            interactionIcon = interactionIcon,
        )
    }

    /** Success variant of [SBBNotificationBox]. */
    @Composable
    fun Success(
        text: String,
        modifier: Modifier = Modifier,
        title: String? = null,
        hasIcon: Boolean = true,
        isCloseable: Boolean = false,
        onClose: OnClose? = null,
        onClick: OnClick? = null,
        maxLines: Int = 3,
        interactionIcon: ImageVector? = SBBIcons.Small.ChevronSmallRightSmall,
        style: Style = Style,
    ) {
        SBBNotificationBoxInternal(
            modifier = modifier,
            tokens = SBBTheme.notificationBox.success,
            style = style,
            title = title,
            text = text,
            hasIcon = hasIcon,
            isCloseable = isCloseable,
            onClose = onClose,
            onClick = onClick,
            maxLines = maxLines,
            interactionIcon = interactionIcon,
        )
    }

    /** Information variant of [SBBNotificationBox]. */
    @Composable
    fun Information(
        text: String,
        modifier: Modifier = Modifier,
        title: String? = null,
        hasIcon: Boolean = true,
        isCloseable: Boolean = false,
        onClose: OnClose? = null,
        onClick: OnClick? = null,
        maxLines: Int = 3,
        interactionIcon: ImageVector? = SBBIcons.Small.ChevronSmallRightSmall,
        style: Style = Style,
    ) {
        SBBNotificationBoxInternal(
            modifier = modifier,
            tokens = SBBTheme.notificationBox.information,
            style = style,
            title = title,
            text = text,
            hasIcon = hasIcon,
            isCloseable = isCloseable,
            onClose = onClose,
            onClick = onClick,
            maxLines = maxLines,
            interactionIcon = interactionIcon,
        )
    }
}

@Composable
private fun SBBNotificationBoxInternal(
    tokens: SBBNotificationBoxStyle,
    style: Style,
    title: String?,
    text: String,
    onClose: OnClose?,
    modifier: Modifier = Modifier,
    hasIcon: Boolean = true,
    isCloseable: Boolean = true,
    onClick: OnClick? = null,
    maxLines: Int = 3,
    interactionIcon: ImageVector? = null,
) {
    Box(
        modifier =
            modifier
                .clickable(enabled = onClick != null, onClick = onClick ?: {})
                .styleable(null, tokens.containerStyle, style),
    ) {
        Column(
            modifier = Modifier.styleable(null, tokens.contentStyle, style),
            verticalArrangement = Arrangement.spacedBy(tokens.layout.contentVerticalSpacing),
        ) {
            if (title != null) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(tokens.layout.rowHorizontalSpacing),
                ) {
                    if (hasIcon) NotificationIcon(tokens, style)
                    TitleBody(
                        title = title,
                        tokens = tokens,
                        style = style,
                    )
                    if (isCloseable) CloseButton(tokens, style, onClose)
                }
                Row {
                    TextBody(
                        text = text,
                        maxLines = maxLines,
                        tokens = tokens,
                        style = style,
                    )
                    if (interactionIcon != null) {
                        InteractionIcon(
                            modifier = Modifier.align(Alignment.CenterVertically),
                            vector = interactionIcon,
                            tokens = tokens,
                            style = style,
                        )
                    }
                }
            } else {
                Row(
                    Modifier.height(IntrinsicSize.Max),
                    horizontalArrangement = Arrangement.spacedBy(tokens.layout.rowHorizontalSpacing),
                ) {
                    if (hasIcon) NotificationIcon(tokens, style)
                    TextBody(
                        text = text,
                        maxLines = maxLines,
                        tokens = tokens,
                        style = style,
                    )
                    Column(
                        Modifier.fillMaxHeight(),
                        verticalArrangement = Arrangement.SpaceBetween,
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        if (isCloseable) CloseButton(tokens, style, onClose)
                        Spacer(Modifier)
                        if (interactionIcon != null) {
                            InteractionIcon(
                                modifier = Modifier.weight(1f),
                                vector = interactionIcon,
                                tokens = tokens,
                                style = style,
                            )
                        }
                        Spacer(Modifier)
                    }
                }
            }
        }
    }
}

@Composable
private fun NotificationIcon(
    tokens: SBBNotificationBoxStyle,
    style: Style,
) {
    Icon(
        modifier = Modifier.styleable(null, tokens.iconStyle, style),
        imageVector = tokens.icon,
        contentDescription = null,
    )
}

@Composable
private fun CloseButton(
    tokens: SBBNotificationBoxStyle,
    style: Style,
    onClose: OnClose?,
) {
    Icon(
        modifier =
            Modifier
                .clickable { onClose?.invoke() }
                .styleable(null, tokens.closeStyle, style),
        imageVector = tokens.closeIcon,
        contentDescription = null,
    )
}

@Composable
private fun RowScope.TitleBody(
    title: String,
    tokens: SBBNotificationBoxStyle,
    style: Style,
) {
    Text(
        modifier = Modifier.weight(1.0f).styleable(null, tokens.titleStyle, style),
        text = title,
    )
}

@Composable
private fun RowScope.TextBody(
    text: String,
    maxLines: Int,
    tokens: SBBNotificationBoxStyle,
    style: Style,
) {
    Text(
        modifier = Modifier.weight(1.0f).styleable(null, tokens.bodyStyle, style),
        text = text,
        maxLines = maxLines,
        overflow = TextOverflow.Ellipsis,
    )
}

@Composable
private fun InteractionIcon(
    vector: ImageVector,
    tokens: SBBNotificationBoxStyle,
    style: Style,
    modifier: Modifier = Modifier,
) {
    Icon(
        modifier = modifier.styleable(null, tokens.interactionStyle, style),
        imageVector = vector,
        contentDescription = null,
    )
}

@PreviewLightDark
@Composable
private fun Preview_SBBNotificationBox() {
    SBBTheme {
        Surface {
            SBBNotificationBox.Alert(
                title = "Title",
                text = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore.",
                isCloseable = true,
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun Preview_SBBNotificationBox_OnlyText() {
    SBBTheme {
        Surface {
            SBBNotificationBox.Warning(
                text = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore.",
                isCloseable = true,
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun Preview_SBBNotificationBox_NoIcons() {
    SBBTheme {
        Surface {
            SBBNotificationBox.Information(
                title = "Title",
                text = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore.",
                isCloseable = false,
                hasIcon = false,
                interactionIcon = null,
            )
        }
    }
}
