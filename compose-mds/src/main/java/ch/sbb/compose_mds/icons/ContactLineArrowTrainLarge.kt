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

public val SBBIcons.ContactLineArrowTrainLarge: ImageVector
    get() {
        if (_contactLineArrowTrainLarge != null) {
            return _contactLineArrowTrainLarge!!
        }
        _contactLineArrowTrainLarge = Builder(name = "ContactLineArrowTrainLarge", defaultWidth =
                48.0.dp, defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight =
                48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(28.401f, 10.5f)
                lineToRelative(-6.75f, 4.5f)
                horizontalLineToRelative(7.916f)
                curveToRelative(4.744f, 0.0f, 8.73f, 3.034f, 10.2f, 7.23f)
                lineToRelative(4.83f, 13.172f)
                curveToRelative(0.246f, 0.506f, 0.403f, 1.074f, 0.403f, 1.689f)
                curveTo(45.0f, 39.255f, 43.228f, 41.0f, 41.054f, 41.0f)
                horizontalLineToRelative(-5.077f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -2.317f, 4.0f)
                lineTo(46.0f, 45.0f)
                verticalLineToRelative(1.0f)
                lineTo(2.0f, 46.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.34f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -2.317f, -4.0f)
                lineTo(2.0f, 41.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(39.054f)
                curveTo(42.686f, 40.0f, 44.0f, 38.692f, 44.0f, 37.09f)
                curveToRelative(0.0f, -0.453f, -0.117f, -0.882f, -0.315f, -1.278f)
                lineToRelative(-0.012f, -0.025f)
                lineToRelative(-0.009f, -0.026f)
                lineToRelative(0.469f, -0.172f)
                lineToRelative(0.002f, -0.002f)
                lineToRelative(-0.47f, 0.174f)
                lineTo(42.284f, 32.0f)
                lineTo(28.0f, 32.0f)
                lineTo(28.0f, 22.0f)
                horizontalLineToRelative(10.606f)
                arcToRelative(9.79f, 9.79f, 0.0f, false, false, -9.039f, -6.0f)
                lineTo(17.0f, 16.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.849f)
                lineToRelative(6.75f, -4.5f)
                lineToRelative(-6.876f, -4.584f)
                lineToRelative(0.554f, -0.832f)
                close()
                moveTo(6.028f, 41.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 8.944f, 0.0f)
                close()
                moveTo(15.977f, 41.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -2.317f, 4.0f)
                horizontalLineToRelative(13.68f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -2.317f, -4.0f)
                close()
                moveTo(26.028f, 41.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 8.944f, 0.0f)
                close()
                moveTo(29.0f, 31.0f)
                horizontalLineToRelative(12.918f)
                lineToRelative(-2.933f, -8.0f)
                lineTo(29.0f, 23.0f)
                close()
                moveTo(15.854f, 12.647f)
                lineToRelative(-0.707f, 0.707f)
                lineTo(10.0f, 8.207f)
                lineTo(10.0f, 22.0f)
                lineTo(9.0f, 22.0f)
                lineTo(9.0f, 8.207f)
                lineToRelative(-5.146f, 5.147f)
                lineToRelative(-0.708f, -0.707f)
                lineTo(9.5f, 6.292f)
                close()
                moveTo(46.0f, 3.0f)
                lineTo(2.0f, 3.0f)
                lineTo(2.0f, 2.0f)
                horizontalLineToRelative(44.0f)
                close()
            }
        }
        .build()
        return _contactLineArrowTrainLarge!!
    }

private var _contactLineArrowTrainLarge: ImageVector? = null
