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
                moveTo(16.0f, 10.5f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, false, -13.0f, 0.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, 13.0f, 0.0f)
                moveToRelative(-1.478f, 5.57f)
                arcTo(7.5f, 7.5f, 0.0f, false, true, 2.0f, 10.5f)
                arcToRelative(7.5f, 7.5f, 0.0f, true, true, 13.22f, 4.852f)
                lineToRelative(6.107f, 5.27f)
                lineToRelative(-0.653f, 0.756f)
                close()
                moveTo(14.0f, 10.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _magnifyingGlassMinusSmall!!
    }

private var _magnifyingGlassMinusSmall: ImageVector? = null
