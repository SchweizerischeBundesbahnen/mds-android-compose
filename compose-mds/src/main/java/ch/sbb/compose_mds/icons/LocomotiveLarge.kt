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

public val SBBIcons.LocomotiveLarge: ImageVector
    get() {
        if (_locomotiveLarge != null) {
            return _locomotiveLarge!!
        }
        _locomotiveLarge = Builder(name = "LocomotiveLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.0f, 6.0f)
                horizontalLineToRelative(20.0f)
                lineTo(25.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(18.0f, 34.0f)
                lineTo(18.0f, 17.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(17.0f)
                close()
                moveTo(15.0f, 11.0f)
                lineTo(15.0f, 9.0f)
                lineTo(2.0f, 9.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(29.0f)
                lineTo(2.0f, 39.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.028f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 1.631f, 2.99f)
                lineTo(2.0f, 42.99f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(5.2f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 0.6f, 0.0f)
                horizontalLineToRelative(20.4f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 0.6f, 0.0f)
                lineTo(46.0f, 43.99f)
                verticalLineToRelative(-1.0f)
                lineTo(31.34f, 42.99f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 32.973f, 40.0f)
                horizontalLineToRelative(0.534f)
                arcToRelative(13.6f, 13.6f, 0.0f, false, false, 5.872f, -1.225f)
                lineToRelative(0.01f, -0.005f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, 3.251f, -8.113f)
                curveToRelative(-1.088f, -2.977f, -2.775f, -7.296f, -4.562f, -11.139f)
                curveToRelative(-0.893f, -1.921f, -1.815f, -3.733f, -2.703f, -5.202f)
                curveToRelative(-0.868f, -1.435f, -1.74f, -2.608f, -2.56f, -3.206f)
                curveToRelative(-0.784f, -0.7f, -1.97f, -1.155f, -3.235f, -1.463f)
                curveToRelative(-1.292f, -0.314f, -2.737f, -0.488f, -4.079f, -0.583f)
                arcToRelative(45.0f, 45.0f, 0.0f, false, false, -4.918f, -0.068f)
                lineToRelative(-0.08f, 0.003f)
                lineTo(20.48f, 9.0f)
                horizontalLineToRelative(-0.007f)
                lineToRelative(0.026f, 0.5f)
                lineToRelative(-0.027f, -0.5f)
                lineToRelative(-0.473f, 0.026f)
                lineTo(19.999f, 11.0f)
                close()
                moveTo(31.964f, 40.0f)
                horizontalLineToRelative(-6.928f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.2f, 2.99f)
                horizontalLineToRelative(0.529f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.2f, -2.99f)
                moveToRelative(-6.305f, 2.99f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 24.028f, 40.0f)
                lineTo(11.972f, 40.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -1.631f, 2.99f)
                close()
                moveTo(5.025f, 41.975f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 4.035f, 40.0f)
                horizontalLineToRelative(6.93f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.2f, 2.99f)
                horizontalLineToRelative(-0.53f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -2.21f, -1.015f)
                moveTo(20.0f, 12.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(27.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(30.162f, 18.005f)
                arcToRelative(0.03f, 0.03f, 0.0f, false, false, -0.017f, -0.005f)
                lineTo(25.0f, 18.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(9.61f)
                arcToRelative(0.09f, 0.09f, 0.0f, false, false, 0.076f, -0.04f)
                arcToRelative(0.09f, 0.09f, 0.0f, false, false, 0.007f, -0.087f)
                lineToRelative(-0.005f, -0.01f)
                lineToRelative(-4.51f, -10.83f)
                lineToRelative(-0.005f, -0.014f)
                arcToRelative(0.03f, 0.03f, 0.0f, false, false, -0.01f, -0.014f)
                moveTo(30.138f, 17.0f)
                arcToRelative(1.03f, 1.03f, 0.0f, false, true, 0.966f, 0.653f)
                lineToRelative(4.506f, 10.82f)
                arcTo(1.09f, 1.09f, 0.0f, false, true, 34.596f, 30.0f)
                lineTo(24.0f, 30.0f)
                lineTo(24.0f, 17.0f)
                horizontalLineToRelative(6.138f)
                moveTo(21.0f, 39.0f)
                lineTo(21.0f, 9.98f)
                arcToRelative(44.34f, 44.34f, 0.0f, false, true, 4.43f, 0.08f)
                curveToRelative(1.313f, 0.094f, 2.696f, 0.263f, 3.913f, 0.559f)
                curveToRelative(1.23f, 0.299f, 2.226f, 0.712f, 2.821f, 1.252f)
                lineToRelative(0.021f, 0.019f)
                lineToRelative(0.023f, 0.016f)
                curveToRelative(0.645f, 0.463f, 1.437f, 1.483f, 2.31f, 2.928f)
                curveToRelative(0.862f, 1.425f, 1.767f, 3.2f, 2.652f, 5.106f)
                curveToRelative(1.771f, 3.808f, 3.448f, 8.099f, 4.53f, 11.062f)
                lineToRelative(0.001f, 0.003f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -2.744f, 6.863f)
                arcTo(12.6f, 12.6f, 0.0f, false, true, 33.519f, 39.0f)
                lineTo(21.0f, 39.0f)
                moveTo(2.0f, 17.05f)
                horizontalLineToRelative(9.05f)
                arcTo(0.95f, 0.95f, 0.0f, false, true, 12.0f, 18.0f)
                verticalLineToRelative(11.05f)
                arcToRelative(0.95f, 0.95f, 0.0f, false, true, -0.95f, 0.95f)
                lineTo(2.0f, 30.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(9.0f)
                lineTo(11.0f, 18.05f)
                lineTo(2.0f, 18.05f)
                close()
            }
        }
        .build()
        return _locomotiveLarge!!
    }

private var _locomotiveLarge: ImageVector? = null
