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

public val SBBIcons.FilterSmall: ImageVector
    get() {
        if (_filterSmall != null) {
            return _filterSmall!!
        }
        _filterSmall = Builder(name = "FilterSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.413f, 5.0f)
                horizontalLineToRelative(17.174f)
                lineToRelative(-0.707f, 0.825f)
                lineToRelative(-5.88f, 6.86f)
                lineTo(14.0f, 20.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-7.315f)
                lineToRelative(-5.88f, -6.86f)
                close()
                moveTo(5.587f, 6.0f)
                lineTo(10.88f, 12.174f)
                lineTo(11.0f, 12.314f)
                lineTo(11.0f, 19.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.685f)
                lineToRelative(0.12f, -0.14f)
                lineTo(18.413f, 6.0f)
                close()
            }
        }
        .build()
        return _filterSmall!!
    }

private var _filterSmall: ImageVector? = null
