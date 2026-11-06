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

public val SBBIcons.ChevronSmallDownFlatLarge: ImageVector
    get() {
        if (_chevronSmallDownFlatLarge != null) {
            return _chevronSmallDownFlatLarge!!
        }
        _chevronSmallDownFlatLarge = Builder(name = "ChevronSmallDownFlatLarge", defaultWidth =
                48.0.dp, defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight =
                48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(31.676f, 22.968f)
                lineToRelative(-8.008f, 3.0f)
                lineToRelative(-0.175f, 0.066f)
                lineToRelative(-0.176f, -0.066f)
                lineToRelative(-7.993f, -3.0f)
                lineToRelative(0.352f, -0.936f)
                lineToRelative(7.817f, 2.934f)
                lineToRelative(7.831f, -2.934f)
                close()
            }
        }
        .build()
        return _chevronSmallDownFlatLarge!!
    }

private var _chevronSmallDownFlatLarge: ImageVector? = null
