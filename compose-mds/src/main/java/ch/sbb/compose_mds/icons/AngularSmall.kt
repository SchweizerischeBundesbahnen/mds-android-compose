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

public val SBBIcons.AngularSmall: ImageVector
    get() {
        if (_angularSmall != null) {
            return _angularSmall!!
        }
        _angularSmall = Builder(name = "AngularSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(21.547f, 5.155f)
                lineToRelative(-0.389f, -0.13f)
                lineTo(12.0f, 1.973f)
                lineTo(2.842f, 5.025f)
                lineToRelative(-0.389f, 0.13f)
                lineToRelative(0.05f, 0.407f)
                lineToRelative(1.5f, 12.0f)
                lineToRelative(0.033f, 0.257f)
                lineToRelative(0.229f, 0.122f)
                lineToRelative(7.5f, 4.0f)
                lineToRelative(0.235f, 0.125f)
                lineToRelative(0.235f, -0.125f)
                lineToRelative(7.5f, -4.0f)
                lineToRelative(0.229f, -0.122f)
                lineToRelative(0.023f, -0.185f)
                lineToRelative(0.032f, -0.253f)
                lineToRelative(1.477f, -11.756f)
                horizontalLineToRelative(-0.008f)
                lineToRelative(0.008f, -0.063f)
                close()
                moveTo(19.057f, 17.005f)
                lineTo(20.452f, 5.845f)
                lineTo(12.5f, 3.193f)
                lineTo(12.5f, 6.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(11.5f, 3.193f)
                lineTo(3.547f, 5.845f)
                lineTo(4.964f, 17.18f)
                lineToRelative(6.536f, 3.486f)
                lineTo(11.5f, 14.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(6.131f)
                close()
                moveTo(12.424f, 7.735f)
                lineTo(17.424f, 15.735f)
                lineTo(16.576f, 16.265f)
                lineTo(14.848f, 13.5f)
                lineTo(9.152f, 13.5f)
                lineToRelative(-1.728f, 2.765f)
                lineToRelative(-0.848f, -0.53f)
                lineToRelative(5.0f, -8.0f)
                lineTo(12.0f, 7.057f)
                close()
                moveTo(9.777f, 12.5f)
                lineTo(12.0f, 8.942f)
                lineToRelative(2.223f, 3.558f)
                close()
            }
        }
        .build()
        return _angularSmall!!
    }

private var _angularSmall: ImageVector? = null
