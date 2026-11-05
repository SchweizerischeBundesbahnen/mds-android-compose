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
        _faceSmilingLarge = Builder(
            name = "FaceSmilingLarge",
            defaultWidth = 48.0.dp,
            defaultHeight =
                48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveTo(7.0f, 23.5f)
                curveTo(7.0f, 13.835f, 14.835f, 6.0f, 24.5f, 6.0f)
                reflectiveCurveTo(42.0f, 13.835f, 42.0f, 23.5f)
                reflectiveCurveTo(34.165f, 41.0f, 24.5f, 41.0f)
                reflectiveCurveTo(7.0f, 33.165f, 7.0f, 23.5f)
                moveTo(24.5f, 5.0f)
                curveTo(14.283f, 5.0f, 6.0f, 13.283f, 6.0f, 23.5f)
                reflectiveCurveTo(14.283f, 42.0f, 24.5f, 42.0f)
                reflectiveCurveTo(43.0f, 33.717f, 43.0f, 23.5f)
                reflectiveCurveTo(34.717f, 5.0f, 24.5f, 5.0f)
                moveToRelative(-7.883f, 24.321f)
                arcToRelative(10.29f, 10.29f, 0.0f, false, false, 15.766f, 0.0f)
                lineToRelative(-0.766f, -0.642f)
                arcToRelative(9.29f, 9.29f, 0.0f, false, true, -14.234f, 0.0f)
                close()
                moveTo(17.667f, 17.253f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 1.667f, 2.495f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.667f, -2.495f)
                moveTo(18.5f, 18.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveToRelative(12.0f, -1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                moveToRelative(-0.278f, 1.084f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.556f, 0.83f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.556f, -0.83f)
            }
        }
            .build()
        return _faceSmilingLarge!!
    }

private var _faceSmilingLarge: ImageVector? = null
