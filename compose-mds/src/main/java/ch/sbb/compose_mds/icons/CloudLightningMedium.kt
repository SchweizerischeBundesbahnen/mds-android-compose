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

public val SBBIcons.CloudLightningMedium: ImageVector
    get() {
        if (_cloudLightningMedium != null) {
            return _cloudLightningMedium!!
        }
        _cloudLightningMedium = Builder(name = "CloudLightningMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(26.043f, 16.063f)
                arcToRelative(2.86f, 2.86f, 0.0f, false, false, -1.863f, -1.08f)
                curveToRelative(0.246f, -1.253f, 0.065f, -2.373f, -0.417f, -3.293f)
                arcToRelative(4.66f, 4.66f, 0.0f, false, false, -2.555f, -2.204f)
                curveToRelative(-1.997f, -0.725f, -4.471f, -0.138f, -5.8f, 2.23f)
                curveToRelative(-2.191f, -1.226f, -5.127f, 0.331f, -5.134f, 3.133f)
                curveToRelative(-0.744f, 0.144f, -1.342f, 0.586f, -1.758f, 1.168f)
                curveToRelative(-0.504f, 0.704f, -0.753f, 1.624f, -0.714f, 2.53f)
                curveToRelative(0.04f, 0.909f, 0.372f, 1.84f, 1.073f, 2.547f)
                curveToRelative(0.708f, 0.713f, 1.75f, 1.156f, 3.125f, 1.156f)
                verticalLineToRelative(-1.0f)
                curveToRelative(-1.15f, 0.0f, -1.922f, -0.364f, -2.415f, -0.86f)
                curveToRelative(-0.498f, -0.503f, -0.753f, -1.184f, -0.784f, -1.887f)
                curveToRelative(-0.03f, -0.707f, 0.167f, -1.4f, 0.528f, -1.905f)
                curveToRelative(0.355f, -0.495f, 0.855f, -0.798f, 1.471f, -0.798f)
                horizontalLineToRelative(0.563f)
                lineToRelative(-0.066f, -0.56f)
                curveToRelative(-0.296f, -2.472f, 2.36f, -3.737f, 3.986f, -2.404f)
                lineToRelative(0.51f, 0.418f)
                lineToRelative(0.265f, -0.602f)
                curveToRelative(1.01f, -2.29f, 3.124f, -2.838f, 4.81f, -2.226f)
                curveToRelative(0.848f, 0.308f, 1.58f, 0.908f, 2.01f, 1.728f)
                curveToRelative(0.426f, 0.815f, 0.572f, 1.879f, 0.193f, 3.153f)
                lineToRelative(-0.2f, 0.67f)
                lineToRelative(0.7f, -0.028f)
                curveToRelative(0.777f, -0.03f, 1.328f, 0.273f, 1.684f, 0.73f)
                curveToRelative(0.367f, 0.47f, 0.549f, 1.133f, 0.494f, 1.825f)
                arcToRelative(2.95f, 2.95f, 0.0f, false, true, -0.864f, 1.882f)
                curveToRelative(-0.516f, 0.503f, -1.292f, 0.864f, -2.385f, 0.864f)
                verticalLineToRelative(1.0f)
                curveToRelative(1.329f, 0.0f, 2.363f, -0.446f, 3.083f, -1.148f)
                arcToRelative(3.95f, 3.95f, 0.0f, false, false, 1.163f, -2.52f)
                curveToRelative(0.07f, -0.9f, -0.159f, -1.822f, -0.703f, -2.519f)
                moveTo(17.25f, 19.75f)
                horizontalLineToRelative(-0.207f)
                lineToRelative(-0.147f, 0.146f)
                lineToRelative(-4.5f, 4.5f)
                lineToRelative(-0.853f, 0.854f)
                lineTo(15.5f, 25.25f)
                lineToRelative(-1.892f, 2.523f)
                lineToRelative(-2.453f, 3.27f)
                lineToRelative(3.17f, -2.583f)
                lineToRelative(4.994f, -4.073f)
                lineToRelative(1.089f, -0.887f)
                horizontalLineToRelative(-3.451f)
                lineToRelative(2.896f, -2.896f)
                lineToRelative(0.854f, -0.854f)
                lineTo(17.25f, 19.75f)
                moveToRelative(-0.35f, 5.3f)
                lineToRelative(0.412f, -0.55f)
                horizontalLineToRelative(0.287f)
                lineToRelative(-0.737f, 0.601f)
                close()
                moveTo(13.957f, 24.25f)
                horizontalLineToRelative(0.836f)
                lineToRelative(0.603f, -0.604f)
                lineToRelative(2.897f, -2.896f)
                horizontalLineToRelative(-0.836f)
                close()
            }
        }
        .build()
        return _cloudLightningMedium!!
    }

private var _cloudLightningMedium: ImageVector? = null
