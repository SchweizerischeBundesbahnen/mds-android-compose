@file:SuppressLint("ComposableNaming")

package ch.sbb.compose_mds.composables.checkbox

import android.annotation.SuppressLint
import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import ch.sbb.compose_mds.theme.SBBTheme

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
internal fun _Preview_Enabled_SBBCheckbox() {
    SBBTheme {
        Surface {
            Column {
                SBBCheckbox(
                    label = "Label",
                    checked = true,
                    onCheckedChange = {},
                )
                SBBCheckbox(
                    label = "Label",
                    checked = false,
                    onCheckedChange = {},
                )
                SBBCheckbox(
                    label = "Label",
                    checked = null,
                    triStateEnabled = true,
                    onCheckedChange = {},
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
internal fun _Preview_Disabled_SBBCheckbox() {
    SBBTheme {
        Surface {
            Column {
                SBBCheckbox(
                    label = "Label",
                    checked = true,
                    disabled = true,
                    onCheckedChange = {},
                )
                SBBCheckbox(
                    label = "Label",
                    checked = false,
                    disabled = true,
                    onCheckedChange = {},
                )
                SBBCheckbox(
                    label = "Label",
                    checked = null,
                    disabled = true,
                    triStateEnabled = true,
                    onCheckedChange = {},
                )
            }
        }
    }
}
