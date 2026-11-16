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

public val SBBIcons.FactorySmall: ImageVector
    get() {
        if (_factorySmall != null) {
            return _factorySmall!!
        }
        _factorySmall = Builder(name = "FactorySmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 3.5f)
                verticalLineToRelative(7.499f)
                lineToRelative(3.2f, -2.4f)
                lineToRelative(0.8f, -0.599f)
                verticalLineToRelative(2.999f)
                lineToRelative(3.2f, -2.4f)
                lineToRelative(0.8f, -0.599f)
                verticalLineToRelative(2.999f)
                lineToRelative(3.2f, -2.4f)
                lineToRelative(0.8f, -0.599f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(-17.0f)
                verticalLineToRelative(-17.0f)
                close()
                moveTo(4.5f, 19.5f)
                horizontalLineToRelative(15.0f)
                lineTo(19.5f, 10.0f)
                lineToRelative(-3.2f, 2.4f)
                lineToRelative(-0.8f, 0.6f)
                verticalLineToRelative(-3.0f)
                lineToRelative(-3.2f, 2.4f)
                lineToRelative(-0.8f, 0.6f)
                verticalLineToRelative(-3.0f)
                lineToRelative(-3.2f, 2.4f)
                lineToRelative(-0.8f, 0.6f)
                lineTo(7.5f, 4.5f)
                horizontalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _factorySmall!!
    }

private var _factorySmall: ImageVector? = null
