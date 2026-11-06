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

public val SBBIcons.ScooterProfileMedium: ImageVector
    get() {
        if (_scooterProfileMedium != null) {
            return _scooterProfileMedium!!
        }
        _scooterProfileMedium = Builder(name = "ScooterProfileMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(28.106f, 18.26f)
                arcToRelative(6.47f, 6.47f, 0.0f, false, true, 3.696f, 1.406f)
                lineToRelative(-0.624f, 0.782f)
                arcToRelative(5.47f, 5.47f, 0.0f, false, false, -3.428f, -1.198f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -5.5f, 5.499f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-9.035f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.465f, 3.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.465f, -3.0f)
                lineTo(3.264f, 25.249f)
                lineToRelative(-0.014f, -0.486f)
                curveToRelative(-0.08f, -2.802f, 1.148f, -5.148f, 2.653f, -6.795f)
                arcToRelative(10.4f, 10.4f, 0.0f, false, true, 2.373f, -1.945f)
                curveToRelative(0.779f, -0.455f, 1.557f, -0.742f, 2.201f, -0.772f)
                lineTo(15.1f, 15.251f)
                lineToRelative(-0.411f, 0.741f)
                lineToRelative(-0.003f, 0.005f)
                lineToRelative(-0.01f, 0.02f)
                lineToRelative(-0.044f, 0.083f)
                arcToRelative(13.534f, 13.534f, 0.0f, false, false, -0.658f, 1.578f)
                curveToRelative(-0.325f, 0.943f, -0.646f, 2.194f, -0.71f, 3.57f)
                horizontalLineToRelative(4.494f)
                lineToRelative(7.113f, -9.075f)
                lineToRelative(-1.222f, -3.423f)
                lineTo(21.0f, 8.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.352f)
                lineToRelative(0.119f, 0.332f)
                close()
                moveTo(25.268f, 13.287f)
                lineTo(18.394f, 22.057f)
                lineTo(18.244f, 22.249f)
                lineTo(12.25f, 22.249f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.718f, 0.391f, -3.275f, 0.777f, -4.396f)
                curveToRelative(0.15f, -0.436f, 0.301f, -0.809f, 0.43f, -1.103f)
                horizontalLineToRelative(-2.945f)
                curveToRelative(-0.416f, 0.023f, -1.027f, 0.224f, -1.73f, 0.636f)
                arcToRelative(9.4f, 9.4f, 0.0f, false, false, -2.14f, 1.756f)
                curveTo(5.355f, 20.05f, 4.323f, 21.98f, 4.25f, 24.25f)
                horizontalLineToRelative(17.018f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 5.785f, -5.962f)
                close()
                moveTo(7.3f, 25.249f)
                curveToRelative(0.232f, 1.14f, 1.241f, 2.0f, 2.45f, 2.0f)
                reflectiveCurveToRelative(2.218f, -0.86f, 2.45f, -2.0f)
                close()
                moveTo(27.75f, 22.249f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, false, 0.0f, 5.0f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, false, 0.0f, -5.0f)
                moveToRelative(-3.5f, 2.5f)
                arcToRelative(3.501f, 3.501f, 0.0f, false, true, 7.0f, 0.0f)
                arcToRelative(3.501f, 3.501f, 0.0f, false, true, -7.0f, 0.0f)
            }
        }
        .build()
        return _scooterProfileMedium!!
    }

private var _scooterProfileMedium: ImageVector? = null
