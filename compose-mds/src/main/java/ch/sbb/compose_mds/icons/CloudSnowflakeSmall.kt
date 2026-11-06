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
                moveTo(16.312f, 9.859f)
                curveToRelative(0.413f, 0.098f, 0.763f, 0.31f, 1.034f, 0.603f)
                curveToRelative(0.39f, 0.421f, 0.598f, 0.982f, 0.641f, 1.545f)
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
                lineToRelative(-0.508f, -0.418f)
                curveToRelative(-0.967f, -0.792f, -2.566f, -0.047f, -2.386f, 1.454f)
                lineToRelative(0.067f, 0.56f)
                horizontalLineToRelative(-0.563f)
                curveToRelative(-0.59f, 0.0f, -1.079f, 0.533f, -1.159f, 1.337f)
                curveToRelative(-0.076f, 0.769f, 0.267f, 1.548f, 1.121f, 1.838f)
                lineToRelative(-0.321f, 0.947f)
                curveToRelative(-1.397f, -0.474f, -1.905f, -1.769f, -1.795f, -2.884f)
                curveToRelative(0.092f, -0.928f, 0.65f, -1.917f, 1.639f, -2.174f)
                curveToRelative(0.093f, -1.85f, 2.007f, -2.893f, 3.522f, -2.174f)
                curveToRelative(0.945f, -1.539f, 2.624f, -1.917f, 3.987f, -1.423f)
                curveToRelative(0.745f, 0.27f, 1.404f, 0.803f, 1.795f, 1.55f)
                curveToRelative(0.318f, 0.608f, 0.448f, 1.336f, 0.322f, 2.142f)
                moveToRelative(-7.64f, 2.52f)
                lineToRelative(1.62f, 1.62f)
                horizontalLineTo(8.015f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.292f)
                lineToRelative(-1.62f, 1.622f)
                lineToRelative(0.707f, 0.707f)
                lineTo(11.0f, 15.72f)
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
        return _cloudSnowflakeSmall!!
    }

private var _cloudSnowflakeSmall: ImageVector? = null
