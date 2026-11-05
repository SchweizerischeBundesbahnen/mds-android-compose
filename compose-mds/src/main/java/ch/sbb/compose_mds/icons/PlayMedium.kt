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

public val SBBIcons.PlayMedium: ImageVector
    get() {
        if (_playMedium != null) {
            return _playMedium!!
        }
        _playMedium = Builder(name = "PlayMedium", defaultWidth = 36.0.dp, defaultHeight = 36.0.dp,
                viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.502f, 7.068f)
                lineToRelative(18.0f, 10.5f)
                lineToRelative(0.74f, 0.431f)
                lineToRelative(-0.74f, 0.432f)
                lineToRelative(-18.0f, 10.5f)
                lineToRelative(-0.752f, 0.439f)
                lineTo(10.75f, 6.63f)
                close()
                moveTo(11.75f, 27.628f)
                lineTo(19.998f, 22.818f)
                lineTo(28.258f, 18.0f)
                lineToRelative(-8.26f, -4.819f)
                lineTo(11.75f, 8.37f)
                close()
            }
        }
        .build()
        return _playMedium!!
    }

private var _playMedium: ImageVector? = null
