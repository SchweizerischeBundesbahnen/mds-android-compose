package ch.sbb.compose_mds.sbbicons.large

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.LargeGroup

public val LargeGroup.FaceSadLarge: ImageVector
    get() {
        if (_faceSadLarge != null) {
            return _faceSadLarge!!
        }
        _faceSadLarge = Builder(name = "FaceSadLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
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
                moveToRelative(-6.0f, 12.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                moveToRelative(-0.278f, 1.084f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.556f, 0.83f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.556f, -0.83f)
                moveToRelative(11.445f, -0.831f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 1.667f, 2.495f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.667f, -2.495f)
                moveTo(30.5f, 18.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveToRelative(-6.0f, 8.998f)
                arcToRelative(12.09f, 12.09f, 0.0f, false, false, -9.565f, 4.696f)
                lineToRelative(0.79f, 0.612f)
                arcToRelative(11.09f, 11.09f, 0.0f, false, true, 17.55f, 0.0f)
                lineToRelative(0.79f, -0.612f)
                arcToRelative(12.09f, 12.09f, 0.0f, false, false, -9.565f, -4.696f)
            }
        }
        .build()
        return _faceSadLarge!!
    }

private var _faceSadLarge: ImageVector? = null
