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

public val SBBIcons.GearsLarge: ImageVector
    get() {
        if (_gearsLarge != null) {
            return _gearsLarge!!
        }
        _gearsLarge = Builder(name = "GearsLarge", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(25.0f, 10.009f)
                curveToRelative(2.285f, 0.076f, 4.43f, 0.672f, 6.322f, 1.675f)
                lineToRelative(2.245f, -3.888f)
                lineToRelative(0.866f, 0.5f)
                lineToRelative(-2.245f, 3.887f)
                arcToRelative(14.45f, 14.45f, 0.0f, false, true, 4.628f, 4.628f)
                lineToRelative(3.888f, -2.244f)
                lineToRelative(0.5f, 0.866f)
                lineToRelative(-3.889f, 2.244f)
                arcTo(14.5f, 14.5f, 0.0f, false, true, 38.99f, 24.0f)
                horizontalLineTo(44.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-5.01f)
                arcToRelative(14.5f, 14.5f, 0.0f, false, true, -1.675f, 6.321f)
                lineToRelative(3.89f, 2.246f)
                lineToRelative(-0.5f, 0.866f)
                lineToRelative(-3.89f, -2.245f)
                arcToRelative(14.45f, 14.45f, 0.0f, false, true, -4.627f, 4.627f)
                lineToRelative(2.245f, 3.89f)
                lineToRelative(-0.866f, 0.5f)
                lineToRelative(-2.246f, -3.89f)
                arcTo(14.5f, 14.5f, 0.0f, false, true, 25.0f, 38.99f)
                verticalLineTo(44.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(38.99f)
                arcToRelative(14.5f, 14.5f, 0.0f, false, true, -6.322f, -1.675f)
                lineToRelative(-2.245f, 3.89f)
                lineToRelative(-0.866f, -0.5f)
                lineToRelative(2.244f, -3.89f)
                arcToRelative(14.45f, 14.45f, 0.0f, false, true, -4.627f, -4.627f)
                lineToRelative(-3.888f, 2.245f)
                lineToRelative(-0.5f, -0.866f)
                lineToRelative(3.889f, -2.246f)
                arcTo(14.5f, 14.5f, 0.0f, false, true, 10.01f, 25.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.01f)
                curveToRelative(0.076f, -2.285f, 0.67f, -4.43f, 1.674f, -6.323f)
                lineToRelative(-3.888f, -2.244f)
                lineToRelative(0.5f, -0.866f)
                lineToRelative(3.887f, 2.244f)
                arcToRelative(14.45f, 14.45f, 0.0f, false, true, 4.628f, -4.628f)
                lineToRelative(-2.244f, -3.887f)
                lineToRelative(0.866f, -0.5f)
                lineToRelative(2.244f, 3.888f)
                arcTo(14.5f, 14.5f, 0.0f, false, true, 24.0f, 10.009f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(30.98f, 25.0f)
                curveToRelative(-0.248f, 3.4f, -3.006f, 6.0f, -6.48f, 6.0f)
                arcToRelative(6.6f, 6.6f, 0.0f, false, true, -2.817f, -0.622f)
                lineToRelative(-3.504f, 6.07f)
                arcTo(13.5f, 13.5f, 0.0f, false, false, 24.5f, 38.0f)
                curveToRelative(7.33f, 0.0f, 13.23f, -5.739f, 13.49f, -13.0f)
                close()
                moveTo(17.31f, 13.049f)
                arcTo(13.45f, 13.45f, 0.0f, false, false, 11.0f, 24.5f)
                curveToRelative(0.0f, 4.848f, 2.511f, 9.07f, 6.313f, 11.45f)
                lineToRelative(3.502f, -6.067f)
                curveTo(19.104f, 28.723f, 18.0f, 26.763f, 18.0f, 24.5f)
                reflectiveCurveToRelative(1.104f, -4.224f, 2.814f, -5.384f)
                close()
                moveTo(24.5f, 19.0f)
                curveToRelative(-3.09f, 0.0f, -5.5f, 2.41f, -5.5f, 5.5f)
                reflectiveCurveToRelative(2.41f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.41f, 5.5f, -5.5f)
                reflectiveCurveToRelative(-2.41f, -5.5f, -5.5f, -5.5f)
                moveToRelative(0.0f, -8.0f)
                curveToRelative(-2.29f, 0.0f, -4.44f, 0.56f, -6.322f, 1.55f)
                lineToRelative(3.505f, 6.071f)
                arcTo(6.6f, 6.6f, 0.0f, false, true, 24.5f, 18.0f)
                curveToRelative(3.474f, 0.0f, 6.232f, 2.6f, 6.48f, 6.0f)
                horizontalLineToRelative(7.01f)
                curveToRelative(-0.26f, -7.263f, -6.16f, -13.0f, -13.49f, -13.0f)
            }
        }
        .build()
        return _gearsLarge!!
    }

private var _gearsLarge: ImageVector? = null
