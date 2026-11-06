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

public val SBBIcons.OpenSourceSmall: ImageVector
    get() {
        if (_openSourceSmall != null) {
            return _openSourceSmall!!
        }
        _openSourceSmall = Builder(name = "OpenSourceSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 8.82f, 14.714f)
                lineToRelative(-0.213f, 0.377f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -4.78f, 4.148f)
                lineToRelative(-2.678f, -6.468f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 1.833f, -3.1f)
                lineToRelative(-0.04f, -0.256f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.845f, -1.561f)
                lineToRelative(-0.193f, -0.173f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -4.846f, 1.734f)
                lineToRelative(-0.04f, 0.256f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 1.834f, 3.1f)
                lineTo(8.173f, 21.24f)
                lineToRelative(-0.396f, -0.175f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -5.66f, -10.588f)
                lineToRelative(0.076f, -0.427f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 3.134f, -5.497f)
                lineToRelative(0.33f, -0.282f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 2.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(9.002f, 9.002f, 0.0f, false, false, -7.937f, 13.242f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 3.59f, 3.637f)
                lineToRelative(1.941f, -4.685f)
                arcToRelative(3.998f, 3.998f, 0.0f, true, true, 4.943f, -6.286f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.132f, 6.286f)
                lineToRelative(1.94f, 4.685f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 4.482f, -9.635f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 12.0f, 3.0f)
            }
        }
        .build()
        return _openSourceSmall!!
    }

private var _openSourceSmall: ImageVector? = null
