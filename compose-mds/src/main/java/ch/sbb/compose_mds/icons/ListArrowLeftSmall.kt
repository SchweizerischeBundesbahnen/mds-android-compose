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

public val SBBIcons.ListArrowLeftSmall: ImageVector
    get() {
        if (_listArrowLeftSmall != null) {
            return _listArrowLeftSmall!!
        }
        _listArrowLeftSmall = Builder(name = "ListArrowLeftSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.5f, 2.5f)
                verticalLineToRelative(10.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 6.0f, 20.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-1.0f)
                lineTo(9.5f, 19.0f)
                lineTo(9.5f, 6.0f)
                lineTo(17.0f, 6.0f)
                lineTo(17.0f, 5.0f)
                close()
                moveTo(8.5f, 6.0f)
                lineTo(6.0f, 6.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, 1.5f)
                verticalLineToRelative(10.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.0f, 19.0f)
                horizontalLineToRelative(2.5f)
                close()
                moveTo(14.203f, 12.008f)
                horizontalLineToRelative(6.287f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-6.283f)
                lineToRelative(3.137f, 3.138f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-3.99f, -3.992f)
                lineToRelative(-0.353f, -0.353f)
                lineToRelative(0.352f, -0.353f)
                lineToRelative(3.99f, -4.008f)
                lineToRelative(0.709f, 0.706f)
                close()
            }
        }
        .build()
        return _listArrowLeftSmall!!
    }

private var _listArrowLeftSmall: ImageVector? = null
