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

public val SBBIcons.EiffelTowerMedium: ImageVector
    get() {
        if (_eiffelTowerMedium != null) {
            return _eiffelTowerMedium!!
        }
        _eiffelTowerMedium = Builder(name = "EiffelTowerMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(19.247f, 3.7f)
                lineToRelative(-0.045f, -0.45f)
                horizontalLineToRelative(-2.401f)
                lineToRelative(-0.048f, 0.446f)
                arcToRelative(109.0f, 109.0f, 0.0f, false, true, -4.36f, 20.9f)
                arcToRelative(48.3f, 48.3f, 0.0f, false, true, -3.087f, 7.424f)
                lineToRelative(-0.377f, 0.73f)
                horizontalLineToRelative(6.57f)
                verticalLineToRelative(-0.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 5.0f, 0.0f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(6.581f)
                lineToRelative(-0.388f, -0.733f)
                lineToRelative(-0.261f, -0.504f)
                curveToRelative(-2.67f, -5.256f, -4.455f, -12.064f, -5.579f, -17.65f)
                curveToRelative(-0.578f, -2.878f, -0.98f, -5.42f, -1.237f, -7.244f)
                arcToRelative(103.0f, 103.0f, 0.0f, false, true, -0.347f, -2.722f)
                lineToRelative(-0.012f, -0.113f)
                quadToRelative(0.0f, -0.02f, -0.003f, -0.035f)
                lineToRelative(-0.004f, -0.038f)
                lineToRelative(-0.001f, -0.009f)
                close()
                moveTo(17.247f, 7.75f)
                quadToRelative(0.252f, -1.745f, 0.45f, -3.5f)
                horizontalLineToRelative(0.606f)
                lineToRelative(0.011f, 0.102f)
                lineToRelative(0.028f, 0.24f)
                arcToRelative(103.0f, 103.0f, 0.0f, false, false, 0.427f, 3.158f)
                close()
                moveTo(17.097f, 8.75f)
                arcToRelative(110.0f, 110.0f, 0.0f, false, true, -1.537f, 8.0f)
                horizontalLineToRelative(4.886f)
                curveToRelative(-0.208f, -0.921f, -0.4f, -1.821f, -0.574f, -2.69f)
                arcToRelative(128.0f, 128.0f, 0.0f, false, true, -0.95f, -5.31f)
                close()
                moveTo(20.677f, 17.75f)
                horizontalLineToRelative(-5.353f)
                arcToRelative(110.0f, 110.0f, 0.0f, false, true, -1.776f, 6.5f)
                horizontalLineToRelative(8.913f)
                arcToRelative(89.0f, 89.0f, 0.0f, false, true, -1.784f, -6.5f)
                moveToRelative(2.111f, 7.5f)
                horizontalLineToRelative(-9.555f)
                arcToRelative(49.0f, 49.0f, 0.0f, false, true, -2.672f, 6.5f)
                horizontalLineToRelative(3.975f)
                arcToRelative(3.499f, 3.499f, 0.0f, false, true, 6.928f, 0.0f)
                horizontalLineToRelative(3.969f)
                curveToRelative(-1.005f, -2.01f, -1.882f, -4.224f, -2.645f, -6.5f)
            }
        }
        .build()
        return _eiffelTowerMedium!!
    }

private var _eiffelTowerMedium: ImageVector? = null
