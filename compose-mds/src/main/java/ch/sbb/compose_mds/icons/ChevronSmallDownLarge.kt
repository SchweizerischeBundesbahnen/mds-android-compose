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

public val SBBIcons.ChevronSmallDownLarge: ImageVector
    get() {
        if (_chevronSmallDownLarge != null) {
            return _chevronSmallDownLarge!!
        }
        _chevronSmallDownLarge = Builder(name = "ChevronSmallDownLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.493f, 27.389f)
                lineToRelative(7.453f, -7.537f)
                lineToRelative(0.71f, 0.703f)
                lineToRelative(-7.808f, 7.897f)
                lineToRelative(-0.355f, 0.36f)
                lineToRelative(-0.356f, -0.36f)
                lineToRelative(-7.808f, -7.9f)
                lineToRelative(0.712f, -0.704f)
                close()
            }
        }
        .build()
        return _chevronSmallDownLarge!!
    }

private var _chevronSmallDownLarge: ImageVector? = null
