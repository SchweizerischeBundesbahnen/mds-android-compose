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

public val SBBIcons.CircleInformationMedium: ImageVector
    get() {
        if (_circleInformationMedium != null) {
            return _circleInformationMedium!!
        }
        _circleInformationMedium = Builder(name = "CircleInformationMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.0f, 4.25f)
                curveToRelative(7.68f, 0.0f, 13.75f, 6.068f, 13.75f, 13.75f)
                curveToRelative(0.0f, 7.68f, -6.07f, 13.75f, -13.75f, 13.75f)
                reflectiveCurveTo(4.25f, 25.68f, 4.25f, 18.0f)
                curveToRelative(0.0f, -7.682f, 6.07f, -13.75f, 13.75f, -13.75f)
                moveToRelative(0.0f, 28.5f)
                curveToRelative(8.233f, 0.0f, 14.75f, -6.517f, 14.75f, -14.75f)
                reflectiveCurveTo(26.233f, 3.25f, 18.0f, 3.25f)
                reflectiveCurveTo(3.25f, 9.766f, 3.25f, 18.0f)
                reflectiveCurveTo(9.767f, 32.75f, 18.0f, 32.75f)
                moveTo(19.22f, 12.0f)
                lineTo(19.22f, 9.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(19.22f, 24.235f)
                horizontalLineToRelative(3.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.25f)
                verticalLineToRelative(-8.0f)
                lineTo(15.0f, 16.235f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.22f)
                close()
            }
        }
        .build()
        return _circleInformationMedium!!
    }

private var _circleInformationMedium: ImageVector? = null
