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

public val SBBIcons.AerosolCanLarge: ImageVector
    get() {
        if (_aerosolCanLarge != null) {
            return _aerosolCanLarge!!
        }
        _aerosolCanLarge = Builder(name = "AerosolCanLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(33.0f, 6.5f)
                curveTo(33.0f, 4.014f, 35.014f, 2.0f, 37.5f, 2.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 4.475f, 4.025f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 0.0f, 8.95f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 37.5f, 19.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -4.458f, -5.095f)
                lineToRelative(-16.628f, -2.912f)
                lineTo(16.0f, 10.92f)
                lineTo(16.0f, 9.055f)
                lineToRelative(0.442f, -0.052f)
                lineToRelative(16.592f, -1.937f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 33.0f, 6.5f)
                moveToRelative(8.672f, 1.69f)
                curveToRelative(0.151f, -0.364f, 0.251f, -0.755f, 0.298f, -1.159f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.0f, 6.938f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, -0.298f, -1.16f)
                lineToRelative(-0.924f, 0.382f)
                curveToRelative(0.164f, 0.397f, 0.252f, 0.842f, 0.252f, 1.309f)
                curveToRelative(0.0f, 1.934f, -1.566f, 3.5f, -3.5f, 3.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.5f, -3.5f)
                curveToRelative(0.0f, -0.301f, 0.043f, -0.59f, 0.115f, -0.879f)
                lineToRelative(0.13f, -0.52f)
                lineToRelative(-0.529f, -0.094f)
                lineTo(17.0f, 10.08f)
                verticalLineToRelative(-0.135f)
                lineToRelative(16.688f, -1.948f)
                lineToRelative(0.582f, -0.068f)
                lineToRelative(-0.159f, -0.564f)
                arcTo(3.499f, 3.499f, 0.0f, false, true, 37.5f, 3.0f)
                curveTo(39.434f, 3.0f, 41.0f, 4.566f, 41.0f, 6.5f)
                curveToRelative(0.0f, 0.467f, -0.088f, 0.912f, -0.252f, 1.31f)
                close()
                moveTo(15.0f, 8.5f)
                verticalLineToRelative(-0.64f)
                lineToRelative(-0.621f, 0.155f)
                lineToRelative(-4.0f, 1.0f)
                lineTo(10.0f, 9.11f)
                lineTo(10.0f, 12.0f)
                lineTo(9.0f, 12.0f)
                verticalLineToRelative(2.073f)
                arcTo(5.03f, 5.03f, 0.0f, false, false, 5.0f, 19.0f)
                lineTo(4.0f, 19.0f)
                verticalLineToRelative(27.0f)
                horizontalLineToRelative(17.0f)
                lineTo(21.0f, 19.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.42f, -1.715f, -4.46f, -4.0f, -4.927f)
                lineTo(16.0f, 12.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(14.0f, 12.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(11.0f, 9.89f)
                lineToRelative(3.0f, -0.75f)
                close()
                moveTo(19.0f, 19.0f)
                lineTo(6.0f, 19.0f)
                curveToRelative(0.0f, -2.056f, 1.545f, -3.766f, 3.529f, -4.0f)
                horizontalLineToRelative(5.943f)
                curveToRelative(1.983f, 0.234f, 3.528f, 1.944f, 3.528f, 4.0f)
                moveToRelative(-4.0f, -5.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(5.0f, 42.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(3.0f)
                lineTo(5.0f, 45.0f)
                close()
                moveTo(5.0f, 20.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(15.0f)
                lineTo(20.0f, 20.0f)
                close()
                moveTo(7.0f, 21.0f)
                verticalLineToRelative(19.0f)
                horizontalLineToRelative(1.0f)
                lineTo(8.0f, 21.0f)
                close()
                moveTo(10.0f, 17.0f)
                curveToRelative(-0.554f, 0.0f, -1.0f, 0.446f, -1.0f, 1.0f)
                lineTo(8.0f, 18.0f)
                curveToRelative(0.0f, -1.106f, 0.894f, -2.0f, 2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _aerosolCanLarge!!
    }

private var _aerosolCanLarge: ImageVector? = null
