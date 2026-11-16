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

public val SBBIcons.MusicNotesLarge: ImageVector
    get() {
        if (_musicNotesLarge != null) {
            return _musicNotesLarge!!
        }
        _musicNotesLarge = Builder(name = "MusicNotesLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(14.0f, 2.988f)
                lineToRelative(-0.001f, -0.012f)
                verticalLineToRelative(-0.004f)
                lineTo(13.0f, 3.0f)
                verticalLineToRelative(22.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, 1.0f, 3.0f)
                verticalLineTo(6.47f)
                curveToRelative(0.385f, 0.524f, 0.864f, 0.975f, 1.418f, 1.325f)
                curveToRelative(3.435f, 2.194f, 4.549f, 4.694f, 4.556f, 7.214f)
                curveToRelative(0.007f, 2.578f, -1.141f, 5.252f, -2.42f, 7.764f)
                lineToRelative(0.891f, 0.454f)
                curveToRelative(1.28f, -2.515f, 2.536f, -5.38f, 2.529f, -8.221f)
                curveToRelative(-0.008f, -2.899f, -1.33f, -5.698f, -5.018f, -8.053f)
                horizontalLineToRelative(-0.002f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, -1.523f, -1.683f)
                curveToRelative(-0.152f, -0.304f, -0.266f, -0.852f, -0.34f, -1.381f)
                arcToRelative(13.0f, 13.0f, 0.0f, false, true, -0.087f, -0.849f)
                lineToRelative(-0.002f, -0.03f)
                close()
                moveTo(9.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 0.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                moveToRelative(13.0f, 12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 0.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                moveToRelative(0.0f, -1.0f)
                curveToRelative(1.636f, 0.0f, 3.088f, 0.785f, 4.0f, 2.0f)
                verticalLineTo(18.08f)
                lineToRelative(0.413f, -0.072f)
                lineToRelative(17.0f, -3.0f)
                lineToRelative(0.587f, -0.104f)
                verticalLineTo(36.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, -1.0f, -3.0f)
                verticalLineTo(20.095f)
                lineToRelative(-16.0f, 2.823f)
                verticalLineTo(40.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, -5.0f, -5.0f)
                moveToRelative(5.0f, -13.096f)
                lineToRelative(16.0f, -2.823f)
                verticalLineToRelative(-2.985f)
                lineToRelative(-16.0f, 2.823f)
                close()
                moveTo(39.0f, 32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 0.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
            }
        }
        .build()
        return _musicNotesLarge!!
    }

private var _musicNotesLarge: ImageVector? = null
