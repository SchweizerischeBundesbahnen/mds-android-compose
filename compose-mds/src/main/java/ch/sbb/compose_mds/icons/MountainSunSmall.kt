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
                moveTo(7.0f, 7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.977f, 3.37f)
                lineToRelative(-0.597f, -0.695f)
                lineToRelative(-0.462f, -0.54f)
                lineToRelative(-0.353f, 0.617f)
                lineToRelative(-1.848f, 3.235f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 7.0f, 7.0f)
                moveToRelative(-0.815f, 6.917f)
                arcTo(4.001f, 4.001f, 0.0f, false, true, 7.0f, 6.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                curveToRelative(0.0f, 0.46f, -0.08f, 0.898f, -0.222f, 1.306f)
                lineToRelative(0.294f, 0.342f)
                lineToRelative(2.507f, -3.918f)
                lineToRelative(0.45f, -0.703f)
                lineToRelative(0.408f, 0.729f)
                lineToRelative(7.0f, 12.5f)
                lineToRelative(0.416f, 0.744f)
                lineTo(2.14f, 21.0f)
                lineToRelative(0.426f, -0.748f)
                close()
                moveTo(5.727f, 20.0f)
                lineToRelative(4.781f, -7.471f)
                lineToRelative(-1.426f, -1.665f)
                lineTo(3.862f, 20.0f)
                close()
                moveTo(20.147f, 20.0f)
                lineTo(6.913f, 20.0f)
                lineToRelative(4.05f, -6.33f)
                lineToRelative(0.938f, 0.938f)
                lineToRelative(2.0f, -1.0f)
                lineToRelative(0.745f, 0.745f)
                lineToRelative(0.289f, 0.29f)
                lineToRelative(0.34f, -0.226f)
                lineToRelative(1.274f, -0.841f)
                close()
                moveTo(12.099f, 13.391f)
                lineTo(11.516f, 12.808f)
                lineTo(13.971f, 8.972f)
                lineTo(16.059f, 12.701f)
                lineTo(15.064f, 13.357f)
                lineTo(14.099f, 12.391f)
                close()
            }
        }
        .build()
        return _mountainSunSmall!!
    }

private var _mountainSunSmall: ImageVector? = null
