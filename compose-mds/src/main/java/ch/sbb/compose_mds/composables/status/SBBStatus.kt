package ch.sbb.compose_mds.composables.status

import android.content.res.Configuration
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

object SBBStatus

@Composable
fun SBBStatus.Alert(
    modifier: Modifier = Modifier,
    text: String? = null,
) = SBBStatus(modifier, SBBStatusType.Alert, text)

@Composable
fun SBBStatus.Warning(
    modifier: Modifier = Modifier,
    text: String? = null,
) = SBBStatus(modifier, SBBStatusType.Warning, text)

@Composable
fun SBBStatus.Success(
    modifier: Modifier = Modifier,
    text: String? = null,
) = SBBStatus(modifier, SBBStatusType.Success, text)

@Composable
fun SBBStatus.Information(
    modifier: Modifier = Modifier,
    text: String? = null,
) = SBBStatus(modifier, SBBStatusType.Information, text)

/***
 * Implementation of the SBB Status.
 *
 * @param type The Status type.
 * @param text The message. If [null], only the icon will be shown.
 *
 * For a complete definition of the component, please visit [digital.sbb.ch](https://digital.sbb.ch/de/design-system/mobile/components/status/)
 */
@Composable
private fun SBBStatus(
    type: SBBStatusType,
    modifier: Modifier = Modifier,
    text: String? = null,
) {
    Row(
        modifier =
            modifier
                .clip(RoundedCornerShape(2.dp))
                .border(BorderStroke(1.dp, color = type.color))
                .background(color = type.color.copy(alpha = 0.15F)),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        type.Icon()
        text?.let { text ->
            Text(
                text = text,
                color = MaterialTheme.colorScheme.onSurface,
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(horizontal = 8.dp),
            )
        }
    }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun StatusPreviewAlert() = _StatusPreviewAlert()

@Preview(showBackground = true)
@Composable
private fun StatusPreviewAlertWithoutText() = _StatusPreviewAlertWithoutText()

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun StatusPreviewWarning() = _StatusPreviewWarning()

@Preview(showBackground = true)
@Composable
private fun StatusPreviewWarningWithoutText() = _StatusPreviewWarningWithoutText()

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun StatusPreviewSuccess() = _StatusPreviewSuccess()

@Preview(showBackground = true)
@Composable
private fun StatusPreviewSuccessWithoutText() = _StatusPreviewSuccessWithoutText()

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun StatusPreviewInformation() = _StatusPreviewInformation()

@Preview(showBackground = true)
@Composable
private fun StatusPreviewInformationWithoutText() = _StatusPreviewInformationWithoutText()
