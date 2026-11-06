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

public val SBBIcons.ListLarge: ImageVector
    get() {
        if (_listLarge != null) {
            return _listLarge!!
        }
        _listLarge = Builder(name = "ListLarge", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.0f, 10.0f)
                lineTo(3.0f, 10.0f)
                lineTo(3.0f, 9.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(14.0f, 10.0f)
                horizontalLineToRelative(30.0f)
                lineTo(44.0f, 9.0f)
                lineTo(14.0f, 9.0f)
                close()
                moveTo(14.0f, 20.0f)
                horizontalLineToRelative(30.0f)
                verticalLineToRelative(-1.0f)
                lineTo(14.0f, 19.0f)
                close()
                moveTo(44.0f, 30.0f)
                lineTo(14.0f, 30.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(30.0f)
                close()
                moveTo(14.0f, 40.0f)
                horizontalLineToRelative(30.0f)
                verticalLineToRelative(-1.0f)
                lineTo(14.0f, 39.0f)
                close()
                moveTo(3.0f, 20.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-1.0f)
                lineTo(3.0f, 19.0f)
                close()
                moveTo(10.0f, 30.0f)
                lineTo(3.0f, 30.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(3.0f, 40.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-1.0f)
                lineTo(3.0f, 39.0f)
                close()
            }
        }
        .build()
        return _listLarge!!
    }

private var _listLarge: ImageVector? = null
