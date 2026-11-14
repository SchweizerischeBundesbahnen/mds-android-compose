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

public val SBBIcons.SunshadeSunSandLarge: ImageVector
    get() {
        if (_sunshadeSunSandLarge != null) {
            return _sunshadeSunSandLarge!!
        }
        _sunshadeSunSandLarge = Builder(name = "SunshadeSunSandLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.19f, 14.57f)
                curveToRelative(6.286f, -3.33f, 14.105f, -1.2f, 17.825f, 4.882f)
                lineToRelative(0.18f, 0.3f)
                lineToRelative(0.25f, 0.433f)
                lineToRelative(-0.434f, 0.25f)
                lineToRelative(-10.816f, 6.243f)
                lineTo(26.78f, 44.0f)
                lineTo(42.0f, 44.0f)
                verticalLineToRelative(1.0f)
                lineTo(5.0f, 45.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(20.608f)
                lineTo(15.33f, 27.178f)
                lineTo(4.494f, 33.435f)
                lineToRelative(-0.434f, 0.25f)
                lineToRelative(-0.25f, -0.433f)
                lineToRelative(0.434f, -0.25f)
                lineToRelative(-0.001f, -0.001f)
                lineToRelative(-0.433f, 0.251f)
                curveTo(0.166f, 26.94f, 2.2f, 18.909f, 8.324f, 15.069f)
                lineToRelative(-0.505f, -0.875f)
                lineToRelative(0.866f, -0.5f)
                close()
                moveTo(6.006f, 18.368f)
                curveTo(2.756f, 22.161f, 2.0f, 27.683f, 4.436f, 32.314f)
                lineToRelative(3.462f, -2.0f)
                curveToRelative(-1.667f, -3.044f, -2.467f, -6.222f, -2.39f, -8.958f)
                curveToRelative(0.03f, -1.066f, 0.194f, -2.076f, 0.498f, -2.988f)
                moveToRelative(9.562f, -2.216f)
                curveToRelative(-2.345f, -1.267f, -4.609f, -1.461f, -6.315f, -0.475f)
                curveToRelative(-1.707f, 0.985f, -2.67f, 3.043f, -2.745f, 5.707f)
                curveToRelative(-0.071f, 2.527f, 0.668f, 5.523f, 2.255f, 8.43f)
                lineToRelative(12.978f, -7.492f)
                curveToRelative(-1.724f, -2.828f, -3.948f, -4.967f, -6.173f, -6.17f)
                moveToRelative(10.5f, 3.672f)
                curveToRelative(-2.791f, -4.423f, -7.948f, -6.528f, -12.856f, -5.613f)
                curveToRelative(0.94f, 0.193f, 1.896f, 0.556f, 2.832f, 1.062f)
                curveToRelative(2.408f, 1.301f, 4.759f, 3.584f, 6.562f, 6.55f)
                close()
                moveTo(37.0f, 18.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(32.257f, 16.45f)
                lineTo(30.136f, 18.57f)
                lineTo(29.428f, 17.863f)
                lineTo(31.549f, 15.743f)
                close()
                moveTo(43.571f, 17.863f)
                lineTo(42.864f, 18.57f)
                lineTo(40.743f, 16.45f)
                lineTo(41.45f, 15.742f)
                close()
                moveTo(40.0f, 11.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, -7.0f, 0.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 7.0f, 0.0f)
                moveTo(30.0f, 11.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(46.0f, 11.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(32.257f, 6.55f)
                lineToRelative(-0.707f, 0.708f)
                lineToRelative(-2.122f, -2.121f)
                lineToRelative(0.707f, -0.707f)
                close()
                moveTo(43.57f, 5.137f)
                lineToRelative(-2.121f, 2.12f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(2.121f, -2.12f)
                close()
                moveTo(37.0f, 2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(36.0f, 2.0f)
                close()
                moveTo(41.0f, 11.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, -9.0f, 0.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 9.0f, 0.0f)
            }
        }
        .build()
        return _sunshadeSunSandLarge!!
    }

private var _sunshadeSunSandLarge: ImageVector? = null
