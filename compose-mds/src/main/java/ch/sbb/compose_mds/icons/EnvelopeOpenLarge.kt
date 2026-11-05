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

public val SBBIcons.EnvelopeOpenLarge: ImageVector
    get() {
        if (_envelopeOpenLarge != null) {
            return _envelopeOpenLarge!!
        }
        _envelopeOpenLarge = Builder(
            name = "EnvelopeOpenLarge",
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
                pathFillType = EvenOdd,
            ) {
                moveTo(24.321f, 2.617f)
                lineTo(24.0f, 2.347f)
                lineToRelative(-0.321f, 0.27f)
                lineToRelative(-18.5f, 15.5f)
                lineToRelative(-0.179f, 0.15f)
                lineTo(5.0f, 46.0f)
                horizontalLineToRelative(38.0f)
                lineTo(43.0f, 18.267f)
                lineToRelative(-0.179f, -0.15f)
                close()
                moveTo(6.0f, 19.707f)
                verticalLineToRelative(24.586f)
                lineTo(18.293f, 32.0f)
                close()
                moveTo(6.707f, 45.0f)
                horizontalLineToRelative(34.586f)
                lineTo(24.0f, 27.707f)
                close()
                moveTo(42.0f, 44.293f)
                lineTo(42.0f, 19.707f)
                lineTo(29.707f, 32.0f)
                close()
                moveTo(41.76f, 18.533f)
                lineTo(24.0f, 3.653f)
                lineTo(6.24f, 18.532f)
                lineTo(19.0f, 31.293f)
                lineToRelative(4.646f, -4.647f)
                lineToRelative(0.354f, -0.353f)
                lineToRelative(0.354f, 0.353f)
                lineTo(29.0f, 31.293f)
                close()
            }
        }
            .build()
        return _envelopeOpenLarge!!
    }

private var _envelopeOpenLarge: ImageVector? = null
