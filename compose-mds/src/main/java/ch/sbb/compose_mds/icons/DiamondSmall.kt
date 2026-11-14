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

public val SBBIcons.DiamondSmall: ImageVector
    get() {
        if (_diamondSmall != null) {
            return _diamondSmall!!
        }
        _diamondSmall = Builder(name = "DiamondSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(17.768f, 2.0f)
                lineToRelative(4.345f, 6.519f)
                lineToRelative(-0.215f, 0.284f)
                lineToRelative(-9.5f, 12.5f)
                lineToRelative(-0.398f, 0.523f)
                lineToRelative(-0.398f, -0.523f)
                lineToRelative(-9.5f, -12.5f)
                lineToRelative(-0.215f, -0.284f)
                lineTo(6.232f, 2.0f)
                close()
                moveTo(7.613f, 8.0f)
                horizontalLineToRelative(-4.18f)
                lineToRelative(2.891f, -4.335f)
                close()
                moveTo(8.446f, 7.289f)
                lineTo(7.17f, 3.0f)
                horizontalLineToRelative(3.931f)
                close()
                moveTo(9.18f, 8.0f)
                lineToRelative(2.82f, -4.55f)
                lineTo(14.818f, 8.0f)
                close()
                moveTo(15.554f, 7.288f)
                lineTo(12.898f, 3.0f)
                horizontalLineToRelative(3.932f)
                close()
                moveTo(20.564f, 8.0f)
                lineTo(17.674f, 3.665f)
                lineTo(16.388f, 8.0f)
                close()
                moveTo(16.09f, 9.0f)
                horizontalLineToRelative(4.401f)
                lineToRelative(-7.23f, 9.513f)
                close()
                moveTo(7.91f, 9.0f)
                lineToRelative(2.829f, 9.514f)
                lineTo(3.509f, 9.0f)
                close()
                moveTo(12.0f, 19.245f)
                lineTo(8.954f, 9.0f)
                horizontalLineToRelative(6.092f)
                close()
            }
        }
        .build()
        return _diamondSmall!!
    }

private var _diamondSmall: ImageVector? = null
