package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.ArrowsLongUpDownLarge: ImageVector
    get() {
        if (_arrowsLongUpDownLarge != null) {
            return _arrowsLongUpDownLarge!!
        }
        _arrowsLongUpDownLarge = Builder(name = "ArrowsLongUpDownLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.861f, 9.155f)
                lineToRelative(6.283f, 6.284f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-5.43f, -5.43f)
                lineTo(16.007f, 40.99f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-30.28f)
                lineToRelative(-5.444f, 5.435f)
                lineToRelative(-0.353f, -0.353f)
                lineToRelative(-0.354f, -0.355f)
                lineToRelative(6.3f, -6.283f)
                lineToRelative(0.353f, -0.353f)
                close()
                moveTo(34.008f, 38.263f)
                lineTo(39.437f, 32.835f)
                lineTo(40.144f, 33.542f)
                lineTo(33.861f, 39.826f)
                lineTo(33.509f, 40.179f)
                lineTo(33.155f, 39.826f)
                lineTo(26.856f, 33.542f)
                lineTo(27.563f, 32.835f)
                lineTo(33.008f, 38.265f)
                lineTo(33.008f, 7.99f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _arrowsLongUpDownLarge!!
    }

private var _arrowsLongUpDownLarge: ImageVector? = null
