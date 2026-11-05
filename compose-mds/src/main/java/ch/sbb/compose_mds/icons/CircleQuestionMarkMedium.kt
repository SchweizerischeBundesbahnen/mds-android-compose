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

public val SBBIcons.CircleQuestionMarkMedium: ImageVector
    get() {
        if (_circleQuestionMarkMedium != null) {
            return _circleQuestionMarkMedium!!
        }
        _circleQuestionMarkMedium = Builder(
            name = "CircleQuestionMarkMedium",
            defaultWidth =
                36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight =
            36.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(18.0f, 4.75f)
                curveToRelative(7.346f, 0.0f, 13.25f, 5.905f, 13.25f, 13.25f)
                reflectiveCurveTo(25.346f, 31.25f, 18.0f, 31.25f)
                arcTo(13.215f, 13.215f, 0.0f, false, true, 4.75f, 18.0f)
                curveToRelative(0.0f, -7.345f, 5.904f, -13.25f, 13.25f, -13.25f)
                moveToRelative(0.0f, 1.0f)
                arcTo(12.214f, 12.214f, 0.0f, false, false, 5.75f, 18.0f)
                curveToRelative(0.0f, 6.792f, 5.457f, 12.25f, 12.25f, 12.25f)
                reflectiveCurveTo(30.25f, 24.792f, 30.25f, 18.0f)
                curveToRelative(0.0f, -6.793f, -5.457f, -12.25f, -12.25f, -12.25f)
                moveToRelative(1.281f, 21.237f)
                horizontalLineToRelative(-2.595f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(2.595f)
                close()
                moveTo(18.14f, 9.017f)
                quadToRelative(2.436f, 0.0f, 3.879f, 1.38f)
                quadToRelative(1.344f, 1.274f, 1.345f, 3.352f)
                quadToRelative(0.0f, 1.717f, -0.914f, 2.955f)
                quadToRelative(-0.407f, 0.564f, -1.957f, 2.078f)
                quadToRelative(-0.684f, 0.66f, -0.956f, 1.1f)
                quadToRelative(-0.27f, 0.436f, -0.378f, 1.086f)
                quadToRelative(-0.12f, 0.648f, -0.12f, 1.682f)
                horizontalLineToRelative(-2.041f)
                quadToRelative(0.025f, -1.838f, 0.324f, -2.727f)
                quadToRelative(0.217f, -0.648f, 0.618f, -1.166f)
                quadToRelative(0.404f, -0.516f, 1.784f, -1.934f)
                quadToRelative(0.89f, -0.912f, 1.165f, -1.645f)
                quadToRelative(0.227f, -0.626f, 0.228f, -1.273f)
                quadToRelative(0.0f, -1.202f, -0.66f, -2.018f)
                quadToRelative(-0.794f, -0.996f, -2.342f, -0.997f)
                quadToRelative(-3.209f, 0.0f, -3.459f, 3.94f)
                horizontalLineTo(12.59f)
                quadToRelative(0.083f, -2.232f, 0.877f, -3.46f)
                arcToRelative(4.9f, 4.9f, 0.0f, false, true, 1.945f, -1.742f)
                quadToRelative(1.213f, -0.611f, 2.728f, -0.611f)
            }
        }
            .build()
        return _circleQuestionMarkMedium!!
    }

private var _circleQuestionMarkMedium: ImageVector? = null
