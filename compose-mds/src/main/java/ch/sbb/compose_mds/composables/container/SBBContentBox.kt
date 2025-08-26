package ch.sbb.compose_mds.composables.container

import SBBTheme
import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.theme.SBBSpacing

/***
 * Implementation of the SBB Container variant "Content-Box".
 *
 * Use [contentPadding] instead of [modifier] to change the padding of the content
 *
 * For a complete definition of the component, please visit [digital.sbb.ch](https://digital.sbb.ch/de/design-system/mobile/components/container/)
 */
@Composable
fun SBBContentBox(
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(all = SBBSpacing.Medium),
    verticalArrangement: Arrangement.Vertical = Arrangement.Top,
    horizontalAlignment: Alignment.Horizontal = Alignment.Start,
    content: @Composable ColumnScope.() -> Unit,
) {
    Column(
        modifier = modifier
            .clip(shape = RoundedCornerShape(size = SBBSpacing.Medium))
            .background(color = MaterialTheme.colorScheme.surfaceVariant)
            .padding(contentPadding)
            .clipToBounds(),
        verticalArrangement = verticalArrangement,
        horizontalAlignment = horizontalAlignment,
        content = content,
    )
}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun Preview_SBBContentBox() {
    SBBTheme {
        Surface {
            Box(modifier = Modifier.padding(16.dp)) {
                SBBContentBox {
                    Text(
                        text = "Preview",
                        style = SBBTheme.materialTypography.bodyMedium,
                    )
                }
            }
        }
    }
}