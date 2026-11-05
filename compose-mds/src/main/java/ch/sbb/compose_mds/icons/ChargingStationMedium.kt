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

public val SBBIcons.ChargingStationMedium: ImageVector
    get() {
        if (_chargingStationMedium != null) {
            return _chargingStationMedium!!
        }
        _chargingStationMedium = Builder(
            name = "ChargingStationMedium",
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
                moveTo(11.25f, 4.25f)
                curveToRelative(-1.38f, 0.0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(25.0f)
                horizontalLineToRelative(15.5f)
                verticalLineToRelative(-25.0f)
                curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(7.75f, 6.75f)
                verticalLineToRelative(25.0f)
                lineTo(6.0f, 31.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.75f)
                verticalLineToRelative(-9.5f)
                horizontalLineToRelative(0.25f)
                curveToRelative(0.672f, 0.0f, 1.075f, 0.165f, 1.319f, 0.41f)
                curveToRelative(0.245f, 0.248f, 0.415f, 0.662f, 0.431f, 1.346f)
                verticalLineToRelative(1.528f)
                curveToRelative(0.0f, 0.377f, 0.001f, 1.017f, 0.224f, 1.57f)
                curveToRelative(0.12f, 0.297f, 0.312f, 0.593f, 0.62f, 0.812f)
                curveToRelative(0.309f, 0.22f, 0.696f, 0.334f, 1.156f, 0.334f)
                curveToRelative(0.458f, 0.0f, 0.846f, -0.11f, 1.156f, -0.327f)
                curveToRelative(0.31f, -0.215f, 0.503f, -0.508f, 0.624f, -0.805f)
                curveToRelative(0.226f, -0.557f, 0.222f, -1.207f, 0.22f, -1.598f)
                verticalLineToRelative(-4.805f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.0f, -3.465f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.5f)
                lineTo(32.75f, 12.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.25f)
                horizontalLineToRelative(-2.0f)
                lineTo(29.75f, 12.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.25f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(2.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.0f, 3.465f)
                verticalLineToRelative(4.788f)
                curveToRelative(0.002f, 0.425f, -0.003f, 0.885f, -0.147f, 1.239f)
                arcToRelative(0.78f, 0.78f, 0.0f, false, true, -0.269f, 0.36f)
                curveToRelative(-0.112f, 0.079f, -0.29f, 0.148f, -0.584f, 0.148f)
                curveToRelative(-0.29f, 0.0f, -0.465f, -0.07f, -0.577f, -0.15f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, -0.271f, -0.37f)
                curveToRelative(-0.145f, -0.36f, -0.151f, -0.821f, -0.152f, -1.23f)
                verticalLineToRelative(-1.511f)
                curveToRelative(-0.019f, -0.825f, -0.226f, -1.534f, -0.722f, -2.033f)
                curveToRelative(-0.498f, -0.502f, -1.203f, -0.706f, -2.028f, -0.706f)
                horizontalLineToRelative(-0.25f)
                lineTo(25.25f, 6.75f)
                curveToRelative(0.0f, -1.932f, -1.568f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-10.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.5f, 3.5f)
                moveToRelative(3.5f, 1.0f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(11.5f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-11.0f)
                moveToRelative(0.5f, 6.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(9.5f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(28.25f, 17.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, true, -5.0f, 0.0f)
            }
        }
            .build()
        return _chargingStationMedium!!
    }

private var _chargingStationMedium: ImageVector? = null
