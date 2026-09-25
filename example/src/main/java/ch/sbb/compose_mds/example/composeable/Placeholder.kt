package ch.sbb.compose_mds.example.composeable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import ch.sbb.compose_mds.theme.SBBColors

@Composable
fun Placeholder(modifier: Modifier = Modifier) {
  Box(
      modifier = modifier.background(SBBColors.pink),
      contentAlignment = Alignment.Center,
  ) {
      Text(text = "Placeholder", color = SBBColors.white)
  }
}
