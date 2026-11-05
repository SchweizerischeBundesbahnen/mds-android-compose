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

public val SBBIcons.SuitcaseDisabledSmall: ImageVector
    get() {
        if (_suitcaseDisabledSmall != null) {
            return _suitcaseDisabledSmall!!
        }
        _suitcaseDisabledSmall = Builder(
            name = "SuitcaseDisabledSmall",
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
                moveTo(9.0f, 3.01f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.999f)
                horizontalLineToRelative(6.0f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(7.009f)
                horizontalLineTo(9.498f)
                lineTo(6.998f, 7.0f)
                lineToRelative(0.004f, -1.0f)
                lineTo(9.0f, 6.007f)
                verticalLineTo(3.01f)
                moveToRelative(5.0f, 1.0f)
                verticalLineToRelative(1.999f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(3.0f, 6.017f)
                lineTo(1.99f, 5.01f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(17.005f, 16.994f)
                lineToRelative(-0.707f, 0.707f)
                lineTo(16.99f, 20.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(6.018f)
                moveToRelative(1.0f, 1.0f)
                verticalLineTo(19.0f)
                horizontalLineToRelative(11.99f)
                close()
            }
        }
            .build()
        return _suitcaseDisabledSmall!!
    }

private var _suitcaseDisabledSmall: ImageVector? = null
