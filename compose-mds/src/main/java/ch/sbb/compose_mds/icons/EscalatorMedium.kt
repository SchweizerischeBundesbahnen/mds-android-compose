package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
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
                    pathFillType = NonZero) {
                moveTo(31.0f, 12.75f)
                arcToRelative(3.254f, 3.254f, 0.0f, false, false, -3.25f, -3.25f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-0.942f, 0.0f, -1.829f, 0.39f, -2.442f, 1.106f)
                lineToRelative(-0.43f, -0.368f)
                lineToRelative(0.427f, 0.372f)
                lineToRelative(-9.381f, 10.72f)
                lineToRelative(-0.15f, 0.17f)
                lineTo(6.75f, 21.5f)
                arcToRelative(3.254f, 3.254f, 0.0f, false, false, -3.25f, 3.25f)
                curveTo(3.5f, 26.54f, 4.96f, 28.0f, 6.75f, 28.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.942f, 0.0f, 1.83f, -0.392f, 2.441f, -1.106f)
                lineToRelative(0.004f, -0.004f)
                lineToRelative(9.38f, -10.72f)
                lineToRelative(0.15f, -0.17f)
                horizontalLineToRelative(3.025f)
                arcTo(3.254f, 3.254f, 0.0f, false, false, 31.0f, 12.75f)
                moveToRelative(-20.003f, 7.548f)
                lineToRelative(2.0f, -2.285f)
                verticalLineToRelative(-4.014f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(12.997f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                moveToRelative(7.81f, 1.606f)
                lineToRelative(-0.002f, 0.004f)
                lineToRelative(-0.376f, -0.329f)
                close()
                moveTo(32.0f, 12.75f)
                arcTo(4.254f, 4.254f, 0.0f, false, true, 27.75f, 17.0f)
                horizontalLineToRelative(-2.572f)
                lineToRelative(-9.23f, 10.548f)
                verticalLineToRelative(-0.001f)
                arcTo(4.19f, 4.19f, 0.0f, false, true, 12.75f, 29.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(4.255f, 4.255f, 0.0f, false, true, -4.25f, -4.25f)
                arcToRelative(4.254f, 4.254f, 0.0f, false, true, 4.25f, -4.25f)
                horizontalLineToRelative(3.247f)
                verticalLineToRelative(-7.501f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.871f)
                lineToRelative(6.055f, -6.918f)
                arcTo(4.19f, 4.19f, 0.0f, false, true, 23.25f, 8.5f)
                horizontalLineToRelative(4.5f)
                arcTo(4.254f, 4.254f, 0.0f, false, true, 32.0f, 12.75f)
                moveTo(13.996f, 9.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.001f, -0.001f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 13.996f, 9.0f)
            }
        }
        .build()
        return _escalatorMedium!!
    }

private var _escalatorMedium: ImageVector? = null
