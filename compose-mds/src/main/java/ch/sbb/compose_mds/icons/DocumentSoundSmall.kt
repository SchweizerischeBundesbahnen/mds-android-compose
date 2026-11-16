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
                moveToRelative(12.699f, 3.998f)
                lineToRelative(0.146f, 0.146f)
                lineToRelative(5.009f, 5.006f)
                lineToRelative(0.146f, 0.146f)
                verticalLineToRelative(10.707f)
                lineTo(6.0f, 20.003f)
                lineTo(6.0f, 4.004f)
                horizontalLineToRelative(0.5f)
                lineToRelative(5.99f, -0.006f)
                close()
                moveTo(7.0f, 5.002f)
                verticalLineToRelative(14.001f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-4.999f)
                verticalLineToRelative(-0.498f)
                lineToRelative(-0.009f, -4.507f)
                close()
                moveTo(12.994f, 5.706f)
                lineTo(16.293f, 9.004f)
                horizontalLineToRelative(-3.294f)
                close()
                moveTo(14.997f, 17.998f)
                lineTo(14.997f, 11.0f)
                horizontalLineToRelative(-1.988f)
                lineToRelative(-2.0f, 2.0f)
                lineTo(8.997f, 13.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.012f)
                lineToRelative(1.854f, 1.86f)
                lineToRelative(0.148f, 0.147f)
                lineToRelative(0.209f, -0.001f)
                lineTo(14.499f, 18.0f)
                close()
                moveTo(9.997f, 14.0f)
                horizontalLineToRelative(1.427f)
                lineToRelative(2.0f, -2.0f)
                horizontalLineToRelative(0.573f)
                verticalLineToRelative(5.002f)
                lineToRelative(-0.574f, 0.003f)
                lineToRelative(-1.852f, -1.858f)
                lineToRelative(-0.146f, -0.147f)
                lineTo(9.997f, 15.0f)
                close()
            }
        }
        .build()
        return _documentSoundSmall!!
    }

private var _documentSoundSmall: ImageVector? = null
