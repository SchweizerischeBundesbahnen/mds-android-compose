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

public val SBBIcons.PinSmall: ImageVector
    get() {
        if (_pinSmall != null) {
            return _pinSmall!!
        }
        _pinSmall = Builder(name = "PinSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.5f, 5.0f)
                horizontalLineToRelative(-0.677f)
                lineToRelative(0.2f, 0.647f)
                lineToRelative(1.972f, 6.41f)
                lineToRelative(-0.253f, 3.406f)
                lineToRelative(-0.04f, 0.537f)
                horizontalLineTo(11.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.787f)
                lineToRelative(-0.038f, -0.536f)
                lineToRelative(-0.243f, -3.406f)
                lineToRelative(1.972f, -6.411f)
                lineToRelative(0.2f, -0.647f)
                horizontalLineTo(7.5f)
                moveToRelative(2.478f, 6.853f)
                lineTo(8.178f, 6.0f)
                horizontalLineToRelative(7.645f)
                lineToRelative(-1.8f, 5.853f)
                lineToRelative(-0.028f, 0.09f)
                lineToRelative(0.007f, 0.093f)
                lineToRelative(0.211f, 2.964f)
                horizontalLineTo(9.78f)
                lineToRelative(0.22f, -2.963f)
                lineToRelative(0.007f, -0.094f)
                close()
            }
        }
        .build()
        return _pinSmall!!
    }

private var _pinSmall: ImageVector? = null
