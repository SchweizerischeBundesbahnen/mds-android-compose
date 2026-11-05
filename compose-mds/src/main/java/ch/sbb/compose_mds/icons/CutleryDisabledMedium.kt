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

public val SBBIcons.CutleryDisabledMedium: ImageVector
    get() {
        if (_cutleryDisabledMedium != null) {
            return _cutleryDisabledMedium!!
        }
        _cutleryDisabledMedium = Builder(
            name = "CutleryDisabledMedium",
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
                moveTo(10.952f, 11.659f)
                lineTo(8.92f, 9.628f)
                verticalLineToRelative(2.598f)
                horizontalLineToRelative(-1.0f)
                lineTo(7.92f, 8.628f)
                lineTo(5.876f, 6.583f)
                verticalLineToRelative(4.881f)
                lineToRelative(-0.5f, 0.001f)
                horizontalLineToRelative(-0.5f)
                lineTo(4.876f, 5.583f)
                lineTo(3.5f, 4.207f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(28.924f, 28.923f)
                lineToRelative(-0.708f, 0.708f)
                lineToRelative(-5.235f, -5.236f)
                verticalLineToRelative(4.12f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.12f)
                lineToRelative(-7.319f, -7.318f)
                horizontalLineToRelative(-2.337f)
                verticalLineToRelative(12.439f)
                horizontalLineToRelative(-1.0f)
                lineTo(15.532f, 16.239f)
                lineToRelative(-3.73f, -3.73f)
                curveToRelative(-0.063f, 0.22f, -0.15f, 0.46f, -0.27f, 0.702f)
                curveToRelative(-0.22f, 0.44f, -0.558f, 0.895f, -1.074f, 1.239f)
                curveToRelative(-0.413f, 0.275f, -0.92f, 0.466f, -1.537f, 0.533f)
                verticalLineToRelative(17.033f)
                horizontalLineToRelative(-1.0f)
                lineTo(7.921f, 14.983f)
                curveToRelative(-0.617f, -0.067f, -1.125f, -0.258f, -1.538f, -0.533f)
                arcToRelative(3.17f, 3.17f, 0.0f, false, true, -1.074f, -1.24f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, -0.433f, -1.728f)
                verticalLineToRelative(-0.017f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(0.018f)
                quadToRelative(0.0f, 0.024f, 0.005f, 0.077f)
                arcToRelative(3.242f, 3.242f, 0.0f, false, false, 0.323f, 1.204f)
                curveToRelative(0.16f, 0.32f, 0.393f, 0.627f, 0.734f, 0.854f)
                curveToRelative(0.337f, 0.225f, 0.809f, 0.392f, 1.482f, 0.392f)
                curveToRelative(0.674f, 0.0f, 1.146f, -0.167f, 1.483f, -0.392f)
                curveToRelative(0.34f, -0.227f, 0.574f, -0.533f, 0.734f, -0.854f)
                arcToRelative(3.2f, 3.2f, 0.0f, false, false, 0.314f, -1.105f)
                moveToRelative(5.58f, 5.58f)
                lineToRelative(1.337f, 1.337f)
                horizontalLineToRelative(-1.337f)
                close()
                moveTo(10.965f, 4.615f)
                verticalLineToRelative(3.044f)
                horizontalLineToRelative(1.0f)
                lineTo(11.965f, 4.615f)
                close()
                moveTo(16.032f, 4.875f)
                verticalLineToRelative(0.5f)
                close()
                horizontalLineToRelative(0.006f)
                lineToRelative(0.011f, 0.001f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.15f, 0.007f)
                arcToRelative(4.242f, 4.242f, 0.0f, false, true, 1.58f, 0.426f)
                curveToRelative(0.44f, 0.22f, 0.894f, 0.558f, 1.238f, 1.074f)
                curveToRelative(0.346f, 0.52f, 0.56f, 1.189f, 0.56f, 2.037f)
                verticalLineToRelative(6.85f)
                horizontalLineToRelative(-1.0f)
                lineTo(18.577f, 8.42f)
                curveToRelative(0.0f, -0.673f, -0.167f, -1.145f, -0.392f, -1.482f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, false, -0.854f, -0.734f)
                arcToRelative(3.2f, 3.2f, 0.0f, false, false, -0.799f, -0.268f)
                verticalLineToRelative(6.29f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-7.35f)
                close()
                moveTo(25.466f, 6.347f)
                curveToRelative(-0.61f, 0.457f, -1.322f, 1.434f, -1.322f, 3.596f)
                reflectiveCurveToRelative(0.713f, 3.139f, 1.322f, 3.596f)
                curveToRelative(0.316f, 0.237f, 0.632f, 0.355f, 0.868f, 0.414f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.345f, 0.056f)
                horizontalLineToRelative(0.018f)
                quadToRelative(0.021f, 0.0f, 0.069f, -0.005f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.277f, -0.05f)
                curveToRelative(0.235f, -0.06f, 0.551f, -0.178f, 0.867f, -0.415f)
                curveToRelative(0.61f, -0.457f, 1.323f, -1.435f, 1.323f, -3.596f)
                reflectiveCurveToRelative(-0.713f, -3.14f, -1.323f, -3.596f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, -0.867f, -0.415f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.346f, -0.056f)
                horizontalLineToRelative(-0.018f)
                lineToRelative(-0.068f, 0.006f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.277f, 0.05f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, -0.868f, 0.415f)
                moveToRelative(1.222f, -0.971f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-0.021f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.163f, 0.012f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.413f, 0.074f)
                curveToRelative(-0.335f, 0.084f, -0.78f, 0.251f, -1.225f, 0.585f)
                curveToRelative(-0.913f, 0.684f, -1.722f, 1.99f, -1.722f, 4.396f)
                reflectiveCurveToRelative(0.809f, 3.711f, 1.722f, 4.396f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, false, 1.322f, 0.607f)
                verticalLineToRelative(7.936f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-7.936f)
                quadToRelative(0.047f, -0.01f, 0.097f, -0.023f)
                curveToRelative(0.335f, -0.084f, 0.78f, -0.25f, 1.226f, -0.584f)
                curveToRelative(0.912f, -0.685f, 1.722f, -1.99f, 1.722f, -4.396f)
                reflectiveCurveToRelative(-0.81f, -3.712f, -1.723f, -4.396f)
                curveToRelative(-0.444f, -0.334f, -0.89f, -0.501f, -1.225f, -0.585f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.576f, -0.086f)
                horizontalLineToRelative(-0.02f)
                close()
            }
        }
            .build()
        return _cutleryDisabledMedium!!
    }

private var _cutleryDisabledMedium: ImageVector? = null
