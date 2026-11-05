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

public val SBBIcons.TwoHousesMedium: ImageVector
    get() {
        if (_twoHousesMedium != null) {
            return _twoHousesMedium!!
        }
        _twoHousesMedium = Builder(name = "TwoHousesMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(22.854f, 4.146f)
                lineToRelative(-0.354f, -0.354f)
                lineToRelative(-0.354f, 0.354f)
                lineTo(19.5f, 6.793f)
                lineToRelative(-1.146f, -1.147f)
                lineTo(18.0f, 5.293f)
                lineToRelative(-0.354f, 0.353f)
                lineToRelative(-12.0f, 12.0f)
                lineToRelative(0.708f, 0.707f)
                lineToRelative(1.396f, -1.396f)
                lineTo(7.75f, 29.75f)
                horizontalLineToRelative(6.985f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(7.015f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(4.5f)
                lineTo(32.75f, 15.457f)
                lineToRelative(1.396f, 1.396f)
                lineToRelative(0.707f, -0.707f)
                close()
                moveTo(31.75f, 14.456f)
                lineTo(22.5f, 5.206f)
                lineTo(20.207f, 7.5f)
                lineToRelative(10.147f, 10.146f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-1.397f, -1.396f)
                lineTo(28.25f, 27.25f)
                horizontalLineToRelative(3.5f)
                close()
                moveTo(27.25f, 15.956f)
                lineTo(18.0f, 6.707f)
                lineToRelative(-9.25f, 9.25f)
                lineTo(8.75f, 28.75f)
                horizontalLineToRelative(4.985f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(5.015f)
                close()
            }
        }
        .build()
        return _twoHousesMedium!!
    }

private var _twoHousesMedium: ImageVector? = null
