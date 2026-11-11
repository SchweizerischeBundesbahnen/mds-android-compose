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

public val SBBIcons.EiffelTowerSmall: ImageVector
    get() {
        if (_eiffelTowerSmall != null) {
            return _eiffelTowerSmall!!
        }
        _eiffelTowerSmall = Builder(name = "EiffelTowerSmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.997f, 2.45f)
                lineTo(12.952f, 2.0f)
                horizontalLineToRelative(-1.901f)
                lineToRelative(-0.048f, 0.446f)
                arcToRelative(72.6f, 72.6f, 0.0f, false, true, -2.9f, 13.9f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -2.047f, 4.924f)
                lineToRelative(-0.377f, 0.73f)
                horizontalLineToRelative(4.82f)
                verticalLineToRelative(-0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(4.831f)
                lineToRelative(-0.388f, -0.733f)
                lineToRelative(-0.343f, -0.675f)
                curveToRelative(-1.675f, -3.434f, -2.81f, -7.782f, -3.534f, -11.383f)
                arcToRelative(85.0f, 85.0f, 0.0f, false, true, -0.823f, -4.82f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, true, -0.23f, -1.809f)
                lineTo(13.0f, 2.481f)
                lineToRelative(-0.002f, -0.016f)
                lineToRelative(-0.001f, -0.008f)
                verticalLineToRelative(-0.006f)
                close()
                moveTo(11.69f, 5.0f)
                quadToRelative(0.142f, -0.998f, 0.256f, -2.0f)
                horizontalLineToRelative(0.107f)
                lineToRelative(0.01f, 0.081f)
                arcTo(70.0f, 70.0f, 0.0f, false, false, 12.32f, 5.0f)
                close()
                moveTo(11.541f, 6.0f)
                arcToRelative(74.0f, 74.0f, 0.0f, false, true, -0.958f, 5.0f)
                horizontalLineToRelative(2.84f)
                arcToRelative(85.097f, 85.097f, 0.0f, false, true, -0.95f, -5.0f)
                close()
                moveTo(13.653f, 12.0f)
                horizontalLineToRelative(-3.305f)
                arcToRelative(73.0f, 73.0f, 0.0f, false, true, -1.09f, 4.0f)
                horizontalLineToRelative(5.489f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, -1.094f, -4.0f)
                moveToRelative(1.42f, 5.0f)
                lineTo(8.941f, 17.0f)
                arcToRelative(33.0f, 33.0f, 0.0f, false, true, -1.634f, 4.0f)
                horizontalLineToRelative(2.244f)
                arcToRelative(2.499f, 2.499f, 0.0f, false, true, 4.896f, 0.0f)
                horizontalLineToRelative(2.238f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, -1.614f, -4.0f)
            }
        }
        .build()
        return _eiffelTowerSmall!!
    }

private var _eiffelTowerSmall: ImageVector? = null
