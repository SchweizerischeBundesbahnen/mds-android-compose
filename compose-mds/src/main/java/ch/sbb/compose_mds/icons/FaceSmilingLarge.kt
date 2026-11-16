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

public val SBBIcons.FaceSmilingLarge: ImageVector
    get() {
        if (_faceSmilingLarge != null) {
            return _faceSmilingLarge!!
        }
        _faceSmilingLarge = Builder(name = "FaceSmilingLarge", defaultWidth = 48.0.dp, defaultHeight
                = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(24.5f, 6.0f)
                curveTo(34.165f, 6.0f, 42.0f, 13.835f, 42.0f, 23.5f)
                reflectiveCurveTo(34.165f, 41.0f, 24.5f, 41.0f)
                reflectiveCurveTo(7.0f, 33.165f, 7.0f, 23.5f)
                reflectiveCurveTo(14.835f, 6.0f, 24.5f, 6.0f)
                moveToRelative(0.0f, 36.0f)
                curveTo(34.717f, 42.0f, 43.0f, 33.717f, 43.0f, 23.5f)
                reflectiveCurveTo(34.717f, 5.0f, 24.5f, 5.0f)
                reflectiveCurveTo(6.0f, 13.283f, 6.0f, 23.5f)
                reflectiveCurveTo(14.283f, 42.0f, 24.5f, 42.0f)
                moveToRelative(4.349f, -9.967f)
                arcToRelative(10.3f, 10.3f, 0.0f, false, false, 3.534f, -2.712f)
                lineToRelative(-0.766f, -0.642f)
                arcToRelative(9.29f, 9.29f, 0.0f, false, true, -14.234f, 0.0f)
                lineToRelative(-0.766f, 0.642f)
                arcToRelative(10.29f, 10.29f, 0.0f, false, false, 12.232f, 2.712f)
                moveTo(19.0f, 18.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -1.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, -0.001f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.001f)
                moveToRelative(10.854f, -0.354f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.707f, 0.708f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.707f, -0.707f)
                moveToRelative(0.893f, 1.187f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -2.494f, -1.667f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.494f, 1.667f)
            }
        }
        .build()
        return _faceSmilingLarge!!
    }

private var _faceSmilingLarge: ImageVector? = null
