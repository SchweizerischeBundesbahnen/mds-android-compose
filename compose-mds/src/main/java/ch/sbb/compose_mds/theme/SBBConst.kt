package ch.sbb.compose_mds.theme

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource

object SBBConst {
    val DEFAULT_VERTICAL_PADDING = SBBSpacing.Medium
    val DEFAULT_HORIZONTAL_PADDING = SBBSpacing.XSmall
}

fun Modifier.defaultPadding() = this then Modifier.padding(
    horizontal = SBBConst.DEFAULT_HORIZONTAL_PADDING,
    vertical = SBBConst.DEFAULT_VERTICAL_PADDING,
)

fun Modifier.elementPadding() = this then Modifier.padding(
    horizontal = SBBSpacing.Medium,
    vertical = SBBSpacing.XSmall,
)

val Int.asImageVector
    @Composable get() = ImageVector.vectorResource(id = this)
