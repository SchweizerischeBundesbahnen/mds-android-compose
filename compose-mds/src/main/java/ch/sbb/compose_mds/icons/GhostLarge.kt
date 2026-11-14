package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.GhostLarge: ImageVector
    get() {
        if (_ghostLarge != null) {
            return _ghostLarge!!
        }
        _ghostLarge = Builder(name = "GhostLarge", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.979f, 4.5f)
                curveToRelative(7.455f, 0.0f, 13.5f, 6.044f, 13.5f, 13.5f)
                verticalLineToRelative(25.5f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.209f, 0.0f, -1.85f, -0.639f, -2.438f, -1.11f)
                curveToRelative(-0.3f, -0.239f, -0.6f, -0.455f, -0.988f, -0.616f)
                curveToRelative(-0.386f, -0.16f, -0.883f, -0.274f, -1.575f, -0.274f)
                curveToRelative(-1.35f, 0.0f, -2.01f, 0.434f, -2.747f, 0.918f)
                curveToRelative(-0.784f, 0.516f, -1.646f, 1.082f, -3.296f, 1.082f)
                curveToRelative(-0.81f, 0.0f, -1.433f, -0.136f, -1.961f, -0.349f)
                curveToRelative(-0.52f, -0.21f, -0.931f, -0.49f, -1.297f, -0.737f)
                curveToRelative(-0.373f, -0.252f, -0.702f, -0.473f, -1.11f, -0.638f)
                curveToRelative(-0.402f, -0.162f, -0.898f, -0.276f, -1.588f, -0.276f)
                curveToRelative(-0.692f, 0.0f, -1.189f, 0.115f, -1.575f, 0.274f)
                curveToRelative(-0.388f, 0.161f, -0.689f, 0.377f, -0.988f, 0.617f)
                curveToRelative(-0.588f, 0.47f, -1.23f, 1.109f, -2.437f, 1.109f)
                horizontalLineToRelative(-2.5f)
                verticalLineTo(18.0f)
                curveToRelative(0.0f, -7.456f, 6.044f, -13.5f, 13.5f, -13.5f)
                moveToRelative(0.0f, 1.0f)
                curveToRelative(-6.904f, 0.0f, -12.5f, 5.596f, -12.5f, 12.5f)
                verticalLineToRelative(24.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.791f, 0.0f, 1.15f, -0.361f, 1.812f, -0.89f)
                curveToRelative(0.326f, -0.261f, 0.713f, -0.545f, 1.23f, -0.76f)
                curveToRelative(0.52f, -0.215f, 1.15f, -0.35f, 1.957f, -0.35f)
                curveToRelative(0.81f, 0.0f, 1.434f, 0.136f, 1.962f, 0.349f)
                curveToRelative(0.52f, 0.21f, 0.931f, 0.49f, 1.297f, 0.737f)
                curveToRelative(0.373f, 0.252f, 0.702f, 0.473f, 1.11f, 0.638f)
                curveToRelative(0.402f, 0.162f, 0.898f, 0.276f, 1.588f, 0.276f)
                curveToRelative(1.351f, 0.0f, 2.01f, -0.434f, 2.748f, -0.918f)
                curveToRelative(0.784f, -0.516f, 1.646f, -1.082f, 3.296f, -1.082f)
                curveToRelative(0.808f, 0.0f, 1.436f, 0.135f, 1.957f, 0.35f)
                curveToRelative(0.517f, 0.215f, 0.904f, 0.499f, 1.23f, 0.76f)
                curveToRelative(0.662f, 0.529f, 1.02f, 0.89f, 1.813f, 0.89f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(18.0f)
                curveToRelative(0.0f, -6.904f, -5.597f, -12.5f, -12.5f, -12.5f)
                moveTo(18.936f, 14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 0.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -6.0f)
                moveToRelative(10.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 0.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -6.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
                moveToRelative(-10.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.104f, 42.0f)
                curveToRelative(0.625f, 0.5f, 1.375f, 1.0f, 2.875f, 1.0f)
                reflectiveCurveToRelative(2.26f, -0.5f, 3.021f, -1.0f)
                moveToRelative(6.0f, 0.0f)
                curveToRelative(0.74f, 0.5f, 1.479f, 1.0f, 2.979f, 1.0f)
                reflectiveCurveToRelative(2.25f, -0.5f, 2.874f, -1.0f)
                moveTo(26.5f, 27.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -5.0f, 0.0f)
            }
        }
        .build()
        return _ghostLarge!!
    }

private var _ghostLarge: ImageVector? = null
