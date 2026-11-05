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

public val SBBIcons.StopMedium: ImageVector
    get() {
        if (_stopMedium != null) {
            return _stopMedium!!
        }
        _stopMedium = Builder(name = "StopMedium", defaultWidth = 36.0.dp, defaultHeight = 36.0.dp,
                viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(28.25f, 28.25f)
                lineTo(7.75f, 28.25f)
                lineTo(7.75f, 7.75f)
                horizontalLineToRelative(20.5f)
                close()
                moveTo(8.75f, 27.25f)
                horizontalLineToRelative(18.5f)
                lineTo(27.25f, 8.75f)
                lineTo(8.75f, 8.75f)
                close()
            }
        }
        .build()
        return _stopMedium!!
    }

private var _stopMedium: ImageVector? = null
