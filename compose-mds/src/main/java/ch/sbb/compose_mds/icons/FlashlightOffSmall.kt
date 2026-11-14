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
        _flashlightOffSmall = Builder(name = "FlashlightOffSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.0f, 6.0f)
                verticalLineToRelative(3.097f)
                lineToRelative(-0.036f, 0.089f)
                lineTo(15.0f, 11.594f)
                lineTo(15.0f, 22.0f)
                lineTo(8.003f, 22.0f)
                lineTo(8.003f, 11.604f)
                lineToRelative(-0.967f, -2.418f)
                lineTo(7.0f, 9.096f)
                lineTo(7.0f, 6.0f)
                close()
                moveTo(9.003f, 12.0f)
                horizontalLineToRelative(4.998f)
                verticalLineToRelative(9.0f)
                lineTo(9.003f, 21.0f)
                close()
                moveTo(8.838f, 11.0f)
                horizontalLineToRelative(5.324f)
                lineToRelative(0.6f, -1.5f)
                lineTo(8.238f, 9.5f)
                close()
                moveTo(8.0f, 8.5f)
                lineTo(8.0f, 7.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(13.0f, 20.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(7.0f)
                close()
                moveTo(12.0f, 19.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
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
