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

public val SBBIcons.SunshineMedium: ImageVector
    get() {
        if (_sunshineMedium != null) {
            return _sunshineMedium!!
        }
        _sunshineMedium = Builder(name = "SunshineMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.268f, 5.981f)
                verticalLineToRelative(4.523f)
                horizontalLineToRelative(-1.0f)
                lineTo(18.268f, 5.98f)
                close()
                moveTo(12.65f, 13.243f)
                lineTo(13.358f, 12.535f)
                lineTo(9.942f, 9.12f)
                lineToRelative(-0.707f, 0.707f)
                close()
                moveTo(12.292f, 18.748f)
                curveToRelative(0.0f, -3.582f, 2.867f, -6.498f, 6.458f, -6.498f)
                curveToRelative(3.585f, 0.0f, 6.5f, 2.913f, 6.5f, 6.5f)
                curveToRelative(0.0f, 3.582f, -2.878f, 6.491f, -6.466f, 6.491f)
                arcToRelative(6.493f, 6.493f, 0.0f, false, true, -6.492f, -6.493f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(5.493f, 5.493f, 0.0f, false, false, 5.492f, 5.493f)
                curveToRelative(3.03f, 0.0f, 5.466f, -2.456f, 5.466f, -5.491f)
                reflectiveCurveToRelative(-2.467f, -5.5f, -5.5f, -5.5f)
                curveToRelative(-3.03f, 0.0f, -5.458f, 2.46f, -5.458f, 5.498f)
                moveToRelative(-2.787f, -0.498f)
                verticalLineToRelative(1.0f)
                lineTo(6.0f, 19.25f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(24.941f, 13.324f)
                lineTo(28.337f, 9.967f)
                lineTo(27.635f, 9.256f)
                lineTo(24.238f, 12.612f)
                close()
                moveTo(31.5f, 19.25f)
                lineTo(26.99f, 19.25f)
                verticalLineToRelative(-1.0f)
                lineTo(31.5f, 18.25f)
                close()
                moveTo(27.654f, 28.244f)
                lineTo(28.359f, 27.534f)
                lineTo(24.959f, 24.149f)
                lineTo(24.253f, 24.859f)
                close()
                moveTo(19.25f, 26.989f)
                verticalLineToRelative(4.505f)
                horizontalLineToRelative(-1.0f)
                lineTo(18.25f, 26.99f)
                close()
                moveTo(9.946f, 28.347f)
                lineTo(13.339f, 24.955f)
                lineTo(12.632f, 24.248f)
                lineTo(9.239f, 27.64f)
                close()
            }
        }
        .build()
        return _sunshineMedium!!
    }

private var _sunshineMedium: ImageVector? = null
