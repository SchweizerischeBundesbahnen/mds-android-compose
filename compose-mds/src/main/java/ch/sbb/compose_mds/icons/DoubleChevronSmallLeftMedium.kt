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
                moveToRelative(17.16f, 11.789f)
                lineToRelative(-5.924f, 5.855f)
                lineToRelative(-0.36f, 0.356f)
                lineToRelative(0.36f, 0.355f)
                lineToRelative(5.922f, 5.856f)
                lineToRelative(0.703f, -0.71f)
                lineToRelative(-5.562f, -5.5f)
                lineToRelative(5.565f, -5.501f)
                close()
                moveTo(23.161f, 11.789f)
                lineTo(17.236f, 17.644f)
                lineTo(16.876f, 18.0f)
                lineTo(17.236f, 18.355f)
                lineTo(23.158f, 24.211f)
                lineTo(23.862f, 23.501f)
                lineTo(18.299f, 18.001f)
                lineTo(23.864f, 12.5f)
                close()
            }
        }
        .build()
        return _doubleChevronSmallLeftMedium!!
    }

private var _doubleChevronSmallLeftMedium: ImageVector? = null
