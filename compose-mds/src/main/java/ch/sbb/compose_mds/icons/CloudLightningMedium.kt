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
                moveTo(21.209f, 9.486f)
                curveToRelative(-1.998f, -0.724f, -4.473f, -0.138f, -5.801f, 2.23f)
                curveToRelative(-2.191f, -1.225f, -5.124f, 0.33f, -5.132f, 3.133f)
                curveToRelative(-0.745f, 0.142f, -1.343f, 0.585f, -1.76f, 1.168f)
                curveToRelative(-0.504f, 0.704f, -0.753f, 1.624f, -0.714f, 2.53f)
                curveToRelative(0.04f, 0.909f, 0.372f, 1.84f, 1.073f, 2.547f)
                curveToRelative(0.708f, 0.713f, 1.75f, 1.156f, 3.126f, 1.156f)
                verticalLineToRelative(-1.0f)
                curveToRelative(-1.15f, 0.0f, -1.923f, -0.364f, -2.416f, -0.86f)
                curveToRelative(-0.498f, -0.503f, -0.753f, -1.184f, -0.784f, -1.887f)
                curveToRelative(-0.03f, -0.707f, 0.168f, -1.4f, 0.529f, -1.904f)
                curveToRelative(0.354f, -0.496f, 0.854f, -0.8f, 1.47f, -0.8f)
                horizontalLineToRelative(0.564f)
                lineToRelative(-0.068f, -0.559f)
                curveToRelative(-0.286f, -2.395f, 2.198f, -3.656f, 3.831f, -2.521f)
                lineToRelative(0.157f, 0.118f)
                lineToRelative(0.508f, 0.417f)
                lineToRelative(0.266f, -0.603f)
                curveToRelative(1.01f, -2.29f, 3.123f, -2.836f, 4.809f, -2.225f)
                arcToRelative(3.67f, 3.67f, 0.0f, false, true, 2.01f, 1.728f)
                curveToRelative(0.427f, 0.814f, 0.573f, 1.88f, 0.194f, 3.153f)
                lineToRelative(-0.2f, 0.67f)
                lineToRelative(0.699f, -0.028f)
                curveToRelative(0.777f, -0.03f, 1.33f, 0.274f, 1.685f, 0.73f)
                curveToRelative(0.367f, 0.47f, 0.548f, 1.133f, 0.494f, 1.825f)
                arcToRelative(2.95f, 2.95f, 0.0f, false, true, -0.864f, 1.882f)
                curveToRelative(-0.516f, 0.503f, -1.292f, 0.864f, -2.385f, 0.864f)
                verticalLineToRelative(1.0f)
                curveToRelative(1.329f, 0.0f, 2.363f, -0.446f, 3.084f, -1.148f)
                arcToRelative(3.95f, 3.95f, 0.0f, false, false, 1.162f, -2.52f)
                curveToRelative(0.07f, -0.9f, -0.159f, -1.822f, -0.703f, -2.519f)
                arcToRelative(2.86f, 2.86f, 0.0f, false, false, -1.865f, -1.079f)
                curveToRelative(0.246f, -1.254f, 0.067f, -2.374f, -0.415f, -3.294f)
                arcToRelative(4.66f, 4.66f, 0.0f, false, false, -2.555f, -2.204f)
                moveToRelative(-5.15f, 3.165f)
                lineToRelative(-0.459f, -0.2f)
                verticalLineToRelative(-0.002f)
                close()
                moveTo(11.295f, 15.241f)
                lineTo(10.799f, 15.3f)
                verticalLineToRelative(-0.001f)
                close()
                moveTo(16.956f, 23.5f)
                lineTo(20.706f, 19.75f)
                horizontalLineToRelative(-3.664f)
                lineToRelative(-5.5f, 5.5f)
                lineTo(15.5f, 25.25f)
                lineToRelative(-1.892f, 2.522f)
                lineToRelative(-2.453f, 3.272f)
                lineToRelative(3.17f, -2.584f)
                lineToRelative(4.994f, -4.072f)
                lineToRelative(1.09f, -0.888f)
                close()
                moveTo(16.861f, 25.1f)
                lineTo(16.899f, 25.05f)
                lineTo(17.312f, 24.5f)
                horizontalLineToRelative(0.286f)
                close()
                moveTo(14.792f, 24.25f)
                horizontalLineToRelative(-0.836f)
                lineToRelative(3.5f, -3.5f)
                horizontalLineToRelative(0.836f)
                close()
            }
        }
        .build()
        return _cloudLightningMedium!!
    }

private var _cloudLightningMedium: ImageVector? = null
