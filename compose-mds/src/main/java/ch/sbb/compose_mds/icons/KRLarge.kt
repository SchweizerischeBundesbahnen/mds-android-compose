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

public val SBBIcons.KRLarge: ImageVector
    get() {
        if (_kRLarge != null) {
            return _kRLarge!!
        }
        _kRLarge = Builder(name = "KRLarge", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(41.505f, 37.001f)
                lineTo(5.503f, 37.001f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(36.002f)
                close()
                moveTo(8.993f, 22.117f)
                lineToRelative(6.272f, -6.622f)
                horizontalLineToRelative(4.422f)
                lineToRelative(-6.272f, 6.328f)
                lineToRelative(6.862f, 9.674f)
                horizontalLineToRelative(-4.41f)
                lineToRelative(-4.86f, -7.18f)
                lineToRelative(-2.014f, 2.014f)
                verticalLineToRelative(5.166f)
                lineTo(5.501f, 31.497f)
                lineTo(5.501f, 15.495f)
                horizontalLineToRelative(3.492f)
                close()
                moveTo(35.143f, 15.495f)
                quadToRelative(2.297f, 0.001f, 3.524f, 0.722f)
                quadToRelative(1.017f, 0.591f, 1.554f, 1.576f)
                reflectiveQuadToRelative(0.538f, 2.222f)
                quadToRelative(-0.001f, 1.402f, -0.674f, 2.442f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, true, -1.878f, 1.488f)
                arcToRelative(2.7f, 2.7f, 0.0f, false, true, 1.664f, 1.182f)
                quadToRelative(0.383f, 0.581f, 0.514f, 1.216f)
                quadToRelative(0.132f, 0.633f, 0.34f, 2.9f)
                quadToRelative(0.154f, 1.663f, 0.47f, 2.069f)
                lineToRelative(0.152f, 0.185f)
                horizontalLineToRelative(-3.644f)
                arcToRelative(2.7f, 2.7f, 0.0f, false, true, -0.268f, -0.866f)
                quadToRelative(-0.082f, -0.523f, -0.212f, -2.43f)
                quadToRelative(-0.132f, -1.696f, -0.828f, -2.346f)
                quadToRelative(-0.694f, -0.65f, -2.37f, -0.652f)
                horizontalLineToRelative(-3.14f)
                verticalLineToRelative(6.294f)
                horizontalLineToRelative(-3.492f)
                lineTo(27.393f, 15.495f)
                close()
                moveTo(23.046f, 23.71f)
                horizontalLineToRelative(3.094f)
                verticalLineToRelative(1.766f)
                horizontalLineToRelative(-3.094f)
                verticalLineToRelative(3.084f)
                horizontalLineToRelative(-1.768f)
                verticalLineToRelative(-3.084f)
                horizontalLineToRelative(-3.084f)
                verticalLineToRelative(-1.766f)
                horizontalLineToRelative(3.084f)
                verticalLineToRelative(-3.084f)
                horizontalLineToRelative(1.768f)
                close()
                moveTo(30.885f, 22.645f)
                horizontalLineToRelative(3.338f)
                quadToRelative(1.609f, 0.0f, 2.266f, -0.46f)
                quadToRelative(0.831f, -0.579f, 0.832f, -1.752f)
                quadToRelative(0.001f, -1.138f, -0.712f, -1.662f)
                quadToRelative(-0.711f, -0.528f, -2.244f, -0.527f)
                horizontalLineToRelative(-3.48f)
                close()
                moveTo(41.505f, 11.0f)
                lineTo(5.503f, 11.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(36.002f)
                close()
            }
        }
        .build()
        return _kRLarge!!
    }

private var _kRLarge: ImageVector? = null
