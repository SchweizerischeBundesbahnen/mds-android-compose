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

public val SBBIcons.SmartphoneDisabledMedium: ImageVector
    get() {
        if (_smartphoneDisabledMedium != null) {
            return _smartphoneDisabledMedium!!
        }
        _smartphoneDisabledMedium = Builder(name = "SmartphoneDisabledMedium", defaultWidth =
                36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(25.25f, 25.957f)
                lineToRelative(5.897f, 5.897f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(-27.0f, -27.0f)
                lineToRelative(-0.708f, 0.707f)
                lineToRelative(6.604f, 6.603f)
                lineTo(10.75f, 29.25f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(10.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                close()
                moveTo(24.25f, 24.957f)
                verticalLineToRelative(4.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-10.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(11.75f, 12.457f)
                close()
                moveTo(12.75f, 6.25f)
                horizontalLineToRelative(10.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                lineTo(25.25f, 21.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(24.25f, 8.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineToRelative(-10.5f)
                curveToRelative(-0.277f, 0.0f, -0.558f, 0.192f, -0.786f, 0.53f)
                lineToRelative(-0.828f, -0.56f)
                curveToRelative(0.31f, -0.46f, 0.855f, -0.97f, 1.614f, -0.97f)
                moveTo(15.0f, 8.75f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-6.0f)
                close()
            }
        }
        .build()
        return _smartphoneDisabledMedium!!
    }

private var _smartphoneDisabledMedium: ImageVector? = null
