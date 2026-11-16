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

public val SBBIcons.LocomotiveProfileMoonSmall: ImageVector
    get() {
        if (_locomotiveProfileMoonSmall != null) {
            return _locomotiveProfileMoonSmall!!
        }
        _locomotiveProfileMoonSmall = Builder(name = "LocomotiveProfileMoonSmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.508f, 3.258f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.233f, 4.233f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -4.233f, -4.233f)
                moveTo(20.5f, 6.5f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.799f, -4.084f)
                lineToRelative(0.41f, -1.056f)
                lineToRelative(-1.056f, 0.41f)
                arcToRelative(4.001f, 4.001f, 0.0f, true, false, 5.176f, 5.176f)
                lineToRelative(0.41f, -1.057f)
                lineToRelative(-1.057f, 0.41f)
                curveToRelative(-0.335f, 0.13f, -0.7f, 0.201f, -1.084f, 0.201f)
                moveToRelative(-11.099f, 0.0f)
                lineTo(5.777f, 4.084f)
                lineTo(5.5f, 3.9f)
                lineToRelative(-0.277f, 0.184f)
                lineTo(1.599f, 6.5f)
                lineTo(3.849f, 8.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.349f)
                lineToRelative(0.151f, 0.1f)
                lineToRelative(0.151f, -0.1f)
                horizontalLineToRelative(2.687f)
                arcToRelative(3.97f, 3.97f, 0.0f, false, true, 3.444f, 2.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.66f)
                lineToRelative(0.548f, 1.51f)
                lineToRelative(0.01f, 0.026f)
                lineToRelative(0.011f, 0.025f)
                curveToRelative(0.07f, 0.14f, 0.109f, 0.288f, 0.109f, 0.44f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.388f)
                curveToRelative(0.075f, 0.369f, 0.231f, 0.708f, 0.45f, 1.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(10.838f)
                curveToRelative(0.218f, -0.292f, 0.375f, -0.631f, 0.45f, -1.0f)
                horizontalLineToRelative(2.05f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                curveToRelative(0.0f, -0.31f, -0.077f, -0.594f, -0.195f, -0.844f)
                lineToRelative(-2.099f, -5.79f)
                curveTo(12.367f, 9.416f, 10.528f, 8.0f, 8.338f, 8.0f)
                horizontalLineTo(7.15f)
                close()
                moveTo(8.8f, 21.0f)
                horizontalLineToRelative(0.077f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.377f, -1.0f)
                horizontalLineToRelative(-2.83f)
                curveToRelative(0.202f, 0.571f, 0.74f, 0.984f, 1.376f, 1.0f)
                moveToRelative(4.499f, -6.0f)
                lineToRelative(-1.088f, -3.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(5.5f, 7.9f)
                lineTo(3.401f, 6.5f)
                lineTo(5.5f, 5.1f)
                lineToRelative(2.099f, 1.4f)
                close()
                moveTo(7.0f, 11.0f)
                verticalLineToRelative(5.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _locomotiveProfileMoonSmall!!
    }

private var _locomotiveProfileMoonSmall: ImageVector? = null
