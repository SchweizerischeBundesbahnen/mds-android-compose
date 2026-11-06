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

public val SBBIcons.TrainProfileSignalLarge: ImageVector
    get() {
        if (_trainProfileSignalLarge != null) {
            return _trainProfileSignalLarge!!
        }
        _trainProfileSignalLarge = Builder(name = "TrainProfileSignalLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.277f, 5.084f)
                lineToRelative(8.124f, 5.416f)
                lineToRelative(-6.75f, 4.5f)
                horizontalLineToRelative(7.565f)
                curveToRelative(4.842f, 0.0f, 8.923f, 3.026f, 10.429f, 7.226f)
                lineToRelative(4.94f, 13.167f)
                curveToRelative(0.254f, 0.507f, 0.415f, 1.079f, 0.415f, 1.697f)
                curveToRelative(0.0f, 2.175f, -1.82f, 3.91f, -4.027f, 3.91f)
                horizontalLineToRelative(-4.996f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -2.317f, 4.0f)
                lineTo(46.0f, 45.0f)
                verticalLineToRelative(1.0f)
                lineTo(2.0f, 46.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.34f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -2.317f, -4.0f)
                lineTo(2.0f, 41.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(38.973f)
                curveTo(42.66f, 40.0f, 44.0f, 38.68f, 44.0f, 37.09f)
                arcToRelative(2.7f, 2.7f, 0.0f, false, false, -0.249f, -1.125f)
                lineToRelative(-0.071f, -0.15f)
                lineToRelative(-0.014f, -0.024f)
                lineToRelative(-0.01f, -0.028f)
                lineTo(42.244f, 32.0f)
                lineTo(28.0f, 32.0f)
                lineTo(28.0f, 22.0f)
                horizontalLineToRelative(10.478f)
                curveToRelative(-1.515f, -3.511f, -5.067f, -6.0f, -9.262f, -6.0f)
                lineTo(20.15f, 16.0f)
                lineToRelative(-0.151f, 0.1f)
                lineToRelative(-0.151f, -0.1f)
                lineTo(2.0f, 16.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(16.349f)
                lineToRelative(-6.75f, -4.5f)
                lineToRelative(8.124f, -5.416f)
                lineToRelative(0.277f, -0.185f)
                close()
                moveTo(6.028f, 40.999f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 8.944f, 0.0f)
                close()
                moveTo(15.977f, 40.999f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -2.317f, 4.0f)
                horizontalLineToRelative(13.68f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -2.317f, -4.0f)
                close()
                moveTo(26.028f, 40.999f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 8.944f, 0.0f)
                close()
                moveTo(8.36f, 23.847f)
                curveToRelative(-3.145f, 3.258f, -3.145f, 8.547f, 0.0f, 11.805f)
                lineToRelative(-0.718f, 0.695f)
                curveToRelative(-3.52f, -3.645f, -3.52f, -9.55f, 0.0f, -13.195f)
                close()
                moveTo(19.36f, 23.152f)
                curveToRelative(3.52f, 3.645f, 3.52f, 9.55f, 0.0f, 13.195f)
                lineToRelative(-0.718f, -0.695f)
                curveToRelative(3.145f, -3.258f, 3.145f, -8.547f, 0.0f, -11.805f)
                close()
                moveTo(11.11f, 26.847f)
                curveToRelative(-1.479f, 1.532f, -1.479f, 4.023f, 0.0f, 5.555f)
                lineToRelative(-0.718f, 0.695f)
                curveToRelative(-1.854f, -1.92f, -1.854f, -5.026f, 0.0f, -6.945f)
                close()
                moveTo(16.61f, 26.152f)
                curveToRelative(1.854f, 1.92f, 1.854f, 5.025f, 0.0f, 6.945f)
                lineToRelative(-0.718f, -0.695f)
                curveToRelative(1.479f, -1.532f, 1.479f, -4.023f, 0.0f, -5.555f)
                close()
                moveTo(29.0f, 31.0f)
                horizontalLineToRelative(12.868f)
                lineToRelative(-3.002f, -8.0f)
                lineTo(29.0f, 23.0f)
                close()
                moveTo(13.401f, 10.5f)
                lineTo(20.0f, 14.898f)
                lineToRelative(6.599f, -4.398f)
                lineTo(20.0f, 6.1f)
                close()
            }
        }
        .build()
        return _trainProfileSignalLarge!!
    }

private var _trainProfileSignalLarge: ImageVector? = null
