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

public val SBBIcons.DoubleChevronSmallLeftMedium: ImageVector
    get() {
        if (_doubleChevronSmallLeftMedium != null) {
            return _doubleChevronSmallLeftMedium!!
        }
        _doubleChevronSmallLeftMedium = Builder(name = "DoubleChevronSmallLeftMedium", defaultWidth
                = 36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(12.298f, 18.0f)
                lineToRelative(5.566f, -5.5f)
                lineToRelative(-0.704f, -0.711f)
                lineToRelative(-5.924f, 5.855f)
                lineToRelative(-0.36f, 0.356f)
                lineToRelative(0.36f, 0.355f)
                lineToRelative(5.922f, 5.857f)
                lineToRelative(0.703f, -0.711f)
                close()
                moveTo(18.298f, 18.0f)
                lineTo(23.864f, 12.5f)
                lineTo(23.161f, 11.789f)
                lineTo(17.236f, 17.644f)
                lineTo(16.876f, 18.0f)
                lineTo(17.236f, 18.355f)
                lineTo(23.158f, 24.212f)
                lineTo(23.861f, 23.501f)
                close()
            }
        }
        .build()
        return _doubleChevronSmallLeftMedium!!
    }

private var _doubleChevronSmallLeftMedium: ImageVector? = null
