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

public val SBBIcons.BrochureLarge: ImageVector
    get() {
        if (_brochureLarge != null) {
            return _brochureLarge!!
        }
        _brochureLarge = Builder(name = "BrochureLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(42.224f, 36.047f)
                lineToRelative(-0.343f, 0.113f)
                lineToRelative(-18.111f, 5.998f)
                lineToRelative(-0.158f, 0.053f)
                lineToRelative(-0.157f, -0.053f)
                lineTo(5.343f, 36.16f)
                lineTo(5.0f, 36.047f)
                lineTo(5.0f, 5.0f)
                lineToRelative(0.657f, 0.218f)
                lineToRelative(17.954f, 5.946f)
                lineToRelative(17.955f, -5.946f)
                lineToRelative(0.658f, -0.218f)
                close()
                moveTo(6.0f, 35.324f)
                lineToRelative(17.112f, 5.666f)
                lineTo(23.112f, 12.052f)
                lineTo(6.0f, 6.384f)
                close()
                moveTo(24.112f, 12.052f)
                lineTo(24.112f, 40.99f)
                lineToRelative(17.112f, -5.666f)
                lineTo(41.224f, 6.384f)
                close()
                moveTo(39.205f, 31.048f)
                lineTo(38.862f, 31.161f)
                lineTo(26.788f, 35.161f)
                lineTo(26.131f, 35.378f)
                verticalLineToRelative(-13.05f)
                lineToRelative(0.343f, -0.114f)
                lineToRelative(12.075f, -4.0f)
                lineToRelative(0.656f, -0.217f)
                close()
                moveTo(20.75f, 34.21f)
                lineToRelative(-0.157f, 0.474f)
                lineToRelative(-0.157f, 0.475f)
                lineToRelative(-12.075f, -3.999f)
                lineToRelative(0.315f, -0.95f)
                close()
                moveTo(27.13f, 23.048f)
                verticalLineToRelative(10.944f)
                lineToRelative(11.075f, -3.668f)
                lineTo(38.205f, 19.381f)
                close()
                moveTo(20.75f, 28.211f)
                lineTo(20.593f, 28.685f)
                lineTo(20.436f, 29.16f)
                lineTo(8.361f, 25.161f)
                lineTo(8.676f, 24.211f)
                close()
                moveTo(20.75f, 22.213f)
                lineTo(20.593f, 22.688f)
                lineTo(20.436f, 23.162f)
                lineTo(8.361f, 19.163f)
                lineTo(8.676f, 18.213f)
                close()
                moveTo(20.75f, 16.213f)
                lineTo(20.593f, 16.689f)
                lineTo(20.436f, 17.163f)
                lineTo(8.361f, 13.164f)
                lineTo(8.676f, 12.214f)
                close()
                moveTo(38.705f, 12.689f)
                lineTo(38.862f, 13.164f)
                lineTo(26.788f, 17.164f)
                lineTo(26.474f, 16.214f)
                lineTo(38.549f, 12.214f)
                close()
            }
        }
        .build()
        return _brochureLarge!!
    }

private var _brochureLarge: ImageVector? = null
