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

public val SBBIcons.ChevronRightUpSmall: ImageVector
    get() {
        if (_chevronRightUpSmall != null) {
            return _chevronRightUpSmall!!
        }
        _chevronRightUpSmall = Builder(name = "ChevronRightUpSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.996f, 8.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _chevronRightUpSmall!!
    }

private var _chevronRightUpSmall: ImageVector? = null
