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
        _paragraphSmall = Builder(
            name = "ParagraphSmall",
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
                moveTo(11.756f, 3.108f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.891f, 1.142f)
                lineToRelative(0.866f, -0.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, -5.224f, 4.478f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -0.767f, 6.138f)
                lineToRelative(2.94f, 2.084f)
                lineToRelative(0.003f, 0.002f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -3.599f, 3.298f)
                lineToRelative(-0.866f, 0.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 5.224f, -4.478f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 2.096f, -2.22f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -1.33f, -3.918f)
                lineTo(11.05f, 7.55f)
                lineToRelative(-0.002f, -0.002f)
                arcToRelative(2.499f, 2.499f, 0.0f, false, true, 0.708f, -4.44f)
                moveToRelative(0.383f, 11.887f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 1.277f, -4.543f)
                lineToRelative(-0.002f, -0.002f)
                lineToRelative(-2.04f, -1.445f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -1.277f, 4.543f)
                lineToRelative(0.002f, 0.002f)
                close()
            }
        }
            .build()
        return _paragraphSmall!!
    }

private var _paragraphSmall: ImageVector? = null
