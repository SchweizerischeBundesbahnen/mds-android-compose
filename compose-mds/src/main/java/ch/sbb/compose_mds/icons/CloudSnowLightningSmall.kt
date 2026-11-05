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

public val SBBIcons.CloudSnowLightningSmall: ImageVector
    get() {
        if (_cloudSnowLightningSmall != null) {
            return _cloudSnowLightningSmall!!
        }
        _cloudSnowLightningSmall = Builder(
            name = "CloudSnowLightningSmall",
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
                pathFillType = EvenOdd,
            ) {
                moveTo(16.312f, 9.856f)
                curveToRelative(0.491f, 0.112f, 0.89f, 0.382f, 1.176f, 0.753f)
                curveToRelative(0.389f, 0.504f, 0.544f, 1.161f, 0.49f, 1.796f)
                arcToRelative(2.83f, 2.83f, 0.0f, false, true, -0.826f, 1.782f)
                curveToRelative(-0.511f, 0.5f, -1.237f, 0.813f, -2.152f, 0.813f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.674f, 0.0f, 1.143f, -0.225f, 1.452f, -0.528f)
                arcToRelative(1.83f, 1.83f, 0.0f, false, false, 0.53f, -1.152f)
                curveToRelative(0.035f, -0.428f, -0.074f, -0.827f, -0.286f, -1.101f)
                curveToRelative(-0.2f, -0.26f, -0.511f, -0.438f, -0.976f, -0.42f)
                lineToRelative(-0.698f, 0.028f)
                lineToRelative(0.199f, -0.67f)
                curveToRelative(0.241f, -0.812f, 0.145f, -1.476f, -0.117f, -1.977f)
                arcToRelative(2.28f, 2.28f, 0.0f, false, false, -1.25f, -1.073f)
                curveToRelative(-1.048f, -0.38f, -2.361f, -0.045f, -2.996f, 1.395f)
                lineToRelative(-0.266f, 0.602f)
                lineToRelative(-0.509f, -0.418f)
                curveToRelative(-0.966f, -0.792f, -2.566f, -0.047f, -2.386f, 1.454f)
                lineToRelative(0.066f, 0.56f)
                lineTo(7.2f, 10.7f)
                curveToRelative(-0.348f, 0.0f, -0.634f, 0.168f, -0.845f, 0.463f)
                curveToRelative(-0.217f, 0.303f, -0.34f, 0.727f, -0.32f, 1.165f)
                curveToRelative(0.018f, 0.434f, 0.175f, 0.847f, 0.473f, 1.148f)
                curveToRelative(0.293f, 0.294f, 0.763f, 0.524f, 1.492f, 0.524f)
                verticalLineToRelative(1.0f)
                curveToRelative(-0.954f, 0.0f, -1.693f, -0.308f, -2.201f, -0.82f)
                curveToRelative(-0.502f, -0.505f, -0.736f, -1.168f, -0.764f, -1.809f)
                curveToRelative(-0.028f, -0.637f, 0.147f, -1.287f, 0.507f, -1.79f)
                arcToRelative(2.07f, 2.07f, 0.0f, false, true, 1.144f, -0.815f)
                curveToRelative(0.092f, -1.85f, 2.007f, -2.895f, 3.523f, -2.176f)
                curveToRelative(0.945f, -1.539f, 2.624f, -1.917f, 3.987f, -1.423f)
                curveToRelative(0.745f, 0.27f, 1.403f, 0.803f, 1.794f, 1.55f)
                curveToRelative(0.318f, 0.607f, 0.447f, 1.334f, 0.322f, 2.139f)
                moveTo(11.292f, 13.0f)
                horizontalLineToRelative(2.915f)
                lineToRelative(-0.853f, 0.854f)
                lineToRelative(-1.647f, 1.646f)
                horizontalLineToRelative(2.366f)
                lineToRelative(-1.088f, 0.887f)
                lineToRelative(-3.33f, 2.715f)
                lineToRelative(-3.17f, 2.584f)
                lineToRelative(2.454f, -3.271f)
                lineTo(10.0f, 17.0f)
                lineTo(7.293f, 17.0f)
                lineToRelative(0.853f, -0.854f)
                lineToRelative(3.0f, -3.0f)
                close()
                moveTo(9.792f, 16.0f)
                horizontalLineToRelative(-0.085f)
                lineToRelative(2.0f, -2.0f)
                horizontalLineToRelative(0.086f)
                lineToRelative(-1.647f, 1.646f)
                close()
                moveTo(16.5f, 15.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(-3.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                moveToRelative(-8.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
            }
        }
            .build()
        return _cloudSnowLightningSmall!!
    }

private var _cloudSnowLightningSmall: ImageVector? = null
