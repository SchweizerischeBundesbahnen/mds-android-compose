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

public val SBBIcons.SuitcaseSmall: ImageVector
    get() {
        if (_suitcaseSmall != null) {
            return _suitcaseSmall!!
        }
        _suitcaseSmall = Builder(name = "SuitcaseSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.5f, 4.009f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(13.99f)
                horizontalLineToRelative(18.0f)
                verticalLineTo(7.01f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineTo(9.5f)
                moveToRelative(4.5f, 3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(4.0f, 19.999f)
                verticalLineTo(8.01f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(11.99f)
                close()
            }
        }
        .build()
        return _suitcaseSmall!!
    }

private var _suitcaseSmall: ImageVector? = null
