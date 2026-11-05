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

public val SBBIcons.HalfFareCardLarge: ImageVector
    get() {
        if (_halfFareCardLarge != null) {
            return _halfFareCardLarge!!
        }
        _halfFareCardLarge = Builder(name = "HalfFareCardLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(38.5f, 10.0f)
                curveToRelative(2.484f, 0.0f, 4.5f, 2.016f, 4.5f, 4.5f)
                verticalLineToRelative(20.0f)
                curveToRelative(0.0f, 2.484f, -2.016f, 4.5f, -4.5f, 4.5f)
                horizontalLineToRelative(-30.0f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 4.0f, 34.5f)
                verticalLineToRelative(-20.0f)
                curveTo(4.0f, 12.016f, 6.016f, 10.0f, 8.5f, 10.0f)
                close()
                moveTo(8.5f, 11.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 5.0f, 14.5f)
                verticalLineToRelative(20.0f)
                curveTo(5.0f, 36.432f, 6.568f, 38.0f, 8.5f, 38.0f)
                horizontalLineToRelative(30.0f)
                curveToRelative(1.932f, 0.0f, 3.5f, -1.568f, 3.5f, -3.5f)
                verticalLineToRelative(-20.0f)
                curveToRelative(0.0f, -1.932f, -1.568f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(25.46f, 25.5f)
                quadToRelative(1.455f, 0.001f, 2.429f, 0.776f)
                quadToRelative(1.06f, 0.839f, 1.06f, 2.266f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -0.848f, 2.134f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -0.518f, 0.47f)
                quadToRelative(-0.243f, 0.18f, -1.274f, 0.852f)
                quadToRelative(-0.983f, 0.643f, -1.408f, 0.982f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -0.786f, 0.782f)
                horizontalLineToRelative(4.886f)
                lineTo(29.001f, 35.5f)
                horizontalLineToRelative(-7.5f)
                quadToRelative(-0.002f, -0.798f, 0.276f, -1.518f)
                curveToRelative(0.182f, -0.477f, 0.44f, -0.894f, 0.772f, -1.242f)
                quadToRelative(0.384f, -0.4f, 0.902f, -0.78f)
                quadToRelative(0.514f, -0.382f, 2.052f, -1.396f)
                quadToRelative(0.75f, -0.489f, 1.046f, -0.91f)
                quadToRelative(0.302f, -0.421f, 0.3f, -0.974f)
                quadToRelative(0.0f, -0.642f, -0.404f, -1.04f)
                quadToRelative(-0.4f, -0.396f, -1.056f, -0.396f)
                curveToRelative(-1.074f, 0.0f, -1.624f, 0.722f, -1.66f, 2.17f)
                lineTo(21.73f, 29.414f)
                verticalLineToRelative(-0.212f)
                quadToRelative(-0.001f, -1.78f, 1.06f, -2.75f)
                quadToRelative(1.03f, -0.953f, 2.67f, -0.952f)
                moveToRelative(2.414f, -9.668f)
                lineToRelative(-16.0f, 18.0f)
                lineToRelative(-0.748f, -0.664f)
                lineToRelative(16.0f, -18.0f)
                close()
                moveTo(15.5f, 23.5f)
                horizontalLineToRelative(-2.292f)
                verticalLineToRelative(-6.546f)
                lineTo(10.5f, 16.954f)
                verticalLineToRelative(-1.452f)
                quadToRelative(0.844f, -0.017f, 1.376f, -0.149f)
                quadToRelative(0.527f, -0.133f, 0.97f, -0.423f)
                quadToRelative(0.636f, -0.427f, 0.854f, -1.43f)
                horizontalLineToRelative(1.8f)
                close()
            }
        }
        .build()
        return _halfFareCardLarge!!
    }

private var _halfFareCardLarge: ImageVector? = null
