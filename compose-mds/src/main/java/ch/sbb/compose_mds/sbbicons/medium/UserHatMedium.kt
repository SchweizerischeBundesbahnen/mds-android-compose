package ch.sbb.compose_mds.sbbicons.medium

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.MediumGroup

public val MediumGroup.UserHatMedium: ImageVector
    get() {
        if (_userHatMedium != null) {
            return _userHatMedium!!
        }
        _userHatMedium = Builder(name = "UserHatMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(18.0f, 4.723f)
                lineToRelative(0.158f, 0.053f)
                lineToRelative(6.75f, 2.25f)
                lineToRelative(1.426f, 0.475f)
                lineToRelative(-1.426f, 0.473f)
                lineToRelative(-2.658f, 0.883f)
                verticalLineToRelative(2.989f)
                lineToRelative(-0.05f, 0.045f)
                curveToRelative(0.508f, 0.903f, 0.8f, 1.973f, 0.8f, 3.108f)
                curveToRelative(0.0f, 1.484f, -0.506f, 2.88f, -1.353f, 3.924f)
                curveToRelative(4.079f, 1.928f, 6.604f, 6.658f, 6.604f, 11.826f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-0.5f)
                lineToRelative(-19.5f, -0.007f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -5.62f, 2.65f, -10.02f, 6.597f, -11.812f)
                arcToRelative(6.14f, 6.14f, 0.0f, false, true, -1.227f, -2.68f)
                lineTo(8.525f, 16.25f)
                lineToRelative(0.413f, -0.743f)
                lineToRelative(1.812f, -3.262f)
                lineTo(10.75f, 7.861f)
                lineTo(9.667f, 7.5f)
                lineToRelative(1.425f, -0.475f)
                lineToRelative(6.75f, -2.25f)
                close()
                moveTo(15.102f, 19.694f)
                curveToRelative(-3.585f, 1.447f, -6.188f, 5.316f, -6.344f, 10.548f)
                lineToRelative(18.484f, 0.007f)
                curveToRelative(-0.161f, -4.82f, -2.644f, -9.0f, -6.346f, -10.567f)
                curveToRelative(-0.81f, 0.667f, -1.808f, 1.067f, -2.909f, 1.067f)
                curveToRelative(-1.094f, 0.0f, -2.082f, -0.395f, -2.885f, -1.055f)
                moveToRelative(-0.518f, -7.162f)
                curveToRelative(1.904f, 1.322f, 4.554f, 1.6f, 6.828f, 0.003f)
                curveToRelative(0.372f, 0.72f, 0.589f, 1.565f, 0.589f, 2.464f)
                curveToRelative(0.0f, 2.665f, -1.855f, 4.75f, -4.014f, 4.75f)
                curveToRelative(-2.154f, 0.0f, -3.986f, -2.081f, -3.986f, -4.75f)
                curveToRelative(0.0f, -0.9f, 0.213f, -1.747f, 0.583f, -2.468f)
                moveToRelative(-0.834f, -0.688f)
                lineToRelative(0.045f, 0.042f)
                arcToRelative(6.34f, 6.34f, 0.0f, false, false, -0.777f, 2.64f)
                lineToRelative(-1.268f, -2.28f)
                lineTo(11.75f, 8.192f)
                lineToRelative(2.0f, 0.664f)
                verticalLineToRelative(2.987f)
                moveToRelative(1.0f, -2.654f)
                verticalLineToRelative(2.21f)
                curveToRelative(1.72f, 1.461f, 4.352f, 1.81f, 6.5f, -0.002f)
                lineTo(21.25f, 9.19f)
                lineToRelative(-3.092f, 1.027f)
                lineToRelative(-0.158f, 0.052f)
                lineToRelative(-0.157f, -0.052f)
                close()
                moveTo(12.834f, 7.5f)
                lineTo(18.0f, 9.215f)
                lineToRelative(5.167f, -1.717f)
                lineTo(18.0f, 5.777f)
                close()
                moveTo(11.25f, 13.405f)
                lineTo(12.275f, 15.25f)
                horizontalLineToRelative(-2.05f)
                close()
            }
        }
        .build()
        return _userHatMedium!!
    }

private var _userHatMedium: ImageVector? = null
