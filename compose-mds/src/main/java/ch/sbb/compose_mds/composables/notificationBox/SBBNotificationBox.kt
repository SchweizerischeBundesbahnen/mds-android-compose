package ch.sbb.compose_mds.composables.notificationBox

import SBBTheme
import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.SBBIcons
import ch.sbb.compose_mds.sbbicons.Small
import ch.sbb.compose_mds.sbbicons.small.ChevronSmallRightSmall
import ch.sbb.compose_mds.sbbicons.small.CrossSmall
import ch.sbb.compose_mds.theme.SBBConst
import ch.sbb.compose_mds.theme.SBBSpacing
import ch.sbb.compose_mds.theme.defaultPadding

typealias OnCloseCallback = () -> Unit

object SBBNotificationBox {
    @Composable
    fun Alert(
        modifier: Modifier = Modifier,
        title: String? = null,
        text: String,
        isCloseable: Boolean = false,
        onClose: OnCloseCallback? = null,
        interactionIcon: ImageVector? = SBBIcons.Small.ChevronSmallRightSmall,
    ) {
        SBBNotificationBox(
            modifier = modifier,
            style = SBBTheme.notificationBox.alert,
            title = title,
            text = text,
            isCloseable = isCloseable,
            onClose = onClose,
            interactionIcon = interactionIcon
        )
    }

    @Composable
    fun Warning(
        modifier: Modifier = Modifier,
        title: String? = null,
        text: String,
        isCloseable: Boolean = false,
        onClose: OnCloseCallback? = null,
        interactionIcon: ImageVector? = SBBIcons.Small.ChevronSmallRightSmall,
    ) {
        SBBNotificationBox(
            modifier = modifier,
            style = SBBTheme.notificationBox.warning,
            title = title,
            text = text,
            isCloseable = isCloseable,
            onClose = onClose,
            interactionIcon = interactionIcon
        )
    }

    @Composable
    fun Success(
        modifier: Modifier = Modifier,
        title: String? = null,
        text: String,
        isCloseable: Boolean = false,
        onClose: OnCloseCallback? = null,
        interactionIcon: ImageVector? = SBBIcons.Small.ChevronSmallRightSmall,
    ) {
        SBBNotificationBox(
            modifier = modifier,
            style = SBBTheme.notificationBox.success,
            title = title,
            text = text,
            isCloseable = isCloseable,
            onClose = onClose,
            interactionIcon = interactionIcon
        )
    }

    @Composable
    fun Information(
        modifier: Modifier = Modifier,
        title: String? = null,
        text: String,
        isCloseable: Boolean = false,
        onClose: OnCloseCallback? = null,
        interactionIcon: ImageVector? = SBBIcons.Small.ChevronSmallRightSmall,
    ) {
        SBBNotificationBox(
            modifier = modifier,
            style = SBBTheme.notificationBox.information,
            title = title,
            text = text,
            isCloseable = isCloseable,
            onClose = onClose,
            interactionIcon = interactionIcon
        )
    }
}

@Composable
private fun SBBNotificationBox(
    modifier: Modifier = Modifier,
    style: SBBNotificationBoxStyle,
    title: String?,
    text: String,
    isCloseable: Boolean,
    onClose: OnCloseCallback?,
    interactionIcon: ImageVector? = null,
) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(16.dp))
            .background(color = style.backgroundColor)
            .padding(start = SBBSpacing.XSmall)
            .padding(all = 1.dp)
            .fillMaxWidth()
    ) {
        Column(
            modifier = Modifier
                .clip(
                    RoundedCornerShape(
                        topStart = 8.dp,
                        bottomStart = 8.dp,
                        topEnd = 15.dp,
                        bottomEnd = 15.dp,
                    )
                )
                .background(MaterialTheme.colorScheme.surface.copy(alpha = .95f))
                .defaultPadding(),
        ) {
            if (title != null) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    TypeIcon(style)
                    TitleBody(title)
                    CloseButton(isCloseable, onClose)
                }
                Row {
                    TextBody(text)
                    InteractionIcon(Modifier.align(Alignment.CenterVertically), interactionIcon)
                }
            } else {
                Row(Modifier.height(IntrinsicSize.Max)) {
                    TypeIcon(style)
                    TextBody(text)
                    Column(Modifier.fillMaxHeight()) {
                        CloseButton(isCloseable, onClose)
                        InteractionIcon(Modifier.weight(1f), interactionIcon)
                    }
                }
            }
        }
    }
}

@Composable
private fun TypeIcon(style: SBBNotificationBoxStyle) {
    Icon(
        modifier = Modifier.padding(start = 6.dp),
        imageVector = style.icon,
        contentDescription = null,
        tint = style.iconColor,
    )
}

@Composable
private fun CloseButton(isCloseable: Boolean, onClose: OnCloseCallback?) {
    if (isCloseable) Icon(
        modifier = Modifier
            .padding(end = 10.dp)
            .clickable { onClose?.invoke() },
        imageVector = SBBIcons.Small.CrossSmall,
        contentDescription = null,
    )
}

@Composable
private fun RowScope.TitleBody(title: String) {
    Text(
        modifier = Modifier
            .weight(1.0f)
            .padding(start = SBBSpacing.XSmall),
        text = title,
        style = MaterialTheme.typography.titleMedium,
    )
}

@Composable
private fun RowScope.TextBody(text: String) {
    Text(
        modifier = Modifier
            .weight(1.0f)
            .padding(horizontal = SBBConst.DEFAULT_HORIZONTAL_PADDING)
            .padding(top = 4.dp),
        text = text,
        maxLines = 3,
        overflow = TextOverflow.Ellipsis,
        style = MaterialTheme.typography.bodySmall,
    )
}

@Composable
private fun InteractionIcon(modifier: Modifier, vector: ImageVector?) {
    if (vector == null) return
    Icon(
        modifier = modifier.padding(end = 6.dp),
        imageVector = vector,
        contentDescription = null,
    )
}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun Preview_SBBNotificationBox() {
    SBBTheme {
        Surface {
            SBBNotificationBox.Alert(text = "test")
        }
    }
}
