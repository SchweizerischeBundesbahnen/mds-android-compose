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

public val SBBIcons.ClipboardUsersMedium: ImageVector
    get() {
        if (_clipboardUsersMedium != null) {
            return _clipboardUsersMedium!!
        }
        _clipboardUsersMedium = Builder(name = "ClipboardUsersMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.25f, 3.25f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(1.5f)
                lineTo(3.25f, 4.75f)
                verticalLineToRelative(26.5f)
                horizontalLineToRelative(29.5f)
                lineTo(32.75f, 4.75f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-9.5f)
                moveToRelative(9.5f, 3.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-9.5f)
                verticalLineToRelative(24.5f)
                horizontalLineToRelative(27.5f)
                lineTo(31.75f, 5.75f)
                horizontalLineToRelative(-8.0f)
                close()
                moveTo(22.75f, 6.25f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(16.5f, 11.75f)
                lineTo(6.0f, 11.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(10.5f)
                close()
                moveTo(6.0f, 16.25f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(-1.0f)
                lineTo(6.0f, 15.25f)
                close()
                moveTo(10.5f, 20.75f)
                lineTo(6.0f, 20.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.5f)
                close()
                moveTo(17.725f, 16.98f)
                curveToRelative(0.0f, 0.805f, 0.238f, 1.569f, 0.647f, 2.183f)
                curveToRelative(-2.43f, 1.287f, -3.737f, 4.283f, -3.737f, 7.087f)
                verticalLineToRelative(0.5f)
                lineTo(27.11f, 26.75f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.713f, -0.086f, -1.436f, -0.254f, -2.14f)
                horizontalLineToRelative(2.894f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -2.816f, -1.366f, -5.754f, -3.786f, -7.029f)
                curveToRelative(0.434f, -0.63f, 0.681f, -1.42f, 0.681f, -2.241f)
                curveToRelative(0.0f, -1.87f, -1.286f, -3.59f, -3.14f, -3.59f)
                curveToRelative(-0.856f, 0.0f, -1.647f, 0.275f, -2.227f, 0.828f)
                curveToRelative(-0.488f, 0.465f, -0.798f, 1.097f, -0.886f, 1.852f)
                curveToRelative(-1.558f, 0.264f, -2.667f, 1.811f, -2.667f, 3.55f)
                moveToRelative(7.518f, 0.362f)
                curveToRelative(-0.386f, 0.294f, -0.84f, 0.493f, -1.344f, 0.562f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -0.55f, 1.271f)
                curveToRelative(1.514f, 0.8f, 2.603f, 2.264f, 3.208f, 3.935f)
                horizontalLineToRelative(2.177f)
                curveToRelative(-0.157f, -2.492f, -1.473f, -4.854f, -3.49f, -5.768f)
                moveToRelative(0.402f, -3.002f)
                curveToRelative(0.0f, 1.268f, -0.72f, 2.254f, -1.642f, 2.52f)
                curveToRelative(-0.049f, -1.667f, -1.114f, -3.133f, -2.604f, -3.42f)
                curveToRelative(0.079f, -0.494f, 0.287f, -0.87f, 0.568f, -1.138f)
                curveToRelative(0.365f, -0.347f, 0.894f, -0.552f, 1.538f, -0.552f)
                curveToRelative(1.146f, 0.0f, 2.14f, 1.1f, 2.14f, 2.59f)
                moveToRelative(-3.0f, 5.602f)
                arcToRelative(2.85f, 2.85f, 0.0f, false, true, -1.78f, 0.628f)
                arcToRelative(2.85f, 2.85f, 0.0f, false, true, -1.792f, -0.638f)
                curveToRelative(-2.006f, 0.923f, -3.273f, 3.319f, -3.423f, 5.818f)
                horizontalLineToRelative(10.445f)
                curveToRelative(-0.154f, -2.498f, -1.446f, -4.889f, -3.45f, -5.808f)
                moveToRelative(-1.78f, -5.552f)
                curveToRelative(-1.109f, 0.0f, -2.14f, 1.08f, -2.14f, 2.59f)
                reflectiveCurveToRelative(1.031f, 2.59f, 2.14f, 2.59f)
                reflectiveCurveToRelative(2.14f, -1.08f, 2.14f, -2.59f)
                reflectiveCurveToRelative(-1.031f, -2.59f, -2.14f, -2.59f)
            }
        }
        .build()
        return _clipboardUsersMedium!!
    }

private var _clipboardUsersMedium: ImageVector? = null
