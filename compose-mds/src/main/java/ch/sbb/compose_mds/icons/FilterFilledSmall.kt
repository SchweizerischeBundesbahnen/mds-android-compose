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

public val SBBIcons.FilterFilledSmall: ImageVector
    get() {
        if (_filterFilledSmall != null) {
            return _filterFilledSmall!!
        }
        _filterFilledSmall = Builder(name = "FilterFilledSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.88f, 5.825f)
                lineTo(14.0f, 12.685f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-7.316f)
                lineToRelative(-5.88f, -6.86f)
                lineTo(3.413f, 5.0f)
                horizontalLineToRelative(17.174f)
                close()
            }
        }
        .build()
        return _filterFilledSmall!!
    }

private var _filterFilledSmall: ImageVector? = null
