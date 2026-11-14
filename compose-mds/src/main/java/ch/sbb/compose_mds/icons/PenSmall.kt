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
                moveToRelative(19.643f, 6.637f)
                lineToRelative(-2.29f, -2.282f)
                lineToRelative(-0.354f, -0.351f)
                lineTo(14.003f, 7.0f)
                lineTo(17.0f, 9.998f)
                lineToRelative(0.354f, -0.355f)
                lineToRelative(2.29f, -2.3f)
                lineToRelative(0.352f, -0.354f)
                close()
                moveTo(16.999f, 8.582f)
                lineTo(15.417f, 7.0f)
                lineTo(17.0f, 5.416f)
                lineToRelative(1.582f, 1.575f)
                close()
                moveTo(15.644f, 10.646f)
                lineTo(13.354f, 8.356f)
                lineTo(13.0f, 8.004f)
                lineToRelative(-8.0f, 8.0f)
                lineTo(5.0f, 19.0f)
                horizontalLineToRelative(2.997f)
                lineToRelative(0.147f, -0.146f)
                lineToRelative(7.5f, -7.501f)
                lineToRelative(0.353f, -0.354f)
                close()
                moveTo(6.0f, 18.0f)
                verticalLineToRelative(-1.583f)
                lineToRelative(7.0f, -7.0f)
                lineToRelative(1.582f, 1.582f)
                lineTo(7.583f, 18.0f)
                close()
            }
        }
        .build()
        return _penSmall!!
    }

private var _penSmall: ImageVector? = null
