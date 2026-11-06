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

public val SBBIcons.PaperAeroplaneMedium: ImageVector
    get() {
        if (_paperAeroplaneMedium != null) {
            return _paperAeroplaneMedium!!
        }
        _paperAeroplaneMedium = Builder(name = "PaperAeroplaneMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(29.836f, 5.885f)
                lineToRelative(-0.088f, 0.913f)
                lineToRelative(-2.25f, 23.25f)
                lineToRelative(-0.084f, 0.862f)
                lineToRelative(-0.705f, -0.504f)
                lineToRelative(-7.091f, -5.065f)
                lineToRelative(-2.68f, 4.882f)
                lineTo(16.0f, 31.932f)
                lineTo(16.0f, 22.89f)
                lineTo(4.379f, 19.985f)
                lineToRelative(-1.288f, -0.322f)
                lineToRelative(1.18f, -0.608f)
                lineToRelative(24.75f, -12.75f)
                close()
                moveTo(17.0f, 23.471f)
                lineToRelative(1.798f, 1.285f)
                lineTo(17.0f, 28.032f)
                close()
                moveTo(17.223f, 22.401f)
                lineTo(28.593f, 8.357f)
                lineTo(26.586f, 29.089f)
                close()
                moveTo(16.312f, 21.937f)
                lineTo(5.909f, 19.337f)
                lineTo(27.366f, 8.282f)
                close()
            }
        }
        .build()
        return _paperAeroplaneMedium!!
    }

private var _paperAeroplaneMedium: ImageVector? = null
