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
                moveToRelative(45.25f, 5.53f)
                lineToRelative(-0.264f, 1.087f)
                lineToRelative(-8.0f, 33.0f)
                lineToRelative(-0.128f, 0.529f)
                lineToRelative(-0.516f, -0.172f)
                lineToRelative(-10.793f, -3.598f)
                lineToRelative(-3.614f, 6.37f)
                lineToRelative(-0.463f, 0.816f)
                lineToRelative(-0.419f, -0.839f)
                lineToRelative(-4.904f, -9.808f)
                lineToRelative(-12.796f, -3.937f)
                lineToRelative(-1.145f, -0.353f)
                lineToRelative(1.056f, -0.566f)
                lineToRelative(41.0f, -22.0f)
                close()
                moveTo(17.115f, 32.611f)
                lineTo(21.0f, 40.381f)
                lineTo(21.0f, 34.32f)
                lineToRelative(0.114f, -0.138f)
                lineTo(39.41f, 11.908f)
                close()
                moveTo(22.0f, 40.605f)
                lineToRelative(2.582f, -4.55f)
                lineTo(22.0f, 35.192f)
                close()
                moveTo(36.142f, 38.853f)
                lineTo(22.348f, 34.255f)
                lineTo(43.5f, 8.505f)
                close()
                moveTo(41.312f, 8.778f)
                lineTo(16.372f, 31.937f)
                lineTo(4.792f, 28.374f)
                close()
            }
        }
        .build()
        return _paperAeroplaneLarge!!
    }

private var _paperAeroplaneLarge: ImageVector? = null
