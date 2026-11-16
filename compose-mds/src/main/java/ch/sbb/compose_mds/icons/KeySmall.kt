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

public val SBBIcons.KeySmall: ImageVector
    get() {
        if (_keySmall != null) {
            return _keySmall!!
        }
        _keySmall = Builder(name = "KeySmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.0f, 8.0f)
                curveToRelative(0.0f, -2.23f, -1.77f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveTo(8.0f, 5.77f, 8.0f, 8.0f)
                reflectiveCurveToRelative(1.77f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.77f, 4.0f, -4.0f)
                moveToRelative(-2.0f, 4.591f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 12.0f, 13.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -2.0f, -0.409f)
                verticalLineToRelative(6.002f)
                lineToRelative(2.0f, 2.0f)
                lineToRelative(2.0f, -2.0f)
                lineTo(14.0f, 17.0f)
                horizontalLineToRelative(-2.007f)
                verticalLineToRelative(-1.0f)
                lineTo(14.0f, 16.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(15.0f, 12.014f)
                curveToRelative(1.218f, -0.908f, 2.0f, -2.361f, 2.0f, -4.014f)
                curveToRelative(0.0f, -2.783f, -2.217f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveTo(7.0f, 5.217f, 7.0f, 8.0f)
                curveToRelative(0.0f, 1.653f, 0.782f, 3.106f, 2.0f, 4.014f)
                verticalLineToRelative(6.993f)
                lineToRelative(3.0f, 3.0f)
                lineToRelative(3.0f, -3.0f)
                close()
                moveTo(13.0f, 7.977f)
                curveToRelative(0.0f, -0.56f, -0.41f, -0.977f, -0.995f, -0.977f)
                curveToRelative(-0.589f, 0.0f, -1.005f, 0.421f, -1.005f, 0.977f)
                curveTo(11.0f, 8.553f, 11.436f, 9.0f, 12.005f, 9.0f)
                curveToRelative(0.564f, 0.0f, 0.995f, -0.443f, 0.995f, -1.023f)
                moveToRelative(1.0f, 0.0f)
                curveTo(14.0f, 9.078f, 13.152f, 10.0f, 12.005f, 10.0f)
                curveTo(10.862f, 10.0f, 10.0f, 9.083f, 10.0f, 7.977f)
                curveTo(10.0f, 6.85f, 10.882f, 6.0f, 12.005f, 6.0f)
                curveTo(13.132f, 6.0f, 14.0f, 6.855f, 14.0f, 7.977f)
            }
        }
        .build()
        return _keySmall!!
    }

private var _keySmall: ImageVector? = null
