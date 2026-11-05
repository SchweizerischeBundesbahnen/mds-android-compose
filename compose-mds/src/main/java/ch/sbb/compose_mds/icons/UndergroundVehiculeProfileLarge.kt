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

public val SBBIcons.UndergroundVehiculeProfileLarge: ImageVector
    get() {
        if (_undergroundVehiculeProfileLarge != null) {
            return _undergroundVehiculeProfileLarge!!
        }
        _undergroundVehiculeProfileLarge = Builder(
            name = "UndergroundVehiculeProfileLarge",
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
                moveTo(44.0f, 43.0f)
                lineTo(3.04f, 43.0f)
                verticalLineToRelative(-1.0f)
                lineTo(44.0f, 42.0f)
                close()
                moveTo(31.224f, 6.03f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 1.114f, 0.374f)
                lineToRelative(0.164f, 0.112f)
                lineToRelative(0.001f, 0.001f)
                curveToRelative(0.374f, 0.28f, 0.662f, 0.657f, 0.831f, 1.089f)
                lineToRelative(0.066f, 0.19f)
                lineToRelative(5.44f, 18.0f)
                lineToRelative(0.002f, 0.01f)
                quadToRelative(0.175f, 0.623f, 0.179f, 1.27f)
                lineTo(39.021f, 36.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, 2.5f)
                lineTo(3.02f, 39.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(33.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                lineTo(38.02f, 33.0f)
                lineTo(35.0f, 33.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.02f)
                verticalLineToRelative(-4.917f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -0.142f, -1.01f)
                lineTo(32.44f, 8.085f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.537f, -0.767f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.768f, -0.291f)
                lineToRelative(-0.12f, -0.006f)
                lineTo(3.02f, 7.021f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(28.004f)
                close()
                moveTo(17.001f, 35.0f)
                lineTo(4.0f, 35.0f)
                lineTo(4.0f, 10.0f)
                horizontalLineToRelative(13.0f)
                close()
                moveTo(5.0f, 34.0f)
                horizontalLineToRelative(5.0f)
                lineTo(10.0f, 11.0f)
                lineTo(5.0f, 11.0f)
                close()
                moveTo(11.0f, 34.0f)
                horizontalLineToRelative(5.0f)
                lineTo(16.0f, 11.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(34.0f, 24.363f)
                lineTo(34.182f, 25.0f)
                lineTo(20.0f, 25.0f)
                lineTo(20.0f, 10.0f)
                horizontalLineToRelative(9.898f)
                close()
                moveTo(21.0f, 24.0f)
                horizontalLineToRelative(11.856f)
                lineToRelative(-3.714f, -13.0f)
                lineTo(21.0f, 11.0f)
                close()
            }
        }
            .build()
        return _undergroundVehiculeProfileLarge!!
    }

private var _undergroundVehiculeProfileLarge: ImageVector? = null
