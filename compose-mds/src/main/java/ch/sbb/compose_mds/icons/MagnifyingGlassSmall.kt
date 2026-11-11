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

public val SBBIcons.MagnifyingGlassSmall: ImageVector
    get() {
        if (_magnifyingGlassSmall != null) {
            return _magnifyingGlassSmall!!
        }
        _magnifyingGlassSmall = Builder(name = "MagnifyingGlassSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.5f, 4.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, true, 0.0f, 13.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 0.0f, -13.0f)
                moveToRelative(5.72f, 11.352f)
                arcToRelative(7.5f, 7.5f, 0.0f, true, false, -0.697f, 0.719f)
                lineToRelative(6.15f, 5.307f)
                lineToRelative(0.654f, -0.756f)
                close()
            }
        }
        .build()
        return _magnifyingGlassSmall!!
    }

private var _magnifyingGlassSmall: ImageVector? = null
