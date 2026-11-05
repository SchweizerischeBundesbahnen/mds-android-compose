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

public val SBBIcons.LaptopLarge: ImageVector
    get() {
        if (_laptopLarge != null) {
            return _laptopLarge!!
        }
        _laptopLarge = Builder(
            name = "LaptopLarge",
            defaultWidth = 48.0.dp,
            defaultHeight =
                48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
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
                moveTo(9.44f, 12.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, 1.5f)
                lineTo(7.999f, 34.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(30.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(13.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                close()
                moveTo(38.0f, 34.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(10.0f)
                verticalLineToRelative(20.0f)
                close()
                moveTo(6.94f, 13.501f)
                lineTo(6.999f, 34.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(1.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 6.5f, 38.0f)
                horizontalLineToRelative(35.01f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.5f, -2.5f)
                verticalLineTo(34.0f)
                horizontalLineTo(41.0f)
                verticalLineTo(13.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.5f, -2.5f)
                horizontalLineTo(9.44f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.5f, 2.5f)
                close()
                moveTo(5.0f, 35.0f)
                verticalLineToRelative(0.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.5f, 37.0f)
                horizontalLineToRelative(35.01f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                verticalLineTo(35.0f)
                close()
            }
        }
            .build()
        return _laptopLarge!!
    }

private var _laptopLarge: ImageVector? = null
