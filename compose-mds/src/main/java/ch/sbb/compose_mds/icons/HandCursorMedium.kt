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

public val SBBIcons.HandCursorMedium: ImageVector
    get() {
        if (_handCursorMedium != null) {
            return _handCursorMedium!!
        }
        _handCursorMedium = Builder(name = "HandCursorMedium", defaultWidth = 36.0.dp, defaultHeight
                = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.75f, 8.25f)
                curveToRelative(0.0f, -1.101f, 0.899f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.899f, 2.0f, 2.0f)
                verticalLineToRelative(5.77f)
                curveToRelative(0.295f, -0.172f, 0.636f, -0.27f, 1.0f, -0.27f)
                curveToRelative(1.026f, 0.0f, 1.876f, 0.78f, 1.988f, 1.777f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.012f, -0.277f)
                curveToRelative(1.026f, 0.0f, 1.876f, 0.78f, 1.988f, 1.776f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.012f, -0.276f)
                curveToRelative(1.101f, 0.0f, 2.0f, 0.899f, 2.0f, 2.0f)
                lineTo(26.75f, 24.0f)
                curveToRelative(0.0f, 2.257f, -0.345f, 3.992f, -0.696f, 5.171f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -0.485f, 1.346f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -0.214f, 0.444f)
                lineToRelative(-0.015f, 0.026f)
                lineToRelative(-0.004f, 0.008f)
                lineToRelative(-0.002f, 0.003f)
                verticalLineToRelative(0.001f)
                lineToRelative(-0.434f, -0.249f)
                lineToRelative(0.433f, 0.25f)
                lineToRelative(-0.144f, 0.25f)
                lineTo(13.965f, 31.25f)
                lineToRelative(-0.145f, -0.245f)
                lineToRelative(0.43f, -0.255f)
                lineToRelative(-0.43f, 0.254f)
                lineToRelative(-0.001f, -0.001f)
                lineToRelative(-0.003f, -0.005f)
                lineToRelative(-0.011f, -0.018f)
                lineToRelative(-0.043f, -0.073f)
                lineToRelative(-0.162f, -0.275f)
                lineToRelative(-0.585f, -0.988f)
                lineToRelative(-1.804f, -3.053f)
                arcToRelative(1242.0f, 1242.0f, 0.0f, false, true, -2.96f, -5.027f)
                curveToRelative(-0.25f, -0.437f, -0.44f, -0.905f, -0.46f, -1.378f)
                curveToRelative(-0.02f, -0.497f, 0.149f, -0.963f, 0.54f, -1.355f)
                curveToRelative(0.78f, -0.78f, 2.057f, -0.78f, 2.838f, 0.0f)
                lineToRelative(2.581f, 2.582f)
                close()
                moveTo(22.75f, 18.75f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.76f)
                curveToRelative(0.006f, -0.545f, 0.455f, -0.99f, 1.0f, -0.99f)
                curveToRelative(0.549f, 0.0f, 1.0f, 0.451f, 1.0f, 1.0f)
                lineTo(25.75f, 24.0f)
                curveToRelative(0.0f, 2.153f, -0.33f, 3.793f, -0.654f, 4.886f)
                arcToRelative(10.6f, 10.6f, 0.0f, false, true, -0.504f, 1.364f)
                lineTo(14.535f, 30.25f)
                lineToRelative(-0.075f, -0.127f)
                lineToRelative(-0.584f, -0.988f)
                lineToRelative(-1.803f, -3.053f)
                curveToRelative(-1.335f, -2.26f, -2.724f, -4.614f, -2.954f, -5.016f)
                curveToRelative(-0.214f, -0.373f, -0.318f, -0.678f, -0.328f, -0.921f)
                arcToRelative(0.76f, 0.76f, 0.0f, false, true, 0.248f, -0.606f)
                curveToRelative(0.39f, -0.39f, 1.033f, -0.39f, 1.422f, 0.0f)
                lineToRelative(3.435f, 3.435f)
                lineToRelative(0.854f, 0.853f)
                lineTo(14.75f, 8.25f)
                curveToRelative(0.0f, -0.549f, 0.451f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.451f, 1.0f, 1.0f)
                lineTo(16.75f, 19.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-3.75f)
                curveToRelative(0.0f, -0.549f, 0.451f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.451f, 1.0f, 1.0f)
                verticalLineToRelative(3.75f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.25f)
                curveToRelative(0.0f, -0.549f, 0.451f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.451f, 1.0f, 1.0f)
                verticalLineToRelative(1.5f)
            }
        }
        .build()
        return _handCursorMedium!!
    }

private var _handCursorMedium: ImageVector? = null
