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

public val SBBIcons.DeskAdjustableSmall: ImageVector
    get() {
        if (_deskAdjustableSmall != null) {
            return _deskAdjustableSmall!!
        }
        _deskAdjustableSmall = Builder(
            name = "DeskAdjustableSmall",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
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
                moveToRelative(18.854f, 3.346f)
                lineToRelative(-0.354f, -0.353f)
                lineToRelative(-0.354f, 0.353f)
                lineToRelative(-2.0f, 2.0f)
                lineToRelative(0.708f, 0.707f)
                lineTo(18.0f, 4.907f)
                lineTo(18.0f, 9.0f)
                horizontalLineToRelative(1.0f)
                lineTo(19.0f, 4.907f)
                lineToRelative(1.146f, 1.146f)
                lineToRelative(0.708f, -0.707f)
                close()
                moveTo(11.854f, 5.946f)
                lineTo(13.0f, 7.093f)
                lineTo(13.0f, 3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.093f)
                lineToRelative(1.146f, -1.147f)
                lineToRelative(0.708f, 0.707f)
                lineToRelative(-2.0f, 2.0f)
                lineToRelative(-0.354f, 0.354f)
                lineToRelative(-0.354f, -0.354f)
                lineToRelative(-2.0f, -2.0f)
                close()
                moveTo(3.0f, 10.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-8.0f)
                lineTo(4.0f, 13.0f)
                verticalLineToRelative(8.0f)
                lineTo(3.0f, 21.0f)
                lineTo(3.0f, 10.0f)
                moveToRelative(1.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-1.0f)
                lineTo(4.0f, 11.0f)
                close()
            }
        }
            .build()
        return _deskAdjustableSmall!!
    }

private var _deskAdjustableSmall: ImageVector? = null
