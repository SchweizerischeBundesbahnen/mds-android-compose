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

public val SBBIcons.ArrowCompassSmall: ImageVector
    get() {
        if (_arrowCompassSmall != null) {
            return _arrowCompassSmall!!
        }
        _arrowCompassSmall = Builder(
            name = "ArrowCompassSmall",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveToRelative(20.1f, 3.84f)
                lineToRelative(-0.715f, 1.389f)
                lineToRelative(-7.44f, 14.441f)
                lineTo(11.0f, 21.503f)
                verticalLineToRelative(-8.562f)
                horizontalLineTo(2.438f)
                lineToRelative(1.833f, -0.945f)
                lineToRelative(14.44f, -7.44f)
                close()
                moveTo(6.563f, 11.94f)
                horizontalLineTo(12.0f)
                verticalLineToRelative(5.438f)
                lineTo(17.78f, 6.16f)
                close()
            }
        }
            .build()
        return _arrowCompassSmall!!
    }

private var _arrowCompassSmall: ImageVector? = null
