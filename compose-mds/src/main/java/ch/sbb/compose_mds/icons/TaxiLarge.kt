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

public val SBBIcons.TaxiLarge: ImageVector
    get() {
        if (_taxiLarge != null) {
            return _taxiLarge!!
        }
        _taxiLarge = Builder(
            name = "TaxiLarge",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(27.0f, 13.0f)
                horizontalLineToRelative(4.5f)
                curveToRelative(1.774f, 0.0f, 3.178f, 0.412f, 4.133f, 1.367f)
                curveToRelative(0.954f, 0.955f, 1.367f, 2.359f, 1.367f, 4.133f)
                verticalLineToRelative(2.501f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(15.998f)
                horizontalLineToRelative(-6.998f)
                verticalLineToRelative(-0.5f)
                lineTo(30.0f, 34.0f)
                lineTo(17.0f, 34.0f)
                verticalLineToRelative(3.999f)
                horizontalLineToRelative(-7.0f)
                lineTo(10.0f, 22.001f)
                lineTo(7.0f, 22.001f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                lineTo(10.0f, 18.5f)
                curveToRelative(0.0f, -1.774f, 0.412f, -3.178f, 1.367f, -4.133f)
                reflectiveCurveTo(13.726f, 13.0f, 15.5f, 13.0f)
                lineTo(20.0f, 13.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(11.0f, 36.999f)
                horizontalLineToRelative(5.0f)
                lineTo(16.0f, 34.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(31.002f, 36.999f)
                lineTo(36.0f, 36.999f)
                lineTo(36.0f, 34.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(11.0f, 33.0f)
                horizontalLineToRelative(25.0f)
                verticalLineToRelative(-8.999f)
                lineTo(11.0f, 24.001f)
                close()
                moveTo(15.5f, 26.999f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(16.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(-16.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveToRelative(16.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveTo(15.5f, 14.0f)
                curveToRelative(-1.638f, 0.0f, -2.733f, 0.382f, -3.426f, 1.074f)
                curveTo(11.382f, 15.767f, 11.0f, 16.862f, 11.0f, 18.5f)
                verticalLineToRelative(4.501f)
                horizontalLineToRelative(13.028f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 8.944f, 0.0f)
                lineTo(36.0f, 23.001f)
                lineTo(36.0f, 18.5f)
                curveToRelative(0.0f, -1.638f, -0.382f, -2.733f, -1.074f, -3.426f)
                curveTo(34.233f, 14.382f, 33.138f, 14.0f, 31.5f, 14.0f)
                close()
                moveTo(28.5f, 20.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.464f, 3.001f)
                horizontalLineToRelative(6.928f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 28.5f, 20.0f)
                moveTo(21.0f, 13.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-5.0f)
                close()
            }
        }
            .build()
        return _taxiLarge!!
    }

private var _taxiLarge: ImageVector? = null
