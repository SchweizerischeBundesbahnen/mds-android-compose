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

public val SBBIcons.GunMedium: ImageVector
    get() {
        if (_gunMedium != null) {
            return _gunMedium!!
        }
        _gunMedium = Builder(name = "GunMedium", defaultWidth = 36.0.dp, defaultHeight = 36.0.dp,
                viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(29.75f, 7.813f)
                curveToRelative(0.704f, 0.18f, 1.258f, 0.734f, 1.439f, 1.437f)
                horizontalLineToRelative(1.561f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(1.118f)
                lineToRelative(-0.053f, 0.106f)
                lineToRelative(-1.5f, 3.0f)
                lineToRelative(-0.138f, 0.276f)
                horizontalLineToRelative(-8.944f)
                curveToRelative(-0.246f, 1.683f, -0.765f, 2.929f, -1.44f, 3.843f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, -2.505f, 1.89f)
                arcToRelative(6.26f, 6.26f, 0.0f, false, true, -2.738f, 0.339f)
                lineToRelative(-0.682f, 5.463f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 1.967f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-0.032f)
                lineToRelative(0.004f, -0.03f)
                lineToRelative(1.43f, -11.44f)
                lineToRelative(-0.934f, 0.002f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(4.75f, 10.25f)
                lineTo(3.0f, 10.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.813f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.937f, -1.5f)
                horizontalLineToRelative(22.0f)
                lineTo(28.75f, 6.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(31.75f, 10.75f)
                horizontalLineToRelative(-0.499f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(0.499f)
                close()
                moveTo(19.603f, 16.25f)
                horizontalLineToRelative(-4.912f)
                lineToRelative(-0.03f, 0.25f)
                horizontalLineToRelative(0.09f)
                curveToRelative(0.0f, 0.967f, 0.784f, 1.75f, 1.75f, 1.75f)
                verticalLineToRelative(1.0f)
                arcToRelative(2.74f, 2.74f, 0.0f, false, true, -2.067f, -0.937f)
                lineToRelative(-0.377f, 3.016f)
                quadToRelative(0.154f, 0.014f, 0.348f, 0.02f)
                arcToRelative(5.3f, 5.3f, 0.0f, false, false, 1.92f, -0.305f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, false, 2.045f, -1.545f)
                curveToRelative(0.542f, -0.733f, 1.0f, -1.773f, 1.233f, -3.249f)
                moveTo(6.75f, 8.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(24.5f)
                lineToRelative(0.002f, -2.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
                moveTo(5.75f, 14.252f)
                lineTo(5.75f, 13.25f)
                horizontalLineToRelative(24.191f)
                lineToRelative(-1.0f, 2.0f)
                lineTo(13.809f, 15.25f)
                lineToRelative(-0.055f, 0.438f)
                lineToRelative(-1.5f, 12.001f)
                lineToRelative(-0.004f, 0.031f)
                verticalLineToRelative(0.032f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -0.973f)
                lineToRelative(1.496f, -11.967f)
                lineToRelative(0.07f, -0.563f)
                lineToRelative(-0.567f, 0.001f)
                lineToRelative(-1.499f, 0.002f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
            }
        }
        .build()
        return _gunMedium!!
    }

private var _gunMedium: ImageVector? = null
