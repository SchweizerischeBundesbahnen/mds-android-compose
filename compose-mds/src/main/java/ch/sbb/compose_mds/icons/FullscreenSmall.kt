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

public val SBBIcons.FullscreenSmall: ImageVector
    get() {
        if (_fullscreenSmall != null) {
            return _fullscreenSmall!!
        }
        _fullscreenSmall = Builder(name = "FullscreenSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.5f, 2.0f)
                lineTo(2.0f, 2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(1.0f)
                lineTo(3.0f, 3.0f)
                horizontalLineToRelative(5.0f)
                lineTo(8.0f, 2.0f)
                close()
                moveTo(16.0f, 3.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(1.0f)
                lineTo(22.0f, 2.0f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(21.0f, 21.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(3.0f, 16.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.0f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(-6.0f)
                close()
            }
        }
        .build()
        return _fullscreenSmall!!
    }

private var _fullscreenSmall: ImageVector? = null
