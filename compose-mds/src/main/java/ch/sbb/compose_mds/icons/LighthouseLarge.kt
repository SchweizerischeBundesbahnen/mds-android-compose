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

public val SBBIcons.LighthouseLarge: ImageVector
    get() {
        if (_lighthouseLarge != null) {
            return _lighthouseLarge!!
        }
        _lighthouseLarge = Builder(name = "LighthouseLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(24.0f, 3.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, 6.0f)
                verticalLineToRelative(1.0f)
                lineTo(18.0f, 10.0f)
                lineTo(18.0f, 9.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                moveToRelative(-7.0f, 7.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.937f)
                lineToRelative(-2.88f, 24.0f)
                lineTo(6.0f, 45.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(36.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-8.057f)
                lineToRelative(-2.88f, -24.0f)
                lineTo(34.0f, 21.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(31.0f, 9.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, -14.0f, 0.0f)
                close()
                moveTo(18.0f, 11.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-9.0f)
                close()
                moveTo(26.0f, 20.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(17.943f, 21.0f)
                lineTo(17.343f, 26.0f)
                horizontalLineToRelative(13.314f)
                lineToRelative(-0.6f, -5.0f)
                close()
                moveTo(15.903f, 38.0f)
                lineTo(16.503f, 33.0f)
                horizontalLineToRelative(14.994f)
                lineToRelative(0.6f, 5.0f)
                close()
                moveTo(30.777f, 27.0f)
                lineTo(31.377f, 32.0f)
                lineTo(16.623f, 32.0f)
                lineToRelative(0.6f, -5.0f)
                close()
                moveTo(15.783f, 39.0f)
                lineToRelative(-0.72f, 6.0f)
                horizontalLineToRelative(17.874f)
                lineToRelative(-0.72f, -6.0f)
                close()
                moveTo(42.0f, 15.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(37.245f, 10.935f)
                lineTo(45.245f, 6.435f)
                lineTo(44.755f, 5.565f)
                lineTo(36.755f, 10.065f)
                close()
                moveTo(45.245f, 24.565f)
                lineTo(44.755f, 25.435f)
                lineTo(36.755f, 20.935f)
                lineTo(37.245f, 20.065f)
                close()
                moveTo(46.0f, 16.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(11.0f, 15.0f)
                verticalLineToRelative(1.0f)
                lineTo(6.0f, 16.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(10.755f, 10.935f)
                lineTo(11.245f, 10.065f)
                lineTo(3.245f, 5.565f)
                lineTo(2.755f, 6.435f)
                close()
                moveTo(11.245f, 20.935f)
                lineTo(3.245f, 25.435f)
                lineTo(2.755f, 24.565f)
                lineTo(10.755f, 20.065f)
                close()
                moveTo(4.0f, 16.0f)
                verticalLineToRelative(-1.0f)
                lineTo(2.0f, 15.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _lighthouseLarge!!
    }

private var _lighthouseLarge: ImageVector? = null
