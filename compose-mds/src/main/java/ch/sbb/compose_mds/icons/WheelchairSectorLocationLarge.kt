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

public val SBBIcons.WheelchairSectorLocationLarge: ImageVector
    get() {
        if (_wheelchairSectorLocationLarge != null) {
            return _wheelchairSectorLocationLarge!!
        }
        _wheelchairSectorLocationLarge = Builder(name = "WheelchairSectorLocationLarge",
                defaultWidth = 48.0.dp, defaultHeight = 48.0.dp, viewportWidth = 48.0f,
                viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.039f, 27.04f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-11.0f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(-12.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(10.939f, 22.4f)
                lineTo(11.165f, 22.846f)
                curveToRelative(-2.44f, 1.238f, -4.126f, 3.79f, -4.126f, 6.694f)
                curveToRelative(0.0f, 4.124f, 3.376f, 7.5f, 7.5f, 7.5f)
                curveToRelative(2.978f, 0.0f, 5.587f, -1.78f, 6.788f, -4.314f)
                lineToRelative(0.452f, 0.214f)
                lineToRelative(0.451f, 0.214f)
                curveToRelative(-1.359f, 2.866f, -4.31f, 4.886f, -7.691f, 4.886f)
                curveToRelative(-4.676f, 0.0f, -8.5f, -3.824f, -8.5f, -8.5f)
                curveToRelative(0.0f, -3.297f, 1.914f, -6.184f, 4.674f, -7.586f)
                close()
                moveTo(33.48f, 6.96f)
                arcTo(7.517f, 7.517f, 0.0f, false, true, 41.0f, 14.48f)
                verticalLineToRelative(0.008f)
                curveToRelative(-0.021f, 1.266f, -0.416f, 2.367f, -1.003f, 3.416f)
                lineToRelative(-0.014f, 0.024f)
                lineToRelative(-6.06f, 9.56f)
                lineToRelative(-0.422f, 0.666f)
                lineToRelative(-0.422f, -0.667f)
                lineToRelative(-6.06f, -9.56f)
                lineToRelative(-0.006f, -0.008f)
                curveToRelative(-0.617f, -1.02f, -1.009f, -2.123f, -1.052f, -3.422f)
                verticalLineToRelative(-0.018f)
                arcToRelative(7.516f, 7.516f, 0.0f, false, true, 7.52f, -7.519f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(6.516f, 6.516f, 0.0f, false, false, -6.52f, 6.503f)
                lineToRelative(0.028f, 0.406f)
                curveToRelative(0.095f, 0.93f, 0.406f, 1.746f, 0.881f, 2.532f)
                lineToRelative(5.632f, 8.885f)
                lineToRelative(5.632f, -8.885f)
                curveToRelative(0.526f, -0.944f, 0.848f, -1.876f, 0.868f, -2.921f)
                lineToRelative(-0.009f, -0.335f)
                arcTo(6.516f, 6.516f, 0.0f, false, false, 33.48f, 7.96f)
                moveToRelative(0.0f, 3.0f)
                curveToRelative(1.937f, 0.0f, 3.5f, 1.564f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.563f, 3.5f, -3.5f, 3.5f)
                arcToRelative(3.497f, 3.497f, 0.0f, false, true, -3.5f, -3.5f)
                curveToRelative(0.0f, -1.936f, 1.564f, -3.5f, 3.5f, -3.5f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(2.497f, 2.497f, 0.0f, false, false, -2.5f, 2.5f)
                curveToRelative(0.0f, 1.384f, 1.117f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.116f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.116f, -2.5f, -2.5f, -2.5f)
                moveToRelative(-18.941f, -0.92f)
                curveToRelative(0.836f, 0.0f, 1.5f, 0.664f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.664f, 1.5f, -1.5f, 1.5f)
                arcToRelative(1.49f, 1.49f, 0.0f, false, true, -1.5f, -1.5f)
                curveToRelative(0.0f, -0.836f, 0.664f, -1.5f, 1.5f, -1.5f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(0.49f, 0.49f, 0.0f, false, false, -0.5f, 0.5f)
                curveToRelative(0.0f, 0.284f, 0.216f, 0.5f, 0.5f, 0.5f)
                arcToRelative(0.49f, 0.49f, 0.0f, false, false, 0.5f, -0.5f)
                arcToRelative(0.49f, 0.49f, 0.0f, false, false, -0.5f, -0.5f)
            }
        }
        .build()
        return _wheelchairSectorLocationLarge!!
    }

private var _wheelchairSectorLocationLarge: ImageVector? = null
