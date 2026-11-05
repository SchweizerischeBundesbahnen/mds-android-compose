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

public val SBBIcons.HostelLarge: ImageVector
    get() {
        if (_hostelLarge != null) {
            return _hostelLarge!!
        }
        _hostelLarge = Builder(
            name = "HostelLarge",
            defaultWidth = 48.0.dp,
            defaultHeight =
                48.0.dp,
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
                pathFillType = NonZero,
            ) {
                moveTo(39.0f, 9.0f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(1.0f)
                lineTo(41.0f, 10.0f)
                verticalLineToRelative(31.0f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-40.0f)
                verticalLineToRelative(-1.0f)
                lineTo(6.0f, 41.0f)
                lineTo(6.0f, 10.0f)
                lineTo(3.5f, 10.0f)
                lineTo(3.5f, 9.0f)
                lineTo(8.0f, 9.0f)
                lineTo(8.0f, 5.0f)
                horizontalLineToRelative(31.0f)
                close()
                moveTo(7.0f, 41.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(11.001f)
                lineToRelative(-0.001f, 0.501f)
                lineTo(28.99f, 41.0f)
                lineTo(40.0f, 41.0f)
                lineTo(40.0f, 10.0f)
                lineTo(7.0f, 10.0f)
                close()
                moveTo(19.0f, 41.0f)
                horizontalLineToRelative(8.99f)
                lineToRelative(0.009f, -5.0f)
                lineTo(19.0f, 36.0f)
                close()
                moveTo(14.5f, 27.702f)
                horizontalLineToRelative(3.0f)
                lineTo(15.1f, 29.3f)
                lineToRelative(1.0f, 3.2f)
                lineToRelative(-2.6f, -1.798f)
                lineToRelative(-2.6f, 1.798f)
                lineToRelative(1.0f, -3.0f)
                lineToRelative(-2.4f, -1.798f)
                horizontalLineToRelative(3.0f)
                lineToRelative(1.0f, -3.202f)
                close()
                moveTo(24.5f, 27.5f)
                horizontalLineToRelative(3.0f)
                lineToRelative(-2.4f, 1.8f)
                lineToRelative(1.0f, 3.2f)
                lineToRelative(-2.6f, -1.798f)
                lineToRelative(-2.6f, 1.798f)
                lineToRelative(1.0f, -3.0f)
                lineToRelative(-2.4f, -1.798f)
                horizontalLineToRelative(3.0f)
                lineToRelative(1.0f, -3.202f)
                close()
                moveTo(34.5f, 27.5f)
                horizontalLineToRelative(3.0f)
                lineToRelative(-2.4f, 1.8f)
                lineToRelative(1.0f, 3.2f)
                lineToRelative(-2.6f, -1.798f)
                lineToRelative(-2.6f, 1.798f)
                lineToRelative(1.0f, -3.0f)
                lineToRelative(-2.4f, -1.798f)
                horizontalLineToRelative(3.0f)
                lineToRelative(1.0f, -3.202f)
                close()
                moveTo(21.0f, 17.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(26.0f, 18.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-10.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(9.0f, 9.0f)
                horizontalLineToRelative(29.0f)
                lineTo(38.0f, 6.0f)
                lineTo(9.0f, 6.0f)
                close()
            }
        }
            .build()
        return _hostelLarge!!
    }

private var _hostelLarge: ImageVector? = null
