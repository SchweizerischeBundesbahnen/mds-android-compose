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

public val SBBIcons.SuitcaseDisabledLarge: ImageVector
    get() {
        if (_suitcaseDisabledLarge != null) {
            return _suitcaseDisabledLarge!!
        }
        _suitcaseDisabledLarge = Builder(name = "SuitcaseDisabledLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(46.354f, 44.647f)
                lineToRelative(-0.707f, 0.707f)
                lineTo(40.293f, 40.0f)
                lineTo(5.5f, 40.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 3.0f, 37.5f)
                verticalLineToRelative(-22.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 5.5f, 13.0f)
                horizontalLineToRelative(7.793f)
                lineTo(2.647f, 2.354f)
                lineToRelative(0.707f, -0.707f)
                close()
                moveTo(14.293f, 14.0f)
                lineTo(35.0f, 34.707f)
                lineTo(35.0f, 39.0f)
                lineTo(13.0f, 39.0f)
                lineTo(13.0f, 14.0f)
                close()
                moveTo(36.0f, 39.0f)
                verticalLineToRelative(-3.293f)
                lineToRelative(2.0f, 2.0f)
                lineTo(38.0f, 39.0f)
                close()
                moveTo(39.0f, 39.0f)
                verticalLineToRelative(-0.293f)
                lineToRelative(0.293f, 0.293f)
                close()
                moveTo(12.0f, 14.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(25.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(9.0f, 14.0f)
                verticalLineToRelative(25.0f)
                lineTo(5.5f, 39.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.0f, 37.5f)
                verticalLineToRelative(-22.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.5f, 14.0f)
                close()
                moveTo(43.56f, 14.44f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 44.0f, 15.5f)
                verticalLineToRelative(22.013f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.162f, 1.5f)
                lineToRelative(0.224f, 0.974f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 1.934f, -2.285f)
                lineToRelative(0.004f, -0.215f)
                lineTo(45.0f, 15.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.5f, -2.5f)
                lineTo(31.0f, 13.0f)
                lineTo(31.0f, 9.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 28.5f, 7.0f)
                horizontalLineToRelative(-9.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 17.0f, 9.5f)
                lineTo(17.0f, 14.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(1.0f)
                lineTo(36.0f, 14.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(1.0f)
                lineTo(39.0f, 14.0f)
                horizontalLineToRelative(3.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.06f, 0.44f)
                moveTo(18.0f, 13.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 20.5f, 9.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, 1.5f)
                lineTo(29.0f, 13.0f)
                horizontalLineToRelative(1.0f)
                lineTo(30.0f, 9.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 28.5f, 8.0f)
                horizontalLineToRelative(-9.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 18.0f, 9.5f)
                close()
                moveTo(20.0f, 13.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                close()
            }
        }
        .build()
        return _suitcaseDisabledLarge!!
    }

private var _suitcaseDisabledLarge: ImageVector? = null
