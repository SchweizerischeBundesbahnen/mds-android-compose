package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.ArrowsLeftRightDownUpSmall: ImageVector
    get() {
        if (_arrowsLeftRightDownUpSmall != null) {
            return _arrowsLeftRightDownUpSmall!!
        }
        _arrowsLeftRightDownUpSmall = Builder(name = "ArrowsLeftRightDownUpSmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(15.708f, 6.292f)
                lineToRelative(-3.853f, -3.894f)
                lineToRelative(-0.356f, -0.36f)
                lineToRelative(-0.355f, 0.36f)
                lineTo(7.3f, 6.295f)
                lineToRelative(0.713f, 0.702f)
                lineTo(11.0f, 3.968f)
                verticalLineToRelative(7.033f)
                lineTo(3.957f, 11.001f)
                lineToRelative(2.646f, -2.647f)
                lineToRelative(-0.707f, -0.708f)
                lineTo(2.043f, 11.5f)
                lineToRelative(3.853f, 3.854f)
                lineToRelative(0.707f, -0.707f)
                lineTo(3.957f, 12.0f)
                lineTo(11.0f, 12.0f)
                verticalLineToRelative(7.03f)
                lineToRelative(-2.995f, -3.026f)
                lineToRelative(-0.711f, 0.703f)
                lineToRelative(3.853f, 3.895f)
                lineToRelative(0.356f, 0.359f)
                lineToRelative(0.355f, -0.36f)
                lineToRelative(3.842f, -3.898f)
                lineToRelative(-0.712f, -0.701f)
                lineTo(12.0f, 19.032f)
                verticalLineToRelative(-7.03f)
                horizontalLineToRelative(7.041f)
                lineToRelative(-2.645f, 2.644f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(3.854f, -3.853f)
                lineToRelative(-3.854f, -3.854f)
                lineToRelative(-0.707f, 0.708f)
                lineToRelative(2.649f, 2.648f)
                lineTo(12.0f, 11.002f)
                lineTo(12.0f, 3.965f)
                lineToRelative(2.997f, 3.03f)
                close()
                moveTo(11.858f, 20.601f)
                lineTo(11.502f, 20.25f)
                close()
                moveTo(11.148f, 20.601f)
                lineTo(11.501f, 20.25f)
                close()
            }
        }
        .build()
        return _arrowsLeftRightDownUpSmall!!
    }

private var _arrowsLeftRightDownUpSmall: ImageVector? = null
