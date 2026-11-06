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
                moveToRelative(11.323f, 7.74f)
                lineToRelative(-3.95f, 3.904f)
                lineToRelative(-0.36f, 0.356f)
                lineToRelative(0.36f, 0.355f)
                lineToRelative(3.948f, 3.904f)
                lineToRelative(0.704f, -0.71f)
                lineTo(8.436f, 12.0f)
                lineToRelative(3.59f, -3.548f)
                close()
                moveTo(15.323f, 7.74f)
                lineTo(11.373f, 11.644f)
                lineTo(11.014f, 12.0f)
                lineTo(11.374f, 12.355f)
                lineTo(15.322f, 16.259f)
                lineTo(16.025f, 15.549f)
                lineTo(12.436f, 12.0f)
                lineToRelative(3.59f, -3.548f)
                close()
            }
        }
        .build()
        return _doubleChevronSmallLeftSmall!!
    }

private var _doubleChevronSmallLeftSmall: ImageVector? = null
