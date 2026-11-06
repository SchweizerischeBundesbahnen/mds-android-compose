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
                moveTo(10.904f, 1.706f)
                lineTo(10.5f, 1.15f)
                lineToRelative(-0.404f, 0.556f)
                lineToRelative(-4.0f, 5.5f)
                lineTo(6.0f, 7.337f)
                lineTo(6.0f, 11.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.702f)
                lineToRelative(-2.558f, 0.301f)
                lineToRelative(-0.343f, 0.04f)
                lineToRelative(-0.084f, 0.336f)
                lineToRelative(-1.0f, 4.0f)
                lineToRelative(-0.174f, 0.697f)
                lineToRelative(0.714f, -0.08f)
                lineToRelative(1.446f, -0.16f)
                lineTo(5.0f, 20.997f)
                horizontalLineToRelative(1.0f)
                lineToRelative(0.001f, -2.272f)
                lineToRelative(6.001f, -0.667f)
                lineToRelative(-0.002f, 2.94f)
                horizontalLineToRelative(1.0f)
                lineToRelative(0.002f, -3.05f)
                lineToRelative(6.001f, -0.668f)
                lineTo(19.0f, 20.998f)
                lineToRelative(1.0f, 0.001f)
                lineToRelative(0.003f, -3.829f)
                lineToRelative(1.552f, -0.172f)
                lineToRelative(0.445f, -0.05f)
                verticalLineToRelative(-5.009f)
                lineToRelative(-0.558f, 0.065f)
                lineTo(14.0f, 12.88f)
                lineTo(14.0f, 11.0f)
                horizontalLineToRelative(1.0f)
                lineTo(15.0f, 7.337f)
                lineToRelative(-0.096f, -0.131f)
                close()
                moveTo(13.0f, 11.0f)
                lineTo(8.0f, 11.0f)
                verticalLineToRelative(2.585f)
                lineToRelative(5.0f, -0.588f)
                close()
                moveTo(7.0f, 10.0f)
                lineTo(7.0f, 8.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(10.5f, 2.85f)
                lineTo(7.482f, 7.0f)
                horizontalLineToRelative(6.036f)
                close()
                moveTo(13.559f, 13.938f)
                lineTo(21.0f, 13.062f)
                verticalLineToRelative(2.99f)
                lineToRelative(-1.552f, 0.173f)
                lineToRelative(-7.0f, 0.778f)
                lineToRelative(-7.002f, 0.778f)
                lineToRelative(-1.286f, 0.143f)
                lineToRelative(0.741f, -2.968f)
                lineToRelative(2.657f, -0.312f)
                close()
            }
        }
        .build()
        return _lucerneChapelBridgeSmall!!
    }

private var _lucerneChapelBridgeSmall: ImageVector? = null
