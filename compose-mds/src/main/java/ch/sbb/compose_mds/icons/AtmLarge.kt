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

public val SBBIcons.AtmLarge: ImageVector
    get() {
        if (_atmLarge != null) {
            return _atmLarge!!
        }
        _atmLarge = Builder(name = "AtmLarge", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(40.5f, 4.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 43.0f, 6.5f)
                verticalLineToRelative(10.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, 2.5f)
                lineTo(37.0f, 19.0f)
                verticalLineToRelative(22.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-24.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, -1.5f)
                lineTo(10.0f, 19.0f)
                lineTo(6.5f, 19.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 4.0f, 16.5f)
                verticalLineToRelative(-10.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 6.5f, 4.0f)
                close()
                moveTo(11.0f, 41.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(24.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                lineTo(36.0f, 13.0f)
                horizontalLineToRelative(-5.018f)
                quadToRelative(0.017f, 0.248f, 0.018f, 0.5f)
                arcToRelative(7.5f, 7.5f, 0.0f, true, true, -14.982f, -0.5f)
                lineTo(11.0f, 13.0f)
                close()
                moveTo(31.0f, 37.0f)
                lineTo(16.0f, 37.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(15.0f)
                close()
                moveTo(32.0f, 31.0f)
                lineTo(15.0f, 31.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(17.0f)
                close()
                moveTo(16.0f, 30.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(-5.0f)
                lineTo(16.0f, 25.0f)
                close()
                moveTo(17.02f, 13.0f)
                quadToRelative(-0.02f, 0.247f, -0.02f, 0.5f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, false, 12.98f, -0.5f)
                close()
                moveTo(6.5f, 5.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 5.0f, 6.5f)
                verticalLineToRelative(10.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.5f, 18.0f)
                lineTo(10.0f, 18.0f)
                verticalLineToRelative(-5.0f)
                lineTo(7.0f, 13.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(33.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(3.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-10.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 40.5f, 5.0f)
                close()
            }
        }
        .build()
        return _atmLarge!!
    }

private var _atmLarge: ImageVector? = null
