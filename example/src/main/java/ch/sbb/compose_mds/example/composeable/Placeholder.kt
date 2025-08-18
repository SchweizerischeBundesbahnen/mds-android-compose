package ch.sbb.compose_mds.example.composeable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import ch.sbb.compose_mds.theme.PrimitiveColors

@Composable
fun Placeholder(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier.background(PrimitiveColors.pink),
        contentAlignment = Alignment.Center,
    ) {
        Text(text = "Placeholder", color = PrimitiveColors.white)
    }
}