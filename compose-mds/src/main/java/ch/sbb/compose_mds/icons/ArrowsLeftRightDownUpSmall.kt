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
                moveToRelative(11.855f, 2.398f)
                lineToRelative(-0.356f, -0.36f)
                lineToRelative(-0.356f, 0.36f)
                lineToRelative(-3.842f, 3.897f)
                lineToRelative(0.712f, 0.702f)
                lineTo(11.0f, 3.97f)
                verticalLineTo(11.0f)
                horizontalLineTo(3.956f)
                lineToRelative(2.648f, -2.647f)
                lineToRelative(-0.708f, -0.708f)
                lineToRelative(-3.5f, 3.5f)
                lineToRelative(-0.353f, 0.354f)
                lineToRelative(0.353f, 0.354f)
                lineToRelative(3.5f, 3.5f)
                lineToRelative(0.708f, -0.708f)
                lineToRelative(-2.646f, -2.645f)
                horizontalLineTo(11.0f)
                verticalLineToRelative(7.03f)
                lineToRelative(-2.995f, -3.027f)
                lineToRelative(-0.711f, 0.703f)
                lineToRelative(3.853f, 3.894f)
                lineToRelative(0.356f, 0.36f)
                lineToRelative(0.355f, -0.36f)
                lineToRelative(3.842f, -3.898f)
                lineToRelative(-0.712f, -0.701f)
                lineTo(12.0f, 19.032f)
                verticalLineToRelative(-7.031f)
                horizontalLineToRelative(7.041f)
                lineToRelative(-2.645f, 2.645f)
                lineToRelative(0.707f, 0.708f)
                lineToRelative(3.5f, -3.5f)
                lineToRelative(0.354f, -0.354f)
                lineToRelative(-0.354f, -0.354f)
                lineToRelative(-3.5f, -3.5f)
                lineToRelative(-0.707f, 0.708f)
                lineTo(19.044f, 11.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(3.967f)
                lineToRelative(2.997f, 3.029f)
                lineToRelative(0.71f, -0.704f)
                close()
            }
        }
        .build()
        return _arrowsLeftRightDownUpSmall!!
    }

private var _arrowsLeftRightDownUpSmall: ImageVector? = null
