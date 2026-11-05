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
                moveTo(12.0f, 4.0f)
                curveTo(9.77f, 4.0f, 8.0f, 5.77f, 8.0f, 8.0f)
                reflectiveCurveToRelative(1.77f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.77f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.77f, -4.0f, -4.0f, -4.0f)
                moveTo(7.0f, 8.0f)
                curveToRelative(0.0f, -2.783f, 2.217f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.217f, 5.0f, 5.0f)
                arcToRelative(4.98f, 4.98f, 0.0f, false, true, -2.0f, 4.014f)
                verticalLineToRelative(6.993f)
                lineToRelative(-0.146f, 0.146f)
                lineToRelative(-2.5f, 2.5f)
                lineToRelative(-0.354f, 0.354f)
                lineToRelative(-0.354f, -0.354f)
                lineToRelative(-2.5f, -2.5f)
                lineTo(9.0f, 19.008f)
                verticalLineToRelative(-6.993f)
                arcTo(4.98f, 4.98f, 0.0f, false, true, 7.0f, 8.0f)
                moveToRelative(3.0f, 4.591f)
                verticalLineToRelative(6.002f)
                lineToRelative(2.0f, 2.0f)
                lineToRelative(2.0f, -2.0f)
                verticalLineTo(17.0f)
                horizontalLineToRelative(-2.007f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(14.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.409f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 12.0f, 13.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -2.0f, -0.409f)
                moveToRelative(2.005f, -5.59f)
                curveTo(11.416f, 7.0f, 11.0f, 7.42f, 11.0f, 7.976f)
                curveTo(11.0f, 8.553f, 11.436f, 9.0f, 12.005f, 9.0f)
                curveTo(12.57f, 9.0f, 13.0f, 8.558f, 13.0f, 7.977f)
                curveToRelative(0.0f, -0.56f, -0.41f, -0.977f, -0.995f, -0.977f)
                moveTo(10.0f, 7.976f)
                curveTo(10.0f, 6.851f, 10.882f, 6.0f, 12.005f, 6.0f)
                curveTo(13.132f, 6.0f, 14.0f, 6.855f, 14.0f, 7.977f)
                curveTo(14.0f, 9.08f, 13.152f, 10.0f, 12.005f, 10.0f)
                curveTo(10.862f, 10.0f, 10.0f, 9.083f, 10.0f, 7.977f)
            }
        }
        .build()
        return _keySmall!!
    }

private var _keySmall: ImageVector? = null
