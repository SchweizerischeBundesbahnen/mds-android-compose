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

public val SBBIcons.FastForwardMedium: ImageVector
    get() {
        if (_fastForwardMedium != null) {
            return _fastForwardMedium!!
        }
        _fastForwardMedium = Builder(name = "FastForwardMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.043f, 7.844f)
                lineToRelative(13.5f, 9.75f)
                lineToRelative(0.56f, 0.406f)
                lineToRelative(-0.56f, 0.405f)
                lineToRelative(-13.5f, 9.75f)
                lineToRelative(-0.793f, 0.572f)
                verticalLineToRelative(-6.5f)
                lineToRelative(-1.457f, 1.053f)
                lineToRelative(-6.75f, 4.875f)
                lineToRelative(-0.793f, 0.572f)
                lineTo(6.25f, 7.272f)
                lineToRelative(0.793f, 0.572f)
                lineToRelative(6.75f, 4.875f)
                lineToRelative(1.457f, 1.051f)
                lineTo(15.25f, 7.272f)
                close()
                moveTo(16.25f, 15.727f)
                lineTo(15.457f, 15.155f)
                lineTo(13.207f, 13.53f)
                lineTo(7.25f, 9.227f)
                verticalLineToRelative(17.544f)
                lineToRelative(5.957f, -4.302f)
                lineToRelative(2.25f, -1.626f)
                lineToRelative(0.793f, -0.573f)
                verticalLineToRelative(6.501f)
                lineToRelative(5.957f, -4.302f)
                lineTo(28.395f, 18.0f)
                lineToRelative(-6.188f, -4.47f)
                lineToRelative(-5.957f, -4.302f)
                close()
            }
        }
        .build()
        return _fastForwardMedium!!
    }

private var _fastForwardMedium: ImageVector? = null
