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

public val SBBIcons.KeyboardMedium: ImageVector
    get() {
        if (_keyboardMedium != null) {
            return _keyboardMedium!!
        }
        _keyboardMedium = Builder(
            name = "KeyboardMedium",
            defaultWidth = 36.0.dp,
            defaultHeight =
                36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
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
                moveTo(15.75f, 9.249f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(6.0f)
                lineTo(4.75f, 15.249f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(26.5f)
                verticalLineToRelative(-13.0f)
                horizontalLineToRelative(-15.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(6.25f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(5.75f, 16.249f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(24.5f)
                verticalLineToRelative(-11.0f)
                close()
                moveTo(7.5f, 19.249f)
                lineTo(9.0f, 19.249f)
                verticalLineToRelative(-1.0f)
                lineTo(7.5f, 18.249f)
                close()
                moveTo(7.5f, 21.249f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(12.0f, 19.249f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-1.0f)
                lineTo(12.0f, 18.249f)
                close()
                moveTo(12.0f, 22.249f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-1.0f)
                lineTo(12.0f, 21.249f)
                close()
                moveTo(12.0f, 25.249f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-1.0f)
                lineTo(12.0f, 24.249f)
                close()
                moveTo(7.5f, 25.249f)
                lineTo(9.0f, 25.249f)
                verticalLineToRelative(-1.0f)
                lineTo(7.5f, 24.249f)
                close()
                moveTo(25.5f, 25.249f)
                lineTo(24.0f, 25.249f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.5f)
                close()
                moveTo(27.0f, 24.249f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(16.5f, 21.249f)
                verticalLineToRelative(1.0f)
                lineTo(15.0f, 22.249f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(18.0f, 22.249f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-1.0f)
                lineTo(18.0f, 21.249f)
                close()
                moveTo(22.5f, 22.249f)
                lineTo(21.0f, 22.249f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.5f)
                close()
                moveTo(24.0f, 22.249f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-1.0f)
                lineTo(24.0f, 21.249f)
                close()
                moveTo(15.0f, 19.249f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-1.0f)
                lineTo(15.0f, 18.249f)
                close()
                moveTo(16.5f, 19.249f)
                lineTo(18.0f, 19.249f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.5f)
                close()
                moveTo(21.0f, 19.249f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-1.0f)
                lineTo(21.0f, 18.249f)
                close()
                moveTo(22.5f, 19.249f)
                lineTo(24.0f, 19.249f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.5f)
                close()
                moveTo(13.5f, 25.249f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(25.5f, 19.249f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(3.25f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-4.25f)
                lineTo(25.5f, 18.249f)
                close()
            }
        }
            .build()
        return _keyboardMedium!!
    }

private var _keyboardMedium: ImageVector? = null
