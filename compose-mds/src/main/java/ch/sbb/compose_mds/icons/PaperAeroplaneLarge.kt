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

public val SBBIcons.PaperAeroplaneLarge: ImageVector
    get() {
        if (_paperAeroplaneLarge != null) {
            return _paperAeroplaneLarge!!
        }
        _paperAeroplaneLarge = Builder(name = "PaperAeroplaneLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(44.987f, 6.618f)
                lineToRelative(-8.0f, 33.0f)
                lineToRelative(-0.13f, 0.528f)
                lineToRelative(-11.308f, -3.77f)
                lineToRelative(-3.614f, 6.37f)
                lineToRelative(-0.463f, 0.816f)
                lineToRelative(-0.42f, -0.839f)
                lineToRelative(-4.904f, -9.809f)
                lineToRelative(-12.795f, -3.937f)
                lineToRelative(-1.145f, -0.351f)
                lineToRelative(1.056f, -0.567f)
                lineToRelative(41.0f, -22.0f)
                lineToRelative(0.986f, -0.529f)
                close()
                moveTo(17.115f, 32.61f)
                lineToRelative(22.298f, -20.707f)
                lineToRelative(-18.3f, 22.278f)
                lineToRelative(-0.113f, 0.139f)
                verticalLineToRelative(6.061f)
                close()
                moveTo(22.0f, 40.604f)
                lineToRelative(2.582f, -4.55f)
                lineToRelative(-2.582f, -0.86f)
                close()
                moveTo(43.498f, 8.508f)
                lineToRelative(-21.15f, 25.747f)
                lineToRelative(13.794f, 4.597f)
                close()
                moveTo(4.791f, 28.374f)
                lineToRelative(11.58f, 3.563f)
                lineToRelative(24.943f, -23.16f)
                close()
            }
        }
        .build()
        return _paperAeroplaneLarge!!
    }

private var _paperAeroplaneLarge: ImageVector? = null
