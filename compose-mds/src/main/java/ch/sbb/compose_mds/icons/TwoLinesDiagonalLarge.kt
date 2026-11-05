package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.TwoLinesDiagonalLarge: ImageVector
    get() {
        if (_twoLinesDiagonalLarge != null) {
            return _twoLinesDiagonalLarge!!
        }
        _twoLinesDiagonalLarge = Builder(name = "TwoLinesDiagonalLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(29.854f, 18.854f)
                lineToRelative(-12.0f, 12.0f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(12.0f, -12.0f)
                close()
                moveTo(29.854f, 26.854f)
                lineTo(25.854f, 30.854f)
                lineTo(25.147f, 30.147f)
                lineTo(29.147f, 26.147f)
                close()
            }
        }
        .build()
        return _twoLinesDiagonalLarge!!
    }

private var _twoLinesDiagonalLarge: ImageVector? = null
