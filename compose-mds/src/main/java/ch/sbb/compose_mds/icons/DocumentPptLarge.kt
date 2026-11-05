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

public val SBBIcons.DocumentPptLarge: ImageVector
    get() {
        if (_documentPptLarge != null) {
            return _documentPptLarge!!
        }
        _documentPptLarge = Builder(name = "DocumentPptLarge", defaultWidth = 48.0.dp, defaultHeight
                = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(36.0f, 18.293f)
                lineTo(36.0f, 39.0f)
                lineTo(13.0f, 39.0f)
                verticalLineToRelative(-0.5f)
                lineToRelative(0.018f, -30.0f)
                lineTo(13.018f, 8.0f)
                horizontalLineToRelative(12.689f)
                close()
                moveTo(14.0f, 38.0f)
                horizontalLineToRelative(21.0f)
                lineTo(35.0f, 19.0f)
                lineTo(25.0f, 19.0f)
                lineTo(25.0f, 9.0f)
                lineTo(14.018f, 9.0f)
                close()
                moveTo(18.97f, 29.505f)
                quadToRelative(0.623f, 0.001f, 0.982f, 0.074f)
                quadToRelative(0.357f, 0.078f, 0.648f, 0.27f)
                quadToRelative(0.798f, 0.525f, 0.8f, 1.584f)
                quadToRelative(-0.001f, 0.939f, -0.662f, 1.476f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, -0.642f, 0.33f)
                quadToRelative(-0.36f, 0.101f, -0.886f, 0.1f)
                horizontalLineToRelative(-1.374f)
                lineTo(17.836f, 35.5f)
                lineTo(16.5f, 35.5f)
                verticalLineToRelative(-5.996f)
                close()
                moveTo(24.603f, 29.505f)
                quadToRelative(0.622f, 0.001f, 0.981f, 0.074f)
                quadToRelative(0.357f, 0.078f, 0.648f, 0.27f)
                quadToRelative(0.799f, 0.525f, 0.8f, 1.584f)
                quadToRelative(-0.001f, 0.939f, -0.662f, 1.476f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -0.642f, 0.33f)
                quadToRelative(-0.36f, 0.101f, -0.886f, 0.1f)
                horizontalLineToRelative(-1.374f)
                lineTo(23.468f, 35.5f)
                horizontalLineToRelative(-1.336f)
                verticalLineToRelative(-5.996f)
                close()
                moveTo(32.5f, 30.613f)
                horizontalLineToRelative(-1.86f)
                verticalLineToRelative(4.888f)
                horizontalLineToRelative(-1.336f)
                verticalLineToRelative(-4.888f)
                horizontalLineToRelative(-1.85f)
                verticalLineToRelative(-1.108f)
                lineTo(32.5f, 29.505f)
                close()
                moveTo(17.836f, 32.312f)
                horizontalLineToRelative(1.194f)
                curveToRelative(0.352f, 0.0f, 0.608f, -0.065f, 0.764f, -0.187f)
                quadToRelative(0.29f, -0.229f, 0.29f, -0.676f)
                quadToRelative(0.0f, -0.452f, -0.334f, -0.672f)
                quadToRelative(-0.243f, -0.164f, -0.792f, -0.164f)
                horizontalLineToRelative(-1.122f)
                close()
                moveTo(23.468f, 32.312f)
                horizontalLineToRelative(1.194f)
                curveToRelative(0.352f, 0.0f, 0.608f, -0.065f, 0.764f, -0.187f)
                quadToRelative(0.29f, -0.229f, 0.29f, -0.676f)
                quadToRelative(0.0f, -0.452f, -0.334f, -0.672f)
                quadToRelative(-0.243f, -0.164f, -0.792f, -0.164f)
                horizontalLineToRelative(-1.122f)
                close()
                moveTo(26.0f, 18.0f)
                horizontalLineToRelative(8.293f)
                lineTo(26.0f, 9.707f)
                close()
            }
        }
        .build()
        return _documentPptLarge!!
    }

private var _documentPptLarge: ImageVector? = null
