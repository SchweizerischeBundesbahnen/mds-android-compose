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

public val SBBIcons.CirclePenLarge: ImageVector
    get() {
        if (_circlePenLarge != null) {
            return _circlePenLarge!!
        }
        _circlePenLarge = Builder(
            name = "CirclePenLarge",
            defaultWidth = 48.0.dp,
            defaultHeight =
                48.0.dp,
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
                moveTo(23.5f, 4.999f)
                curveToRelative(10.77f, 0.0f, 19.5f, 8.73f, 19.5f, 19.5f)
                reflectiveCurveToRelative(-8.73f, 19.5f, -19.5f, 19.5f)
                reflectiveCurveTo(4.0f, 35.269f, 4.0f, 24.499f)
                reflectiveCurveToRelative(8.73f, -19.5f, 19.5f, -19.5f)
                moveToRelative(0.0f, 1.0f)
                curveToRelative(-10.218f, 0.0f, -18.5f, 8.282f, -18.5f, 18.5f)
                reflectiveCurveToRelative(8.282f, 18.5f, 18.5f, 18.5f)
                reflectiveCurveTo(42.0f, 34.717f, 42.0f, 24.499f)
                reflectiveCurveToRelative(-8.282f, -18.5f, -18.5f, -18.5f)
                moveToRelative(6.352f, 7.566f)
                lineToRelative(4.58f, 4.563f)
                lineToRelative(0.355f, 0.352f)
                lineToRelative(-0.352f, 0.355f)
                lineToRelative(-4.0f, 4.017f)
                horizontalLineToRelative(-0.002f)
                lineToRelative(-11.0f, 11.001f)
                lineToRelative(-0.146f, 0.147f)
                lineTo(14.0f, 34.0f)
                verticalLineToRelative(-5.287f)
                lineToRelative(15.499f, -15.5f)
                close()
                moveTo(15.0f, 33.0f)
                horizontalLineToRelative(2.893f)
                lineTo(15.0f, 30.107f)
                close()
                moveTo(15.216f, 28.91f)
                lineTo(19.089f, 32.782f)
                lineTo(29.372f, 22.498f)
                lineTo(25.5f, 18.626f)
                close()
                moveTo(25.254f, 23.453f)
                lineTo(20.254f, 28.453f)
                lineTo(19.547f, 27.746f)
                lineTo(24.547f, 22.746f)
                close()
                moveTo(26.207f, 17.919f)
                lineTo(30.08f, 21.791f)
                lineTo(33.373f, 18.482f)
                lineTo(29.5f, 14.626f)
                close()
            }
        }
            .build()
        return _circlePenLarge!!
    }

private var _circlePenLarge: ImageVector? = null
