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

public val LargeGroup.CircleTriangleSquareLarge: ImageVector
    get() {
        if (_circleTriangleSquareLarge != null) {
            return _circleTriangleSquareLarge!!
        }
        _circleTriangleSquareLarge = Builder(name = "CircleTriangleSquareLarge", defaultWidth =
                48.0.dp, defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight =
                48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.5f, 3.0f)
                arcTo(9.5f, 9.5f, 0.0f, false, false, 3.0f, 12.5f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, false, 9.5f, 9.5f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, false, 9.5f, -9.5f)
                arcTo(9.5f, 9.5f, 0.0f, false, false, 12.5f, 3.0f)
                moveTo(2.0f, 12.5f)
                curveTo(2.0f, 6.7f, 6.7f, 2.0f, 12.5f, 2.0f)
                reflectiveCurveTo(23.0f, 6.7f, 23.0f, 12.5f)
                reflectiveCurveTo(18.3f, 23.0f, 12.5f, 23.0f)
                reflectiveCurveTo(2.0f, 18.3f, 2.0f, 12.5f)
                moveToRelative(24.0f, 0.5f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(20.0f)
                lineTo(26.0f, 33.0f)
                lineTo(26.0f, 13.0f)
                moveToRelative(1.0f, 19.0f)
                horizontalLineToRelative(18.0f)
                lineTo(45.0f, 14.0f)
                lineTo(27.0f, 14.0f)
                close()
                moveTo(16.93f, 25.745f)
                lineTo(16.5f, 25.015f)
                lineTo(16.07f, 25.745f)
                lineTo(4.57f, 45.245f)
                lineTo(4.125f, 45.999f)
                lineTo(5.0f, 45.999f)
                lineTo(28.0f, 46.0f)
                horizontalLineToRelative(0.875f)
                lineToRelative(-0.444f, -0.754f)
                close()
                moveTo(16.5f, 26.983f)
                lineTo(27.125f, 45.0f)
                lineTo(5.875f, 45.0f)
                close()
            }
        }
        .build()
        return _circleTriangleSquareLarge!!
    }

private var _circleTriangleSquareLarge: ImageVector? = null
