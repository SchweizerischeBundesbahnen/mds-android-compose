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

public val SBBIcons.MagicWandSmall: ImageVector
    get() {
        if (_magicWandSmall != null) {
            return _magicWandSmall!!
        }
        _magicWandSmall = Builder(name = "MagicWandSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.0f, 5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                lineTo(8.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                lineTo(10.0f, 4.0f)
                lineTo(8.0f, 4.0f)
                lineTo(8.0f, 2.0f)
                lineTo(7.0f, 2.0f)
                verticalLineToRelative(2.0f)
                lineTo(5.0f, 4.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(19.0f, 4.0f)
                lineTo(19.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(19.0f, 5.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(17.0f, 4.0f)
                close()
                moveTo(17.0f, 17.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(14.5f, 6.793f)
                lineToRelative(0.354f, 0.353f)
                lineToRelative(2.0f, 2.0f)
                lineToRelative(0.353f, 0.354f)
                lineToRelative(-0.353f, 0.354f)
                lineToRelative(-12.0f, 12.0f)
                lineToRelative(-0.354f, 0.353f)
                lineToRelative(-0.353f, -0.353f)
                lineToRelative(-2.0f, -2.0f)
                lineToRelative(-0.354f, -0.354f)
                lineToRelative(0.354f, -0.354f)
                lineToRelative(12.0f, -12.0f)
                close()
                moveTo(3.207f, 19.5f)
                lineTo(4.5f, 20.793f)
                lineToRelative(7.293f, -7.293f)
                lineToRelative(-1.293f, -1.293f)
                close()
                moveTo(11.207f, 11.5f)
                lineTo(12.5f, 12.793f)
                lineTo(15.793f, 9.5f)
                lineTo(14.5f, 8.207f)
                close()
            }
        }
        .build()
        return _magicWandSmall!!
    }

private var _magicWandSmall: ImageVector? = null
