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
                moveToRelative(16.154f, 2.706f)
                lineToRelative(-0.404f, -0.556f)
                lineToRelative(-0.404f, 0.556f)
                lineToRelative(-6.0f, 8.25f)
                lineToRelative(-0.096f, 0.132f)
                verticalLineToRelative(5.162f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(4.526f)
                lineToRelative(-4.058f, 0.477f)
                lineToRelative(-0.343f, 0.04f)
                lineToRelative(-0.084f, 0.336f)
                lineToRelative(-1.5f, 6.0f)
                lineToRelative(-0.174f, 0.697f)
                lineToRelative(0.714f, -0.08f)
                lineToRelative(2.447f, -0.27f)
                lineToRelative(-0.002f, 3.52f)
                horizontalLineToRelative(1.0f)
                lineToRelative(0.002f, -3.632f)
                lineToRelative(9.501f, -1.056f)
                lineToRelative(-0.003f, 4.688f)
                horizontalLineToRelative(1.0f)
                lineToRelative(0.003f, -4.799f)
                lineToRelative(9.502f, -1.056f)
                lineToRelative(-0.005f, 5.855f)
                horizontalLineToRelative(1.0f)
                lineToRelative(0.005f, -5.966f)
                lineToRelative(2.55f, -0.283f)
                lineToRelative(0.445f, -0.05f)
                verticalLineToRelative(-7.009f)
                lineToRelative(-0.558f, 0.065f)
                lineTo(20.75f, 19.6f)
                lineTo(20.75f, 16.25f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-5.162f)
                lineToRelative(-0.096f, -0.132f)
                close()
                moveTo(19.75f, 16.25f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(4.408f)
                lineToRelative(8.0f, -0.94f)
                close()
                moveTo(10.25f, 15.25f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(3.5f)
                close()
                moveTo(15.75f, 3.85f)
                lineTo(10.732f, 10.75f)
                horizontalLineToRelative(10.036f)
                close()
                moveTo(20.308f, 20.658f)
                lineTo(31.75f, 19.312f)
                verticalLineToRelative(4.99f)
                lineToRelative(-2.55f, 0.284f)
                lineToRelative(-10.502f, 1.167f)
                lineToRelative(-10.501f, 1.166f)
                lineToRelative(-2.287f, 0.255f)
                lineToRelative(1.241f, -4.968f)
                lineToRelative(4.158f, -0.489f)
                close()
            }
        }
        .build()
        return _lucerneChapelBridgeMedium!!
    }

private var _lucerneChapelBridgeMedium: ImageVector? = null
