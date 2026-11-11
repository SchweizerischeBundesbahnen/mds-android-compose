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

public val SBBIcons.ParagraphMedium: ImageVector
    get() {
        if (_paragraphMedium != null) {
            return _paragraphMedium!!
        }
        _paragraphMedium = Builder(name = "ParagraphMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.484f, 3.309f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -5.4f, 3.078f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 1.771f, 5.959f)
                verticalLineToRelative(-0.001f)
                lineToRelative(0.118f, 0.083f)
                arcToRelative(4.999f, 4.999f, 0.0f, false, false, -1.547f, 8.915f)
                lineToRelative(4.412f, 3.129f)
                lineToRelative(0.003f, 0.002f)
                lineToRelative(0.18f, 0.133f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -5.939f, 5.143f)
                lineToRelative(-0.865f, 0.5f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, 7.423f, -6.429f)
                lineToRelative(-0.226f, -0.167f)
                lineToRelative(-0.117f, -0.083f)
                arcToRelative(5.002f, 5.002f, 0.0f, false, false, 1.544f, -8.917f)
                lineToRelative(-4.41f, -3.126f)
                lineToRelative(-0.002f, -0.002f)
                lineToRelative(-0.18f, -0.133f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 16.02f, 5.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.166f, 0.949f)
                lineToRelative(0.866f, -0.5f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -3.569f, -2.441f)
                moveToRelative(-1.35f, 19.438f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.133f, -7.273f)
                lineToRelative(-0.002f, -0.002f)
                lineToRelative(-3.128f, -2.219f)
                arcToRelative(4.001f, 4.001f, 0.0f, false, false, -2.135f, 7.273f)
                lineToRelative(0.003f, 0.002f)
                close()
            }
        }
        .build()
        return _paragraphMedium!!
    }

private var _paragraphMedium: ImageVector? = null
