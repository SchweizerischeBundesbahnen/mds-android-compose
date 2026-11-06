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

public val SBBIcons.ChevronUpSmall: ImageVector
    get() {
        if (_chevronUpSmall != null) {
            return _chevronUpSmall!!
        }
        _chevronUpSmall = Builder(name = "ChevronUpSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(12.0f, 7.293f)
                lineToRelative(0.354f, 0.353f)
                lineToRelative(8.0f, 8.0f)
                lineToRelative(-0.707f, 0.708f)
                lineTo(12.0f, 8.707f)
                lineToRelative(-7.646f, 7.647f)
                lineToRelative(-0.708f, -0.707f)
                lineToRelative(8.0f, -8.0f)
                close()
            }
        }
        .build()
        return _chevronUpSmall!!
    }

private var _chevronUpSmall: ImageVector? = null
