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

public val SBBIcons.TramSmall: ImageVector
    get() {
        if (_tramSmall != null) {
            return _tramSmall!!
        }
        _tramSmall = Builder(name = "TramSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.5f, 4.0f)
                lineTo(10.0f, 4.0f)
                verticalLineToRelative(1.0f)
                lineTo(8.0f, 5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(2.066f)
                lineToRelative(-1.482f, 2.222f)
                lineToRelative(0.832f, 0.555f)
                lineTo(8.268f, 19.0f)
                horizontalLineToRelative(7.464f)
                lineToRelative(1.852f, 2.777f)
                lineToRelative(0.832f, -0.555f)
                lineTo(16.934f, 19.0f)
                lineTo(19.0f, 19.0f)
                lineTo(19.0f, 8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(14.0f, 4.0f)
                horizontalLineToRelative(-3.5f)
                moveTo(14.0f, 7.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(18.0f, 13.0f)
                lineTo(18.0f, 8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(8.0f, 6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(6.0f, 14.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(4.0f)
                lineTo(6.0f, 18.0f)
                close()
                moveTo(14.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.002f, 0.001f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 16.0f)
                moveToRelative(-5.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 9.002f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 15.0f)
            }
        }
        .build()
        return _tramSmall!!
    }

private var _tramSmall: ImageVector? = null
