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

public val SBBIcons.CashRegisterLarge: ImageVector
    get() {
        if (_cashRegisterLarge != null) {
            return _cashRegisterLarge!!
        }
        _cashRegisterLarge = Builder(name = "CashRegisterLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.947f, 4.724f)
                lineTo(19.0f, 12.618f)
                verticalLineToRelative(3.388f)
                curveToRelative(9.82f, 0.26f, 17.733f, 8.173f, 17.993f, 17.994f)
                lineTo(43.0f, 34.0f)
                verticalLineToRelative(9.0f)
                lineTo(4.0f, 43.0f)
                lineTo(4.0f, 4.0f)
                horizontalLineToRelative(19.309f)
                close()
                moveTo(5.0f, 34.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(1.0f)
                lineTo(5.0f, 35.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(37.0f)
                verticalLineToRelative(-7.0f)
                lineTo(31.0f, 35.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.992f)
                curveTo(35.728f, 24.565f, 28.0f, 17.0f, 18.5f, 17.0f)
                lineTo(18.0f, 17.0f)
                verticalLineToRelative(-4.0f)
                lineTo(5.0f, 13.0f)
                close()
                moveTo(14.5f, 20.0f)
                curveToRelative(2.484f, 0.0f, 4.5f, 2.016f, 4.5f, 4.5f)
                curveToRelative(0.0f, 1.062f, -0.37f, 2.038f, -0.985f, 2.808f)
                lineToRelative(5.106f, 5.106f)
                arcTo(2.498f, 2.498f, 0.0f, false, true, 27.0f, 34.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -4.586f, -1.379f)
                lineToRelative(-5.106f, -5.106f)
                arcTo(4.48f, 4.48f, 0.0f, false, true, 14.5f, 29.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -4.5f, -4.5f)
                curveToRelative(0.0f, -2.484f, 2.016f, -4.5f, 4.5f, -4.5f)
                moveToRelative(10.0f, 13.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -0.001f, 2.999f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 24.5f, 33.0f)
                moveToRelative(15.486f, -5.255f)
                lineToRelative(-0.47f, 0.171f)
                lineToRelative(-0.47f, 0.17f)
                lineToRelative(-0.684f, -1.879f)
                lineToRelative(0.94f, -0.342f)
                close()
                moveTo(14.5f, 21.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.5f, 3.5f)
                curveToRelative(0.0f, 1.932f, 1.568f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.568f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.568f, -3.5f, -3.5f, -3.5f)
                moveToRelative(23.985f, 3.116f)
                lineToRelative(-0.865f, 0.5f)
                lineToRelative(-1.0f, -1.732f)
                lineToRelative(0.865f, -0.5f)
                close()
                moveTo(36.38f, 20.803f)
                lineTo(35.614f, 21.445f)
                lineTo(34.328f, 19.913f)
                lineTo(35.094f, 19.27f)
                close()
                moveTo(33.73f, 17.907f)
                lineTo(33.088f, 18.673f)
                lineTo(31.554f, 17.387f)
                lineTo(32.196f, 16.621f)
                close()
                moveTo(5.0f, 12.0f)
                horizontalLineToRelative(13.191f)
                lineToRelative(3.5f, -7.0f)
                lineTo(5.0f, 5.0f)
                close()
            }
        }
        .build()
        return _cashRegisterLarge!!
    }

private var _cashRegisterLarge: ImageVector? = null
