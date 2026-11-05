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

public val SBBIcons.CircleInformationSmallSmall: ImageVector
    get() {
        if (_circleInformationSmallSmall != null) {
            return _circleInformationSmallSmall!!
        }
        _circleInformationSmallSmall = Builder(
            name = "CircleInformationSmallSmall",
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
                moveTo(5.0f, 12.0f)
                curveToRelative(0.0f, -3.912f, 3.088f, -7.0f, 7.0f, -7.0f)
                curveToRelative(3.91f, 0.0f, 7.0f, 3.088f, 7.0f, 7.0f)
                reflectiveCurveToRelative(-3.09f, 7.0f, -7.0f, 7.0f)
                curveToRelative(-3.912f, 0.0f, -7.0f, -3.088f, -7.0f, -7.0f)
                moveToRelative(7.0f, -8.0f)
                curveToRelative(-4.464f, 0.0f, -8.0f, 3.536f, -8.0f, 8.0f)
                reflectiveCurveToRelative(3.536f, 8.0f, 8.0f, 8.0f)
                curveToRelative(4.463f, 0.0f, 8.0f, -3.536f, 8.0f, -8.0f)
                reflectiveCurveToRelative(-3.537f, -8.0f, -8.0f, -8.0f)
                moveToRelative(0.98f, 5.0f)
                lineTo(12.98f, 7.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(12.98f, 14.99f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                lineTo(10.0f, 10.99f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.98f)
                verticalLineToRelative(5.0f)
            }
        }
            .build()
        return _circleInformationSmallSmall!!
    }

private var _circleInformationSmallSmall: ImageVector? = null
