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

public val SBBIcons.ChevronSmallEndRightLarge: ImageVector
    get() {
        if (_chevronSmallEndRightLarge != null) {
            return _chevronSmallEndRightLarge!!
        }
        _chevronSmallEndRightLarge = Builder(name = "ChevronSmallEndRightLarge", defaultWidth =
                48.0.dp, defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight =
                48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.402f, 23.144f)
                lineToRelative(0.36f, 0.356f)
                lineToRelative(-0.36f, 0.356f)
                lineToRelative(-7.9f, 7.808f)
                lineToRelative(-0.704f, -0.711f)
                lineToRelative(7.54f, -7.454f)
                lineToRelative(-7.538f, -7.451f)
                lineToRelative(0.704f, -0.711f)
                close()
                moveTo(32.0f, 30.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(17.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _chevronSmallEndRightLarge!!
    }

private var _chevronSmallEndRightLarge: ImageVector? = null
