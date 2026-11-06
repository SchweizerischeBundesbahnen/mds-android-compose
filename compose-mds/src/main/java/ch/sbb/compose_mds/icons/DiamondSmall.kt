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
                moveTo(6.232f, 2.0f)
                horizontalLineToRelative(11.536f)
                lineToRelative(0.148f, 0.223f)
                lineToRelative(4.0f, 6.0f)
                lineToRelative(0.198f, 0.296f)
                lineToRelative(-0.216f, 0.284f)
                lineToRelative(-9.5f, 12.5f)
                lineToRelative(-0.398f, 0.523f)
                lineToRelative(-0.398f, -0.524f)
                lineToRelative(-9.5f, -12.5f)
                lineToRelative(-0.216f, -0.283f)
                lineToRelative(0.198f, -0.296f)
                lineToRelative(4.0f, -6.0f)
                close()
                moveTo(3.434f, 8.0f)
                lineToRelative(2.89f, -4.335f)
                lineTo(7.615f, 8.0f)
                close()
                moveTo(10.74f, 18.515f)
                lineTo(3.508f, 9.0f)
                horizontalLineToRelative(4.403f)
                close()
                moveTo(20.492f, 9.0f)
                lineToRelative(-7.232f, 9.515f)
                lineTo(16.09f, 9.0f)
                close()
                moveTo(17.675f, 3.665f)
                lineTo(20.566f, 8.0f)
                horizontalLineToRelative(-4.178f)
                close()
                moveTo(12.898f, 3.0f)
                horizontalLineToRelative(3.932f)
                lineToRelative(-1.275f, 4.288f)
                close()
                moveTo(11.102f, 3.0f)
                lineTo(8.445f, 7.289f)
                lineTo(7.17f, 3.0f)
                close()
                moveTo(9.182f, 8.0f)
                lineTo(12.0f, 3.45f)
                lineTo(14.82f, 8.0f)
                close()
                moveTo(12.0f, 19.245f)
                lineTo(15.046f, 9.0f)
                lineTo(8.954f, 9.0f)
                close()
            }
        }
        .build()
        return _diamondSmall!!
    }

private var _diamondSmall: ImageVector? = null
