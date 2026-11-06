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

public val SBBIcons.CirclePenSmall: ImageVector
    get() {
        if (_circlePenSmall != null) {
            return _circlePenSmall!!
        }
        _circlePenSmall = Builder(name = "CirclePenSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 3.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -9.0f, 9.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 9.0f, 9.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 9.0f, -9.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -9.0f, -9.0f)
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveTo(2.0f, 17.523f, 2.0f, 12.0f)
                moveToRelative(13.0f, -5.997f)
                lineToRelative(0.353f, 0.353f)
                lineToRelative(2.29f, 2.28f)
                lineToRelative(0.354f, 0.353f)
                lineToRelative(-0.353f, 0.355f)
                lineToRelative(-1.647f, 1.655f)
                lineToRelative(-0.17f, 0.17f)
                lineToRelative(-0.183f, 0.184f)
                lineToRelative(-5.5f, 5.5f)
                lineToRelative(-0.147f, 0.147f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(-2.997f)
                lineToRelative(0.146f, -0.146f)
                lineToRelative(5.5f, -5.5f)
                lineToRelative(2.0f, -2.0f)
                close()
                moveTo(13.706f, 8.71f)
                lineToRelative(1.582f, 1.582f)
                lineToRelative(1.294f, -1.3f)
                lineToRelative(-1.582f, -1.576f)
                close()
                moveTo(8.0f, 14.417f)
                lineToRelative(5.0f, -5.0f)
                lineTo(14.583f, 11.0f)
                lineToRelative(-5.0f, 5.001f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _circlePenSmall!!
    }

private var _circlePenSmall: ImageVector? = null
