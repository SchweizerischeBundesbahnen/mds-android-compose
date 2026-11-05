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
                moveTo(18.268f, 10.504f)
                lineTo(18.268f, 5.98f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.523f)
                close()
                moveTo(9.235f, 9.827f)
                lineTo(12.651f, 13.243f)
                lineTo(13.358f, 12.536f)
                lineTo(9.942f, 9.12f)
                close()
                moveTo(18.75f, 13.25f)
                curveToRelative(-3.03f, 0.0f, -5.458f, 2.46f, -5.458f, 5.498f)
                arcToRelative(5.49f, 5.49f, 0.0f, false, false, 5.492f, 5.493f)
                curveToRelative(3.03f, 0.0f, 5.466f, -2.456f, 5.466f, -5.491f)
                reflectiveCurveToRelative(-2.467f, -5.5f, -5.5f, -5.5f)
                moveToRelative(-6.458f, 5.498f)
                curveToRelative(0.0f, -3.582f, 2.867f, -6.498f, 6.458f, -6.498f)
                curveToRelative(3.585f, 0.0f, 6.5f, 2.913f, 6.5f, 6.5f)
                curveToRelative(0.0f, 3.582f, -2.878f, 6.49f, -6.466f, 6.49f)
                arcToRelative(6.49f, 6.49f, 0.0f, false, true, -6.492f, -6.492f)
                moveToRelative(-1.787f, 0.502f)
                lineTo(6.0f, 19.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.505f)
                close()
                moveTo(27.635f, 9.256f)
                lineTo(24.238f, 12.613f)
                lineTo(24.941f, 13.323f)
                lineTo(28.337f, 9.967f)
                close()
                moveTo(26.991f, 18.25f)
                lineTo(31.5f, 18.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-4.509f)
                close()
                moveTo(28.359f, 27.535f)
                lineTo(24.959f, 24.149f)
                lineTo(24.253f, 24.858f)
                lineTo(27.653f, 28.244f)
                close()
                moveTo(18.25f, 31.494f)
                lineTo(18.25f, 26.99f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.504f)
                close()
                moveTo(12.632f, 24.248f)
                lineTo(9.24f, 27.64f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(3.393f, -3.392f)
                close()
            }
        }
        .build()
        return _sunshineMedium!!
    }

private var _sunshineMedium: ImageVector? = null
