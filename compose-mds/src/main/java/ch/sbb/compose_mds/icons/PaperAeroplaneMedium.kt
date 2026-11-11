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
                moveToRelative(29.748f, 6.797f)
                lineToRelative(-2.25f, 23.25f)
                lineToRelative(-0.084f, 0.863f)
                lineToRelative(-0.705f, -0.503f)
                lineToRelative(-7.092f, -5.065f)
                lineToRelative(-2.679f, 4.88f)
                lineToRelative(-0.437f, -0.24f)
                lineTo(16.5f, 29.982f)
                lineToRelative(0.438f, 0.24f)
                lineToRelative(-0.938f, 1.71f)
                lineTo(16.0f, 22.89f)
                lineTo(4.379f, 19.985f)
                lineToRelative(-1.287f, -0.322f)
                lineToRelative(1.18f, -0.608f)
                lineToRelative(24.75f, -12.75f)
                lineToRelative(0.814f, -0.42f)
                close()
                moveTo(17.0f, 23.472f)
                lineToRelative(1.798f, 1.284f)
                lineTo(17.0f, 28.031f)
                close()
                moveTo(17.223f, 22.401f)
                lineTo(28.591f, 8.358f)
                lineToRelative(-2.006f, 20.73f)
                close()
                moveTo(16.313f, 21.937f)
                lineTo(5.907f, 19.335f)
                lineTo(27.368f, 8.28f)
                close()
            }
        }
        .build()
        return _paperAeroplaneMedium!!
    }

private var _paperAeroplaneMedium: ImageVector? = null
