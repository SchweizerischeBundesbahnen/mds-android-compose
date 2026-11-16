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

public val SBBIcons.ChevronLeftUpSmall: ImageVector
    get() {
        if (_chevronLeftUpSmall != null) {
            return _chevronLeftUpSmall!!
        }
        _chevronLeftUpSmall = Builder(name = "ChevronLeftUpSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.997f, 8.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(10.0f)
                close()
            }
        }
        .build()
        return _chevronLeftUpSmall!!
    }

private var _chevronLeftUpSmall: ImageVector? = null
