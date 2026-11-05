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

public val SBBIcons.BicycleTandemSmall: ImageVector
    get() {
        if (_bicycleTandemSmall != null) {
            return _bicycleTandemSmall!!
        }
        _bicycleTandemSmall = Builder(name = "BicycleTandemSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.5f, 6.0f)
                lineTo(16.0f, 6.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.566f)
                lineToRelative(-1.334f, 2.0f)
                lineTo(14.0f, 9.0f)
                lineTo(14.0f, 7.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                lineTo(9.0f, 9.0f)
                lineTo(9.0f, 7.0f)
                lineTo(6.0f, 7.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.382f)
                lineToRelative(-0.463f, 0.925f)
                arcTo(4.004f, 4.004f, 0.0f, false, false, 2.0f, 14.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                arcToRelative(4.004f, 4.004f, 0.0f, false, false, -4.663f, -3.945f)
                lineToRelative(-0.26f, -0.52f)
                lineToRelative(1.839f, -2.758f)
                lineToRelative(0.518f, -0.777f)
                close()
                moveTo(12.691f, 10.0f)
                lineTo(11.191f, 13.0f)
                lineTo(9.874f, 13.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.468f, -2.194f)
                lineTo(8.809f, 10.0f)
                close()
                moveTo(18.0f, 17.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                horizontalLineToRelative(4.309f)
                lineToRelative(-0.362f, -0.724f)
                lineToRelative(-1.135f, -2.27f)
                quadTo(17.905f, 11.0f, 18.0f, 11.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.346f, 3.0f, -3.0f, 3.0f)
                moveToRelative(-0.309f, -4.0f)
                lineToRelative(-0.878f, -1.755f)
                arcTo(3.02f, 3.02f, 0.0f, false, false, 15.171f, 13.0f)
                close()
                moveTo(14.127f, 13.0f)
                arcToRelative(4.02f, 4.02f, 0.0f, false, true, 2.239f, -2.65f)
                lineTo(16.19f, 10.0f)
                horizontalLineToRelative(-2.382f)
                lineToRelative(-1.5f, 3.0f)
                close()
                moveTo(7.089f, 11.204f)
                arcTo(3.004f, 3.004f, 0.0f, false, false, 3.0f, 14.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.346f, 3.0f, -3.0f)
                lineTo(5.691f, 14.0f)
                lineToRelative(0.362f, -0.724f)
                close()
                moveTo(8.829f, 13.0f)
                horizontalLineToRelative(-1.52f)
                lineToRelative(0.64f, -1.28f)
                curveToRelative(0.395f, 0.34f, 0.702f, 0.78f, 0.88f, 1.28f)
            }
        }
        .build()
        return _bicycleTandemSmall!!
    }

private var _bicycleTandemSmall: ImageVector? = null
