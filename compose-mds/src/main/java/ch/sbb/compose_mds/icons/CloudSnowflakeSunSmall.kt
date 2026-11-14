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
        _cloudSnowflakeSunSmall = Builder(name = "CloudSnowflakeSunSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.5f, 6.0f)
                curveTo(17.915f, 6.0f, 19.0f, 7.085f, 19.0f, 8.5f)
                curveToRelative(0.0f, 1.027f, -0.571f, 1.875f, -1.418f, 2.267f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.236f, -0.305f)
                arcToRelative(2.04f, 2.04f, 0.0f, false, false, -1.035f, -0.6f)
                curveToRelative(0.126f, -0.807f, -0.002f, -1.537f, -0.322f, -2.146f)
                arcToRelative(3.2f, 3.2f, 0.0f, false, false, -1.064f, -1.18f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 16.5f, 6.0f)
                moveToRelative(-2.56f, 0.086f)
                arcTo(3.49f, 3.49f, 0.0f, false, true, 16.5f, 5.0f)
                curveTo(18.467f, 5.0f, 20.0f, 6.533f, 20.0f, 8.5f)
                curveToRelative(0.0f, 1.443f, -0.826f, 2.659f, -2.053f, 3.2f)
                quadToRelative(0.03f, 0.153f, 0.04f, 0.307f)
                curveToRelative(0.087f, 1.114f, -0.468f, 2.412f, -1.812f, 2.852f)
                lineToRelative(-0.31f, -0.95f)
                curveToRelative(0.8f, -0.263f, 1.185f, -1.05f, 1.125f, -1.825f)
                curveToRelative(-0.03f, -0.381f, -0.167f, -0.715f, -0.377f, -0.941f)
                curveToRelative(-0.201f, -0.217f, -0.488f, -0.36f, -0.892f, -0.343f)
                lineToRelative(-0.698f, 0.027f)
                lineToRelative(0.198f, -0.67f)
                curveToRelative(0.241f, -0.811f, 0.145f, -1.475f, -0.117f, -1.976f)
                arcToRelative(2.28f, 2.28f, 0.0f, false, false, -1.25f, -1.074f)
                curveToRelative(-1.049f, -0.38f, -2.362f, -0.045f, -2.997f, 1.395f)
                lineToRelative(-0.266f, 0.602f)
                lineToRelative(-0.509f, -0.417f)
                curveToRelative(-0.966f, -0.792f, -2.566f, -0.048f, -2.386f, 1.454f)
                lineToRelative(0.068f, 0.56f)
                horizontalLineTo(7.2f)
                curveToRelative(-0.589f, 0.0f, -1.078f, 0.532f, -1.158f, 1.336f)
                curveToRelative(-0.076f, 0.769f, 0.267f, 1.548f, 1.121f, 1.838f)
                lineToRelative(-0.321f, 0.947f)
                curveToRelative(-1.397f, -0.474f, -1.905f, -1.769f, -1.795f, -2.883f)
                curveToRelative(0.092f, -0.93f, 0.65f, -1.916f, 1.64f, -2.173f)
                curveToRelative(0.091f, -1.85f, 2.005f, -2.894f, 3.52f, -2.176f)
                curveToRelative(0.887f, -1.444f, 2.422f, -1.866f, 3.733f, -1.504f)
                moveToRelative(0.389f, 10.536f)
                lineTo(12.707f, 15.0f)
                horizontalLineToRelative(2.307f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.293f)
                lineToRelative(1.622f, -1.622f)
                lineToRelative(-0.707f, -0.707f)
                lineTo(12.0f, 13.307f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.293f)
                lineToRelative(-1.622f, -1.622f)
                lineToRelative(-0.707f, 0.707f)
                lineTo(10.293f, 14.0f)
                horizontalLineTo(8.014f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.293f)
                lineToRelative(-1.622f, 1.621f)
                lineToRelative(0.708f, 0.707f)
                lineTo(11.0f, 15.721f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.293f)
                lineToRelative(1.621f, 1.622f)
                close()
            }
        }
        .build()
        return _cloudSnowflakeSunSmall!!
    }

private var _cloudSnowflakeSunSmall: ImageVector? = null
