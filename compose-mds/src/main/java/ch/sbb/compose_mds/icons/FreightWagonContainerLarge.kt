package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.FreightWagonContainerLarge: ImageVector
    get() {
        if (_freightWagonContainerLarge != null) {
            return _freightWagonContainerLarge!!
        }
        _freightWagonContainerLarge = Builder(
            name = "FreightWagonContainerLarge",
            defaultWidth =
                48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight =
            48.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(5.0f, 36.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(31.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -7.0f, 0.0f)
                lineTo(30.0f, 39.0f)
                lineTo(17.0f, 39.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -7.0f, 0.0f)
                lineTo(10.0f, 39.0f)
                lineTo(8.0f, 39.0f)
                verticalLineToRelative(-2.0f)
                lineTo(5.0f, 37.0f)
                verticalLineToRelative(3.0f)
                lineTo(4.0f, 40.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(11.0f, 39.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 5.0f, 0.0f)
                lineTo(16.0f, 39.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(31.0f, 39.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 5.0f, 0.0f)
                lineTo(36.0f, 39.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(9.0f, 38.0f)
                horizontalLineToRelative(29.0f)
                verticalLineToRelative(-3.0f)
                lineTo(9.0f, 35.0f)
                close()
                moveTo(37.0f, 31.0f)
                lineTo(10.0f, 31.0f)
                lineTo(10.0f, 12.0f)
                horizontalLineToRelative(27.0f)
                close()
                moveTo(11.0f, 30.0f)
                horizontalLineToRelative(25.0f)
                lineTo(36.0f, 13.0f)
                lineTo(11.0f, 13.0f)
                close()
            }
        }
            .build()
        return _freightWagonContainerLarge!!
    }

private var _freightWagonContainerLarge: ImageVector? = null
