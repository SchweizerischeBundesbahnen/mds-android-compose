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

public val SBBIcons.EyeMedium: ImageVector
    get() {
        if (_eyeMedium != null) {
            return _eyeMedium!!
        }
        _eyeMedium = Builder(
            name = "EyeMedium",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
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
                moveTo(18.0f, 9.25f)
                curveToRelative(-3.354f, 0.0f, -6.334f, 1.69f, -8.605f, 3.559f)
                arcToRelative(26.3f, 26.3f, 0.0f, false, false, -4.554f, 4.904f)
                lineToRelative(-0.198f, 0.282f)
                lineToRelative(0.193f, 0.285f)
                curveToRelative(0.578f, 0.856f, 2.203f, 2.957f, 4.499f, 4.85f)
                curveToRelative(2.289f, 1.887f, 5.309f, 3.62f, 8.665f, 3.62f)
                curveToRelative(3.354f, 0.0f, 6.334f, -1.69f, 8.605f, -3.558f)
                arcToRelative(26.3f, 26.3f, 0.0f, false, false, 4.554f, -4.904f)
                lineToRelative(0.198f, -0.282f)
                lineToRelative(-0.193f, -0.286f)
                curveToRelative(-0.578f, -0.855f, -2.203f, -2.956f, -4.499f, -4.85f)
                curveToRelative(-2.289f, -1.887f, -5.308f, -3.62f, -8.665f, -3.62f)
                moveTo(9.971f, 22.358f)
                arcToRelative(24.7f, 24.7f, 0.0f, false, true, -4.108f, -4.354f)
                curveToRelative(0.723f, -0.987f, 2.191f, -2.798f, 4.167f, -4.423f)
                curveToRelative(2.191f, -1.803f, 4.95f, -3.33f, 7.97f, -3.33f)
                reflectiveCurveToRelative(5.816f, 1.566f, 8.03f, 3.391f)
                arcToRelative(24.7f, 24.7f, 0.0f, false, true, 4.107f, 4.355f)
                curveToRelative(-0.723f, 0.986f, -2.191f, 2.797f, -4.167f, 4.423f)
                curveToRelative(-2.191f, 1.802f, -4.95f, 3.33f, -7.97f, 3.33f)
                curveToRelative(-3.018f, 0.0f, -5.816f, -1.567f, -8.029f, -3.392f)
                moveToRelative(8.03f, -10.108f)
                arcToRelative(5.75f, 5.75f, 0.0f, true, false, 0.0f, 11.5f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, false, 0.0f, -11.5f)
                moveTo(13.25f, 18.0f)
                arcToRelative(4.75f, 4.75f, 0.0f, true, true, 9.5f, 0.0f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, true, -9.5f, 0.0f)
            }
        }
            .build()
        return _eyeMedium!!
    }

private var _eyeMedium: ImageVector? = null
