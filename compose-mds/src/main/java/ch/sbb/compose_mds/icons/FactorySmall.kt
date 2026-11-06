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

public val SBBIcons.FactorySmall: ImageVector
    get() {
        if (_factorySmall != null) {
            return _factorySmall!!
        }
        _factorySmall = Builder(name = "FactorySmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.5f, 3.5f)
                horizontalLineToRelative(5.0f)
                verticalLineTo(11.0f)
                lineToRelative(3.2f, -2.4f)
                lineToRelative(0.8f, -0.6f)
                verticalLineToRelative(3.0f)
                lineToRelative(3.2f, -2.4f)
                lineToRelative(0.8f, -0.6f)
                verticalLineToRelative(3.0f)
                lineToRelative(3.2f, -2.4f)
                lineToRelative(0.8f, -0.6f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(-17.0f)
                verticalLineToRelative(-17.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(15.0f)
                verticalLineTo(10.0f)
                lineToRelative(-3.2f, 2.4f)
                lineToRelative(-0.8f, 0.6f)
                verticalLineToRelative(-3.0f)
                lineToRelative(-3.2f, 2.4f)
                lineToRelative(-0.8f, 0.6f)
                verticalLineToRelative(-3.0f)
                lineToRelative(-3.2f, 2.4f)
                lineToRelative(-0.8f, 0.6f)
                verticalLineTo(4.5f)
                close()
            }
        }
        .build()
        return _factorySmall!!
    }

private var _factorySmall: ImageVector? = null
