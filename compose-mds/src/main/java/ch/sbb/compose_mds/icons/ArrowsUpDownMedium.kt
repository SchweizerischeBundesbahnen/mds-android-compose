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
        _arrowsUpDownMedium = Builder(
            name = "ArrowsUpDownMedium",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveToRelative(25.25f, 24.659f)
                lineToRelative(4.91f, -4.981f)
                lineToRelative(0.713f, 0.702f)
                lineToRelative(-5.763f, 5.845f)
                lineToRelative(-0.356f, 0.36f)
                lineToRelative(-0.356f, -0.36f)
                lineToRelative(-5.78f, -5.84f)
                lineToRelative(0.712f, -0.703f)
                lineToRelative(4.92f, 4.972f)
                verticalLineTo(7.5f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(11.606f, 8.273f)
                lineToRelative(-0.356f, -0.36f)
                lineToRelative(-0.356f, 0.36f)
                lineToRelative(-5.764f, 5.845f)
                lineToRelative(0.712f, 0.702f)
                lineToRelative(4.908f, -4.976f)
                verticalLineTo(27.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(9.841f)
                lineToRelative(4.923f, 4.977f)
                lineToRelative(0.71f, -0.704f)
                close()
            }
        }
            .build()
        return _arrowsUpDownMedium!!
    }

private var _arrowsUpDownMedium: ImageVector? = null
