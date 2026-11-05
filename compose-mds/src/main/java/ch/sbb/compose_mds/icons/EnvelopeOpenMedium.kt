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

public val SBBIcons.EnvelopeOpenMedium: ImageVector
    get() {
        if (_envelopeOpenMedium != null) {
            return _envelopeOpenMedium!!
        }
        _envelopeOpenMedium = Builder(name = "EnvelopeOpenMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.328f, 5.622f)
                lineTo(18.0f, 5.338f)
                lineToRelative(-0.328f, 0.284f)
                lineToRelative(-11.25f, 9.75f)
                lineToRelative(-0.172f, 0.15f)
                verticalLineToRelative(17.227f)
                horizontalLineToRelative(23.5f)
                lineTo(29.75f, 15.521f)
                lineToRelative(-0.172f, -0.15f)
                close()
                moveTo(7.25f, 16.956f)
                verticalLineToRelative(14.089f)
                lineToRelative(7.06f, -7.042f)
                close()
                moveTo(7.96f, 31.75f)
                horizontalLineToRelative(20.085f)
                lineTo(18.03f, 21.707f)
                close()
                moveTo(28.75f, 31.04f)
                lineTo(28.75f, 16.957f)
                lineToRelative(-7.032f, 7.032f)
                close()
                moveTo(28.517f, 15.776f)
                lineTo(18.0f, 6.66f)
                lineTo(7.483f, 15.776f)
                lineToRelative(7.536f, 7.52f)
                lineToRelative(2.658f, -2.65f)
                lineToRelative(0.354f, -0.354f)
                lineToRelative(0.353f, 0.354f)
                lineToRelative(2.628f, 2.635f)
                close()
            }
        }
        .build()
        return _envelopeOpenMedium!!
    }

private var _envelopeOpenMedium: ImageVector? = null
