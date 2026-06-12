package ch.sbb.compose_mds.composables.listItem

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import ch.sbb.compose_mds.theme.defaultPadding

@Composable
fun SBBListHeader(
    title: String,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = defaultPadding,
    maxLines: Int = Int.MAX_VALUE,
    textStyle: TextStyle = MaterialTheme.typography.bodySmall,
) {
    Text(
        modifier = modifier.padding(contentPadding),
        text = title,
        style = textStyle,
        maxLines = maxLines,
        overflow = if (maxLines == Int.MAX_VALUE) TextOverflow.Clip else TextOverflow.Ellipsis,
    )
}
