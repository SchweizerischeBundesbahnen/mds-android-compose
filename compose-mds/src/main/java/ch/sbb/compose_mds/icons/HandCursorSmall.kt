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

public val SBBIcons.HandCursorSmall: ImageVector
    get() {
        if (_handCursorSmall != null) {
            return _handCursorSmall!!
        }
        _handCursorSmall = Builder(name = "HandCursorSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.0f, 5.5f)
                curveToRelative(0.0f, -0.826f, 0.674f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.674f, 1.5f, 1.5f)
                verticalLineToRelative(3.586f)
                arcToRelative(1.504f, 1.504f, 0.0f, false, true, 1.947f, 1.02f)
                quadToRelative(0.26f, -0.105f, 0.553f, -0.106f)
                curveToRelative(0.69f, 0.0f, 1.273f, 0.47f, 1.447f, 1.106f)
                quadToRelative(0.26f, -0.105f, 0.553f, -0.106f)
                curveToRelative(0.826f, 0.0f, 1.5f, 0.674f, 1.5f, 1.5f)
                lineTo(18.0f, 16.0f)
                curveToRelative(0.0f, 1.522f, -0.233f, 2.695f, -0.47f, 3.495f)
                curveToRelative(-0.12f, 0.4f, -0.24f, 0.706f, -0.332f, 0.916f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -0.149f, 0.31f)
                lineToRelative(-0.01f, 0.019f)
                lineToRelative(-0.004f, 0.006f)
                lineToRelative(-0.001f, 0.002f)
                verticalLineToRelative(0.001f)
                lineTo(16.6f, 20.5f)
                lineToRelative(0.433f, 0.25f)
                lineToRelative(-0.144f, 0.25f)
                lineTo(9.215f, 21.0f)
                lineToRelative(-0.145f, -0.245f)
                lineToRelative(0.43f, -0.255f)
                lineToRelative(-0.43f, 0.254f)
                horizontalLineToRelative(-0.001f)
                lineToRelative(-0.002f, -0.004f)
                lineToRelative(-0.007f, -0.012f)
                lineToRelative(-0.029f, -0.048f)
                lineToRelative(-0.108f, -0.184f)
                lineToRelative(-0.39f, -0.659f)
                lineToRelative(-1.202f, -2.035f)
                arcToRelative(820.0f, 820.0f, 0.0f, false, true, -1.975f, -3.353f)
                curveToRelative(-0.173f, -0.302f, -0.313f, -0.641f, -0.328f, -0.994f)
                arcToRelative(1.34f, 1.34f, 0.0f, false, true, 0.408f, -1.029f)
                arcToRelative(1.51f, 1.51f, 0.0f, false, true, 2.128f, 0.0f)
                lineTo(9.0f, 13.873f)
                close()
                moveTo(15.0f, 12.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.506f)
                arcToRelative(0.503f, 0.503f, 0.0f, false, true, 0.5f, -0.494f)
                curveToRelative(0.274f, 0.0f, 0.5f, 0.226f, 0.5f, 0.5f)
                lineTo(17.0f, 16.0f)
                curveToRelative(0.0f, 1.418f, -0.217f, 2.495f, -0.43f, 3.21f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -0.283f, 0.79f)
                lineTo(9.785f, 20.0f)
                lineToRelative(-0.001f, -0.003f)
                lineToRelative(-0.39f, -0.658f)
                lineToRelative(-1.202f, -2.036f)
                arcToRelative(838.0f, 838.0f, 0.0f, false, true, -1.968f, -3.342f)
                curveToRelative(-0.137f, -0.238f, -0.192f, -0.414f, -0.197f, -0.538f)
                arcToRelative(0.34f, 0.34f, 0.0f, false, true, 0.117f, -0.28f)
                arcToRelative(0.51f, 0.51f, 0.0f, false, true, 0.712f, 0.0f)
                lineToRelative(2.29f, 2.29f)
                lineToRelative(0.854f, 0.854f)
                lineTo(10.0f, 5.5f)
                curveToRelative(0.0f, -0.274f, 0.226f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.226f, 0.5f, 0.5f)
                lineTo(11.0f, 13.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.274f, 0.226f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.226f, 0.5f, 0.5f)
                lineTo(13.0f, 13.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.274f, 0.226f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.226f, 0.5f, 0.5f)
                verticalLineToRelative(1.0f)
            }
        }
        .build()
        return _handCursorSmall!!
    }

private var _handCursorSmall: ImageVector? = null
