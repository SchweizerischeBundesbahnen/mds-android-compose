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

public val SBBIcons.UserGroupRoundTableSmall: ImageVector
    get() {
        if (_userGroupRoundTableSmall != null) {
            return _userGroupRoundTableSmall!!
        }
        _userGroupRoundTableSmall = Builder(name = "UserGroupRoundTableSmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.5f, 6.0f)
                curveToRelative(0.73f, 0.0f, 1.5f, 0.785f, 1.5f, 2.0f)
                reflectiveCurveToRelative(-0.77f, 2.0f, -1.5f, 2.0f)
                reflectiveCurveTo(10.0f, 9.215f, 10.0f, 8.0f)
                reflectiveCurveToRelative(0.77f, -2.0f, 1.5f, -2.0f)
                moveToRelative(1.941f, 3.892f)
                arcTo(3.43f, 3.43f, 0.0f, false, false, 14.0f, 8.0f)
                curveToRelative(0.0f, -1.547f, -1.022f, -3.0f, -2.5f, -3.0f)
                reflectiveCurveTo(9.0f, 6.453f, 9.0f, 8.0f)
                curveToRelative(0.0f, 0.69f, 0.203f, 1.36f, 0.558f, 1.892f)
                curveToRelative(-0.342f, 0.343f, -0.636f, 0.77f, -0.873f, 1.257f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.24f, -0.262f)
                curveTo(8.8f, 10.356f, 9.0f, 9.687f, 9.0f, 9.0f)
                curveToRelative(0.0f, -1.547f, -1.022f, -3.0f, -2.5f, -3.0f)
                reflectiveCurveTo(4.0f, 7.453f, 4.0f, 9.0f)
                curveToRelative(0.0f, 0.687f, 0.201f, 1.356f, 0.555f, 1.886f)
                curveToRelative(-0.89f, 0.889f, -1.457f, 2.348f, -1.539f, 3.963f)
                lineToRelative(-0.119f, 0.09f)
                curveTo(2.385f, 15.344f, 2.0f, 15.868f, 2.0f, 16.5f)
                reflectiveCurveToRelative(0.385f, 1.157f, 0.897f, 1.56f)
                curveToRelative(0.518f, 0.409f, 1.237f, 0.755f, 2.08f, 1.036f)
                curveTo(6.67f, 19.66f, 8.977f, 20.0f, 11.5f, 20.0f)
                reflectiveCurveToRelative(4.83f, -0.34f, 6.523f, -0.904f)
                curveToRelative(0.843f, -0.281f, 1.562f, -0.627f, 2.08f, -1.035f)
                curveToRelative(0.512f, -0.404f, 0.897f, -0.928f, 0.897f, -1.561f)
                reflectiveCurveToRelative(-0.385f, -1.157f, -0.898f, -1.56f)
                lineToRelative(-0.117f, -0.09f)
                curveToRelative(-0.08f, -1.616f, -0.646f, -3.077f, -1.539f, -3.966f)
                curveTo(18.8f, 10.355f, 19.0f, 9.686f, 19.0f, 9.0f)
                curveToRelative(0.0f, -1.547f, -1.022f, -3.0f, -2.5f, -3.0f)
                reflectiveCurveTo(14.0f, 7.453f, 14.0f, 9.0f)
                curveToRelative(0.0f, 0.687f, 0.201f, 1.354f, 0.554f, 1.885f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.24f, 0.262f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, false, -0.873f, -1.255f)
                moveToRelative(1.294f, 2.396f)
                quadToRelative(0.12f, 0.45f, 0.184f, 0.931f)
                curveToRelative(1.165f, 0.156f, 2.218f, 0.39f, 3.104f, 0.685f)
                quadToRelative(0.48f, 0.16f, 0.9f, 0.348f)
                curveToRelative(-0.167f, -1.15f, -0.613f, -2.084f, -1.171f, -2.648f)
                arcToRelative(2.17f, 2.17f, 0.0f, false, true, -2.504f, 0.0f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, false, -0.513f, 0.684f)
                moveTo(4.078f, 14.25f)
                quadToRelative(0.42f, -0.187f, 0.9f, -0.347f)
                curveToRelative(0.885f, -0.295f, 1.939f, -0.529f, 3.104f, -0.685f)
                quadToRelative(0.064f, -0.48f, 0.183f, -0.93f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, false, -0.515f, -0.683f)
                arcTo(2.17f, 2.17f, 0.0f, false, true, 6.5f, 12.0f)
                arcToRelative(2.17f, 2.17f, 0.0f, false, true, -1.249f, -0.394f)
                curveToRelative(-0.557f, 0.564f, -1.004f, 1.497f, -1.173f, 2.645f)
                moveToRelative(5.031f, -1.146f)
                arcTo(27.0f, 27.0f, 0.0f, false, true, 11.5f, 13.0f)
                curveToRelative(0.825f, 0.0f, 1.626f, 0.036f, 2.39f, 0.105f)
                curveToRelative(-0.183f, -1.084f, -0.614f, -1.958f, -1.145f, -2.496f)
                arcTo(2.17f, 2.17f, 0.0f, false, true, 11.5f, 11.0f)
                arcToRelative(2.17f, 2.17f, 0.0f, false, true, -1.245f, -0.39f)
                curveToRelative(-0.53f, 0.537f, -0.962f, 1.411f, -1.146f, 2.495f)
                moveToRelative(10.374f, 2.62f)
                curveToRelative(0.399f, 0.314f, 0.517f, 0.58f, 0.517f, 0.775f)
                reflectiveCurveToRelative(-0.118f, 0.461f, -0.517f, 0.775f)
                curveToRelative(-0.392f, 0.31f, -0.992f, 0.61f, -1.777f, 0.873f)
                curveToRelative(-1.565f, 0.521f, -3.76f, 0.852f, -6.206f, 0.852f)
                reflectiveCurveToRelative(-4.64f, -0.33f, -6.206f, -0.852f)
                curveToRelative(-0.785f, -0.262f, -1.385f, -0.563f, -1.777f, -0.873f)
                curveToRelative(-0.399f, -0.314f, -0.517f, -0.58f, -0.517f, -0.775f)
                reflectiveCurveToRelative(0.118f, -0.461f, 0.517f, -0.775f)
                curveToRelative(0.392f, -0.31f, 0.992f, -0.61f, 1.777f, -0.873f)
                curveTo(6.859f, 14.331f, 9.054f, 14.0f, 11.5f, 14.0f)
                reflectiveCurveToRelative(4.64f, 0.33f, 6.206f, 0.852f)
                curveToRelative(0.785f, 0.262f, 1.385f, 0.563f, 1.777f, 0.873f)
                moveTo(16.5f, 7.0f)
                curveToRelative(0.73f, 0.0f, 1.5f, 0.785f, 1.5f, 2.0f)
                reflectiveCurveToRelative(-0.77f, 2.0f, -1.5f, 2.0f)
                reflectiveCurveToRelative(-1.5f, -0.785f, -1.5f, -2.0f)
                reflectiveCurveToRelative(0.77f, -2.0f, 1.5f, -2.0f)
                moveTo(8.0f, 9.0f)
                curveToRelative(0.0f, -1.215f, -0.77f, -2.0f, -1.5f, -2.0f)
                reflectiveCurveTo(5.0f, 7.785f, 5.0f, 9.0f)
                reflectiveCurveToRelative(0.77f, 2.0f, 1.5f, 2.0f)
                reflectiveCurveTo(8.0f, 10.215f, 8.0f, 9.0f)
            }
        }
        .build()
        return _userGroupRoundTableSmall!!
    }

private var _userGroupRoundTableSmall: ImageVector? = null
