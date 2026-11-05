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

public val SBBIcons.DocumentSoundLarge: ImageVector
    get() {
        if (_documentSoundLarge != null) {
            return _documentSoundLarge!!
        }
        _documentSoundLarge = Builder(name = "DocumentSoundLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.835f, 8.142f)
                lineToRelative(10.018f, 10.011f)
                lineToRelative(0.147f, 0.147f)
                verticalLineToRelative(20.707f)
                lineTo(12.0f, 39.007f)
                verticalLineToRelative(-31.0f)
                horizontalLineToRelative(0.499f)
                lineToRelative(11.982f, -0.012f)
                horizontalLineToRelative(0.207f)
                close()
                moveTo(13.0f, 9.006f)
                verticalLineToRelative(29.0f)
                horizontalLineToRelative(21.0f)
                lineTo(34.0f, 19.009f)
                horizontalLineToRelative(-9.998f)
                lineToRelative(-0.001f, -0.5f)
                lineToRelative(-0.018f, -9.513f)
                close()
                moveTo(28.994f, 34.998f)
                lineTo(28.496f, 35.0f)
                lineTo(25.936f, 35.012f)
                horizontalLineToRelative(-0.209f)
                lineToRelative(-0.147f, -0.147f)
                lineTo(21.728f, 31.0f)
                horizontalLineToRelative(-3.734f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(3.733f)
                lineToRelative(3.854f, -3.854f)
                lineToRelative(0.146f, -0.146f)
                horizontalLineToRelative(3.267f)
                close()
                moveTo(22.142f, 27.0f)
                horizontalLineToRelative(-3.148f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.148f)
                lineToRelative(0.146f, 0.148f)
                lineToRelative(3.852f, 3.863f)
                lineToRelative(1.854f, -0.009f)
                lineTo(27.994f, 23.0f)
                horizontalLineToRelative(-1.852f)
                close()
                moveTo(25.0f, 18.008f)
                horizontalLineToRelative(8.294f)
                lineToRelative(-8.309f, -8.304f)
                close()
            }
        }
        .build()
        return _documentSoundLarge!!
    }

private var _documentSoundLarge: ImageVector? = null
