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

public val SBBIcons.BulbOnLarge: ImageVector
    get() {
        if (_bulbOnLarge != null) {
            return _bulbOnLarge!!
        }
        _bulbOnLarge = Builder(name = "BulbOnLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(24.0f, 11.0f)
                lineTo(24.0f, 8.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(32.0f, 24.5f)
                curveToRelative(0.0f, -4.724f, -3.776f, -8.5f, -8.5f, -8.5f)
                arcToRelative(8.463f, 8.463f, 0.0f, false, false, -8.5f, 8.5f)
                curveToRelative(0.0f, 3.154f, 1.832f, 5.963f, 4.435f, 7.5f)
                lineTo(22.0f, 32.0f)
                verticalLineToRelative(-3.76f)
                lineToRelative(-2.312f, -1.85f)
                lineToRelative(0.625f, -0.78f)
                lineToRelative(2.5f, 2.0f)
                lineToRelative(0.187f, 0.15f)
                lineTo(23.0f, 32.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-4.24f)
                lineToRelative(0.188f, -0.15f)
                lineToRelative(2.5f, -2.0f)
                lineToRelative(0.625f, 0.78f)
                lineTo(25.0f, 28.24f)
                lineTo(25.0f, 32.0f)
                horizontalLineToRelative(2.58f)
                curveTo(30.15f, 30.66f, 32.0f, 27.674f, 32.0f, 24.5f)
                moveToRelative(-18.0f, 0.0f)
                curveToRelative(0.0f, 3.154f, 1.623f, 5.967f, 4.0f, 7.744f)
                verticalLineToRelative(6.81f)
                lineToRelative(0.335f, 0.118f)
                lineTo(22.0f, 40.454f)
                lineTo(22.0f, 42.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.546f)
                lineToRelative(3.665f, -1.282f)
                lineToRelative(0.335f, -0.117f)
                lineTo(29.0f, 32.3f)
                curveToRelative(2.393f, -1.692f, 4.0f, -4.667f, 4.0f, -7.801f)
                curveToRelative(0.0f, -5.276f, -4.224f, -9.5f, -9.5f, -9.5f)
                arcToRelative(9.463f, 9.463f, 0.0f, false, false, -9.5f, 9.5f)
                moveToRelative(5.0f, 13.845f)
                lineToRelative(3.665f, 1.283f)
                lineToRelative(0.335f, 0.117f)
                lineTo(23.0f, 41.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.255f)
                lineToRelative(0.335f, -0.117f)
                lineTo(28.0f, 38.345f)
                lineTo(28.0f, 37.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(39.999f, 25.007f)
                lineTo(40.001f, 24.007f)
                lineTo(37.001f, 23.999f)
                lineTo(36.999f, 24.999f)
                close()
                moveTo(10.0f, 24.0f)
                verticalLineToRelative(1.0f)
                lineTo(7.0f, 25.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(38.04f, 16.69f)
                lineTo(35.438f, 18.185f)
                lineTo(34.94f, 17.318f)
                lineTo(37.543f, 15.823f)
                close()
                moveTo(9.459f, 33.185f)
                lineToRelative(2.597f, -1.5f)
                lineToRelative(-0.5f, -0.866f)
                lineToRelative(-2.597f, 1.5f)
                close()
                moveTo(32.185f, 10.469f)
                lineTo(30.68f, 13.06f)
                lineToRelative(-0.866f, -0.502f)
                lineToRelative(1.506f, -2.593f)
                close()
                moveTo(37.536f, 33.191f)
                lineTo(38.038f, 32.325f)
                lineTo(35.444f, 30.819f)
                lineTo(34.942f, 31.685f)
                close()
                moveTo(12.06f, 17.318f)
                lineToRelative(-0.5f, 0.866f)
                lineToRelative(-2.598f, -1.5f)
                lineToRelative(0.5f, -0.866f)
                close()
                moveTo(16.32f, 13.06f)
                lineTo(17.186f, 12.56f)
                lineTo(15.686f, 9.962f)
                lineTo(14.82f, 10.462f)
                close()
            }
        }
        .build()
        return _bulbOnLarge!!
    }

private var _bulbOnLarge: ImageVector? = null
