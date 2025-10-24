package ch.sbb.compose_mds.composables.headerBox

import SBBTheme
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.theme.SBBSpacing

/**
 * SBB HeaderBoxFlap component.
 *
 * A flap is an optional, compact row shown below the header content.
 * Implementations render their own UI via [Render].
 */
sealed interface SBBHeaderBoxFlap {

    /**
     * Draw the flap content.
     * Called by the parent.
     */
    @Composable
    fun Render()

    /**
     * No-op flap — renders nothing.
     */
    object None : SBBHeaderBoxFlap {
        @Composable
        override fun Render() {
        }
    }

    /**
     * Default text row with optional leading and trailing icons.
     *
     * @param leadingIcon optional icon before the text
     * @param text main flap text
     * @param trailingIcon optional icon after the text
     * @param onClickTrailingIcon click handler for [trailingIcon] (ignored if null)
     */
    data class Default(
        val leadingIcon: ImageVector? = null,
        val text: String,
        val trailingIcon: ImageVector? = null,
        val onClickTrailingIcon: (() -> Unit)? = null,
    ) : SBBHeaderBoxFlap {
        @Composable
        override fun Render() {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(SBBSpacing.XSmall)
            ) {
                if (leadingIcon != null) Icon(
                    modifier = Modifier.size(20.dp),
                    imageVector = leadingIcon,
                    contentDescription = null
                )
                Text(modifier = Modifier.weight(1F), text = text, style = SBBTheme.sbbTypography.smallLight)
                if (trailingIcon != null) Icon(
                    modifier = Modifier
                        .size(20.dp)
                        .clickable(onClickTrailingIcon = onClickTrailingIcon),
                    imageVector = trailingIcon,
                    contentDescription = null
                )
            }
        }

        /**
         * Makes this [Modifier] clickable only if a handler is provided.
         */
        private fun Modifier.clickable(onClickTrailingIcon: (() -> Unit)?): Modifier {
            if (onClickTrailingIcon == null) return this
            return this.clickable(onClick = onClickTrailingIcon)
        }
    }

    /**
     * Fully custom flap content.
     *
     * @param content composable that draws the flap
     */
    data class Custom(
        private val content: @Composable () -> Unit
    ) : SBBHeaderBoxFlap {
        @Composable
        override fun Render() = content()
    }
}