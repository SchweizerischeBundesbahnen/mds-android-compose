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

public val SBBIcons.ChevronSmallLeftSmall: ImageVector
    get() {
        if (_chevronSmallLeftSmall != null) {
            return _chevronSmallLeftSmall!!
        }
        _chevronSmallLeftSmall = Builder(name = "ChevronSmallLeftSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.027f, 8.451f)
                lineToRelative(-3.591f, 3.55f)
                lineToRelative(3.589f, 3.547f)
                lineToRelative(-0.703f, 0.711f)
                lineToRelative(-3.949f, -3.903f)
                lineToRelative(-0.36f, -0.356f)
                lineToRelative(0.36f, -0.355f)
                lineToRelative(3.95f, -3.905f)
                close()
            }
        }
        .build()
        return _chevronSmallLeftSmall!!
    }

private var _chevronSmallLeftSmall: ImageVector? = null
