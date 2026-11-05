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
        _sunriseMedium = Builder(
            name = "SunriseMedium",
            defaultWidth = 36.0.dp,
            defaultHeight =
                36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveTo(18.25f, 10.5f)
                lineTo(18.25f, 6.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.5f)
                close()
                moveTo(9.304f, 9.879f)
                lineTo(12.706f, 13.266f)
                lineTo(13.412f, 12.557f)
                lineTo(10.01f, 9.17f)
                close()
                moveTo(18.75f, 13.25f)
                curveToRelative(-3.05f, 0.0f, -5.5f, 2.45f, -5.5f, 5.5f)
                curveToRelative(0.0f, 1.29f, 0.392f, 2.531f, 1.096f, 3.445f)
                lineToRelative(-0.793f, 0.61f)
                curveToRelative(-0.856f, -1.111f, -1.303f, -2.575f, -1.303f, -4.055f)
                curveToRelative(0.0f, -3.602f, 2.898f, -6.5f, 6.5f, -6.5f)
                curveToRelative(3.603f, 0.0f, 6.5f, 2.898f, 6.5f, 6.5f)
                curveToRelative(0.0f, 1.546f, -0.58f, 2.954f, -1.46f, 4.057f)
                lineToRelative(-0.781f, -0.623f)
                curveToRelative(0.756f, -0.95f, 1.24f, -2.142f, 1.24f, -3.434f)
                curveToRelative(0.0f, -3.05f, -2.449f, -5.5f, -5.5f, -5.5f)
                moveToRelative(-8.25f, 6.0f)
                lineTo(6.0f, 19.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.5f)
                close()
                moveTo(27.626f, 9.309f)
                lineTo(24.227f, 12.685f)
                lineTo(24.932f, 13.395f)
                lineTo(28.332f, 10.018f)
                close()
                moveTo(27.0f, 18.25f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(1.0f)
                lineTo(27.0f, 19.25f)
                close()
                moveTo(7.5f, 25.25f)
                horizontalLineToRelative(20.99f)
                verticalLineToRelative(-1.0f)
                lineTo(7.5f, 24.25f)
                close()
            }
        }
            .build()
        return _sunriseMedium!!
    }

private var _sunriseMedium: ImageVector? = null
