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

public val SBBIcons.DocumentSignatureMedium: ImageVector
    get() {
        if (_documentSignatureMedium != null) {
            return _documentSignatureMedium!!
        }
        _documentSignatureMedium = Builder(name = "DocumentSignatureMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(26.75f, 14.042f)
                verticalLineToRelative(15.707f)
                lineTo(9.25f, 29.749f)
                verticalLineToRelative(-23.5f)
                horizontalLineToRelative(9.708f)
                close()
                moveTo(10.25f, 28.749f)
                horizontalLineToRelative(15.5f)
                lineTo(25.75f, 14.744f)
                horizontalLineToRelative(-7.5f)
                lineTo(18.25f, 7.25f)
                horizontalLineToRelative(-8.0f)
                close()
                moveTo(14.366f, 23.663f)
                curveToRelative(0.266f, -0.149f, 0.603f, -0.233f, 0.957f, -0.12f)
                lineToRelative(0.153f, 0.063f)
                lineToRelative(0.004f, 0.001f)
                curveToRelative(0.229f, 0.114f, 0.35f, 0.313f, 0.411f, 0.483f)
                curveToRelative(0.06f, 0.166f, 0.08f, 0.345f, 0.085f, 0.504f)
                curveToRelative(0.011f, 0.316f, -0.031f, 0.694f, -0.065f, 1.014f)
                curveToRelative(-0.035f, 0.325f, -0.06f, 0.595f, -0.052f, 0.8f)
                quadToRelative(0.03f, -0.022f, 0.064f, -0.049f)
                curveToRelative(0.191f, -0.165f, 0.406f, -0.418f, 0.647f, -0.715f)
                curveToRelative(0.227f, -0.28f, 0.481f, -0.603f, 0.715f, -0.847f)
                curveToRelative(0.117f, -0.123f, 0.248f, -0.247f, 0.386f, -0.34f)
                arcToRelative(0.96f, 0.96f, 0.0f, false, true, 0.564f, -0.184f)
                horizontalLineToRelative(0.007f)
                curveToRelative(0.2f, 0.01f, 0.394f, 0.057f, 0.564f, 0.16f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.374f, 0.406f)
                curveToRelative(0.146f, 0.29f, 0.148f, 0.622f, 0.137f, 0.854f)
                curveToRelative(-0.006f, 0.125f, -0.018f, 0.252f, -0.027f, 0.357f)
                quadToRelative(-0.007f, 0.075f, -0.01f, 0.136f)
                curveToRelative(0.082f, -0.057f, 0.184f, -0.14f, 0.318f, -0.26f)
                curveToRelative(0.173f, -0.153f, 0.396f, -0.358f, 0.638f, -0.528f)
                curveToRelative(0.246f, -0.174f, 0.548f, -0.338f, 0.906f, -0.393f)
                horizontalLineToRelative(0.002f)
                curveToRelative(0.567f, -0.085f, 1.03f, 0.214f, 1.298f, 0.442f)
                curveToRelative(0.277f, 0.237f, 0.457f, 0.493f, 0.486f, 0.54f)
                lineToRelative(-0.426f, 0.262f)
                lineToRelative(-0.426f, 0.263f)
                curveToRelative(-0.016f, -0.021f, -0.123f, -0.167f, -0.284f, -0.304f)
                curveToRelative(-0.196f, -0.167f, -0.368f, -0.233f, -0.5f, -0.214f)
                curveToRelative(-0.147f, 0.022f, -0.303f, 0.096f, -0.481f, 0.22f)
                curveToRelative(-0.183f, 0.13f, -0.352f, 0.286f, -0.549f, 0.46f)
                curveToRelative(-0.177f, 0.158f, -0.402f, 0.354f, -0.644f, 0.471f)
                curveToRelative(-0.272f, 0.132f, -0.619f, 0.189f, -0.971f, -0.008f)
                arcToRelative(0.72f, 0.72f, 0.0f, false, true, -0.339f, -0.452f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, true, -0.037f, -0.386f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.023f, -0.34f)
                curveToRelative(0.01f, -0.112f, 0.02f, -0.213f, 0.024f, -0.311f)
                curveToRelative(0.01f, -0.214f, -0.01f, -0.319f, -0.031f, -0.36f)
                lineToRelative(-0.001f, -0.002f)
                lineToRelative(-0.043f, -0.009f)
                lineToRelative(-0.01f, 0.007f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.226f, 0.203f)
                curveToRelative(-0.197f, 0.206f, -0.412f, 0.482f, -0.66f, 0.788f)
                curveToRelative(-0.236f, 0.29f, -0.503f, 0.61f, -0.77f, 0.84f)
                curveToRelative(-0.134f, 0.116f, -0.291f, 0.23f, -0.465f, 0.304f)
                arcToRelative(0.93f, 0.93f, 0.0f, false, true, -0.648f, 0.044f)
                verticalLineToRelative(-0.001f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, -0.486f, -0.44f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, true, -0.115f, -0.507f)
                curveToRelative(-0.02f, -0.313f, 0.018f, -0.69f, 0.053f, -1.012f)
                curveToRelative(0.037f, -0.348f, 0.07f, -0.645f, 0.061f, -0.874f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.013f, -0.136f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, false, -0.11f, 0.042f)
                curveToRelative(-0.123f, 0.069f, -0.267f, 0.205f, -0.414f, 0.39f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, -0.453f, 0.72f)
                lineToRelative(-0.025f, 0.051f)
                lineToRelative(-0.006f, 0.014f)
                lineToRelative(-0.454f, -0.211f)
                lineToRelative(-0.454f, -0.21f)
                lineToRelative(0.002f, -0.004f)
                lineToRelative(0.002f, -0.006f)
                lineToRelative(0.01f, -0.018f)
                lineToRelative(0.033f, -0.068f)
                arcToRelative(5.6f, 5.6f, 0.0f, false, true, 0.56f, -0.887f)
                curveToRelative(0.181f, -0.229f, 0.422f, -0.481f, 0.71f, -0.643f)
                moveToRelative(8.136f, -2.914f)
                lineTo(13.5f, 20.749f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(9.003f)
                close()
                moveTo(22.501f, 17.75f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(19.25f, 13.744f)
                horizontalLineToRelative(5.788f)
                lineTo(19.25f, 7.956f)
                close()
            }
        }
        .build()
        return _documentSignatureMedium!!
    }

private var _documentSignatureMedium: ImageVector? = null
