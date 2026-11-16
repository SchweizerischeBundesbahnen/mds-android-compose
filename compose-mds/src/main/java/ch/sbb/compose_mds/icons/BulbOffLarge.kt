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

public val SBBIcons.BulbOffLarge: ImageVector
    get() {
        if (_bulbOffLarge != null) {
            return _bulbOffLarge!!
        }
        _bulbOffLarge = Builder(name = "BulbOffLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(30.218f, 17.782f)
                arcTo(9.5f, 9.5f, 0.0f, false, false, 14.0f, 24.5f)
                verticalLineToRelative(0.009f)
                arcToRelative(9.84f, 9.84f, 0.0f, false, false, 4.0f, 7.748f)
                verticalLineToRelative(6.798f)
                lineToRelative(0.335f, 0.117f)
                lineTo(22.0f, 40.454f)
                lineTo(22.0f, 42.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.546f)
                lineToRelative(3.665f, -1.282f)
                lineToRelative(0.335f, -0.117f)
                verticalLineToRelative(-6.778f)
                arcToRelative(9.6f, 9.6f, 0.0f, false, false, 4.0f, -7.776f)
                lineTo(33.0f, 24.5f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, false, -2.782f, -6.718f)
                moveTo(27.573f, 32.0f)
                arcTo(8.6f, 8.6f, 0.0f, false, false, 32.0f, 24.5f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, false, -17.0f, 0.0f)
                arcToRelative(8.84f, 8.84f, 0.0f, false, false, 4.43f, 7.5f)
                lineTo(22.0f, 32.0f)
                verticalLineToRelative(-3.76f)
                lineToRelative(-2.312f, -1.85f)
                lineToRelative(0.625f, -0.78f)
                lineToRelative(2.5f, 2.0f)
                lineToRelative(0.187f, 0.15f)
                lineTo(23.0f, 32.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-4.24f)
                lineToRelative(0.188f, -0.15f)
                lineToRelative(2.5f, -2.0f)
                lineToRelative(0.625f, 0.78f)
                lineTo(25.0f, 28.24f)
                lineTo(25.0f, 32.0f)
                close()
                moveTo(22.665f, 39.628f)
                lineTo(19.0f, 38.345f)
                lineTo(19.0f, 37.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.345f)
                lineToRelative(-3.665f, 1.283f)
                lineToRelative(-0.335f, 0.117f)
                lineTo(24.0f, 41.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.255f)
                close()
            }
        }
        .build()
        return _bulbOffLarge!!
    }

private var _bulbOffLarge: ImageVector? = null
