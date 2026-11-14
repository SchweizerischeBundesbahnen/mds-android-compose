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

public val SBBIcons.BackpackSmall: ImageVector
    get() {
        if (_backpackSmall != null) {
            return _backpackSmall!!
        }
        _backpackSmall = Builder(name = "BackpackSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.0f, 3.994f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 13.0f, 2.0f)
                horizontalLineToRelative(-1.996f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 1.996f)
                lineTo(9.004f, 4.1f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 5.0f, 9.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(14.0f)
                lineTo(19.0f, 9.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -3.999f, -4.9f)
                close()
                moveTo(14.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineToRelative(-1.996f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                close()
                moveTo(14.0f, 5.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(12.0f)
                lineTo(6.0f, 21.0f)
                lineTo(6.0f, 9.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                close()
                moveTo(15.0f, 13.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(5.0f)
                lineTo(7.0f, 20.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(0.004f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                close()
                moveTo(8.0f, 15.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(9.004f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                close()
                moveTo(9.0f, 15.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                lineTo(9.0f, 16.0f)
                close()
            }
        }
        .build()
        return _backpackSmall!!
    }

private var _backpackSmall: ImageVector? = null
