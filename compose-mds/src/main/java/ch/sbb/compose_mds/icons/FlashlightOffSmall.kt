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

public val SBBIcons.FlashlightOffSmall: ImageVector
    get() {
        if (_flashlightOffSmall != null) {
            return _flashlightOffSmall!!
        }
        _flashlightOffSmall = Builder(
            name = "FlashlightOffSmall",
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
                moveTo(7.0f, 6.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(3.096f)
                lineToRelative(-0.036f, 0.09f)
                lineToRelative(-0.964f, 2.41f)
                lineTo(15.0f, 22.0f)
                lineTo(8.003f, 22.0f)
                lineTo(8.003f, 11.605f)
                lineToRelative(-0.967f, -2.42f)
                lineTo(7.0f, 9.097f)
                lineTo(7.0f, 6.0f)
                moveToRelative(2.003f, 6.0f)
                lineTo(14.0f, 12.0f)
                verticalLineToRelative(9.0f)
                lineTo(9.003f, 21.0f)
                close()
                moveTo(14.762f, 9.5f)
                lineTo(14.162f, 11.0f)
                lineTo(8.839f, 11.0f)
                lineToRelative(-0.6f, -1.5f)
                close()
                moveTo(15.0f, 8.5f)
                lineTo(8.0f, 8.5f)
                lineTo(8.0f, 7.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(10.5f, 13.0f)
                lineTo(10.0f, 13.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-2.5f)
                moveToRelative(0.5f, 6.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(12.0f, 17.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
            .build()
        return _flashlightOffSmall!!
    }

private var _flashlightOffSmall: ImageVector? = null
