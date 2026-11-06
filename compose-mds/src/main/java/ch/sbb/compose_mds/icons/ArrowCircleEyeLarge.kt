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

public val SBBIcons.ArrowCircleEyeLarge: ImageVector
    get() {
        if (_arrowCircleEyeLarge != null) {
            return _arrowCircleEyeLarge!!
        }
        _arrowCircleEyeLarge = Builder(name = "ArrowCircleEyeLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.5f, 4.0f)
                curveTo(34.27f, 4.0f, 43.0f, 12.73f, 43.0f, 23.5f)
                reflectiveCurveTo(34.27f, 43.0f, 23.5f, 43.0f)
                curveToRelative(-8.1f, 0.0f, -15.379f, -4.95f, -18.332f, -12.0f)
                lineTo(5.0f, 31.0f)
                verticalLineToRelative(7.0f)
                lineTo(4.0f, 38.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(1.0f)
                lineTo(6.255f, 31.0f)
                curveToRelative(2.897f, 6.47f, 9.692f, 11.0f, 17.245f, 11.0f)
                curveTo(33.717f, 42.0f, 42.0f, 33.717f, 42.0f, 23.5f)
                reflectiveCurveTo(33.717f, 5.0f, 23.5f, 5.0f)
                reflectiveCurveTo(5.0f, 13.283f, 5.0f, 23.5f)
                lineTo(4.0f, 23.5f)
                curveTo(4.0f, 12.73f, 12.73f, 4.0f, 23.5f, 4.0f)
                moveToRelative(0.0f, 12.0f)
                curveToRelative(2.801f, -0.117f, 9.19f, 1.07f, 13.072f, 7.233f)
                lineToRelative(0.157f, 0.251f)
                lineToRelative(-0.143f, 0.26f)
                curveToRelative(-1.926f, 3.466f, -7.124f, 7.373f, -13.086f, 7.255f)
                lineTo(23.5f, 31.0f)
                horizontalLineToRelative(-0.01f)
                verticalLineToRelative(-0.001f)
                curveToRelative(-5.516f, -0.004f, -10.342f, -2.894f, -13.086f, -7.231f)
                lineToRelative(-0.169f, -0.268f)
                lineToRelative(0.17f, -0.268f)
                curveTo(13.15f, 18.892f, 17.98f, 16.0f, 23.5f, 16.0f)
                moveToRelative(0.0f, 1.0f)
                curveToRelative(-5.046f, 0.0f, -9.479f, 2.585f, -12.076f, 6.5f)
                curveTo(14.02f, 27.415f, 18.454f, 30.0f, 23.5f, 30.0f)
                verticalLineToRelative(0.48f)
                lineToRelative(0.01f, -0.48f)
                curveToRelative(5.406f, 0.111f, 10.17f, -3.366f, 12.05f, -6.484f)
                curveToRelative(-3.658f, -5.564f, -9.522f, -6.628f, -12.038f, -6.516f)
                lineToRelative(-0.022f, -0.5f)
                close()
                moveTo(23.5f, 20.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.0f, -7.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -5.0f)
            }
        }
        .build()
        return _arrowCircleEyeLarge!!
    }

private var _arrowCircleEyeLarge: ImageVector? = null
