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

public val SBBIcons.UserHeadsetMedium: ImageVector
    get() {
        if (_userHeadsetMedium != null) {
            return _userHeadsetMedium!!
        }
        _userHeadsetMedium = Builder(name = "UserHeadsetMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(25.06f, 12.25f)
                horizontalLineToRelative(0.44f)
                curveToRelative(0.369f, 0.0f, 0.702f, 0.12f, 0.938f, 0.38f)
                curveToRelative(0.23f, 0.25f, 0.312f, 0.571f, 0.312f, 0.87f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.352f, -0.116f, 0.678f, -0.364f, 0.916f)
                arcToRelative(1.26f, 1.26f, 0.0f, false, true, -0.886f, 0.334f)
                horizontalLineToRelative(-3.101f)
                quadToRelative(-0.301f, 0.64f, -0.73f, 1.175f)
                curveToRelative(4.578f, 2.39f, 6.58f, 7.31f, 6.58f, 11.825f)
                verticalLineToRelative(0.5f)
                lineTo(7.75f, 31.25f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -5.108f, 2.467f, -9.7f, 6.58f, -11.828f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -1.079f, -2.114f)
                verticalLineToRelative(0.942f)
                lineTo(10.5f, 17.75f)
                curveToRelative(-0.33f, 0.0f, -0.638f, -0.15f, -0.857f, -0.359f)
                arcToRelative(1.24f, 1.24f, 0.0f, false, true, -0.393f, -0.891f)
                verticalLineToRelative(-2.991f)
                curveToRelative(0.0f, -0.361f, 0.166f, -0.674f, 0.386f, -0.89f)
                curveToRelative(0.217f, -0.213f, 0.526f, -0.369f, 0.864f, -0.369f)
                horizontalLineToRelative(0.308f)
                curveToRelative(1.916f, -8.08f, 12.7f, -7.812f, 14.253f, 0.0f)
                moveToRelative(-1.022f, 0.0f)
                lineTo(22.75f, 12.25f)
                verticalLineToRelative(0.941f)
                curveToRelative(-0.643f, -2.26f, -2.468f, -3.941f, -4.75f, -3.941f)
                reflectiveCurveToRelative(-4.107f, 1.68f, -4.75f, 3.941f)
                verticalLineToRelative(-0.941f)
                horizontalLineToRelative(-1.41f)
                curveToRelative(1.807f, -6.773f, 10.731f, -6.453f, 12.198f, 0.0f)
                moveToRelative(-6.038f, -2.0f)
                curveToRelative(-2.166f, 0.0f, -4.0f, 2.038f, -4.0f, 4.75f)
                reflectiveCurveToRelative(1.834f, 4.75f, 4.0f, 4.75f)
                curveToRelative(1.334f, 0.0f, 2.542f, -0.773f, 3.273f, -2.0f)
                lineTo(18.0f, 17.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.726f)
                arcTo(5.6f, 5.6f, 0.0f, false, false, 22.0f, 15.0f)
                curveToRelative(0.0f, -2.712f, -1.834f, -4.75f, -4.0f, -4.75f)
                moveToRelative(0.0f, 10.5f)
                arcToRelative(4.55f, 4.55f, 0.0f, false, false, 2.934f, -1.076f)
                curveToRelative(4.182f, 2.035f, 6.161f, 6.376f, 6.307f, 10.576f)
                lineTo(8.758f, 30.25f)
                curveToRelative(0.158f, -4.711f, 2.552f, -8.78f, 6.306f, -10.578f)
                arcTo(4.55f, 4.55f, 0.0f, false, false, 18.0f, 20.75f)
                moveToRelative(-7.75f, -7.241f)
                curveToRelative(0.0f, -0.048f, 0.024f, -0.115f, 0.086f, -0.176f)
                arcToRelative(0.26f, 0.26f, 0.0f, false, true, 0.164f, -0.083f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(3.5f)
                lineTo(10.5f, 16.75f)
                arcToRelative(0.27f, 0.27f, 0.0f, false, true, -0.165f, -0.082f)
                arcToRelative(0.24f, 0.24f, 0.0f, false, true, -0.085f, -0.168f)
                close()
                moveTo(23.75f, 16.75f)
                horizontalLineToRelative(1.75f)
                curveToRelative(0.119f, 0.0f, 0.172f, -0.035f, 0.194f, -0.055f)
                curveToRelative(0.017f, -0.017f, 0.056f, -0.065f, 0.056f, -0.195f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.125f, -0.034f, -0.179f, -0.05f, -0.197f)
                curveToRelative(-0.01f, -0.01f, -0.051f, -0.053f, -0.2f, -0.053f)
                horizontalLineToRelative(-1.75f)
                close()
            }
        }
        .build()
        return _userHeadsetMedium!!
    }

private var _userHeadsetMedium: ImageVector? = null
