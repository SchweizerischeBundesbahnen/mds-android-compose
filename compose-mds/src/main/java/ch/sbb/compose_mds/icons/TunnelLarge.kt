package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.TunnelLarge: ImageVector
    get() {
        if (_tunnelLarge != null) {
            return _tunnelLarge!!
        }
        _tunnelLarge = Builder(
            name = "TunnelLarge",
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
                pathFillType = EvenOdd,
            ) {
                moveTo(24.002f, 4.0f)
                curveTo(14.064f, 4.0f, 6.0f, 11.136f, 6.0f, 20.445f)
                lineTo(6.0f, 39.0f)
                lineTo(5.0f, 39.0f)
                lineTo(5.0f, 20.445f)
                curveTo(5.0f, 10.49f, 13.609f, 3.0f, 24.002f, 3.0f)
                reflectiveCurveTo(43.0f, 10.491f, 43.0f, 20.445f)
                lineTo(43.0f, 39.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(42.0f, 20.445f)
                curveTo(42.0f, 11.135f, 33.94f, 4.0f, 24.002f, 4.0f)
                moveToRelative(-4.737f, 26.0f)
                horizontalLineToRelative(9.47f)
                lineToRelative(-0.22f, -0.879f)
                lineToRelative(0.97f, -0.242f)
                lineToRelative(0.28f, 1.121f)
                lineTo(31.0f, 30.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-0.985f)
                lineToRelative(0.75f, 3.0f)
                lineTo(32.0f, 34.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-0.985f)
                lineToRelative(0.75f, 3.0f)
                lineTo(33.0f, 38.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-0.985f)
                lineToRelative(0.75f, 3.0f)
                lineTo(34.0f, 42.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-0.985f)
                lineToRelative(0.47f, 1.879f)
                lineToRelative(-0.97f, 0.242f)
                lineToRelative(-0.53f, -2.121f)
                horizontalLineToRelative(-15.97f)
                lineToRelative(-0.53f, 2.121f)
                lineToRelative(-0.97f, -0.242f)
                lineToRelative(0.47f, -1.879f)
                lineTo(14.0f, 43.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.235f)
                lineToRelative(0.75f, -3.0f)
                lineTo(15.0f, 39.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.235f)
                lineToRelative(0.75f, -3.0f)
                lineTo(16.0f, 35.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.235f)
                lineToRelative(0.75f, -3.0f)
                lineTo(17.0f, 31.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.235f)
                lineToRelative(0.28f, -1.121f)
                lineToRelative(0.97f, 0.242f)
                close()
                moveTo(19.015f, 31.0f)
                lineTo(18.265f, 34.0f)
                horizontalLineToRelative(11.47f)
                lineToRelative(-0.75f, -3.0f)
                horizontalLineToRelative(-9.97f)
                moveToRelative(-1.0f, 4.0f)
                lineToRelative(-0.75f, 3.0f)
                horizontalLineToRelative(13.47f)
                lineToRelative(-0.75f, -3.0f)
                horizontalLineToRelative(-11.97f)
                moveToRelative(-1.0f, 4.0f)
                lineToRelative(-0.75f, 3.0f)
                horizontalLineToRelative(15.47f)
                lineToRelative(-0.75f, -3.0f)
                horizontalLineToRelative(-13.97f)
            }
        }
            .build()
        return _tunnelLarge!!
    }

private var _tunnelLarge: ImageVector? = null
