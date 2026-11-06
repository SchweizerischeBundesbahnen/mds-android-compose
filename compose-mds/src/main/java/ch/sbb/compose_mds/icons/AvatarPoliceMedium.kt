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

public val SBBIcons.AvatarPoliceMedium: ImageVector
    get() {
        if (_avatarPoliceMedium != null) {
            return _avatarPoliceMedium!!
        }
        _avatarPoliceMedium = Builder(name = "AvatarPoliceMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(17.25f, 6.23f)
                lineToRelative(0.137f, 0.04f)
                lineToRelative(10.5f, 3.0f)
                lineToRelative(0.502f, 0.143f)
                lineToRelative(-0.165f, 0.495f)
                lineToRelative(-1.5f, 4.5f)
                lineToRelative(-0.114f, 0.342f)
                horizontalLineToRelative(-1.993f)
                curveToRelative(-1.832f, 2.276f, -4.43f, 3.75f, -7.367f, 3.75f)
                reflectiveCurveToRelative(-5.536f, -1.474f, -7.368f, -3.75f)
                lineTo(7.89f, 14.75f)
                lineToRelative(-0.115f, -0.341f)
                lineToRelative(-1.5f, -4.5f)
                lineToRelative(-0.165f, -0.496f)
                lineToRelative(0.502f, -0.143f)
                lineToRelative(10.5f, -3.0f)
                close()
                moveTo(11.208f, 14.75f)
                curveToRelative(1.62f, 1.712f, 3.73f, 2.75f, 6.042f, 2.75f)
                reflectiveCurveToRelative(4.422f, -1.038f, 6.041f, -2.75f)
                close()
                moveTo(7.39f, 10.088f)
                lineTo(8.61f, 13.75f)
                horizontalLineToRelative(17.28f)
                lineToRelative(1.22f, -3.662f)
                lineToRelative(-9.86f, -2.818f)
                close()
                moveTo(17.25f, 10.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, false, 0.001f, 0.501f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.0f, -0.5f)
                moveTo(16.0f, 10.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 2.501f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, -2.5f, 0.0f)
                moveTo(25.92f, 23.5f)
                curveToRelative(-0.19f, 0.915f, -0.428f, 1.77f, -0.747f, 2.27f)
                lineToRelative(-0.002f, 0.003f)
                curveToRelative(-2.89f, 4.475f, -6.173f, 5.478f, -7.935f, 5.478f)
                curveToRelative(-1.76f, 0.0f, -5.042f, -1.003f, -7.933f, -5.478f)
                verticalLineToRelative(-0.001f)
                curveToRelative(-0.32f, -0.498f, -0.56f, -1.352f, -0.748f, -2.267f)
                curveToRelative(-0.194f, -0.94f, -0.351f, -2.03f, -0.473f, -3.059f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, true, -0.353f, -3.83f)
                lineToRelative(-0.004f, -0.062f)
                verticalLineToRelative(-0.017f)
                lineToRelative(-0.001f, -0.004f)
                verticalLineToRelative(-0.001f)
                lineToRelative(0.499f, -0.03f)
                lineToRelative(0.499f, -0.03f)
                verticalLineToRelative(0.004f)
                lineToRelative(0.001f, 0.015f)
                lineToRelative(0.004f, 0.061f)
                arcToRelative(49.0f, 49.0f, 0.0f, false, false, 0.08f, 1.085f)
                arcToRelative(75.0f, 75.0f, 0.0f, false, false, 0.268f, 2.691f)
                curveToRelative(0.12f, 1.016f, 0.273f, 2.074f, 0.459f, 2.975f)
                curveToRelative(0.191f, 0.926f, 0.403f, 1.606f, 0.61f, 1.927f)
                curveToRelative(2.727f, 4.224f, 5.709f, 5.021f, 7.092f, 5.021f)
                curveToRelative(1.385f, 0.0f, 4.367f, -0.797f, 7.095f, -5.02f)
                curveToRelative(0.207f, -0.325f, 0.418f, -1.008f, 0.61f, -1.933f)
                curveToRelative(0.185f, -0.902f, 0.338f, -1.96f, 0.459f, -2.975f)
                arcToRelative(74.0f, 74.0f, 0.0f, false, false, 0.347f, -3.771f)
                lineToRelative(0.004f, -0.06f)
                lineToRelative(0.001f, -0.016f)
                verticalLineToRelative(-0.005f)
                lineToRelative(0.5f, 0.03f)
                lineToRelative(0.498f, 0.03f)
                verticalLineToRelative(0.023f)
                lineToRelative(-0.005f, 0.063f)
                arcToRelative(55.0f, 55.0f, 0.0f, false, true, -0.081f, 1.1f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, true, -0.271f, 2.725f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, true, -0.473f, 3.058f)
                moveToRelative(-11.67f, -2.45f)
                arcToRelative(0.05f, 0.05f, 0.0f, false, false, 0.05f, -0.05f)
                arcToRelative(0.05f, 0.05f, 0.0f, false, false, -0.05f, -0.05f)
                arcToRelative(0.05f, 0.05f, 0.0f, false, false, -0.05f, 0.05f)
                curveToRelative(0.0f, 0.028f, 0.022f, 0.05f, 0.05f, 0.05f)
                moveTo(13.3f, 21.0f)
                arcTo(0.95f, 0.95f, 0.0f, true, true, 15.2f, 21.0f)
                arcToRelative(0.95f, 0.95f, 0.0f, false, true, -1.9f, 0.0f)
                moveToRelative(6.95f, 0.05f)
                arcToRelative(0.05f, 0.05f, 0.0f, false, false, 0.05f, -0.05f)
                arcToRelative(0.05f, 0.05f, 0.0f, false, false, -0.05f, -0.05f)
                arcToRelative(0.05f, 0.05f, 0.0f, false, false, -0.05f, 0.05f)
                curveToRelative(0.0f, 0.028f, 0.022f, 0.05f, 0.05f, 0.05f)
                moveTo(19.3f, 21.0f)
                arcTo(0.95f, 0.95f, 0.0f, true, true, 21.2f, 21.0f)
                arcToRelative(0.95f, 0.95f, 0.0f, false, true, -1.9f, 0.0f)
                moveToRelative(-2.05f, 4.75f)
                curveToRelative(1.516f, 0.0f, 2.787f, -0.535f, 3.462f, -1.262f)
                lineToRelative(0.733f, 0.68f)
                curveToRelative(-0.91f, 0.98f, -2.476f, 1.582f, -4.194f, 1.582f)
                curveToRelative(-1.618f, 0.0f, -3.095f, -0.533f, -4.021f, -1.406f)
                lineToRelative(0.686f, -0.728f)
                curveToRelative(0.702f, 0.663f, 1.914f, 1.134f, 3.335f, 1.134f)
            }
        }
        .build()
        return _avatarPoliceMedium!!
    }

private var _avatarPoliceMedium: ImageVector? = null
