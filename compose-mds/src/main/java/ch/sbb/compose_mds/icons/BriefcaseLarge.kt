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

public val SBBIcons.BriefcaseLarge: ImageVector
    get() {
        if (_briefcaseLarge != null) {
            return _briefcaseLarge!!
        }
        _briefcaseLarge = Builder(name = "BriefcaseLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(26.5f, 4.0f)
                arcToRelative(6.504f, 6.504f, 0.0f, false, true, 6.484f, 6.081f)
                curveToRelative(0.59f, 0.202f, 1.016f, 0.762f, 1.016f, 1.419f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(7.97f)
                curveToRelative(1.12f, 0.0f, 2.03f, 0.91f, 2.03f, 2.03f)
                verticalLineToRelative(26.94f)
                arcTo(2.03f, 2.03f, 0.0f, false, true, 41.97f, 43.0f)
                lineTo(5.03f, 43.0f)
                arcTo(2.03f, 2.03f, 0.0f, false, true, 3.0f, 40.97f)
                lineTo(3.0f, 14.03f)
                curveTo(3.0f, 12.91f, 3.91f, 12.0f, 5.03f, 12.0f)
                lineTo(13.0f, 12.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.656f, 0.425f, -1.216f, 1.015f, -1.419f)
                arcTo(6.505f, 6.505f, 0.0f, false, true, 20.5f, 4.0f)
                close()
                moveTo(4.0f, 40.97f)
                curveToRelative(0.0f, 0.569f, 0.461f, 1.03f, 1.03f, 1.03f)
                horizontalLineToRelative(36.94f)
                arcTo(1.03f, 1.03f, 0.0f, false, false, 43.0f, 40.97f)
                lineTo(43.0f, 26.0f)
                lineTo(28.913f, 26.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -0.913f, 0.912f)
                verticalLineToRelative(3.878f)
                curveToRelative(0.0f, 0.401f, -0.231f, 0.716f, -0.504f, 0.91f)
                curveToRelative(-0.274f, 0.194f, -0.628f, 0.3f, -0.996f, 0.3f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.368f, 0.0f, -0.722f, -0.106f, -0.996f, -0.3f)
                curveToRelative(-0.273f, -0.194f, -0.504f, -0.509f, -0.504f, -0.91f)
                verticalLineToRelative(-3.878f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -0.913f, -0.912f)
                lineTo(4.0f, 26.0f)
                close()
                moveTo(20.0f, 30.79f)
                lineTo(20.001f, 30.793f)
                quadToRelative(0.0f, 0.003f, 0.007f, 0.016f)
                curveToRelative(0.01f, 0.016f, 0.032f, 0.044f, 0.075f, 0.075f)
                arcTo(0.74f, 0.74f, 0.0f, false, false, 20.5f, 31.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(0.74f, 0.74f, 0.0f, false, false, 0.417f, -0.116f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, false, 0.075f, -0.075f)
                lineToRelative(0.007f, -0.016f)
                lineToRelative(0.001f, -0.003f)
                lineTo(27.0f, 27.0f)
                horizontalLineToRelative(-7.0f)
                close()
                moveTo(24.0f, 30.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(19.5f, 23.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                close()
                moveTo(5.03f, 13.0f)
                arcTo(1.03f, 1.03f, 0.0f, false, false, 4.0f, 14.03f)
                lineTo(4.0f, 25.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, -1.5f)
                horizontalLineToRelative(8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, 1.5f)
                lineTo(29.0f, 25.0f)
                horizontalLineToRelative(14.0f)
                lineTo(43.0f, 14.03f)
                arcTo(1.03f, 1.03f, 0.0f, false, false, 41.97f, 13.0f)
                close()
                moveTo(14.5f, 11.0f)
                curveToRelative(-0.274f, 0.0f, -0.5f, 0.226f, -0.5f, 0.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.274f, -0.226f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(20.5f, 8.0f)
                arcToRelative(2.494f, 2.494f, 0.0f, false, false, -2.466f, 2.1f)
                curveToRelative(0.564f, 0.216f, 0.966f, 0.762f, 0.966f, 1.4f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.638f, 0.402f, -1.184f, 0.965f, -1.4f)
                arcTo(2.49f, 2.49f, 0.0f, false, false, 26.5f, 8.0f)
                close()
                moveTo(29.5f, 11.0f)
                curveToRelative(-0.274f, 0.0f, -0.5f, 0.226f, -0.5f, 0.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.274f, -0.226f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(20.5f, 5.0f)
                arcToRelative(5.505f, 5.505f, 0.0f, false, false, -5.477f, 5.0f)
                horizontalLineToRelative(2.013f)
                arcTo(3.495f, 3.495f, 0.0f, false, true, 20.5f, 7.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(3.495f, 3.495f, 0.0f, false, true, 3.464f, 3.0f)
                horizontalLineToRelative(2.013f)
                curveToRelative(-0.254f, -2.8f, -2.612f, -5.0f, -5.477f, -5.0f)
                close()
            }
        }
        .build()
        return _briefcaseLarge!!
    }

private var _briefcaseLarge: ImageVector? = null
