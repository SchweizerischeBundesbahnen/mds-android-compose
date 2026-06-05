@file:SuppressLint("ComposableNaming")

package ch.sbb.compose_mds.composables.status

import android.annotation.SuppressLint
import android.content.res.Configuration
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import ch.sbb.compose_mds.theme.SBBTheme

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
internal fun _StatusPreviewAlert() {
    SBBTheme {
        Surface {
            SBBStatus.Alert(text = "This is an alert!")
        }
    }
}

@Preview(showBackground = true)
@Composable
internal fun _StatusPreviewAlertWithoutText() {
    SBBTheme {
        SBBStatus.Alert()
    }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
internal fun _StatusPreviewWarning() {
    SBBTheme {
        Surface {
            SBBStatus.Warning(text = "This is a warning!")
        }
    }
}

@Preview(showBackground = true)
@Composable
internal fun _StatusPreviewWarningWithoutText() {
    SBBTheme {
        SBBStatus.Warning()
    }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
internal fun _StatusPreviewSuccess() {
    SBBTheme {
        Surface {
            SBBStatus.Success(text = "This is a success!")
        }
    }
}

@Preview(showBackground = true)
@Composable
internal fun _StatusPreviewSuccessWithoutText() {
    SBBTheme {
        SBBStatus.Success()
    }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
internal fun _StatusPreviewInformation() {
    SBBTheme {
        Surface {
            SBBStatus.Information(text = "This is an information!")
        }
    }
}

@Preview(showBackground = true)
@Composable
internal fun _StatusPreviewInformationWithoutText() {
    SBBTheme {
        SBBStatus.Information()
    }
}
