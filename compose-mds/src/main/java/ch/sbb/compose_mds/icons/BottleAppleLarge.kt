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

public val SBBIcons.BottleAppleLarge: ImageVector
    get() {
        if (_bottleAppleLarge != null) {
            return _bottleAppleLarge!!
        }
        _bottleAppleLarge = Builder(
            name = "BottleAppleLarge",
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
                pathFillType = NonZero,
            ) {
                moveTo(15.0f, 9.023f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, 3.416f, 2.461f)
                curveToRelative(0.73f, 1.634f, 1.345f, 2.738f, 1.814f, 3.707f)
                curveToRelative(0.457f, 0.947f, 0.77f, 1.755f, 0.77f, 2.659f)
                verticalLineToRelative(22.252f)
                curveTo(21.0f, 42.26f, 19.225f, 44.0f, 17.052f, 44.0f)
                lineTo(7.948f, 44.0f)
                curveTo(5.773f, 44.0f, 4.0f, 42.26f, 4.0f, 40.102f)
                lineTo(4.0f, 17.85f)
                curveToRelative(0.0f, -0.904f, 0.313f, -1.712f, 0.77f, -2.659f)
                curveToRelative(0.47f, -0.97f, 1.083f, -2.073f, 1.813f, -3.707f)
                arcTo(4.2f, 4.2f, 0.0f, false, true, 10.0f, 9.024f)
                lineTo(10.0f, 4.997f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(38.438f, 21.5f)
                lineToRelative(0.026f, 0.499f)
                lineToRelative(-0.004f, 0.001f)
                quadToRelative(-0.009f, 0.0f, -0.03f, 0.002f)
                lineToRelative(-0.131f, 0.017f)
                curveToRelative(-0.117f, 0.017f, -0.29f, 0.049f, -0.498f, 0.107f)
                arcToRelative(4.8f, 4.8f, 0.0f, false, false, -1.536f, 0.746f)
                curveToRelative(-1.03f, 0.757f, -2.133f, 2.218f, -2.253f, 5.1f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, false, 0.525f, -0.104f)
                curveToRelative(0.235f, -0.075f, 0.405f, -0.174f, 0.632f, -0.303f)
                curveToRelative(0.227f, -0.128f, 0.495f, -0.277f, 0.872f, -0.388f)
                curveToRelative(0.373f, -0.11f, 0.83f, -0.175f, 1.448f, -0.176f)
                lineTo(37.489f, 27.0f)
                curveToRelative(0.894f, -0.02f, 2.312f, -0.035f, 3.49f, 0.861f)
                curveToRelative(1.203f, 0.915f, 2.021f, 2.662f, 2.021f, 5.831f)
                curveToRelative(0.0f, 2.95f, -0.491f, 5.488f, -1.405f, 7.307f)
                curveTo(40.68f, 42.819f, 39.29f, 44.0f, 37.5f, 44.0f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-1.2f, -0.023f, -1.96f, -0.28f, -2.568f, -0.536f)
                curveToRelative(-0.612f, -0.257f, -0.94f, -0.439f, -1.422f, -0.463f)
                curveToRelative(-0.482f, 0.024f, -0.81f, 0.206f, -1.422f, 0.463f)
                curveToRelative(-0.609f, 0.256f, -1.368f, 0.514f, -2.568f, 0.536f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-1.79f, 0.0f, -3.18f, -1.18f, -4.095f, -3.001f)
                reflectiveCurveTo(24.0f, 36.642f, 24.0f, 33.692f)
                curveToRelative(0.0f, -3.168f, 0.817f, -4.916f, 2.02f, -5.83f)
                curveToRelative(1.178f, -0.897f, 2.596f, -0.882f, 3.49f, -0.862f)
                verticalLineToRelative(0.001f)
                curveToRelative(0.617f, 0.0f, 1.075f, 0.066f, 1.448f, 0.176f)
                curveToRelative(0.377f, 0.11f, 0.646f, 0.26f, 0.873f, 0.388f)
                curveToRelative(0.226f, 0.129f, 0.396f, 0.228f, 0.63f, 0.303f)
                curveToRelative(0.144f, 0.046f, 0.32f, 0.082f, 0.549f, 0.106f)
                curveToRelative(0.122f, -3.182f, 1.356f, -4.95f, 2.663f, -5.909f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, 1.86f, -0.902f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.802f, -0.156f)
                lineToRelative(0.053f, -0.005f)
                lineToRelative(0.015f, -0.001f)
                horizontalLineToRelative(0.01f)
                close()
                moveTo(10.42f, 10.0f)
                arcToRelative(3.2f, 3.2f, 0.0f, false, false, -2.923f, 1.892f)
                curveToRelative(-0.734f, 1.64f, -1.39f, 2.833f, -1.826f, 3.734f)
                curveToRelative(-0.446f, 0.923f, -0.67f, 1.56f, -0.671f, 2.224f)
                lineTo(5.0f, 21.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(17.0f)
                lineTo(5.0f, 38.0f)
                verticalLineToRelative(2.102f)
                curveTo(5.0f, 41.695f, 6.312f, 43.0f, 7.948f, 43.0f)
                horizontalLineToRelative(9.104f)
                curveTo(18.686f, 43.0f, 20.0f, 41.695f, 20.0f, 40.102f)
                lineTo(20.0f, 17.85f)
                curveToRelative(0.0f, -0.665f, -0.224f, -1.3f, -0.67f, -2.224f)
                curveToRelative(-0.436f, -0.9f, -1.093f, -2.093f, -1.826f, -3.733f)
                arcTo(3.2f, 3.2f, 0.0f, false, false, 14.58f, 10.0f)
                close()
                moveTo(37.51f, 28.0f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.552f, 0.0f, -0.914f, 0.06f, -1.177f, 0.137f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.66f, 0.299f)
                curveToRelative(-0.215f, 0.121f, -0.472f, 0.272f, -0.82f, 0.384f)
                curveToRelative(-0.35f, 0.113f, -0.772f, 0.18f, -1.343f, 0.18f)
                reflectiveCurveToRelative(-0.993f, -0.067f, -1.344f, -0.18f)
                curveToRelative(-0.347f, -0.111f, -0.604f, -0.263f, -0.818f, -0.384f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.662f, -0.3f)
                curveTo(30.413f, 28.06f, 30.05f, 28.0f, 29.5f, 28.0f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.914f, -0.02f, -1.995f, -0.004f, -2.865f, 0.657f)
                curveToRelative(-0.846f, 0.644f, -1.625f, 2.012f, -1.625f, 5.035f)
                curveToRelative(0.0f, 2.858f, 0.479f, 5.225f, 1.299f, 6.858f)
                curveToRelative(0.818f, 1.628f, 1.926f, 2.447f, 3.195f, 2.449f)
                curveToRelative(1.04f, -0.02f, 1.671f, -0.236f, 2.197f, -0.457f)
                curveToRelative(0.516f, -0.217f, 1.066f, -0.511f, 1.789f, -0.541f)
                lineTo(33.5f, 42.0f)
                lineToRelative(0.02f, 0.001f)
                curveToRelative(0.723f, 0.03f, 1.273f, 0.325f, 1.789f, 0.541f)
                curveToRelative(0.525f, 0.22f, 1.157f, 0.437f, 2.196f, 0.457f)
                curveToRelative(1.27f, -0.002f, 2.378f, -0.82f, 3.196f, -2.45f)
                curveToRelative(0.82f, -1.632f, 1.299f, -3.999f, 1.299f, -6.857f)
                curveToRelative(0.0f, -3.022f, -0.78f, -4.391f, -1.625f, -5.035f)
                curveToRelative(-0.87f, -0.662f, -1.952f, -0.677f, -2.864f, -0.657f)
                moveTo(5.0f, 37.0f)
                horizontalLineToRelative(7.0f)
                lineTo(12.0f, 22.0f)
                lineTo(5.0f, 22.0f)
                close()
                moveTo(11.0f, 9.0f)
                horizontalLineToRelative(3.0f)
                lineTo(14.0f, 5.998f)
                horizontalLineToRelative(-3.0f)
                close()
            }
        }
            .build()
        return _bottleAppleLarge!!
    }

private var _bottleAppleLarge: ImageVector? = null
