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

public val SBBIcons.GiftMedium: ImageVector
    get() {
        if (_giftMedium != null) {
            return _giftMedium!!
        }
        _giftMedium = Builder(name = "GiftMedium", defaultWidth = 36.0.dp, defaultHeight = 36.0.dp,
                viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.7f, 3.518f)
                curveToRelative(-0.804f, -0.383f, -1.706f, -0.355f, -2.474f, -0.045f)
                reflectiveCurveToRelative(-1.435f, 0.914f, -1.757f, 1.729f)
                curveToRelative(-0.328f, 0.827f, -0.277f, 1.818f, 0.295f, 2.842f)
                lineToRelative(0.015f, 0.028f)
                lineToRelative(0.019f, 0.025f)
                lineToRelative(1.96f, 2.653f)
                lineTo(4.75f, 10.75f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(16.5f)
                horizontalLineToRelative(23.5f)
                verticalLineToRelative(-16.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-5.5f)
                lineTo(21.241f, 10.75f)
                lineToRelative(1.961f, -2.653f)
                lineToRelative(0.017f, -0.021f)
                lineToRelative(0.013f, -0.025f)
                curveToRelative(0.585f, -1.008f, 0.64f, -1.992f, 0.312f, -2.816f)
                curveToRelative(-0.322f, -0.81f, -0.993f, -1.414f, -1.76f, -1.726f)
                curveToRelative(-0.77f, -0.312f, -1.674f, -0.347f, -2.48f, 0.028f)
                curveToRelative(-0.513f, 0.238f, -0.962f, 0.63f, -1.303f, 1.181f)
                arcToRelative(3.07f, 3.07f, 0.0f, false, false, -1.3f, -1.2f)
                moveToRelative(0.8f, 2.55f)
                curveToRelative(-0.257f, -0.91f, -0.732f, -1.41f, -1.23f, -1.647f)
                curveToRelative(-0.519f, -0.247f, -1.126f, -0.24f, -1.67f, -0.02f)
                reflectiveCurveToRelative(-0.99f, 0.638f, -1.2f, 1.169f)
                curveToRelative(-0.203f, 0.512f, -0.206f, 1.18f, 0.224f, 1.963f)
                lineToRelative(2.379f, 3.217f)
                horizontalLineToRelative(1.492f)
                close()
                moveTo(22.376f, 7.535f)
                lineTo(19.999f, 10.75f)
                horizontalLineToRelative(-1.503f)
                lineToRelative(0.004f, -4.68f)
                curveToRelative(0.253f, -0.903f, 0.727f, -1.395f, 1.226f, -1.627f)
                curveToRelative(0.52f, -0.242f, 1.133f, -0.23f, 1.682f, -0.007f)
                curveToRelative(0.55f, 0.223f, 0.999f, 0.643f, 1.207f, 1.168f)
                curveToRelative(0.202f, 0.507f, 0.2f, 1.164f, -0.239f, 1.93f)
                moveTo(21.25f, 16.25f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(6.5f)
                close()
                moveTo(21.25f, 15.25f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(6.5f)
                close()
                moveTo(22.25f, 15.25f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(3.5f)
                close()
                moveTo(22.25f, 16.25f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(-15.5f)
                close()
                moveTo(5.75f, 15.25f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-8.0f)
                close()
                moveTo(13.75f, 31.75f)
                verticalLineToRelative(-15.5f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(15.5f)
                close()
            }
        }
        .build()
        return _giftMedium!!
    }

private var _giftMedium: ImageVector? = null
