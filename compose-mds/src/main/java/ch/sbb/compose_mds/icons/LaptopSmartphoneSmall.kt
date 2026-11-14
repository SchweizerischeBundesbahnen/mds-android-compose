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

public val SBBIcons.LaptopSmartphoneSmall: ImageVector
    get() {
        if (_laptopSmartphoneSmall != null) {
            return _laptopSmartphoneSmall!!
        }
        _laptopSmartphoneSmall = Builder(name = "LaptopSmartphoneSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.0f, 4.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(19.0f, 5.0f)
                lineTo(7.0f, 5.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(6.992f)
                verticalLineToRelative(1.0f)
                lineTo(6.667f, 14.0f)
                lineTo(4.0f, 16.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(1.0f)
                lineTo(3.0f, 17.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(1.0f)
                lineTo(2.0f, 19.0f)
                verticalLineToRelative(-2.75f)
                lineToRelative(0.2f, -0.15f)
                lineTo(6.0f, 13.249f)
                lineTo(6.0f, 4.0f)
                close()
                moveTo(21.0f, 13.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                lineTo(20.0f, 13.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 0.277f, 0.223f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.277f, 0.0f, 0.5f, -0.223f, 0.5f, -0.5f)
                close()
                moveTo(22.0f, 20.5f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, -1.5f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -0.828f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _laptopSmartphoneSmall!!
    }

private var _laptopSmartphoneSmall: ImageVector? = null
