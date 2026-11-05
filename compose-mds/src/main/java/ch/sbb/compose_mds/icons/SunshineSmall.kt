package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.SunshineSmall: ImageVector
    get() {
        if (_sunshineSmall != null) {
            return _sunshineSmall!!
        }
        _sunshineSmall = Builder(
            name = "SunshineSmall",
            defaultWidth = 24.0.dp,
            defaultHeight =
                24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveTo(12.012f, 7.003f)
                lineTo(12.012f, 3.988f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.015f)
                close()
                moveTo(6.039f, 6.669f)
                lineTo(8.316f, 8.946f)
                lineTo(9.023f, 8.239f)
                lineTo(6.746f, 5.962f)
                close()
                moveTo(12.5f, 9.0f)
                curveToRelative(-1.927f, 0.0f, -3.472f, 1.564f, -3.472f, 3.499f)
                arcToRelative(3.495f, 3.495f, 0.0f, false, false, 3.495f, 3.495f)
                arcTo(3.48f, 3.48f, 0.0f, false, false, 16.0f, 12.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                moveToRelative(-4.472f, 3.499f)
                curveTo(8.028f, 10.02f, 10.012f, 8.0f, 12.5f, 8.0f)
                curveToRelative(2.482f, 0.0f, 4.5f, 2.017f, 4.5f, 4.5f)
                arcToRelative(4.48f, 4.48f, 0.0f, false, true, -4.477f, 4.494f)
                arcToRelative(4.495f, 4.495f, 0.0f, false, true, -4.495f, -4.495f)
                moveTo(7.003f, 13.0f)
                lineTo(4.0f, 13.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.003f)
                close()
                moveTo(18.306f, 6.052f)
                lineTo(16.042f, 8.29f)
                lineToRelative(0.703f, 0.711f)
                lineToRelative(2.264f, -2.238f)
                close()
                moveTo(17.994f, 12.0f)
                lineTo(21.0f, 12.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.006f)
                close()
                moveTo(19.024f, 18.239f)
                lineTo(16.757f, 15.982f)
                lineTo(16.051f, 16.69f)
                lineTo(18.318f, 18.947f)
                close()
                moveTo(12.0f, 20.996f)
                verticalLineToRelative(-3.003f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.003f)
                close()
                moveTo(8.304f, 16.048f)
                lineTo(6.042f, 18.308f)
                lineTo(6.749f, 19.016f)
                lineTo(9.011f, 16.755f)
                close()
            }
        }
            .build()
        return _sunshineSmall!!
    }

private var _sunshineSmall: ImageVector? = null
