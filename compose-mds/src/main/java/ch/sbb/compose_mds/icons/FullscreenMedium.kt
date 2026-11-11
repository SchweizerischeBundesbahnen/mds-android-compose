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

public val SBBIcons.FullscreenMedium: ImageVector
    get() {
        if (_fullscreenMedium != null) {
            return _fullscreenMedium!!
        }
        _fullscreenMedium = Builder(name = "FullscreenMedium", defaultWidth = 36.0.dp, defaultHeight
                = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 4.25f)
                verticalLineToRelative(-1.0f)
                lineTo(3.25f, 3.25f)
                lineTo(3.25f, 12.0f)
                horizontalLineToRelative(1.0f)
                lineTo(4.25f, 4.25f)
                close()
                moveTo(32.75f, 12.0f)
                lineTo(32.75f, 3.25f)
                lineTo(24.0f, 3.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(7.75f)
                lineTo(31.75f, 12.0f)
                close()
                moveTo(32.75f, 24.0f)
                verticalLineToRelative(8.75f)
                lineTo(24.0f, 32.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(7.75f)
                lineTo(31.75f, 24.0f)
                close()
                moveTo(4.25f, 31.75f)
                lineTo(4.25f, 24.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(8.75f)
                lineTo(12.0f, 32.75f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _fullscreenMedium!!
    }

private var _fullscreenMedium: ImageVector? = null
