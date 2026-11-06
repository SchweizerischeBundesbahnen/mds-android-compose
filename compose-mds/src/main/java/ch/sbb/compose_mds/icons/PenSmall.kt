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

public val SBBIcons.PenSmall: ImageVector
    get() {
        if (_penSmall != null) {
            return _penSmall!!
        }
        _penSmall = Builder(name = "PenSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(17.353f, 4.356f)
                lineToRelative(-0.354f, -0.353f)
                lineToRelative(-0.353f, 0.353f)
                lineToRelative(-2.29f, 2.29f)
                lineToRelative(-0.353f, 0.354f)
                lineToRelative(0.353f, 0.353f)
                lineToRelative(2.29f, 2.29f)
                lineToRelative(0.355f, 0.355f)
                lineToRelative(0.353f, -0.355f)
                lineToRelative(2.29f, -2.3f)
                lineToRelative(0.353f, -0.353f)
                lineToRelative(-0.354f, -0.353f)
                close()
                moveTo(15.417f, 7.0f)
                lineToRelative(1.584f, -1.584f)
                lineToRelative(1.582f, 1.576f)
                lineToRelative(-1.584f, 1.59f)
                close()
                moveTo(13.354f, 8.357f)
                lineTo(13.0f, 8.003f)
                lineToRelative(-0.354f, 0.354f)
                lineToRelative(-7.5f, 7.5f)
                lineToRelative(-0.146f, 0.146f)
                lineTo(5.0f, 19.0f)
                horizontalLineToRelative(2.997f)
                lineToRelative(0.147f, -0.146f)
                lineToRelative(7.5f, -7.501f)
                lineToRelative(0.353f, -0.354f)
                lineToRelative(-0.354f, -0.353f)
                close()
                moveTo(6.0f, 16.417f)
                lineToRelative(7.0f, -7.0f)
                lineTo(14.583f, 11.0f)
                lineToRelative(-7.0f, 7.001f)
                lineTo(6.0f, 18.001f)
                close()
            }
        }
        .build()
        return _penSmall!!
    }

private var _penSmall: ImageVector? = null
