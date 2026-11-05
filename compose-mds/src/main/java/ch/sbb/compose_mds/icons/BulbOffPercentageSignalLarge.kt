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

public val SBBIcons.BulbOffPercentageSignalLarge: ImageVector
    get() {
        if (_bulbOffPercentageSignalLarge != null) {
            return _bulbOffPercentageSignalLarge!!
        }
        _bulbOffPercentageSignalLarge = Builder(
            name = "BulbOffPercentageSignalLarge",
            defaultWidth =
                48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight =
            48.0f,
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
                moveToRelative(37.5f, 26.689f)
                lineToRelative(0.374f, 0.331f)
                lineToRelative(-14.0f, 15.75f)
                lineToRelative(-0.374f, -0.332f)
                lineToRelative(-0.374f, -0.333f)
                lineToRelative(14.0f, -15.75f)
                close()
                moveTo(34.5f, 37.063f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.001f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -0.001f, -5.0f)
                moveTo(15.502f, 17.0f)
                arcToRelative(9.46f, 9.46f, 0.0f, false, true, 9.256f, 7.337f)
                lineToRelative(-0.488f, 0.112f)
                lineToRelative(-0.487f, 0.111f)
                arcTo(8.46f, 8.46f, 0.0f, false, false, 15.502f, 18.0f)
                arcToRelative(8.463f, 8.463f, 0.0f, false, false, -8.5f, 8.5f)
                curveToRelative(0.0f, 3.155f, 1.833f, 5.963f, 4.438f, 7.5f)
                lineTo(21.0f, 34.0f)
                verticalLineToRelative(5.055f)
                lineToRelative(-0.335f, 0.117f)
                lineTo(17.0f, 40.454f)
                lineTo(17.0f, 42.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.546f)
                lineToRelative(-3.665f, -1.282f)
                lineToRelative(-0.335f, -0.117f)
                lineTo(10.0f, 34.24f)
                curveToRelative(-2.375f, -1.777f, -3.998f, -4.588f, -3.998f, -7.741f)
                curveToRelative(0.0f, -5.276f, 4.224f, -9.5f, 9.5f, -9.5f)
                moveTo(34.5f, 38.063f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -0.001f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.001f, -3.0f)
                moveToRelative(-23.5f, 0.282f)
                lineToRelative(3.665f, 1.283f)
                lineToRelative(0.335f, 0.117f)
                lineTo(15.0f, 41.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.255f)
                lineToRelative(0.335f, -0.117f)
                lineTo(20.0f, 38.345f)
                lineTo(20.0f, 35.0f)
                horizontalLineToRelative(-9.0f)
                close()
                moveTo(26.5f, 27.064f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.001f, 4.999f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -0.001f, -5.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -0.001f, 2.998f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.001f, -2.998f)
                moveTo(27.0f, 4.5f)
                curveTo(27.0f, 13.613f, 34.387f, 21.0f, 43.5f, 21.0f)
                verticalLineToRelative(1.0f)
                curveTo(33.835f, 22.0f, 26.0f, 14.165f, 26.0f, 4.5f)
                close()
                moveTo(31.0f, 4.5f)
                curveTo(31.0f, 11.404f, 36.596f, 17.0f, 43.5f, 17.0f)
                verticalLineToRelative(1.0f)
                curveTo(36.044f, 18.0f, 30.0f, 11.956f, 30.0f, 4.5f)
                close()
                moveTo(35.0f, 4.5f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 8.5f, 8.5f)
                verticalLineToRelative(1.0f)
                arcTo(9.5f, 9.5f, 0.0f, false, true, 34.0f, 4.5f)
                close()
                moveTo(39.0f, 4.5f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 43.5f, 9.0f)
                verticalLineToRelative(1.0f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 38.0f, 4.5f)
                close()
            }
        }
            .build()
        return _bulbOffPercentageSignalLarge!!
    }

private var _bulbOffPercentageSignalLarge: ImageVector? = null
