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

public val SBBIcons.ChevronSmallUpLarge: ImageVector
    get() {
        if (_chevronSmallUpLarge != null) {
            return _chevronSmallUpLarge!!
        }
        _chevronSmallUpLarge = Builder(name = "ChevronSmallUpLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.85f, 19.597f)
                lineToRelative(7.807f, 7.9f)
                lineToRelative(-0.711f, 0.704f)
                lineToRelative(-7.454f, -7.541f)
                lineToRelative(-7.451f, 7.539f)
                lineToRelative(-0.712f, -0.703f)
                lineToRelative(7.808f, -7.899f)
                lineToRelative(0.356f, -0.359f)
                close()
            }
        }
        .build()
        return _chevronSmallUpLarge!!
    }

private var _chevronSmallUpLarge: ImageVector? = null
