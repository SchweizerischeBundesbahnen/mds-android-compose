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

public val SBBIcons.BusSurroundingAreaSmall: ImageVector
    get() {
        if (_busSurroundingAreaSmall != null) {
            return _busSurroundingAreaSmall!!
        }
        _busSurroundingAreaSmall = Builder(name = "BusSurroundingAreaSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.0f, 6.0f)
                curveToRelative(0.0f, -0.785f, -0.183f, -1.256f, -0.464f, -1.536f)
                curveTo(17.256f, 4.184f, 16.785f, 4.0f, 16.0f, 4.0f)
                lineTo(8.0f, 4.0f)
                curveToRelative(-0.785f, 0.0f, -1.256f, 0.183f, -1.536f, 0.464f)
                curveTo(6.184f, 4.744f, 6.0f, 5.215f, 6.0f, 6.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(6.0f, 16.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(18.0f, 17.0f)
                horizontalLineToRelative(-1.999f)
                verticalLineToRelative(1.0f)
                lineTo(18.0f, 18.0f)
                close()
                moveTo(9.0f, 17.0f)
                horizontalLineToRelative(6.001f)
                verticalLineToRelative(2.0f)
                lineTo(19.0f, 19.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(1.0f)
                lineTo(20.0f, 8.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(19.0f, 6.0f)
                curveToRelative(0.0f, -0.921f, -0.214f, -1.7f, -0.757f, -2.243f)
                reflectiveCurveTo(16.921f, 3.0f, 16.0f, 3.0f)
                lineTo(8.0f, 3.0f)
                curveToRelative(-0.921f, 0.0f, -1.7f, 0.214f, -2.243f, 0.757f)
                reflectiveCurveTo(5.0f, 5.079f, 5.0f, 6.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(6.0f, 18.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(16.0f, 6.0f)
                lineTo(16.0f, 5.0f)
                lineTo(8.0f, 5.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(2.532f, 17.303f)
                curveTo(2.22f, 17.634f, 2.0f, 18.037f, 2.0f, 18.5f)
                curveToRelative(0.0f, 0.641f, 0.412f, 1.164f, 0.944f, 1.562f)
                curveToRelative(0.542f, 0.405f, 1.293f, 0.75f, 2.179f, 1.03f)
                curveTo(6.901f, 21.656f, 9.33f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveToRelative(5.1f, -0.344f, 6.877f, -0.908f)
                curveToRelative(0.886f, -0.28f, 1.637f, -0.625f, 2.179f, -1.03f)
                curveToRelative(0.532f, -0.398f, 0.944f, -0.92f, 0.944f, -1.562f)
                curveToRelative(0.0f, -0.463f, -0.218f, -0.866f, -0.532f, -1.197f)
                curveToRelative(-0.312f, -0.328f, -0.744f, -0.615f, -1.247f, -0.863f)
                lineToRelative(-0.442f, 0.896f)
                curveToRelative(0.444f, 0.219f, 0.762f, 0.443f, 0.963f, 0.656f)
                curveToRelative(0.2f, 0.21f, 0.258f, 0.379f, 0.258f, 0.508f)
                curveToRelative(0.0f, 0.18f, -0.117f, 0.443f, -0.543f, 0.761f)
                curveToRelative(-0.416f, 0.312f, -1.052f, 0.615f, -1.882f, 0.878f)
                curveToRelative(-1.655f, 0.525f, -3.977f, 0.86f, -6.575f, 0.86f)
                curveToRelative(-2.597f, 0.0f, -4.919f, -0.335f, -6.574f, -0.86f)
                curveToRelative(-0.83f, -0.263f, -1.466f, -0.566f, -1.883f, -0.878f)
                curveTo(3.117f, 18.943f, 3.0f, 18.68f, 3.0f, 18.5f)
                curveToRelative(0.0f, -0.129f, 0.058f, -0.299f, 0.258f, -0.51f)
                curveToRelative(0.201f, -0.212f, 0.52f, -0.435f, 0.964f, -0.655f)
                lineToRelative(-0.444f, -0.896f)
                curveToRelative(-0.503f, 0.249f, -0.934f, 0.536f, -1.246f, 0.864f)
                moveTo(8.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.002f, 2.002f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 13.0f)
                moveToRelative(7.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.002f, 0.002f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 14.0f)
            }
        }
        .build()
        return _busSurroundingAreaSmall!!
    }

private var _busSurroundingAreaSmall: ImageVector? = null
