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

public val SBBIcons.LucerneChapelBridgeSmall: ImageVector
    get() {
        if (_lucerneChapelBridgeSmall != null) {
            return _lucerneChapelBridgeSmall!!
        }
        _lucerneChapelBridgeSmall = Builder(name = "LucerneChapelBridgeSmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.0f, 8.0f)
                verticalLineToRelative(2.0f)
                lineTo(7.0f, 10.0f)
                lineTo(7.0f, 8.0f)
                close()
                moveTo(10.5f, 2.85f)
                lineTo(13.519f, 7.0f)
                lineTo(7.48f, 7.0f)
                close()
                moveTo(14.0f, 11.0f)
                horizontalLineToRelative(1.0f)
                lineTo(15.0f, 7.338f)
                lineToRelative(-0.096f, -0.132f)
                lineToRelative(-4.0f, -5.5f)
                lineToRelative(-0.404f, -0.556f)
                lineToRelative(-0.404f, 0.556f)
                lineToRelative(-4.0f, 5.5f)
                lineTo(6.0f, 7.338f)
                lineTo(6.0f, 11.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.702f)
                lineToRelative(-2.559f, 0.302f)
                lineToRelative(-0.342f, 0.04f)
                lineToRelative(-0.084f, 0.335f)
                lineToRelative(-1.0f, 4.0f)
                lineToRelative(-0.174f, 0.697f)
                lineToRelative(0.715f, -0.079f)
                lineTo(5.0f, 18.836f)
                verticalLineToRelative(2.161f)
                lineToRelative(1.0f, 0.001f)
                verticalLineToRelative(-2.273f)
                lineToRelative(6.001f, -0.666f)
                lineTo(12.0f, 20.997f)
                lineToRelative(1.0f, 0.001f)
                lineToRelative(0.001f, -3.05f)
                lineToRelative(6.002f, -0.668f)
                lineTo(19.0f, 20.997f)
                lineToRelative(1.0f, 0.001f)
                lineToRelative(0.003f, -3.83f)
                lineToRelative(1.553f, -0.17f)
                lineToRelative(0.444f, -0.05f)
                verticalLineToRelative(-5.01f)
                lineToRelative(-0.559f, 0.066f)
                lineToRelative(-7.441f, 0.874f)
                close()
                moveTo(13.0f, 11.0f)
                lineTo(8.0f, 11.0f)
                verticalLineToRelative(2.584f)
                lineToRelative(5.0f, -0.588f)
                close()
                moveTo(7.559f, 14.644f)
                lineTo(13.559f, 13.937f)
                lineTo(21.0f, 13.063f)
                verticalLineToRelative(2.99f)
                lineToRelative(-1.552f, 0.173f)
                lineToRelative(-7.0f, 0.778f)
                lineToRelative(-7.002f, 0.777f)
                lineToRelative(-1.287f, 0.143f)
                lineToRelative(0.742f, -2.968f)
                close()
            }
        }
        .build()
        return _lucerneChapelBridgeSmall!!
    }

private var _lucerneChapelBridgeSmall: ImageVector? = null
