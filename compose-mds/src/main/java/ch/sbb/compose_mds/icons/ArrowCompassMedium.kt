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

public val SBBIcons.ArrowCompassMedium: ImageVector
    get() {
        if (_arrowCompassMedium != null) {
            return _arrowCompassMedium!!
        }
        _arrowCompassMedium = Builder(name = "ArrowCompassMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(28.856f, 7.728f)
                lineTo(17.696f, 29.39f)
                lineToRelative(-0.945f, 1.833f)
                verticalLineTo(19.161f)
                horizontalLineTo(4.689f)
                lineToRelative(1.832f, -0.944f)
                lineToRelative(21.66f, -11.162f)
                lineToRelative(1.39f, -0.715f)
                close()
                moveTo(8.813f, 18.161f)
                horizontalLineToRelative(8.937f)
                verticalLineToRelative(8.938f)
                lineToRelative(9.5f, -18.44f)
                close()
            }
        }
        .build()
        return _arrowCompassMedium!!
    }

private var _arrowCompassMedium: ImageVector? = null
