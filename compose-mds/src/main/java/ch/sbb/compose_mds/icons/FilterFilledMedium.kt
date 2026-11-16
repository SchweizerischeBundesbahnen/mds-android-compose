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

public val SBBIcons.FilterFilledMedium: ImageVector
    get() {
        if (_filterFilledMedium != null) {
            return _filterFilledMedium!!
        }
        _filterFilledMedium = Builder(name = "FilterFilledMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(29.63f, 8.575f)
                lineToRelative(-8.88f, 10.36f)
                verticalLineTo(29.75f)
                horizontalLineToRelative(-5.5f)
                verticalLineTo(18.934f)
                lineTo(6.37f, 8.574f)
                lineToRelative(-0.707f, -0.824f)
                horizontalLineToRelative(24.674f)
                close()
            }
        }
        .build()
        return _filterFilledMedium!!
    }

private var _filterFilledMedium: ImageVector? = null
