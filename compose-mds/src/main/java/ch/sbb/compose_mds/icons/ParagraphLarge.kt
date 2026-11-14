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

public val SBBIcons.ParagraphLarge: ImageVector
    get() {
        if (_paragraphLarge != null) {
            return _paragraphLarge!!
        }
        _paragraphLarge = Builder(name = "ParagraphLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.077f, 4.78f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 5.557f, 0.855f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 1.959f, 2.115f)
                lineTo(30.16f, 8.0f)
                lineToRelative(-0.433f, 0.25f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, -8.166f, 7.071f)
                lineToRelative(0.249f, 0.184f)
                lineToRelative(0.002f, 0.002f)
                lineToRelative(5.882f, 4.17f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 0.114f, 10.565f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, -2.473f, 1.11f)
                lineToRelative(0.458f, 0.325f)
                horizontalLineToRelative(-0.001f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, true, -9.358f, 8.573f)
                lineToRelative(0.865f, -0.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 6.36f, 2.514f)
                arcToRelative(5.504f, 5.504f, 0.0f, false, false, 3.197f, -7.962f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -1.64f, -1.807f)
                lineToRelative(-0.001f, -0.002f)
                lineToRelative(-5.883f, -4.17f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 2.358f, -11.677f)
                lineToRelative(-0.457f, -0.323f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, -2.301f, -7.745f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 4.145f, -3.798f)
                moveToRelative(-0.179f, 12.723f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -5.082f, 3.843f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 2.091f, 6.159f)
                lineToRelative(0.003f, 0.002f)
                lineToRelative(4.218f, 2.989f)
                arcToRelative(5.498f, 5.498f, 0.0f, false, false, 2.99f, -10.001f)
                lineToRelative(-0.002f, -0.002f)
                close()
            }
        }
        .build()
        return _paragraphLarge!!
    }

private var _paragraphLarge: ImageVector? = null
