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

public val SBBIcons.BikeTrailerLarge: ImageVector
    get() {
        if (_bikeTrailerLarge != null) {
            return _bikeTrailerLarge!!
        }
        _bikeTrailerLarge = Builder(
            name = "BikeTrailerLarge",
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
                moveTo(34.0f, 16.0f)
                horizontalLineToRelative(4.902f)
                lineToRelative(-0.478f, 0.765f)
                lineToRelative(-2.342f, 3.747f)
                lineToRelative(1.633f, 2.857f)
                arcTo(4.504f, 4.504f, 0.0f, false, true, 44.0f, 27.5f)
                curveToRelative(0.0f, 2.482f, -2.018f, 4.5f, -4.5f, 4.5f)
                arcToRelative(4.504f, 4.504f, 0.0f, false, true, -4.5f, -4.5f)
                curveToRelative(0.0f, -1.491f, 0.728f, -2.815f, 1.848f, -3.634f)
                lineTo(35.21f, 21.0f)
                horizontalLineToRelative(-5.858f)
                lineToRelative(-0.877f, 2.457f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 31.0f, 27.5f)
                curveToRelative(0.0f, 2.482f, -2.018f, 4.5f, -4.5f, 4.5f)
                arcToRelative(4.506f, 4.506f, 0.0f, false, true, -4.472f, -4.0f)
                lineTo(18.0f, 28.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-7.337f)
                arcTo(3.5f, 3.5f, 0.0f, true, true, 5.0f, 26.05f)
                lineTo(5.0f, 20.0f)
                horizontalLineToRelative(5.685f)
                lineToRelative(0.14f, 0.12f)
                lineToRelative(7.0f, 6.0f)
                lineToRelative(0.175f, 0.15f)
                lineTo(18.0f, 27.0f)
                horizontalLineToRelative(4.028f)
                arcToRelative(4.506f, 4.506f, 0.0f, false, true, 5.506f, -3.88f)
                lineToRelative(0.995f, -2.788f)
                lineToRelative(0.119f, -0.332f)
                horizontalLineToRelative(6.575f)
                lineToRelative(1.875f, -3.0f)
                lineTo(34.0f, 17.0f)
                close()
                moveTo(17.0f, 29.0f)
                horizontalLineToRelative(-6.035f)
                quadToRelative(0.035f, -0.245f, 0.035f, -0.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -5.0f, -3.163f)
                lineTo(6.0f, 21.0f)
                horizontalLineToRelative(2.191f)
                lineToRelative(0.862f, 1.724f)
                lineToRelative(0.049f, 0.098f)
                lineToRelative(0.086f, 0.068f)
                lineToRelative(5.0f, 4.0f)
                lineToRelative(0.137f, 0.11f)
                lineTo(17.0f, 27.0f)
                close()
                moveTo(37.348f, 24.741f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 36.0f, 27.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                arcToRelative(3.504f, 3.504f, 0.0f, false, false, -4.785f, -3.256f)
                lineToRelative(1.72f, 3.008f)
                lineToRelative(-0.87f, 0.496f)
                close()
                moveTo(26.5f, 24.0f)
                quadToRelative(0.357f, 0.0f, 0.694f, 0.07f)
                lineTo(26.148f, 27.0f)
                horizontalLineToRelative(-3.112f)
                arcToRelative(3.506f, 3.506f, 0.0f, false, true, 3.464f, -3.0f)
                moveToRelative(0.0f, 4.0f)
                horizontalLineToRelative(-3.464f)
                arcToRelative(3.506f, 3.506f, 0.0f, false, false, 3.464f, 3.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0.0f, -1.34f, -0.756f, -2.505f, -1.864f, -3.094f)
                lineToRelative(-1.165f, 3.262f)
                lineToRelative(-0.119f, 0.332f)
                close()
                moveTo(30.0f, 19.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(9.898f, 22.178f)
                lineTo(9.31f, 21.0f)
                horizontalLineToRelative(1.006f)
                lineToRelative(5.833f, 5.0f)
                horizontalLineToRelative(-1.473f)
                close()
                moveTo(7.5f, 26.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -5.0f)
                moveTo(7.0f, 28.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 1.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                moveToRelative(0.5f, -1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
            }
        }
            .build()
        return _bikeTrailerLarge!!
    }

private var _bikeTrailerLarge: ImageVector? = null
