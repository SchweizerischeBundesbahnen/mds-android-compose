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

public val SBBIcons.ChevronRightDownLarge: ImageVector
    get() {
        if (_chevronRightDownLarge != null) {
            return _chevronRightDownLarge!!
        }
        _chevronRightDownLarge = Builder(name = "ChevronRightDownLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(34.0f, 34.0f)
                horizontalLineTo(14.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(19.0f)
                verticalLineTo(14.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _chevronRightDownLarge!!
    }

private var _chevronRightDownLarge: ImageVector? = null
