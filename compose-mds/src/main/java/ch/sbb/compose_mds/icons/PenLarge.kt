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

public val SBBIcons.PenLarge: ImageVector
    get() {
        if (_penLarge != null) {
            return _penLarge!!
        }
        _penLarge = Builder(name = "PenLarge", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.91f, 43.09f)
                lineToRelative(0.121f, 0.485f)
                lineToRelative(-0.808f, 0.202f)
                lineToRelative(0.202f, -0.808f)
                close()
                moveTo(43.797f, 11.27f)
                lineTo(40.262f, 14.805f)
                lineTo(40.268f, 14.81f)
                lineTo(39.914f, 15.164f)
                lineTo(13.744f, 41.324f)
                lineTo(13.646f, 41.422f)
                lineTo(13.512f, 41.455f)
                lineTo(13.391f, 40.971f)
                horizontalLineToRelative(-0.001f)
                lineToRelative(0.122f, 0.484f)
                lineToRelative(-8.48f, 2.12f)
                lineToRelative(-0.122f, -0.485f)
                lineToRelative(-0.485f, -0.121f)
                lineToRelative(2.12f, -8.48f)
                lineToRelative(0.034f, -0.135f)
                lineToRelative(0.098f, -0.097f)
                lineToRelative(26.16f, -26.17f)
                lineToRelative(0.353f, -0.354f)
                lineToRelative(0.004f, 0.004f)
                lineToRelative(3.535f, -3.534f)
                close()
                moveTo(5.597f, 42.402f)
                lineTo(6.764f, 42.11f)
                lineTo(5.889f, 41.235f)
                close()
                moveTo(6.172f, 40.104f)
                lineTo(7.895f, 41.827f)
                lineTo(12.411f, 40.698f)
                lineTo(7.301f, 35.588f)
                close()
                moveTo(7.736f, 34.609f)
                lineTo(13.39f, 40.263f)
                lineTo(38.853f, 14.809f)
                lineTo(33.19f, 9.147f)
                close()
                moveTo(37.434f, 14.804f)
                lineTo(13.394f, 38.854f)
                lineTo(12.687f, 38.146f)
                lineTo(36.727f, 14.096f)
                close()
                moveTo(33.9f, 8.444f)
                lineToRelative(5.654f, 5.653f)
                lineToRelative(2.828f, -2.827f)
                lineToRelative(-5.654f, -5.653f)
                close()
            }
        }
        .build()
        return _penLarge!!
    }

private var _penLarge: ImageVector? = null
