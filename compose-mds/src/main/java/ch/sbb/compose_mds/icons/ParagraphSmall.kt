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

public val SBBIcons.ParagraphSmall: ImageVector
    get() {
        if (_paragraphSmall != null) {
            return _paragraphSmall!!
        }
        _paragraphSmall = Builder(name = "ParagraphSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.014f, 2.041f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -2.724f, 6.187f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -2.073f, 4.397f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 1.304f, 1.74f)
                lineToRelative(2.941f, 2.085f)
                lineToRelative(0.003f, 0.002f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -3.6f, 3.298f)
                lineToRelative(-0.865f, 0.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 5.224f, -4.478f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 2.073f, -4.397f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -1.308f, -1.742f)
                lineTo(11.05f, 7.55f)
                lineToRelative(-0.002f, -0.002f)
                lineToRelative(-0.113f, -0.084f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 3.712f, -3.214f)
                lineToRelative(0.866f, -0.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -2.499f, -1.709f)
                moveToRelative(-0.876f, 12.954f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, false, 1.436f, -4.423f)
                lineToRelative(-0.158f, -0.12f)
                lineToRelative(-0.002f, -0.002f)
                lineToRelative(-2.039f, -1.445f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -1.436f, 4.423f)
                lineToRelative(0.158f, 0.12f)
                lineToRelative(0.002f, 0.002f)
                close()
                moveTo(12.686f, 16.135f)
                lineTo(12.462f, 16.45f)
                lineTo(12.787f, 15.99f)
                close()
            }
        }
        .build()
        return _paragraphSmall!!
    }

private var _paragraphSmall: ImageVector? = null
