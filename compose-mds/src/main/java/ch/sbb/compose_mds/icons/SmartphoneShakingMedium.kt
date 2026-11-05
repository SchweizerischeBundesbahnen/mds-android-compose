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

public val SBBIcons.SmartphoneShakingMedium: ImageVector
    get() {
        if (_smartphoneShakingMedium != null) {
            return _smartphoneShakingMedium!!
        }
        _smartphoneShakingMedium = Builder(
            name = "SmartphoneShakingMedium",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
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
                moveToRelative(7.827f, 5.926f)
                lineToRelative(1.602f, -2.67f)
                lineToRelative(-0.857f, -0.514f)
                lineToRelative(-2.25f, 3.75f)
                lineToRelative(-0.258f, 0.43f)
                lineToRelative(0.43f, 0.256f)
                lineToRelative(3.75f, 2.25f)
                lineToRelative(0.514f, -0.857f)
                lineToRelative(-2.76f, -1.656f)
                curveToRelative(2.942f, -0.778f, 6.064f, -1.165f, 9.252f, -1.165f)
                curveToRelative(3.168f, 0.0f, 6.315f, 0.395f, 9.25f, 1.167f)
                lineTo(23.743f, 8.57f)
                lineToRelative(0.515f, 0.857f)
                lineToRelative(3.75f, -2.25f)
                lineToRelative(0.428f, -0.257f)
                lineToRelative(-0.257f, -0.429f)
                lineToRelative(-2.25f, -3.75f)
                lineToRelative(-0.857f, 0.515f)
                lineToRelative(1.603f, 2.672f)
                curveToRelative(-3.0f, -0.781f, -6.205f, -1.18f, -9.425f, -1.18f)
                curveToRelative(-3.238f, 0.0f, -6.417f, 0.39f, -9.423f, 1.177f)
                moveToRelative(2.924f, 6.82f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineToRelative(9.0f, 0.002f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-9.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                close()
                moveTo(12.751f, 11.745f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(18.002f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
                moveTo(19.501f, 12.247f)
                verticalLineToRelative(1.0f)
                lineTo(15.0f, 13.247f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(8.828f, 11.694f)
                lineTo(4.54f, 13.267f)
                lineToRelative(0.171f, 0.47f)
                lineToRelative(-0.172f, -0.47f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.194f, 2.564f)
                verticalLineToRelative(0.003f)
                lineToRelative(5.188f, 13.965f)
                lineToRelative(0.937f, -0.348f)
                lineToRelative(-5.186f, -13.962f)
                verticalLineToRelative(-0.002f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.598f, -1.28f)
                horizontalLineToRelative(0.001f)
                lineToRelative(4.29f, -1.573f)
                close()
                moveTo(29.87f, 13.266f)
                lineTo(25.58f, 11.694f)
                lineTo(25.237f, 12.634f)
                lineTo(29.527f, 14.205f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.599f, 1.281f)
                verticalLineToRelative(0.002f)
                lineTo(24.94f, 29.45f)
                lineToRelative(0.937f, 0.348f)
                lineToRelative(5.187f, -13.965f)
                lineToRelative(0.001f, -0.003f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.195f, -2.564f)
                lineToRelative(-0.171f, 0.47f)
                close()
            }
        }
            .build()
        return _smartphoneShakingMedium!!
    }

private var _smartphoneShakingMedium: ImageVector? = null
