package ch.sbb.compose_mds.sbbicons.medium

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.MediumGroup

public val MediumGroup.WaitingRoomMedium: ImageVector
    get() {
        if (_waitingRoomMedium != null) {
            return _waitingRoomMedium!!
        }
        _waitingRoomMedium = Builder(name = "WaitingRoomMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.25f, 11.25f)
                curveToRelative(0.0f, -3.072f, 2.43f, -5.5f, 5.5f, -5.5f)
                curveToRelative(3.072f, 0.0f, 5.5f, 2.428f, 5.5f, 5.5f)
                reflectiveCurveToRelative(-2.428f, 5.5f, -5.5f, 5.5f)
                curveToRelative(-3.07f, 0.0f, -5.5f, -2.429f, -5.5f, -5.5f)
                moveToRelative(5.5f, -6.5f)
                arcToRelative(6.46f, 6.46f, 0.0f, false, false, -6.5f, 6.5f)
                curveToRelative(0.0f, 3.624f, 2.877f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.876f, 6.5f, -6.5f)
                reflectiveCurveToRelative(-2.876f, -6.5f, -6.5f, -6.5f)
                moveToRelative(0.391f, 7.56f)
                lineToRelative(2.852f, -3.6f)
                lineToRelative(-0.784f, -0.621f)
                lineToRelative(-2.522f, 3.184f)
                lineToRelative(-2.453f, -2.196f)
                lineToRelative(-0.667f, 0.745f)
                lineToRelative(2.849f, 2.55f)
                lineToRelative(0.396f, 0.354f)
                close()
                moveTo(18.25f, 22.765f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(8.485f)
                horizontalLineToRelative(-13.0f)
                verticalLineToRelative(-8.485f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(6.485f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-6.485f)
                close()
                moveTo(22.502f, 22.265f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-4.5f)
                close()
                moveTo(8.249f, 8.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(-2.0f, 1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                moveToRelative(-1.0f, 4.0f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-8.5f)
                horizontalLineToRelative(-6.5f)
                moveToRelative(0.5f, 7.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-1.5f)
            }
        }
        .build()
        return _waitingRoomMedium!!
    }

private var _waitingRoomMedium: ImageVector? = null
