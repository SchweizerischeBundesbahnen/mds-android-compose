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

public val SBBIcons.ChevronSmallRightSmall: ImageVector
    get() {
        if (_chevronSmallRightSmall != null) {
            return _chevronSmallRightSmall!!
        }
        _chevronSmallRightSmall = Builder(name = "ChevronSmallRightSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.627f, 11.645f)
                lineToRelative(0.36f, 0.355f)
                lineToRelative(-0.36f, 0.356f)
                lineToRelative(-3.95f, 3.904f)
                lineToRelative(-0.703f, -0.712f)
                lineTo(13.564f, 12.0f)
                lineToRelative(-3.59f, -3.548f)
                lineToRelative(0.704f, -0.71f)
                close()
            }
        }
        .build()
        return _chevronSmallRightSmall!!
    }

private var _chevronSmallRightSmall: ImageVector? = null
