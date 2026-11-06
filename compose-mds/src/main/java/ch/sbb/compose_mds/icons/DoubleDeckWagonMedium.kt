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

public val SBBIcons.DoubleDeckWagonMedium: ImageVector
    get() {
        if (_doubleDeckWagonMedium != null) {
            return _doubleDeckWagonMedium!!
        }
        _doubleDeckWagonMedium = Builder(name = "DoubleDeckWagonMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(6.744f, 10.747f)
                lineToRelative(22.504f, -0.001f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                horizontalLineToRelative(0.002f)
                verticalLineToRelative(11.5f)
                horizontalLineToRelative(1.748f)
                verticalLineToRelative(1.0f)
                lineTo(31.25f, 25.246f)
                verticalLineToRelative(1.501f)
                horizontalLineToRelative(-1.515f)
                quadToRelative(0.013f, 0.121f, 0.013f, 0.249f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, -5.488f, -0.249f)
                lineTo(11.735f, 26.747f)
                quadToRelative(0.012f, 0.121f, 0.013f, 0.249f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, -5.488f, -0.249f)
                lineTo(4.747f, 26.747f)
                verticalLineToRelative(-1.5f)
                lineTo(2.997f, 25.247f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.748f)
                lineToRelative(-0.002f, -11.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                moveToRelative(18.525f, 16.0f)
                horizontalLineToRelative(3.458f)
                quadToRelative(0.02f, 0.124f, 0.02f, 0.249f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, true, -3.5f, 0.0f)
                quadToRelative(0.0f, -0.124f, 0.022f, -0.249f)
                moveToRelative(-18.0f, 0.0f)
                horizontalLineToRelative(3.458f)
                quadToRelative(0.02f, 0.124f, 0.02f, 0.249f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, true, -3.5f, 0.0f)
                quadToRelative(0.0f, -0.124f, 0.022f, -0.249f)
                moveToRelative(21.98f, -15.001f)
                lineToRelative(-22.505f, 0.001f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                lineToRelative(0.003f, 13.0f)
                horizontalLineToRelative(2.001f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(6.0f)
                lineTo(30.25f, 25.747f)
                lineTo(30.25f, 12.746f)
                horizontalLineToRelative(-0.002f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                moveToRelative(-17.0f, 14.001f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(3.5f)
                close()
                moveTo(8.248f, 13.746f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(4.0f)
                lineTo(28.25f, 17.746f)
                verticalLineToRelative(-4.0f)
                lineTo(8.248f, 13.746f)
                moveToRelative(0.5f, 3.0f)
                verticalLineToRelative(-2.0f)
                lineTo(27.25f, 14.746f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(15.248f, 19.747f)
                lineTo(28.25f, 19.747f)
                verticalLineToRelative(4.0f)
                lineTo(15.249f, 23.747f)
                verticalLineToRelative(-4.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                lineTo(27.25f, 22.747f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _doubleDeckWagonMedium!!
    }

private var _doubleDeckWagonMedium: ImageVector? = null
