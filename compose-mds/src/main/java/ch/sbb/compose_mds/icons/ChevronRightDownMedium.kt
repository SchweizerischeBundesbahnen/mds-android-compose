package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.ChevronRightDownMedium: ImageVector
    get() {
        if (_chevronRightDownMedium != null) {
            return _chevronRightDownMedium!!
        }
        _chevronRightDownMedium = Builder(name = "ChevronRightDownMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(28.0f, 28.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(19.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _chevronRightDownMedium!!
    }

private var _chevronRightDownMedium: ImageVector? = null
