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

public val SBBIcons.TravelBackpackMedium: ImageVector
    get() {
        if (_travelBackpackMedium != null) {
            return _travelBackpackMedium!!
        }
        _travelBackpackMedium = Builder(
            name = "TravelBackpackMedium",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveTo(8.252f, 4.25f)
                curveToRelative(-0.553f, 0.0f, -1.002f, 0.449f, -1.002f, 1.002f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 0.551f, 0.447f, 0.998f, 0.998f, 0.998f)
                horizontalLineToRelative(4.002f)
                verticalLineToRelative(-6.5f)
                close()
                moveTo(13.25f, 4.25f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(9.5f)
                verticalLineToRelative(-6.5f)
                close()
                moveTo(23.75f, 4.25f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-4.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
                moveTo(6.25f, 5.252f)
                curveToRelative(0.0f, -1.106f, 0.896f, -2.002f, 2.002f, -2.002f)
                lineTo(27.75f, 3.25f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(4.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(0.376f)
                curveToRelative(0.683f, 0.011f, 1.697f, 0.223f, 2.554f, 0.839f)
                curveToRelative(0.881f, 0.633f, 1.57f, 1.677f, 1.57f, 3.261f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 0.373f, -0.15f, 0.73f, -0.414f, 0.992f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, true, -0.994f, 0.408f)
                lineTo(6.158f, 32.75f)
                curveToRelative(-0.372f, 0.0f, -0.73f, -0.146f, -0.994f, -0.408f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, true, -0.414f, -0.992f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -1.089f, 0.436f, -2.132f, 1.212f, -2.9f)
                arcToRelative(4.15f, 4.15f, 0.0f, false, true, 2.92f, -1.2f)
                horizontalLineToRelative(0.368f)
                verticalLineToRelative(-11.0f)
                lineTo(8.248f, 11.75f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.25f, 9.752f)
                close()
                moveTo(10.25f, 11.75f)
                verticalLineToRelative(3.06f)
                arcToRelative(10.5f, 10.5f, 0.0f, false, false, 3.431f, 2.504f)
                curveToRelative(1.205f, 0.548f, 2.501f, 0.86f, 3.819f, 0.924f)
                lineTo(17.5f, 16.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.738f)
                arcToRelative(10.4f, 10.4f, 0.0f, false, false, 3.819f, -0.924f)
                arcToRelative(10.5f, 10.5f, 0.0f, false, false, 3.431f, -2.504f)
                verticalLineToRelative(-3.06f)
                close()
                moveTo(25.75f, 16.226f)
                arcToRelative(11.438f, 11.438f, 0.0f, false, true, -7.25f, 3.013f)
                lineTo(18.5f, 21.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.76f)
                arcToRelative(11.4f, 11.4f, 0.0f, false, true, -4.233f, -1.016f)
                arcToRelative(11.5f, 11.5f, 0.0f, false, true, -3.017f, -1.998f)
                lineTo(10.25f, 31.75f)
                horizontalLineToRelative(15.5f)
                close()
                moveTo(26.75f, 31.75f)
                horizontalLineToRelative(3.092f)
                curveToRelative(0.11f, 0.0f, 0.214f, -0.043f, 0.29f, -0.119f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, 0.118f, -0.281f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -1.249f, -0.522f, -1.996f, -1.154f, -2.45f)
                curveToRelative(-0.654f, -0.47f, -1.455f, -0.64f, -1.982f, -0.65f)
                horizontalLineToRelative(-0.364f)
                close()
                moveTo(9.25f, 31.75f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-0.368f)
                curveToRelative(-0.832f, 0.0f, -1.63f, 0.328f, -2.216f, 0.91f)
                arcToRelative(3.08f, 3.08f, 0.0f, false, false, -0.916f, 2.19f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 0.105f, 0.042f, 0.206f, 0.118f, 0.281f)
                reflectiveCurveToRelative(0.18f, 0.119f, 0.29f, 0.119f)
                close()
            }
        }
            .build()
        return _travelBackpackMedium!!
    }

private var _travelBackpackMedium: ImageVector? = null
