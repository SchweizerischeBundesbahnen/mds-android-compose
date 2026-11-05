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

public val SBBIcons.FreightWagonLarge: ImageVector
    get() {
        if (_freightWagonLarge != null) {
            return _freightWagonLarge!!
        }
        _freightWagonLarge = Builder(
            name = "FreightWagonLarge",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveTo(6.5f, 14.99f)
                lineTo(6.0f, 14.99f)
                lineTo(6.0f, 27.0f)
                lineTo(4.0f, 27.0f)
                verticalLineToRelative(-1.0f)
                lineTo(3.0f, 26.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.99f)
                horizontalLineToRelative(4.034f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 6.931f, 0.0f)
                horizontalLineToRelative(14.07f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 6.93f, 0.0f)
                lineTo(42.0f, 29.99f)
                lineTo(42.0f, 28.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(42.0f, 14.99f)
                lineTo(6.5f, 14.99f)
                moveToRelative(9.452f, 15.0f)
                horizontalLineToRelative(-4.903f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 4.903f, 0.0f)
                moveToRelative(16.78f, 1.278f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -0.684f, -1.278f)
                horizontalLineToRelative(4.904f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -4.22f, 1.278f)
                moveTo(7.0f, 25.99f)
                verticalLineToRelative(-10.0f)
                horizontalLineToRelative(34.0f)
                verticalLineToRelative(10.0f)
                close()
                moveTo(7.0f, 26.99f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(34.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(11.0f, 25.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(14.0f, 25.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(17.0f, 25.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(20.0f, 25.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(23.0f, 25.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(26.0f, 25.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(29.0f, 25.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(32.0f, 25.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(35.0f, 25.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(38.0f, 25.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(8.0f)
                close()
            }
        }
            .build()
        return _freightWagonLarge!!
    }

private var _freightWagonLarge: ImageVector? = null
