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

public val SBBIcons.FogSmall: ImageVector
    get() {
        if (_fogSmall != null) {
            return _fogSmall!!
        }
        _fogSmall = Builder(
            name = "FogSmall",
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
                moveTo(11.0f, 5.0f)
                horizontalLineToRelative(5.0f)
                lineTo(16.0f, 4.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(8.0f, 7.0f)
                horizontalLineToRelative(9.0f)
                lineTo(17.0f, 6.0f)
                lineTo(8.0f, 6.0f)
                close()
                moveTo(17.0f, 9.0f)
                lineTo(7.0f, 9.0f)
                lineTo(7.0f, 8.0f)
                horizontalLineToRelative(10.0f)
                close()
                moveTo(6.0f, 11.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.0f)
                lineTo(6.0f, 10.0f)
                close()
                moveTo(19.0f, 11.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(7.0f, 13.01f)
                lineTo(19.0f, 13.0f)
                verticalLineToRelative(-1.0f)
                lineToRelative(-12.0f, 0.01f)
                close()
            }
        }
            .build()
        return _fogSmall!!
    }

private var _fogSmall: ImageVector? = null
