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

public val SBBIcons.UndergroundVehiculeProfileSmall: ImageVector
    get() {
        if (_undergroundVehiculeProfileSmall != null) {
            return _undergroundVehiculeProfileSmall!!
        }
        _undergroundVehiculeProfileSmall = Builder(name = "UndergroundVehiculeProfileSmall",
                defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f,
                viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.01f, 18.5f)
                verticalLineToRelative(-4.707f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, false, -0.062f, -0.438f)
                lineToRelative(-2.716f, -8.99f)
                lineToRelative(-0.03f, -0.074f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.366f, -0.274f)
                lineToRelative(-0.08f, -0.007f)
                lineTo(2.01f, 4.01f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(13.754f)
                lineToRelative(0.12f, 0.006f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.266f, 0.946f)
                lineToRelative(0.039f, 0.113f)
                lineToRelative(2.72f, 9.0f)
                lineToRelative(0.002f, 0.01f)
                quadToRelative(0.096f, 0.344f, 0.099f, 0.701f)
                lineToRelative(-0.571f, 0.004f)
                horizontalLineToRelative(0.071f)
                lineToRelative(0.5f, -0.004f)
                lineTo(20.01f, 18.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                lineTo(2.01f, 20.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(16.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                moveTo(22.0f, 21.0f)
                verticalLineToRelative(1.0f)
                lineTo(2.02f, 22.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(15.491f, 5.362f)
                lineTo(15.387f, 5.0f)
                lineTo(10.0f, 5.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(7.673f)
                lineToRelative(-0.182f, -0.638f)
                close()
                moveTo(16.347f, 12.0f)
                lineTo(11.0f, 12.0f)
                lineTo(11.0f, 6.0f)
                horizontalLineToRelative(3.633f)
                close()
                moveTo(6.0f, 6.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(2.0f)
                lineTo(8.0f, 6.0f)
                close()
                moveTo(2.0f, 5.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(13.0f)
                lineTo(2.0f, 18.0f)
                close()
                moveTo(3.0f, 17.0f)
                horizontalLineToRelative(2.0f)
                lineTo(5.0f, 6.0f)
                lineTo(3.0f, 6.0f)
                close()
            }
        }
        .build()
        return _undergroundVehiculeProfileSmall!!
    }

private var _undergroundVehiculeProfileSmall: ImageVector? = null
