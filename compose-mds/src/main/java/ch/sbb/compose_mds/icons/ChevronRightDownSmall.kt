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

public val SBBIcons.ChevronRightDownSmall: ImageVector
    get() {
        if (_chevronRightDownSmall != null) {
            return _chevronRightDownSmall!!
        }
        _chevronRightDownSmall = Builder(name = "ChevronRightDownSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 17.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(9.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _chevronRightDownSmall!!
    }

private var _chevronRightDownSmall: ImageVector? = null
