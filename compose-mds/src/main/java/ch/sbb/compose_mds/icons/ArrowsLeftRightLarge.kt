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

public val SBBIcons.ArrowsLeftRightLarge: ImageVector
    get() {
        if (_arrowsLeftRightLarge != null) {
            return _arrowsLeftRightLarge!!
        }
        _arrowsLeftRightLarge = Builder(name = "ArrowsLeftRightLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(42.707f, 27.5f)
                lineToRelative(-7.354f, 7.353f)
                lineToRelative(-0.706f, -0.706f)
                lineToRelative(6.147f, -6.149f)
                lineToRelative(-23.294f, -0.001f)
                verticalLineToRelative(-1.0f)
                lineToRelative(23.291f, 0.001f)
                lineToRelative(-6.144f, -6.145f)
                lineToRelative(0.706f, -0.707f)
                close()
                moveTo(12.354f, 14.853f)
                lineTo(6.205f, 21.0f)
                lineToRelative(23.291f, 0.002f)
                verticalLineToRelative(1.0f)
                lineTo(6.208f, 22.0f)
                lineToRelative(6.146f, 6.145f)
                lineToRelative(-0.707f, 0.707f)
                lineTo(4.292f, 21.5f)
                lineToRelative(7.353f, -7.353f)
                close()
            }
        }
        .build()
        return _arrowsLeftRightLarge!!
    }

private var _arrowsLeftRightLarge: ImageVector? = null
