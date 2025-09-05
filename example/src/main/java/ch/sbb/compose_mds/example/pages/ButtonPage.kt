package ch.sbb.compose_mds.example.pages

import SBBTheme
import android.content.res.Configuration
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import ch.sbb.compose_mds.beta.ExperimentalSBBComponent
import ch.sbb.compose_mds.composables.button.SBBPrimaryButton
import ch.sbb.compose_mds.beta.button.SBBSecondaryButton
import ch.sbb.compose_mds.beta.button.SBBTertiaryButton
import ch.sbb.compose_mds.beta.button.SBBTertiaryButtonSmall
import ch.sbb.compose_mds.beta.list.SBBListHeader
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
    val context = LocalContext.current

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
        SBBListHeader(text = "Primary")
        SBBPrimaryButton(
            modifier = Modifier.fillMaxWidth(),
            label = "Primary Button",
        ) {
            Toast.makeText(context, "Primary Button clicked", Toast.LENGTH_SHORT).show()
        }
        SBBPrimaryButton(
            modifier = Modifier.fillMaxWidth(),
            enabled = false,
            label = "Primary Button disabled",
        ) {
            Toast
                .makeText(context, "Primary Button disabled clicked", Toast.LENGTH_SHORT)
                .show()
        }
        SBBPrimaryButton(
            modifier = Modifier.fillMaxWidth(),
            isLoading = true,
            label = "Primary Button loading",
        ) {
            Toast
                .makeText(context, "Primary Button disabled clicked", Toast.LENGTH_SHORT)
                .show()
        }
        SBBListHeader(text = "Secondary")
        SBBSecondaryButton(
            modifier = Modifier.fillMaxWidth(),
            label = "Secondary Button",
        ) {
            Toast.makeText(context, "Secondary Button clicked", Toast.LENGTH_SHORT).show()
        }
        SBBSecondaryButton(
            modifier = Modifier.fillMaxWidth(),
            enabled = false,
            label = "Secondary Button disabled",
        ) {
            Toast
                .makeText(context, "Secondary Button disabled clicked", Toast.LENGTH_SHORT)
                .show()
        }
        SBBListHeader(text = "Tertiary")
        Row(
            horizontalArrangement = Arrangement.spacedBy(SBBSpacing.XSmall)
        ) {
            SBBTertiaryButton(
                icon = SBBIcons.Small.DogSmall,
            ) {
                Toast
                    .makeText(context, "Tertiary Button with icon clicked", Toast.LENGTH_SHORT)
                    .show()
            }
            SBBTertiaryButton(
                icon = SBBIcons.Small.DogSmall,
                label = "dog",
            ) {
                Toast
                    .makeText(
                        context,
                        "Tertiary Button with icon and text clicked",
                        Toast.LENGTH_SHORT,
                    ).show()
            }
            SBBTertiaryButton(
                enabled = false,
                icon = SBBIcons.Small.DogSmall,
            ) {
                Toast
                    .makeText(context, "Tertiary Button with icon clicked", Toast.LENGTH_SHORT)
                    .show()
            }
            SBBTertiaryButton(
                enabled = false,
                icon = SBBIcons.Small.DogSmall,
                label = "dog",
            ) {
                Toast
                    .makeText(
                        context,
                        "Tertiary Button with icon and text clicked",
                        Toast.LENGTH_SHORT,
                    ).show()
            }
        }
        SBBListHeader(text = "Tertiary Small")
        Row(
            horizontalArrangement = Arrangement.spacedBy(SBBSpacing.XSmall)
        ) {
            SBBTertiaryButtonSmall(
                icon = SBBIcons.Small.DogSmall,
            ) {
                Toast
                    .makeText(
                        context,
                        "Tertiary Button small with icon clicked",
                        Toast.LENGTH_SHORT,
                    ).show()
            }
            SBBTertiaryButtonSmall(
                icon = SBBIcons.Small.DogSmall,
                label = "dog",
            ) {
                Toast
                    .makeText(
                        context,
                        "Tertiary Button small with icon and text clicked",
                        Toast.LENGTH_SHORT,
                    ).show()
            }
            SBBTertiaryButtonSmall(
                enabled = false,
                icon = SBBIcons.Small.DogSmall,
            ) {
                Toast
                    .makeText(
                        context,
                        "Tertiary Button small with icon clicked",
                        Toast.LENGTH_SHORT,
                    ).show()
            }
            SBBTertiaryButtonSmall(
                enabled = false,
                icon = SBBIcons.Small.DogSmall,
                label = "dog",
            ) {
                Toast
                    .makeText(
                        context,
                        "Tertiary Button small with icon and text clicked",
                        Toast.LENGTH_SHORT,
                    ).show()
            }
        }
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_NO)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun Preview_ButtonPage(
    @PreviewParameter(SBBThemeConfigProvider::class) config: ThemePreviewConfig,
) {
    SBBTheme(themeContext = config.themeContext, includeSurface = true) {
        ButtonPage()
    }
}
