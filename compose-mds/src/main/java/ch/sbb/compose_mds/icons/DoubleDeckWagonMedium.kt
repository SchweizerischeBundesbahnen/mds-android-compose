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
                moveTo(30.249f, 12.746f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineToRelative(-22.505f, 0.002f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                lineToRelative(0.003f, 13.0f)
                horizontalLineToRelative(2.001f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(6.0f)
                lineTo(30.25f, 25.748f)
                close()
                moveTo(12.249f, 25.748f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(31.249f, 26.748f)
                horizontalLineToRelative(-1.514f)
                quadToRelative(0.013f, 0.12f, 0.013f, 0.248f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, -5.488f, -0.248f)
                lineTo(11.735f, 26.748f)
                quadToRelative(0.012f, 0.12f, 0.013f, 0.248f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, -5.488f, -0.248f)
                lineTo(4.747f, 26.748f)
                verticalLineToRelative(-1.502f)
                lineTo(2.997f, 25.246f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.748f)
                lineToRelative(-0.002f, -11.498f)
                lineToRelative(0.01f, -0.205f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.99f, -1.795f)
                lineToRelative(22.505f, -0.002f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(11.5f)
                lineTo(33.0f, 24.246f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.75f)
                close()
                moveTo(25.269f, 26.748f)
                horizontalLineToRelative(3.458f)
                quadToRelative(0.02f, 0.123f, 0.02f, 0.248f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, true, -3.5f, 0.0f)
                quadToRelative(0.0f, -0.125f, 0.022f, -0.248f)
                moveToRelative(-18.0f, 0.0f)
                horizontalLineToRelative(3.458f)
                quadToRelative(0.02f, 0.123f, 0.02f, 0.248f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, true, -3.5f, 0.0f)
                quadToRelative(0.0f, -0.125f, 0.022f, -0.248f)
                moveToRelative(20.981f, -9.002f)
                verticalLineToRelative(-4.0f)
                lineTo(7.748f, 13.746f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(27.25f, 16.746f)
                lineTo(8.748f, 16.746f)
                verticalLineToRelative(-2.0f)
                lineTo(27.25f, 14.746f)
                close()
                moveTo(28.25f, 19.747f)
                verticalLineToRelative(4.0f)
                lineTo(15.25f, 23.747f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(16.249f, 22.747f)
                lineTo(27.25f, 22.747f)
                verticalLineToRelative(-2.0f)
                lineTo(16.25f, 20.747f)
                close()
            }
        }
        .build()
        return _doubleDeckWagonMedium!!
    }

private var _doubleDeckWagonMedium: ImageVector? = null
