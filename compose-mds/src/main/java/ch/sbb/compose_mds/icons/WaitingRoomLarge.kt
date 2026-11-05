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

public val SBBIcons.WaitingRoomLarge: ImageVector
    get() {
        if (_waitingRoomLarge != null) {
            return _waitingRoomLarge!!
        }
        _waitingRoomLarge = Builder(
            name = "WaitingRoomLarge",
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
                moveTo(42.0f, 42.001f)
                lineTo(25.0f, 42.001f)
                verticalLineToRelative(-10.98f)
                horizontalLineToRelative(17.0f)
                close()
                moveTo(15.999f, 30.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(8.999f, 30.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(6.999f, 19.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(26.0f, 41.001f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(-8.98f)
                lineTo(26.0f, 32.021f)
                close()
                moveTo(7.999f, 29.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(3.0f)
                lineTo(12.999f, 29.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-7.0f)
                close()
                moveTo(37.002f, 30.02f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(33.5f, 7.0f)
                curveToRelative(4.74f, 0.0f, 8.5f, 3.76f, 8.5f, 8.5f)
                reflectiveCurveTo(38.24f, 24.0f, 33.5f, 24.0f)
                curveToRelative(-4.738f, 0.0f, -8.5f, -3.76f, -8.5f, -8.5f)
                reflectiveCurveTo(28.762f, 7.0f, 33.5f, 7.0f)
                moveToRelative(0.0f, 1.0f)
                curveToRelative(-4.186f, 0.0f, -7.5f, 3.312f, -7.5f, 7.5f)
                reflectiveCurveToRelative(3.314f, 7.5f, 7.5f, 7.5f)
                curveToRelative(4.188f, 0.0f, 7.5f, -3.312f, 7.5f, -7.5f)
                reflectiveCurveTo(37.688f, 8.0f, 33.5f, 8.0f)
                moveToRelative(3.8f, 3.7f)
                lineToRelative(0.393f, 0.31f)
                lineToRelative(-3.801f, 4.8f)
                lineToRelative(-0.33f, 0.416f)
                lineToRelative(-0.396f, -0.354f)
                lineToRelative(-3.798f, -3.4f)
                lineToRelative(0.333f, -0.372f)
                lineToRelative(0.333f, -0.373f)
                lineToRelative(3.403f, 3.044f)
                lineToRelative(3.472f, -4.382f)
                close()
                moveTo(11.5f, 11.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.001f, 4.999f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 11.5f, 11.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -0.001f, 2.999f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.499f, 12.0f)
            }
        }
            .build()
        return _waitingRoomLarge!!
    }

private var _waitingRoomLarge: ImageVector? = null
