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

public val SBBIcons.LayersMedium: ImageVector
    get() {
        if (_layersMedium != null) {
            return _layersMedium!!
        }
        _layersMedium = Builder(name = "LayersMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.282f, 4.837f)
                lineTo(18.0f, 4.644f)
                lineToRelative(-0.282f, 0.193f)
                lineToRelative(-14.25f, 9.75f)
                lineToRelative(-0.603f, 0.413f)
                lineToRelative(0.603f, 0.413f)
                lineToRelative(3.83f, 2.62f)
                lineToRelative(-3.825f, 2.551f)
                lineToRelative(-0.616f, 0.41f)
                lineToRelative(0.61f, 0.419f)
                lineToRelative(14.25f, 9.75f)
                lineToRelative(0.283f, 0.193f)
                lineToRelative(0.282f, -0.193f)
                lineToRelative(14.25f, -9.75f)
                lineToRelative(0.611f, -0.418f)
                lineToRelative(-0.616f, -0.411f)
                lineToRelative(-3.825f, -2.55f)
                lineToRelative(3.83f, -2.621f)
                lineToRelative(0.604f, -0.413f)
                lineToRelative(-0.604f, -0.413f)
                close()
                moveTo(27.812f, 18.642f)
                lineTo(18.282f, 25.162f)
                lineTo(18.0f, 25.356f)
                lineTo(17.718f, 25.163f)
                lineTo(8.188f, 18.643f)
                lineTo(4.643f, 21.005f)
                lineTo(18.0f, 30.145f)
                lineToRelative(13.357f, -9.14f)
                close()
                moveTo(18.0f, 24.144f)
                lineTo(4.635f, 15.0f)
                lineTo(18.0f, 5.856f)
                lineTo(31.365f, 15.0f)
                close()
            }
        }
        .build()
        return _layersMedium!!
    }

private var _layersMedium: ImageVector? = null
