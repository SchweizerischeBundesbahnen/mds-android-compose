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

public val SBBIcons.FilterMedium: ImageVector
    get() {
        if (_filterMedium != null) {
            return _filterMedium!!
        }
        _filterMedium = Builder(
            name = "FilterMedium",
            defaultWidth = 36.0.dp,
            defaultHeight =
                36.0.dp,
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
                moveTo(5.663f, 7.75f)
                horizontalLineToRelative(24.674f)
                lineToRelative(-0.707f, 0.825f)
                lineToRelative(-8.88f, 10.36f)
                lineTo(20.75f, 29.75f)
                horizontalLineToRelative(-5.5f)
                lineTo(15.25f, 18.935f)
                lineTo(6.37f, 8.575f)
                close()
                moveTo(7.837f, 8.75f)
                lineTo(16.13f, 18.424f)
                lineTo(16.25f, 18.564f)
                lineTo(16.25f, 28.75f)
                horizontalLineToRelative(3.5f)
                lineTo(19.75f, 18.565f)
                lineToRelative(0.12f, -0.14f)
                lineToRelative(8.293f, -9.675f)
                close()
            }
        }
            .build()
        return _filterMedium!!
    }

private var _filterMedium: ImageVector? = null
