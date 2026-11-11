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
        _arrowCircleResetMedium = Builder(name = "ArrowCircleResetMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.0f, 7.25f)
                curveToRelative(6.249f, 0.0f, 10.75f, 4.501f, 10.75f, 10.75f)
                reflectiveCurveTo(24.249f, 28.75f, 18.0f, 28.75f)
                curveToRelative(-5.253f, 0.0f, -9.246f, -3.181f, -10.404f, -7.87f)
                lineToRelative(-0.971f, 0.24f)
                curveToRelative(1.272f, 5.151f, 5.679f, 8.63f, 11.375f, 8.63f)
                curveToRelative(6.801f, 0.0f, 11.75f, -4.949f, 11.75f, -11.75f)
                reflectiveCurveTo(24.801f, 6.25f, 18.0f, 6.25f)
                curveToRelative(-4.433f, 0.0f, -8.596f, 2.353f, -10.75f, 5.82f)
                verticalLineTo(7.515f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(7.235f)
                horizontalLineToRelative(7.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(7.488f)
                curveTo(9.166f, 9.987f, 13.404f, 7.25f, 18.0f, 7.25f)
            }
        }
        .build()
        return _arrowCircleResetMedium!!
    }

private var _arrowCircleResetMedium: ImageVector? = null
