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

public val SBBIcons.IdCardEmployeeLarge: ImageVector
    get() {
        if (_idCardEmployeeLarge != null) {
            return _idCardEmployeeLarge!!
        }
        _idCardEmployeeLarge = Builder(name = "IdCardEmployeeLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.5f, 7.0f)
                curveToRelative(1.934f, 0.0f, 3.5f, 1.566f, 3.5f, 3.5f)
                lineTo(27.0f, 13.0f)
                horizontalLineToRelative(11.5f)
                curveToRelative(2.484f, 0.0f, 4.5f, 2.016f, 4.5f, 4.5f)
                verticalLineToRelative(18.0f)
                curveToRelative(0.0f, 2.484f, -2.016f, 4.5f, -4.5f, 4.5f)
                horizontalLineToRelative(-30.0f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 4.0f, 35.5f)
                verticalLineToRelative(-18.0f)
                curveTo(4.0f, 15.016f, 6.016f, 13.0f, 8.5f, 13.0f)
                lineTo(20.0f, 13.0f)
                verticalLineToRelative(-2.5f)
                curveTo(20.0f, 8.566f, 21.566f, 7.0f, 23.5f, 7.0f)
                moveToRelative(-4.179f, 23.788f)
                curveTo(18.562f, 31.54f, 17.591f, 32.0f, 16.5f, 32.0f)
                reflectiveCurveToRelative(-2.063f, -0.46f, -2.822f, -1.212f)
                curveTo(11.299f, 32.152f, 9.49f, 35.218f, 9.103f, 39.0f)
                horizontalLineToRelative(14.795f)
                curveToRelative(-0.39f, -3.782f, -2.198f, -6.848f, -4.577f, -8.212f)
                moveTo(8.5f, 14.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 5.0f, 17.5f)
                verticalLineToRelative(18.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.1f, 3.476f)
                curveToRelative(0.389f, -3.966f, 2.26f, -7.356f, 4.933f, -8.97f)
                curveTo(12.382f, 29.04f, 12.0f, 27.807f, 12.0f, 26.5f)
                curveToRelative(0.0f, -2.928f, 1.918f, -5.5f, 4.5f, -5.5f)
                reflectiveCurveToRelative(4.5f, 2.572f, 4.5f, 5.5f)
                curveToRelative(0.0f, 1.306f, -0.383f, 2.54f, -1.034f, 3.507f)
                curveToRelative(2.678f, 1.616f, 4.552f, 5.016f, 4.935f, 8.993f)
                lineTo(38.5f, 39.0f)
                curveToRelative(1.932f, 0.0f, 3.5f, -1.568f, 3.5f, -3.5f)
                verticalLineToRelative(-18.0f)
                curveToRelative(0.0f, -1.932f, -1.568f, -3.5f, -3.5f, -3.5f)
                lineTo(27.0f, 14.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(16.5f, 22.0f)
                curveToRelative(-1.834f, 0.0f, -3.5f, 1.904f, -3.5f, 4.5f)
                reflectiveCurveToRelative(1.666f, 4.5f, 3.5f, 4.5f)
                reflectiveCurveToRelative(3.5f, -1.904f, 3.5f, -4.5f)
                reflectiveCurveToRelative(-1.666f, -4.5f, -3.5f, -4.5f)
                moveTo(38.0f, 30.0f)
                lineTo(25.0f, 30.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(13.0f)
                close()
                moveTo(34.0f, 26.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(23.5f, 8.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.5f, 2.5f)
                lineTo(21.0f, 15.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-4.5f)
                curveTo(26.0f, 9.118f, 24.882f, 8.0f, 23.5f, 8.0f)
            }
        }
        .build()
        return _idCardEmployeeLarge!!
    }

private var _idCardEmployeeLarge: ImageVector? = null
