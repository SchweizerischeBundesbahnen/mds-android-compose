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

public val SBBIcons.EiffelTowerLarge: ImageVector
    get() {
        if (_eiffelTowerLarge != null) {
            return _eiffelTowerLarge!!
        }
        _eiffelTowerLarge = Builder(name = "EiffelTowerLarge", defaultWidth = 48.0.dp, defaultHeight
                = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.013f, 3.0f)
                lineTo(26.0f, 3.0f)
                verticalLineToRelative(0.516f)
                lineToRelative(0.002f, 0.069f)
                lineToRelative(0.007f, 0.25f)
                arcToRelative(406.0f, 406.0f, 0.0f, false, false, 0.11f, 3.638f)
                curveToRelative(0.06f, 1.747f, 0.137f, 3.581f, 0.213f, 4.527f)
                lineTo(28.0f, 12.0f)
                verticalLineToRelative(4.0f)
                lineTo(26.87f, 16.0f)
                curveToRelative(0.457f, 3.107f, 1.08f, 7.001f, 1.835f, 11.0f)
                horizontalLineToRelative(2.73f)
                lineToRelative(-0.518f, 0.777f)
                lineToRelative(-1.616f, 2.424f)
                verticalLineToRelative(0.012f)
                lineToRelative(0.041f, 0.152f)
                curveToRelative(0.864f, 2.98f, 2.733f, 6.686f, 4.405f, 9.67f)
                arcToRelative(106.0f, 106.0f, 0.0f, false, false, 3.049f, 5.093f)
                lineToRelative(0.048f, 0.074f)
                lineToRelative(0.012f, 0.019f)
                lineToRelative(0.003f, 0.004f)
                verticalLineToRelative(0.002f)
                lineToRelative(-0.418f, 0.273f)
                lineToRelative(0.419f, -0.273f)
                lineToRelative(0.504f, 0.773f)
                horizontalLineToRelative(-8.382f)
                lineToRelative(-0.04f, -0.457f)
                arcToRelative(4.99f, 4.99f, 0.0f, false, false, -9.943f, 0.0f)
                lineTo(18.96f, 46.0f)
                horizontalLineToRelative(-8.413f)
                lineToRelative(0.543f, -0.785f)
                lineToRelative(0.411f, 0.285f)
                lineToRelative(-0.411f, -0.285f)
                lineToRelative(0.004f, -0.006f)
                lineToRelative(0.013f, -0.019f)
                lineToRelative(0.053f, -0.078f)
                lineToRelative(0.204f, -0.302f)
                arcToRelative(86.212f, 86.212f, 0.0f, false, false, 3.076f, -4.972f)
                curveToRelative(1.726f, -3.02f, 3.57f, -6.719f, 4.228f, -9.677f)
                lineToRelative(-1.584f, -2.384f)
                lineToRelative(-0.515f, -0.777f)
                horizontalLineToRelative(2.728f)
                arcToRelative(281.0f, 281.0f, 0.0f, false, false, 1.835f, -11.0f)
                horizontalLineToRelative(-1.13f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(1.667f)
                curveToRelative(0.077f, -0.952f, 0.153f, -2.802f, 0.214f, -4.557f)
                arcToRelative(463.0f, 463.0f, 0.0f, false, false, 0.11f, -3.629f)
                lineToRelative(0.006f, -0.242f)
                lineTo(22.0f, 3.51f)
                verticalLineToRelative(-0.021f)
                lineToRelative(0.5f, 0.012f)
                lineToRelative(-0.5f, -0.013f)
                close()
                moveTo(19.49f, 31.0f)
                curveToRelative(-0.418f, 1.581f, -1.111f, 3.307f, -1.91f, 5.0f)
                horizontalLineToRelative(2.559f)
                lineToRelative(1.666f, -5.0f)
                horizontalLineToRelative(-2.315f)
                moveToRelative(-2.395f, 6.0f)
                arcToRelative(67.0f, 67.0f, 0.0f, false, true, -1.788f, 3.334f)
                arcTo(87.0f, 87.0f, 0.0f, false, true, 12.438f, 45.0f)
                horizontalLineToRelative(5.62f)
                arcToRelative(5.99f, 5.99f, 0.0f, false, true, 11.823f, 0.0f)
                horizontalLineToRelative(5.648f)
                quadToRelative(-0.196f, -0.31f, -0.452f, -0.727f)
                arcToRelative(107.0f, 107.0f, 0.0f, false, true, -2.203f, -3.749f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 31.002f, 37.0f)
                close()
                moveTo(30.513f, 36.0f)
                curveToRelative(-0.813f, -1.702f, -1.54f, -3.43f, -2.026f, -5.0f)
                horizontalLineToRelative(-2.294f)
                lineToRelative(1.666f, 5.0f)
                close()
                moveTo(25.119f, 7.507f)
                curveToRelative(0.058f, 1.666f, 0.132f, 3.474f, 0.21f, 4.493f)
                horizontalLineToRelative(-2.658f)
                curveToRelative(0.079f, -1.025f, 0.152f, -2.849f, 0.21f, -4.523f)
                arcTo(468.0f, 468.0f, 0.0f, false, false, 22.987f, 4.0f)
                horizontalLineToRelative(2.026f)
                curveToRelative(0.018f, 0.706f, 0.056f, 2.069f, 0.106f, 3.507f)
                moveTo(22.142f, 16.0f)
                horizontalLineToRelative(3.716f)
                arcToRelative(284.0f, 284.0f, 0.0f, false, false, 1.828f, 11.0f)
                horizontalLineToRelative(-7.372f)
                arcToRelative(284.0f, 284.0f, 0.0f, false, false, 1.828f, -11.0f)
                moveToRelative(0.718f, 15.0f)
                lineToRelative(-1.666f, 5.0f)
                horizontalLineToRelative(5.612f)
                lineToRelative(-1.666f, -5.0f)
                close()
                moveTo(28.236f, 30.0f)
                lineTo(28.3f, 29.906f)
                verticalLineToRelative(-0.007f)
                lineToRelative(0.084f, -0.126f)
                lineTo(29.566f, 28.0f)
                lineTo(18.432f, 28.0f)
                lineToRelative(1.183f, 1.78f)
                lineToRelative(0.15f, 0.22f)
                close()
                moveTo(21.0f, 13.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _eiffelTowerLarge!!
    }

private var _eiffelTowerLarge: ImageVector? = null
