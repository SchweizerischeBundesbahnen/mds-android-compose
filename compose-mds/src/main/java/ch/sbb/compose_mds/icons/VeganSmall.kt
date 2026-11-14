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

public val SBBIcons.VeganSmall: ImageVector
    get() {
        if (_veganSmall != null) {
            return _veganSmall!!
        }
        _veganSmall = Builder(name = "VeganSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.386f, 5.683f)
                curveTo(10.262f, 3.103f, 6.998f, 2.0f, 3.5f, 2.0f)
                horizontalLineToRelative(-0.957f)
                lineToRelative(-0.104f, 0.362f)
                arcTo(11.3f, 11.3f, 0.0f, false, false, 2.0f, 5.49f)
                arcToRelative(11.89f, 11.89f, 0.0f, false, false, 5.741f, 10.439f)
                lineToRelative(0.517f, -0.856f)
                arcTo(10.89f, 10.89f, 0.0f, false, true, 3.0f, 5.511f)
                verticalLineToRelative(-0.012f)
                arcTo(10.3f, 10.3f, 0.0f, false, true, 3.304f, 3.0f)
                lineTo(3.5f, 3.0f)
                curveToRelative(3.302f, 0.0f, 6.237f, 1.038f, 8.113f, 3.317f)
                close()
                moveTo(21.412f, 4.723f)
                lineTo(21.365f, 4.426f)
                lineTo(21.298f, 3.983f)
                lineTo(20.852f, 4.0f)
                curveToRelative(-3.465f, 0.128f, -5.975f, 1.038f, -7.771f, 2.382f)
                reflectiveCurveToRelative(-2.84f, 3.094f, -3.42f, 4.837f)
                curveToRelative(-0.58f, 1.738f, -0.7f, 3.478f, -0.653f, 4.83f)
                curveToRelative(0.024f, 0.679f, 0.09f, 1.266f, 0.165f, 1.715f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 0.153f, 0.7f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, -1.776f, 3.318f)
                lineToRelative(0.9f, 0.436f)
                arcToRelative(45.0f, 45.0f, 0.0f, false, true, 1.728f, -3.23f)
                curveToRelative(3.314f, -0.167f, 5.718f, -1.06f, 7.443f, -2.365f)
                curveToRelative(1.774f, -1.343f, 2.79f, -3.091f, 3.351f, -4.831f)
                curveToRelative(0.975f, -3.023f, 0.593f, -6.071f, 0.44f, -7.07f)
                moveTo(10.815f, 17.939f)
                curveToRelative(2.793f, -0.24f, 4.784f, -1.04f, 6.203f, -2.114f)
                curveToRelative(1.578f, -1.193f, 2.49f, -2.751f, 3.003f, -4.34f)
                curveToRelative(0.86f, -2.665f, 0.578f, -5.372f, 0.422f, -6.463f)
                curveToRelative(-3.068f, 0.18f, -5.235f, 1.016f, -6.764f, 2.16f)
                curveToRelative(-1.601f, 1.198f, -2.54f, 2.762f, -3.07f, 4.352f)
                curveToRelative(-0.53f, 1.595f, -0.646f, 3.21f, -0.602f, 4.48f)
                curveToRelative(0.016f, 0.444f, 0.05f, 0.843f, 0.094f, 1.181f)
                arcToRelative(46.2f, 46.2f, 0.0f, false, true, 8.064f, -9.566f)
                lineToRelative(0.67f, 0.742f)
                arcToRelative(45.2f, 45.2f, 0.0f, false, false, -8.02f, 9.568f)
                moveTo(5.765f, 5.576f)
                arcToRelative(17.2f, 17.2f, 0.0f, false, true, 4.12f, 3.605f)
                lineToRelative(-0.77f, 0.638f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, false, -3.88f, -3.395f)
                close()
            }
        }
        .build()
        return _veganSmall!!
    }

private var _veganSmall: ImageVector? = null
