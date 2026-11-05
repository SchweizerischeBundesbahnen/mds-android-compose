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

public val SBBIcons.WheelchairPartiallyMedium: ImageVector
    get() {
        if (_wheelchairPartiallyMedium != null) {
            return _wheelchairPartiallyMedium!!
        }
        _wheelchairPartiallyMedium = Builder(
            name = "WheelchairPartiallyMedium",
            defaultWidth =
                36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight =
            36.0f,
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
                moveTo(3.1f, 18.0f)
                curveToRelative(0.0f, -5.062f, 1.537f, -8.763f, 3.545f, -11.543f)
                lineToRelative(0.81f, 0.585f)
                curveTo(5.564f, 9.662f, 4.1f, 13.161f, 4.1f, 18.0f)
                curveToRelative(0.0f, 4.832f, 1.46f, 8.187f, 3.363f, 10.967f)
                lineToRelative(-0.825f, 0.565f)
                curveTo(4.64f, 26.615f, 3.1f, 23.067f, 3.1f, 18.0f)
                moveToRelative(6.153f, 3.746f)
                curveToRelative(0.0f, -2.523f, 1.46f, -4.722f, 3.57f, -5.796f)
                lineToRelative(0.454f, 0.891f)
                curveToRelative(-1.792f, 0.912f, -3.024f, 2.775f, -3.024f, 4.905f)
                curveToRelative(0.0f, 3.024f, 2.48f, 5.5f, 5.5f, 5.5f)
                curveToRelative(2.188f, 0.0f, 4.094f, -1.298f, 4.978f, -3.168f)
                lineToRelative(0.904f, 0.427f)
                curveToRelative(-1.042f, 2.204f, -3.29f, 3.741f, -5.882f, 3.741f)
                curveToRelative(-3.573f, 0.0f, -6.5f, -2.924f, -6.5f, -6.5f)
                moveTo(32.601f, 18.0f)
                curveToRelative(0.0f, -5.068f, -1.54f, -8.615f, -3.539f, -11.533f)
                lineToRelative(-0.825f, 0.565f)
                curveTo(30.142f, 9.814f, 31.6f, 13.167f, 31.6f, 18.0f)
                curveToRelative(0.0f, 4.838f, -1.463f, 8.337f, -3.357f, 10.957f)
                lineToRelative(0.81f, 0.585f)
                curveToRelative(2.01f, -2.78f, 3.547f, -6.481f, 3.547f, -11.542f)
                moveTo(15.25f, 20.25f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(7.75f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(8.75f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-7.75f)
                horizontalLineToRelative(-7.5f)
                close()
                moveTo(15.5f, 9.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, true, 0.5f, 0.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.5f, 0.0f)
                moveToRelative(0.25f, -1.25f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, -2.5f)
            }
        }
            .build()
        return _wheelchairPartiallyMedium!!
    }

private var _wheelchairPartiallyMedium: ImageVector? = null
