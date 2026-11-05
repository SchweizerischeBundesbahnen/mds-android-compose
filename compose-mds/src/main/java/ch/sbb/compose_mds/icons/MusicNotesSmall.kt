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

public val SBBIcons.MusicNotesSmall: ImageVector
    get() {
        if (_musicNotesSmall != null) {
            return _musicNotesSmall!!
        }
        _musicNotesSmall = Builder(
            name = "MusicNotesSmall",
            defaultWidth = 24.0.dp,
            defaultHeight =
                24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveTo(20.0f, 1.9f)
                verticalLineToRelative(13.6f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -1.0f, -2.45f)
                lineTo(19.0f, 6.1f)
                lineTo(9.0f, 7.916f)
                lineTo(9.0f, 18.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -1.0f, -2.45f)
                lineTo(8.0f, 4.083f)
                lineToRelative(0.41f, -0.075f)
                lineToRelative(11.0f, -2.0f)
                close()
                moveTo(9.0f, 6.9f)
                lineTo(19.0f, 5.083f)
                lineTo(19.0f, 3.099f)
                lineTo(9.0f, 4.917f)
                close()
                moveTo(5.5f, 16.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, -5.0f)
                moveToRelative(8.5f, -0.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -5.0f, 0.0f)
            }
        }
            .build()
        return _musicNotesSmall!!
    }

private var _musicNotesSmall: ImageVector? = null
