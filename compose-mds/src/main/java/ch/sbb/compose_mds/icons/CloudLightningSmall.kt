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

public val SBBIcons.CloudLightningSmall: ImageVector
    get() {
        if (_cloudLightningSmall != null) {
            return _cloudLightningSmall!!
        }
        _cloudLightningSmall = Builder(name = "CloudLightningSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.195f, 6.167f)
                curveToRelative(-1.362f, -0.494f, -3.042f, -0.116f, -3.987f, 1.423f)
                curveToRelative(-1.515f, -0.719f, -3.427f, 0.325f, -3.52f, 2.175f)
                curveToRelative(-0.483f, 0.127f, -0.871f, 0.432f, -1.146f, 0.816f)
                curveToRelative(-0.36f, 0.503f, -0.534f, 1.153f, -0.507f, 1.79f)
                curveToRelative(0.028f, 0.64f, 0.262f, 1.303f, 0.764f, 1.809f)
                curveToRelative(0.508f, 0.511f, 1.247f, 0.82f, 2.201f, 0.82f)
                verticalLineToRelative(-1.0f)
                curveToRelative(-0.73f, 0.0f, -1.199f, -0.23f, -1.491f, -0.524f)
                curveToRelative(-0.299f, -0.301f, -0.456f, -0.714f, -0.475f, -1.148f)
                curveToRelative(-0.019f, -0.438f, 0.105f, -0.862f, 0.321f, -1.165f)
                curveToRelative(0.211f, -0.294f, 0.497f, -0.463f, 0.845f, -0.463f)
                horizontalLineToRelative(0.564f)
                lineToRelative(-0.068f, -0.56f)
                curveToRelative(-0.18f, -1.501f, 1.42f, -2.245f, 2.387f, -1.454f)
                lineToRelative(0.509f, 0.417f)
                lineToRelative(0.265f, -0.601f)
                curveToRelative(0.636f, -1.44f, 1.95f, -1.775f, 2.998f, -1.395f)
                curveToRelative(0.53f, 0.193f, 0.984f, 0.567f, 1.25f, 1.074f)
                curveToRelative(0.262f, 0.5f, 0.357f, 1.165f, 0.116f, 1.976f)
                lineToRelative(-0.2f, 0.67f)
                lineToRelative(0.699f, -0.027f)
                curveToRelative(0.465f, -0.019f, 0.78f, 0.16f, 0.985f, 0.422f)
                curveToRelative(0.215f, 0.275f, 0.329f, 0.675f, 0.295f, 1.101f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, -0.526f, 1.149f)
                curveToRelative(-0.31f, 0.302f, -0.785f, 0.528f, -1.474f, 0.528f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.925f, 0.0f, 1.658f, -0.312f, 2.172f, -0.813f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, false, 0.824f, -1.786f)
                curveToRelative(0.05f, -0.635f, -0.11f, -1.292f, -0.503f, -1.795f)
                arcToRelative(2.06f, 2.06f, 0.0f, false, false, -1.181f, -0.75f)
                curveToRelative(0.125f, -0.804f, -0.003f, -1.532f, -0.322f, -2.14f)
                arcToRelative(3.28f, 3.28f, 0.0f, false, false, -1.795f, -1.55f)
                moveTo(7.696f, 10.14f)
                lineToRelative(-0.496f, 0.06f)
                verticalLineToRelative(-0.002f)
                close()
                moveTo(11.707f, 15.499f)
                lineTo(14.207f, 12.999f)
                horizontalLineToRelative(-2.914f)
                lineToRelative(-4.0f, 4.0f)
                lineTo(10.0f, 16.999f)
                lineToRelative(-1.06f, 1.415f)
                lineToRelative(-2.454f, 3.271f)
                lineToRelative(3.17f, -2.584f)
                lineToRelative(3.33f, -2.714f)
                lineToRelative(1.087f, -0.888f)
                close()
                moveTo(9.793f, 15.999f)
                horizontalLineToRelative(-0.086f)
                lineToRelative(2.0f, -2.0f)
                horizontalLineToRelative(0.086f)
                close()
            }
        }
        .build()
        return _cloudLightningSmall!!
    }

private var _cloudLightningSmall: ImageVector? = null
