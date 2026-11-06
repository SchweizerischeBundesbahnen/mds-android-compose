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

public val SBBIcons.DeskMedium: ImageVector
    get() {
        if (_deskMedium != null) {
            return _deskMedium!!
        }
        _deskMedium = Builder(name = "DeskMedium", defaultWidth = 36.0.dp, defaultHeight = 36.0.dp,
                viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.25f, 15.249f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(16.25f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-12.25f)
                horizontalLineToRelative(24.5f)
                verticalLineToRelative(12.25f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-16.25f)
                horizontalLineToRelative(-26.0f)
                moveToRelative(25.0f, 3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(5.75f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _deskMedium!!
    }

private var _deskMedium: ImageVector? = null
