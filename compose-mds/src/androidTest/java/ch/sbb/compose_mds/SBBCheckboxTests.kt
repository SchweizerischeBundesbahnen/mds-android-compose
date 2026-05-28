package ch.sbb.compose_mds

import SBBTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.semantics.SemanticsProperties
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.test.SemanticsMatcher
import androidx.compose.ui.test.SemanticsNodeInteraction
import androidx.compose.ui.test.assert
import androidx.compose.ui.test.assertIsOff
import androidx.compose.ui.test.assertIsOn
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import ch.sbb.compose_mds.composables.checkbox.SBBCheckbox
import org.junit.Rule
import org.junit.Test

class SBBCheckboxTests {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun checkbox_toggle_bi_state() {
        composeTestRule.setContent {
            var checked: Boolean by remember { mutableStateOf(false) }
            SBBTheme {
                SBBCheckbox(
                    label = "MyCheckbox",
                    checked = checked,
                    onCheckedChange = { checked = it!! },
                )
            }
        }

        composeTestRule
            .onNodeWithText("MyCheckbox")
            .assertIsOff()
            .performClick()
            .assertIsOn()
            .performClick()
            .assertIsOff()
    }

    @Test
    fun checkbox_toggle_bi_state_null_should_be_off() {
        composeTestRule.setContent {
            SBBTheme {
                SBBCheckbox(
                    label = "MyCheckbox",
                    checked = null,
                    onCheckedChange = {},
                )
            }
        }

        composeTestRule.onNodeWithText("MyCheckbox").assertIsOff()
    }

    @Test
    fun checkbox_toggle_tri_state() {
        composeTestRule.setContent {
            var checked: Boolean? by remember { mutableStateOf(null) }
            SBBTheme {
                SBBCheckbox(
                    label = "MyCheckbox",
                    checked = checked,
                    onCheckedChange = { checked = it },
                    triStateEnabled = true,
                )
            }
        }

        composeTestRule
            .onNodeWithText("MyCheckbox")
            .assertIsIndeterminate()
            .performClick()
            .assertIsOff()
            .performClick()
            .assertIsOn()
            .performClick()
            .assertIsIndeterminate()
    }
}

fun SemanticsNodeInteraction.assertIsIndeterminate(): SemanticsNodeInteraction =
    assert(
        isIndeterminate(),
    )

fun isIndeterminate(): SemanticsMatcher =
    SemanticsMatcher.expectValue(
        SemanticsProperties.ToggleableState,
        ToggleableState.Indeterminate,
    )
