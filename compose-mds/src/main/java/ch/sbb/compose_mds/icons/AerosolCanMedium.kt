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

public val SBBIcons.AerosolCanMedium: ImageVector
    get() {
        if (_aerosolCanMedium != null) {
            return _aerosolCanMedium!!
        }
        _aerosolCanMedium = Builder(name = "AerosolCanMedium", defaultWidth = 36.0.dp, defaultHeight
                = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.25f, 10.25f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(1.998f)
                horizontalLineToRelative(0.624f)
                arcToRelative(3.875f, 3.875f, 0.0f, false, true, 3.875f, 3.875f)
                lineToRelative(0.005f, 16.128f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(-0.5f)
                lineToRelative(-0.009f, -16.128f)
                arcToRelative(3.875f, 3.875f, 0.0f, false, true, 3.876f, -3.875f)
                horizontalLineToRelative(0.629f)
                lineTo(10.75f, 10.25f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(7.254f, 31.751f)
                horizontalLineToRelative(8.0f)
                lineToRelative(-0.001f, -1.999f)
                horizontalLineToRelative(-8.0f)
                close()
                moveTo(7.253f, 28.752f)
                horizontalLineToRelative(8.0f)
                lineTo(15.25f, 17.75f)
                lineTo(7.247f, 17.75f)
                close()
                moveTo(10.121f, 13.248f)
                arcToRelative(2.874f, 2.874f, 0.0f, false, false, -2.875f, 2.875f)
                verticalLineToRelative(0.627f)
                horizontalLineToRelative(8.003f)
                verticalLineToRelative(-0.627f)
                arcToRelative(2.875f, 2.875f, 0.0f, false, false, -2.875f, -2.875f)
                close()
                moveTo(24.756f, 3.25f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.468f, 3.031f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.0f, 6.937f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -6.968f, -0.468f)
                curveToRelative(0.0f, -0.49f, 0.104f, -0.954f, 0.286f, -1.375f)
                lineToRelative(-5.887f, -1.134f)
                lineToRelative(-0.405f, -0.078f)
                lineTo(15.25f, 7.835f)
                lineToRelative(0.408f, -0.076f)
                lineToRelative(5.599f, -1.051f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.499f, -3.458f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.5f, 2.5f)
                curveToRelative(0.0f, 0.088f, 0.014f, 0.14f, 0.033f, 0.31f)
                lineToRelative(-0.498f, 0.055f)
                lineToRelative(0.001f, 0.001f)
                lineToRelative(0.497f, -0.055f)
                lineToRelative(0.05f, 0.46f)
                lineToRelative(-0.455f, 0.086f)
                lineToRelative(-5.634f, 1.057f)
                verticalLineToRelative(0.672f)
                lineToRelative(6.16f, 1.187f)
                lineToRelative(0.765f, 0.148f)
                lineToRelative(-0.452f, 0.634f)
                arcToRelative(2.48f, 2.48f, 0.0f, false, false, -0.467f, 1.445f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 5.0f, 0.0f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(0.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, -5.0f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                moveToRelative(-14.506f, 5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _aerosolCanMedium!!
    }

private var _aerosolCanMedium: ImageVector? = null
