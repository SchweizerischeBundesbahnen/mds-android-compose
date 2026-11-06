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

public val SBBIcons.FourDiamondsSmall: ImageVector
    get() {
        if (_fourDiamondsSmall != null) {
            return _fourDiamondsSmall!!
        }
        _fourDiamondsSmall = Builder(name = "FourDiamondsSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.454f, 11.646f)
                lineTo(2.101f, 12.0f)
                lineToRelative(0.353f, 0.354f)
                lineToRelative(3.536f, 3.535f)
                lineToRelative(0.353f, 0.354f)
                lineToRelative(0.354f, -0.354f)
                lineToRelative(3.535f, -3.535f)
                lineToRelative(0.354f, -0.354f)
                lineToRelative(-0.354f, -0.354f)
                lineToRelative(-3.535f, -3.535f)
                lineToRelative(-0.354f, -0.354f)
                lineToRelative(-0.353f, 0.354f)
                close()
                moveTo(6.344f, 14.828f)
                lineTo(3.513f, 12.0f)
                lineToRelative(2.83f, -2.828f)
                lineTo(9.171f, 12.0f)
                close()
                moveTo(8.11f, 5.99f)
                lineToRelative(-0.354f, 0.353f)
                lineToRelative(0.354f, 0.354f)
                lineToRelative(3.535f, 3.535f)
                lineToRelative(0.354f, 0.354f)
                lineToRelative(0.354f, -0.354f)
                lineToRelative(3.535f, -3.535f)
                lineToRelative(0.354f, -0.354f)
                lineToRelative(-0.354f, -0.353f)
                lineToRelative(-3.535f, -3.536f)
                lineTo(12.0f, 2.101f)
                lineToRelative(-0.354f, 0.353f)
                close()
                moveTo(12.0f, 9.172f)
                lineTo(9.17f, 6.343f)
                lineToRelative(2.83f, -2.828f)
                lineToRelative(2.828f, 2.828f)
                close()
                moveTo(7.756f, 17.657f)
                lineTo(8.11f, 17.303f)
                lineTo(11.645f, 13.768f)
                lineTo(11.999f, 13.414f)
                lineTo(12.353f, 13.768f)
                lineTo(15.888f, 17.303f)
                lineTo(16.242f, 17.657f)
                lineTo(15.888f, 18.01f)
                lineTo(12.353f, 21.546f)
                lineTo(12.0f, 21.9f)
                lineToRelative(-0.354f, -0.354f)
                lineToRelative(-3.535f, -3.536f)
                close()
                moveTo(9.171f, 17.657f)
                lineTo(12.0f, 20.485f)
                lineToRelative(2.829f, -2.828f)
                lineTo(12.0f, 14.828f)
                close()
                moveTo(13.767f, 11.647f)
                lineTo(13.413f, 12.0f)
                lineTo(13.767f, 12.354f)
                lineTo(17.302f, 15.889f)
                lineTo(17.656f, 16.243f)
                lineTo(18.01f, 15.889f)
                lineTo(21.545f, 12.354f)
                lineTo(21.9f, 12.0f)
                lineToRelative(-0.354f, -0.354f)
                lineToRelative(-3.535f, -3.535f)
                lineToRelative(-0.354f, -0.354f)
                lineToRelative(-0.354f, 0.354f)
                close()
                moveTo(17.656f, 14.828f)
                lineTo(14.829f, 12.0f)
                lineToRelative(2.828f, -2.828f)
                lineTo(20.485f, 12.0f)
                close()
            }
        }
        .build()
        return _fourDiamondsSmall!!
    }

private var _fourDiamondsSmall: ImageVector? = null
