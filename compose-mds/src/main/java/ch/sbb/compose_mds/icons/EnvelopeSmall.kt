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

public val SBBIcons.EnvelopeSmall: ImageVector
    get() {
        if (_envelopeSmall != null) {
            return _envelopeSmall!!
        }
        _envelopeSmall = Builder(name = "EnvelopeSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.0f, 18.0f)
                lineTo(20.0f, 6.0f)
                lineTo(4.0f, 6.0f)
                verticalLineToRelative(12.0f)
                close()
                moveTo(5.0f, 16.293f)
                lineToRelative(4.286f, -4.286f)
                lineTo(5.0f, 7.71f)
                close()
                moveTo(5.707f, 17.0f)
                horizontalLineToRelative(12.586f)
                lineToRelative(-4.305f, -4.296f)
                lineToRelative(-1.655f, 1.65f)
                lineToRelative(-0.354f, 0.353f)
                lineToRelative(-0.353f, -0.353f)
                lineToRelative(-1.634f, -1.639f)
                close()
                moveTo(19.0f, 16.294f)
                lineToRelative(-4.304f, -4.296f)
                lineTo(19.0f, 7.706f)
                close()
                moveTo(18.29f, 7.0f)
                lineToRelative(-6.31f, 6.292f)
                lineTo(5.705f, 7.0f)
                close()
            }
        }
        .build()
        return _envelopeSmall!!
    }

private var _envelopeSmall: ImageVector? = null
