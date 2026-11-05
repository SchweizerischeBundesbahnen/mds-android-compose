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
                moveTo(24.0f, 2.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -7.0f, 7.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.936f)
                lineToRelative(-2.88f, 24.0f)
                lineTo(6.0f, 45.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(36.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-8.056f)
                lineToRelative(-2.88f, -24.0f)
                lineTo(34.0f, 21.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(31.0f, 9.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -7.0f, -7.0f)
                moveToRelative(6.0f, 8.0f)
                lineTo(30.0f, 9.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(1.0f)
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
                moveTo(17.944f, 21.0f)
                lineTo(17.344f, 26.0f)
                horizontalLineToRelative(13.312f)
                lineToRelative(-0.6f, -5.0f)
                close()
                moveTo(15.904f, 38.0f)
                lineTo(16.504f, 33.0f)
                horizontalLineToRelative(14.992f)
                lineToRelative(0.6f, 5.0f)
                close()
                moveTo(30.776f, 27.0f)
                lineTo(31.376f, 32.0f)
                lineTo(16.624f, 32.0f)
                lineToRelative(0.6f, -5.0f)
                close()
                moveTo(15.784f, 39.0f)
                lineToRelative(-0.72f, 6.0f)
                horizontalLineToRelative(17.872f)
                lineToRelative(-0.72f, -6.0f)
                close()
                moveTo(42.0f, 16.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(37.245f, 10.936f)
                lineTo(45.245f, 6.436f)
                lineTo(44.755f, 5.564f)
                lineTo(36.755f, 10.064f)
                close()
                moveTo(44.755f, 25.436f)
                lineTo(36.755f, 20.936f)
                lineTo(37.245f, 20.064f)
                lineTo(45.245f, 24.564f)
                close()
                moveTo(44.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(6.0f, 15.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.0f)
                lineTo(6.0f, 16.0f)
                close()
                moveTo(11.245f, 10.064f)
                lineTo(3.245f, 5.564f)
                lineTo(2.755f, 6.436f)
                lineTo(10.755f, 10.936f)
                close()
                moveTo(2.755f, 24.564f)
                lineTo(10.755f, 20.064f)
                lineTo(11.245f, 20.936f)
                lineTo(3.245f, 25.436f)
                close()
                moveTo(4.0f, 15.0f)
                lineTo(2.0f, 15.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _lighthouseLarge!!
    }

private var _lighthouseLarge: ImageVector? = null
