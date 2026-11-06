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

public val SBBIcons.SbbSignetLarge: ImageVector
    get() {
        if (_sbbSignetLarge != null) {
            return _sbbSignetLarge!!
        }
        _sbbSignetLarge = Builder(name = "SbbSignetLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(26.74f, 17.0f)
                lineToRelative(5.1f, 5.02f)
                horizontalLineTo(25.5f)
                verticalLineTo(17.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(5.02f)
                horizontalLineToRelative(-6.3f)
                lineTo(21.3f, 17.0f)
                horizontalLineToRelative(-3.79f)
                lineTo(11.0f, 23.5f)
                lineToRelative(6.51f, 6.5f)
                horizontalLineToRelative(3.79f)
                lineToRelative(-5.1f, -4.99f)
                horizontalLineToRelative(6.3f)
                verticalLineTo(30.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-4.99f)
                horizontalLineToRelative(6.34f)
                lineTo(26.74f, 30.0f)
                horizontalLineToRelative(3.79f)
                lineTo(37.0f, 23.5f)
                lineTo(30.53f, 17.0f)
                close()
            }
        }
        .build()
        return _sbbSignetLarge!!
    }

private var _sbbSignetLarge: ImageVector? = null
