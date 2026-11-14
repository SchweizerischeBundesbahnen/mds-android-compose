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

public val SBBIcons.CircleInformationLarge: ImageVector
    get() {
        if (_circleInformationLarge != null) {
            return _circleInformationLarge!!
        }
        _circleInformationLarge = Builder(name = "CircleInformationLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(45.0f, 24.5f)
                curveTo(45.0f, 13.178f, 35.822f, 4.0f, 24.5f, 4.0f)
                reflectiveCurveTo(4.0f, 13.178f, 4.0f, 24.5f)
                reflectiveCurveTo(13.178f, 45.0f, 24.5f, 45.0f)
                reflectiveCurveTo(45.0f, 35.822f, 45.0f, 24.5f)
                moveToRelative(1.0f, 0.0f)
                curveTo(46.0f, 36.374f, 36.374f, 46.0f, 24.5f, 46.0f)
                reflectiveCurveTo(3.0f, 36.374f, 3.0f, 24.5f)
                reflectiveCurveTo(12.626f, 3.0f, 24.5f, 3.0f)
                reflectiveCurveTo(46.0f, 12.626f, 46.0f, 24.5f)
                moveToRelative(-19.0f, -11.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, -5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 5.0f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -7.0f, 0.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 7.0f, 0.0f)
                moveTo(19.5f, 36.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                horizontalLineToRelative(11.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, -3.0f)
                lineTo(28.0f, 36.0f)
                lineTo(28.0f, 19.0f)
                horizontalLineToRelative(-8.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                lineTo(22.0f, 22.0f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(19.5f, 21.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                lineTo(27.0f, 20.0f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.499f, 0.499f, 0.0f, true, true, 0.0f, 1.0f)
                horizontalLineToRelative(-11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, -1.0f)
                lineTo(23.0f, 37.0f)
                lineTo(23.0f, 21.0f)
                close()
            }
        }
        .build()
        return _circleInformationLarge!!
    }

private var _circleInformationLarge: ImageVector? = null
