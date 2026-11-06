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
                moveTo(23.5f, 3.0f)
                arcTo(6.5f, 6.5f, 0.0f, false, false, 17.0f, 9.5f)
                lineTo(17.0f, 18.0f)
                lineTo(8.0f, 18.0f)
                verticalLineToRelative(27.0f)
                horizontalLineToRelative(31.0f)
                lineTo(39.0f, 18.0f)
                horizontalLineToRelative(-9.0f)
                lineTo(30.0f, 9.5f)
                arcTo(6.5f, 6.5f, 0.0f, false, false, 23.5f, 3.0f)
                moveTo(29.0f, 18.0f)
                lineTo(29.0f, 9.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -11.0f, 0.0f)
                lineTo(18.0f, 18.0f)
                horizontalLineToRelative(1.0f)
                lineTo(19.0f, 9.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, 9.0f, 0.0f)
                lineTo(28.0f, 18.0f)
                close()
                moveTo(20.0f, 9.5f)
                lineTo(20.0f, 18.0f)
                horizontalLineToRelative(7.0f)
                lineTo(27.0f, 9.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, -7.0f, 0.0f)
                moveTo(9.0f, 44.0f)
                lineTo(9.0f, 19.0f)
                horizontalLineToRelative(29.0f)
                verticalLineToRelative(25.0f)
                close()
                moveTo(25.116f, 24.387f)
                arcTo(3.5f, 3.5f, 0.0f, true, false, 22.0f, 30.654f)
                lineTo(22.0f, 37.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 3.0f, 0.0f)
                verticalLineToRelative(-6.846f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.116f, -6.267f)
                moveToRelative(-1.784f, 0.61f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 1.001f, 4.852f)
                lineToRelative(-0.333f, 0.117f)
                lineTo(24.0f, 37.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                verticalLineToRelative(-7.534f)
                lineToRelative(-0.333f, -0.117f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.665f, -4.852f)
            }
        }
        .build()
        return _lockClosedLarge!!
    }

private var _lockClosedLarge: ImageVector? = null
