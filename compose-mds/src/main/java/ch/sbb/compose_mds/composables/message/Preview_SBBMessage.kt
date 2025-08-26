package ch.sbb.compose_mds.composables.message

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

private const val TITLE = "Single Line Title"
private const val MESSAGE = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque vulputate massa ut ex fringilla."

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun Preview_SBBMessage_Error() {
    SBBMessage.Error(
        title = TITLE,
        message = MESSAGE,
        errorCode = "Error-Code: 123-XYZ",
        onInteraction = {}
    )
}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun Preview_SBBMessage_Loading() {
    SBBMessage.Loading(
        title = TITLE,
        message = MESSAGE,
    )
}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun Preview_SBBMessage_Default() {
    SBBMessage.Default(
        title = TITLE,
        message = MESSAGE,
    )
}