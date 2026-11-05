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

public val SBBIcons.PlaySmall: ImageVector
    get() {
        if (_playSmall != null) {
            return _playSmall!!
        }
        _playSmall = Builder(name = "PlaySmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(7.0f, 4.13f)
                lineToRelative(0.752f, 0.438f)
                lineToRelative(6.0f, 3.5f)
                lineToRelative(6.0f, 3.5f)
                lineToRelative(0.74f, 0.432f)
                lineToRelative(-0.74f, 0.432f)
                lineToRelative(-6.0f, 3.5f)
                lineToRelative(-6.0f, 3.5f)
                lineTo(7.0f, 19.87f)
                verticalLineTo(4.13f)
                moveToRelative(1.0f, 1.74f)
                verticalLineToRelative(12.26f)
                lineToRelative(5.248f, -3.062f)
                lineTo(18.508f, 12.0f)
                lineToRelative(-5.26f, -3.068f)
                close()
            }
        }
        .build()
        return _playSmall!!
    }

private var _playSmall: ImageVector? = null
