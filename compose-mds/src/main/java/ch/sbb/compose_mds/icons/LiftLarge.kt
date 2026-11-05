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

public val SBBIcons.LiftLarge: ImageVector
    get() {
        if (_liftLarge != null) {
            return _liftLarge!!
        }
        _liftLarge = Builder(
            name = "LiftLarge",
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
                moveTo(29.5f, 40.5f)
                horizontalLineToRelative(-24.0f)
                verticalLineToRelative(-34.0f)
                horizontalLineToRelative(24.0f)
                close()
                moveTo(43.096f, 35.855f)
                lineTo(38.5f, 40.45f)
                lineToRelative(-4.596f, -4.596f)
                lineToRelative(0.707f, -0.706f)
                lineToRelative(3.889f, 3.888f)
                lineToRelative(3.889f, -3.889f)
                close()
                moveTo(6.5f, 39.5f)
                horizontalLineToRelative(22.0f)
                verticalLineToRelative(-32.0f)
                horizontalLineToRelative(-22.0f)
                close()
                moveTo(21.999f, 29.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(12.999f, 18.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(13.999f, 28.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-7.0f)
                close()
                moveTo(17.499f, 10.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.001f, 4.999f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 17.5f, 10.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -0.001f, 2.999f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 17.499f, 11.0f)
                moveToRelative(21.354f, -4.098f)
                lineToRelative(4.243f, 4.244f)
                lineToRelative(-0.354f, 0.354f)
                lineToRelative(-0.354f, 0.354f)
                lineToRelative(-3.889f, -3.891f)
                lineToRelative(-3.888f, 3.89f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(4.243f, -4.244f)
                lineToRelative(0.353f, -0.353f)
                close()
            }
        }
            .build()
        return _liftLarge!!
    }

private var _liftLarge: ImageVector? = null
