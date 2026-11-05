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

public val SBBIcons.LaptopSmartphoneMedium: ImageVector
    get() {
        if (_laptopSmartphoneMedium != null) {
            return _laptopSmartphoneMedium!!
        }
        _laptopSmartphoneMedium = Builder(
            name = "LaptopSmartphoneMedium",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
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
                moveTo(9.25f, 6.25f)
                horizontalLineToRelative(20.5f)
                lineTo(29.75f, 16.5f)
                horizontalLineToRelative(-1.0f)
                lineTo(28.75f, 7.25f)
                horizontalLineToRelative(-18.5f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(10.738f)
                verticalLineToRelative(1.0f)
                lineTo(9.917f, 20.75f)
                lineToRelative(-4.667f, 3.5f)
                lineTo(21.0f, 24.25f)
                verticalLineToRelative(1.0f)
                lineTo(4.25f, 25.25f)
                verticalLineToRelative(2.0f)
                lineTo(21.0f, 27.25f)
                verticalLineToRelative(1.0f)
                lineTo(3.25f, 28.25f)
                lineTo(3.25f, 24.5f)
                lineToRelative(0.2f, -0.15f)
                lineTo(9.25f, 20.0f)
                lineTo(9.25f, 6.25f)
                moveToRelative(15.5f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(10.5f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-10.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
                moveTo(22.75f, 20.25f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(10.5f)
                curveToRelative(0.0f, 1.106f, -0.894f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.106f, 0.0f, -2.0f, -0.894f, -2.0f, -2.0f)
                close()
                moveTo(25.5f, 20.75f)
                lineTo(30.0f, 20.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-4.5f)
                close()
            }
        }
            .build()
        return _laptopSmartphoneMedium!!
    }

private var _laptopSmartphoneMedium: ImageVector? = null
