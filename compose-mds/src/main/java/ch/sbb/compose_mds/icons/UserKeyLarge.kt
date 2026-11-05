package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.UserKeyLarge: ImageVector
    get() {
        if (_userKeyLarge != null) {
            return _userKeyLarge!!
        }
        _userKeyLarge = Builder(name = "UserKeyLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(33.5f, 25.0f)
                curveToRelative(3.62f, 0.0f, 6.5f, 2.88f, 6.5f, 6.5f)
                reflectiveCurveTo(37.12f, 38.0f, 33.5f, 38.0f)
                quadToRelative(-0.571f, -0.002f, -1.115f, -0.096f)
                lineToRelative(-6.033f, 5.951f)
                lineToRelative(-0.147f, 0.144f)
                horizontalLineTo(21.0f)
                verticalLineToRelative(-5.204f)
                lineToRelative(0.144f, -0.147f)
                lineToRelative(5.948f, -6.051f)
                arcTo(6.7f, 6.7f, 0.0f, false, true, 27.0f, 31.5f)
                curveToRelative(0.0f, -3.62f, 2.88f, -6.5f, 6.5f, -6.5f)
                moveTo(22.0f, 39.203f)
                verticalLineTo(43.0f)
                horizontalLineToRelative(3.795f)
                lineToRelative(1.056f, -1.042f)
                lineToRelative(-1.104f, -1.104f)
                lineToRelative(0.707f, -0.706f)
                lineToRelative(1.108f, 1.108f)
                lineToRelative(1.302f, -1.284f)
                lineToRelative(-1.117f, -1.117f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(1.122f, 1.122f)
                lineToRelative(1.683f, -1.658f)
                arcToRelative(6.44f, 6.44f, 0.0f, false, true, -3.875f, -3.884f)
                close()
                moveTo(33.5f, 26.0f)
                arcToRelative(5.46f, 5.46f, 0.0f, false, false, -5.5f, 5.5f)
                curveToRelative(0.0f, 3.068f, 2.432f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.432f, 5.5f, -5.5f)
                reflectiveCurveToRelative(-2.432f, -5.5f, -5.5f, -5.5f)
                moveToRelative(-14.0f, -21.0f)
                curveToRelative(3.81f, 0.0f, 6.5f, 3.481f, 6.5f, 7.5f)
                curveToRelative(0.0f, 2.09f, -0.73f, 4.033f, -1.964f, 5.418f)
                curveToRelative(2.295f, 1.688f, 3.933f, 3.652f, 5.063f, 5.825f)
                lineToRelative(-0.445f, 0.23f)
                lineToRelative(-0.443f, 0.231f)
                curveToRelative(-1.08f, -2.075f, -2.657f, -3.957f, -4.906f, -5.58f)
                arcTo(5.9f, 5.9f, 0.0f, false, true, 19.5f, 20.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -3.86f, -1.422f)
                curveTo(10.737f, 22.355f, 8.3f, 27.65f, 8.02f, 35.0f)
                horizontalLineTo(21.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(6.988f)
                lineToRelative(0.013f, -0.513f)
                curveToRelative(0.19f, -7.796f, 2.688f, -13.538f, 7.919f, -17.618f)
                curveTo(13.712f, 16.487f, 13.0f, 14.565f, 13.0f, 12.5f)
                curveTo(13.0f, 8.481f, 15.69f, 5.0f, 19.5f, 5.0f)
                moveToRelative(14.004f, 24.0f)
                curveTo(34.909f, 29.0f, 36.0f, 30.1f, 36.0f, 31.498f)
                arcTo(2.47f, 2.47f, 0.0f, false, true, 33.504f, 34.0f)
                arcTo(2.48f, 2.48f, 0.0f, false, true, 31.0f, 31.498f)
                arcTo(2.475f, 2.475f, 0.0f, false, true, 33.504f, 29.0f)
                moveToRelative(0.0f, 1.0f)
                curveTo(32.65f, 30.0f, 32.0f, 30.651f, 32.0f, 31.498f)
                curveToRelative(0.0f, 0.848f, 0.652f, 1.502f, 1.504f, 1.502f)
                curveToRelative(0.85f, 0.0f, 1.496f, -0.651f, 1.496f, -1.502f)
                curveToRelative(0.0f, -0.85f, -0.645f, -1.498f, -1.496f, -1.498f)
                moveTo(19.5f, 6.0f)
                curveTo(16.398f, 6.0f, 14.0f, 8.863f, 14.0f, 12.5f)
                reflectiveCurveToRelative(2.398f, 6.5f, 5.5f, 6.5f)
                reflectiveCurveToRelative(5.5f, -2.863f, 5.5f, -6.5f)
                reflectiveCurveTo(22.602f, 6.0f, 19.5f, 6.0f)
            }
        }
        .build()
        return _userKeyLarge!!
    }

private var _userKeyLarge: ImageVector? = null
