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

public val SBBIcons.ArrowCircleTrainTracksLarge: ImageVector
    get() {
        if (_arrowCircleTrainTracksLarge != null) {
            return _arrowCircleTrainTracksLarge!!
        }
        _arrowCircleTrainTracksLarge = Builder(
            name = "ArrowCircleTrainTracksLarge",
            defaultWidth =
                48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight =
            48.0f,
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
                moveTo(23.5f, 4.0f)
                curveTo(34.27f, 4.0f, 43.0f, 12.73f, 43.0f, 23.5f)
                reflectiveCurveTo(34.27f, 43.0f, 23.5f, 43.0f)
                curveToRelative(-8.1f, 0.0f, -15.379f, -4.95f, -18.332f, -12.0f)
                lineTo(5.0f, 31.0f)
                verticalLineToRelative(7.0f)
                lineTo(4.0f, 38.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(1.0f)
                lineTo(6.255f, 31.0f)
                curveToRelative(2.897f, 6.47f, 9.692f, 11.0f, 17.245f, 11.0f)
                curveTo(33.717f, 42.0f, 42.0f, 33.717f, 42.0f, 23.5f)
                reflectiveCurveTo(33.717f, 5.0f, 23.5f, 5.0f)
                reflectiveCurveTo(5.0f, 13.283f, 5.0f, 23.5f)
                lineTo(4.0f, 23.5f)
                curveTo(4.0f, 12.73f, 12.73f, 4.0f, 23.5f, 4.0f)
                moveToRelative(-4.477f, 9.99f)
                horizontalLineToRelative(9.0f)
                lineTo(28.023f, 9.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.99f)
                lineTo(32.0f, 13.99f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.977f)
                verticalLineToRelative(5.0f)
                lineTo(32.0f, 19.99f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.977f)
                verticalLineToRelative(5.0f)
                lineTo(32.0f, 25.99f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.977f)
                verticalLineToRelative(5.0f)
                lineTo(32.0f, 31.99f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.977f)
                lineTo(29.023f, 38.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.01f)
                horizontalLineToRelative(-9.0f)
                lineTo(19.023f, 38.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.01f)
                lineTo(15.0f, 32.99f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.023f)
                verticalLineToRelative(-5.0f)
                lineTo(15.0f, 26.99f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.023f)
                verticalLineToRelative(-5.0f)
                lineTo(15.0f, 20.99f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.023f)
                verticalLineToRelative(-5.0f)
                lineTo(15.0f, 14.99f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.023f)
                lineTo(18.023f, 9.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(19.023f, 31.99f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-9.0f)
                close()
                moveTo(19.023f, 25.99f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-9.0f)
                close()
                moveTo(19.023f, 19.99f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-9.0f)
                close()
            }
        }
            .build()
        return _arrowCircleTrainTracksLarge!!
    }

private var _arrowCircleTrainTracksLarge: ImageVector? = null
