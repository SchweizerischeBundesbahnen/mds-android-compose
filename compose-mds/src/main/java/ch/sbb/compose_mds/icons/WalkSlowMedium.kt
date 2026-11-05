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

public val SBBIcons.WalkSlowMedium: ImageVector
    get() {
        if (_walkSlowMedium != null) {
            return _walkSlowMedium!!
        }
        _walkSlowMedium = Builder(
            name = "WalkSlowMedium",
            defaultWidth = 36.0.dp,
            defaultHeight =
                36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
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
                moveTo(12.143f, 28.587f)
                quadToRelative(0.14f, 0.0f, 0.28f, 0.054f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -0.28f, -0.054f)
                moveToRelative(10.055f, -16.06f)
                lineToRelative(1.48f, 2.958f)
                lineTo(25.9f, 18.45f)
                lineToRelative(-0.8f, 0.6f)
                lineToRelative(-2.25f, -3.0f)
                lineToRelative(-0.027f, -0.036f)
                lineToRelative(-0.02f, -0.04f)
                lineToRelative(-0.554f, -1.109f)
                verticalLineToRelative(5.402f)
                lineToRelative(1.442f, 2.75f)
                lineToRelative(0.058f, 0.11f)
                lineTo(23.749f, 30.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-6.628f)
                lineToRelative(-1.302f, -2.482f)
                lineTo(19.25f, 20.89f)
                verticalLineToRelative(3.896f)
                lineToRelative(-0.005f, 0.035f)
                lineToRelative(-0.495f, -0.071f)
                horizontalLineToRelative(-0.003f)
                lineToRelative(0.498f, 0.071f)
                lineToRelative(-0.75f, 5.25f)
                lineToRelative(-0.99f, -0.141f)
                lineToRelative(0.745f, -5.216f)
                lineTo(18.25f, 13.958f)
                lineToRelative(-2.0f, 1.999f)
                lineTo(16.25f, 19.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.957f)
                lineToRelative(3.294f, -3.293f)
                horizontalLineToRelative(3.515f)
                close()
                moveTo(9.36f, 27.462f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -0.001f, 1.498f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.001f, -1.498f)
                moveToRelative(3.817f, 0.677f)
                lineToRelative(-0.188f, 0.465f)
                lineToRelative(-0.465f, -0.189f)
                lineToRelative(0.19f, -0.463f)
                close()
                moveTo(16.267f, 20.489f)
                lineTo(13.177f, 28.139f)
                lineTo(12.713f, 27.951f)
                lineTo(12.524f, 28.415f)
                lineTo(9.746f, 27.28f)
                lineTo(9.285f, 27.093f)
                lineTo(9.472f, 26.631f)
                lineTo(11.158f, 22.457f)
                lineTo(11.346f, 21.992f)
                lineTo(11.81f, 22.182f)
                lineTo(14.124f, 23.124f)
                lineTo(15.34f, 20.114f)
                close()
                moveTo(10.586f, 26.542f)
                lineTo(12.437f, 27.299f)
                lineTo(13.749f, 24.051f)
                lineTo(11.896f, 23.296f)
                close()
                moveTo(19.25f, 19.889f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.64f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(20.25f, 6.249f)
                curveToRelative(1.076f, 0.0f, 2.0f, 0.924f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.924f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.924f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.924f, -2.0f, 2.0f, -2.0f)
                moveToRelative(0.0f, 1.0f)
                curveToRelative(-0.523f, 0.0f, -1.0f, 0.477f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.477f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.477f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.477f, -1.0f, -1.0f, -1.0f)
            }
        }
            .build()
        return _walkSlowMedium!!
    }

private var _walkSlowMedium: ImageVector? = null
