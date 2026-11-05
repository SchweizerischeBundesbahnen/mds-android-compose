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

public val SBBIcons.DoubleChevronSmallRightMedium: ImageVector
    get() {
        if (_doubleChevronSmallRightMedium != null) {
            return _doubleChevronSmallRightMedium!!
        }
        _doubleChevronSmallRightMedium = Builder(
            name = "DoubleChevronSmallRightMedium",
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
                moveToRelative(18.764f, 17.645f)
                lineToRelative(-5.922f, -5.856f)
                lineToRelative(-0.703f, 0.71f)
                lineTo(17.7f, 18.0f)
                lineTo(12.136f, 23.5f)
                lineToRelative(0.703f, 0.712f)
                lineToRelative(5.925f, -5.856f)
                lineToRelative(0.36f, -0.356f)
                close()
                moveTo(24.764f, 17.645f)
                lineTo(18.842f, 11.789f)
                lineTo(18.139f, 12.499f)
                lineTo(23.702f, 17.999f)
                lineTo(18.136f, 23.5f)
                lineTo(18.839f, 24.212f)
                lineTo(24.764f, 18.356f)
                lineTo(25.124f, 18.0f)
                close()
            }
        }
            .build()
        return _doubleChevronSmallRightMedium!!
    }

private var _doubleChevronSmallRightMedium: ImageVector? = null
