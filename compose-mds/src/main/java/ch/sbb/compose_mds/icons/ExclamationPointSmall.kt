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

public val SBBIcons.ExclamationPointSmall: ImageVector
    get() {
        if (_exclamationPointSmall != null) {
            return _exclamationPointSmall!!
        }
        _exclamationPointSmall = Builder(name = "ExclamationPointSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.998f, 17.09f)
                lineTo(12.998f, 19.0f)
                horizontalLineToRelative(-1.995f)
                verticalLineToRelative(-1.91f)
                close()
                moveTo(12.904f, 9.592f)
                lineTo(12.44f, 15.622f)
                horizontalLineToRelative(-0.88f)
                lineToRelative(-0.446f, -6.03f)
                lineTo(11.114f, 5.436f)
                horizontalLineToRelative(1.79f)
                close()
            }
        }
        .build()
        return _exclamationPointSmall!!
    }

private var _exclamationPointSmall: ImageVector? = null
