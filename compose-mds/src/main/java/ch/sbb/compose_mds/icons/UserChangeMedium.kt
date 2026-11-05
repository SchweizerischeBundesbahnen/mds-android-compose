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

public val SBBIcons.UserChangeMedium: ImageVector
    get() {
        if (_userChangeMedium != null) {
            return _userChangeMedium!!
        }
        _userChangeMedium = Builder(name = "UserChangeMedium", defaultWidth = 36.0.dp, defaultHeight
                = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.75f, 4.25f)
                curveToRelative(-1.335f, 0.0f, -2.5f, 1.396f, -2.5f, 3.25f)
                curveToRelative(0.0f, 0.646f, 0.144f, 1.253f, 0.398f, 1.762f)
                curveToRelative(0.458f, 0.926f, 1.235f, 1.488f, 2.102f, 1.488f)
                curveToRelative(0.868f, 0.0f, 1.643f, -0.563f, 2.102f, -1.49f)
                curveToRelative(0.252f, -0.51f, 0.398f, -1.117f, 0.398f, -1.76f)
                curveToRelative(0.0f, -1.854f, -1.165f, -3.25f, -2.5f, -3.25f)
                moveToRelative(2.541f, 6.184f)
                curveToRelative(-0.613f, 0.786f, -1.494f, 1.316f, -2.541f, 1.316f)
                curveToRelative(-1.042f, 0.0f, -1.922f, -0.525f, -2.535f, -1.307f)
                curveToRelative(-2.081f, 1.156f, -2.872f, 3.525f, -2.954f, 6.313f)
                horizontalLineToRelative(10.987f)
                curveToRelative(-0.083f, -2.797f, -0.884f, -5.166f, -2.957f, -6.322f)
                moveToRelative(-5.596f, -0.846f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 6.25f, 7.5f)
                curveToRelative(0.0f, -2.16f, 1.394f, -4.25f, 3.5f, -4.25f)
                reflectiveCurveToRelative(3.5f, 2.09f, 3.5f, 4.25f)
                curveToRelative(0.0f, 0.741f, -0.157f, 1.453f, -0.442f, 2.077f)
                curveToRelative(2.662f, 1.499f, 3.447f, 4.581f, 3.447f, 7.679f)
                verticalLineToRelative(0.5f)
                horizontalLineTo(3.254f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -3.083f, 0.77f, -6.168f, 3.44f, -7.668f)
                moveToRelative(17.944f, -3.03f)
                curveToRelative(1.405f, 1.877f, 2.2f, 4.479f, 2.16f, 7.649f)
                lineToRelative(2.85f, -2.81f)
                lineToRelative(0.702f, 0.712f)
                lineToRelative(-3.759f, 3.706f)
                lineToRelative(-0.351f, 0.347f)
                lineToRelative(-0.352f, -0.347f)
                lineToRelative(-3.74f, -3.697f)
                lineToRelative(0.702f, -0.712f)
                lineToRelative(2.947f, 2.912f)
                curveToRelative(0.059f, -3.057f, -0.697f, -5.474f, -1.96f, -7.162f)
                curveToRelative(-1.403f, -1.876f, -3.462f, -2.891f, -5.848f, -2.884f)
                lineToRelative(-0.004f, -1.0f)
                curveToRelative(2.696f, -0.008f, 5.056f, 1.15f, 6.653f, 3.285f)
                moveToRelative(1.61f, 12.692f)
                curveToRelative(-1.334f, 0.0f, -2.5f, 1.396f, -2.5f, 3.25f)
                curveToRelative(0.0f, 0.757f, 0.204f, 1.465f, 0.545f, 2.023f)
                curveToRelative(0.47f, 0.77f, 1.174f, 1.227f, 1.956f, 1.227f)
                reflectiveCurveToRelative(1.486f, -0.457f, 1.957f, -1.227f)
                curveToRelative(0.34f, -0.558f, 0.543f, -1.266f, 0.543f, -2.023f)
                curveToRelative(0.0f, -1.854f, -1.165f, -3.25f, -2.5f, -3.25f)
                moveToRelative(2.517f, 6.215f)
                curveToRelative(-0.611f, 0.768f, -1.485f, 1.285f, -2.516f, 1.285f)
                reflectiveCurveToRelative(-1.904f, -0.517f, -2.515f, -1.284f)
                curveToRelative(-1.833f, 1.312f, -2.852f, 3.752f, -2.97f, 6.289f)
                horizontalLineToRelative(10.98f)
                curveToRelative(-0.12f, -2.548f, -1.146f, -4.982f, -2.98f, -6.29f)
                moveToRelative(-5.557f, -0.852f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -0.46f, -2.113f)
                curveToRelative(0.0f, -2.16f, 1.395f, -4.25f, 3.5f, -4.25f)
                curveToRelative(2.107f, 0.0f, 3.5f, 2.09f, 3.5f, 4.25f)
                curveToRelative(0.0f, 0.754f, -0.162f, 1.48f, -0.458f, 2.112f)
                curveToRelative(2.34f, 1.63f, 3.465f, 4.698f, 3.465f, 7.643f)
                verticalLineToRelative(0.5f)
                horizontalLineTo(19.753f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -2.93f, 1.116f, -6.007f, 3.456f, -7.642f)
                moveTo(9.749f, 19.8f)
                lineToRelative(0.352f, 0.347f)
                lineToRelative(3.75f, 3.696f)
                lineToRelative(-0.702f, 0.712f)
                lineToRelative(-2.955f, -2.913f)
                curveToRelative(-0.06f, 3.061f, 0.696f, 5.495f, 1.96f, 7.197f)
                curveToRelative(1.405f, 1.894f, 3.464f, 2.922f, 5.847f, 2.914f)
                lineToRelative(0.004f, 1.0f)
                curveToRelative(-2.699f, 0.01f, -5.058f, -1.167f, -6.654f, -3.318f)
                curveToRelative(-1.404f, -1.89f, -2.197f, -4.505f, -2.16f, -7.678f)
                lineToRelative(-2.84f, 2.806f)
                lineToRelative(-0.702f, -0.711f)
                lineToRelative(3.75f, -3.705f)
                close()
            }
        }
        .build()
        return _userChangeMedium!!
    }

private var _userChangeMedium: ImageVector? = null
