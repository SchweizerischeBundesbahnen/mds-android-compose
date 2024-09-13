package ch.sbb.compose_mds.sbbicons.medium

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.MediumGroup

public val MediumGroup.TwoLinesDiagonalMedium: ImageVector
    get() {
        if (_twoLinesDiagonalMedium != null) {
            return _twoLinesDiagonalMedium!!
        }
        _twoLinesDiagonalMedium = Builder(name = "TwoLinesDiagonalMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(22.147f, 13.896f)
                lineToRelative(-9.0f, 9.0f)
                lineToRelative(0.707f, 0.708f)
                lineToRelative(9.0f, -9.0f)
                close()
                moveTo(22.147f, 19.896f)
                lineTo(19.147f, 22.896f)
                lineTo(19.854f, 23.604f)
                lineTo(22.854f, 20.604f)
                close()
            }
        }
        .build()
        return _twoLinesDiagonalMedium!!
    }

private var _twoLinesDiagonalMedium: ImageVector? = null
