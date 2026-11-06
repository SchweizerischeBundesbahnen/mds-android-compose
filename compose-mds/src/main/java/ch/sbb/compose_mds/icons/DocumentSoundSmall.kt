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

public val SBBIcons.DocumentSoundSmall: ImageVector
    get() {
        if (_documentSoundSmall != null) {
            return _documentSoundSmall!!
        }
        _documentSoundSmall = Builder(name = "DocumentSoundSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(12.698f, 3.997f)
                lineToRelative(0.147f, 0.147f)
                lineToRelative(5.009f, 5.006f)
                lineToRelative(0.146f, 0.146f)
                verticalLineToRelative(10.708f)
                lineTo(6.0f, 20.004f)
                verticalLineToRelative(-16.0f)
                horizontalLineToRelative(0.5f)
                lineToRelative(5.99f, -0.006f)
                close()
                moveTo(7.0f, 5.003f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-4.999f)
                verticalLineToRelative(-0.498f)
                lineToRelative(-0.009f, -4.507f)
                close()
                moveTo(12.994f, 5.707f)
                lineTo(16.293f, 9.004f)
                lineTo(13.0f, 9.004f)
                close()
                moveTo(13.217f, 11.0f)
                horizontalLineToRelative(-0.207f)
                lineToRelative(-0.147f, 0.146f)
                lineTo(11.01f, 13.0f)
                lineTo(8.997f, 13.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.012f)
                lineToRelative(1.854f, 1.859f)
                lineToRelative(0.147f, 0.148f)
                lineToRelative(0.21f, -0.001f)
                lineTo(14.5f, 18.0f)
                lineToRelative(0.497f, -0.003f)
                lineTo(14.997f, 11.0f)
                horizontalLineToRelative(-1.78f)
                moveToRelative(-1.647f, 2.853f)
                lineTo(13.424f, 12.0f)
                horizontalLineToRelative(0.573f)
                verticalLineToRelative(5.002f)
                lineToRelative(-0.574f, 0.003f)
                lineToRelative(-1.852f, -1.858f)
                lineToRelative(-0.147f, -0.147f)
                lineTo(9.997f, 15.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.427f)
                close()
            }
        }
        .build()
        return _documentSoundSmall!!
    }

private var _documentSoundSmall: ImageVector? = null
