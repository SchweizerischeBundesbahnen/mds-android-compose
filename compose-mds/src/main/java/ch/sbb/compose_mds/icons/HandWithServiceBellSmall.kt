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

public val SBBIcons.HandWithServiceBellSmall: ImageVector
    get() {
        if (_handWithServiceBellSmall != null) {
            return _handWithServiceBellSmall!!
        }
        _handWithServiceBellSmall = Builder(
            name = "HandWithServiceBellSmall",
            defaultWidth =
                24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight =
            24.0f,
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
                moveTo(11.0f, 4.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.998f, -0.002f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 11.0f, 4.5f)
                moveToRelative(1.888f, 0.57f)
                quadToRelative(0.11f, -0.266f, 0.112f, -0.57f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -3.0f, 0.0f)
                quadToRelative(0.002f, 0.305f, 0.112f, 0.57f)
                curveToRelative(-1.648f, 0.17f, -3.208f, 0.648f, -4.449f, 1.476f)
                curveTo(4.18f, 7.535f, 3.164f, 9.018f, 3.018f, 11.0f)
                lineTo(2.0f, 11.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(19.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.018f)
                curveToRelative(-0.146f, -1.982f, -1.162f, -3.465f, -2.646f, -4.454f)
                curveToRelative(-1.24f, -0.828f, -2.8f, -1.307f, -4.448f, -1.476f)
                moveTo(11.5f, 6.0f)
                curveToRelative(-2.013f, 0.0f, -3.907f, 0.46f, -5.282f, 1.378f)
                curveToRelative(-1.231f, 0.82f, -2.056f, 2.01f, -2.197f, 3.622f)
                horizontalLineToRelative(14.957f)
                curveToRelative(-0.14f, -1.612f, -0.965f, -2.801f, -2.196f, -3.622f)
                curveTo(15.407f, 6.46f, 13.512f, 6.0f, 11.5f, 6.0f)
                moveToRelative(-3.498f, 9.82f)
                lineTo(4.425f, 13.32f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.873f, 2.343f)
                lineToRelative(5.917f, 5.213f)
                lineToRelative(0.141f, 0.125f)
                horizontalLineToRelative(3.926f)
                lineToRelative(0.862f, 0.855f)
                lineToRelative(0.146f, 0.145f)
                horizontalLineToRelative(8.857f)
                lineToRelative(-0.846f, -0.852f)
                lineToRelative(-5.028f, -5.064f)
                lineToRelative(-0.008f, -0.008f)
                curveToRelative(-1.188f, -1.144f, -2.75f, -2.045f, -4.4f, -2.076f)
                lineTo(10.0f, 14.001f)
                curveToRelative(-0.633f, 0.0f, -1.145f, 0.244f, -1.496f, 0.635f)
                curveToRelative(-0.3f, 0.336f, -0.464f, 0.76f, -0.502f, 1.185f)
                moveTo(3.84f, 14.13f)
                lineToRelative(4.697f, 3.285f)
                lineToRelative(-5.428f, -3.228f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.705f, -0.077f)
                lineToRelative(0.012f, 0.01f)
                close()
                moveTo(8.537f, 17.415f)
                lineTo(3.11f, 14.187f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.078f, 0.703f)
                lineToRelative(0.009f, 0.007f)
                lineToRelative(0.009f, 0.008f)
                lineTo(8.988f, 20.0f)
                horizontalLineToRelative(3.96f)
                lineToRelative(0.146f, 0.145f)
                lineToRelative(0.862f, 0.855f)
                horizontalLineToRelative(6.043f)
                lineToRelative(-4.178f, -4.208f)
                curveToRelative(-1.083f, -1.041f, -2.413f, -1.766f, -3.717f, -1.792f)
                lineTo(10.0f, 15.0f)
                curveToRelative(-0.36f, 0.0f, -0.597f, 0.131f, -0.75f, 0.302f)
                curveToRelative(-0.162f, 0.18f, -0.254f, 0.434f, -0.256f, 0.702f)
                reflectiveCurveToRelative(0.086f, 0.518f, 0.243f, 0.695f)
                curveToRelative(0.15f, 0.168f, 0.388f, 0.301f, 0.763f, 0.301f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.613f, 0.0f, -1.113f, -0.22f, -1.463f, -0.585f)
            }
        }
            .build()
        return _handWithServiceBellSmall!!
    }

private var _handWithServiceBellSmall: ImageVector? = null
