package ch.sbb.compose_mds.composables.headerBox

import SBBTheme
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.composables.button.SBBTertiaryButtonSmall
import ch.sbb.compose_mds.composables.container.SBBContentBox
import ch.sbb.compose_mds.composables.headerBox.SBBHeaderBox.Custom
import ch.sbb.compose_mds.composables.headerBox.SBBHeaderBox.Default
import ch.sbb.compose_mds.composables.headerBox.SBBHeaderBox.WithButton
import ch.sbb.compose_mds.theme.PrimitiveColors
import ch.sbb.compose_mds.theme.SBBSpacing

/**
 * SBB HeaderBox component.
 *
 * Provides a red header stripe with a rounded content container and an optional
 * bottom "flap" area for additional metadata or actions.
 *
 * Use [Default] for a simple title/subtext header, [WithButton] to show
 * a trailing action, or [Custom] to supply fully custom content.
 *
 *  For a complete definition of the component, please visit [digital.sbb.ch](https://digital.sbb.ch/de/design-system/mobile/components/header-box/)
 */
object SBBHeaderBox {

    /**
     * Standard HeaderBox with optional [icon], required [title] and optional [subtext].
     *
     * @param icon optional icon shown left to the title
     * @param title main headline
     * @param subtext optional secondary text under the title
     * @param headerBoxFlap optional flap rendered below the box (defaults to none)
     */
    @Composable
    fun Default(
        icon: ImageVector? = null,
        title: String,
        subtext: String? = null,
        headerBoxFlap: SBBHeaderBoxFlap = SBBHeaderBoxFlap.None
    ) {
        Custom(
            headerBoxFlap = headerBoxFlap
        ) {
            DefaultContent(
                icon = icon,
                title = title,
                subtext = subtext,
            )
        }
    }

    /**
     * HeaderBox with a trailing action button.
     *
     * @param icon optional icon shown left to the title
     * @param title main headline
     * @param subtext optional secondary text under the title
     * @param headerBoxFlap optional flap rendered below the box (defaults to none)
     * @param actionIcon optional icon inside the action button
     * @param actionLabel optional label of the action button
     * @param onClickAction click handler for the action button (required to show it)
     */
    @Composable
    fun WithButton(
        icon: ImageVector? = null,
        title: String,
        subtext: String? = null,
        headerBoxFlap: SBBHeaderBoxFlap = SBBHeaderBoxFlap.None,
        actionIcon: ImageVector? = null,
        actionLabel: String? = null,
        onClickAction: () -> Unit,
    ) {
        Custom(
            headerBoxFlap = headerBoxFlap
        ) {
            DefaultContent(
                icon = icon,
                title = title,
                subtext = subtext,
                actionIcon = actionIcon,
                actionLabel = actionLabel,
                onClickAction = onClickAction,
            )
        }
    }

    /**
     * Fully custom HeaderBox content.
     *
     * @param headerBoxFlap optional flap rendered below the box (defaults to none)
     * @param content body of the header box
     */
    @Composable
    fun Custom(
        headerBoxFlap: SBBHeaderBoxFlap = SBBHeaderBoxFlap.None,
        content: @Composable () -> Unit,
    ) {
        Box {
            Box(
                modifier = Modifier
                    .background(MaterialTheme.colorScheme.primary)
                    .fillMaxWidth()
                    .height(SBBSpacing.Large)
            )
            FlapWrapper(
                headerBoxContent = content,
                headerBoxFlap = headerBoxFlap,
            )
        }
    }

    @Composable
    private fun FlapWrapper(
        headerBoxContent: @Composable () -> Unit,
        headerBoxFlap: SBBHeaderBoxFlap,
    ) {
        Column(
            modifier = Modifier
                .padding(start = SBBSpacing.Medium, end = SBBSpacing.Medium)
                .clip(RoundedCornerShape(SBBSpacing.Medium))
                .background(color = flapBackgroundColor())
        ) {
            SBBContentBox(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                headerBoxContent()
            }

            if (headerBoxFlap !is SBBHeaderBoxFlap.None) {
                Box(modifier = Modifier.padding(horizontal = SBBSpacing.Medium, vertical = SBBSpacing.XSmall)) {
                    headerBoxFlap.Render()
                }
            }
        }
    }

    @Composable
    private fun DefaultContent(
        icon: ImageVector? = null,
        title: String,
        subtext: String?,
        actionIcon: ImageVector? = null,
        actionLabel: String? = null,
        onClickAction: (() -> Unit)? = null,
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    if (icon != null)
                        Icon(
                            modifier = Modifier.width(24.dp),
                            imageVector = icon,
                            contentDescription = null,
                            tint = iconColor(),
                        )
                    Text(
                        title,
                        style = SBBTheme.sbbTypography.mediumBold,
                        modifier = Modifier.padding(top = 2.dp, bottom = 2.dp)
                    )
                }
                if (!subtext.isNullOrEmpty())
                    Text(
                        subtext,
                        style = SBBTheme.sbbTypography.smallLight,
                        modifier = Modifier.padding(top = 2.dp, bottom = 2.dp)
                    )
            }
            if (onClickAction != null)
                SBBTertiaryButtonSmall(
                    label = actionLabel,
                    icon = actionIcon,
                    onClick = onClickAction,
                )
        }

    }

    @Composable
    private fun iconColor(): Color {
        val colors = SBBTheme.colors
        return if (SBBTheme.isDarkMode) colors.white else colors.black
    }

    @Composable
    private fun flapBackgroundColor(): Color {
        val colors = SBBTheme.colors
        return if (SBBTheme.isDarkMode) colors.midnight else colors.cloud
    }
}
