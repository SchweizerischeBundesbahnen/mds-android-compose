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

public val SBBIcons.WaraWarnAppLarge: ImageVector
    get() {
        if (_waraWarnAppLarge != null) {
            return _waraWarnAppLarge!!
        }
        _waraWarnAppLarge = Builder(name = "WaraWarnAppLarge", defaultWidth = 48.0.dp, defaultHeight
                = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(44.27f, 41.0f)
                lineTo(26.73f, 41.0f)
                lineToRelative(8.77f, -19.731f)
                close()
                moveTo(28.27f, 40.0f)
                horizontalLineToRelative(14.46f)
                lineTo(35.5f, 23.731f)
                close()
                moveTo(35.724f, 11.053f)
                lineTo(36.522f, 11.451f)
                lineTo(35.765f, 11.924f)
                lineTo(29.243f, 16.0f)
                lineTo(36.0f, 16.0f)
                verticalLineToRelative(1.0f)
                lineTo(16.0f, 17.0f)
                verticalLineToRelative(8.0f)
                lineTo(8.0f, 25.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(19.0f)
                verticalLineToRelative(1.0f)
                lineTo(13.913f, 35.0f)
                quadToRelative(0.085f, 0.236f, 0.087f, 0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -2.913f, -0.5f)
                lineTo(7.0f, 35.0f)
                verticalLineToRelative(-2.0f)
                lineTo(4.0f, 33.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(17.357f)
                lineToRelative(7.121f, -4.452f)
                lineToRelative(-7.202f, -3.6f)
                lineToRelative(0.448f, -0.895f)
                close()
                moveTo(36.0f, 37.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(12.5f, 35.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveTo(36.0f, 33.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(30.0f, 25.0f)
                lineTo(19.0f, 25.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(11.0f)
                close()
                moveTo(20.0f, 24.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-9.0f)
                close()
            }
        }
        .build()
        return _waraWarnAppLarge!!
    }

private var _waraWarnAppLarge: ImageVector? = null
