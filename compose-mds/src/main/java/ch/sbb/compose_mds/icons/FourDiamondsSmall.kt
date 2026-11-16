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
                moveTo(10.586f, 12.0f)
                lineTo(6.343f, 7.757f)
                lineTo(2.101f, 12.0f)
                lineToRelative(4.242f, 4.243f)
                close()
                moveTo(9.172f, 12.0f)
                lineTo(6.343f, 14.828f)
                lineTo(3.515f, 12.0f)
                lineToRelative(2.828f, -2.828f)
                close()
                moveTo(16.242f, 6.343f)
                lineTo(12.0f, 2.101f)
                lineTo(7.757f, 6.343f)
                lineTo(12.0f, 10.586f)
                close()
                moveTo(14.828f, 6.343f)
                lineTo(12.0f, 9.172f)
                lineTo(9.172f, 6.343f)
                lineTo(12.0f, 3.515f)
                close()
                moveTo(12.0f, 13.414f)
                lineToRelative(4.243f, 4.243f)
                lineTo(12.0f, 21.9f)
                lineToRelative(-4.243f, -4.243f)
                close()
                moveTo(12.0f, 20.485f)
                lineTo(14.829f, 17.657f)
                lineTo(12.0f, 14.828f)
                lineToRelative(-2.828f, 2.829f)
                close()
                moveTo(21.9f, 12.0f)
                lineToRelative(-4.243f, -4.243f)
                lineTo(13.414f, 12.0f)
                lineToRelative(4.243f, 4.243f)
                close()
                moveTo(20.485f, 12.0f)
                lineTo(17.657f, 14.828f)
                lineTo(14.829f, 12.0f)
                lineToRelative(2.828f, -2.828f)
                close()
            }
        }
        .build()
        return _fourDiamondsSmall!!
    }

private var _fourDiamondsSmall: ImageVector? = null
