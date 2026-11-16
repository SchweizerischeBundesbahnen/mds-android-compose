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

public val SBBIcons.HouseSmall: ImageVector
    get() {
        if (_houseSmall != null) {
            return _houseSmall!!
        }
        _houseSmall = Builder(name = "HouseSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(19.647f, 12.353f)
                lineToRelative(0.707f, -0.707f)
                lineTo(12.0f, 3.293f)
                lineToRelative(-8.353f, 8.353f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(0.646f, -0.646f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(4.99f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(5.0f)
                horizontalLineTo(19.0f)
                verticalLineToRelative(-8.293f)
                close()
                moveTo(18.0f, 10.707f)
                lineToRelative(-6.0f, -6.0f)
                lineToRelative(-6.0f, 6.0f)
                verticalLineTo(19.0f)
                horizontalLineToRelative(2.99f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(5.0f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _houseSmall!!
    }

private var _houseSmall: ImageVector? = null
