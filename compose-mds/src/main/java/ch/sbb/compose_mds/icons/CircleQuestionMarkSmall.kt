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

public val SBBIcons.CircleQuestionMarkSmall: ImageVector
    get() {
        if (_circleQuestionMarkSmall != null) {
            return _circleQuestionMarkSmall!!
        }
        _circleQuestionMarkSmall = Builder(name = "CircleQuestionMarkSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveToRelative(4.99f, 0.0f, 9.0f, 4.011f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.01f, 9.0f, -9.0f, 9.0f)
                reflectiveCurveToRelative(-9.0f, -4.012f, -9.0f, -9.0f)
                reflectiveCurveToRelative(4.01f, -9.0f, 9.0f, -9.0f)
                moveToRelative(0.0f, 1.0f)
                curveToRelative(-4.437f, 0.0f, -8.0f, 3.563f, -8.0f, 8.0f)
                reflectiveCurveToRelative(3.563f, 8.0f, 8.0f, 8.0f)
                reflectiveCurveToRelative(8.0f, -3.564f, 8.0f, -8.0f)
                curveToRelative(0.0f, -4.437f, -3.563f, -8.0f, -8.0f, -8.0f)
                moveToRelative(0.854f, 13.991f)
                horizontalLineToRelative(-1.73f)
                verticalLineToRelative(-1.666f)
                horizontalLineToRelative(1.73f)
                close()
                moveTo(12.093f, 6.011f)
                quadToRelative(1.624f, 0.0f, 2.586f, 0.92f)
                quadToRelative(0.896f, 0.85f, 0.897f, 2.235f)
                quadToRelative(0.0f, 1.145f, -0.61f, 1.97f)
                quadToRelative(-0.27f, 0.375f, -1.304f, 1.385f)
                quadToRelative(-0.457f, 0.44f, -0.637f, 0.733f)
                quadToRelative(-0.18f, 0.292f, -0.252f, 0.725f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, false, -0.08f, 1.12f)
                horizontalLineToRelative(-1.361f)
                quadToRelative(0.016f, -1.224f, 0.216f, -1.817f)
                quadToRelative(0.144f, -0.433f, 0.412f, -0.777f)
                quadToRelative(0.269f, -0.344f, 1.19f, -1.289f)
                quadToRelative(0.593f, -0.608f, 0.776f, -1.097f)
                quadToRelative(0.151f, -0.417f, 0.152f, -0.85f)
                quadToRelative(0.0f, -0.8f, -0.44f, -1.344f)
                quadToRelative(-0.53f, -0.665f, -1.56f, -0.665f)
                quadToRelative(-2.14f, 0.0f, -2.307f, 2.626f)
                lineTo(8.393f, 9.886f)
                quadToRelative(0.056f, -1.487f, 0.585f, -2.306f)
                arcToRelative(3.3f, 3.3f, 0.0f, false, true, 1.297f, -1.16f)
                quadToRelative(0.81f, -0.409f, 1.818f, -0.41f)
            }
        }
        .build()
        return _circleQuestionMarkSmall!!
    }

private var _circleQuestionMarkSmall: ImageVector? = null
