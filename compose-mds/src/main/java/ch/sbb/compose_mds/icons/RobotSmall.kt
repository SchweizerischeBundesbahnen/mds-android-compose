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
                moveTo(12.0f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 1.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                moveToRelative(0.5f, -1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.5f, 2.915f)
                lineTo(12.0f, 6.0f)
                lineTo(6.0f, 6.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 8.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                lineTo(21.0f, 8.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(19.0f, 6.0f)
                horizontalLineToRelative(-6.0f)
                lineTo(13.0f, 4.915f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.5f, 2.0f)
                moveTo(19.0f, 9.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.0f)
                lineTo(20.0f, 9.0f)
                close()
                moveTo(6.0f, 9.0f)
                verticalLineToRelative(3.0f)
                lineTo(5.0f, 12.0f)
                lineTo(5.0f, 9.0f)
                close()
                moveTo(7.0f, 7.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(11.0f)
                lineTo(18.0f, 7.0f)
                close()
                moveTo(3.0f, 19.175f)
                curveTo(3.0f, 17.945f, 4.05f, 17.0f, 5.281f, 17.0f)
                lineTo(19.72f, 17.0f)
                curveToRelative(1.23f, 0.0f, 2.281f, 0.945f, 2.281f, 2.175f)
                lineTo(22.001f, 22.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.825f)
                curveToRelative(0.0f, -0.62f, -0.544f, -1.175f, -1.281f, -1.175f)
                lineTo(5.28f, 18.0f)
                curveTo(4.544f, 18.0f, 4.0f, 18.555f, 4.0f, 19.175f)
                lineTo(4.0f, 22.0f)
                lineTo(3.0f, 22.0f)
                close()
                moveTo(9.065f, 12.247f)
                curveTo(9.675f, 13.323f, 11.0f, 14.0f, 12.5f, 14.0f)
                reflectiveCurveToRelative(2.824f, -0.678f, 3.435f, -1.753f)
                lineToRelative(-0.87f, -0.494f)
                curveTo(14.672f, 12.447f, 13.73f, 13.0f, 12.5f, 13.0f)
                reflectiveCurveToRelative(-2.171f, -0.553f, -2.565f, -1.247f)
                close()
                moveTo(10.5f, 10.2f)
                arcToRelative(0.2f, 0.2f, 0.0f, true, false, 0.0f, -0.4f)
                arcToRelative(0.2f, 0.2f, 0.0f, false, false, 0.0f, 0.4f)
                moveToRelative(-0.8f, -0.2f)
                arcToRelative(0.8f, 0.8f, 0.0f, true, true, 1.6f, 0.0f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, -1.6f, 0.0f)
                moveToRelative(5.0f, 0.0f)
                arcToRelative(0.2f, 0.2f, 0.0f, true, true, -0.4f, 0.0f)
                arcToRelative(0.2f, 0.2f, 0.0f, false, true, 0.4f, 0.0f)
                moveToRelative(-0.2f, -0.8f)
                arcToRelative(0.8f, 0.8f, 0.0f, true, false, 0.0f, 1.6f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, 0.0f, -1.6f)
            }
        }
        .build()
        return _robotSmall!!
    }

private var _robotSmall: ImageVector? = null
