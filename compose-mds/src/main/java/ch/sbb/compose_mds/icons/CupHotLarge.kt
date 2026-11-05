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

public val SBBIcons.CupHotLarge: ImageVector
    get() {
        if (_cupHotLarge != null) {
            return _cupHotLarge!!
        }
        _cupHotLarge = Builder(
            name = "CupHotLarge",
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
                moveTo(38.0f, 42.0f)
                lineTo(7.0f, 42.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(31.0f)
                close()
                moveTo(35.0f, 25.0f)
                horizontalLineToRelative(2.5f)
                arcToRelative(3.501f, 3.501f, 0.0f, false, true, 0.0f, 7.0f)
                horizontalLineToRelative(-2.998f)
                curveToRelative(-1.514f, 5.2f, -6.315f, 9.0f, -12.002f, 9.0f)
                curveTo(15.598f, 41.0f, 10.0f, 35.402f, 10.0f, 28.5f)
                lineTo(10.0f, 21.0f)
                horizontalLineToRelative(25.0f)
                close()
                moveTo(11.0f, 26.0f)
                verticalLineToRelative(2.5f)
                curveTo(11.0f, 34.85f, 16.15f, 40.0f, 22.5f, 40.0f)
                reflectiveCurveTo(34.0f, 34.85f, 34.0f, 28.5f)
                lineTo(34.0f, 26.0f)
                close()
                moveTo(35.0f, 28.5f)
                quadToRelative(-0.002f, 1.286f, -0.25f, 2.5f)
                horizontalLineToRelative(2.75f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, false, 0.0f, -5.0f)
                lineTo(35.0f, 26.0f)
                close()
                moveTo(11.0f, 25.0f)
                horizontalLineToRelative(23.0f)
                verticalLineToRelative(-3.0f)
                lineTo(11.0f, 22.0f)
                close()
                moveTo(16.82f, 8.116f)
                quadToRelative(0.637f, 0.532f, 0.883f, 1.16f)
                curveToRelative(0.166f, 0.42f, 0.192f, 0.84f, 0.136f, 1.247f)
                curveToRelative(-0.11f, 0.78f, -0.538f, 1.552f, -0.9f, 2.216f)
                curveToRelative(-0.388f, 0.71f, -0.709f, 1.314f, -0.788f, 1.877f)
                arcToRelative(1.43f, 1.43f, 0.0f, false, false, 0.076f, 0.741f)
                curveToRelative(0.092f, 0.234f, 0.27f, 0.49f, 0.593f, 0.76f)
                lineToRelative(-0.64f, 0.767f)
                quadToRelative(-0.637f, -0.531f, -0.883f, -1.16f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, true, -0.136f, -1.247f)
                curveToRelative(0.11f, -0.78f, 0.537f, -1.552f, 0.9f, -2.216f)
                curveToRelative(0.387f, -0.71f, 0.709f, -1.314f, 0.788f, -1.877f)
                arcToRelative(1.43f, 1.43f, 0.0f, false, false, -0.076f, -0.741f)
                curveToRelative(-0.092f, -0.234f, -0.27f, -0.49f, -0.593f, -0.76f)
                close()
                moveTo(28.82f, 8.116f)
                quadToRelative(0.637f, 0.532f, 0.883f, 1.16f)
                curveToRelative(0.166f, 0.42f, 0.192f, 0.84f, 0.136f, 1.247f)
                curveToRelative(-0.11f, 0.78f, -0.538f, 1.552f, -0.9f, 2.216f)
                curveToRelative(-0.388f, 0.71f, -0.709f, 1.314f, -0.788f, 1.877f)
                arcToRelative(1.43f, 1.43f, 0.0f, false, false, 0.076f, 0.741f)
                curveToRelative(0.092f, 0.234f, 0.27f, 0.49f, 0.593f, 0.76f)
                lineToRelative(-0.64f, 0.767f)
                quadToRelative(-0.637f, -0.531f, -0.883f, -1.16f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, true, -0.136f, -1.247f)
                curveToRelative(0.11f, -0.78f, 0.537f, -1.552f, 0.9f, -2.216f)
                curveToRelative(0.387f, -0.71f, 0.709f, -1.314f, 0.788f, -1.877f)
                arcToRelative(1.43f, 1.43f, 0.0f, false, false, -0.076f, -0.741f)
                curveToRelative(-0.092f, -0.234f, -0.27f, -0.49f, -0.593f, -0.76f)
                close()
                moveTo(22.82f, 6.116f)
                quadToRelative(0.637f, 0.532f, 0.883f, 1.16f)
                curveToRelative(0.166f, 0.42f, 0.192f, 0.84f, 0.136f, 1.246f)
                curveToRelative(-0.11f, 0.78f, -0.538f, 1.553f, -0.9f, 2.217f)
                curveToRelative(-0.388f, 0.71f, -0.709f, 1.314f, -0.788f, 1.877f)
                arcToRelative(1.43f, 1.43f, 0.0f, false, false, 0.076f, 0.741f)
                curveToRelative(0.092f, 0.234f, 0.27f, 0.49f, 0.593f, 0.76f)
                lineToRelative(-0.64f, 0.767f)
                quadToRelative(-0.637f, -0.531f, -0.883f, -1.16f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, true, -0.136f, -1.247f)
                curveToRelative(0.11f, -0.78f, 0.537f, -1.552f, 0.9f, -2.216f)
                curveToRelative(0.387f, -0.71f, 0.709f, -1.314f, 0.788f, -1.877f)
                arcToRelative(1.43f, 1.43f, 0.0f, false, false, -0.076f, -0.741f)
                curveToRelative(-0.092f, -0.234f, -0.27f, -0.49f, -0.593f, -0.76f)
                close()
            }
        }
            .build()
        return _cupHotLarge!!
    }

private var _cupHotLarge: ImageVector? = null
