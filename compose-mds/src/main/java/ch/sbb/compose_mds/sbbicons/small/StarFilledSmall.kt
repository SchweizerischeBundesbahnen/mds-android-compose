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

public val SmallGroup.StarFilledSmall: ImageVector
    get() {
        if (_starFilledSmall != null) {
            return _starFilledSmall!!
        }
        _starFilledSmall = Builder(name = "StarFilledSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.0f, 9.5f)
                horizontalLineTo(4.5f)
                lineTo(9.0f, 13.0f)
                lineToRelative(-2.0f, 5.8f)
                lineToRelative(5.0f, -3.3f)
                lineToRelative(5.0f, 3.3f)
                lineToRelative(-2.0f, -5.8f)
                lineToRelative(4.5f, -3.5f)
                horizontalLineTo(14.0f)
                lineToRelative(-2.0f, -6.0f)
                close()
            }
        }
        .build()
        return _starFilledSmall!!
    }

private var _starFilledSmall: ImageVector? = null
