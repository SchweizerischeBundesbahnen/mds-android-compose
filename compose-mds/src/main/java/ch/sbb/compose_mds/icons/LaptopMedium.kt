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

public val SBBIcons.LaptopMedium: ImageVector
    get() {
        if (_laptopMedium != null) {
            return _laptopMedium!!
        }
        _laptopMedium = Builder(
            name = "LaptopMedium",
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
                moveTo(6.25f, 6.25f)
                horizontalLineToRelative(23.5f)
                verticalLineToRelative(13.849f)
                lineToRelative(2.916f, 4.374f)
                lineToRelative(0.084f, 0.126f)
                verticalLineToRelative(3.651f)
                lineTo(3.25f, 28.25f)
                verticalLineToRelative(-3.651f)
                lineToRelative(0.084f, -0.126f)
                lineToRelative(2.916f, -4.374f)
                lineTo(6.25f, 6.25f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(21.5f)
                lineTo(28.75f, 7.25f)
                close()
                moveTo(4.684f, 24.25f)
                lineTo(7.018f, 20.75f)
                horizontalLineToRelative(21.964f)
                lineToRelative(2.334f, 3.5f)
                close()
                moveTo(4.25f, 25.25f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(27.5f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
            .build()
        return _laptopMedium!!
    }

private var _laptopMedium: ImageVector? = null
