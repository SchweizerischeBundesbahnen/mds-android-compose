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

public val SBBIcons.JerseyShirtLarge: ImageVector
    get() {
        if (_jerseyShirtLarge != null) {
            return _jerseyShirtLarge!!
        }
        _jerseyShirtLarge = Builder(
            name = "JerseyShirtLarge",
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
                moveTo(19.0f, 7.495f)
                horizontalLineToRelative(-1.0f)
                lineTo(18.0f, 6.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(9.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -4.0f, 4.47f)
                lineTo(11.0f, 40.0f)
                horizontalLineToRelative(25.0f)
                lineTo(36.0f, 19.97f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -4.0f, -4.47f)
                lineTo(32.0f, 6.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.495f)
                horizontalLineToRelative(-1.0f)
                lineTo(28.0f, 5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(10.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.5f, 3.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(25.0f)
                lineTo(10.0f, 44.0f)
                lineTo(10.0f, 19.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.5f, -3.5f)
                lineTo(14.0f, 5.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(11.0f, 41.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(25.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(25.5f, 35.5f)
                horizontalLineToRelative(-2.756f)
                verticalLineToRelative(-9.164f)
                lineTo(19.5f, 26.336f)
                verticalLineToRelative(-2.03f)
                quadToRelative(1.01f, -0.03f, 1.646f, -0.21f)
                curveToRelative(0.425f, -0.124f, 0.81f, -0.322f, 1.165f, -0.597f)
                quadToRelative(0.764f, -0.592f, 1.029f, -1.999f)
                horizontalLineToRelative(2.16f)
                close()
                moveTo(19.0f, 7.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 9.0f, 0.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -11.0f, 0.0f)
                close()
            }
        }
            .build()
        return _jerseyShirtLarge!!
    }

private var _jerseyShirtLarge: ImageVector? = null
