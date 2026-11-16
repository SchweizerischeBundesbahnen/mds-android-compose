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

public val SBBIcons.FactoryMedium: ImageVector
    get() {
        if (_factoryMedium != null) {
            return _factoryMedium!!
        }
        _factoryMedium = Builder(name = "FactoryMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 5.5f)
                verticalLineToRelative(11.499f)
                lineToRelative(5.2f, -3.9f)
                lineToRelative(0.8f, -0.599f)
                verticalLineToRelative(4.499f)
                lineToRelative(5.2f, -3.9f)
                lineToRelative(0.8f, -0.599f)
                verticalLineToRelative(4.499f)
                lineToRelative(5.2f, -3.9f)
                lineToRelative(0.8f, -0.599f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(-25.0f)
                verticalLineToRelative(-25.0f)
                close()
                moveTo(6.5f, 29.5f)
                horizontalLineToRelative(23.0f)
                verticalLineToRelative(-15.0f)
                lineToRelative(-5.2f, 3.9f)
                lineToRelative(-0.8f, 0.6f)
                verticalLineToRelative(-4.5f)
                lineToRelative(-5.2f, 3.9f)
                lineToRelative(-0.8f, 0.6f)
                verticalLineToRelative(-4.5f)
                lineToRelative(-5.2f, 3.9f)
                lineToRelative(-0.8f, 0.6f)
                lineTo(11.5f, 6.5f)
                horizontalLineToRelative(-5.0f)
                close()
            }
        }
        .build()
        return _factoryMedium!!
    }

private var _factoryMedium: ImageVector? = null
