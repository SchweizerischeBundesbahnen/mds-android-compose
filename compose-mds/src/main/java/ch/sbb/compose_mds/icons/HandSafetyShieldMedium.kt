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

public val SBBIcons.HandSafetyShieldMedium: ImageVector
    get() {
        if (_handSafetyShieldMedium != null) {
            return _handSafetyShieldMedium!!
        }
        _handSafetyShieldMedium = Builder(name = "HandSafetyShieldMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(18.0f, 3.238f)
                lineToRelative(0.109f, 0.024f)
                lineToRelative(6.75f, 1.5f)
                lineToRelative(0.391f, 0.087f)
                verticalLineToRelative(0.401f)
                curveToRelative(0.0f, 5.0f, -1.733f, 8.482f, -3.48f, 10.714f)
                arcToRelative(14.7f, 14.7f, 0.0f, false, true, -2.404f, 2.439f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, true, -1.031f, 0.73f)
                lineToRelative(-0.065f, 0.039f)
                lineToRelative(-0.018f, 0.01f)
                lineToRelative(-0.006f, 0.003f)
                lineToRelative(-0.002f, 0.001f)
                lineTo(18.0f, 18.75f)
                lineToRelative(-0.243f, 0.437f)
                lineToRelative(-0.003f, -0.002f)
                lineToRelative(-0.005f, -0.003f)
                lineToRelative(-0.018f, -0.01f)
                lineToRelative(-0.065f, -0.038f)
                arcToRelative(11.1f, 11.1f, 0.0f, false, true, -1.032f, -0.73f)
                arcToRelative(14.7f, 14.7f, 0.0f, false, true, -2.402f, -2.438f)
                curveToRelative(-1.748f, -2.23f, -3.482f, -5.708f, -3.482f, -10.701f)
                verticalLineToRelative(-0.4f)
                lineToRelative(0.39f, -0.088f)
                lineToRelative(6.75f, -1.515f)
                close()
                moveTo(18.0f, 18.75f)
                lineTo(18.243f, 19.187f)
                lineTo(18.0f, 19.322f)
                lineTo(17.758f, 19.187f)
                close()
                moveTo(18.0f, 18.162f)
                lineTo(18.015f, 18.152f)
                curveToRelative(0.174f, -0.114f, 0.425f, -0.29f, 0.729f, -0.531f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, false, 2.238f, -2.273f)
                curveToRelative(1.581f, -2.02f, 3.175f, -5.164f, 3.264f, -9.698f)
                lineToRelative(-6.245f, -1.388f)
                lineToRelative(-6.247f, 1.402f)
                curveToRelative(0.09f, 4.527f, 1.683f, 7.667f, 3.265f, 9.686f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, false, 2.238f, 2.27f)
                curveToRelative(0.304f, 0.242f, 0.555f, 0.418f, 0.728f, 0.532f)
                close()
                moveTo(6.48f, 20.18f)
                lineToRelative(5.755f, 4.018f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -0.005f, -0.202f)
                curveToRelative(0.005f, -0.67f, 0.234f, -1.353f, 0.702f, -1.876f)
                curveToRelative(0.475f, -0.532f, 1.174f, -0.87f, 2.053f, -0.87f)
                horizontalLineToRelative(3.358f)
                verticalLineToRelative(0.006f)
                curveToRelative(2.326f, 0.11f, 4.529f, 1.404f, 6.243f, 3.043f)
                lineToRelative(0.01f, 0.008f)
                lineToRelative(7.544f, 7.59f)
                lineToRelative(0.848f, 0.853f)
                lineTo(20.405f, 32.75f)
                lineToRelative(-0.146f, -0.145f)
                lineToRelative(-1.37f, -1.355f)
                horizontalLineToRelative(-5.893f)
                lineToRelative(-0.14f, -0.125f)
                lineToRelative(-8.89f, -7.824f)
                arcToRelative(2.003f, 2.003f, 0.0f, false, true, -0.288f, -2.812f)
                arcToRelative(2.003f, 2.003f, 0.0f, false, true, 2.803f, -0.31f)
                moveToRelative(11.665f, 2.07f)
                horizontalLineToRelative(-3.16f)
                curveToRelative(-0.605f, 0.0f, -1.03f, 0.224f, -1.308f, 0.536f)
                curveToRelative(-0.287f, 0.321f, -0.443f, 0.762f, -0.447f, 1.218f)
                reflectiveCurveToRelative(0.145f, 0.893f, 0.427f, 1.21f)
                curveToRelative(0.274f, 0.309f, 0.7f, 0.536f, 1.329f, 0.536f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.88f, 0.0f, -1.577f, -0.325f, -2.053f, -0.845f)
                lineTo(5.894f, 20.99f)
                lineToRelative(-0.015f, -0.01f)
                lineToRelative(-0.014f, -0.012f)
                arcToRelative(1.003f, 1.003f, 0.0f, false, false, -1.412f, 0.153f)
                arcToRelative(1.003f, 1.003f, 0.0f, false, false, 0.153f, 1.411f)
                lineToRelative(0.008f, 0.006f)
                lineToRelative(0.007f, 0.007f)
                lineToRelative(8.753f, 7.705f)
                horizontalLineToRelative(5.927f)
                lineToRelative(0.146f, 0.145f)
                lineToRelative(1.37f, 1.355f)
                horizontalLineToRelative(9.767f)
                lineToRelative(-6.694f, -6.733f)
                curveToRelative(-1.658f, -1.585f, -3.7f, -2.724f, -5.745f, -2.767f)
                moveToRelative(-0.466f, -9.896f)
                lineToRelative(3.75f, -3.75f)
                lineToRelative(-0.707f, -0.708f)
                lineToRelative(-3.397f, 3.397f)
                lineToRelative(-1.521f, -1.522f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(1.874f, 1.876f)
                lineToRelative(0.354f, 0.353f)
                close()
            }
        }
        .build()
        return _handSafetyShieldMedium!!
    }

private var _handSafetyShieldMedium: ImageVector? = null
