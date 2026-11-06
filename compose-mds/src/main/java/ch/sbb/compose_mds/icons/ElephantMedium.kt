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

public val SBBIcons.ElephantMedium: ImageVector
    get() {
        if (_elephantMedium != null) {
            return _elephantMedium!!
        }
        _elephantMedium = Builder(name = "ElephantMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.5f, 4.75f)
                arcTo(7.25f, 7.25f, 0.0f, false, false, 3.25f, 12.0f)
                curveToRelative(0.0f, 1.575f, 0.58f, 4.826f, 1.724f, 7.64f)
                curveToRelative(0.574f, 1.409f, 1.305f, 2.747f, 2.207f, 3.716f)
                curveToRelative(0.9f, 0.967f, 2.018f, 1.61f, 3.34f, 1.504f)
                arcToRelative(4.23f, 4.23f, 0.0f, false, false, 2.609f, -0.911f)
                quadToRelative(0.305f, 0.18f, 0.626f, 0.337f)
                curveToRelative(0.104f, 2.359f, 1.478f, 4.443f, 3.348f, 5.938f)
                curveTo(19.051f, 31.78f, 21.596f, 32.75f, 24.0f, 32.75f)
                horizontalLineToRelative(4.25f)
                verticalLineToRelative(-4.0f)
                lineTo(25.5f, 28.75f)
                curveToRelative(-1.286f, 0.0f, -2.056f, -0.505f, -2.535f, -1.297f)
                curveToRelative(-0.47f, -0.777f, -0.685f, -1.876f, -0.712f, -3.171f)
                quadToRelative(0.317f, -0.156f, 0.617f, -0.333f)
                arcToRelative(4.23f, 4.23f, 0.0f, false, false, 2.608f, 0.91f)
                curveToRelative(1.323f, 0.107f, 2.44f, -0.536f, 3.341f, -1.503f)
                curveToRelative(0.902f, -0.969f, 1.633f, -2.307f, 2.207f, -3.716f)
                curveToRelative(1.145f, -2.814f, 1.724f, -6.065f, 1.724f, -7.64f)
                arcToRelative(7.25f, 7.25f, 0.0f, false, false, -12.099f, -5.39f)
                arcTo(9.9f, 9.9f, 0.0f, false, false, 18.0f, 6.25f)
                curveToRelative(-0.923f, 0.0f, -1.814f, 0.126f, -2.652f, 0.36f)
                arcTo(7.23f, 7.23f, 0.0f, false, false, 10.5f, 4.75f)
                moveToRelative(10.767f, 19.946f)
                arcTo(9.8f, 9.8f, 0.0f, false, true, 18.0f, 25.25f)
                arcToRelative(9.8f, 9.8f, 0.0f, false, true, -3.203f, -0.532f)
                curveToRelative(0.237f, 1.804f, 1.35f, 3.46f, 2.932f, 4.725f)
                curveToRelative(1.789f, 1.43f, 4.118f, 2.307f, 6.271f, 2.307f)
                horizontalLineToRelative(3.25f)
                verticalLineToRelative(-2.0f)
                lineTo(25.5f, 29.75f)
                curveToRelative(-1.614f, 0.0f, -2.719f, -0.67f, -3.39f, -1.779f)
                curveToRelative(-0.544f, -0.898f, -0.782f, -2.05f, -0.843f, -3.275f)
                moveTo(9.25f, 17.55f)
                curveToRelative(0.0f, 2.33f, 1.173f, 4.4f, 2.996f, 5.802f)
                arcToRelative(3.23f, 3.23f, 0.0f, false, true, -1.746f, 0.508f)
                horizontalLineToRelative(-0.022f)
                lineToRelative(-0.021f, 0.002f)
                curveToRelative(-0.919f, 0.08f, -1.763f, -0.348f, -2.544f, -1.188f)
                curveToRelative(-0.785f, -0.843f, -1.46f, -2.056f, -2.012f, -3.411f)
                curveTo(4.796f, 16.549f, 4.25f, 13.425f, 4.25f, 12.0f)
                arcToRelative(6.25f, 6.25f, 0.0f, false, true, 9.993f, -5.006f)
                curveToRelative(-2.923f, 1.225f, -4.991f, 3.853f, -4.993f, 6.952f)
                verticalLineToRelative(3.604f)
                moveToRelative(1.0f, 0.0f)
                verticalLineToRelative(-3.6f)
                curveToRelative(0.0f, -2.863f, 2.094f, -5.357f, 5.115f, -6.302f)
                arcTo(8.8f, 8.8f, 0.0f, false, true, 18.0f, 7.25f)
                curveToRelative(0.927f, 0.0f, 1.814f, 0.14f, 2.635f, 0.398f)
                curveToRelative(3.021f, 0.945f, 5.115f, 3.44f, 5.115f, 6.302f)
                verticalLineToRelative(3.6f)
                curveToRelative(0.0f, 2.173f, -1.201f, 4.126f, -3.103f, 5.361f)
                curveToRelative(-1.291f, 0.839f, -2.899f, 1.339f, -4.647f, 1.339f)
                reflectiveCurveToRelative(-3.356f, -0.5f, -4.647f, -1.339f)
                curveToRelative(-1.902f, -1.235f, -3.103f, -3.188f, -3.103f, -5.361f)
                moveToRelative(16.5f, -3.6f)
                verticalLineToRelative(-0.004f)
                curveToRelative(-0.002f, -3.099f, -2.07f, -5.727f, -4.992f, -6.952f)
                arcTo(6.25f, 6.25f, 0.0f, false, true, 31.75f, 12.0f)
                curveToRelative(-0.001f, 1.425f, -0.547f, 4.549f, -1.652f, 7.263f)
                curveToRelative(-0.551f, 1.355f, -1.227f, 2.568f, -2.012f, 3.411f)
                curveToRelative(-0.781f, 0.84f, -1.625f, 1.268f, -2.544f, 1.188f)
                lineToRelative(-0.021f, -0.002f)
                lineTo(25.5f, 23.86f)
                arcToRelative(3.23f, 3.23f, 0.0f, false, true, -1.746f, -0.508f)
                curveToRelative(1.823f, -1.401f, 2.996f, -3.471f, 2.996f, -5.802f)
                close()
                moveTo(13.5f, 16.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, false, 0.0f, 0.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.0f, -0.5f)
                moveToRelative(-1.25f, 0.25f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, -2.5f, 0.0f)
                moveToRelative(10.25f, -0.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, false, 0.0f, 0.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.0f, -0.5f)
                moveToRelative(-1.25f, 0.25f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, -2.5f, 0.0f)
            }
        }
        .build()
        return _elephantMedium!!
    }

private var _elephantMedium: ImageVector? = null
