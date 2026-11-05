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
                moveTo(17.562f, 4.422f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.625f, 1.828f)
                lineToRelative(0.866f, -0.5f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, -7.199f, 6.595f)
                horizontalLineToRelative(0.001f)
                lineToRelative(0.117f, 0.084f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -3.444f, 3.317f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 1.9f, 5.599f)
                lineToRelative(4.41f, 3.127f)
                lineToRelative(0.003f, 0.001f)
                arcToRelative(3.998f, 3.998f, 0.0f, false, true, 0.408f, 6.226f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.166f, -0.949f)
                lineToRelative(-0.866f, 0.5f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, 7.199f, -6.595f)
                horizontalLineToRelative(-0.001f)
                lineToRelative(-0.117f, -0.084f)
                arcToRelative(5.002f, 5.002f, 0.0f, false, false, 1.544f, -8.916f)
                lineToRelative(-4.41f, -3.127f)
                lineToRelative(-0.003f, -0.001f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.133f, -7.105f)
                moveToRelative(0.572f, 18.325f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.134f, -7.274f)
                lineToRelative(-0.003f, -0.001f)
                lineToRelative(-3.13f, -2.219f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.133f, 7.274f)
                lineToRelative(0.003f, 0.001f)
                close()
            }
        }
        .build()
        return _paragraphMedium!!
    }

private var _paragraphMedium: ImageVector? = null
