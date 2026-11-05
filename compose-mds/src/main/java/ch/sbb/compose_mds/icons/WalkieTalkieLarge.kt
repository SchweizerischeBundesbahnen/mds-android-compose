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

public val SBBIcons.WalkieTalkieLarge: ImageVector
    get() {
        if (_walkieTalkieLarge != null) {
            return _walkieTalkieLarge!!
        }
        _walkieTalkieLarge = Builder(
            name = "WalkieTalkieLarge",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
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
                moveTo(30.0f, 13.0f)
                horizontalLineToRelative(1.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, 2.5f)
                verticalLineToRelative(24.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, 2.5f)
                horizontalLineToRelative(-14.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, -2.5f)
                lineTo(15.0f, 24.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(2.05f)
                curveToRelative(0.199f, -0.98f, 0.97f, -1.751f, 1.95f, -1.95f)
                lineTo(17.0f, 10.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(8.0f)
                lineTo(29.0f, 6.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(17.5f, 14.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, 1.5f)
                verticalLineToRelative(24.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, 1.5f)
                horizontalLineToRelative(14.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-24.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                close()
                moveTo(31.0f, 38.0f)
                lineTo(18.0f, 38.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(13.0f)
                close()
                moveTo(31.0f, 34.0f)
                lineTo(18.0f, 34.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(13.0f)
                close()
                moveTo(31.0f, 30.0f)
                lineTo(18.0f, 30.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(13.0f)
                close()
                moveTo(24.5f, 17.0f)
                curveToRelative(0.927f, 0.0f, 1.799f, 0.436f, 2.432f, 1.068f)
                reflectiveCurveTo(28.0f, 19.573f, 28.0f, 20.5f)
                reflectiveCurveToRelative(-0.434f, 1.799f, -1.065f, 2.432f)
                curveTo(26.303f, 23.565f, 25.43f, 24.0f, 24.504f, 24.0f)
                reflectiveCurveToRelative(-1.8f, -0.436f, -2.434f, -1.068f)
                curveTo(21.437f, 22.299f, 21.0f, 21.427f, 21.0f, 20.5f)
                reflectiveCurveToRelative(0.436f, -1.799f, 1.068f, -2.432f)
                reflectiveCurveTo(23.573f, 17.0f, 24.5f, 17.0f)
                moveTo(14.0f, 23.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(24.5f, 18.0f)
                curveToRelative(-0.615f, 0.0f, -1.243f, 0.294f, -1.725f, 0.775f)
                curveToRelative(-0.481f, 0.482f, -0.775f, 1.11f, -0.775f, 1.725f)
                curveToRelative(0.0f, 0.614f, 0.295f, 1.243f, 0.777f, 1.725f)
                curveToRelative(0.483f, 0.481f, 1.112f, 0.775f, 1.727f, 0.775f)
                reflectiveCurveToRelative(1.242f, -0.294f, 1.723f, -0.775f)
                curveToRelative(0.48f, -0.482f, 0.773f, -1.11f, 0.773f, -1.725f)
                reflectiveCurveToRelative(-0.294f, -1.243f, -0.775f, -1.725f)
                curveToRelative(-0.482f, -0.481f, -1.11f, -0.775f, -1.725f, -0.775f)
                moveTo(18.0f, 13.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
            .build()
        return _walkieTalkieLarge!!
    }

private var _walkieTalkieLarge: ImageVector? = null
