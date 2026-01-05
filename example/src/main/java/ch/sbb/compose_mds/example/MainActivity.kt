package ch.sbb.compose_mds.example

import SBBTheme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ch.sbb.compose_mds.beta.ExperimentalSBBComponent
import ch.sbb.compose_mds.beta.segmentedButton.SBBButtonSegment
import ch.sbb.compose_mds.beta.segmentedButton.SBBSegmentedButton
import ch.sbb.compose_mds.composables.header.SBBHeader
import ch.sbb.compose_mds.composables.header.Small
import ch.sbb.compose_mds.example.pages.ButtonPage
import ch.sbb.compose_mds.example.pages.CheckboxPage
import ch.sbb.compose_mds.example.pages.ColorPage
import ch.sbb.compose_mds.example.pages.ContainerPage
import ch.sbb.compose_mds.example.pages.HeaderBoxPage
import ch.sbb.compose_mds.example.pages.HeaderPage
import ch.sbb.compose_mds.example.pages.IconPage
import ch.sbb.compose_mds.example.pages.LoadingIndicatorPage
import ch.sbb.compose_mds.example.pages.MainPage
import ch.sbb.compose_mds.example.pages.MessagePage
import ch.sbb.compose_mds.example.pages.ModalViewPage
import ch.sbb.compose_mds.example.pages.NotificationBoxPage
import ch.sbb.compose_mds.example.pages.RadioButtonPage
import ch.sbb.compose_mds.example.pages.SegmentedButtonPage
import ch.sbb.compose_mds.example.pages.SliderPage
import ch.sbb.compose_mds.example.pages.StatusPage
import ch.sbb.compose_mds.example.pages.SwitchPage
import ch.sbb.compose_mds.example.pages.TabBarPage
import ch.sbb.compose_mds.example.pages.TextInputPage
import ch.sbb.compose_mds.example.pages.TextareaPage
import ch.sbb.compose_mds.example.pages.TypographyPage
import ch.sbb.compose_mds.theme.SBBSpacing

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalSBBComponent::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val isSystemInDarkTheme = isSystemInDarkTheme()
            var isDarkTheme by remember { mutableStateOf(isSystemInDarkTheme) }
            SBBTheme(darkTheme = isDarkTheme) {
                val navController = rememberNavController()
                Scaffold(
                    topBar = {
                        Column(verticalArrangement = Arrangement.spacedBy(SBBSpacing.XSmall)) {
                            SBBHeader.Small(
                                title = "SBB DSM Android",
                                navController = navController
                            )
                            DarkLightThemeSelection(
                                onSelectionChanged = { selected -> isDarkTheme = selected },
                                selection = isDarkTheme,
                            )
                        }
                    },
                ) {
                    Box(modifier = Modifier.padding(it)) {
                        NavHost(
                            navController = navController,
                            startDestination = "main",
                        ) {
                            composable("main") { MainPage(navController) }
                            composable("icon") { IconPage() }
                            composable("typography") { TypographyPage() }
                            composable("color") { ColorPage() }
                            composable("checkbox") { CheckboxPage() }
                            composable("button") { ButtonPage() }
                            composable("loading-indicator") { LoadingIndicatorPage() }
                            composable("switch") { SwitchPage() }
                            composable("header") { HeaderPage() }
                            composable("header-box") { HeaderBoxPage() }
                            composable("modal-view") { ModalViewPage() }
                            composable("text-input") { TextInputPage() }
                            composable("textarea") { TextareaPage() }
                            composable("segmented-button") { SegmentedButtonPage() }
                            composable("status") { StatusPage() }
                            composable("slider") { SliderPage() }
                            composable("notification-box") { NotificationBoxPage() }
                            composable("tab-bar") { TabBarPage() }
                            composable("container") { ContainerPage() }
                            composable("message") { MessagePage() }
                            composable("radio-button") { RadioButtonPage() }
                        }
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalSBBComponent::class)
@Composable
private fun DarkLightThemeSelection(
    selection: Boolean,
    onSelectionChanged: (Boolean) -> Unit
) {
    SBBSegmentedButton(
        modifier = Modifier.padding(horizontal = SBBSpacing.XSmall),
        onSelectionChanged = onSelectionChanged,
        selection = selection,
        segments = listOf(
            SBBButtonSegment(
                label = "Light Theme",
                value = false
            ),
            SBBButtonSegment(
                label = "Dark Theme",
                value = true
            ),
        ),
    )
}

@PreviewLightDark
@Composable
private fun Preview_MainPage() {
    SBBTheme {
        Surface {
            MainPage(navController = rememberNavController())
        }
    }
}
