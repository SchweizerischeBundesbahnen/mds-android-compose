package ch.sbb.compose_mds.example.pages

import SBBTheme
import android.content.res.Configuration
import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.beta.ExperimentalSBBComponent
import ch.sbb.compose_mds.beta.button.SBBPrimaryButton
import ch.sbb.compose_mds.beta.button.SBBSecondaryButton
import ch.sbb.compose_mds.beta.button.SBBTertiaryButton
import ch.sbb.compose_mds.beta.button.SBBTertiaryButtonSmall
import ch.sbb.compose_mds.preview.SBBThemeConfigProvider
import ch.sbb.compose_mds.preview.ThemePreviewConfig
import ch.sbb.compose_mds.sbbicons.SBBIcons
import ch.sbb.compose_mds.sbbicons.Small
import ch.sbb.compose_mds.sbbicons.small.DogSmall

@OptIn(ExperimentalSBBComponent::class)
@Composable
fun ButtonPage() {
    val context = LocalContext.current

    Column(Modifier.fillMaxWidth()) {
        SBBPrimaryButton(
            modifier =
                Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp, vertical = 8.dp),
            label = "Primary Button",
        ) {
            Toast.makeText(context, "Primary Button clicked", Toast.LENGTH_SHORT).show()
        }
        SBBPrimaryButton(
            modifier =
                Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp, vertical = 8.dp),
            enabled = false,
            label = "Primary Button disabled",
        ) {
            Toast
                .makeText(context, "Primary Button disabled clicked", Toast.LENGTH_SHORT)
                .show()
        }
        SBBSecondaryButton(
            modifier =
                Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp, vertical = 8.dp),
            label = "Secondary Button",
        ) {
            Toast.makeText(context, "Secondary Button clicked", Toast.LENGTH_SHORT).show()
        }
        SBBSecondaryButton(
            modifier =
                Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp, vertical = 8.dp),
            enabled = false,
            label = "Secondary Button disabled",
        ) {
            Toast
                .makeText(context, "Secondary Button disabled clicked", Toast.LENGTH_SHORT)
                .show()
        }
        Row(
            Modifier.padding(vertical = 8.dp),
        ) {
            SBBTertiaryButton(
                icon = SBBIcons.Small.DogSmall,
                modifier =
                    Modifier
                        .padding(start = 8.dp),
            ) {
                Toast
                    .makeText(context, "Tertiary Button with icon clicked", Toast.LENGTH_SHORT)
                    .show()
            }
            SBBTertiaryButton(
                icon = SBBIcons.Small.DogSmall,
                label = "dog",
                modifier =
                    Modifier
                        .padding(start = 8.dp),
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
                modifier =
                    Modifier
                        .padding(start = 8.dp),
            ) {
                Toast
                    .makeText(context, "Tertiary Button with icon clicked", Toast.LENGTH_SHORT)
                    .show()
            }
            SBBTertiaryButton(
                enabled = false,
                icon = SBBIcons.Small.DogSmall,
                label = "dog",
                modifier =
                    Modifier
                        .padding(start = 8.dp),
            ) {
                Toast
                    .makeText(
                        context,
                        "Tertiary Button with icon and text clicked",
                        Toast.LENGTH_SHORT,
                    ).show()
            }
        }
        Row(
            Modifier.padding(vertical = 8.dp),
        ) {
            SBBTertiaryButtonSmall(
                icon = SBBIcons.Small.DogSmall,
                modifier =
                    Modifier
                        .padding(start = 8.dp),
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
                modifier =
                    Modifier
                        .padding(start = 8.dp),
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
                modifier =
                    Modifier
                        .padding(start = 8.dp),
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
                modifier =
                    Modifier
                        .padding(start = 8.dp),
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

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Preview(showBackground = false, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun ButtonPagePreview(
    @PreviewParameter(SBBThemeConfigProvider::class) config: ThemePreviewConfig,
) {
    SBBTheme(themeContext = config.themeContext, includeSurface = true) { ButtonPage() }
}
