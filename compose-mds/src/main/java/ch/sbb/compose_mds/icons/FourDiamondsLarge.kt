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

public val SBBIcons.FourDiamondsLarge: ImageVector
    get() {
        if (_fourDiamondsLarge != null) {
            return _fourDiamondsLarge!!
        }
        _fourDiamondsLarge = Builder(name = "FourDiamondsLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.854f, 28.39f)
                lineToRelative(7.07f, 7.07f)
                lineToRelative(0.354f, 0.354f)
                lineToRelative(-7.777f, 7.778f)
                lineToRelative(-0.354f, -0.354f)
                lineToRelative(-7.071f, -7.07f)
                lineToRelative(-0.354f, -0.354f)
                lineToRelative(7.779f, -7.778f)
                close()
                moveTo(17.137f, 35.813f)
                lineTo(23.5f, 42.178f)
                lineTo(29.864f, 35.813f)
                lineTo(23.5f, 29.45f)
                close()
                moveTo(12.54f, 17.076f)
                lineToRelative(7.07f, 7.071f)
                lineToRelative(0.354f, 0.354f)
                lineToRelative(-7.778f, 7.777f)
                lineToRelative(-0.353f, -0.353f)
                lineToRelative(-7.072f, -7.07f)
                lineToRelative(-0.353f, -0.354f)
                lineToRelative(7.778f, -7.779f)
                close()
                moveTo(35.168f, 17.076f)
                lineTo(42.238f, 24.147f)
                lineTo(42.592f, 24.501f)
                lineTo(34.814f, 32.278f)
                lineTo(34.461f, 31.925f)
                lineTo(27.389f, 24.855f)
                lineTo(27.036f, 24.501f)
                lineTo(34.814f, 16.722f)
                close()
                moveTo(5.822f, 24.5f)
                lineToRelative(6.363f, 6.364f)
                lineTo(18.55f, 24.5f)
                lineToRelative(-6.365f, -6.363f)
                close()
                moveTo(28.45f, 24.5f)
                lineTo(34.813f, 30.864f)
                lineTo(41.178f, 24.5f)
                lineTo(34.813f, 18.137f)
                close()
                moveTo(23.854f, 5.76f)
                lineToRelative(7.07f, 7.072f)
                lineToRelative(0.354f, 0.353f)
                lineToRelative(-7.777f, 7.778f)
                lineToRelative(-0.354f, -0.354f)
                lineToRelative(-7.071f, -7.07f)
                lineToRelative(-0.354f, -0.354f)
                lineToRelative(7.779f, -7.778f)
                close()
                moveTo(17.137f, 13.184f)
                lineTo(23.5f, 19.55f)
                lineToRelative(6.364f, -6.365f)
                lineTo(23.5f, 6.822f)
                close()
            }
        }
        .build()
        return _fourDiamondsLarge!!
    }

private var _fourDiamondsLarge: ImageVector? = null
