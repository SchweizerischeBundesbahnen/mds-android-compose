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

public val SBBIcons.FlashlightOnSmall: ImageVector
    get() {
        if (_flashlightOnSmall != null) {
            return _flashlightOnSmall!!
        }
        _flashlightOnSmall = Builder(
            name = "FlashlightOnSmall",
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
                moveToRelative(9.416f, 4.723f)
                lineToRelative(-2.0f, -3.0f)
                lineToRelative(-0.832f, 0.555f)
                lineToRelative(2.0f, 3.0f)
                close()
                moveTo(16.416f, 2.278f)
                lineTo(14.416f, 5.278f)
                lineTo(13.584f, 4.723f)
                lineTo(15.584f, 1.723f)
                close()
                moveTo(11.0f, 2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.0f)
                lineTo(12.0f, 2.0f)
                close()
                moveTo(7.5f, 6.0f)
                lineTo(7.0f, 6.0f)
                verticalLineToRelative(3.096f)
                lineToRelative(0.036f, 0.09f)
                lineToRelative(0.967f, 2.418f)
                lineTo(8.003f, 22.0f)
                lineTo(15.0f, 22.0f)
                lineTo(15.0f, 11.597f)
                lineToRelative(0.964f, -2.411f)
                lineToRelative(0.036f, -0.09f)
                lineTo(16.0f, 6.0f)
                lineTo(7.5f, 6.0f)
                moveToRelative(1.503f, 6.0f)
                lineTo(14.0f, 12.0f)
                verticalLineToRelative(9.0f)
                lineTo(9.003f, 21.0f)
                close()
                moveTo(14.162f, 11.0f)
                lineTo(14.762f, 9.5f)
                lineTo(8.239f, 9.5f)
                lineToRelative(0.6f, 1.5f)
                close()
                moveTo(8.0f, 8.5f)
                horizontalLineToRelative(7.0f)
                lineTo(15.0f, 7.0f)
                lineTo(8.0f, 7.0f)
                close()
                moveTo(10.0f, 13.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-7.0f)
                moveToRelative(1.0f, 3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(11.0f, 15.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.0f)
                close()
            }
        }
            .build()
        return _flashlightOnSmall!!
    }

private var _flashlightOnSmall: ImageVector? = null
