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

public val SBBIcons.WalkFastMedium: ImageVector
    get() {
        if (_walkFastMedium != null) {
            return _walkFastMedium!!
        }
        _walkFastMedium = Builder(
            name = "WalkFastMedium",
            defaultWidth = 36.0.dp,
            defaultHeight =
                36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveTo(22.237f, 8.25f)
                curveToRelative(0.0f, -0.523f, 0.477f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.477f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.477f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.477f, -1.0f, -1.0f)
                moveToRelative(1.0f, -2.0f)
                curveToRelative(-1.076f, 0.0f, -2.0f, 0.924f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.924f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.924f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.924f, -2.0f, -2.0f, -2.0f)
                moveToRelative(-12.737f, 3.0f)
                lineTo(18.0f, 9.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-7.5f)
                close()
                moveTo(21.75f, 12.25f)
                horizontalLineToRelative(-0.15f)
                lineToRelative(-0.127f, 0.084f)
                lineToRelative(-4.5f, 3.0f)
                lineToRelative(-0.152f, 0.102f)
                lineToRelative(-0.051f, 0.177f)
                lineToRelative(-1.5f, 5.25f)
                lineToRelative(0.962f, 0.274f)
                lineToRelative(1.449f, -5.073f)
                lineToRelative(3.344f, -2.229f)
                lineToRelative(-1.264f, 6.317f)
                lineToRelative(-0.01f, 0.049f)
                lineToRelative(-0.11f, 0.549f)
                horizontalLineToRelative(0.11f)
                verticalLineToRelative(3.793f)
                lineToRelative(-4.353f, 4.353f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(4.5f, -4.5f)
                lineToRelative(0.146f, -0.146f)
                lineTo(20.751f, 20.75f)
                horizontalLineToRelative(2.292f)
                lineToRelative(2.66f, 2.66f)
                lineToRelative(-1.441f, 6.481f)
                lineToRelative(0.976f, 0.218f)
                lineToRelative(1.502f, -6.75f)
                lineToRelative(0.06f, -0.269f)
                lineToRelative(-0.195f, -0.194f)
                lineToRelative(-2.812f, -2.81f)
                lineToRelative(1.265f, -6.321f)
                lineToRelative(2.34f, 2.339f)
                lineToRelative(0.072f, 0.072f)
                lineToRelative(0.095f, 0.038f)
                lineToRelative(3.75f, 1.5f)
                lineToRelative(0.371f, -0.928f)
                lineToRelative(-3.654f, -1.462f)
                lineToRelative(-2.928f, -2.928f)
                lineToRelative(-0.146f, -0.146f)
                lineTo(21.75f, 12.25f)
                moveToRelative(-0.889f, 7.5f)
                lineToRelative(1.3f, -6.5f)
                horizontalLineToRelative(1.98f)
                lineToRelative(-1.3f, 6.5f)
                close()
                moveTo(7.5f, 13.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(4.5f, 19.75f)
                lineTo(12.0f, 19.75f)
                verticalLineToRelative(1.0f)
                lineTo(4.5f, 20.75f)
                close()
                moveTo(15.0f, 24.25f)
                lineTo(7.5f, 24.25f)
                verticalLineToRelative(1.0f)
                lineTo(15.0f, 25.25f)
                close()
            }
        }
            .build()
        return _walkFastMedium!!
    }

private var _walkFastMedium: ImageVector? = null
