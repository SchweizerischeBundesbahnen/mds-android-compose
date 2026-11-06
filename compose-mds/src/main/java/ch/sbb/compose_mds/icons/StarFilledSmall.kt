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

public val SBBIcons.StarFilledSmall: ImageVector
    get() {
        if (_starFilledSmall != null) {
            return _starFilledSmall!!
        }
        _starFilledSmall = Builder(name = "StarFilledSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.475f, 3.342f)
                lineTo(14.36f, 9.0f)
                horizontalLineToRelative(6.597f)
                lineToRelative(-1.15f, 0.895f)
                lineToRelative(-4.218f, 3.279f)
                lineToRelative(1.884f, 5.462f)
                lineToRelative(0.48f, 1.39f)
                lineToRelative(-1.228f, -0.809f)
                lineTo(12.0f, 16.099f)
                lineToRelative(-4.725f, 3.118f)
                lineToRelative(-1.227f, 0.81f)
                lineToRelative(0.48f, -1.391f)
                lineToRelative(1.882f, -5.462f)
                lineToRelative(-4.217f, -3.28f)
                lineTo(3.043f, 9.0f)
                horizontalLineTo(9.64f)
                lineToRelative(1.885f, -5.658f)
                lineTo(12.0f, 1.919f)
                close()
            }
        }
        .build()
        return _starFilledSmall!!
    }

private var _starFilledSmall: ImageVector? = null
