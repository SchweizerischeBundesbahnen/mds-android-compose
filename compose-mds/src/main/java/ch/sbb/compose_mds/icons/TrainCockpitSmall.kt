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

public val SBBIcons.TrainCockpitSmall: ImageVector
    get() {
        if (_trainCockpitSmall != null) {
            return _trainCockpitSmall!!
        }
        _trainCockpitSmall = Builder(
            name = "TrainCockpitSmall",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
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
                moveTo(11.9f, 9.0f)
                curveToRelative(1.739f, 0.0f, 3.0f, 1.656f, 3.0f, 3.5f)
                curveToRelative(0.0f, 0.854f, -0.274f, 1.665f, -0.737f, 2.292f)
                curveToRelative(2.269f, 1.059f, 3.737f, 3.76f, 3.737f, 6.708f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-12.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -2.972f, 1.486f, -5.58f, 3.748f, -6.69f)
                arcTo(3.88f, 3.88f, 0.0f, false, true, 8.9f, 12.5f)
                curveToRelative(0.0f, -1.844f, 1.262f, -3.5f, 3.0f, -3.5f)
                moveToRelative(1.477f, 6.55f)
                arcToRelative(2.655f, 2.655f, 0.0f, false, true, -2.946f, 0.007f)
                curveTo(8.514f, 16.313f, 7.08f, 18.4f, 6.917f, 21.0f)
                horizontalLineToRelative(9.967f)
                curveToRelative(-0.165f, -2.624f, -1.61f, -4.773f, -3.507f, -5.45f)
                moveTo(6.4f, 17.0f)
                lineTo(4.738f, 17.0f)
                lineToRelative(-0.874f, 2.186f)
                lineToRelative(-0.927f, -0.372f)
                lineToRelative(1.0f, -2.5f)
                lineToRelative(0.125f, -0.314f)
                lineTo(6.4f, 16.0f)
                close()
                moveTo(19.864f, 16.314f)
                lineTo(20.864f, 18.814f)
                lineTo(19.936f, 19.186f)
                lineTo(19.063f, 17.0f)
                lineTo(17.4f, 17.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.34f)
                close()
                moveTo(21.994f, 2.582f)
                lineTo(19.994f, 14.582f)
                lineTo(19.924f, 15.0f)
                lineTo(15.9f, 15.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.176f)
                lineTo(20.91f, 3.0f)
                lineTo(3.063f, 3.0f)
                lineToRelative(1.282f, 11.0f)
                lineTo(8.0f, 14.0f)
                verticalLineToRelative(1.0f)
                lineTo(3.455f, 15.0f)
                lineToRelative(-0.052f, -0.442f)
                lineToRelative(-1.4f, -12.0f)
                lineTo(1.938f, 2.0f)
                lineTo(22.09f, 2.0f)
                close()
                moveTo(11.9f, 10.0f)
                curveToRelative(-1.023f, 0.0f, -2.0f, 1.03f, -2.0f, 2.5f)
                reflectiveCurveToRelative(0.977f, 2.5f, 2.0f, 2.5f)
                reflectiveCurveToRelative(2.0f, -1.03f, 2.0f, -2.5f)
                reflectiveCurveToRelative(-0.977f, -2.5f, -2.0f, -2.5f)
                moveToRelative(2.288f, -5.0f)
                lineTo(15.4f, 5.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-0.742f)
                lineToRelative(0.47f, 1.0f)
                lineTo(16.4f, 7.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-0.8f)
                lineToRelative(0.47f, 1.0f)
                horizontalLineToRelative(1.33f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-0.859f)
                lineToRelative(0.47f, 1.0f)
                horizontalLineToRelative(1.39f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-0.919f)
                lineToRelative(0.37f, 0.787f)
                lineToRelative(-0.904f, 0.426f)
                lineToRelative(-0.57f, -1.213f)
                lineTo(15.9f, 12.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(0.007f)
                lineToRelative(-0.47f, -1.0f)
                lineTo(14.9f, 10.0f)
                lineTo(14.9f, 9.0f)
                horizontalLineToRelative(0.066f)
                lineToRelative(-0.47f, -1.0f)
                lineTo(9.0f, 8.0f)
                lineToRelative(-0.412f, 1.0f)
                lineTo(8.9f, 9.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-0.724f)
                lineToRelative(-0.411f, 1.0f)
                lineTo(7.9f, 11.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-0.547f)
                lineToRelative(-0.49f, 1.19f)
                lineToRelative(-0.925f, -0.38f)
                lineToRelative(0.333f, -0.81f)
                horizontalLineToRelative(-0.87f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.283f)
                lineToRelative(0.412f, -1.0f)
                lineTo(6.4f, 10.0f)
                lineTo(6.4f, 9.0f)
                horizontalLineToRelative(1.107f)
                lineToRelative(0.412f, -1.0f)
                lineTo(7.4f, 8.0f)
                lineTo(7.4f, 7.0f)
                horizontalLineToRelative(0.931f)
                lineToRelative(0.411f, -1.0f)
                lineTo(8.4f, 6.0f)
                lineTo(8.4f, 5.0f)
                horizontalLineToRelative(0.754f)
                lineToRelative(0.284f, -0.69f)
                lineToRelative(0.924f, 0.38f)
                lineToRelative(-0.128f, 0.31f)
                horizontalLineToRelative(2.849f)
                lineToRelative(-0.135f, -0.287f)
                lineToRelative(0.904f, -0.426f)
                close()
                moveTo(9.412f, 7.0f)
                horizontalLineToRelative(4.613f)
                lineToRelative(-0.47f, -1.0f)
                horizontalLineToRelative(-3.73f)
                close()
            }
        }
            .build()
        return _trainCockpitSmall!!
    }

private var _trainCockpitSmall: ImageVector? = null
