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

public val SBBIcons.CircleMinusMedium: ImageVector
    get() {
        if (_circleMinusMedium != null) {
            return _circleMinusMedium!!
        }
        _circleMinusMedium = Builder(
            name = "CircleMinusMedium",
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
                moveTo(7.25f, 17.25f)
                curveToRelative(0.0f, -6.351f, 5.15f, -11.5f, 11.5f, -11.5f)
                reflectiveCurveToRelative(11.5f, 5.149f, 11.5f, 11.5f)
                curveToRelative(0.0f, 6.352f, -5.15f, 11.5f, -11.5f, 11.5f)
                reflectiveCurveToRelative(-11.5f, -5.148f, -11.5f, -11.5f)
                moveToRelative(11.5f, -12.5f)
                curveToRelative(-6.903f, 0.0f, -12.5f, 5.597f, -12.5f, 12.5f)
                curveToRelative(0.0f, 6.904f, 5.597f, 12.5f, 12.5f, 12.5f)
                reflectiveCurveToRelative(12.5f, -5.596f, 12.5f, -12.5f)
                curveToRelative(0.0f, -6.903f, -5.597f, -12.5f, -12.5f, -12.5f)
                moveToRelative(-6.75f, 12.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(13.5f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
            .build()
        return _circleMinusMedium!!
    }

private var _circleMinusMedium: ImageVector? = null
