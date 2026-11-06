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
                moveTo(4.5f, 6.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(4.5f)
                moveTo(5.0f, 7.71f)
                verticalLineToRelative(8.583f)
                lineToRelative(4.286f, -4.286f)
                close()
                moveTo(5.707f, 17.0f)
                horizontalLineToRelative(12.585f)
                lineToRelative(-4.304f, -4.296f)
                lineToRelative(-1.655f, 1.65f)
                lineToRelative(-0.354f, 0.353f)
                lineToRelative(-0.353f, -0.354f)
                lineToRelative(-1.634f, -1.638f)
                close()
                moveTo(19.0f, 16.294f)
                verticalLineTo(7.705f)
                lineToRelative(-4.304f, 4.293f)
                close()
                moveTo(18.29f, 7.0f)
                horizontalLineTo(5.706f)
                lineToRelative(6.276f, 6.293f)
                close()
            }
        }
        .build()
        return _envelopeSmall!!
    }

private var _envelopeSmall: ImageVector? = null
