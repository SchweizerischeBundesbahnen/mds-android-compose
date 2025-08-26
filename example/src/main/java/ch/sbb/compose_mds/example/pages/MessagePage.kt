package ch.sbb.compose_mds.example.pages

import SBBTheme
import android.content.res.Configuration
import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.beta.ExperimentalSBBComponent
import ch.sbb.compose_mds.beta.list.SBBListHeader
import ch.sbb.compose_mds.composables.container.SBBContentBox
import ch.sbb.compose_mds.composables.message.Custom
import ch.sbb.compose_mds.composables.message.Default
import ch.sbb.compose_mds.composables.message.Error
import ch.sbb.compose_mds.composables.message.Loading
import ch.sbb.compose_mds.composables.message.SBBMessage
import ch.sbb.compose_mds.composables.message.SBBMessageIllustration
import ch.sbb.compose_mds.sbbicons.Medium
import ch.sbb.compose_mds.sbbicons.SBBIcons
import ch.sbb.compose_mds.sbbicons.medium.TrainMedium

private const val MESSAGE =
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque vulputate massa ut ex fringilla."


@OptIn(ExperimentalSBBComponent::class)
@Composable
fun MessagePage() {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        SBBListHeader(text = "Default")
        SBBMessageDefault()
        SBBListHeader(text = "Default with custom interaction")
        SBBMessageDefaultCustom()
        SBBListHeader(text = "Loading")
        SBBMessageLoading()
        SBBListHeader(text = "Error")
        SBBMessageError()
        SBBListHeader(text = "No Illustration")
        SBBMessageNoIllustration()
    }
}

@Composable
private fun SBBMessageDefault() {
    MessageContainer {
        SBBMessage.Default(
            title = "Title, single line",
            message = MESSAGE
        )
    }
}

@Composable
private fun SBBMessageDefaultCustom() {
    MessageContainer {
        val context = LocalContext.current
        SBBMessage.Default(
            title = "Title, single line",
            message = MESSAGE,
            illustration = SBBMessageIllustration.STAFF_FEMALE,
            interactionIcon = SBBIcons.Medium.TrainMedium,
            onInteraction = {
                Toast.makeText(context, "On interaction", Toast.LENGTH_SHORT).show()
            }
        )
    }
}

@Composable
private fun SBBMessageLoading() {
    MessageContainer {
        SBBMessage.Loading(
            title = "Title, single line",
            message = MESSAGE
        )
    }
}

@Composable
private fun SBBMessageError() {
    MessageContainer {
        val context = LocalContext.current
        SBBMessage.Error(
            title = "Title, single line",
            message = MESSAGE,
            errorCode = "Error Code: XYZ-999",
            onInteraction = {
                Toast.makeText(context, "On interaction", Toast.LENGTH_SHORT).show()
            }
        )
    }
}

@Composable
private fun SBBMessageNoIllustration() {
    MessageContainer {
        val context = LocalContext.current
        SBBMessage.Custom(
            title = "Title, single line",
            message = MESSAGE,
            onInteraction = {
                Toast.makeText(context, "On interaction", Toast.LENGTH_SHORT).show()
            }
        )
    }
}

@Composable
private fun MessageContainer(
    content: @Composable ColumnScope.() -> Unit
) {
    SBBContentBox(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        content = content,
    )
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_NO)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun Preview_MessageDefault() {
    SBBTheme(includeSurface = true) {
        SBBMessageDefault()
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_NO)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun Preview_MessageDefaultCustom() {
    SBBTheme(includeSurface = true) {
        SBBMessageDefaultCustom()
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_NO)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun Preview_MessageError() {
    SBBTheme(includeSurface = true) {
        SBBMessageError()
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_NO)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun Preview_MessageNoIllustration() {
    SBBTheme(includeSurface = true) {
        SBBMessageNoIllustration()
    }
}
