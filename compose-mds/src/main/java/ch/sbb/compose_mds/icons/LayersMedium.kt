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
                moveToRelative(32.532f, 14.587f)
                lineToRelative(-14.25f, -9.75f)
                lineTo(18.0f, 4.645f)
                lineToRelative(-0.282f, 0.192f)
                lineToRelative(-14.25f, 9.75f)
                lineToRelative(-0.604f, 0.413f)
                lineToRelative(0.604f, 0.413f)
                lineToRelative(3.83f, 2.62f)
                lineToRelative(-3.825f, 2.551f)
                lineToRelative(-0.617f, 0.41f)
                lineToRelative(0.612f, 0.42f)
                lineToRelative(14.25f, 9.75f)
                lineToRelative(0.282f, 0.191f)
                lineToRelative(0.282f, -0.192f)
                lineToRelative(14.25f, -9.75f)
                lineToRelative(0.612f, -0.419f)
                lineToRelative(-0.617f, -0.41f)
                lineToRelative(-3.825f, -2.55f)
                lineToRelative(3.83f, -2.62f)
                lineToRelative(0.604f, -0.414f)
                close()
                moveTo(27.812f, 18.642f)
                lineTo(18.282f, 25.163f)
                lineTo(18.0f, 25.355f)
                lineTo(17.718f, 25.163f)
                lineTo(8.188f, 18.643f)
                lineTo(4.644f, 21.005f)
                lineTo(18.0f, 30.144f)
                lineToRelative(13.356f, -9.14f)
                close()
                moveTo(18.0f, 24.144f)
                lineTo(4.636f, 15.0f)
                lineTo(18.0f, 5.855f)
                lineTo(31.363f, 15.0f)
                close()
            }
        }
        .build()
        return _layersMedium!!
    }

private var _layersMedium: ImageVector? = null
