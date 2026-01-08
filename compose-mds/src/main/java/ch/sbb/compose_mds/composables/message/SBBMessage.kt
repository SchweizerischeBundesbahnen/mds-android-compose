package ch.sbb.compose_mds.composables.message

import SBBTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import ch.sbb.compose_mds.R
import ch.sbb.compose_mds.composables.button.SBBTertiaryButton
import ch.sbb.compose_mds.composables.loadingIndicator.SBBLoadingIndicator
import ch.sbb.compose_mds.sbbicons.Medium
import ch.sbb.compose_mds.sbbicons.SBBIcons
import ch.sbb.compose_mds.sbbicons.medium.ArrowsCircleMedium
import ch.sbb.compose_mds.theme.SBBSpacing

object SBBMessage

enum class SBBMessageIllustration {
    STAFF_MALE, STAFF_FEMALE, DISPLAY;

    fun getResId(isDarkMode: Boolean): Int {
        return when (this) {
            STAFF_FEMALE -> if (isDarkMode) R.drawable.illustration_female_dark else R.drawable.illustration_female
            STAFF_MALE -> if (isDarkMode) R.drawable.illustration_male_dark else R.drawable.illustration_male
            DISPLAY -> if (isDarkMode) R.drawable.illustration_display_dark else R.drawable.illustration_display
        }
    }
}

/***
 * Custom version of SBBMessage with own illustration
 * @see [SBBMessageInternal]
 */
@Composable
fun SBBMessage.Custom(
    modifier: Modifier = Modifier,
    illustration: (@Composable () -> Unit)? = null,
    title: String,
    message: String,
    secondaryMessage: String? = null,
    interactionIcon: ImageVector? = null,
    onInteraction: (() -> Unit)? = null,
) {
    SBBMessageInternal(
        modifier = modifier,
        illustration = illustration,
        title = title,
        message = message,
        secondaryMessage = secondaryMessage,
        interactionIcon = interactionIcon,
        onInteraction = onInteraction
    )
}

/***
 * Default version of SBBMessage. Uses
 * @see [SBBMessageInternal]
 */
@Composable
fun SBBMessage.Default(
    modifier: Modifier = Modifier,
    title: String,
    message: String,
    illustration: SBBMessageIllustration = SBBMessageIllustration.STAFF_MALE,
    interactionIcon: ImageVector? = null,
    onInteraction: (() -> Unit)? = null,
) {
    SBBMessageInternal(
        modifier = modifier,
        illustration = {
            val resourceId = illustration.getResId(isDarkMode = SBBTheme.isDarkMode)
            Image(
                painter = painterResource(id = resourceId),
                contentDescription = "Message illustration"
            )
        },
        title = title,
        message = message,
        interactionIcon = interactionIcon,
        onInteraction = onInteraction
    )
}

/***
 * Error version of SBBMessage
 * @see [SBBMessageInternal]
 */
@Composable
fun SBBMessage.Error(
    modifier: Modifier = Modifier,
    title: String,
    message: String,
    errorCode: String? = null,
    interactionIcon: ImageVector? = null,
    onInteraction: (() -> Unit)? = null,
) {
    SBBMessageInternal(
        modifier = modifier,
        illustration = {
            val resourceId =
                SBBMessageIllustration.DISPLAY.getResId(isDarkMode = SBBTheme.isDarkMode)
            Image(
                painter = painterResource(id = resourceId),
                contentDescription = "Message illustration"
            )
        },
        title = title,
        message = message,
        secondaryMessage = errorCode,
        interactionIcon = interactionIcon,
        onInteraction = onInteraction
    )
}

/***
 * Loading version of SBBMessage
 * @see [SBBMessageInternal]
 */
@Composable
fun SBBMessage.Loading(
    modifier: Modifier = Modifier,
    title: String,
    message: String,
) {
    SBBMessageInternal(
        modifier = modifier,
        illustration = {
            SBBLoadingIndicator.Default()
        },
        title = title,
        message = message,
    )
}

/***
 * Implementation of the SBB Message.
 *
 * @param illustration Illustration of the message
 * @param title The title of the message
 * @param message The body of the message. Used to give a longer explanation of what has happened.
 * @param secondaryMessage Optional text displayed below the [message]. Usually depicts an error code. Example: 'Error-Code: XYZ-9999'
 * @param interactionIcon Allows the customization of the interaction icon displayed at the bottom of the message. Defaults to arrows_circle_small.
 * @param onInteraction Callback for interaction with button at the bottom of the message.
 *
 * For a complete definition of the component, please visit [digital.sbb.ch](https://digital.sbb.ch/de/design-system/mobile/components/message/)
 */
@Composable
private fun SBBMessageInternal(
    modifier: Modifier = Modifier,
    illustration: (@Composable () -> Unit)? = null,
    title: String,
    message: String,
    secondaryMessage: String? = null,
    interactionIcon: ImageVector? = null,
    onInteraction: (() -> Unit)? = null,
) {
    Column(
        modifier = modifier.padding(SBBSpacing.Medium),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        if (illustration != null) {
            illustration()
            Spacer(Modifier.height(SBBSpacing.Large))
        }

        Text(
            title,
            style = SBBTheme.sbbTypography.mediumLight,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )

        Spacer(Modifier.height(SBBSpacing.Medium))
        val secondaryTextColor =
            if (SBBTheme.isDarkMode) SBBTheme.colors.graphite else SBBTheme.colors.granite
        Text(
            message,
            style = SBBTheme.sbbTypography.smallLight,
            color = secondaryTextColor,
            textAlign = TextAlign.Center,
        )

        if (secondaryMessage != null) {
            Spacer(Modifier.height(SBBSpacing.Medium))
            Text(
                secondaryMessage,
                style = SBBTheme.sbbTypography.XSmallLight,
                color = secondaryTextColor
            )
        }
        if (onInteraction != null) {
            Spacer(Modifier.height(SBBSpacing.Large))
            SBBTertiaryButton(
                icon = interactionIcon ?: SBBIcons.Medium.ArrowsCircleMedium,
                onClick = onInteraction
            )
        }
    }
}