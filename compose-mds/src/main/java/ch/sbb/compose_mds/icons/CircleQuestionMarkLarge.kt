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

public val SBBIcons.CircleQuestionMarkLarge: ImageVector
    get() {
        if (_circleQuestionMarkLarge != null) {
            return _circleQuestionMarkLarge!!
        }
        _circleQuestionMarkLarge = Builder(name = "CircleQuestionMarkLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 2.0f)
                curveToRelative(12.15f, 0.0f, 22.0f, 9.85f, 22.0f, 22.0f)
                reflectiveCurveToRelative(-9.85f, 22.0f, -22.0f, 22.0f)
                reflectiveCurveTo(2.0f, 36.15f, 2.0f, 24.0f)
                reflectiveCurveTo(11.85f, 2.0f, 24.0f, 2.0f)
                moveToRelative(0.0f, 1.0f)
                curveTo(12.402f, 3.0f, 3.0f, 12.402f, 3.0f, 24.0f)
                reflectiveCurveToRelative(9.402f, 21.0f, 21.0f, 21.0f)
                reflectiveCurveToRelative(21.0f, -9.402f, 21.0f, -21.0f)
                reflectiveCurveTo(35.598f, 3.0f, 24.0f, 3.0f)
                moveToRelative(0.77f, 34.0f)
                lineTo(23.3f, 37.0f)
                verticalLineToRelative(-3.4f)
                horizontalLineToRelative(1.47f)
                close()
                moveTo(24.22f, 11.0f)
                arcToRelative(7.1f, 7.1f, 0.0f, false, true, 5.27f, 1.93f)
                arcToRelative(5.76f, 5.76f, 0.0f, false, true, 1.74f, 4.2f)
                arcToRelative(6.52f, 6.52f, 0.0f, false, true, -1.45f, 4.12f)
                arcTo(30.0f, 30.0f, 0.0f, false, true, 27.06f, 24.0f)
                quadToRelative(-0.784f, 0.715f, -1.45f, 1.54f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -0.61f, 1.27f)
                arcToRelative(12.4f, 12.4f, 0.0f, false, false, -0.27f, 3.0f)
                horizontalLineToRelative(-1.37f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, true, 0.46f, -3.81f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, true, 2.31f, -2.87f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, 2.34f, -2.39f)
                arcToRelative(5.55f, 5.55f, 0.0f, false, false, 1.34f, -3.53f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, false, -1.47f, -3.49f)
                arcToRelative(5.67f, 5.67f, 0.0f, false, false, -4.16f, -1.5f)
                arcToRelative(5.48f, 5.48f, 0.0f, false, false, -5.27f, 3.0f)
                arcToRelative(8.7f, 8.7f, 0.0f, false, false, -0.8f, 3.9f)
                lineToRelative(-1.34f, -0.02f)
                arcToRelative(9.6f, 9.6f, 0.0f, false, true, 1.1f, -4.77f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, true, 2.6f, -2.45f)
                arcToRelative(7.86f, 7.86f, 0.0f, false, true, 3.75f, -0.88f)
            }
        }
        .build()
        return _circleQuestionMarkLarge!!
    }

private var _circleQuestionMarkLarge: ImageVector? = null
