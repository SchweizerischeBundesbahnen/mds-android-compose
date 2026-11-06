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

public val SBBIcons.CircleMinusSmall: ImageVector
    get() {
        if (_circleMinusSmall != null) {
            return _circleMinusSmall!!
        }
        _circleMinusSmall = Builder(name = "CircleMinusSmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.0f, 11.5f)
                arcToRelative(7.5f, 7.5f, 0.0f, true, true, 15.0f, 0.0f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, -15.0f, 0.0f)
                moveTo(12.5f, 3.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, false, 0.0f, 17.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 0.0f, -17.0f)
                moveTo(8.0f, 11.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _circleMinusSmall!!
    }

private var _circleMinusSmall: ImageVector? = null
