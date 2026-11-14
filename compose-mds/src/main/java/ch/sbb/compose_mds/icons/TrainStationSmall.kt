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

public val SBBIcons.TrainStationSmall: ImageVector
    get() {
        if (_trainStationSmall != null) {
            return _trainStationSmall!!
        }
        _trainStationSmall = Builder(name = "TrainStationSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.5f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.23f)
                lineTo(8.96f, 6.0f)
                horizontalLineToRelative(2.682f)
                curveToRelative(0.7f, 0.0f, 1.318f, 0.147f, 1.756f, 0.566f)
                curveToRelative(0.443f, 0.424f, 0.601f, 1.03f, 0.601f, 1.712f)
                lineTo(13.999f, 18.0f)
                lineTo(13.0f, 18.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.001f)
                verticalLineToRelative(-3.0f)
                lineTo(17.5f, 16.0f)
                verticalLineToRelative(-2.5f)
                lineTo(17.0f, 13.5f)
                lineTo(17.0f, 10.0f)
                horizontalLineToRelative(1.467f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.063f, 0.0f)
                lineTo(20.0f, 10.0f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-0.5f)
                lineTo(19.5f, 16.0f)
                lineTo(21.0f, 16.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-4.999f)
                verticalLineToRelative(3.0f)
                lineTo(3.0f, 20.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.0f)
                lineTo(3.0f, 18.0f)
                lineTo(3.0f, 8.278f)
                curveToRelative(0.0f, -0.683f, 0.158f, -1.288f, 0.601f, -1.712f)
                curveTo(4.04f, 6.147f, 4.658f, 6.0f, 5.358f, 6.0f)
                lineTo(8.04f, 6.0f)
                lineTo(6.73f, 4.0f)
                lineTo(5.5f, 4.0f)
                lineTo(5.5f, 3.0f)
                close()
                moveTo(8.5f, 4.877f)
                lineTo(7.925f, 4.0f)
                horizontalLineToRelative(1.15f)
                close()
                moveTo(13.0f, 8.278f)
                curveToRelative(0.0f, -0.547f, -0.129f, -0.831f, -0.293f, -0.989f)
                curveToRelative(-0.17f, -0.162f, -0.48f, -0.289f, -1.065f, -0.289f)
                lineTo(5.358f, 7.0f)
                curveToRelative(-0.584f, 0.0f, -0.896f, 0.127f, -1.066f, 0.29f)
                curveToRelative(-0.165f, 0.157f, -0.292f, 0.442f, -0.292f, 0.988f)
                lineTo(4.0f, 12.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(13.0f, 13.0f)
                lineTo(4.0f, 13.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(5.0f, 18.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(10.0f, 9.0f)
                lineTo(10.0f, 8.0f)
                lineTo(7.0f, 8.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(11.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(-6.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                moveToRelative(14.0f, -2.5f)
                horizontalLineToRelative(-1.0f)
                lineTo(18.0f, 11.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _trainStationSmall!!
    }

private var _trainStationSmall: ImageVector? = null
