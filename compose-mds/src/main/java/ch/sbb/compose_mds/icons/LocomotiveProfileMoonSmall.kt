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
        _locomotiveProfileMoonSmall = Builder(
            name = "LocomotiveProfileMoonSmall",
            defaultWidth =
                24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight =
            24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveToRelative(17.702f, 2.416f)
                lineToRelative(0.41f, -1.056f)
                lineToRelative(-1.057f, 0.41f)
                arcToRelative(4.001f, 4.001f, 0.0f, true, false, 5.176f, 5.175f)
                lineToRelative(0.41f, -1.056f)
                lineToRelative(-1.057f, 0.41f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.882f, -3.882f)
                moveTo(15.5f, 5.5f)
                curveToRelative(0.0f, -0.891f, 0.39f, -1.693f, 1.007f, -2.243f)
                quadToRelative(-0.007f, 0.12f, -0.007f, 0.243f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.243f, 3.993f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 15.5f, 5.5f)
                moveTo(5.777f, 4.084f)
                lineTo(5.5f, 3.9f)
                lineToRelative(-0.277f, 0.185f)
                lineToRelative(-3.0f, 2.0f)
                lineToRelative(-0.624f, 0.416f)
                lineToRelative(0.624f, 0.416f)
                lineTo(3.849f, 8.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.349f)
                lineToRelative(0.151f, 0.101f)
                lineToRelative(0.151f, -0.1f)
                horizontalLineToRelative(2.687f)
                curveToRelative(1.474f, 0.0f, 2.754f, 0.803f, 3.444f, 2.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.66f)
                lineToRelative(0.548f, 1.509f)
                lineToRelative(0.01f, 0.026f)
                lineToRelative(0.012f, 0.025f)
                quadToRelative(0.107f, 0.211f, 0.108f, 0.44f)
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
                curveToRelative(0.0f, -0.315f, -0.078f, -0.604f, -0.199f, -0.857f)
                lineToRelative(-2.094f, -5.773f)
                curveToRelative(-0.676f, -1.954f, -2.515f, -3.37f, -4.707f, -3.37f)
                horizontalLineTo(7.15f)
                lineToRelative(1.626f, -1.085f)
                lineToRelative(0.624f, -0.416f)
                lineToRelative(-0.624f, -0.416f)
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
                lineTo(5.5f, 5.101f)
                lineToRelative(2.099f, 1.4f)
                close()
                moveTo(6.0f, 12.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.0f)
                close()
            }
        }
            .build()
        return _locomotiveProfileMoonSmall!!
    }

private var _locomotiveProfileMoonSmall: ImageVector? = null
