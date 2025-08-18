package ch.sbb.compose_mds.beta.list

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ch.sbb.compose_mds.beta.ExperimentalSBBComponent
import ch.sbb.compose_mds.theme.defaultPadding

@ExperimentalSBBComponent
@Composable
fun SBBListHeader(
    modifier: Modifier = Modifier,
    text: String,
) {
    Text(
        modifier = modifier.defaultPadding(),
        text = text,
        style = MaterialTheme.typography.bodySmall,
    )
}
