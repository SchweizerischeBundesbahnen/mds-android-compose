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

public val SBBIcons.SunriseMedium: ImageVector
    get() {
        if (_sunriseMedium != null) {
            return _sunriseMedium!!
        }
        _sunriseMedium = Builder(name = "SunriseMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.25f, 6.0f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-1.0f)
                lineTo(18.25f, 6.0f)
                close()
                moveTo(12.706f, 13.266f)
                lineTo(13.412f, 12.556f)
                lineTo(10.009f, 9.17f)
                lineTo(9.304f, 9.879f)
                close()
                moveTo(24.25f, 18.75f)
                curveToRelative(0.0f, -3.05f, -2.45f, -5.5f, -5.5f, -5.5f)
                reflectiveCurveToRelative(-5.5f, 2.45f, -5.5f, 5.5f)
                curveToRelative(0.0f, 1.29f, 0.391f, 2.532f, 1.095f, 3.445f)
                lineToRelative(-0.792f, 0.61f)
                curveToRelative(-0.856f, -1.111f, -1.303f, -2.575f, -1.303f, -4.055f)
                curveToRelative(0.0f, -3.602f, 2.898f, -6.5f, 6.5f, -6.5f)
                curveToRelative(3.603f, 0.0f, 6.5f, 2.898f, 6.5f, 6.5f)
                curveToRelative(0.0f, 1.546f, -0.58f, 2.954f, -1.46f, 4.057f)
                lineToRelative(-0.782f, -0.623f)
                curveToRelative(0.757f, -0.95f, 1.242f, -2.142f, 1.242f, -3.434f)
                moveToRelative(-13.75f, -0.5f)
                verticalLineToRelative(1.0f)
                lineTo(6.0f, 19.25f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(24.933f, 13.395f)
                lineTo(28.332f, 10.018f)
                lineTo(27.628f, 9.309f)
                lineTo(24.228f, 12.685f)
                close()
                moveTo(31.5f, 19.25f)
                lineTo(27.0f, 19.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.5f)
                close()
                moveTo(28.49f, 25.25f)
                verticalLineToRelative(-1.0f)
                lineTo(7.5f, 24.25f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _sunriseMedium!!
    }

private var _sunriseMedium: ImageVector? = null
