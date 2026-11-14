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

public val SBBIcons.DisplayLarge: ImageVector
    get() {
        if (_displayLarge != null) {
            return _displayLarge!!
        }
        _displayLarge = Builder(name = "DisplayLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(43.5f, 7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 45.0f, 8.5f)
                lineTo(45.0f, 31.0f)
                lineTo(3.0f, 31.0f)
                lineTo(3.0f, 8.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.5f, 7.0f)
                close()
                moveTo(3.0f, 32.0f)
                verticalLineToRelative(1.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 4.5f, 35.0f)
                horizontalLineToRelative(39.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                lineTo(45.0f, 32.0f)
                close()
                moveTo(20.806f, 36.0f)
                lineTo(4.5f, 36.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 2.0f, 33.5f)
                verticalLineToRelative(-25.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 4.5f, 6.0f)
                horizontalLineToRelative(39.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 46.0f, 8.5f)
                verticalLineToRelative(25.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, 2.5f)
                lineTo(27.194f, 36.0f)
                lineToRelative(1.667f, 5.0f)
                lineTo(34.5f, 41.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-21.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.64f)
                close()
                moveTo(26.14f, 36.0f)
                lineTo(27.806f, 41.0f)
                horizontalLineToRelative(-7.612f)
                lineToRelative(1.666f, -5.0f)
                close()
                moveTo(40.0f, 34.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(39.0f, 34.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(27.0f, 9.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(22.0f, 8.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(20.0f, 9.0f)
                horizontalLineToRelative(1.0f)
                lineTo(21.0f, 8.0f)
                horizontalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _displayLarge!!
    }

private var _displayLarge: ImageVector? = null
