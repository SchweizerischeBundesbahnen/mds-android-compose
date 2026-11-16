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

public val SBBIcons.CircleCrossSmall: ImageVector
    get() {
        if (_circleCrossSmall != null) {
            return _circleCrossSmall!!
        }
        _circleCrossSmall = Builder(name = "CircleCrossSmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.0f, 12.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -9.0f, -9.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -9.0f, 9.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 9.0f, 9.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 9.0f, -9.0f)
                moveToRelative(1.0f, 0.0f)
                curveToRelative(0.0f, 5.523f, -4.477f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveTo(2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.477f, 10.0f, 10.0f)
                moveToRelative(-10.0f, 0.707f)
                lineToRelative(-3.646f, 3.646f)
                lineToRelative(-0.708f, -0.707f)
                lineTo(11.293f, 12.0f)
                lineTo(7.646f, 8.353f)
                lineToRelative(0.708f, -0.707f)
                lineTo(12.0f, 11.293f)
                lineToRelative(3.646f, -3.647f)
                lineToRelative(0.707f, 0.707f)
                lineTo(12.708f, 12.0f)
                lineToRelative(3.646f, 3.646f)
                lineToRelative(-0.707f, 0.707f)
                close()
            }
        }
        .build()
        return _circleCrossSmall!!
    }

private var _circleCrossSmall: ImageVector? = null
