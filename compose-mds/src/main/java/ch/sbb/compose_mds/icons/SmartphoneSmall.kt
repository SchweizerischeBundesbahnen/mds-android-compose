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

public val SBBIcons.SmartphoneSmall: ImageVector
    get() {
        if (_smartphoneSmall != null) {
            return _smartphoneSmall!!
        }
        _smartphoneSmall = Builder(name = "SmartphoneSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.5f, 3.999f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, 1.5f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 0.83f, 0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-14.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 15.5f, 4.0f)
                close()
                moveTo(8.0f, 5.499f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 0.277f, -0.223f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                close()
                moveTo(10.0f, 5.999f)
                horizontalLineToRelative(4.0f)
                lineTo(14.0f, 5.0f)
                horizontalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _smartphoneSmall!!
    }

private var _smartphoneSmall: ImageVector? = null
