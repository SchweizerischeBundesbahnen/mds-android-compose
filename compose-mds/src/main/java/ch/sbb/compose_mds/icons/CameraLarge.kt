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

public val SBBIcons.CameraLarge: ImageVector
    get() {
        if (_cameraLarge != null) {
            return _cameraLarge!!
        }
        _cameraLarge = Builder(name = "CameraLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.5f, 7.0f)
                horizontalLineToRelative(-0.234f)
                lineToRelative(-0.15f, 0.18f)
                lineToRelative(-4.85f, 5.82f)
                lineTo(11.0f, 13.0f)
                verticalLineToRelative(-3.0f)
                lineTo(2.0f, 10.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(44.0f)
                lineTo(46.0f, 13.0f)
                lineTo(34.734f, 13.0f)
                lineToRelative(-4.85f, -5.82f)
                lineToRelative(-0.15f, -0.18f)
                lineTo(19.5f, 7.0f)
                moveToRelative(13.932f, 6.0f)
                lineToRelative(-4.166f, -5.0f)
                horizontalLineToRelative(-9.532f)
                lineToRelative(-4.167f, 5.0f)
                close()
                moveTo(10.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                lineTo(3.0f, 11.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(3.0f, 14.0f)
                verticalLineToRelative(27.0f)
                horizontalLineToRelative(42.0f)
                lineTo(45.0f, 14.0f)
                close()
                moveTo(24.5f, 17.0f)
                curveTo(18.701f, 17.0f, 14.0f, 21.701f, 14.0f, 27.5f)
                reflectiveCurveTo(18.701f, 38.0f, 24.5f, 38.0f)
                reflectiveCurveTo(35.0f, 33.299f, 35.0f, 27.5f)
                reflectiveCurveTo(30.299f, 17.0f, 24.5f, 17.0f)
                moveTo(13.0f, 27.5f)
                curveTo(13.0f, 21.149f, 18.149f, 16.0f, 24.5f, 16.0f)
                reflectiveCurveTo(36.0f, 21.149f, 36.0f, 27.5f)
                reflectiveCurveTo(30.851f, 39.0f, 24.5f, 39.0f)
                reflectiveCurveTo(13.0f, 33.851f, 13.0f, 27.5f)
                moveToRelative(4.0f, 0.0f)
                arcToRelative(7.5f, 7.5f, 0.0f, true, true, 15.0f, 0.0f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, -15.0f, 0.0f)
                moveToRelative(7.5f, -8.5f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, false, 0.0f, 17.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 0.0f, -17.0f)
                moveToRelative(5.5f, 8.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -5.5f, -5.5f)
                verticalLineToRelative(-1.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 6.5f, 6.5f)
                close()
                moveTo(35.0f, 15.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-4.0f)
                moveToRelative(1.0f, 3.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-6.0f)
                close()
            }
        }
        .build()
        return _cameraLarge!!
    }

private var _cameraLarge: ImageVector? = null
