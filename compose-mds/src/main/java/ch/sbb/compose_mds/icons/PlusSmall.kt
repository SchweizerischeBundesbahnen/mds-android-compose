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

public val SBBIcons.PlusSmall: ImageVector
    get() {
        if (_plusSmall != null) {
            return _plusSmall!!
        }
        _plusSmall = Builder(
            name = "PlusSmall",
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
                moveTo(12.5f, 11.5f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
            .build()
        return _plusSmall!!
    }

private var _plusSmall: ImageVector? = null
