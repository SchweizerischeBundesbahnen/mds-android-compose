package ch.sbb.compose_mds.example.pages

import SBBTheme
import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.tooling.preview.PreviewParameter
import ch.sbb.compose_mds.beta.ExperimentalSBBComponent
import ch.sbb.compose_mds.beta.list.SBBListHeader
import ch.sbb.compose_mds.composables.button.SBBPrimaryButton
import ch.sbb.compose_mds.composables.button.SBBSecondaryButton
import ch.sbb.compose_mds.composables.button.SBBTertiaryButton
import ch.sbb.compose_mds.composables.button.SBBTertiaryButtonSmall
import ch.sbb.compose_mds.composables.container.SBBContentBox
import ch.sbb.compose_mds.preview.SBBThemeConfigProvider
import ch.sbb.compose_mds.preview.ThemePreviewConfig
import ch.sbb.compose_mds.sbbicons.SBBIcons
import ch.sbb.compose_mds.sbbicons.Small
import ch.sbb.compose_mds.sbbicons.small.CircleInformationSmall
import ch.sbb.compose_mds.sbbicons.small.DogSmall
import ch.sbb.compose_mds.theme.SBBSpacing
import ch.sbb.compose_mds.theme.defaultPadding

@OptIn(ExperimentalSBBComponent::class)
@Composable
fun ButtonPage() {
    Column(
        Modifier
            .defaultPadding()
            .fillMaxWidth()
            .verticalScroll(
                state = rememberScrollState(),
            ),
        verticalArrangement = Arrangement.spacedBy(SBBSpacing.XSmall)
    ) {
        SBBContentBox(
            modifier = Modifier.fillMaxWidth(),
            contentPadding = PaddingValues(SBBSpacing.XSmall)
        ) {
            Row(horizontalArrangement = Arrangement.spacedBy(SBBSpacing.XSmall)) {
                Icon(
                    imageVector = SBBIcons.Small.CircleInformationSmall,
                    contentDescription = null,
                )
                Text("Context: ${SBBTheme.contextName}")
            }
        }
        SBBPrimaryButtonSection()
        SBBSecondaryButtonSection()
        SBBTertiaryButtonSection()
        SBBTertiarySmallButtonSection()
    }
}

@OptIn(ExperimentalSBBComponent::class)
@Composable
private fun SBBPrimaryButtonSection() {
    val context = LocalContext.current

    SBBContentBox(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(SBBSpacing.XSmall)
    ) {
        SBBListHeader(text = "Primary")
        Column(
            Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(SBBSpacing.XSmall)
        ) {
            SBBPrimaryButton(
                modifier = Modifier.fillMaxWidth(),
                label = "Primary Button",
            ) {
                showToast(context, "Primary Button clicked")
            }
            SBBPrimaryButton(
                modifier = Modifier.fillMaxWidth(),
                enabled = false,
                label = "Primary Button disabled",
            ) {
                showToast(context, "Primary Button disabled clicked")
            }
            SBBPrimaryButton(
                modifier = Modifier.fillMaxWidth(),
                isLoading = true,
                label = "Primary Button loading",
            ) {
                showToast(context, "Primary Button loading clicked")
            }
        }
    }
}

@OptIn(ExperimentalSBBComponent::class)
@Composable
private fun SBBSecondaryButtonSection() {
    val context = LocalContext.current

    SBBContentBox(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(SBBSpacing.XSmall)
    ) {
        SBBListHeader(text = "Secondary")
        Column(
            Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(SBBSpacing.XSmall)
        ) {
            SBBSecondaryButton(
                modifier = Modifier.fillMaxWidth(),
                label = "Secondary Button",
            ) {
                showToast(context, "Secondary Button clicked")
            }
            SBBSecondaryButton(
                modifier = Modifier.fillMaxWidth(),
                enabled = false,
                label = "Secondary Button disabled",
            ) {
                showToast(context, "Secondary Button disabled clicked")
            }
            SBBSecondaryButton(
                modifier = Modifier.fillMaxWidth(),
                isLoading = true,
                label = "Secondary Button loading",
            ) {
                showToast(context, "Secondary Button loading clicked")
            }
        }
    }
}

@OptIn(ExperimentalSBBComponent::class)
@Composable
private fun SBBTertiaryButtonSection() {
    val context = LocalContext.current

    SBBContentBox(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(SBBSpacing.XSmall)
    ) {
        SBBListHeader(text = "Tertiary")
        Column(
            verticalArrangement = Arrangement.spacedBy(SBBSpacing.XSmall)
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(SBBSpacing.XSmall)
            ) {
                SBBTertiaryButton(
                    icon = SBBIcons.Small.DogSmall,
                    label = "dog",
                ) {
                    showToast(context, "Tertiary Button with icon and text clicked")
                }
                SBBTertiaryButton(
                    enabled = false,
                    icon = SBBIcons.Small.DogSmall,
                    label = "dog",
                ) {
                    showToast(context, "Tertiary Button with icon and text clicked")
                }
                SBBTertiaryButton(
                    isLoading = true,
                    icon = SBBIcons.Small.DogSmall,
                    label = "dog",
                ) {
                    showToast(context, "Tertiary Button loading with icon and text clicked")
                }
            }
            Row(
                horizontalArrangement = Arrangement.spacedBy(SBBSpacing.XSmall)
            ) {
                SBBTertiaryButton(
                    icon = SBBIcons.Small.DogSmall,
                ) {
                    showToast(context, "Tertiary Button with icon clicked")
                }
                SBBTertiaryButton(
                    enabled = false,
                    icon = SBBIcons.Small.DogSmall,
                ) {
                    showToast(context, "Tertiary Button with icon clicked")
                }
                SBBTertiaryButton(
                    isLoading = true,
                    icon = SBBIcons.Small.DogSmall,
                ) {
                    showToast(context, "Tertiary Button loading with icon clicked")
                }
            }
        }
    }
}


@OptIn(ExperimentalSBBComponent::class)
@Composable
private fun SBBTertiarySmallButtonSection() {
    val context = LocalContext.current

    SBBContentBox(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(SBBSpacing.XSmall)
    ) {
        SBBListHeader(text = "Tertiary Small")
        Column(
            verticalArrangement = Arrangement.spacedBy(SBBSpacing.XSmall)
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(SBBSpacing.XSmall)
            ) {
                SBBTertiaryButtonSmall(
                    icon = SBBIcons.Small.DogSmall,
                    label = "dog",
                ) {
                    showToast(context, "Tertiary Button small with icon and text clicked")
                }
                SBBTertiaryButtonSmall(
                    enabled = false,
                    icon = SBBIcons.Small.DogSmall,
                    label = "dog",
                ) {
                    showToast(context, "Tertiary Button small with icon and text clicked")
                }
                SBBTertiaryButtonSmall(
                    isLoading = true,
                    icon = SBBIcons.Small.DogSmall,
                    label = "dog",
                ) {
                    showToast(context, "Tertiary Button small loading with icon and text clicked")
                }
            }
            Row(
                horizontalArrangement = Arrangement.spacedBy(SBBSpacing.XSmall)
            ) {
                SBBTertiaryButtonSmall(
                    icon = SBBIcons.Small.DogSmall,
                ) {
                    showToast(context, "Tertiary Button small with icon clicked")
                }
                SBBTertiaryButtonSmall(
                    enabled = false,
                    icon = SBBIcons.Small.DogSmall,
                ) {
                    showToast(context, "Tertiary Button small with icon clicked")
                }
                SBBTertiaryButtonSmall(
                    isLoading = true,
                    icon = SBBIcons.Small.DogSmall,
                ) {
                    showToast(context, "Tertiary Button small loading with icon clicked")
                }
            }
        }
    }
}

private fun showToast(context: Context, text: String) {
    Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
}

@PreviewLightDark
@Composable
fun Preview_SBBPrimaryButton(
    @PreviewParameter(SBBThemeConfigProvider::class) config: ThemePreviewConfig,
) {
    SBBTheme(themeContext = config.themeContext, includeSurface = true) {
        SBBPrimaryButtonSection()
    }
}

@PreviewLightDark
@Composable
fun Preview_SBBSecondaryButton(
    @PreviewParameter(SBBThemeConfigProvider::class) config: ThemePreviewConfig,
) {
    SBBTheme(themeContext = config.themeContext, includeSurface = true) {
        SBBSecondaryButtonSection()
    }
}

@PreviewLightDark
@Composable
fun Preview_SBBTertiaryButton() {
    SBBTheme(includeSurface = true) {
        SBBTertiaryButtonSection()
    }
}

@PreviewLightDark
@Composable
fun Preview_SBBTertiarySmallButton() {
    SBBTheme(includeSurface = true) {
        SBBTertiarySmallButtonSection()
    }
}
