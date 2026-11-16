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

public val SBBIcons.ListSmall: ImageVector
    get() {
        if (_listSmall != null) {
            return _listSmall!!
        }
        _listSmall = Builder(name = "ListSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.0f, 6.0f)
                lineTo(6.0f, 5.0f)
                lineTo(4.0f, 5.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(19.002f, 6.0f)
                lineTo(19.002f, 5.0f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(19.002f, 9.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-10.0f)
                lineTo(9.002f, 9.0f)
                close()
                moveTo(6.0f, 10.0f)
                lineTo(6.0f, 9.0f)
                lineTo(4.0f, 9.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(19.002f, 17.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(6.0f, 18.0f)
                verticalLineToRelative(-1.0f)
                lineTo(4.0f, 17.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(19.002f, 13.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(6.0f, 14.0f)
                verticalLineToRelative(-1.0f)
                lineTo(4.0f, 13.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _listSmall!!
    }

private var _listSmall: ImageVector? = null
