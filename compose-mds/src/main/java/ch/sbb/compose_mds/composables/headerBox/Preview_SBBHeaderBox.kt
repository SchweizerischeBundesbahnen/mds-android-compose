@file:OptIn(ExperimentalSBBComponent::class)

package ch.sbb.compose_mds.composables.headerBox

import SBBTheme
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.beta.ExperimentalSBBComponent
import ch.sbb.compose_mds.sbbicons.SBBIcons
import ch.sbb.compose_mds.sbbicons.Small
import ch.sbb.compose_mds.sbbicons.small.CircleInformationSmall
import ch.sbb.compose_mds.sbbicons.small.SignExclamationPointSmall
import ch.sbb.compose_mds.sbbicons.small.UnicornSmall
import ch.sbb.compose_mds.theme.PrimitiveColors


@PreviewLightDark()
@Composable
private fun PreviewSBBHeaderBox() {
    SBBTheme {
        SBBHeaderBox.Default(
            icon = SBBIcons.Small.UnicornSmall,
            title = "Title",
            subtext = "Subtext",
            headerBoxFlap = SBBHeaderBoxFlap.Default(
                leadingIcon = SBBIcons.Small.SignExclamationPointSmall,
                text = "Text",
                trailingIcon = SBBIcons.Small.CircleInformationSmall
            )
        )
    }
}

@PreviewLightDark()
@Composable
private fun PreviewSBBHeaderBoxWithButton() {
    SBBTheme {
        SBBHeaderBox.WithButton(
            title = "Title",
            subtext = "Subtext",
            actionIcon = SBBIcons.Small.UnicornSmall,
            actionLabel = "Login",
            onClickAction = {},
        )
    }
}

@PreviewLightDark()
@Composable
private fun PreviewSBBHeaderBoxCustom() {
    SBBTheme {
        SBBHeaderBox.Custom(
            headerBoxFlap = SBBHeaderBoxFlap.Custom {
                Box(
                    modifier = Modifier
                        .background(color = PrimitiveColors.violet)
                        .fillMaxWidth()
                        .height(24.dp)
                )
            }
        ) {
            Box(
                modifier = Modifier
                    .background(color = PrimitiveColors.violet)
                    .fillMaxWidth()
                    .height(36.dp)
            )
        }
    }
}

