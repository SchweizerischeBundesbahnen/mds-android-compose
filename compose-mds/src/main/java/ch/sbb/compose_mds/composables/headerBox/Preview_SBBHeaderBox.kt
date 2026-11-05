package ch.sbb.compose_mds.composables.headerBox

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.icons.CircleInformationSmall
import ch.sbb.compose_mds.icons.SBBIcons
import ch.sbb.compose_mds.icons.SignExclamationPointSmall
import ch.sbb.compose_mds.icons.UnicornSmall
import ch.sbb.compose_mds.theme.SBBColors
import ch.sbb.compose_mds.theme.SBBTheme

@PreviewLightDark
@Composable
private fun PreviewSBBHeaderBox() {
    SBBTheme {
        SBBHeaderBox.Default(
            icon = SBBIcons.UnicornSmall,
            title = "Title",
            subtext = "Subtext",
            headerBoxFlap = SBBHeaderBoxFlap.Default(
                leadingIcon = SBBIcons.SignExclamationPointSmall,
                text = "Text",
                trailingIcon = SBBIcons.CircleInformationSmall,
            ),
        )
    }
}

@PreviewLightDark
@Composable
private fun PreviewSBBHeaderBoxWithButton() {
    SBBTheme {
        SBBHeaderBox.WithButton(
            title = "Title",
            subtext = "Subtext",
            actionIcon = SBBIcons.UnicornSmall,
            actionLabel = "Login",
            onClickAction = {},
        )
    }
}

@PreviewLightDark
@Composable
private fun PreviewSBBHeaderBoxCustom() {
    SBBTheme {
        SBBHeaderBox.Custom(
            headerBoxFlap = SBBHeaderBoxFlap.Custom {
                Box(
                    modifier = Modifier
                        .background(color = SBBColors.violet)
                        .fillMaxWidth()
                        .height(24.dp),
                )
            },
        ) {
            Box(
                modifier = Modifier
                    .background(color = SBBColors.violet)
                    .fillMaxWidth()
                    .height(36.dp),
            )
        }
    }
}
