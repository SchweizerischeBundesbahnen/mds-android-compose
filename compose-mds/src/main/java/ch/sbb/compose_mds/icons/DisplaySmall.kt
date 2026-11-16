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

public val SBBIcons.DisplaySmall: ImageVector
    get() {
        if (_displaySmall != null) {
            return _displaySmall!!
        }
        _displaySmall = Builder(name = "DisplaySmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.0f, 4.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.0f)
                lineTo(7.0f, 20.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                lineTo(3.0f, 17.0f)
                lineTo(3.0f, 4.0f)
                close()
                moveTo(20.0f, 16.0f)
                lineTo(4.0f, 16.0f)
                lineTo(4.0f, 5.0f)
                horizontalLineToRelative(16.0f)
                close()
            }
        }
        .build()
        return _displaySmall!!
    }

private var _displaySmall: ImageVector? = null
