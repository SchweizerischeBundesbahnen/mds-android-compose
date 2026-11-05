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

public val SBBIcons.PauseSmall: ImageVector
    get() {
        if (_pauseSmall != null) {
            return _pauseSmall!!
        }
        _pauseSmall = Builder(name = "PauseSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.5f, 5.0f)
                lineTo(7.0f, 5.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(4.0f)
                lineTo(11.0f, 5.0f)
                lineTo(7.5f, 5.0f)
                moveTo(8.0f, 18.0f)
                lineTo(8.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(12.0f)
                close()
                moveTo(13.501f, 5.0f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(4.0f)
                lineTo(17.001f, 5.0f)
                horizontalLineToRelative(-3.5f)
                moveToRelative(0.5f, 13.0f)
                lineTo(14.001f, 6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(12.0f)
                close()
            }
        }
        .build()
        return _pauseSmall!!
    }

private var _pauseSmall: ImageVector? = null
