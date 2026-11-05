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

public val SBBIcons.CarProfileRoofMedium: ImageVector
    get() {
        if (_carProfileRoofMedium != null) {
            return _carProfileRoofMedium!!
        }
        _carProfileRoofMedium = Builder(
            name = "CarProfileRoofMedium",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
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
                moveTo(19.627f, 19.75f)
                curveToRelative(0.414f, 0.0f, 0.804f, 0.174f, 1.088f, 0.471f)
                lineToRelative(3.658f, 3.825f)
                lineToRelative(2.347f, 0.002f)
                horizontalLineToRelative(0.02f)
                curveToRelative(0.252f, 0.01f, 0.615f, 0.098f, 0.927f, 0.335f)
                curveToRelative(0.333f, 0.255f, 0.581f, 0.665f, 0.581f, 1.239f)
                lineToRelative(0.002f, 4.294f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-3.125f)
                curveToRelative(-0.225f, 1.208f, -1.246f, 2.147f, -2.506f, 2.147f)
                curveToRelative(-1.261f, 0.0f, -2.28f, -0.939f, -2.505f, -2.148f)
                lineTo(14.86f, 30.415f)
                curveToRelative(-0.225f, 1.21f, -1.245f, 2.148f, -2.505f, 2.148f)
                reflectiveCurveToRelative(-2.281f, -0.939f, -2.506f, -2.148f)
                horizontalLineToRelative(-2.1f)
                lineTo(7.749f, 24.95f)
                curveToRelative(0.0f, -0.375f, 0.131f, -0.74f, 0.372f, -1.029f)
                lineToRelative(3.03f, -3.624f)
                arcToRelative(1.51f, 1.51f, 0.0f, false, true, 1.156f, -0.547f)
                close()
                moveTo(12.356f, 28.268f)
                curveToRelative(-0.836f, 0.0f, -1.553f, 0.716f, -1.553f, 1.648f)
                curveToRelative(0.0f, 0.93f, 0.717f, 1.647f, 1.553f, 1.647f)
                curveToRelative(0.835f, 0.0f, 1.552f, -0.717f, 1.553f, -1.647f)
                curveToRelative(0.0f, -0.931f, -0.718f, -1.648f, -1.553f, -1.648f)
                moveToRelative(10.263f, 0.0f)
                curveToRelative(-0.836f, 0.0f, -1.553f, 0.717f, -1.553f, 1.648f)
                reflectiveCurveToRelative(0.717f, 1.647f, 1.553f, 1.647f)
                curveToRelative(0.835f, 0.0f, 1.552f, -0.717f, 1.552f, -1.647f)
                curveToRelative(0.0f, -0.931f, -0.717f, -1.648f, -1.552f, -1.648f)
                moveTo(8.75f, 29.416f)
                horizontalLineToRelative(1.1f)
                curveToRelative(0.224f, -1.21f, 1.245f, -2.148f, 2.506f, -2.148f)
                reflectiveCurveToRelative(2.28f, 0.939f, 2.505f, 2.148f)
                horizontalLineToRelative(5.253f)
                curveToRelative(0.224f, -1.21f, 1.244f, -2.148f, 2.505f, -2.148f)
                reflectiveCurveToRelative(2.281f, 0.939f, 2.506f, 2.148f)
                horizontalLineToRelative(2.125f)
                lineToRelative(-0.002f, -3.793f)
                curveToRelative(0.0f, -0.252f, -0.095f, -0.373f, -0.189f, -0.445f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, false, -0.36f, -0.13f)
                lineToRelative(-2.541f, -0.002f)
                lineTo(8.75f, 25.046f)
                close()
                moveTo(12.308f, 20.75f)
                arcToRelative(0.51f, 0.51f, 0.0f, false, false, -0.389f, 0.189f)
                lineToRelative(-2.6f, 3.107f)
                horizontalLineToRelative(5.616f)
                lineTo(14.935f, 20.75f)
                close()
                moveTo(15.935f, 24.046f)
                horizontalLineToRelative(7.054f)
                lineToRelative(-2.996f, -3.134f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.366f, -0.162f)
                horizontalLineToRelative(-3.692f)
                close()
                moveTo(24.278f, 11.585f)
                lineTo(33.278f, 17.585f)
                lineTo(32.723f, 18.416f)
                lineTo(23.916f, 12.544f)
                lineTo(3.138f, 18.481f)
                lineTo(2.862f, 17.52f)
                lineTo(23.862f, 11.52f)
                lineTo(24.085f, 11.457f)
                close()
            }
        }
            .build()
        return _carProfileRoofMedium!!
    }

private var _carProfileRoofMedium: ImageVector? = null
