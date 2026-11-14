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

public val SBBIcons.EnvelopeLarge: ImageVector
    get() {
        if (_envelopeLarge != null) {
            return _envelopeLarge!!
        }
        _envelopeLarge = Builder(name = "EnvelopeLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.0f, 38.0f)
                horizontalLineToRelative(38.0f)
                lineTo(43.0f, 10.0f)
                lineTo(5.0f, 10.0f)
                close()
                moveTo(6.0f, 36.293f)
                lineTo(18.293f, 24.0f)
                lineTo(6.0f, 11.707f)
                close()
                moveTo(6.707f, 37.0f)
                horizontalLineToRelative(34.586f)
                lineTo(29.0f, 24.707f)
                lineToRelative(-5.0f, 5.0f)
                lineToRelative(-5.0f, -5.0f)
                close()
                moveTo(42.0f, 36.293f)
                lineTo(42.0f, 11.707f)
                lineTo(29.707f, 24.0f)
                close()
                moveTo(41.293f, 11.0f)
                lineTo(6.707f, 11.0f)
                lineTo(24.0f, 28.293f)
                close()
            }
        }
        .build()
        return _envelopeLarge!!
    }

private var _envelopeLarge: ImageVector? = null
