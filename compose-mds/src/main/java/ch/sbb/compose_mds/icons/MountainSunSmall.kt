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

public val SBBIcons.MountainSunSmall: ImageVector
    get() {
        if (_mountainSunSmall != null) {
            return _mountainSunSmall!!
        }
        _mountainSunSmall = Builder(name = "MountainSunSmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.0f, 6.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.814f, 7.918f)
                lineToRelative(-3.62f, 6.334f)
                lineToRelative(-0.428f, 0.748f)
                horizontalLineToRelative(19.715f)
                lineToRelative(-0.417f, -0.744f)
                lineToRelative(-7.0f, -12.5f)
                lineToRelative(-0.407f, -0.728f)
                lineToRelative(-0.45f, 0.702f)
                lineToRelative(-2.508f, 3.918f)
                lineToRelative(-0.293f, -0.342f)
                curveTo(10.92f, 10.899f, 11.0f, 10.46f, 11.0f, 10.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                moveToRelative(2.977f, 4.371f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, -3.26f, 2.616f)
                lineToRelative(1.849f, -3.235f)
                lineToRelative(0.352f, -0.616f)
                lineToRelative(0.462f, 0.539f)
                close()
                moveTo(5.727f, 20.0f)
                lineToRelative(4.781f, -7.472f)
                lineToRelative(-1.426f, -1.664f)
                lineTo(3.862f, 20.0f)
                close()
                moveTo(20.147f, 20.0f)
                lineTo(6.914f, 20.0f)
                lineToRelative(4.05f, -6.329f)
                lineToRelative(0.682f, 0.682f)
                lineToRelative(0.255f, 0.255f)
                lineToRelative(0.323f, -0.161f)
                lineToRelative(1.677f, -0.839f)
                lineToRelative(0.745f, 0.745f)
                lineToRelative(0.289f, 0.289f)
                lineToRelative(0.34f, -0.225f)
                lineToRelative(1.274f, -0.841f)
                close()
                moveTo(13.971f, 8.972f)
                lineToRelative(-2.455f, 3.837f)
                lineToRelative(0.583f, 0.582f)
                lineToRelative(1.677f, -0.838f)
                lineToRelative(0.323f, -0.162f)
                lineToRelative(0.255f, 0.255f)
                lineToRelative(0.71f, 0.712f)
                lineToRelative(0.995f, -0.657f)
                close()
            }
        }
        .build()
        return _mountainSunSmall!!
    }

private var _mountainSunSmall: ImageVector? = null
