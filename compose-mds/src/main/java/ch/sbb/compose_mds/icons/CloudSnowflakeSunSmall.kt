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

public val SBBIcons.CloudSnowflakeSunSmall: ImageVector
    get() {
        if (_cloudSnowflakeSunSmall != null) {
            return _cloudSnowflakeSunSmall!!
        }
        _cloudSnowflakeSunSmall = Builder(
            name = "CloudSnowflakeSunSmall",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
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
                moveTo(14.925f, 6.536f)
                curveToRelative(0.436f, 0.292f, 0.808f, 0.69f, 1.065f, 1.18f)
                curveToRelative(0.318f, 0.609f, 0.448f, 1.337f, 0.322f, 2.143f)
                arcToRelative(2.04f, 2.04f, 0.0f, false, true, 1.034f, 0.603f)
                quadToRelative(0.132f, 0.143f, 0.236f, 0.305f)
                curveTo(18.43f, 10.376f, 19.0f, 9.527f, 19.0f, 8.5f)
                curveTo(19.0f, 7.085f, 17.915f, 6.0f, 16.5f, 6.0f)
                curveToRelative(-0.609f, 0.0f, -1.153f, 0.2f, -1.575f, 0.536f)
                moveToRelative(3.022f, 5.164f)
                quadToRelative(0.028f, 0.152f, 0.04f, 0.307f)
                curveToRelative(0.086f, 1.114f, -0.468f, 2.412f, -1.812f, 2.852f)
                lineToRelative(-0.311f, -0.95f)
                curveToRelative(0.801f, -0.263f, 1.186f, -1.05f, 1.126f, -1.825f)
                curveToRelative(-0.03f, -0.381f, -0.167f, -0.715f, -0.377f, -0.942f)
                curveToRelative(-0.2f, -0.216f, -0.488f, -0.359f, -0.893f, -0.343f)
                lineToRelative(-0.698f, 0.028f)
                lineToRelative(0.2f, -0.67f)
                curveToRelative(0.24f, -0.811f, 0.144f, -1.476f, -0.118f, -1.977f)
                arcToRelative(2.28f, 2.28f, 0.0f, false, false, -1.25f, -1.073f)
                curveToRelative(-1.048f, -0.38f, -2.362f, -0.045f, -2.997f, 1.395f)
                lineToRelative(-0.266f, 0.602f)
                lineToRelative(-0.508f, -0.417f)
                curveToRelative(-0.967f, -0.793f, -2.566f, -0.048f, -2.386f, 1.453f)
                lineToRelative(0.067f, 0.56f)
                horizontalLineToRelative(-0.563f)
                curveToRelative(-0.59f, 0.0f, -1.079f, 0.533f, -1.159f, 1.337f)
                curveToRelative(-0.076f, 0.769f, 0.267f, 1.548f, 1.121f, 1.838f)
                lineToRelative(-0.321f, 0.947f)
                curveToRelative(-1.397f, -0.474f, -1.905f, -1.769f, -1.795f, -2.883f)
                curveToRelative(0.092f, -0.93f, 0.65f, -1.918f, 1.639f, -2.175f)
                curveToRelative(0.093f, -1.85f, 2.007f, -2.893f, 3.522f, -2.174f)
                curveToRelative(0.887f, -1.444f, 2.421f, -1.866f, 3.733f, -1.504f)
                arcTo(3.48f, 3.48f, 0.0f, false, true, 16.5f, 5.0f)
                curveTo(18.467f, 5.0f, 20.0f, 6.533f, 20.0f, 8.5f)
                curveToRelative(0.0f, 1.443f, -0.827f, 2.659f, -2.053f, 3.2f)
                moveToRelative(-9.276f, 0.679f)
                lineTo(10.293f, 14.0f)
                horizontalLineTo(8.014f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.292f)
                lineToRelative(-1.62f, 1.62f)
                lineToRelative(0.707f, 0.708f)
                lineTo(11.0f, 15.721f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.293f)
                lineToRelative(1.621f, 1.621f)
                lineToRelative(0.707f, -0.707f)
                lineTo(12.708f, 15.0f)
                horizontalLineToRelative(2.306f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.293f)
                lineToRelative(1.622f, -1.622f)
                lineToRelative(-0.707f, -0.707f)
                lineTo(12.0f, 13.306f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.293f)
                lineTo(9.378f, 11.67f)
                close()
            }
        }
            .build()
        return _cloudSnowflakeSunSmall!!
    }

private var _cloudSnowflakeSunSmall: ImageVector? = null
