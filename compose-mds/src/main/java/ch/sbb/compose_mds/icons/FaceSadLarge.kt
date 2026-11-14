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

public val SBBIcons.FaceSadLarge: ImageVector
    get() {
        if (_faceSadLarge != null) {
            return _faceSadLarge!!
        }
        _faceSadLarge = Builder(name = "FaceSadLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
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
                moveToRelative(-5.646f, -23.853f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.707f, 0.707f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.707f, -0.707f)
                moveToRelative(0.893f, 1.186f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -2.494f, -1.667f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.494f, 1.667f)
                moveTo(31.0f, 18.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -1.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, -0.001f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.001f)
                moveToRelative(-2.172f, 9.735f)
                arcToRelative(12.09f, 12.09f, 0.0f, false, false, -14.893f, 3.46f)
                lineToRelative(0.79f, 0.61f)
                arcToRelative(11.09f, 11.09f, 0.0f, false, true, 17.55f, 0.0f)
                lineToRelative(0.79f, -0.61f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, -4.237f, -3.46f)
            }
        }
        .build()
        return _faceSadLarge!!
    }

private var _faceSadLarge: ImageVector? = null
