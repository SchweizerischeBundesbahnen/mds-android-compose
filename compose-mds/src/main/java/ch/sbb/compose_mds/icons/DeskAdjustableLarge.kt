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

public val SBBIcons.DeskAdjustableLarge: ImageVector
    get() {
        if (_deskAdjustableLarge != null) {
            return _deskAdjustableLarge!!
        }
        _deskAdjustableLarge = Builder(
            name = "DeskAdjustableLarge",
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
                pathFillType = NonZero,
            ) {
                moveTo(41.0f, 42.999f)
                horizontalLineToRelative(-1.0f)
                lineTo(40.0f, 34.0f)
                lineTo(28.0f, 34.0f)
                verticalLineToRelative(-8.001f)
                lineTo(7.0f, 25.999f)
                verticalLineToRelative(17.0f)
                lineTo(6.0f, 42.999f)
                verticalLineToRelative(-22.0f)
                horizontalLineToRelative(35.0f)
                close()
                moveTo(29.0f, 33.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-7.001f)
                lineTo(29.0f, 25.999f)
                close()
                moveTo(37.0f, 30.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(7.0f, 24.999f)
                horizontalLineToRelative(33.0f)
                verticalLineToRelative(-3.0f)
                lineTo(7.0f, 21.999f)
                close()
                moveTo(40.854f, 11.546f)
                lineTo(40.147f, 12.253f)
                lineTo(37.0f, 9.106f)
                lineTo(37.0f, 19.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(36.0f, 9.106f)
                lineToRelative(-3.147f, 3.147f)
                lineToRelative(-0.706f, -0.707f)
                lineTo(36.5f, 7.192f)
                close()
                moveTo(27.0f, 15.894f)
                lineToRelative(3.146f, -3.147f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(-4.353f, 4.354f)
                lineToRelative(-4.353f, -4.354f)
                lineToRelative(0.707f, -0.707f)
                lineTo(26.0f, 15.894f)
                lineTo(26.0f, 5.999f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
            .build()
        return _deskAdjustableLarge!!
    }

private var _deskAdjustableLarge: ImageVector? = null
