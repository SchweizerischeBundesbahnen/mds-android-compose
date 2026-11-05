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

public val SBBIcons.ArrowCircleResetMedium: ImageVector
    get() {
        if (_arrowCircleResetMedium != null) {
            return _arrowCircleResetMedium!!
        }
        _arrowCircleResetMedium = Builder(
            name = "ArrowCircleResetMedium",
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
                moveTo(7.488f, 13.75f)
                horizontalLineTo(13.5f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(6.25f)
                verticalLineTo(7.515f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.556f)
                curveTo(9.404f, 8.603f, 13.566f, 6.25f, 18.0f, 6.25f)
                curveToRelative(6.801f, 0.0f, 11.75f, 4.949f, 11.75f, 11.75f)
                reflectiveCurveTo(24.801f, 29.75f, 18.0f, 29.75f)
                curveToRelative(-5.697f, 0.0f, -10.103f, -3.479f, -11.375f, -8.63f)
                lineToRelative(0.97f, -0.24f)
                curveTo(8.753f, 25.57f, 12.747f, 28.75f, 18.0f, 28.75f)
                curveToRelative(6.249f, 0.0f, 10.75f, -4.501f, 10.75f, -10.75f)
                reflectiveCurveTo(24.249f, 7.25f, 18.0f, 7.25f)
                curveToRelative(-4.596f, 0.0f, -8.834f, 2.737f, -10.512f, 6.5f)
            }
        }
            .build()
        return _arrowCircleResetMedium!!
    }

private var _arrowCircleResetMedium: ImageVector? = null
