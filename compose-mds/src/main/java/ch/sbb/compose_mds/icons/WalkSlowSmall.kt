package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.WalkSlowSmall: ImageVector
    get() {
        if (_walkSlowSmall != null) {
            return _walkSlowSmall!!
        }
        _walkSlowSmall = Builder(name = "WalkSlowSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.948f, 8.276f)
                lineToRelative(0.98f, 1.96f)
                lineTo(17.4f, 12.2f)
                lineToRelative(-0.8f, 0.6f)
                lineToRelative(-1.5f, -2.0f)
                lineToRelative(-0.027f, -0.036f)
                lineToRelative(-0.02f, -0.04f)
                lineToRelative(-0.054f, -0.109f)
                verticalLineToRelative(2.855f)
                lineToRelative(0.942f, 1.798f)
                lineToRelative(0.058f, 0.109f)
                lineTo(15.999f, 20.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-4.378f)
                lineToRelative(-0.802f, -1.53f)
                lineTo(13.0f, 14.092f)
                verticalLineToRelative(2.443f)
                lineToRelative(-0.005f, 0.035f)
                lineToRelative(-0.5f, 3.5f)
                lineToRelative(-0.99f, -0.141f)
                lineToRelative(0.495f, -3.466f)
                lineTo(12.0f, 9.708f)
                lineToRelative(-1.0f, 0.999f)
                lineTo(11.0f, 13.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.707f)
                lineTo(12.295f, 8.0f)
                horizontalLineToRelative(2.515f)
                close()
                moveTo(11.0f, 13.723f)
                lineToRelative(-2.06f, 5.1f)
                lineToRelative(-0.188f, 0.465f)
                lineToRelative(-0.453f, -0.186f)
                arcToRelative(0.498f, 0.498f, 0.0f, false, true, -0.391f, 0.92f)
                arcToRelative(0.501f, 0.501f, 0.0f, false, true, 0.357f, -0.933f)
                lineToRelative(-1.83f, -0.747f)
                lineToRelative(-0.462f, -0.189f)
                lineToRelative(0.187f, -0.462f)
                lineToRelative(1.124f, -2.78f)
                lineToRelative(0.188f, -0.466f)
                lineToRelative(0.464f, 0.189f)
                lineToRelative(1.388f, 0.565f)
                lineToRelative(0.748f, -1.851f)
                close()
                moveTo(6.24f, 18.309f)
                quadToRelative(0.094f, 0.0f, 0.187f, 0.036f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.187f, -0.036f)
                moveToRelative(1.034f, -0.706f)
                lineToRelative(0.926f, 0.378f)
                lineToRelative(0.749f, -1.854f)
                lineToRelative(-0.926f, -0.378f)
                close()
                moveTo(13.0f, 13.094f)
                horizontalLineToRelative(1.0f)
                lineTo(14.0f, 9.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(13.5f, 4.0f)
                curveToRelative(0.809f, 0.0f, 1.5f, 0.69f, 1.5f, 1.5f)
                reflectiveCurveTo(14.309f, 7.0f, 13.5f, 7.0f)
                curveToRelative(-0.81f, 0.0f, -1.5f, -0.69f, -1.5f, -1.5f)
                reflectiveCurveTo(12.69f, 4.0f, 13.5f, 4.0f)
                moveToRelative(0.0f, 1.0f)
                curveToRelative(-0.257f, 0.0f, -0.5f, 0.243f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.243f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.243f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.243f, -0.5f, -0.5f, -0.5f)
            }
        }
        .build()
        return _walkSlowSmall!!
    }

private var _walkSlowSmall: ImageVector? = null
