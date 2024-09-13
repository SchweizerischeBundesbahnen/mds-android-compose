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

public val MediumGroup.FilterXMedium: ImageVector
    get() {
        if (_filterXMedium != null) {
            return _filterXMedium!!
        }
        _filterXMedium = Builder(name = "FilterXMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.663f, 6.25f)
                horizontalLineToRelative(24.674f)
                lineToRelative(-0.707f, 0.825f)
                lineToRelative(-8.88f, 10.36f)
                verticalLineToRelative(2.188f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.558f)
                lineToRelative(0.12f, -0.14f)
                lineToRelative(8.293f, -9.675f)
                horizontalLineTo(7.837f)
                lineToRelative(8.293f, 9.674f)
                lineToRelative(0.12f, 0.14f)
                verticalLineTo(27.25f)
                horizontalLineTo(18.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.75f)
                verticalLineTo(17.435f)
                lineTo(6.37f, 7.075f)
                close()
                moveTo(23.25f, 26.957f)
                lineToRelative(-3.396f, 3.396f)
                lineToRelative(-0.708f, -0.707f)
                lineToRelative(3.397f, -3.396f)
                lineToRelative(-3.397f, -3.397f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(3.397f, 3.396f)
                lineToRelative(3.396f, -3.396f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(-3.396f, 3.396f)
                lineToRelative(3.396f, 3.397f)
                lineToRelative(-0.707f, 0.707f)
                close()
            }
        }
        .build()
        return _filterXMedium!!
    }

private var _filterXMedium: ImageVector? = null
