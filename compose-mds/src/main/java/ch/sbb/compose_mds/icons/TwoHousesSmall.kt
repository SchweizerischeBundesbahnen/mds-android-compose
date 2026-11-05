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

public val SBBIcons.TwoHousesSmall: ImageVector
    get() {
        if (_twoHousesSmall != null) {
            return _twoHousesSmall!!
        }
        _twoHousesSmall = Builder(name = "TwoHousesSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.354f, 2.646f)
                lineTo(15.0f, 2.292f)
                lineToRelative(-0.354f, 0.354f)
                lineTo(13.0f, 4.293f)
                lineToRelative(-0.646f, -0.647f)
                lineTo(12.0f, 3.293f)
                lineToRelative(-0.354f, 0.353f)
                lineToRelative(-8.0f, 8.0f)
                lineToRelative(0.708f, 0.707f)
                lineToRelative(0.646f, -0.646f)
                lineTo(5.0f, 20.0f)
                horizontalLineToRelative(4.99f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(5.0f)
                lineTo(19.0f, 20.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-8.293f)
                lineToRelative(0.646f, 0.646f)
                lineToRelative(0.708f, -0.707f)
                close()
                moveTo(21.0f, 9.706f)
                lineToRelative(-6.0f, -6.0f)
                lineTo(13.707f, 5.0f)
                lineToRelative(6.647f, 6.646f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-0.647f, -0.646f)
                lineTo(19.0f, 18.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(18.0f, 10.706f)
                lineTo(12.0f, 4.706f)
                lineTo(6.0f, 10.706f)
                lineTo(6.0f, 19.0f)
                horizontalLineToRelative(2.99f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(5.0f)
                lineTo(18.0f, 19.0f)
                close()
            }
        }
        .build()
        return _twoHousesSmall!!
    }

private var _twoHousesSmall: ImageVector? = null
