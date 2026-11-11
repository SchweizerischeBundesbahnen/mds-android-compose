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

public val SBBIcons.FaceSmilingSmall: ImageVector
    get() {
        if (_faceSmilingSmall != null) {
            return _faceSmilingSmall!!
        }
        _faceSmilingSmall = Builder(name = "FaceSmilingSmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 4.0f)
                curveToRelative(4.47f, 0.0f, 8.0f, 3.53f, 8.0f, 8.0f)
                reflectiveCurveToRelative(-3.53f, 8.0f, -8.0f, 8.0f)
                reflectiveCurveToRelative(-8.0f, -3.53f, -8.0f, -8.0f)
                reflectiveCurveToRelative(3.53f, -8.0f, 8.0f, -8.0f)
                moveToRelative(0.0f, 17.0f)
                curveToRelative(5.022f, 0.0f, 9.0f, -3.978f, 9.0f, -9.0f)
                reflectiveCurveToRelative(-3.978f, -9.0f, -9.0f, -9.0f)
                reflectiveCurveToRelative(-9.0f, 3.977f, -9.0f, 9.0f)
                reflectiveCurveToRelative(3.978f, 9.0f, 9.0f, 9.0f)
                moveToRelative(0.0f, -3.0f)
                curveToRelative(2.28f, 0.0f, 4.175f, -1.358f, 5.012f, -3.303f)
                lineToRelative(-0.919f, -0.394f)
                curveTo(15.407f, 15.897f, 13.863f, 17.0f, 12.0f, 17.0f)
                arcToRelative(4.42f, 4.42f, 0.0f, false, true, -4.093f, -2.697f)
                lineToRelative(-0.918f, 0.394f)
                curveTo(7.825f, 16.642f, 9.72f, 18.0f, 11.999f, 18.0f)
                moveTo(8.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                moveToRelative(7.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
            }
        }
        .build()
        return _faceSmilingSmall!!
    }

private var _faceSmilingSmall: ImageVector? = null
