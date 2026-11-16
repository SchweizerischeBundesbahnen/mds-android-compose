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

public val SBBIcons.ArrowsUpDownMedium: ImageVector
    get() {
        if (_arrowsUpDownMedium != null) {
            return _arrowsUpDownMedium!!
        }
        _arrowsUpDownMedium = Builder(name = "ArrowsUpDownMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(25.25f, 24.658f)
                lineToRelative(4.91f, -4.98f)
                lineToRelative(0.713f, 0.701f)
                lineToRelative(-5.763f, 5.846f)
                lineToRelative(-0.357f, -0.352f)
                verticalLineToRelative(0.002f)
                lineToRelative(0.357f, 0.35f)
                lineToRelative(-0.356f, 0.36f)
                lineToRelative(-0.356f, -0.359f)
                lineToRelative(-5.78f, -5.84f)
                lineToRelative(0.712f, -0.705f)
                lineToRelative(4.92f, 4.974f)
                lineTo(24.25f, 7.5f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(17.384f, 14.114f)
                lineTo(11.606f, 8.274f)
                lineTo(11.249f, 7.914f)
                lineTo(10.894f, 8.274f)
                lineTo(5.129f, 14.118f)
                lineTo(5.842f, 14.82f)
                lineTo(10.75f, 9.843f)
                lineTo(10.75f, 27.0f)
                horizontalLineToRelative(1.0f)
                lineTo(11.75f, 9.84f)
                lineToRelative(4.923f, 4.977f)
                close()
            }
        }
        .build()
        return _arrowsUpDownMedium!!
    }

private var _arrowsUpDownMedium: ImageVector? = null
