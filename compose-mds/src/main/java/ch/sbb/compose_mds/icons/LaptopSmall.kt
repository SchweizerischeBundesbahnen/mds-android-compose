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

public val SBBIcons.LaptopSmall: ImageVector
    get() {
        if (_laptopSmall != null) {
            return _laptopSmall!!
        }
        _laptopSmall = Builder(
            name = "LaptopSmall",
            defaultWidth = 24.0.dp,
            defaultHeight =
                24.0.dp,
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
                moveTo(4.0f, 4.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(9.349f)
                lineToRelative(1.916f, 2.874f)
                lineToRelative(0.084f, 0.126f)
                verticalLineTo(19.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(-2.651f)
                lineToRelative(0.084f, -0.126f)
                lineTo(4.0f, 13.349f)
                verticalLineTo(4.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(14.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(3.434f, 16.0f)
                lineToRelative(1.334f, -2.0f)
                horizontalLineToRelative(14.464f)
                lineToRelative(1.334f, 2.0f)
                close()
                moveTo(3.0f, 17.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
            .build()
        return _laptopSmall!!
    }

private var _laptopSmall: ImageVector? = null
