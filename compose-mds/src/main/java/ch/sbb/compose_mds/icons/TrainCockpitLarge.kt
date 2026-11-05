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

public val SBBIcons.TrainCockpitLarge: ImageVector
    get() {
        if (_trainCockpitLarge != null) {
            return _trainCockpitLarge!!
        }
        _trainCockpitLarge = Builder(
            name = "TrainCockpitLarge",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
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
                pathFillType = NonZero,
            ) {
                moveTo(23.3f, 18.0f)
                curveToRelative(3.118f, 0.0f, 5.5f, 2.999f, 5.5f, 6.5f)
                curveToRelative(0.0f, 1.864f, -0.676f, 3.585f, -1.777f, 4.787f)
                curveTo(31.669f, 31.094f, 34.8f, 36.481f, 34.8f, 42.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-23.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -6.047f, 3.154f, -11.245f, 7.796f, -13.192f)
                curveToRelative(-1.113f, -1.204f, -1.796f, -2.934f, -1.796f, -4.808f)
                curveToRelative(0.0f, -3.5f, 2.381f, -6.5f, 5.5f, -6.5f)
                moveToRelative(2.872f, 12.048f)
                curveToRelative(-0.828f, 0.6f, -1.807f, 0.952f, -2.872f, 0.952f)
                arcToRelative(4.85f, 4.85f, 0.0f, false, true, -2.864f, -0.946f)
                curveTo(16.123f, 31.612f, 12.983f, 36.29f, 12.809f, 42.0f)
                lineTo(33.79f, 42.0f)
                curveToRelative(-0.174f, -5.737f, -3.327f, -10.575f, -7.62f, -11.952f)
                moveTo(13.0f, 33.0f)
                lineTo(8.638f, 33.0f)
                lineToRelative(-1.874f, 4.685f)
                lineToRelative(-0.928f, -0.37f)
                lineToRelative(2.0f, -5.0f)
                lineTo(7.96f, 32.0f)
                lineTo(13.0f, 32.0f)
                close()
                moveTo(38.265f, 32.315f)
                lineTo(40.265f, 37.315f)
                lineTo(39.8f, 37.5f)
                lineTo(39.336f, 37.685f)
                lineTo(37.462f, 33.0f)
                lineTo(33.0f, 33.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.139f)
                close()
                moveTo(23.3f, 19.0f)
                curveToRelative(-2.404f, 0.0f, -4.5f, 2.373f, -4.5f, 5.5f)
                reflectiveCurveToRelative(2.096f, 5.5f, 4.5f, 5.5f)
                reflectiveCurveToRelative(4.5f, -2.373f, 4.5f, -5.5f)
                reflectiveCurveToRelative(-2.097f, -5.5f, -4.5f, -5.5f)
                moveTo(42.993f, 4.582f)
                lineToRelative(-4.0f, 24.0f)
                lineToRelative(-0.07f, 0.418f)
                lineTo(31.0f, 29.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(7.076f)
                lineTo(41.91f, 5.0f)
                lineTo(5.063f, 5.0f)
                lineToRelative(2.682f, 23.0f)
                lineTo(16.0f, 28.0f)
                verticalLineToRelative(1.0f)
                lineTo(6.854f, 29.0f)
                lineToRelative(-0.05f, -0.442f)
                lineToRelative(-2.801f, -24.0f)
                lineTo(3.938f, 4.0f)
                lineTo(43.09f, 4.0f)
                close()
                moveTo(27.558f, 10.0f)
                lineTo(30.0f, 10.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.972f)
                lineToRelative(1.412f, 3.0f)
                lineTo(32.0f, 14.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.089f)
                lineToRelative(1.411f, 3.0f)
                lineTo(35.0f, 18.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.207f)
                lineToRelative(1.412f, 3.0f)
                lineTo(37.0f, 22.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.324f)
                lineToRelative(1.076f, 2.287f)
                lineToRelative(-0.904f, 0.426f)
                lineTo(32.57f, 23.0f)
                lineTo(32.0f, 23.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(0.1f)
                lineToRelative(-1.412f, -3.0f)
                lineTo(30.0f, 19.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(0.218f)
                lineToRelative(-1.411f, -3.0f)
                lineTo(17.164f, 15.0f)
                lineToRelative(-1.235f, 3.0f)
                lineTo(16.0f, 18.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-0.483f)
                lineTo(14.0f, 22.683f)
                lineTo(14.0f, 23.0f)
                horizontalLineToRelative(-0.13f)
                lineToRelative(-1.108f, 2.69f)
                lineToRelative(-0.924f, -0.38f)
                lineToRelative(0.951f, -2.31f)
                lineTo(9.0f, 23.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.2f)
                lineToRelative(1.236f, -3.0f)
                lineTo(11.0f, 19.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.848f)
                lineToRelative(1.235f, -3.0f)
                lineTo(13.0f, 15.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.495f)
                lineToRelative(1.235f, -3.0f)
                lineTo(15.0f, 11.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.142f)
                lineToRelative(0.696f, -1.69f)
                lineToRelative(0.924f, 0.38f)
                lineToRelative(-0.54f, 1.31f)
                horizontalLineToRelative(7.231f)
                lineToRelative(-0.605f, -1.287f)
                lineToRelative(0.904f, -0.426f)
                close()
                moveTo(17.575f, 14.0f)
                horizontalLineToRelative(10.76f)
                lineToRelative(-1.411f, -3.0f)
                lineTo(18.81f, 11.0f)
                close()
            }
        }
            .build()
        return _trainCockpitLarge!!
    }

private var _trainCockpitLarge: ImageVector? = null
