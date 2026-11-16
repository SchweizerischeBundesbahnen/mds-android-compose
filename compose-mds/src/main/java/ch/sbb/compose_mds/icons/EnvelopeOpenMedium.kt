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
                moveToRelative(29.577f, 15.372f)
                lineToRelative(-11.25f, -9.75f)
                lineTo(18.0f, 5.337f)
                lineToRelative(-0.327f, 0.285f)
                lineToRelative(-11.25f, 9.75f)
                lineToRelative(-0.173f, 0.149f)
                verticalLineToRelative(17.228f)
                horizontalLineToRelative(23.5f)
                lineTo(29.75f, 15.521f)
                close()
                moveTo(7.25f, 16.955f)
                verticalLineToRelative(14.089f)
                lineToRelative(7.06f, -7.042f)
                close()
                moveTo(7.96f, 31.75f)
                horizontalLineToRelative(20.084f)
                lineTo(18.028f, 21.707f)
                close()
                moveTo(28.75f, 31.04f)
                lineTo(28.75f, 16.956f)
                lineToRelative(-7.032f, 7.032f)
                close()
                moveTo(28.517f, 15.775f)
                lineTo(18.0f, 6.661f)
                lineTo(7.483f, 15.775f)
                lineToRelative(7.535f, 7.522f)
                lineToRelative(2.659f, -2.652f)
                lineToRelative(0.352f, 0.355f)
                horizontalLineToRelative(0.001f)
                lineToRelative(-0.353f, -0.355f)
                lineToRelative(0.354f, -0.352f)
                lineToRelative(0.353f, 0.353f)
                lineToRelative(2.628f, 2.635f)
                close()
            }
        }
        .build()
        return _envelopeOpenMedium!!
    }

private var _envelopeOpenMedium: ImageVector? = null
