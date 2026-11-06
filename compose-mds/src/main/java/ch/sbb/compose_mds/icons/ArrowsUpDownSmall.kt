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

public val SBBIcons.ArrowsUpDownSmall: ImageVector
    get() {
        if (_arrowsUpDownSmall != null) {
            return _arrowsUpDownSmall!!
        }
        _arrowsUpDownSmall = Builder(name = "ArrowsUpDownSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.0f, 16.033f)
                lineTo(19.988f, 13.0f)
                lineToRelative(0.713f, 0.703f)
                lineToRelative(-3.843f, 3.896f)
                lineToRelative(-0.355f, 0.361f)
                lineToRelative(-0.356f, -0.36f)
                lineToRelative(-3.853f, -3.894f)
                lineToRelative(0.71f, -0.703f)
                lineTo(16.0f, 16.03f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(7.856f, 5.398f)
                lineToRelative(-0.356f, -0.36f)
                lineToRelative(-0.356f, 0.36f)
                lineToRelative(-3.843f, 3.897f)
                lineToRelative(0.712f, 0.702f)
                lineTo(7.0f, 6.97f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(6.966f)
                lineToRelative(2.997f, 3.03f)
                lineToRelative(0.71f, -0.704f)
                close()
            }
        }
        .build()
        return _arrowsUpDownSmall!!
    }

private var _arrowsUpDownSmall: ImageVector? = null
