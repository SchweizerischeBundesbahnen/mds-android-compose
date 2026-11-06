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

public val SBBIcons.WalkFastSmall: ImageVector
    get() {
        if (_walkFastSmall != null) {
            return _walkFastSmall!!
        }
        _walkFastSmall = Builder(name = "WalkFastSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.991f, 5.5f)
                curveToRelative(0.0f, -0.257f, 0.243f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.243f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.243f, 0.5f, -0.5f, 0.5f)
                arcToRelative(0.527f, 0.527f, 0.0f, false, true, -0.5f, -0.5f)
                moveToRelative(0.5f, -1.5f)
                curveToRelative(-0.809f, 0.0f, -1.5f, 0.69f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.691f, 1.5f, 1.5f, 1.5f)
                curveToRelative(0.81f, 0.0f, 1.5f, -0.69f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.69f, -1.5f, -1.5f, -1.5f)
                moveTo(7.0f, 6.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(14.5f, 8.0f)
                horizontalLineToRelative(-0.15f)
                lineToRelative(-0.127f, 0.084f)
                lineToRelative(-3.0f, 2.0f)
                lineToRelative(-0.153f, 0.102f)
                lineToRelative(-0.05f, 0.177f)
                lineToRelative(-1.0f, 3.5f)
                lineToRelative(0.961f, 0.274f)
                lineToRelative(0.95f, -3.323f)
                lineToRelative(1.843f, -1.229f)
                lineToRelative(-0.763f, 3.817f)
                lineToRelative(-0.01f, 0.049f)
                lineToRelative(-0.11f, 0.549f)
                horizontalLineToRelative(0.11f)
                verticalLineToRelative(2.293f)
                lineToRelative(-2.854f, 2.853f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(3.0f, -3.0f)
                lineToRelative(0.147f, -0.146f)
                lineTo(14.001f, 14.0f)
                horizontalLineToRelative(1.292f)
                lineToRelative(1.66f, 1.66f)
                lineToRelative(-0.941f, 4.231f)
                lineToRelative(0.976f, 0.218f)
                lineToRelative(1.001f, -4.5f)
                lineToRelative(0.06f, -0.268f)
                lineToRelative(-0.194f, -0.195f)
                lineToRelative(-1.812f, -1.81f)
                lineToRelative(0.765f, -3.822f)
                lineToRelative(1.339f, 1.34f)
                lineToRelative(0.073f, 0.072f)
                lineToRelative(0.095f, 0.038f)
                lineToRelative(2.5f, 1.0f)
                lineToRelative(0.371f, -0.928f)
                lineToRelative(-2.404f, -0.962f)
                lineToRelative(-1.928f, -1.928f)
                lineTo(16.708f, 8.0f)
                lineTo(14.5f, 8.0f)
                moveToRelative(-0.39f, 5.0f)
                lineToRelative(0.8f, -4.0f)
                horizontalLineToRelative(0.981f)
                lineToRelative(-0.8f, 4.0f)
                close()
                moveTo(5.0f, 9.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.0f)
                lineTo(9.0f, 9.0f)
                close()
                moveTo(3.0f, 13.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.0f)
                lineTo(3.0f, 14.0f)
                close()
                moveTo(10.0f, 16.0f)
                lineTo(5.0f, 16.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(5.0f)
                close()
            }
        }
        .build()
        return _walkFastSmall!!
    }

private var _walkFastSmall: ImageVector? = null
