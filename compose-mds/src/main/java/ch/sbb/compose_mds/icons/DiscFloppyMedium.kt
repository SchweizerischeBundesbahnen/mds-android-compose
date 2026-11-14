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

public val SBBIcons.DiscFloppyMedium: ImageVector
    get() {
        if (_discFloppyMedium != null) {
            return _discFloppyMedium!!
        }
        _discFloppyMedium = Builder(name = "DiscFloppyMedium", defaultWidth = 36.0.dp, defaultHeight
                = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(29.75f, 24.901f)
                lineTo(29.75f, 6.25f)
                lineTo(6.25f, 6.25f)
                verticalLineToRelative(23.5f)
                horizontalLineToRelative(20.268f)
                close()
                moveTo(10.75f, 28.75f)
                horizontalLineToRelative(-3.5f)
                lineTo(7.25f, 7.25f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(14.5f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(17.349f)
                lineToRelative(-2.768f, 4.151f)
                horizontalLineToRelative(-0.732f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(-14.5f)
                close()
                moveTo(11.75f, 15.25f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(12.5f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(11.75f, 28.75f)
                horizontalLineToRelative(12.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(-12.5f)
                close()
                moveTo(22.5f, 10.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(22.5f, 12.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(22.25f, 27.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _discFloppyMedium!!
    }

private var _discFloppyMedium: ImageVector? = null
