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

public val SBBIcons.DocumentSignatureSmall: ImageVector
    get() {
        if (_documentSignatureSmall != null) {
            return _documentSignatureSmall!!
        }
        _documentSignatureSmall = Builder(name = "DocumentSignatureSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 9.292f)
                verticalLineToRelative(10.707f)
                lineTo(6.0f, 19.999f)
                verticalLineToRelative(-16.0f)
                horizontalLineToRelative(6.708f)
                close()
                moveTo(7.0f, 18.999f)
                horizontalLineToRelative(10.0f)
                lineTo(17.0f, 9.996f)
                horizontalLineToRelative(-5.0f)
                lineTo(12.0f, 5.0f)
                lineTo(7.0f, 5.0f)
                close()
                moveTo(9.496f, 15.629f)
                arcToRelative(0.96f, 0.96f, 0.0f, false, true, 0.77f, -0.093f)
                lineToRelative(0.124f, 0.05f)
                lineToRelative(0.004f, 0.003f)
                arcToRelative(0.73f, 0.73f, 0.0f, false, true, 0.357f, 0.414f)
                curveToRelative(0.048f, 0.134f, 0.063f, 0.273f, 0.067f, 0.387f)
                curveToRelative(0.008f, 0.225f, -0.023f, 0.491f, -0.045f, 0.7f)
                lineToRelative(-0.009f, 0.083f)
                quadToRelative(0.072f, -0.084f, 0.154f, -0.182f)
                curveToRelative(0.147f, -0.182f, 0.323f, -0.406f, 0.485f, -0.575f)
                curveToRelative(0.082f, -0.086f, 0.179f, -0.178f, 0.285f, -0.25f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, 0.475f, -0.151f)
                horizontalLineToRelative(0.006f)
                arcToRelative(0.96f, 0.96f, 0.0f, false, true, 0.454f, 0.13f)
                curveToRelative(0.146f, 0.088f, 0.247f, 0.21f, 0.312f, 0.34f)
                curveToRelative(0.105f, 0.208f, 0.114f, 0.436f, 0.11f, 0.595f)
                curveToRelative(0.1f, -0.088f, 0.221f, -0.194f, 0.35f, -0.285f)
                curveToRelative(0.175f, -0.123f, 0.401f, -0.248f, 0.675f, -0.29f)
                curveToRelative(0.451f, -0.068f, 0.81f, 0.17f, 1.0f, 0.333f)
                curveToRelative(0.2f, 0.17f, 0.33f, 0.355f, 0.357f, 0.4f)
                lineToRelative(-0.425f, 0.261f)
                lineToRelative(-0.426f, 0.263f)
                curveToRelative(0.01f, 0.018f, 0.015f, 0.023f, 0.004f, 0.008f)
                quadToRelative(-0.01f, -0.016f, -0.034f, -0.043f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.126f, -0.128f)
                curveToRelative(-0.117f, -0.1f, -0.183f, -0.107f, -0.2f, -0.105f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, false, -0.25f, 0.118f)
                curveToRelative(-0.112f, 0.08f, -0.216f, 0.176f, -0.351f, 0.296f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, -0.468f, 0.34f)
                arcToRelative(0.84f, 0.84f, 0.0f, false, true, -0.8f, -0.012f)
                arcToRelative(0.65f, 0.65f, 0.0f, false, true, -0.306f, -0.403f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.03f, -0.304f)
                curveToRelative(0.001f, -0.082f, 0.008f, -0.168f, 0.015f, -0.238f)
                quadToRelative(0.002f, -0.044f, 0.006f, -0.083f)
                quadToRelative(-0.15f, 0.175f, -0.342f, 0.414f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -0.533f, 0.581f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, true, -0.355f, 0.23f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, -0.545f, 0.034f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, true, -0.427f, -0.382f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, true, -0.091f, -0.398f)
                curveToRelative(-0.015f, -0.225f, 0.013f, -0.492f, 0.036f, -0.703f)
                quadToRelative(0.02f, -0.18f, 0.03f, -0.32f)
                quadToRelative(-0.025f, 0.025f, -0.052f, 0.057f)
                arcToRelative(2.7f, 2.7f, 0.0f, false, false, -0.284f, 0.45f)
                lineToRelative(-0.014f, 0.032f)
                lineToRelative(-0.004f, 0.007f)
                lineToRelative(-0.907f, -0.422f)
                lineToRelative(0.001f, -0.002f)
                lineToRelative(0.002f, -0.005f)
                lineToRelative(0.03f, -0.06f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.392f, -0.62f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 0.523f, -0.471f)
                moveTo(15.002f, 14.0f)
                lineTo(9.0f, 14.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.002f)
                close()
                moveTo(15.002f, 12.001f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(13.0f, 8.996f)
                horizontalLineToRelative(3.289f)
                lineTo(13.0f, 5.707f)
                close()
            }
        }
        .build()
        return _documentSignatureSmall!!
    }

private var _documentSignatureSmall: ImageVector? = null
