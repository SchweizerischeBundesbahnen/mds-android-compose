package ch.sbb.compose_mds.beta.headerBox

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
import ch.sbb.compose_mds.beta.ExperimentalSBBComponent
import ch.sbb.compose_mds.theme.SBBSpacing

@ExperimentalSBBComponent
sealed interface SBBHeaderBoxFlap {
    @Composable
    fun Render()

    object None : SBBHeaderBoxFlap {
        @Composable
        override fun Render() {
        }
    }

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
                    contentDescription = ""
                )
                Text(modifier = Modifier.weight(1F), text = text, style = SBBTheme.sbbTypography.smallLight)
                if (trailingIcon != null) Icon(
                    modifier = Modifier.size(20.dp).clickable(onClickTrailingIcon = onClickTrailingIcon),
                    imageVector = trailingIcon,
                    contentDescription = ""
                )
            }
        }

        private fun Modifier.clickable(onClickTrailingIcon: (() -> Unit)?): Modifier {
            if (onClickTrailingIcon == null) return this
            return this.clickable(onClick = onClickTrailingIcon)
        }
    }

    data class Custom(
        private val content: @Composable () -> Unit
    ) : SBBHeaderBoxFlap {
        @Composable
        override fun Render() = content()
    }
}