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

public val SBBIcons.MagnifyingGlassPlusSmall: ImageVector
    get() {
        if (_magnifyingGlassPlusSmall != null) {
            return _magnifyingGlassPlusSmall!!
        }
        _magnifyingGlassPlusSmall = Builder(name = "MagnifyingGlassPlusSmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 10.5f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, true, 13.0f, 0.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, -13.0f, 0.0f)
                moveTo(9.5f, 3.0f)
                arcToRelative(7.5f, 7.5f, 0.0f, true, false, 5.022f, 13.07f)
                lineToRelative(6.151f, 5.308f)
                lineToRelative(0.654f, -0.757f)
                lineToRelative(-6.107f, -5.27f)
                arcTo(7.5f, 7.5f, 0.0f, false, false, 9.5f, 3.0f)
                moveTo(5.0f, 11.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _magnifyingGlassPlusSmall!!
    }

private var _magnifyingGlassPlusSmall: ImageVector? = null
