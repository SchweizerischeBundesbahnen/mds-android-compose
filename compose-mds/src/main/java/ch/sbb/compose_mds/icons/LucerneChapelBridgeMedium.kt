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

public val SBBIcons.LucerneChapelBridgeMedium: ImageVector
    get() {
        if (_lucerneChapelBridgeMedium != null) {
            return _lucerneChapelBridgeMedium!!
        }
        _lucerneChapelBridgeMedium = Builder(name = "LucerneChapelBridgeMedium", defaultWidth =
                36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.25f, 15.25f)
                horizontalLineToRelative(-11.0f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(11.0f)
                close()
                moveTo(20.769f, 10.75f)
                lineTo(10.732f, 10.75f)
                lineToRelative(5.018f, -6.9f)
                close()
                moveTo(20.75f, 16.25f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-5.162f)
                lineToRelative(-0.096f, -0.132f)
                lineToRelative(-6.0f, -8.25f)
                lineToRelative(-0.404f, -0.556f)
                lineToRelative(-0.404f, 0.556f)
                lineToRelative(-6.0f, 8.25f)
                lineToRelative(-0.096f, 0.132f)
                verticalLineToRelative(5.162f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(4.525f)
                lineToRelative(-4.059f, 0.479f)
                lineToRelative(-0.342f, 0.04f)
                lineToRelative(-0.084f, 0.335f)
                lineToRelative(-1.5f, 6.0f)
                lineToRelative(-0.174f, 0.697f)
                lineToRelative(0.715f, -0.079f)
                lineToRelative(2.445f, -0.272f)
                lineToRelative(-0.001f, 3.521f)
                lineToRelative(1.0f, 0.001f)
                lineToRelative(0.001f, -3.634f)
                lineToRelative(9.502f, -1.055f)
                lineToRelative(-0.003f, 4.688f)
                lineToRelative(1.0f, 0.001f)
                lineToRelative(0.003f, -4.8f)
                lineToRelative(9.501f, -1.055f)
                lineToRelative(-0.004f, 5.854f)
                lineToRelative(1.0f, 0.001f)
                lineToRelative(0.004f, -5.967f)
                lineToRelative(2.552f, -0.283f)
                lineToRelative(0.444f, -0.05f)
                verticalLineToRelative(-7.01f)
                lineToRelative(-0.559f, 0.067f)
                lineToRelative(-11.44f, 1.345f)
                close()
                moveTo(19.75f, 16.25f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(4.407f)
                lineToRelative(8.0f, -0.94f)
                close()
                moveTo(11.309f, 21.717f)
                lineTo(20.309f, 20.658f)
                lineTo(31.75f, 19.311f)
                verticalLineToRelative(4.99f)
                lineToRelative(-2.55f, 0.285f)
                lineToRelative(-10.502f, 1.167f)
                lineToRelative(-10.5f, 1.167f)
                lineToRelative(-2.289f, 0.253f)
                lineToRelative(1.242f, -4.968f)
                close()
            }
        }
        .build()
        return _lucerneChapelBridgeMedium!!
    }

private var _lucerneChapelBridgeMedium: ImageVector? = null
