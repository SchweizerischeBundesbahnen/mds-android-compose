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

public val SBBIcons.CarProfileLarge: ImageVector
    get() {
        if (_carProfileLarge != null) {
            return _carProfileLarge!!
        }
        _carProfileLarge = Builder(name = "CarProfileLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.816f, 13.65f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.052f, 13.0f)
                lineTo(16.0f, 13.0f)
                verticalLineToRelative(7.0f)
                lineTo(3.45f, 20.0f)
                close()
                moveTo(34.905f, 20.0f)
                lineTo(17.0f, 20.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(7.686f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.286f, 0.09f)
                close()
                moveTo(3.0f, 21.0f)
                horizontalLineToRelative(33.456f)
                lineToRelative(4.827f, 0.804f)
                lineToRelative(0.753f, 1.881f)
                lineToRelative(0.002f, 0.004f)
                curveToRelative(0.236f, 0.574f, 0.647f, 1.268f, 1.436f, 1.31f)
                lineTo(45.0f, 24.999f)
                lineTo(45.0f, 31.0f)
                horizontalLineToRelative(-6.027f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -8.945f, 0.0f)
                lineTo(14.973f, 31.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -8.946f, 0.0f)
                lineTo(3.0f, 31.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(0.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 5.0f, 24.5f)
                verticalLineToRelative(-1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 3.5f, 22.0f)
                lineTo(3.0f, 22.0f)
                close()
                moveTo(45.0f, 24.0f)
                verticalLineToRelative(-0.306f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.253f, -1.48f)
                lineToRelative(-1.31f, -0.218f)
                lineToRelative(0.526f, 1.315f)
                curveToRelative(0.107f, 0.259f, 0.214f, 0.44f, 0.319f, 0.553f)
                curveToRelative(0.091f, 0.098f, 0.165f, 0.13f, 0.234f, 0.135f)
                close()
                moveTo(3.0f, 23.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                close()
                moveTo(6.028f, 32.0f)
                lineTo(2.0f, 32.0f)
                lineTo(2.0f, 20.81f)
                curveToRelative(0.0f, -0.303f, 0.092f, -0.6f, 0.264f, -0.85f)
                lineToRelative(4.728f, -6.876f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 9.052f, 12.0f)
                horizontalLineToRelative(15.634f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.857f, 0.269f)
                lineToRelative(11.15f, 7.756f)
                lineToRelative(7.218f, 1.203f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 46.0f, 23.694f)
                lineTo(46.0f, 32.0f)
                horizontalLineToRelative(-7.028f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -8.945f, 0.0f)
                lineTo(14.974f, 32.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -8.945f, 0.0f)
                moveTo(7.0f, 31.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 7.0f, 0.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -7.0f, 0.0f)
                moveToRelative(2.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.002f, 0.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.0f, 31.499f)
                moveToRelative(1.5f, -2.5f)
                arcTo(2.5f, 2.5f, 0.0f, true, false, 10.502f, 34.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 10.5f, 29.0f)
                moveToRelative(24.0f, -1.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, -7.0f)
                moveTo(33.0f, 31.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.001f, 0.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 33.0f, 31.499f)
                moveToRelative(1.5f, -2.5f)
                arcTo(2.5f, 2.5f, 0.0f, true, false, 34.502f, 34.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 34.5f, 29.0f)
                moveTo(22.0f, 23.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(16.006f, 21.999f)
                lineTo(16.0f, 27.999f)
                lineTo(17.0f, 28.0f)
                lineToRelative(0.006f, -6.0f)
                close()
            }
        }
        .build()
        return _carProfileLarge!!
    }

private var _carProfileLarge: ImageVector? = null
