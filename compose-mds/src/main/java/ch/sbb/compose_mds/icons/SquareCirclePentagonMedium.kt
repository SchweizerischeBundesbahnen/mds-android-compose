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

public val SBBIcons.SquareCirclePentagonMedium: ImageVector
    get() {
        if (_squareCirclePentagonMedium != null) {
            return _squareCirclePentagonMedium!!
        }
        _squareCirclePentagonMedium = Builder(
            name = "SquareCirclePentagonMedium",
            defaultWidth =
                36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight =
            36.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(32.75f, 32.75f)
                lineTo(3.25f, 32.75f)
                lineTo(3.25f, 3.25f)
                horizontalLineToRelative(29.5f)
                close()
                moveTo(4.25f, 31.75f)
                horizontalLineToRelative(27.5f)
                lineTo(31.75f, 4.25f)
                lineTo(4.25f, 4.25f)
                close()
                moveTo(18.0f, 6.25f)
                curveToRelative(6.49f, 0.0f, 11.75f, 5.26f, 11.75f, 11.75f)
                reflectiveCurveTo(24.49f, 29.75f, 18.0f, 29.75f)
                reflectiveCurveTo(6.25f, 24.49f, 6.25f, 18.0f)
                reflectiveCurveTo(11.51f, 6.25f, 18.0f, 6.25f)
                moveToRelative(0.0f, 1.0f)
                curveTo(12.063f, 7.25f, 7.25f, 12.063f, 7.25f, 18.0f)
                reflectiveCurveTo(12.063f, 28.75f, 18.0f, 28.75f)
                reflectiveCurveTo(28.75f, 23.937f, 28.75f, 18.0f)
                reflectiveCurveTo(23.937f, 7.25f, 18.0f, 7.25f)
                moveToRelative(0.248f, 4.315f)
                lineToRelative(5.25f, 3.0f)
                lineToRelative(0.252f, 0.145f)
                verticalLineToRelative(9.04f)
                horizontalLineToRelative(-11.5f)
                verticalLineToRelative(-9.04f)
                lineToRelative(0.252f, -0.145f)
                lineToRelative(5.25f, -3.0f)
                lineToRelative(0.248f, -0.141f)
                close()
                moveTo(13.25f, 15.29f)
                verticalLineToRelative(7.46f)
                horizontalLineToRelative(9.5f)
                verticalLineToRelative(-7.46f)
                lineTo(18.0f, 12.576f)
                close()
            }
        }
            .build()
        return _squareCirclePentagonMedium!!
    }

private var _squareCirclePentagonMedium: ImageVector? = null
