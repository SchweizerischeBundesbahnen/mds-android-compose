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

public val SBBIcons.DeskSmall: ImageVector
    get() {
        if (_deskSmall != null) {
            return _deskSmall!!
        }
        _deskSmall = Builder(name = "DeskSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.5f, 10.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(3.5f)
                moveTo(20.0f, 12.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _deskSmall!!
    }

private var _deskSmall: ImageVector? = null
