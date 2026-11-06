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

public val SBBIcons.BusLarge: ImageVector
    get() {
        if (_busLarge != null) {
            return _busLarge!!
        }
        _busLarge = Builder(name = "BusLarge", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(33.5f, 7.0f)
                curveToRelative(1.774f, 0.0f, 3.178f, 0.412f, 4.133f, 1.367f)
                curveTo(38.587f, 9.322f, 39.0f, 10.726f, 39.0f, 12.5f)
                lineTo(39.0f, 19.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(19.999f)
                horizontalLineToRelative(-6.998f)
                lineTo(32.002f, 38.0f)
                lineTo(15.0f, 38.0f)
                verticalLineToRelative(3.999f)
                lineTo(8.0f, 41.999f)
                lineTo(8.0f, 22.0f)
                lineTo(6.0f, 22.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0.0f, -1.774f, 0.412f, -3.178f, 1.367f, -4.133f)
                reflectiveCurveTo(11.726f, 7.0f, 13.5f, 7.0f)
                close()
                moveTo(9.0f, 40.999f)
                horizontalLineToRelative(5.0f)
                lineTo(14.0f, 38.0f)
                lineTo(9.0f, 38.0f)
                close()
                moveTo(33.002f, 40.999f)
                lineTo(38.0f, 40.999f)
                lineTo(38.0f, 38.0f)
                horizontalLineToRelative(-4.998f)
                close()
                moveTo(9.0f, 37.0f)
                horizontalLineToRelative(29.0f)
                lineTo(38.0f, 24.001f)
                lineTo(9.0f, 24.001f)
                close()
                moveTo(13.5f, 30.999f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(20.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(-20.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveToRelative(20.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveTo(13.5f, 8.0f)
                curveToRelative(-1.638f, 0.0f, -2.733f, 0.382f, -3.426f, 1.074f)
                curveTo(9.382f, 9.766f, 9.0f, 10.862f, 9.0f, 12.5f)
                verticalLineToRelative(10.501f)
                horizontalLineToRelative(29.0f)
                lineTo(38.0f, 12.5f)
                curveToRelative(0.0f, -1.638f, -0.382f, -2.734f, -1.074f, -3.426f)
                reflectiveCurveTo(35.138f, 8.0f, 33.5f, 8.0f)
                close()
                moveTo(39.0f, 21.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(7.0f, 21.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.0f)
                lineTo(7.0f, 20.0f)
                close()
                moveTo(34.0f, 12.0f)
                lineTo(13.0f, 12.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(21.0f)
                close()
            }
        }
        .build()
        return _busLarge!!
    }

private var _busLarge: ImageVector? = null
