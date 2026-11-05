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

public val SBBIcons.KeyboardSmall: ImageVector
    get() {
        if (_keyboardSmall != null) {
            return _keyboardSmall!!
        }
        _keyboardSmall = Builder(name = "KeyboardSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.5f, 6.0f)
                lineTo(10.0f, 6.0f)
                verticalLineToRelative(4.0f)
                lineTo(3.0f, 10.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-9.0f)
                lineTo(11.0f, 10.0f)
                lineTo(11.0f, 7.0f)
                horizontalLineToRelative(4.0f)
                lineTo(15.0f, 6.0f)
                close()
                moveTo(4.0f, 11.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(5.0f, 13.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.0f)
                lineTo(5.0f, 12.0f)
                close()
                moveTo(5.0f, 14.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(8.0f, 13.0f)
                lineTo(7.0f, 13.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(8.0f, 15.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.0f)
                lineTo(8.0f, 14.0f)
                close()
                moveTo(8.0f, 17.0f)
                lineTo(7.0f, 17.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(5.0f, 17.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.0f)
                lineTo(5.0f, 16.0f)
                close()
                moveTo(17.0f, 17.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(18.0f, 16.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(11.0f, 14.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(12.0f, 15.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(15.0f, 15.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(16.0f, 15.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(10.0f, 13.0f)
                lineTo(9.0f, 13.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(11.0f, 13.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(14.0f, 13.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(15.0f, 13.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(9.0f, 17.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(17.0f, 13.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _keyboardSmall!!
    }

private var _keyboardSmall: ImageVector? = null
