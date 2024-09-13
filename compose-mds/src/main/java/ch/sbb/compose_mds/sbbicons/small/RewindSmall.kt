package ch.sbb.compose_mds.sbbicons.small

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.SmallGroup

public val SmallGroup.RewindSmall: ImageVector
    get() {
        if (_rewindSmall != null) {
            return _rewindSmall!!
        }
        _rewindSmall = Builder(name = "RewindSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.0f, 4.5f)
                verticalLineToRelative(15.0f)
                lineToRelative(-0.8f, -0.6f)
                lineTo(14.0f, 15.0f)
                verticalLineToRelative(4.478f)
                lineToRelative(-0.793f, -0.573f)
                lineToRelative(-9.0f, -6.5f)
                lineTo(3.646f, 12.0f)
                lineToRelative(0.561f, -0.405f)
                lineToRelative(9.0f, -6.5f)
                lineToRelative(0.793f, -0.573f)
                verticalLineTo(9.0f)
                lineToRelative(5.2f, -3.9f)
                close()
                moveTo(5.354f, 12.0f)
                lineTo(13.0f, 17.522f)
                verticalLineTo(13.0f)
                lineToRelative(0.8f, 0.6f)
                lineToRelative(5.2f, 3.9f)
                verticalLineToRelative(-11.0f)
                lineToRelative(-5.2f, 3.9f)
                lineToRelative(-0.8f, 0.6f)
                verticalLineTo(6.478f)
                close()
            }
        }
        .build()
        return _rewindSmall!!
    }

private var _rewindSmall: ImageVector? = null
