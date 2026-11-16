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

public val SBBIcons.LockClosedLarge: ImageVector
    get() {
        if (_lockClosedLarge != null) {
            return _lockClosedLarge!!
        }
        _lockClosedLarge = Builder(name = "LockClosedLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(27.389f, 5.611f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 29.0f, 9.5f)
                lineTo(29.0f, 18.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(28.0f, 9.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -9.0f, 0.0f)
                lineTo(19.0f, 18.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(18.0f, 9.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 9.389f, -3.889f)
                moveTo(27.0f, 9.5f)
                lineTo(27.0f, 18.0f)
                horizontalLineToRelative(-7.0f)
                lineTo(20.0f, 9.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 7.0f, 0.0f)
                moveTo(17.0f, 18.0f)
                lineTo(17.0f, 9.5f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, true, 13.0f, 0.0f)
                lineTo(30.0f, 18.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(27.0f)
                lineTo(8.0f, 45.0f)
                lineTo(8.0f, 18.0f)
                close()
                moveTo(38.0f, 19.0f)
                verticalLineToRelative(25.0f)
                lineTo(9.0f, 44.0f)
                lineTo(9.0f, 19.0f)
                close()
                moveTo(24.333f, 29.849f)
                lineToRelative(-0.333f, 0.117f)
                lineTo(24.0f, 37.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                verticalLineToRelative(-7.534f)
                lineToRelative(-0.333f, -0.117f)
                arcToRelative(2.503f, 2.503f, 0.0f, false, true, -1.46f, -3.354f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 3.126f, 3.354f)
                moveToRelative(0.228f, 8.712f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 25.0f, 37.5f)
                verticalLineToRelative(-6.85f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 2.0f, -3.15f)
                arcToRelative(3.499f, 3.499f, 0.0f, true, false, -5.0f, 3.15f)
                verticalLineToRelative(6.85f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.56f, 1.06f)
            }
        }
        .build()
        return _lockClosedLarge!!
    }

private var _lockClosedLarge: ImageVector? = null
