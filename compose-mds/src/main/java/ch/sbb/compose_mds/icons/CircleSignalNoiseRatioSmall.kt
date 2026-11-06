package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.CircleSignalNoiseRatioSmall: ImageVector
    get() {
        if (_circleSignalNoiseRatioSmall != null) {
            return _circleSignalNoiseRatioSmall!!
        }
        _circleSignalNoiseRatioSmall = Builder(name = "CircleSignalNoiseRatioSmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(5.523f, 0.0f, 10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveTo(2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, false, 0.0f, 18.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 0.0f, -18.0f)
                moveToRelative(-1.468f, 13.483f)
                horizontalLineToRelative(-1.09f)
                lineToRelative(2.787f, -7.532f)
                horizontalLineToRelative(1.078f)
                close()
                moveTo(7.086f, 8.808f)
                quadToRelative(0.857f, -0.001f, 1.435f, 0.34f)
                quadToRelative(0.831f, 0.488f, 0.876f, 1.578f)
                horizontalLineTo(8.151f)
                quadToRelative(-0.036f, -0.44f, -0.325f, -0.67f)
                quadToRelative(-0.289f, -0.232f, -0.81f, -0.232f)
                quadToRelative(-0.462f, 0.0f, -0.72f, 0.182f)
                arcToRelative(0.59f, 0.59f, 0.0f, false, false, -0.255f, 0.51f)
                quadToRelative(0.0f, 0.296f, 0.246f, 0.426f)
                quadToRelative(0.237f, 0.132f, 1.205f, 0.37f)
                quadToRelative(1.02f, 0.254f, 1.414f, 0.512f)
                quadToRelative(0.725f, 0.475f, 0.725f, 1.324f)
                quadToRelative(0.0f, 0.93f, -0.73f, 1.466f)
                quadToRelative(-0.642f, 0.472f, -1.74f, 0.472f)
                quadToRelative(-1.223f, 0.0f, -1.898f, -0.558f)
                quadToRelative(-0.677f, -0.556f, -0.701f, -1.586f)
                horizontalLineToRelative(1.303f)
                quadToRelative(0.029f, 0.5f, 0.258f, 0.742f)
                quadToRelative(0.36f, 0.385f, 1.086f, 0.385f)
                quadToRelative(0.492f, 0.0f, 0.78f, -0.192f)
                arcToRelative(0.69f, 0.69f, 0.0f, false, false, 0.323f, -0.603f)
                quadToRelative(0.0f, -0.38f, -0.456f, -0.557f)
                quadToRelative(-0.25f, -0.098f, -1.18f, -0.357f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -0.91f, -0.302f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.524f, -0.32f)
                quadToRelative(-0.459f, -0.41f, -0.459f, -1.132f)
                quadToRelative(0.0f, -0.864f, 0.717f, -1.369f)
                quadToRelative(0.61f, -0.43f, 1.586f, -0.43f)
                moveToRelative(10.722f, 4.216f)
                lineToRelative(-0.016f, -4.073f)
                horizontalLineToRelative(1.258f)
                verticalLineToRelative(5.991f)
                horizontalLineToRelative(-1.316f)
                lineToRelative(-2.508f, -4.082f)
                lineToRelative(0.016f, 4.082f)
                horizontalLineToRelative(-1.258f)
                verticalLineToRelative(-5.99f)
                horizontalLineToRelative(1.332f)
                close()
            }
        }
        .build()
        return _circleSignalNoiseRatioSmall!!
    }

private var _circleSignalNoiseRatioSmall: ImageVector? = null
