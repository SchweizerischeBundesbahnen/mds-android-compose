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
        _walkFastMedium = Builder(name = "WalkFastMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(23.237f, 7.25f)
                curveToRelative(0.523f, 0.0f, 1.0f, 0.477f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.477f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.477f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.477f, -1.0f, 1.0f, -1.0f)
                moveToRelative(0.0f, 3.0f)
                curveToRelative(1.076f, 0.0f, 2.0f, -0.924f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.924f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.924f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.924f, 2.0f, 2.0f, 2.0f)
                moveTo(18.0f, 9.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(28.032f, 15.324f)
                lineTo(24.958f, 12.25f)
                horizontalLineToRelative(-3.359f)
                lineToRelative(-4.626f, 3.084f)
                lineToRelative(-0.153f, 0.101f)
                lineToRelative(-0.05f, 0.177f)
                lineToRelative(-1.5f, 5.25f)
                lineToRelative(0.961f, 0.276f)
                lineToRelative(1.45f, -5.074f)
                lineToRelative(3.344f, -2.23f)
                lineToRelative(-1.264f, 6.318f)
                lineToRelative(-0.01f, 0.048f)
                lineToRelative(-0.11f, 0.55f)
                horizontalLineToRelative(0.11f)
                verticalLineToRelative(3.793f)
                lineToRelative(-4.353f, 4.353f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(4.647f, -4.647f)
                lineTo(20.752f, 20.75f)
                horizontalLineToRelative(2.291f)
                lineToRelative(2.661f, 2.66f)
                lineToRelative(-1.442f, 6.482f)
                lineToRelative(0.976f, 0.216f)
                lineToRelative(1.501f, -6.75f)
                lineToRelative(0.06f, -0.267f)
                lineToRelative(-0.194f, -0.195f)
                lineToRelative(-2.812f, -2.81f)
                lineToRelative(1.093f, -5.461f)
                lineToRelative(0.173f, -0.86f)
                lineToRelative(2.41f, 2.41f)
                lineToRelative(0.096f, 0.039f)
                lineToRelative(3.75f, 1.5f)
                lineToRelative(0.371f, -0.928f)
                close()
                moveTo(22.162f, 13.25f)
                lineTo(20.862f, 19.75f)
                horizontalLineToRelative(1.977f)
                lineToRelative(0.855f, -4.268f)
                lineToRelative(0.447f, -2.232f)
                close()
                moveTo(13.5f, 14.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(12.0f, 19.75f)
                verticalLineToRelative(1.0f)
                lineTo(4.5f, 20.75f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(15.0f, 25.25f)
                verticalLineToRelative(-1.0f)
                lineTo(7.5f, 24.25f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _walkFastMedium!!
    }

private var _walkFastMedium: ImageVector? = null
