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

public val SBBIcons.CirclePlaySmall: ImageVector
    get() {
        if (_circlePlaySmall != null) {
            return _circlePlaySmall!!
        }
        _circlePlaySmall = Builder(
            name = "CirclePlaySmall",
            defaultWidth = 24.0.dp,
            defaultHeight =
                24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
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
                moveTo(12.0f, 2.0f)
                curveTo(6.477f, 2.0f, 2.0f, 6.477f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.477f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.477f, 10.0f, -10.0f)
                reflectiveCurveTo(17.523f, 2.0f, 12.0f, 2.0f)
                moveTo(3.0f, 12.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 9.0f, -9.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 9.0f, 9.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -9.0f, 9.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -9.0f, -9.0f)
                moveToRelative(5.741f, -6.438f)
                lineTo(8.0f, 5.155f)
                verticalLineToRelative(13.228f)
                lineToRelative(0.757f, -0.454f)
                lineToRelative(10.0f, -6.0f)
                lineToRelative(0.746f, -0.448f)
                lineToRelative(-0.762f, -0.419f)
                close()
                moveTo(9.0f, 16.617f)
                verticalLineTo(6.846f)
                lineToRelative(8.497f, 4.673f)
                close()
            }
        }
            .build()
        return _circlePlaySmall!!
    }

private var _circlePlaySmall: ImageVector? = null
