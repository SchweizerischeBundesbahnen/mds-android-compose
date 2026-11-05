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

public val SBBIcons.ArrowCompassFilledMedium: ImageVector
    get() {
        if (_arrowCompassFilledMedium != null) {
            return _arrowCompassFilledMedium!!
        }
        _arrowCompassFilledMedium = Builder(name = "ArrowCompassFilledMedium", defaultWidth =
                36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(28.856f, 7.729f)
                lineTo(17.696f, 29.39f)
                lineToRelative(-0.945f, 1.833f)
                verticalLineTo(19.16f)
                horizontalLineTo(4.689f)
                lineToRelative(1.832f, -0.944f)
                lineToRelative(21.66f, -11.161f)
                lineToRelative(1.39f, -0.716f)
                close()
            }
        }
        .build()
        return _arrowCompassFilledMedium!!
    }

private var _arrowCompassFilledMedium: ImageVector? = null
