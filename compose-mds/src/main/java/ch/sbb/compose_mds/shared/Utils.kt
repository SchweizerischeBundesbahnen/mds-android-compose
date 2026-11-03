package ch.sbb.compose_mds.shared

import android.annotation.SuppressLint
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle

@Composable
fun ProvideForegroundStyle(
    foregroundColor: Color,
    textStyle: TextStyle? = null,
    content: @Composable () -> Unit,
) {
    CompositionLocalProvider(LocalContentColor provides foregroundColor) {
        ProvideTextStyle(
            value = (textStyle ?: TextStyle.Default).copy(color = foregroundColor),
            content = content,
        )
    }
}

@SuppressLint("ComposableNaming")
@Suppress("ktlint:standard:function-type-reference-spacing")
@Composable
fun (@Composable () -> Unit)?.applyForegroundStyle(
    color: Color,
    textStyle: TextStyle? = null,
) {
    val slot = this ?: return

    CompositionLocalProvider(LocalContentColor provides color) {
        ProvideTextStyle(
            value = (textStyle ?: TextStyle.Default).copy(color = color),
        ) {
            slot()
        }
    }
}
