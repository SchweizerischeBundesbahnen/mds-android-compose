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
                moveTo(5.5f, 10.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(28.0f)
                horizontalLineToRelative(38.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(5.5f)
                moveToRelative(0.5f, 1.707f)
                verticalLineToRelative(24.586f)
                lineTo(18.293f, 24.0f)
                close()
                moveTo(6.707f, 37.0f)
                horizontalLineToRelative(34.586f)
                lineTo(29.0f, 24.707f)
                lineToRelative(-4.646f, 4.647f)
                lineToRelative(-0.354f, 0.353f)
                lineToRelative(-0.354f, -0.353f)
                lineTo(19.0f, 24.707f)
                close()
                moveTo(42.0f, 36.293f)
                verticalLineTo(11.707f)
                lineTo(29.707f, 24.0f)
                close()
                moveTo(41.293f, 11.0f)
                horizontalLineTo(6.707f)
                lineTo(24.0f, 28.293f)
                close()
            }
        }
        .build()
        return _envelopeLarge!!
    }

private var _envelopeLarge: ImageVector? = null
