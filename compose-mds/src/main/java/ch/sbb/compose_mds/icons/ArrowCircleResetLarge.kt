package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.ArrowCircleResetLarge: ImageVector
    get() {
        if (_arrowCircleResetLarge != null) {
            return _arrowCircleResetLarge!!
        }
        _arrowCircleResetLarge = Builder(name = "ArrowCircleResetLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.5f, 8.0f)
                curveTo(32.476f, 8.0f, 39.0f, 14.524f, 39.0f, 23.5f)
                reflectiveCurveTo(32.476f, 39.0f, 23.5f, 39.0f)
                curveToRelative(-7.522f, 0.0f, -13.329f, -4.589f, -15.006f, -11.38f)
                lineToRelative(0.486f, -0.12f)
                lineToRelative(0.486f, -0.12f)
                curveTo(11.029f, 33.709f, 16.422f, 38.0f, 23.5f, 38.0f)
                curveTo(31.924f, 38.0f, 38.0f, 31.924f, 38.0f, 23.5f)
                reflectiveCurveTo(31.924f, 9.0f, 23.5f, 9.0f)
                curveToRelative(-6.282f, 0.0f, -12.074f, 3.798f, -14.268f, 9.0f)
                horizontalLineTo(18.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(9.02f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(7.183f)
                curveTo(11.736f, 11.35f, 17.422f, 8.0f, 23.5f, 8.0f)
            }
        }
        .build()
        return _arrowCircleResetLarge!!
    }

private var _arrowCircleResetLarge: ImageVector? = null
