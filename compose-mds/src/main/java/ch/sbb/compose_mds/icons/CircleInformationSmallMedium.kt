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

public val SBBIcons.CircleInformationSmallMedium: ImageVector
    get() {
        if (_circleInformationSmallMedium != null) {
            return _circleInformationSmallMedium!!
        }
        _circleInformationSmallMedium = Builder(name = "CircleInformationSmallMedium", defaultWidth
                = 36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.0f, 7.25f)
                curveToRelative(6.004f, 0.0f, 10.75f, 4.745f, 10.75f, 10.75f)
                curveToRelative(0.0f, 6.006f, -4.746f, 10.75f, -10.75f, 10.75f)
                curveToRelative(-6.006f, 0.0f, -10.75f, -4.744f, -10.75f, -10.75f)
                reflectiveCurveTo(11.994f, 7.25f, 18.0f, 7.25f)
                moveToRelative(0.0f, 22.5f)
                curveToRelative(6.557f, 0.0f, 11.75f, -5.192f, 11.75f, -11.75f)
                reflectiveCurveTo(24.557f, 6.25f, 18.0f, 6.25f)
                reflectiveCurveTo(6.25f, 11.442f, 6.25f, 18.0f)
                reflectiveCurveTo(11.442f, 29.75f, 18.0f, 29.75f)
                moveToRelative(1.22f, -16.25f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(19.22f, 22.735f)
                horizontalLineToRelative(3.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.25f)
                verticalLineToRelative(-6.5f)
                lineTo(15.0f, 16.235f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.22f)
                close()
            }
        }
        .build()
        return _circleInformationSmallMedium!!
    }

private var _circleInformationSmallMedium: ImageVector? = null
