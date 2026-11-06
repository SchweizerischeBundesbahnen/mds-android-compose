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

public val SBBIcons.StairsUserLarge: ImageVector
    get() {
        if (_stairsUserLarge != null) {
            return _stairsUserLarge!!
        }
        _stairsUserLarge = Builder(name = "StairsUserLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.947f, 12.276f)
                lineToRelative(1.98f, 3.96f)
                lineTo(25.9f, 20.2f)
                lineToRelative(-0.8f, 0.6f)
                lineToRelative(-3.0f, -4.0f)
                lineToRelative(-0.027f, -0.036f)
                lineToRelative(-0.02f, -0.04f)
                lineTo(21.0f, 14.617f)
                verticalLineToRelative(7.732f)
                lineToRelative(2.0f, 3.0f)
                lineTo(23.0f, 30.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(6.0f)
                lineTo(3.0f, 43.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(2.11f)
                lineTo(16.0f, 28.438f)
                lineTo(16.0f, 13.707f)
                lineToRelative(-3.0f, 3.0f)
                lineTo(13.0f, 22.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.707f)
                lineTo(16.293f, 12.0f)
                horizontalLineToRelative(4.516f)
                close()
                moveTo(17.0f, 28.561f)
                lineToRelative(-0.015f, 0.06f)
                lineTo(15.141f, 36.0f)
                lineTo(20.0f, 36.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.349f)
                lineTo(20.232f, 23.0f)
                lineTo(17.0f, 23.0f)
                close()
                moveTo(17.0f, 22.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(18.5f, 4.0f)
                curveTo(19.842f, 4.0f, 21.0f, 5.158f, 21.0f, 6.5f)
                reflectiveCurveTo(19.842f, 9.0f, 18.5f, 9.0f)
                reflectiveCurveTo(16.0f, 7.842f, 16.0f, 6.5f)
                reflectiveCurveTo(17.158f, 4.0f, 18.5f, 4.0f)
                moveToRelative(0.0f, 1.0f)
                curveToRelative(-0.79f, 0.0f, -1.5f, 0.71f, -1.5f, 1.5f)
                reflectiveCurveTo(17.71f, 8.0f, 18.5f, 8.0f)
                reflectiveCurveTo(20.0f, 7.29f, 20.0f, 6.5f)
                reflectiveCurveTo(19.29f, 5.0f, 18.5f, 5.0f)
            }
        }
        .build()
        return _stairsUserLarge!!
    }

private var _stairsUserLarge: ImageVector? = null
