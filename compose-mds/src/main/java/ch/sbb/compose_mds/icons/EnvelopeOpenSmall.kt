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

public val SBBIcons.EnvelopeOpenSmall: ImageVector
    get() {
        if (_envelopeOpenSmall != null) {
            return _envelopeOpenSmall!!
        }
        _envelopeOpenSmall = Builder(name = "EnvelopeOpenSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(19.827f, 10.122f)
                lineToRelative(-7.5f, -6.5f)
                lineTo(12.0f, 3.338f)
                lineToRelative(-0.327f, 0.284f)
                lineToRelative(-7.5f, 6.5f)
                lineToRelative(-0.173f, 0.15f)
                lineTo(4.0f, 22.0f)
                horizontalLineToRelative(16.0f)
                lineTo(20.0f, 10.27f)
                close()
                moveTo(5.0f, 11.705f)
                verticalLineToRelative(8.589f)
                lineToRelative(4.304f, -4.293f)
                close()
                moveTo(5.71f, 21.0f)
                horizontalLineToRelative(12.584f)
                lineToRelative(-6.275f, -6.293f)
                close()
                moveTo(19.0f, 20.29f)
                verticalLineToRelative(-8.583f)
                lineToRelative(-4.286f, 4.285f)
                close()
                moveTo(18.767f, 10.526f)
                lineTo(12.0f, 4.66f)
                lineToRelative(-6.767f, 5.864f)
                lineToRelative(4.779f, 4.77f)
                lineToRelative(1.655f, -1.65f)
                lineToRelative(0.354f, -0.352f)
                lineToRelative(0.353f, 0.353f)
                lineToRelative(1.634f, 1.638f)
                close()
            }
        }
        .build()
        return _envelopeOpenSmall!!
    }

private var _envelopeOpenSmall: ImageVector? = null
