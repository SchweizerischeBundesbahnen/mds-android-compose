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

public val SBBIcons.ArrowsUpDownLarge: ImageVector
    get() {
        if (_arrowsUpDownLarge != null) {
            return _arrowsUpDownLarge!!
        }
        _arrowsUpDownLarge = Builder(name = "ArrowsUpDownLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.855f, 11.648f)
                lineToRelative(7.704f, 7.788f)
                lineToRelative(-0.71f, 0.704f)
                lineTo(15.0f, 13.217f)
                lineTo(15.0f, 37.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(14.0f, 13.219f)
                lineToRelative(-6.83f, 6.925f)
                lineToRelative(-0.713f, -0.704f)
                lineToRelative(7.686f, -7.792f)
                lineToRelative(0.355f, -0.36f)
                close()
                moveTo(33.001f, 33.783f)
                lineTo(39.834f, 26.855f)
                lineTo(40.189f, 27.205f)
                lineTo(40.545f, 27.555f)
                lineTo(32.862f, 35.351f)
                lineTo(32.506f, 35.711f)
                lineTo(32.15f, 35.351f)
                lineTo(24.444f, 27.563f)
                lineTo(25.154f, 26.859f)
                lineTo(32.001f, 33.777f)
                lineTo(32.001f, 10.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _arrowsUpDownLarge!!
    }

private var _arrowsUpDownLarge: ImageVector? = null
