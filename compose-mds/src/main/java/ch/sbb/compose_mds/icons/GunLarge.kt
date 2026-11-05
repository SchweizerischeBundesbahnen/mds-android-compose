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

public val SBBIcons.GunLarge: ImageVector
    get() {
        if (_gunLarge != null) {
            return _gunLarge!!
        }
        _gunLarge = Builder(
            name = "GunLarge",
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
                moveTo(40.0f, 11.05f)
                curveToRelative(0.981f, 0.198f, 1.753f, 0.97f, 1.952f, 1.95f)
                lineTo(44.0f, 13.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.999f)
                lineTo(42.0f, 17.5f)
                verticalLineToRelative(0.118f)
                lineToRelative(-2.053f, 4.106f)
                lineToRelative(-0.138f, 0.276f)
                lineTo(27.84f, 22.0f)
                curveToRelative(-0.315f, 2.295f, -1.01f, 3.974f, -1.91f, 5.192f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -3.261f, 2.462f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -3.738f, 0.421f)
                lineToRelative(-0.935f, 7.479f)
                arcToRelative(2.497f, 2.497f, 0.0f, false, true, -2.497f, 2.448f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, -2.5f)
                verticalLineToRelative(-0.031f)
                lineToRelative(0.004f, -0.03f)
                lineTo(10.934f, 22.0f)
                lineToRelative(-1.433f, 0.002f)
                lineTo(9.5f, 22.002f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, -2.5f)
                lineTo(7.0f, 14.0f)
                lineTo(4.0f, 14.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.05f)
                curveToRelative(0.232f, -1.14f, 1.241f, -2.0f, 2.45f, -2.0f)
                lineTo(39.0f, 11.0f)
                lineTo(39.0f, 8.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(8.0f, 19.502f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.499f, 1.499f)
                lineToRelative(2.0f, -0.001f)
                lineToRelative(0.567f, -0.001f)
                lineToRelative(-0.07f, 0.563f)
                lineToRelative(-1.995f, 15.961f)
                curveToRelative(0.011f, 0.82f, 0.678f, 1.479f, 1.499f, 1.479f)
                horizontalLineToRelative(4.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-0.031f)
                lineToRelative(0.004f, -0.03f)
                lineToRelative(2.0f, -16.003f)
                lineToRelative(0.055f, -0.438f)
                lineTo(39.19f, 21.0f)
                lineToRelative(1.5f, -3.0f)
                lineTo(8.0f, 18.0f)
                close()
                moveTo(19.879f, 22.5f)
                horizontalLineToRelative(0.123f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.5f, 2.5f)
                verticalLineToRelative(1.0f)
                curveToRelative(-1.19f, 0.0f, -2.24f, -0.594f, -2.873f, -1.502f)
                lineToRelative(-0.573f, 4.586f)
                arcToRelative(7.177f, 7.177f, 0.0f, false, false, 3.268f, -0.37f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.804f, -2.116f)
                curveToRelative(0.765f, -1.036f, 1.398f, -2.508f, 1.703f, -4.598f)
                horizontalLineToRelative(-6.89f)
                close()
                moveTo(9.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.0f, 13.5f)
                lineTo(8.0f, 17.0f)
                horizontalLineToRelative(33.0f)
                lineToRelative(0.002f, -3.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                close()
                moveTo(42.001f, 15.0f)
                lineTo(43.0f, 15.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-0.998f)
                close()
            }
        }
            .build()
        return _gunLarge!!
    }

private var _gunLarge: ImageVector? = null
