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

public val SBBIcons.ChartLineLarge: ImageVector
    get() {
        if (_chartLineLarge != null) {
            return _chartLineLarge!!
        }
        _chartLineLarge = Builder(name = "ChartLineLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 44.293f)
                verticalLineTo(5.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(41.0f)
                horizontalLineToRelative(44.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(3.707f)
                lineToRelative(8.566f, -8.566f)
                lineToRelative(8.393f, -2.962f)
                lineToRelative(0.209f, -0.075f)
                lineToRelative(0.086f, -0.203f)
                lineTo(24.832f, 24.0f)
                horizontalLineToRelative(6.067f)
                lineToRelative(0.088f, -0.39f)
                lineTo(33.398f, 13.0f)
                horizontalLineToRelative(5.327f)
                lineToRelative(0.149f, -0.168f)
                lineToRelative(4.0f, -4.5f)
                lineToRelative(-0.748f, -0.664f)
                lineTo(38.276f, 12.0f)
                horizontalLineTo(32.6f)
                lineToRelative(-0.088f, 0.39f)
                lineTo(30.102f, 23.0f)
                horizontalLineToRelative(-5.934f)
                lineToRelative(-0.129f, 0.306f)
                lineToRelative(-3.915f, 9.296f)
                lineToRelative(-8.29f, 2.926f)
                lineToRelative(-0.107f, 0.038f)
                close()
            }
        }
        .build()
        return _chartLineLarge!!
    }

private var _chartLineLarge: ImageVector? = null
