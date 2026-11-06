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

public val SBBIcons.ChevronLeftUpMedium: ImageVector
    get() {
        if (_chevronLeftUpMedium != null) {
            return _chevronLeftUpMedium!!
        }
        _chevronLeftUpMedium = Builder(name = "ChevronLeftUpMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 9.0f)
                verticalLineToRelative(19.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _chevronLeftUpMedium!!
    }

private var _chevronLeftUpMedium: ImageVector? = null
