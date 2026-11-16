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

public val SBBIcons.ControlsXMedium: ImageVector
    get() {
        if (_controlsXMedium != null) {
            return _controlsXMedium!!
        }
        _controlsXMedium = Builder(name = "ControlsXMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.25f, 9.75f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, -5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 5.0f, 0.0f)
                moveToRelative(0.965f, 0.5f)
                arcToRelative(3.501f, 3.501f, 0.0f, false, true, -6.93f, 0.0f)
                lineTo(3.0f, 10.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.285f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 6.93f, 0.0f)
                lineTo(33.0f, 9.25f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(23.25f, 15.25f)
                curveToRelative(1.8f, 0.0f, 3.232f, 1.276f, 3.466f, 3.0f)
                lineTo(33.0f, 18.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-7.25f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.419f, -1.081f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.081f, -2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                lineTo(3.0f, 19.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(16.784f)
                curveToRelative(0.234f, -1.724f, 1.665f, -3.0f, 3.466f, -3.0f)
                moveToRelative(-10.5f, 10.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, -5.0f)
                moveToRelative(3.465f, 3.0f)
                arcToRelative(3.501f, 3.501f, 0.0f, false, true, -6.93f, 0.0f)
                lineTo(3.0f, 28.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.285f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 6.93f, 0.0f)
                horizontalLineToRelative(3.315f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(27.75f, 28.457f)
                lineTo(22.854f, 33.353f)
                lineTo(22.147f, 32.647f)
                lineTo(27.043f, 27.75f)
                lineTo(22.147f, 22.854f)
                lineTo(22.854f, 22.147f)
                lineTo(27.75f, 27.043f)
                lineTo(32.647f, 22.147f)
                lineTo(33.353f, 22.854f)
                lineTo(28.457f, 27.75f)
                lineTo(33.353f, 32.647f)
                lineTo(32.647f, 33.353f)
                close()
            }
        }
        .build()
        return _controlsXMedium!!
    }

private var _controlsXMedium: ImageVector? = null
