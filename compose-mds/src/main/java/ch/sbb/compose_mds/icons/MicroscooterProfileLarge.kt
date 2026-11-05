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

public val SBBIcons.MicroscooterProfileLarge: ImageVector
    get() {
        if (_microscooterProfileLarge != null) {
            return _microscooterProfileLarge!!
        }
        _microscooterProfileLarge = Builder(
            name = "MicroscooterProfileLarge",
            defaultWidth =
                48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight =
            48.0f,
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
                moveTo(35.999f, 29.999f)
                lineTo(35.5f, 29.999f)
                curveToRelative(-2.34f, 0.0f, -3.424f, 0.922f, -3.951f, 1.766f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, false, -0.549f, 1.71f)
                lineToRelative(-0.001f, 0.023f)
                verticalLineToRelative(0.501f)
                lineTo(14.964f, 33.999f)
                quadToRelative(0.035f, 0.245f, 0.036f, 0.5f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                curveToRelative(1.394f, 0.0f, 2.6f, 0.819f, 3.162f, 2.0f)
                lineTo(30.05f, 32.999f)
                quadToRelative(0.014f, -0.105f, 0.039f, -0.227f)
                curveToRelative(0.087f, -0.416f, 0.262f, -0.975f, 0.613f, -1.538f)
                curveToRelative(0.676f, -1.081f, 1.959f, -2.094f, 4.298f, -2.221f)
                lineTo(35.0f, 11.999f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(35.5f, 30.999f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                moveToRelative(-24.0f, 1.0f)
                arcToRelative(2.504f, 2.504f, 0.0f, false, false, -2.5f, 2.5f)
                curveToRelative(0.0f, 1.378f, 1.122f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.122f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.122f, -2.5f, -2.5f, -2.5f)
                moveToRelative(24.0f, 0.0f)
                arcToRelative(2.504f, 2.504f, 0.0f, false, false, -2.5f, 2.5f)
                curveToRelative(0.0f, 1.378f, 1.122f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.122f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.122f, -2.5f, -2.5f, -2.5f)
                moveTo(11.5f, 33.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(24.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(-24.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveToRelative(24.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
            }
        }
            .build()
        return _microscooterProfileLarge!!
    }

private var _microscooterProfileLarge: ImageVector? = null
