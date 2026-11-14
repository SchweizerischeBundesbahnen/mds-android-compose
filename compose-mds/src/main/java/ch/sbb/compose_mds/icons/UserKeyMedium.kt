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

public val SBBIcons.UserKeyMedium: ImageVector
    get() {
        if (_userKeyMedium != null) {
            return _userKeyMedium!!
        }
        _userKeyMedium = Builder(name = "UserKeyMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.25f, 4.25f)
                curveToRelative(2.238f, 0.0f, 4.0f, 2.07f, 4.0f, 4.75f)
                reflectiveCurveToRelative(-1.762f, 4.75f, -4.0f, 4.75f)
                reflectiveCurveToRelative(-4.0f, -2.07f, -4.0f, -4.75f)
                reflectiveCurveToRelative(1.762f, -4.75f, 4.0f, -4.75f)
                moveToRelative(0.0f, 10.5f)
                arcToRelative(4.55f, 4.55f, 0.0f, false, false, 2.86f, -1.0f)
                curveToRelative(1.63f, 1.194f, 2.775f, 2.571f, 3.562f, 4.085f)
                lineToRelative(0.888f, -0.462f)
                curveToRelative(-0.838f, -1.611f, -2.045f, -3.07f, -3.723f, -4.328f)
                curveTo(18.73f, 11.988f, 19.25f, 10.54f, 19.25f, 9.0f)
                curveToRelative(0.0f, -3.062f, -2.054f, -5.75f, -5.0f, -5.75f)
                reflectiveCurveToRelative(-5.0f, 2.688f, -5.0f, 5.75f)
                curveToRelative(0.0f, 1.524f, 0.51f, 2.956f, 1.384f, 4.01f)
                curveToRelative(-3.888f, 3.082f, -5.742f, 7.403f, -5.883f, 13.227f)
                lineToRelative(-0.013f, 0.513f)
                horizontalLineToRelative(10.263f)
                verticalLineToRelative(-1.0f)
                lineTo(5.768f, 25.75f)
                curveTo(6.0f, 20.375f, 7.79f, 16.498f, 11.35f, 13.72f)
                arcToRelative(4.55f, 4.55f, 0.0f, false, false, 2.9f, 1.03f)
                moveToRelative(10.5f, 4.5f)
                curveToRelative(2.232f, 0.0f, 4.0f, 1.768f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.768f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.768f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.768f, -4.0f, 4.0f, -4.0f)
                moveToRelative(0.0f, 9.0f)
                curveToRelative(2.784f, 0.0f, 5.0f, -2.216f, 5.0f, -5.0f)
                reflectiveCurveToRelative(-2.216f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.216f, -5.0f, 5.0f)
                quadToRelative(0.0f, 0.4f, 0.06f, 0.78f)
                lineToRelative(-4.417f, 4.494f)
                lineToRelative(-0.143f, 0.145f)
                verticalLineToRelative(4.08f)
                horizontalLineToRelative(4.08f)
                lineToRelative(0.146f, -0.144f)
                lineToRelative(4.478f, -4.417f)
                quadToRelative(0.39f, 0.062f, 0.796f, 0.062f)
                moveToRelative(-1.907f, -0.37f)
                arcToRelative(4.96f, 4.96f, 0.0f, false, true, -2.728f, -2.733f)
                lineToRelative(-3.865f, 3.932f)
                verticalLineToRelative(2.67f)
                horizontalLineToRelative(2.669f)
                close()
                moveTo(19.476f, 32.605f)
                lineTo(19.125f, 32.25f)
                verticalLineToRelative(-0.002f)
                close()
                moveTo(25.75f, 23.248f)
                arcToRelative(0.976f, 0.976f, 0.0f, false, false, -0.997f, -0.998f)
                arcToRelative(0.98f, 0.98f, 0.0f, false, false, -1.003f, 0.998f)
                arcToRelative(0.984f, 0.984f, 0.0f, false, false, 1.003f, 1.002f)
                arcToRelative(0.98f, 0.98f, 0.0f, false, false, 0.997f, -1.002f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(1.98f, 1.98f, 0.0f, false, true, -1.997f, 2.002f)
                arcToRelative(1.984f, 1.984f, 0.0f, false, true, -2.003f, -2.002f)
                curveToRelative(0.0f, -1.12f, 0.882f, -1.998f, 2.003f, -1.998f)
                curveToRelative(1.123f, 0.0f, 1.997f, 0.88f, 1.997f, 1.998f)
            }
        }
        .build()
        return _userKeyMedium!!
    }

private var _userKeyMedium: ImageVector? = null
