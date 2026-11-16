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

public val SBBIcons.SuitcaseLarge: ImageVector
    get() {
        if (_suitcaseLarge != null) {
            return _suitcaseLarge!!
        }
        _suitcaseLarge = Builder(name = "SuitcaseLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(29.56f, 8.44f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 30.0f, 9.5f)
                lineTo(30.0f, 13.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 27.5f, 9.0f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, 1.5f)
                lineTo(19.0f, 13.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(18.0f, 9.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 19.5f, 8.0f)
                horizontalLineToRelative(9.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.06f, 0.44f)
                moveTo(17.0f, 13.0f)
                lineTo(17.0f, 9.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 19.5f, 7.0f)
                horizontalLineToRelative(9.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 31.0f, 9.5f)
                lineTo(31.0f, 13.0f)
                horizontalLineToRelative(11.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, 2.5f)
                verticalLineToRelative(22.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, 2.5f)
                horizontalLineToRelative(-37.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 3.0f, 37.5f)
                verticalLineToRelative(-22.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 5.5f, 13.0f)
                close()
                moveTo(28.0f, 10.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                lineTo(20.0f, 13.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(44.0f, 15.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                lineTo(39.0f, 14.0f)
                verticalLineToRelative(25.0f)
                horizontalLineToRelative(3.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                close()
                moveTo(36.0f, 14.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(25.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(35.0f, 14.0f)
                lineTo(13.0f, 14.0f)
                verticalLineToRelative(25.0f)
                horizontalLineToRelative(22.0f)
                close()
                moveTo(12.0f, 39.0f)
                lineTo(12.0f, 14.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(25.0f)
                close()
                moveTo(5.5f, 14.0f)
                lineTo(9.0f, 14.0f)
                verticalLineToRelative(25.0f)
                lineTo(5.5f, 39.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.0f, 37.5f)
                verticalLineToRelative(-22.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.5f, 14.0f)
            }
        }
        .build()
        return _suitcaseLarge!!
    }

private var _suitcaseLarge: ImageVector? = null
