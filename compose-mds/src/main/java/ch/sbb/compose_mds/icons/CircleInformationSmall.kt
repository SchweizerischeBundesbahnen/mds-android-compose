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

public val SBBIcons.CircleInformationSmall: ImageVector
    get() {
        if (_circleInformationSmall != null) {
            return _circleInformationSmall!!
        }
        _circleInformationSmall = Builder(name = "CircleInformationSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 3.0f)
                curveToRelative(5.028f, 0.0f, 9.0f, 3.97f, 9.0f, 9.0f)
                curveToRelative(0.0f, 5.028f, -3.972f, 9.0f, -9.0f, 9.0f)
                reflectiveCurveToRelative(-9.0f, -3.972f, -9.0f, -9.0f)
                curveToRelative(0.0f, -5.03f, 3.972f, -9.0f, 9.0f, -9.0f)
                moveToRelative(0.0f, 19.0f)
                curveToRelative(5.58f, 0.0f, 10.0f, -4.42f, 10.0f, -10.0f)
                curveToRelative(0.0f, -5.582f, -4.42f, -10.0f, -10.0f, -10.0f)
                reflectiveCurveTo(2.0f, 6.418f, 2.0f, 12.0f)
                curveToRelative(0.0f, 5.58f, 4.42f, 10.0f, 10.0f, 10.0f)
                moveToRelative(0.98f, -14.0f)
                lineTo(12.98f, 6.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(14.98f, 15.99f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                lineTo(10.0f, 10.99f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.98f)
                verticalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _circleInformationSmall!!
    }

private var _circleInformationSmall: ImageVector? = null
