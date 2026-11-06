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

public val SBBIcons.ChevronSmallDownFlatSmall: ImageVector
    get() {
        if (_chevronSmallDownFlatSmall != null) {
            return _chevronSmallDownFlatSmall!!
        }
        _chevronSmallDownFlatSmall = Builder(name = "ChevronSmallDownFlatSmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(16.175f, 11.968f)
                lineToRelative(-4.003f, 1.5f)
                lineToRelative(-0.176f, 0.066f)
                lineToRelative(-0.175f, -0.066f)
                lineToRelative(-3.997f, -1.5f)
                lineToRelative(0.352f, -0.936f)
                lineToRelative(3.82f, 1.434f)
                lineToRelative(3.829f, -1.434f)
                close()
            }
        }
        .build()
        return _chevronSmallDownFlatSmall!!
    }

private var _chevronSmallDownFlatSmall: ImageVector? = null
