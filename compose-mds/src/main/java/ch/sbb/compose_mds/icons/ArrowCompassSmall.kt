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

public val SBBIcons.ArrowCompassSmall: ImageVector
    get() {
        if (_arrowCompassSmall != null) {
            return _arrowCompassSmall!!
        }
        _arrowCompassSmall = Builder(name = "ArrowCompassSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 12.941f)
                lineTo(2.44f, 12.941f)
                lineToRelative(1.832f, -0.945f)
                lineToRelative(14.44f, -7.44f)
                lineToRelative(1.39f, -0.716f)
                lineToRelative(-0.716f, 1.389f)
                lineToRelative(-7.44f, 14.44f)
                lineToRelative(-0.444f, -0.228f)
                lineToRelative(0.444f, 0.229f)
                lineTo(11.0f, 21.503f)
                close()
                moveTo(6.562f, 11.941f)
                lineTo(12.0f, 11.941f)
                verticalLineToRelative(5.437f)
                lineTo(17.78f, 6.16f)
                close()
            }
        }
        .build()
        return _arrowCompassSmall!!
    }

private var _arrowCompassSmall: ImageVector? = null
