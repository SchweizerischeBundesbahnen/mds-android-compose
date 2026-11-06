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

public val SBBIcons.MagnifyingGlassMinusSmall: ImageVector
    get() {
        if (_magnifyingGlassMinusSmall != null) {
            return _magnifyingGlassMinusSmall!!
        }
        _magnifyingGlassMinusSmall = Builder(name = "MagnifyingGlassMinusSmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.5f, 4.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, false, 0.0f, 13.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, 0.0f, -13.0f)
                moveTo(2.0f, 10.5f)
                arcToRelative(7.5f, 7.5f, 0.0f, true, true, 13.22f, 4.852f)
                lineToRelative(6.107f, 5.27f)
                lineToRelative(-0.654f, 0.756f)
                lineToRelative(-6.15f, -5.307f)
                arcTo(7.5f, 7.5f, 0.0f, false, true, 2.0f, 10.5f)
                moveToRelative(12.0f, 0.5f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(9.0f)
                close()
            }
        }
        .build()
        return _magnifyingGlassMinusSmall!!
    }

private var _magnifyingGlassMinusSmall: ImageVector? = null
