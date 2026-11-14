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
                moveTo(15.491f, 5.0f)
                curveToRelative(0.257f, 0.0f, 0.5f, 0.243f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.243f, 0.5f, -0.5f, 0.5f)
                arcToRelative(0.527f, 0.527f, 0.0f, false, true, -0.5f, -0.5f)
                curveToRelative(0.0f, -0.257f, 0.243f, -0.5f, 0.5f, -0.5f)
                moveToRelative(0.0f, 2.0f)
                curveToRelative(0.81f, 0.0f, 1.5f, -0.69f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.69f, -1.5f, -1.5f, -1.5f)
                curveToRelative(-0.809f, 0.0f, -1.5f, 0.69f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.691f, 1.5f, 1.5f, 1.5f)
                moveTo(12.0f, 6.0f)
                verticalLineToRelative(1.0f)
                lineTo(7.0f, 7.0f)
                lineTo(7.0f, 6.0f)
                close()
                moveTo(18.782f, 10.074f)
                lineTo(16.707f, 8.0f)
                lineTo(14.35f, 8.0f)
                lineToRelative(-3.126f, 2.084f)
                lineToRelative(-0.153f, 0.101f)
                lineToRelative(-0.05f, 0.177f)
                lineToRelative(-1.0f, 3.5f)
                lineToRelative(0.961f, 0.276f)
                lineToRelative(0.95f, -3.325f)
                lineToRelative(1.843f, -1.228f)
                lineToRelative(-0.763f, 3.817f)
                lineToRelative(-0.01f, 0.048f)
                lineToRelative(-0.11f, 0.55f)
                lineTo(13.0f, 14.0f)
                verticalLineToRelative(2.293f)
                lineToRelative(-2.853f, 2.854f)
                lineToRelative(0.707f, 0.707f)
                lineTo(14.0f, 16.707f)
                lineTo(14.0f, 14.0f)
                horizontalLineToRelative(1.292f)
                lineToRelative(1.66f, 1.66f)
                lineToRelative(-0.941f, 4.232f)
                lineToRelative(0.976f, 0.216f)
                lineToRelative(1.001f, -4.5f)
                lineToRelative(0.06f, -0.267f)
                lineToRelative(-0.194f, -0.194f)
                lineToRelative(-1.812f, -1.811f)
                lineToRelative(0.765f, -3.822f)
                lineToRelative(1.411f, 1.412f)
                lineToRelative(0.096f, 0.038f)
                lineToRelative(2.5f, 1.0f)
                lineToRelative(0.371f, -0.928f)
                close()
                moveTo(15.09f, 13.0f)
                horizontalLineToRelative(-0.98f)
                lineToRelative(0.8f, -4.0f)
                horizontalLineToRelative(0.98f)
                close()
                moveTo(9.0f, 10.0f)
                lineTo(9.0f, 9.0f)
                lineTo(5.0f, 9.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(8.0f, 13.0f)
                verticalLineToRelative(1.0f)
                lineTo(3.0f, 14.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(10.0f, 17.0f)
                verticalLineToRelative(-1.0f)
                lineTo(5.0f, 16.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _walkFastSmall!!
    }

private var _walkFastSmall: ImageVector? = null
