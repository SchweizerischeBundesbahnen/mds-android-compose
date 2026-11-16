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

public val SBBIcons.DoubleChevronSmallLeftSmall: ImageVector
    get() {
        if (_doubleChevronSmallLeftSmall != null) {
            return _doubleChevronSmallLeftSmall!!
        }
        _doubleChevronSmallLeftSmall = Builder(name = "DoubleChevronSmallLeftSmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(8.436f, 12.0f)
                lineToRelative(3.59f, -3.548f)
                lineToRelative(-0.703f, -0.711f)
                lineToRelative(-3.95f, 3.903f)
                lineToRelative(-0.36f, 0.355f)
                lineToRelative(0.36f, 0.357f)
                lineToRelative(3.949f, 3.903f)
                lineToRelative(0.703f, -0.71f)
                close()
                moveTo(12.436f, 12.0f)
                lineTo(16.027f, 8.452f)
                lineTo(15.324f, 7.741f)
                lineTo(11.374f, 11.644f)
                lineTo(11.014f, 11.999f)
                lineTo(11.374f, 12.356f)
                lineTo(15.322f, 16.259f)
                lineTo(16.025f, 15.549f)
                close()
            }
        }
        .build()
        return _doubleChevronSmallLeftSmall!!
    }

private var _doubleChevronSmallLeftSmall: ImageVector? = null
