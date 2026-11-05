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

public val SBBIcons.TicketsClassLarge: ImageVector
    get() {
        if (_ticketsClassLarge != null) {
            return _ticketsClassLarge!!
        }
        _ticketsClassLarge = Builder(
            name = "TicketsClassLarge",
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
                moveTo(40.0f, 38.0f)
                lineTo(28.0f, 38.0f)
                verticalLineToRelative(4.0f)
                lineTo(8.0f, 42.0f)
                lineTo(8.0f, 12.793f)
                lineTo(10.793f, 10.0f)
                lineTo(11.0f, 10.0f)
                lineToRelative(9.0f, 0.002f)
                lineTo(20.0f, 8.793f)
                lineTo(22.793f, 6.0f)
                lineTo(40.0f, 6.0f)
                close()
                moveTo(9.0f, 13.207f)
                lineTo(9.0f, 41.0f)
                horizontalLineToRelative(18.0f)
                lineTo(27.0f, 11.003f)
                lineTo(11.206f, 11.0f)
                close()
                moveTo(19.0f, 38.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(21.0f, 9.207f)
                verticalLineToRelative(0.795f)
                lineToRelative(6.5f, 0.002f)
                horizontalLineToRelative(0.5f)
                lineTo(28.0f, 23.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(11.0f)
                lineTo(39.0f, 7.0f)
                lineTo(23.207f, 7.0f)
                close()
                moveTo(24.0f, 32.0f)
                lineTo(12.0f, 32.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(24.0f, 28.0f)
                lineTo(12.0f, 28.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(21.416f, 13.5f)
                quadToRelative(1.132f, 0.0f, 1.846f, 0.615f)
                quadToRelative(0.387f, 0.334f, 0.6f, 0.85f)
                quadToRelative(0.214f, 0.515f, 0.214f, 1.101f)
                quadToRelative(0.0f, 1.124f, -0.762f, 1.952f)
                quadToRelative(-0.503f, 0.544f, -1.793f, 1.335f)
                quadToRelative(-1.007f, 0.622f, -1.385f, 1.011f)
                quadToRelative(-0.378f, 0.39f, -0.519f, 0.952f)
                horizontalLineToRelative(4.389f)
                verticalLineToRelative(0.95f)
                horizontalLineToRelative(-5.572f)
                quadToRelative(0.059f, -1.266f, 0.656f, -2.11f)
                quadToRelative(0.27f, -0.387f, 0.662f, -0.715f)
                quadToRelative(0.393f, -0.328f, 1.219f, -0.855f)
                quadToRelative(1.206f, -0.767f, 1.54f, -1.172f)
                quadToRelative(0.493f, -0.58f, 0.493f, -1.312f)
                arcToRelative(1.76f, 1.76f, 0.0f, false, false, -0.276f, -0.985f)
                quadToRelative(-0.45f, -0.703f, -1.365f, -0.703f)
                quadToRelative(-0.79f, 0.0f, -1.21f, 0.557f)
                quadToRelative(-0.418f, 0.556f, -0.46f, 1.658f)
                horizontalLineToRelative(-1.025f)
                lineToRelative(-0.006f, -0.223f)
                quadToRelative(0.0f, -0.633f, 0.211f, -1.2f)
                quadToRelative(0.21f, -0.57f, 0.592f, -0.962f)
                quadToRelative(0.726f, -0.744f, 1.951f, -0.744f)
                moveToRelative(14.611f, 5.066f)
                horizontalLineToRelative(-1.113f)
                verticalLineToRelative(-6.21f)
                horizontalLineToRelative(-2.162f)
                verticalLineToRelative(-0.774f)
                quadToRelative(1.212f, 0.0f, 1.828f, -0.457f)
                quadToRelative(0.416f, -0.31f, 0.65f, -1.125f)
                horizontalLineToRelative(0.797f)
                close()
            }
        }
            .build()
        return _ticketsClassLarge!!
    }

private var _ticketsClassLarge: ImageVector? = null
