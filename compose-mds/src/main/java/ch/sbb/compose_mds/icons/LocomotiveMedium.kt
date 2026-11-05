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

public val SBBIcons.LocomotiveMedium: ImageVector
    get() {
        if (_locomotiveMedium != null) {
            return _locomotiveMedium!!
        }
        _locomotiveMedium = Builder(
            name = "LocomotiveMedium",
            defaultWidth = 36.0.dp,
            defaultHeight =
                36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
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
                moveTo(3.0f, 5.748f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(-1.0f)
                lineTo(3.0f, 4.748f)
                close()
                moveTo(3.0f, 7.75f)
                horizontalLineToRelative(7.25f)
                lineTo(10.25f, 26.5f)
                horizontalLineToRelative(3.5f)
                lineTo(13.75f, 7.75f)
                horizontalLineToRelative(3.498f)
                curveToRelative(2.502f, -0.024f, 4.372f, 0.387f, 5.839f, 1.22f)
                curveToRelative(1.471f, 0.835f, 2.483f, 2.066f, 3.319f, 3.584f)
                lineToRelative(0.005f, 0.01f)
                lineToRelative(0.005f, 0.01f)
                lineToRelative(5.345f, 10.78f)
                lineToRelative(0.009f, 0.018f)
                lineToRelative(0.007f, 0.019f)
                curveToRelative(0.6f, 1.51f, 0.85f, 2.783f, 0.727f, 3.849f)
                curveToRelative(-0.126f, 1.09f, -0.637f, 1.928f, -1.472f, 2.538f)
                curveToRelative(-0.815f, 0.594f, -1.915f, 0.957f, -3.21f, 1.175f)
                curveToRelative(-1.301f, 0.22f, -2.842f, 0.3f, -4.572f, 0.299f)
                lineToRelative(-9.0f, -0.002f)
                horizontalLineToRelative(-0.5f)
                lineTo(13.75f, 27.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(3.75f)
                lineTo(3.0f, 31.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.25f)
                lineTo(9.25f, 8.75f)
                lineTo(3.0f, 8.75f)
                close()
                moveTo(16.75f, 13.75f)
                horizontalLineToRelative(6.059f)
                lineToRelative(0.138f, 0.276f)
                lineToRelative(4.5f, 9.0f)
                lineToRelative(0.362f, 0.724f)
                lineTo(16.75f, 23.75f)
                verticalLineToRelative(-10.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(8.441f)
                lineToRelative(-4.0f, -8.0f)
                close()
                moveTo(17.255f, 8.75f)
                curveToRelative(2.394f, -0.023f, 4.074f, 0.371f, 5.338f, 1.09f)
                curveToRelative(1.256f, 0.713f, 2.153f, 1.775f, 2.932f, 3.187f)
                lineToRelative(5.33f, 10.752f)
                curveToRelative(0.565f, 1.427f, 0.75f, 2.517f, 0.655f, 3.346f)
                curveToRelative(-0.093f, 0.808f, -0.454f, 1.396f, -1.068f, 1.845f)
                curveToRelative(-0.635f, 0.463f, -1.56f, 0.79f, -2.786f, 0.997f)
                curveToRelative(-1.222f, 0.206f, -2.7f, 0.285f, -4.406f, 0.285f)
                lineToRelative(-8.5f, -0.002f)
                lineTo(14.75f, 8.75f)
                horizontalLineToRelative(2.505f)
            }
        }
            .build()
        return _locomotiveMedium!!
    }

private var _locomotiveMedium: ImageVector? = null
