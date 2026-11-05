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
                moveTo(10.25f, 9.0f)
                curveToRelative(0.0f, -2.68f, 1.762f, -4.75f, 4.0f, -4.75f)
                reflectiveCurveToRelative(4.0f, 2.07f, 4.0f, 4.75f)
                reflectiveCurveToRelative(-1.762f, 4.75f, -4.0f, 4.75f)
                reflectiveCurveToRelative(-4.0f, -2.07f, -4.0f, -4.75f)
                moveToRelative(4.0f, -5.75f)
                curveToRelative(-2.946f, 0.0f, -5.0f, 2.688f, -5.0f, 5.75f)
                curveToRelative(0.0f, 1.525f, 0.51f, 2.957f, 1.384f, 4.01f)
                curveToRelative(-3.888f, 3.083f, -5.741f, 7.403f, -5.883f, 13.228f)
                lineToRelative(-0.012f, 0.512f)
                lineTo(15.0f, 26.75f)
                verticalLineToRelative(-1.0f)
                lineTo(5.768f, 25.75f)
                curveToRelative(0.23f, -5.375f, 2.021f, -9.252f, 5.582f, -12.03f)
                arcToRelative(4.55f, 4.55f, 0.0f, false, false, 2.9f, 1.03f)
                curveToRelative(1.097f, 0.0f, 2.071f, -0.373f, 2.86f, -1.0f)
                curveToRelative(1.63f, 1.194f, 2.775f, 2.57f, 3.563f, 4.085f)
                lineToRelative(0.887f, -0.461f)
                curveToRelative(-0.838f, -1.612f, -2.044f, -3.07f, -3.723f, -4.33f)
                curveToRelative(0.893f, -1.056f, 1.413f, -2.503f, 1.413f, -4.044f)
                curveToRelative(0.0f, -3.062f, -2.054f, -5.75f, -5.0f, -5.75f)
                moveToRelative(6.5f, 20.0f)
                curveToRelative(0.0f, -2.232f, 1.768f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.768f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.768f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.768f, -4.0f, -4.0f)
                moveToRelative(4.0f, -5.0f)
                curveToRelative(-2.784f, 0.0f, -5.0f, 2.216f, -5.0f, 5.0f)
                quadToRelative(0.0f, 0.4f, 0.06f, 0.781f)
                lineToRelative(-4.417f, 4.493f)
                lineToRelative(-0.143f, 0.146f)
                verticalLineToRelative(4.079f)
                horizontalLineToRelative(4.08f)
                lineToRelative(0.146f, -0.144f)
                lineToRelative(4.479f, -4.416f)
                quadToRelative(0.388f, 0.06f, 0.795f, 0.061f)
                curveToRelative(2.784f, 0.0f, 5.0f, -2.216f, 5.0f, -5.0f)
                reflectiveCurveToRelative(-2.216f, -5.0f, -5.0f, -5.0f)
                moveToRelative(-1.907f, 9.63f)
                arcToRelative(4.96f, 4.96f, 0.0f, false, true, -2.728f, -2.734f)
                lineTo(16.25f, 29.08f)
                verticalLineToRelative(2.67f)
                horizontalLineToRelative(2.67f)
                close()
                moveTo(24.753f, 22.25f)
                arcToRelative(0.98f, 0.98f, 0.0f, false, false, -1.003f, 0.999f)
                arcToRelative(0.984f, 0.984f, 0.0f, false, false, 1.003f, 1.001f)
                arcToRelative(0.98f, 0.98f, 0.0f, false, false, 0.997f, -1.001f)
                arcToRelative(0.976f, 0.976f, 0.0f, false, false, -0.997f, -0.999f)
                moveToRelative(-2.003f, 0.999f)
                curveToRelative(0.0f, -1.121f, 0.882f, -1.999f, 2.003f, -1.999f)
                curveToRelative(1.124f, 0.0f, 1.997f, 0.88f, 1.997f, 1.999f)
                arcToRelative(1.98f, 1.98f, 0.0f, false, true, -1.997f, 2.001f)
                arcToRelative(1.984f, 1.984f, 0.0f, false, true, -2.003f, -2.001f)
            }
        }
        .build()
        return _userKeyMedium!!
    }

private var _userKeyMedium: ImageVector? = null
