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

public val SBBIcons.FreightWagonTruckContainerSmall: ImageVector
    get() {
        if (_freightWagonTruckContainerSmall != null) {
            return _freightWagonTruckContainerSmall!!
        }
        _freightWagonTruckContainerSmall = Builder(name = "FreightWagonTruckContainerSmall",
                defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f,
                viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 6.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                lineTo(2.0f, 19.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-1.0f)
                lineTo(2.0f, 17.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                lineTo(16.0f, 5.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(9.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                close()
                moveTo(16.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                close()
                moveTo(5.004f, 6.0f)
                horizontalLineToRelative(4.364f)
                curveToRelative(0.155f, 0.0f, 0.275f, 0.063f, 0.333f, 0.099f)
                curveToRelative(0.068f, 0.041f, 0.128f, 0.092f, 0.177f, 0.137f)
                curveToRelative(0.099f, 0.093f, 0.2f, 0.213f, 0.3f, 0.343f)
                curveToRelative(0.201f, 0.264f, 0.433f, 0.624f, 0.662f, 1.03f)
                curveToRelative(0.454f, 0.806f, 0.931f, 1.852f, 1.147f, 2.778f)
                lineToRelative(0.013f, 0.055f)
                lineTo(12.0f, 15.0f)
                lineTo(9.73f, 15.0f)
                arcToRelative(1.998f, 1.998f, 0.0f, false, true, -3.46f, 0.0f)
                lineTo(2.004f, 15.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                lineTo(4.004f, 6.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(2.004f, 5.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(8.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.001f, 1.999f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 13.0f)
                moveToRelative(-2.996f, 1.0f)
                lineTo(6.0f, 14.0f)
                curveToRelative(0.0f, -1.1f, 0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-3.0f)
                lineTo(7.0f, 11.0f)
                lineTo(7.0f, 7.0f)
                lineTo(5.004f, 7.0f)
                close()
                moveTo(8.0f, 10.0f)
                horizontalLineToRelative(2.833f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, -0.864f, -1.9f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.586f, -0.914f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.227f, 7.0f)
                lineTo(8.0f, 7.0f)
                close()
            }
        }
        .build()
        return _freightWagonTruckContainerSmall!!
    }

private var _freightWagonTruckContainerSmall: ImageVector? = null
