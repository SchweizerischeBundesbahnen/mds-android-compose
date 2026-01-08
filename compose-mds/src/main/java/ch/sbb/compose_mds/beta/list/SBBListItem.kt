package ch.sbb.compose_mds.beta.list

import SBBTheme
import android.content.res.Configuration
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.beta.ExperimentalSBBComponent
import ch.sbb.compose_mds.sbbicons.SBBIcons
import ch.sbb.compose_mds.sbbicons.Small
import ch.sbb.compose_mds.sbbicons.small.AppIconSmall
import ch.sbb.compose_mds.theme.elementPadding

@ExperimentalSBBComponent
@Composable
fun SBBListItem(
    modifier: Modifier = Modifier,
    title: String,
    textStyle: TextStyle = MaterialTheme.typography.bodyMedium,
    trailingIcon: ImageVector?,
    onClick: (() -> Unit)? = null,
    isLastElement: Boolean = false,
) {
    Column(
        modifier = Modifier
            .clickable(
                enabled = onClick != null,
                onClick = { onClick?.let { it() } },
            ),
    ) {
        Row(
            modifier = modifier
                .defaultMinSize(minHeight = 44.dp)
                .elementPadding()
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = title, style = textStyle)
            if (trailingIcon != null) {
                Icon(
                    imageVector = trailingIcon,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.onSurface
                )
            }
        }
        if (!isLastElement) HorizontalDivider()
    }
}


@OptIn(ExperimentalSBBComponent::class)
@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun SBBListItemPreview() {
    SBBTheme {
        SBBListItem(
            title = "test", trailingIcon = SBBIcons.Small.AppIconSmall
        )
    }
}