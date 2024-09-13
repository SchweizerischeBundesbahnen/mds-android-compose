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

public val LargeGroup.TargetLarge: ImageVector
    get() {
        if (_targetLarge != null) {
            return _targetLarge!!
        }
        _targetLarge = Builder(name = "TargetLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(38.0f, 4.5f)
                verticalLineTo(3.46f)
                lineToRelative(-0.812f, 0.65f)
                lineToRelative(-5.0f, 4.0f)
                lineToRelative(-0.188f, 0.15f)
                verticalLineToRelative(6.044f)
                lineToRelative(-1.644f, 1.77f)
                arcTo(16.44f, 16.44f, 0.0f, false, false, 19.5f, 12.0f)
                curveTo(10.388f, 12.0f, 3.0f, 19.388f, 3.0f, 28.5f)
                reflectiveCurveTo(10.388f, 45.0f, 19.5f, 45.0f)
                reflectiveCurveTo(36.0f, 37.613f, 36.0f, 28.5f)
                arcToRelative(16.45f, 16.45f, 0.0f, false, false, -4.911f, -11.745f)
                lineTo(32.718f, 15.0f)
                horizontalLineToRelative(5.989f)
                lineToRelative(0.147f, -0.146f)
                lineToRelative(5.0f, -5.0f)
                lineTo(44.707f, 9.0f)
                horizontalLineTo(38.0f)
                close()
                moveTo(33.0f, 14.0f)
                verticalLineTo(8.74f)
                lineToRelative(4.0f, -3.2f)
                verticalLineTo(10.0f)
                horizontalLineToRelative(5.293f)
                lineToRelative(-4.0f, 4.0f)
                close()
                moveTo(4.0f, 28.5f)
                curveTo(4.0f, 19.94f, 10.94f, 13.0f, 19.5f, 13.0f)
                arcToRelative(15.44f, 15.44f, 0.0f, false, true, 10.175f, 3.807f)
                lineToRelative(-1.361f, 1.467f)
                arcTo(13.45f, 13.45f, 0.0f, false, false, 19.5f, 15.0f)
                curveTo(12.044f, 15.0f, 6.0f, 21.044f, 6.0f, 28.5f)
                reflectiveCurveTo(12.044f, 42.0f, 19.5f, 42.0f)
                reflectiveCurveTo(33.0f, 35.956f, 33.0f, 28.5f)
                curveToRelative(0.0f, -3.728f, -1.51f, -7.103f, -3.954f, -9.546f)
                lineToRelative(1.362f, -1.466f)
                arcTo(15.45f, 15.45f, 0.0f, false, true, 35.0f, 28.5f)
                curveTo(35.0f, 37.06f, 28.06f, 44.0f, 19.5f, 44.0f)
                reflectiveCurveTo(4.0f, 37.06f, 4.0f, 28.5f)
                moveTo(19.5f, 16.0f)
                curveToRelative(3.106f, 0.0f, 5.947f, 1.132f, 8.133f, 3.007f)
                lineToRelative(-2.726f, 2.935f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, false, 0.733f, 0.68f)
                lineToRelative(2.725f, -2.934f)
                arcTo(12.46f, 12.46f, 0.0f, false, true, 32.0f, 28.5f)
                curveTo(32.0f, 35.404f, 26.404f, 41.0f, 19.5f, 41.0f)
                reflectiveCurveTo(7.0f, 35.404f, 7.0f, 28.5f)
                reflectiveCurveTo(12.596f, 16.0f, 19.5f, 16.0f)
                moveToRelative(0.0f, 5.0f)
                curveToRelative(1.791f, 0.0f, 3.436f, 0.628f, 4.726f, 1.676f)
                lineToRelative(-2.735f, 2.945f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.733f, 0.68f)
                lineToRelative(2.734f, -2.944f)
                arcTo(7.5f, 7.5f, 0.0f, true, true, 19.5f, 21.0f)
                moveToRelative(0.0f, 5.0f)
                curveToRelative(0.476f, 0.0f, 0.922f, 0.133f, 1.3f, 0.364f)
                lineToRelative(-1.666f, 1.796f)
                lineToRelative(0.732f, 0.68f)
                lineToRelative(1.667f, -1.795f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 19.5f, 26.0f)
            }
        }
        .build()
        return _targetLarge!!
    }

private var _targetLarge: ImageVector? = null
