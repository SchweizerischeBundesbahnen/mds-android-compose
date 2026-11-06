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

public val SBBIcons.AvatarPoliceSmall: ImageVector
    get() {
        if (_avatarPoliceSmall != null) {
            return _avatarPoliceSmall!!
        }
        _avatarPoliceSmall = Builder(name = "AvatarPoliceSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(11.5f, 3.98f)
                lineToRelative(0.137f, 0.04f)
                lineToRelative(7.0f, 2.0f)
                lineToRelative(0.502f, 0.143f)
                lineToRelative(-0.165f, 0.495f)
                lineToRelative(-1.0f, 3.0f)
                lineToRelative(-0.114f, 0.342f)
                horizontalLineToRelative(-1.37f)
                curveToRelative(-1.244f, 1.514f, -3.0f, 2.5f, -4.99f, 2.5f)
                reflectiveCurveToRelative(-3.747f, -0.986f, -4.991f, -2.5f)
                horizontalLineToRelative(-1.37f)
                lineToRelative(-0.114f, -0.342f)
                lineToRelative(-1.0f, -3.0f)
                lineToRelative(-0.165f, -0.495f)
                lineToRelative(0.502f, -0.144f)
                lineToRelative(7.0f, -2.0f)
                close()
                moveTo(5.86f, 9.0f)
                horizontalLineToRelative(11.28f)
                lineToRelative(0.72f, -2.162f)
                lineTo(11.5f, 5.02f)
                lineTo(5.14f, 6.838f)
                close()
                moveTo(7.876f, 10.0f)
                curveToRelative(1.01f, 0.944f, 2.265f, 1.5f, 3.624f, 1.5f)
                reflectiveCurveToRelative(2.614f, -0.556f, 3.624f, -1.5f)
                close()
                moveTo(10.5f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                moveToRelative(6.942f, 8.7f)
                curveToRelative(-0.125f, 0.608f, -0.289f, 1.207f, -0.52f, 1.57f)
                lineToRelative(-0.002f, 0.002f)
                curveTo(14.966f, 20.297f, 12.728f, 21.0f, 11.49f, 21.0f)
                curveToRelative(-1.236f, 0.0f, -3.474f, -0.703f, -5.429f, -3.729f)
                curveToRelative(-0.232f, -0.361f, -0.396f, -0.96f, -0.522f, -1.568f)
                arcToRelative(25.0f, 25.0f, 0.0f, false, true, -0.318f, -2.053f)
                arcToRelative(51.0f, 51.0f, 0.0f, false, true, -0.235f, -2.562f)
                lineToRelative(-0.003f, -0.042f)
                verticalLineToRelative(-0.015f)
                lineTo(5.48f, 11.0f)
                lineToRelative(0.5f, -0.031f)
                verticalLineToRelative(0.013f)
                lineToRelative(0.003f, 0.04f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 0.053f, 0.72f)
                curveToRelative(0.039f, 0.474f, 0.097f, 1.115f, 0.177f, 1.789f)
                curveToRelative(0.08f, 0.675f, 0.182f, 1.375f, 0.305f, 1.969f)
                curveToRelative(0.127f, 0.62f, 0.264f, 1.043f, 0.383f, 1.229f)
                curveTo(8.693f, 19.503f, 10.63f, 20.0f, 11.49f, 20.0f)
                curveToRelative(0.86f, 0.0f, 2.798f, -0.497f, 4.59f, -3.27f)
                curveToRelative(0.119f, -0.188f, 0.255f, -0.614f, 0.383f, -1.232f)
                curveToRelative(0.122f, -0.595f, 0.224f, -1.295f, 0.304f, -1.97f)
                arcToRelative(49.0f, 49.0f, 0.0f, false, false, 0.23f, -2.505f)
                lineToRelative(0.003f, -0.04f)
                lineToRelative(0.001f, -0.01f)
                verticalLineToRelative(-0.003f)
                lineToRelative(0.5f, 0.03f)
                lineToRelative(0.498f, 0.03f)
                verticalLineToRelative(0.015f)
                lineToRelative(-0.003f, 0.043f)
                lineToRelative(-0.011f, 0.16f)
                curveToRelative(-0.01f, 0.138f, -0.024f, 0.335f, -0.044f, 0.576f)
                curveToRelative(-0.04f, 0.48f, -0.099f, 1.133f, -0.181f, 1.823f)
                arcToRelative(25.0f, 25.0f, 0.0f, false, true, -0.318f, 2.053f)
                moveTo(9.5f, 14.2f)
                arcToRelative(0.2f, 0.2f, 0.0f, true, false, 0.0f, -0.4f)
                arcToRelative(0.2f, 0.2f, 0.0f, false, false, 0.0f, 0.4f)
                moveToRelative(-0.8f, -0.2f)
                arcToRelative(0.8f, 0.8f, 0.0f, true, true, 1.6f, 0.0f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, -1.6f, 0.0f)
                moveToRelative(4.8f, 0.2f)
                arcToRelative(0.2f, 0.2f, 0.0f, true, false, 0.0f, -0.4f)
                arcToRelative(0.2f, 0.2f, 0.0f, false, false, 0.0f, 0.4f)
                moveToRelative(-0.8f, -0.2f)
                arcToRelative(0.8f, 0.8f, 0.0f, true, true, 1.6f, 0.0f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, -1.6f, 0.0f)
                moveToRelative(-1.2f, 3.0f)
                curveToRelative(0.976f, 0.0f, 1.774f, -0.346f, 2.185f, -0.789f)
                lineToRelative(0.733f, 0.68f)
                curveTo(13.773f, 17.588f, 12.68f, 18.0f, 11.5f, 18.0f)
                curveToRelative(-1.112f, 0.0f, -2.14f, -0.366f, -2.795f, -0.984f)
                lineToRelative(0.686f, -0.727f)
                curveToRelative(0.43f, 0.406f, 1.194f, 0.71f, 2.109f, 0.71f)
            }
        }
        .build()
        return _avatarPoliceSmall!!
    }

private var _avatarPoliceSmall: ImageVector? = null
