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

public val SBBIcons.HostelSmall: ImageVector
    get() {
        if (_hostelSmall != null) {
            return _hostelSmall!!
        }
        _hostelSmall = Builder(
            name = "HostelSmall",
            defaultWidth = 24.0.dp,
            defaultHeight =
                24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
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
                moveTo(20.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                lineTo(2.0f, 21.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                lineTo(3.0f, 5.0f)
                lineTo(2.0f, 5.0f)
                lineTo(2.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                lineTo(4.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                close()
                moveTo(4.0f, 20.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(6.001f)
                lineToRelative(-0.001f, 0.501f)
                lineTo(14.995f, 20.0f)
                lineTo(20.0f, 20.0f)
                lineTo(20.0f, 5.0f)
                lineTo(4.0f, 5.0f)
                close()
                moveTo(10.0f, 20.0f)
                horizontalLineToRelative(3.995f)
                lineTo(14.0f, 18.0f)
                lineTo(10.0f, 18.0f)
                close()
                moveTo(7.5f, 13.6f)
                lineTo(9.0f, 13.6f)
                lineToRelative(-1.2f, 0.8f)
                lineToRelative(0.5f, 1.6f)
                lineToRelative(-1.3f, -0.9f)
                lineToRelative(-1.3f, 0.9f)
                lineToRelative(0.5f, -1.5f)
                lineToRelative(-1.2f, -0.9f)
                horizontalLineToRelative(1.5f)
                lineTo(7.0f, 12.0f)
                close()
                moveTo(12.5f, 13.5f)
                lineTo(14.0f, 13.5f)
                lineToRelative(-1.2f, 0.9f)
                lineToRelative(0.5f, 1.6f)
                lineToRelative(-1.3f, -0.9f)
                lineToRelative(-1.3f, 0.9f)
                lineToRelative(0.5f, -1.5f)
                lineToRelative(-1.2f, -0.9f)
                horizontalLineToRelative(1.5f)
                lineTo(12.0f, 12.0f)
                close()
                moveTo(17.5f, 13.5f)
                lineTo(19.0f, 13.5f)
                lineToRelative(-1.2f, 0.9f)
                lineToRelative(0.5f, 1.6f)
                lineToRelative(-1.3f, -0.9f)
                lineToRelative(-1.3f, 0.9f)
                lineToRelative(0.5f, -1.5f)
                lineToRelative(-1.2f, -0.9f)
                horizontalLineToRelative(1.5f)
                lineTo(17.0f, 12.0f)
                close()
                moveTo(11.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 6.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(13.0f, 9.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(10.0f, 6.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(5.0f, 4.0f)
                horizontalLineToRelative(14.0f)
                lineTo(19.0f, 3.0f)
                lineTo(5.0f, 3.0f)
                close()
            }
        }
            .build()
        return _hostelSmall!!
    }

private var _hostelSmall: ImageVector? = null
