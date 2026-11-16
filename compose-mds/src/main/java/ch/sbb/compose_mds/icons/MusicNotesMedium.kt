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

public val SBBIcons.MusicNotesMedium: ImageVector
    get() {
        if (_musicNotesMedium != null) {
            return _musicNotesMedium!!
        }
        _musicNotesMedium = Builder(name = "MusicNotesMedium", defaultWidth = 36.0.dp, defaultHeight
                = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(29.75f, 3.151f)
                lineTo(29.75f, 23.25f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, -1.0f, -3.0f)
                lineTo(28.75f, 8.85f)
                lineToRelative(-15.5f, 2.818f)
                lineTo(13.25f, 27.75f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, -1.0f, -3.0f)
                lineTo(12.25f, 6.333f)
                lineToRelative(0.41f, -0.075f)
                lineToRelative(16.5f, -3.0f)
                close()
                moveTo(13.25f, 10.651f)
                lineTo(28.75f, 7.832f)
                lineTo(28.75f, 4.35f)
                lineToRelative(-15.5f, 2.818f)
                close()
                moveTo(24.75f, 19.25f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 0.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                moveToRelative(-16.5f, 4.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 0.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
            }
        }
        .build()
        return _musicNotesMedium!!
    }

private var _musicNotesMedium: ImageVector? = null
