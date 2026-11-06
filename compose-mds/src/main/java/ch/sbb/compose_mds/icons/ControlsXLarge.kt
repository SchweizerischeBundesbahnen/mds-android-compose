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

public val SBBIcons.ControlsXLarge: ImageVector
    get() {
        if (_controlsXLarge != null) {
            return _controlsXLarge!!
        }
        _controlsXLarge = Builder(name = "ControlsXLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(43.854f, 29.854f)
                lineTo(37.207f, 36.5f)
                lineToRelative(6.646f, 6.647f)
                lineToRelative(-0.706f, 0.706f)
                lineToRelative(-6.647f, -6.646f)
                lineToRelative(-6.646f, 6.646f)
                lineToRelative(-0.707f, -0.706f)
                lineToRelative(6.646f, -6.647f)
                lineToRelative(-6.646f, -6.646f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(6.646f, 6.646f)
                lineToRelative(6.647f, -6.646f)
                close()
                moveTo(16.5f, 32.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 4.472f, 4.0f)
                horizontalLineTo(25.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-4.028f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -8.944f, 0.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(8.028f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 4.472f, -4.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, -7.0f)
                moveToRelative(14.0f, -13.0f)
                curveToRelative(2.367f, 0.0f, 4.235f, 1.71f, 4.474f, 4.0f)
                horizontalLineTo(44.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(34.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.984f, -1.516f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveTo(27.0f, 22.516f, 27.0f, 24.5f)
                verticalLineToRelative(0.5f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(22.026f)
                curveToRelative(0.24f, -2.29f, 2.107f, -4.0f, 4.474f, -4.0f)
                moveToRelative(-14.0f, -12.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 4.472f, 4.0f)
                horizontalLineTo(44.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(20.972f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -8.944f, 0.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(8.028f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 16.5f, 8.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, -7.0f)
            }
        }
        .build()
        return _controlsXLarge!!
    }

private var _controlsXLarge: ImageVector? = null
