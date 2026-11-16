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
                moveTo(2.264f, 19.96f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.264f, 0.85f)
                lineTo(2.0f, 32.0f)
                horizontalLineToRelative(4.028f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 8.945f, 0.0f)
                horizontalLineToRelative(15.055f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 8.944f, 0.0f)
                lineTo(46.0f, 32.0f)
                verticalLineToRelative(-8.306f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.089f, -2.465f)
                lineToRelative(-7.22f, -1.205f)
                lineToRelative(-11.148f, -7.755f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.857f, -0.269f)
                lineTo(9.052f, 12.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.06f, 1.084f)
                close()
                moveTo(38.973f, 31.0f)
                lineTo(45.0f, 31.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-1.513f)
                lineToRelative(-0.012f, -0.002f)
                lineToRelative(-0.145f, -0.014f)
                curveToRelative(-0.603f, -0.098f, -0.965f, -0.595f, -1.195f, -1.075f)
                lineToRelative(-0.097f, -0.22f)
                lineToRelative(-0.002f, -0.004f)
                lineToRelative(-0.753f, -1.88f)
                lineTo(36.456f, 21.0f)
                lineTo(3.0f, 21.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(0.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.0f, 23.5f)
                verticalLineToRelative(1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 3.5f, 26.0f)
                lineTo(3.0f, 26.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(3.027f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 8.946f, 0.0f)
                horizontalLineToRelative(15.055f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 8.945f, 0.0f)
                moveTo(45.0f, 24.0f)
                verticalLineToRelative(-0.306f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.253f, -1.48f)
                lineToRelative(-1.31f, -0.218f)
                lineToRelative(0.525f, 1.313f)
                curveToRelative(0.107f, 0.26f, 0.214f, 0.442f, 0.32f, 0.555f)
                curveToRelative(0.095f, 0.103f, 0.172f, 0.132f, 0.244f, 0.136f)
                close()
                moveTo(24.972f, 13.09f)
                lineTo(34.906f, 20.0f)
                lineTo(17.0f, 20.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(7.686f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.286f, 0.09f)
                moveTo(16.0f, 13.0f)
                verticalLineToRelative(7.0f)
                lineTo(3.45f, 20.0f)
                lineToRelative(4.366f, -6.35f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.052f, 13.0f)
                close()
                moveTo(3.0f, 25.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                lineTo(3.0f, 23.0f)
                close()
                moveTo(10.5f, 28.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.0f, -7.0f)
                moveToRelative(0.0f, 2.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 10.499f, 33.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.5f, 30.0f)
                moveToRelative(0.0f, 4.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, -0.001f, -5.002f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 10.5f, 34.0f)
                moveTo(38.0f, 31.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, -7.0f, 0.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 7.0f, 0.0f)
                moveTo(34.5f, 30.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 34.499f, 33.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 34.5f, 30.0f)
                moveToRelative(0.0f, 4.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, -0.001f, -5.002f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 34.5f, 34.0f)
                moveTo(22.0f, 22.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(17.0f, 28.0f)
                lineTo(17.006f, 22.0f)
                lineTo(16.006f, 21.998f)
                lineTo(16.0f, 27.998f)
                close()
            }
        }
        .build()
        return _carProfileLarge!!
    }

private var _carProfileLarge: ImageVector? = null
