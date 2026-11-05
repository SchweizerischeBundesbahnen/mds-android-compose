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

public val SBBIcons.LockerLarge: ImageVector
    get() {
        if (_lockerLarge != null) {
            return _lockerLarge!!
        }
        _lockerLarge = Builder(
            name = "LockerLarge",
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
                moveTo(43.0f, 43.001f)
                lineTo(4.0f, 43.001f)
                verticalLineToRelative(-27.0f)
                horizontalLineToRelative(39.0f)
                close()
                moveTo(5.0f, 42.001f)
                horizontalLineToRelative(37.0f)
                verticalLineToRelative(-25.0f)
                lineTo(5.0f, 17.001f)
                close()
                moveTo(34.5f, 24.001f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, 2.5f)
                verticalLineToRelative(8.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, 2.5f)
                horizontalLineToRelative(-22.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, -2.5f)
                verticalLineToRelative(-8.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, -2.5f)
                close()
                moveTo(12.5f, 25.001f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, 1.5f)
                verticalLineToRelative(8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, 1.5f)
                horizontalLineToRelative(22.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                close()
                moveTo(23.5f, 28.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.001f, 4.999f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 23.5f, 28.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -0.001f, 2.999f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 23.5f, 29.0f)
                moveToRelative(4.5f, -5.999f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(8.5f, 4.0f)
                curveToRelative(1.56f, 0.0f, 2.935f, 0.794f, 3.742f, 2.0f)
                horizontalLineToRelative(10.465f)
                lineToRelative(2.468f, 2.468f)
                lineToRelative(-0.354f, 0.353f)
                lineToRelative(-2.029f, 2.033f)
                lineToRelative(-0.147f, 0.146f)
                lineTo(12.241f, 11.0f)
                arcTo(4.501f, 4.501f, 0.0f, false, true, 4.0f, 8.5f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 8.5f, 4.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, -7.0f)
                moveToRelative(4.243f, 2.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 0.0f, 3.0f)
                horizontalLineToRelative(9.487f)
                lineToRelative(1.53f, -1.532f)
                lineTo(22.294f, 7.0f)
                close()
            }
        }
            .build()
        return _lockerLarge!!
    }

private var _lockerLarge: ImageVector? = null
