@file:SuppressLint("ComposableNaming")

package ch.sbb.compose_mds.composables.status

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.tooling.preview.PreviewParameter
import ch.sbb.compose_mds.composables.status.theme.SBBStatusStyle
import ch.sbb.compose_mds.icons.SBBIcons
import ch.sbb.compose_mds.icons.UnicornSmall
import ch.sbb.compose_mds.preview.SBBComponentPreviewWrapper
import ch.sbb.compose_mds.preview.SBBThemeConfigProvider
import ch.sbb.compose_mds.preview.ThemePreviewConfig
import ch.sbb.compose_mds.theme.SBBColors
import ch.sbb.compose_mds.theme.SBBSpacing

@PreviewLightDark
@Composable
private fun Preview_SBBStatus_Alert(
    @PreviewParameter(SBBThemeConfigProvider::class) config: ThemePreviewConfig,
) {
    SBBComponentPreviewWrapper(config) {
        Column(verticalArrangement = Arrangement.spacedBy(SBBSpacing.XSmall)) {
            SBBStatus.Alert(
                labelText = "This is an alert!",
            )
            SBBStatus.Alert()
        }
    }
}

@PreviewLightDark
@Composable
private fun Preview_SBBStatus_Warning(
    @PreviewParameter(SBBThemeConfigProvider::class) config: ThemePreviewConfig,
) {
    SBBComponentPreviewWrapper(config) {
        Column(verticalArrangement = Arrangement.spacedBy(SBBSpacing.XSmall)) {
            SBBStatus.Warning(labelText = "This is a warning!")
            SBBStatus.Warning()
        }
    }
}

@PreviewLightDark
@Composable
private fun Preview_SBBStatus_Success(
    @PreviewParameter(SBBThemeConfigProvider::class) config: ThemePreviewConfig,
) {
    SBBComponentPreviewWrapper(config) {
        Column(verticalArrangement = Arrangement.spacedBy(SBBSpacing.XSmall)) {
            SBBStatus.Success(labelText = "This is a success!")
            SBBStatus.Success()
        }
    }
}

@PreviewLightDark
@Composable
private fun Preview_SBBStatus_Information(
    @PreviewParameter(SBBThemeConfigProvider::class) config: ThemePreviewConfig,
) {
    SBBComponentPreviewWrapper(config) {
        Column(verticalArrangement = Arrangement.spacedBy(SBBSpacing.XSmall)) {
            SBBStatus.Information(labelText = "This is an information!")
            SBBStatus.Information()
        }
    }
}

@PreviewLightDark
@Composable
private fun Preview_SBBStatus_Custom(
    @PreviewParameter(SBBThemeConfigProvider::class) config: ThemePreviewConfig,
) {
    SBBComponentPreviewWrapper(config) {
        Column(verticalArrangement = Arrangement.spacedBy(SBBSpacing.XSmall)) {
            SBBStatus.Alert(
                style = SBBStatusStyle(
                    backgroundColor = SBBColors.turquoise,
                    borderColor = SBBColors.turquoise,
                ),
                iconData = SBBIcons.UnicornSmall,
                label = {
                    Text(
                        "Custom Text",
                        modifier = Modifier
                            .padding(horizontal = SBBSpacing.XSmall)
                            .background(color = SBBColors.turquoise),
                    )
                },
            )
        }
    }
}
