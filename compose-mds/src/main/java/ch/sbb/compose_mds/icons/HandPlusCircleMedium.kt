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

public val SBBIcons.HandPlusCircleMedium: ImageVector
    get() {
        if (_handPlusCircleMedium != null) {
            return _handPlusCircleMedium!!
        }
        _handPlusCircleMedium = Builder(name = "HandPlusCircleMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.25f, 11.25f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, true, 14.002f, 0.001f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 7.25f, 11.25f)
                moveToRelative(7.0f, -8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.002f, 16.001f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 14.25f, 3.25f)
                moveToRelative(0.5f, 13.25f)
                verticalLineToRelative(-4.75f)
                horizontalLineToRelative(4.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-4.75f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(4.75f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.75f)
                verticalLineToRelative(4.75f)
                close()
                moveTo(12.246f, 24.2f)
                lineTo(6.488f, 20.18f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.499f, 3.123f)
                lineToRelative(8.88f, 7.823f)
                lineToRelative(0.141f, 0.125f)
                horizontalLineToRelative(5.898f)
                lineToRelative(1.365f, 1.355f)
                lineToRelative(0.147f, 0.145f)
                horizontalLineTo(33.0f)
                lineToRelative(-0.846f, -0.852f)
                lineToRelative(-7.542f, -7.596f)
                lineToRelative(-0.008f, -0.008f)
                curveToRelative(-1.756f, -1.69f, -4.041f, -2.999f, -6.431f, -3.044f)
                horizontalLineTo(15.0f)
                curveToRelative(-0.881f, 0.0f, -1.582f, 0.337f, -2.058f, 0.87f)
                curveToRelative(-0.468f, 0.522f, -0.697f, 1.206f, -0.702f, 1.876f)
                quadToRelative(0.0f, 0.102f, 0.005f, 0.205f)
                moveTo(5.903f, 20.99f)
                lineToRelative(7.056f, 4.929f)
                curveToRelative(0.475f, 0.512f, 1.169f, 0.83f, 2.042f, 0.83f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.63f, 0.0f, -1.057f, -0.226f, -1.332f, -0.535f)
                curveToRelative(-0.282f, -0.317f, -0.432f, -0.755f, -0.428f, -1.21f)
                curveToRelative(0.004f, -0.456f, 0.16f, -0.897f, 0.447f, -1.218f)
                curveToRelative(0.28f, -0.312f, 0.705f, -0.536f, 1.313f, -0.536f)
                horizontalLineToRelative(3.158f)
                curveToRelative(2.044f, 0.04f, 4.097f, 1.172f, 5.749f, 2.76f)
                lineToRelative(6.691f, 6.74f)
                horizontalLineToRelative(-9.768f)
                lineToRelative(-1.365f, -1.355f)
                lineToRelative(-0.146f, -0.145f)
                horizontalLineToRelative(-5.932f)
                lineToRelative(-8.746f, -7.705f)
                lineToRelative(-0.009f, -0.008f)
                lineToRelative(-0.008f, -0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.253f, -1.56f)
                lineToRelative(0.012f, 0.01f)
                close()
            }
        }
        .build()
        return _handPlusCircleMedium!!
    }

private var _handPlusCircleMedium: ImageVector? = null
