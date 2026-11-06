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
                moveTo(2.0f, 5.0f)
                verticalLineToRelative(41.0f)
                horizontalLineToRelative(44.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(3.707f)
                lineToRelative(8.566f, -8.566f)
                lineToRelative(8.393f, -2.962f)
                lineToRelative(0.209f, -0.074f)
                lineToRelative(0.086f, -0.204f)
                lineTo(24.832f, 24.0f)
                horizontalLineTo(30.9f)
                lineToRelative(0.088f, -0.39f)
                lineTo(33.399f, 13.0f)
                horizontalLineToRelative(5.325f)
                lineToRelative(0.15f, -0.168f)
                lineToRelative(4.0f, -4.5f)
                lineToRelative(-0.748f, -0.664f)
                lineTo(38.276f, 12.0f)
                horizontalLineTo(32.6f)
                lineToRelative(-0.088f, 0.39f)
                lineTo(30.101f, 23.0f)
                horizontalLineToRelative(-5.933f)
                lineToRelative(-0.129f, 0.306f)
                lineToRelative(-3.914f, 9.296f)
                lineToRelative(-8.291f, 2.927f)
                lineToRelative(-0.107f, 0.037f)
                lineToRelative(-0.08f, 0.08f)
                lineTo(3.0f, 44.293f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _chartLineLarge!!
    }

private var _chartLineLarge: ImageVector? = null
