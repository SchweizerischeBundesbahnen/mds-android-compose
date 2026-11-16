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

public val SBBIcons.CloudSnowflakeSmall: ImageVector
    get() {
        if (_cloudSnowflakeSmall != null) {
            return _cloudSnowflakeSmall!!
        }
        _cloudSnowflakeSmall = Builder(name = "CloudSnowflakeSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.207f, 7.59f)
                curveToRelative(0.946f, -1.539f, 2.626f, -1.917f, 3.988f, -1.423f)
                curveToRelative(0.745f, 0.27f, 1.404f, 0.803f, 1.794f, 1.549f)
                curveToRelative(0.32f, 0.609f, 0.448f, 1.339f, 0.322f, 2.145f)
                curveToRelative(0.413f, 0.098f, 0.764f, 0.308f, 1.035f, 0.6f)
                curveToRelative(0.39f, 0.422f, 0.598f, 0.983f, 0.642f, 1.546f)
                curveToRelative(0.086f, 1.114f, -0.469f, 2.412f, -1.813f, 2.852f)
                lineToRelative(-0.31f, -0.95f)
                curveToRelative(0.8f, -0.263f, 1.185f, -1.051f, 1.125f, -1.825f)
                curveToRelative(-0.03f, -0.381f, -0.167f, -0.715f, -0.377f, -0.941f)
                curveToRelative(-0.201f, -0.217f, -0.488f, -0.36f, -0.892f, -0.343f)
                lineToRelative(-0.698f, 0.027f)
                lineToRelative(0.198f, -0.67f)
                curveToRelative(0.241f, -0.812f, 0.145f, -1.476f, -0.117f, -1.976f)
                arcToRelative(2.28f, 2.28f, 0.0f, false, false, -1.25f, -1.074f)
                curveToRelative(-1.049f, -0.38f, -2.362f, -0.045f, -2.997f, 1.395f)
                lineToRelative(-0.266f, 0.601f)
                lineToRelative(-0.509f, -0.417f)
                curveToRelative(-0.966f, -0.791f, -2.566f, -0.047f, -2.386f, 1.455f)
                lineToRelative(0.068f, 0.56f)
                horizontalLineTo(7.2f)
                curveToRelative(-0.589f, 0.0f, -1.078f, 0.532f, -1.158f, 1.336f)
                curveToRelative(-0.076f, 0.769f, 0.267f, 1.548f, 1.121f, 1.838f)
                lineToRelative(-0.321f, 0.947f)
                curveToRelative(-1.397f, -0.474f, -1.905f, -1.769f, -1.795f, -2.884f)
                curveToRelative(0.092f, -0.928f, 0.65f, -1.915f, 1.64f, -2.172f)
                curveToRelative(0.091f, -1.85f, 2.005f, -2.894f, 3.52f, -2.176f)
                moveToRelative(4.122f, 9.032f)
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
                lineTo(9.378f, 11.67f)
                lineToRelative(-0.707f, 0.707f)
                lineTo(10.293f, 14.0f)
                horizontalLineTo(8.014f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.293f)
                lineTo(8.685f, 16.62f)
                lineToRelative(0.708f, 0.707f)
                lineTo(11.0f, 15.721f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.293f)
                lineToRelative(1.621f, 1.621f)
                close()
            }
        }
        .build()
        return _cloudSnowflakeSmall!!
    }

private var _cloudSnowflakeSmall: ImageVector? = null
