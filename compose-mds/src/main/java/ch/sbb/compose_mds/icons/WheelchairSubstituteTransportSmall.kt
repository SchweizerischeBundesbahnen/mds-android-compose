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

public val SBBIcons.WheelchairSubstituteTransportSmall: ImageVector
    get() {
        if (_wheelchairSubstituteTransportSmall != null) {
            return _wheelchairSubstituteTransportSmall!!
        }
        _wheelchairSubstituteTransportSmall = Builder(name = "WheelchairSubstituteTransportSmall",
                defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f,
                viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                lineTo(2.0f, 2.0f)
                horizontalLineToRelative(20.0f)
                close()
                moveTo(3.0f, 21.0f)
                horizontalLineToRelative(18.0f)
                lineTo(21.0f, 3.0f)
                lineTo(3.0f, 3.0f)
                close()
                moveTo(7.007f, 12.755f)
                curveToRelative(-0.912f, 0.414f, -1.507f, 1.33f, -1.507f, 2.445f)
                curveToRelative(0.0f, 1.524f, 1.276f, 2.8f, 2.8f, 2.8f)
                curveToRelative(1.082f, 0.0f, 2.031f, -0.667f, 2.561f, -1.64f)
                lineToRelative(0.878f, 0.48f)
                curveTo(11.07f, 18.067f, 9.817f, 19.0f, 8.3f, 19.0f)
                curveTo(6.225f, 19.0f, 4.5f, 17.276f, 4.5f, 15.2f)
                curveToRelative(0.0f, -1.485f, 0.805f, -2.77f, 2.093f, -3.355f)
                close()
                moveTo(9.0f, 14.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-4.0f)
                lineTo(8.0f, 15.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(17.49f, 5.0f)
                curveToRelative(0.908f, 0.0f, 1.5f, 0.757f, 1.5f, 1.5f)
                verticalLineToRelative(0.255f)
                horizontalLineToRelative(0.475f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-0.475f)
                verticalLineToRelative(2.741f)
                horizontalLineToRelative(-2.0f)
                lineTo(16.99f, 11.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-2.0f)
                lineTo(12.99f, 8.755f)
                horizontalLineToRelative(-0.47f)
                verticalLineToRelative(-0.5f)
                lineToRelative(0.002f, -1.0f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(0.468f)
                lineTo(12.99f, 6.5f)
                curveToRelative(0.0f, -0.414f, 0.14f, -0.797f, 0.422f, -1.078f)
                reflectiveCurveTo(14.077f, 5.0f, 14.49f, 5.0f)
                close()
                moveTo(13.99f, 10.0f)
                horizontalLineToRelative(4.0f)
                lineTo(17.99f, 9.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(8.5f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                moveToRelative(5.99f, -1.0f)
                curveToRelative(-0.186f, 0.0f, -0.302f, 0.06f, -0.37f, 0.129f)
                curveToRelative(-0.07f, 0.069f, -0.13f, 0.185f, -0.13f, 0.371f)
                lineTo(13.99f, 8.0f)
                horizontalLineToRelative(4.0f)
                lineTo(17.99f, 6.5f)
                curveToRelative(0.0f, -0.257f, -0.208f, -0.5f, -0.5f, -0.5f)
                close()
            }
        }
        .build()
        return _wheelchairSubstituteTransportSmall!!
    }

private var _wheelchairSubstituteTransportSmall: ImageVector? = null
