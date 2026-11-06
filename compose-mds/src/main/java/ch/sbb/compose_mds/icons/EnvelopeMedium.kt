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

public val SBBIcons.EnvelopeMedium: ImageVector
    get() {
        if (_envelopeMedium != null) {
            return _envelopeMedium!!
        }
        _envelopeMedium = Builder(name = "EnvelopeMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.75f, 9.25f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(23.5f)
                lineTo(29.75f, 9.25f)
                horizontalLineToRelative(-23.0f)
                moveToRelative(0.5f, 1.71f)
                verticalLineToRelative(14.082f)
                lineToRelative(7.032f, -7.032f)
                close()
                moveTo(7.957f, 25.75f)
                horizontalLineToRelative(20.085f)
                lineToRelative(-7.06f, -7.047f)
                lineToRelative(-2.659f, 2.651f)
                lineToRelative(-0.354f, 0.353f)
                lineToRelative(-0.353f, -0.354f)
                lineToRelative(-2.628f, -2.635f)
                close()
                moveTo(28.75f, 25.044f)
                lineTo(28.75f, 10.955f)
                lineToRelative(-7.06f, 7.041f)
                close()
                moveTo(28.04f, 10.25f)
                lineTo(7.956f, 10.25f)
                lineTo(17.97f, 20.293f)
                close()
            }
        }
        .build()
        return _envelopeMedium!!
    }

private var _envelopeMedium: ImageVector? = null
