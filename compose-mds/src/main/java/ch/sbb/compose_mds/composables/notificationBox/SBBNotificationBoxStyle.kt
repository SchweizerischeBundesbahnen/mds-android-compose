package ch.sbb.compose_mds.composables.notificationBox

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.style.ExperimentalFoundationStyleApi
import androidx.compose.foundation.style.Style
import androidx.compose.foundation.style.contentPadding
import androidx.compose.foundation.style.fillWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.SBBIcons
import ch.sbb.compose_mds.sbbicons.Small
import ch.sbb.compose_mds.sbbicons.small.CircleCrossSmall
import ch.sbb.compose_mds.sbbicons.small.CircleExclamationPointSmall
import ch.sbb.compose_mds.sbbicons.small.CircleInformationSmall
import ch.sbb.compose_mds.sbbicons.small.CircleTickSmall
import ch.sbb.compose_mds.sbbicons.small.CrossSmall
import ch.sbb.compose_mds.theme.SBBSpacing
import ch.sbb.compose_mds.theme.SBBTheme

/** Layout values that are not represented by the Compose Styles properties. */
data class SBBNotificationBoxLayout(
    val contentVerticalSpacing: Dp = SBBSpacing.XXSmall,
    val rowHorizontalSpacing: Dp = SBBSpacing.XSmall,
)

/**
 * Style tokens for one [SBBNotificationBox] variant.
 *
 * The individual [Style] values are intentionally separated by visual region. This lets a
 * consumer override the entire component with one style while still preserving the variant's
 * icon and layout tokens.
 */
@ExperimentalFoundationStyleApi
data class SBBNotificationBoxStyle(
    val icon: ImageVector,
    val containerStyle: Style,
    val contentStyle: Style,
    val iconStyle: Style,
    val titleStyle: Style,
    val bodyStyle: Style,
    val closeStyle: Style,
    val interactionStyle: Style,
    val closeIcon: ImageVector = SBBIcons.Small.CrossSmall,
    val layout: SBBNotificationBoxLayout = SBBNotificationBoxLayout(),
)

@ExperimentalFoundationStyleApi
interface SBBNotificationBoxTokens {
    val alert: SBBNotificationBoxStyle @Composable get
    val warning: SBBNotificationBoxStyle @Composable get
    val success: SBBNotificationBoxStyle @Composable get
    val information: SBBNotificationBoxStyle @Composable get
}

/**
 * CompositionLocal used by [SBBTheme] and [ProvideSBBNotificationBoxStyle].
 *
 * It is public so applications can provide a complete set of variant tokens for a subtree.
 */
@ExperimentalFoundationStyleApi
val LocalSBBNotificationBoxStyle =
    staticCompositionLocalOf<SBBNotificationBoxTokens> { SBBNotificationBoxTheme() }

@ExperimentalFoundationStyleApi
class SBBNotificationBoxTheme : SBBNotificationBoxTokens by defaultSBBNotificationBoxStyle()

/**
 * Provides notification-box variant tokens for a subtree.
 *
 * This is useful when a product needs a complete notification-box theme without replacing the
 * global [SBBTheme]. Individual calls can additionally pass a [Style] override.
 */
@Composable
@ExperimentalFoundationStyleApi
fun ProvideSBBNotificationBoxStyle(
    tokens: SBBNotificationBoxTokens,
    content: @Composable () -> Unit,
) {
    androidx.compose.runtime.CompositionLocalProvider(
        LocalSBBNotificationBoxStyle provides tokens,
        content = content,
    )
}

/** Default SBB notification-box tokens. */
@ExperimentalFoundationStyleApi
fun defaultSBBNotificationBoxStyle(): SBBNotificationBoxTokens =
    object : SBBNotificationBoxTokens {
        override val alert: SBBNotificationBoxStyle
            @Composable get() {
                val dark = SBBTheme.isDarkMode
                val accentColor by
                    animateColorAsState(
                        if (dark) SBBTheme.functionalColors.errorDark else SBBTheme.functionalColors.error,
                    )
                val backgroundColor by
                    animateColorAsState(if (dark) SBBTheme.colors.black else SBBTheme.colors.white)
                return notificationBoxStyle(
                    icon = SBBIcons.Small.CircleCrossSmall,
                    iconColor = accentColor,
                    accentColor = accentColor,
                    backgroundColor = backgroundColor,
                )
            }

        override val warning: SBBNotificationBoxStyle
            @Composable get() {
                val dark = SBBTheme.isDarkMode
                val accentColor by
                    animateColorAsState(
                        if (dark) SBBTheme.functionalColors.warningDark else SBBTheme.functionalColors.warning,
                    )
                val backgroundColor by
                    animateColorAsState(if (dark) SBBTheme.colors.black else SBBTheme.colors.white)
                return notificationBoxStyle(
                    icon = SBBIcons.Small.CircleExclamationPointSmall,
                    iconColor = if (dark) accentColor else SBBTheme.colors.black,
                    accentColor = accentColor,
                    backgroundColor = backgroundColor,
                )
            }

        override val success: SBBNotificationBoxStyle
            @Composable get() {
                val dark = SBBTheme.isDarkMode
                val accentColor by
                    animateColorAsState(
                        if (dark) SBBTheme.functionalColors.successDark else SBBTheme.functionalColors.success,
                    )
                val backgroundColor by
                    animateColorAsState(if (dark) SBBTheme.colors.black else SBBTheme.colors.white)
                return notificationBoxStyle(
                    icon = SBBIcons.Small.CircleTickSmall,
                    iconColor = accentColor,
                    accentColor = accentColor,
                    backgroundColor = backgroundColor,
                )
            }

        override val information: SBBNotificationBoxStyle
            @Composable get() {
                val dark = SBBTheme.isDarkMode
                val backgroundColor by
                    animateColorAsState(if (dark) SBBTheme.colors.black else SBBTheme.colors.white)
                return notificationBoxStyle(
                    icon = SBBIcons.Small.CircleInformationSmall,
                    iconColor = if (dark) SBBTheme.colors.white else SBBTheme.colors.black,
                    accentColor = SBBTheme.colors.smoke,
                    backgroundColor = backgroundColor,
                )
            }
    }

@Composable
private fun notificationBoxStyle(
    icon: ImageVector,
    iconColor: Color,
    accentColor: Color,
    backgroundColor: Color,
): SBBNotificationBoxStyle {
    val dark = SBBTheme.isDarkMode
    val contentColor = if (dark) SBBTheme.colors.white else SBBTheme.colors.black
    val titleTextStyle = SBBTheme.sbbTypography.mediumBold
    val bodyTextStyle = SBBTheme.sbbTypography.smallLight
    val outerShape = RoundedCornerShape(SBBSpacing.Medium)
    val innerShape =
        RoundedCornerShape(
            topStart = SBBSpacing.XSmall,
            bottomStart = SBBSpacing.XSmall,
            topEnd = 15.dp,
            bottomEnd = 15.dp,
        )

    return SBBNotificationBoxStyle(
        icon = icon,
        containerStyle =
            Style {
                background(accentColor)
                shape(outerShape)
                contentPadding(
                    start = SBBSpacing.XSmall + 1.dp,
                    top = 1.dp,
                    end = 1.dp,
                    bottom = 1.dp,
                )
                fillWidth()
            },
        contentStyle =
            Style {
                background(backgroundColor.copy(alpha = 0.95f))
                shape(innerShape)
                contentPadding(SBBSpacing.Medium)
            },
        iconStyle = Style { contentColor(iconColor) },
        titleStyle =
            Style {
                textStyle(titleTextStyle)
                contentColor(contentColor)
            },
        bodyStyle =
            Style {
                textStyle(bodyTextStyle)
                contentColor(contentColor)
            },
        closeStyle = Style { contentColor(contentColor) },
        interactionStyle = Style { contentColor(contentColor) },
    )
}
