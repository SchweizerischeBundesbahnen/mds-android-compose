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

public val SBBIcons.LinkMedium: ImageVector
    get() {
        if (_linkMedium != null) {
            return _linkMedium!!
        }
        _linkMedium = Builder(name = "LinkMedium", defaultWidth = 36.0.dp, defaultHeight = 36.0.dp,
                viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(28.03f, 6.952f)
                arcToRelative(4.96f, 4.96f, 0.0f, false, false, -7.02f, 0.007f)
                lineToRelative(-0.1f, 0.1f)
                lineToRelative(-0.099f, 0.099f)
                lineToRelative(-0.54f, 0.54f)
                lineToRelative(-0.573f, 0.573f)
                lineTo(18.48f, 9.49f)
                lineToRelative(-1.182f, 1.183f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(1.18f, -1.182f)
                lineToRelative(2.332f, -2.332f)
                lineToRelative(0.098f, -0.098f)
                lineToRelative(0.101f, -0.101f)
                arcToRelative(3.96f, 3.96f, 0.0f, false, true, 5.613f, 0.0f)
                lineToRelative(0.008f, 0.008f)
                lineToRelative(1.104f, 1.06f)
                arcToRelative(3.97f, 3.97f, 0.0f, false, true, 0.002f, 5.613f)
                horizontalLineToRelative(-0.001f)
                lineToRelative(-6.373f, 6.4f)
                arcToRelative(4.01f, 4.01f, 0.0f, false, true, -5.656f, 0.0f)
                lineToRelative(-1.06f, -1.06f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(1.06f, 1.06f)
                arcToRelative(5.013f, 5.013f, 0.0f, false, false, 6.885f, 0.177f)
                lineToRelative(0.186f, -0.177f)
                lineToRelative(6.373f, -6.401f)
                lineToRelative(-0.001f, -0.001f)
                arcToRelative(4.965f, 4.965f, 0.0f, false, false, 0.169f, -6.847f)
                lineToRelative(-0.177f, -0.185f)
                lineToRelative(-0.007f, -0.007f)
                close()
                moveTo(27.338f, 7.674f)
                lineTo(27.684f, 7.312f)
                lineTo(27.707f, 7.288f)
                close()
                moveTo(6.467f, 27.723f)
                arcToRelative(4.014f, 4.014f, 0.0f, false, true, 0.0f, -5.657f)
                lineToRelative(-0.707f, -0.708f)
                lineToRelative(0.353f, 0.353f)
                lineToRelative(0.354f, 0.354f)
                lineTo(12.83f, 15.7f)
                lineToRelative(0.149f, -0.14f)
                arcToRelative(4.017f, 4.017f, 0.0f, false, true, 5.508f, 0.14f)
                lineToRelative(1.06f, 1.063f)
                lineToRelative(0.709f, -0.707f)
                lineToRelative(-1.06f, -1.063f)
                lineToRelative(-0.709f, 0.707f)
                lineToRelative(0.354f, -0.353f)
                lineToRelative(0.353f, -0.354f)
                arcToRelative(5.016f, 5.016f, 0.0f, false, false, -7.071f, 0.0f)
                lineTo(5.76f, 21.359f)
                arcToRelative(5.014f, 5.014f, 0.0f, false, false, 0.0f, 7.072f)
                lineToRelative(1.06f, 1.06f)
                lineToRelative(0.187f, 0.177f)
                curveToRelative(1.957f, 1.766f, 5.0f, 1.707f, 6.884f, -0.176f)
                lineToRelative(3.72f, -3.721f)
                lineToRelative(-0.708f, -0.707f)
                lineToRelative(-3.72f, 3.72f)
                arcToRelative(4.015f, 4.015f, 0.0f, false, true, -5.656f, 0.0f)
                close()
            }
        }
        .build()
        return _linkMedium!!
    }

private var _linkMedium: ImageVector? = null
