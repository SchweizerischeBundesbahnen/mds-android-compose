package ch.sbb.compose_mds.composables.notificationBox

import SBBTheme
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.SBBIcons
import ch.sbb.compose_mds.sbbicons.Small
import ch.sbb.compose_mds.sbbicons.small.ChevronSmallRightSmall
import ch.sbb.compose_mds.sbbicons.small.CrossSmall
import ch.sbb.compose_mds.theme.SBBSpacing

typealias OnClose = () -> Unit
typealias OnClick = () -> Unit

/***
 * Implementation of the SBB Notification-Box.
 *
 * For a complete definition of the component, please visit [digital.sbb.ch](https://digital.sbb.ch/de/design-system/mobile/components/notification-box/)
 */
object SBBNotificationBox {

    /**
     * Alert variant of [SBBNotificationBox]
     * @see [SBBNotificationBoxInternal]
     */
    @Composable
    fun Alert(
        modifier: Modifier = Modifier,
        title: String? = null,
        text: String,
        hasIcon: Boolean = true,
        isCloseable: Boolean = false,
        onClose: OnClose? = null,
        onClick: OnClick? = null,
        maxLines: Int = 3,
        interactionIcon: ImageVector? = SBBIcons.Small.ChevronSmallRightSmall,
    ) {
        SBBNotificationBoxInternal(
            modifier = modifier,
            style = SBBTheme.notificationBox.alert,
            title = title,
            text = text,
            hasIcon = hasIcon,
            isCloseable = isCloseable,
            onClose = onClose,
            onClick = onClick,
            maxLines = maxLines,
            interactionIcon = interactionIcon
        )
    }

    /**
     * Warning variant of [SBBNotificationBox]
     * @see [SBBNotificationBoxInternal]
     */
    @Composable
    fun Warning(
        modifier: Modifier = Modifier,
        title: String? = null,
        text: String,
        hasIcon: Boolean = true,
        isCloseable: Boolean = false,
        onClose: OnClose? = null,
        onClick: OnClick? = null,
        maxLines: Int = 3,
        interactionIcon: ImageVector? = SBBIcons.Small.ChevronSmallRightSmall,
    ) {
        SBBNotificationBoxInternal(
            modifier = modifier,
            style = SBBTheme.notificationBox.warning,
            title = title,
            text = text,
            hasIcon = hasIcon,
            isCloseable = isCloseable,
            onClose = onClose,
            onClick = onClick,
            maxLines = maxLines,
            interactionIcon = interactionIcon
        )
    }

    /**
     * Success variant of [SBBNotificationBox]
     * @see [SBBNotificationBoxInternal]
     */
    @Composable
    fun Success(
        modifier: Modifier = Modifier,
        title: String? = null,
        text: String,
        hasIcon: Boolean = true,
        isCloseable: Boolean = false,
        onClose: OnClose? = null,
        onClick: OnClick? = null,
        maxLines: Int = 3,
        interactionIcon: ImageVector? = SBBIcons.Small.ChevronSmallRightSmall,
    ) {
        SBBNotificationBoxInternal(
            modifier = modifier,
            style = SBBTheme.notificationBox.success,
            title = title,
            text = text,
            hasIcon = hasIcon,
            isCloseable = isCloseable,
            onClose = onClose,
            onClick = onClick,
            maxLines = maxLines,
            interactionIcon = interactionIcon
        )
    }

    /**
     * Information variant of [SBBNotificationBox]
     * @see [SBBNotificationBoxInternal]
     */
    @Composable
    fun Information(
        modifier: Modifier = Modifier,
        title: String? = null,
        text: String,
        hasIcon: Boolean = true,
        isCloseable: Boolean = false,
        onClose: OnClose? = null,
        onClick: OnClick? = null,
        maxLines: Int = 3,
        interactionIcon: ImageVector? = SBBIcons.Small.ChevronSmallRightSmall,
    ) {
        SBBNotificationBoxInternal(
            modifier = modifier,
            style = SBBTheme.notificationBox.information,
            title = title,
            text = text,
            hasIcon = hasIcon,
            isCloseable = isCloseable,
            onClose = onClose,
            onClick = onClick,
            maxLines = maxLines,
            interactionIcon = interactionIcon
        )
    }
}

/**
 * Base implementation of the SBBNotificationBox
 *
 * @param modifier Compose Modifier applied to the outer Box.
 * @param style Visual style data (colors, icon, etc.) used to render the notification.
 * @param title Optional title text. If null the layout adapts to a title-less appearance.
 * @param text Main message body text displayed in the notification.
 * @param hasIcon If true an icon defined by [style] is shown.
 * @param isCloseable If true a close button is displayed and can invoke [onClose].
 * @param onClose Optional callback invoked when the close button is pressed.
 * @param onClick Optional click callback for the whole notification.
 * @param maxLines Maximum number of lines for the message text before truncation.
 * @param interactionIcon Optional trailing interaction icon (e.g. arrow) to show on the notification.
 */
@Composable
private fun SBBNotificationBoxInternal(
    modifier: Modifier = Modifier,
    style: SBBNotificationBoxStyle,
    title: String?,
    text: String,
    hasIcon: Boolean = true,
    isCloseable: Boolean = true,
    onClose: OnClose?,
    onClick: OnClick? = null,
    maxLines: Int = 3,
    interactionIcon: ImageVector? = null,
) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(SBBSpacing.Medium))
            .clickable(enabled = onClick != null, onClick = onClick ?: {})
            .background(color = style.borderColor)
            .padding(start = SBBSpacing.XSmall)
            .padding(all = 1.dp)
            .fillMaxWidth()
    ) {
        Column(
            modifier = Modifier
                .clip(
                    RoundedCornerShape(
                        topStart = SBBSpacing.XSmall,
                        bottomStart = SBBSpacing.XSmall,
                        topEnd = 15.dp,
                        bottomEnd = 15.dp,
                    )
                )
                .background(style.backgroundColor)
                .padding(SBBSpacing.Medium),
            verticalArrangement = Arrangement.spacedBy(SBBSpacing.XXSmall)
        ) {
            if (title != null) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(SBBSpacing.XSmall)
                ) {
                    if (hasIcon) NotificationIcon(style)
                    TitleBody(title)
                    if (isCloseable) CloseButton(onClose)
                }
                Row {
                    TextBody(text, maxLines)
                    if (interactionIcon != null) InteractionIcon(
                        Modifier.align(Alignment.CenterVertically),
                        interactionIcon
                    )
                }
            } else {
                Row(
                    Modifier.height(IntrinsicSize.Max),
                    horizontalArrangement = Arrangement.spacedBy(SBBSpacing.XSmall)
                ) {
                    if (hasIcon) NotificationIcon(style)
                    TextBody(text, maxLines)
                    Column(
                        Modifier.fillMaxHeight(),
                        verticalArrangement = Arrangement.SpaceBetween,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        if (isCloseable) CloseButton(onClose)
                        Spacer(Modifier)
                        if (interactionIcon != null) InteractionIcon(
                            Modifier.weight(1f),
                            interactionIcon
                        )
                        Spacer(Modifier)
                    }
                }
            }
        }
    }
}

@Composable
private fun NotificationIcon(style: SBBNotificationBoxStyle) {
    Icon(
        imageVector = style.icon,
        contentDescription = null,
        tint = style.iconColor,
    )
}

@Composable
private fun CloseButton(onClose: OnClose?) {
    Icon(
        modifier = Modifier.clickable { onClose?.invoke() },
        imageVector = SBBIcons.Small.CrossSmall,
        contentDescription = null,
    )
}

@Composable
private fun RowScope.TitleBody(title: String) {
    Text(
        modifier = Modifier.weight(1.0f),
        text = title,
        style = SBBTheme.sbbTypography.mediumBold,
    )
}

@Composable
private fun RowScope.TextBody(text: String, maxLines: Int) {
    Text(
        modifier = Modifier.weight(1.0f),
        text = text,
        maxLines = maxLines,
        overflow = TextOverflow.Ellipsis,
        style = SBBTheme.sbbTypography.smallLight,
    )
}

@Composable
private fun InteractionIcon(modifier: Modifier, vector: ImageVector) {
    Icon(
        modifier = modifier,
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
