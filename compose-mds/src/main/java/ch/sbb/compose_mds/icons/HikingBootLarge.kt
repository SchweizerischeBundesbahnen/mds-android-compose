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

public val SBBIcons.HikingBootLarge: ImageVector
    get() {
        if (_hikingBootLarge != null) {
            return _hikingBootLarge!!
        }
        _hikingBootLarge = Builder(
            name = "HikingBootLarge",
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
                moveTo(9.5f, 11.0f)
                lineTo(9.0f, 11.0f)
                verticalLineToRelative(17.016f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 8.5f, 28.0f)
                lineTo(8.0f, 28.0f)
                verticalLineToRelative(7.0f)
                lineTo(7.0f, 35.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-1.991f)
                curveToRelative(1.301f, 0.045f, 2.455f, 0.26f, 3.592f, 0.482f)
                lineToRelative(0.18f, 0.035f)
                curveToRelative(1.054f, 0.206f, 2.11f, 0.413f, 3.228f, 0.463f)
                lineTo(23.0f, 40.0f)
                horizontalLineToRelative(18.001f)
                verticalLineToRelative(-3.5f)
                lineTo(41.0f, 36.5f)
                curveToRelative(0.0f, -3.59f, -2.91f, -6.5f, -6.5f, -6.5f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-2.163f, 0.0f, -3.886f, -1.598f, -5.152f, -4.0f)
                lineTo(25.0f, 26.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.133f)
                curveToRelative(-0.282f, -0.64f, -0.53f, -1.312f, -0.747f, -2.0f)
                lineTo(24.0f, 23.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.17f)
                arcToRelative(25.0f, 25.0f, 0.0f, false, true, -0.446f, -2.0f)
                lineTo(23.0f, 20.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-0.776f)
                arcTo(22.0f, 22.0f, 0.0f, false, true, 22.0f, 16.0f)
                verticalLineToRelative(-5.0f)
                lineTo(9.5f, 11.0f)
                moveToRelative(13.28f, 14.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, -0.706f, -2.0f)
                lineTo(20.0f, 23.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.796f)
                arcToRelative(27.0f, 27.0f, 0.0f, false, true, -0.427f, -2.0f)
                lineTo(19.0f, 20.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.214f)
                arcTo(23.0f, 23.0f, 0.0f, false, true, 21.0f, 16.0f)
                lineTo(10.0f, 16.0f)
                verticalLineToRelative(12.15f)
                arcToRelative(7.504f, 7.504f, 0.0f, false, true, 5.984f, 6.858f)
                curveToRelative(1.411f, 0.044f, 2.647f, 0.276f, 3.8f, 0.501f)
                lineToRelative(0.151f, 0.03f)
                curveToRelative(1.233f, 0.24f, 2.36f, 0.461f, 3.565f, 0.461f)
                horizontalLineToRelative(16.478f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -5.478f, -5.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-2.883f, 0.0f, -4.933f, -2.246f, -6.272f, -5.0f)
                lineTo(21.0f, 26.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(40.001f, 37.0f)
                lineTo(23.5f, 37.0f)
                curveToRelative(-1.305f, 0.0f, -2.518f, -0.237f, -3.728f, -0.474f)
                lineToRelative(-0.18f, -0.035f)
                curveTo(18.312f, 36.24f, 17.01f, 36.0f, 15.5f, 36.0f)
                lineTo(8.0f, 36.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(1.615f, 0.0f, 3.0f, 0.259f, 4.283f, 0.51f)
                lineToRelative(0.152f, 0.029f)
                curveToRelative(1.233f, 0.24f, 2.36f, 0.461f, 3.565f, 0.461f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(16.001f)
                close()
                moveTo(9.0f, 35.0f)
                verticalLineToRelative(-5.981f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 14.981f, 35.0f)
                close()
                moveTo(10.0f, 15.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-3.0f)
                lineTo(10.0f, 12.0f)
                close()
            }
        }
            .build()
        return _hikingBootLarge!!
    }

private var _hikingBootLarge: ImageVector? = null
