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

public val SBBIcons.EscalatorMedium: ImageVector
    get() {
        if (_escalatorMedium != null) {
            return _escalatorMedium!!
        }
        _escalatorMedium = Builder(name = "EscalatorMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.996f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(-2.0f, 1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                moveToRelative(10.055f, 0.953f)
                arcTo(4.19f, 4.19f, 0.0f, false, true, 23.25f, 8.5f)
                horizontalLineToRelative(4.5f)
                arcTo(4.254f, 4.254f, 0.0f, false, true, 32.0f, 12.75f)
                arcTo(4.254f, 4.254f, 0.0f, false, true, 27.75f, 17.0f)
                horizontalLineToRelative(-2.572f)
                lineTo(15.95f, 27.546f)
                arcTo(4.19f, 4.19f, 0.0f, false, true, 12.75f, 29.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(4.255f, 4.255f, 0.0f, false, true, -4.25f, -4.25f)
                arcToRelative(4.254f, 4.254f, 0.0f, false, true, 4.25f, -4.25f)
                horizontalLineToRelative(3.247f)
                lineTo(9.997f, 13.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.87f)
                lineToRelative(6.052f, -6.914f)
                close()
                moveTo(12.997f, 18.013f)
                lineTo(12.997f, 14.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(6.3f)
                close()
                moveTo(23.25f, 9.5f)
                arcToRelative(3.19f, 3.19f, 0.0f, false, false, -2.442f, 1.107f)
                lineToRelative(-0.003f, 0.003f)
                lineToRelative(-9.381f, 10.72f)
                lineToRelative(-0.15f, 0.17f)
                lineTo(6.75f, 21.5f)
                arcToRelative(3.254f, 3.254f, 0.0f, false, false, -3.25f, 3.25f)
                curveTo(3.5f, 26.54f, 4.96f, 28.0f, 6.75f, 28.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.942f, 0.0f, 1.83f, -0.391f, 2.442f, -1.106f)
                lineToRelative(0.003f, -0.004f)
                lineToRelative(9.38f, -10.72f)
                lineToRelative(0.15f, -0.17f)
                horizontalLineToRelative(3.025f)
                arcTo(3.254f, 3.254f, 0.0f, false, false, 31.0f, 12.75f)
                arcToRelative(3.254f, 3.254f, 0.0f, false, false, -3.25f, -3.25f)
                close()
            }
        }
        .build()
        return _escalatorMedium!!
    }

private var _escalatorMedium: ImageVector? = null
