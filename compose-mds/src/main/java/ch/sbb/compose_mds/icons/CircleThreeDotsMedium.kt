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

public val SBBIcons.CircleThreeDotsMedium: ImageVector
    get() {
        if (_circleThreeDotsMedium != null) {
            return _circleThreeDotsMedium!!
        }
        _circleThreeDotsMedium = Builder(name = "CircleThreeDotsMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.25f, 18.0f)
                curveToRelative(0.0f, -7.594f, 6.156f, -13.75f, 13.75f, -13.75f)
                reflectiveCurveTo(31.75f, 10.406f, 31.75f, 18.0f)
                reflectiveCurveTo(25.594f, 31.75f, 18.0f, 31.75f)
                reflectiveCurveTo(4.25f, 25.594f, 4.25f, 18.0f)
                moveTo(18.0f, 3.25f)
                curveTo(9.854f, 3.25f, 3.25f, 9.854f, 3.25f, 18.0f)
                reflectiveCurveTo(9.854f, 32.75f, 18.0f, 32.75f)
                reflectiveCurveTo(32.75f, 26.146f, 32.75f, 18.0f)
                reflectiveCurveTo(26.146f, 3.25f, 18.0f, 3.25f)
                moveTo(12.5f, 18.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -1.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                moveToRelative(4.5f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, -1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                moveToRelative(6.5f, -1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -1.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
            }
        }
        .build()
        return _circleThreeDotsMedium!!
    }

private var _circleThreeDotsMedium: ImageVector? = null
