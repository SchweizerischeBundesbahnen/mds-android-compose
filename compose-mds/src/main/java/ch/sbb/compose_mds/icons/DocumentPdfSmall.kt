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

public val SBBIcons.DocumentPdfSmall: ImageVector
    get() {
        if (_documentPdfSmall != null) {
            return _documentPdfSmall!!
        }
        _documentPdfSmall = Builder(name = "DocumentPdfSmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 9.293f)
                lineTo(18.0f, 20.0f)
                lineTo(6.0f, 20.0f)
                verticalLineToRelative(-0.5f)
                lineToRelative(0.008f, -15.0f)
                lineTo(6.01f, 4.0f)
                horizontalLineToRelative(6.698f)
                close()
                moveTo(7.0f, 19.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(12.0f, 5.0f)
                lineTo(7.009f, 5.0f)
                close()
                moveTo(9.208f, 15.001f)
                quadToRelative(0.303f, 0.0f, 0.48f, 0.038f)
                quadToRelative(0.174f, 0.04f, 0.317f, 0.134f)
                quadToRelative(0.39f, 0.264f, 0.391f, 0.792f)
                quadToRelative(0.0f, 0.471f, -0.323f, 0.738f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, -0.315f, 0.165f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, true, -0.434f, 0.051f)
                horizontalLineToRelative(-0.672f)
                lineTo(8.652f, 18.0f)
                horizontalLineToRelative(-0.654f)
                verticalLineToRelative(-2.998f)
                close()
                moveTo(11.968f, 15.001f)
                quadToRelative(0.336f, 0.0f, 0.578f, 0.078f)
                quadToRelative(0.241f, 0.079f, 0.425f, 0.247f)
                quadToRelative(0.45f, 0.41f, 0.45f, 1.137f)
                quadToRelative(0.0f, 0.772f, -0.424f, 1.192f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, true, -0.42f, 0.265f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -0.595f, 0.08f)
                horizontalLineToRelative(-1.227f)
                lineTo(10.755f, 15.0f)
                close()
                moveTo(15.982f, 15.556f)
                horizontalLineToRelative(-1.455f)
                verticalLineToRelative(0.694f)
                horizontalLineToRelative(1.267f)
                verticalLineToRelative(0.516f)
                horizontalLineToRelative(-1.267f)
                verticalLineToRelative(1.233f)
                horizontalLineToRelative(-0.654f)
                verticalLineToRelative(-2.997f)
                horizontalLineToRelative(2.109f)
                close()
                moveTo(11.41f, 17.446f)
                horizontalLineToRelative(0.504f)
                quadToRelative(0.232f, 0.0f, 0.37f, -0.045f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, false, 0.239f, -0.159f)
                quadToRelative(0.238f, -0.256f, 0.237f, -0.755f)
                quadToRelative(0.001f, -0.459f, -0.22f, -0.696f)
                quadToRelative(-0.22f, -0.235f, -0.652f, -0.235f)
                horizontalLineToRelative(-0.478f)
                close()
                moveTo(8.652f, 16.404f)
                horizontalLineToRelative(0.584f)
                quadToRelative(0.261f, 0.0f, 0.375f, -0.091f)
                quadToRelative(0.142f, -0.114f, 0.141f, -0.34f)
                quadToRelative(0.0f, -0.224f, -0.164f, -0.335f)
                quadToRelative(-0.118f, -0.082f, -0.387f, -0.082f)
                horizontalLineToRelative(-0.55f)
                close()
                moveTo(13.0f, 9.0f)
                horizontalLineToRelative(3.292f)
                lineTo(13.0f, 5.708f)
                close()
            }
        }
        .build()
        return _documentPdfSmall!!
    }

private var _documentPdfSmall: ImageVector? = null
