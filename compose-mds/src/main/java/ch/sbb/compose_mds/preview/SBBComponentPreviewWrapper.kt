package ch.sbb.compose_mds.preview

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import ch.sbb.compose_mds.theme.SBBTheme

@Composable
fun SBBComponentPreviewWrapper(
    config: ThemePreviewConfig,
    content: @Composable () -> Unit,
) {
    val darkTheme = isSystemInDarkTheme()
    SBBTheme(
        darkTheme = darkTheme,
        colorScheme = config.colorScheme(darkTheme),
        includeSurface = true,
        content = content,
    )
}