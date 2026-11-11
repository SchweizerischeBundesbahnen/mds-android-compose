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

public val SBBIcons.RobotSmall: ImageVector
    get() {
        if (_robotSmall != null) {
            return _robotSmall!!
        }
        _robotSmall = Builder(name = "RobotSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.5f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                moveToRelative(1.5f, 0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.0f, 1.415f)
                lineTo(13.0f, 6.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                lineTo(6.0f, 16.0f)
                verticalLineToRelative(-3.0f)
                lineTo(4.0f, 13.0f)
                lineTo(4.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                lineTo(6.0f, 6.0f)
                horizontalLineToRelative(6.0f)
                lineTo(12.0f, 4.915f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 14.0f, 3.5f)
                moveToRelative(5.0f, 8.5f)
                horizontalLineToRelative(1.0f)
                lineTo(20.0f, 9.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(5.0f, 12.0f)
                horizontalLineToRelative(1.0f)
                lineTo(6.0f, 9.0f)
                lineTo(5.0f, 9.0f)
                close()
                moveTo(18.0f, 15.0f)
                lineTo(18.0f, 7.0f)
                lineTo(7.0f, 7.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(21.0f, 19.175f)
                curveToRelative(0.0f, -0.62f, -0.544f, -1.175f, -1.281f, -1.175f)
                lineTo(5.28f, 18.0f)
                curveToRelative(-0.737f, 0.0f, -1.28f, 0.554f, -1.281f, 1.175f)
                lineTo(3.999f, 22.0f)
                lineTo(3.0f, 22.0f)
                verticalLineToRelative(-2.825f)
                curveTo(3.0f, 17.945f, 4.05f, 17.0f, 5.281f, 17.0f)
                lineTo(19.72f, 17.0f)
                curveToRelative(1.23f, 0.0f, 2.28f, 0.945f, 2.281f, 2.175f)
                lineTo(22.001f, 22.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(12.5f, 14.0f)
                curveToRelative(1.501f, 0.0f, 2.824f, -0.677f, 3.435f, -1.753f)
                lineToRelative(-0.87f, -0.494f)
                curveTo(14.672f, 12.446f, 13.73f, 13.0f, 12.5f, 13.0f)
                reflectiveCurveToRelative(-2.172f, -0.554f, -2.565f, -1.247f)
                lineToRelative(-0.87f, 0.494f)
                curveTo(9.676f, 13.323f, 11.0f, 14.0f, 12.5f, 14.0f)
                moveToRelative(-2.0f, -4.2f)
                arcToRelative(0.2f, 0.2f, 0.0f, false, false, 0.0f, 0.4f)
                arcToRelative(0.2f, 0.2f, 0.0f, false, false, 0.0f, -0.4f)
                moveToRelative(0.8f, 0.2f)
                arcToRelative(0.8f, 0.8f, 0.0f, true, true, -1.6f, 0.0f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, 1.6f, 0.0f)
                moveToRelative(3.0f, 0.0f)
                arcToRelative(0.2f, 0.2f, 0.0f, false, true, 0.4f, 0.0f)
                arcToRelative(0.2f, 0.2f, 0.0f, false, true, -0.4f, 0.0f)
                moveToRelative(0.2f, 0.8f)
                arcToRelative(0.8f, 0.8f, 0.0f, true, false, 0.0f, -1.6f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, 0.0f, 1.6f)
            }
        }
        .build()
        return _robotSmall!!
    }

private var _robotSmall: ImageVector? = null
