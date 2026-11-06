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

public val SBBIcons.ToiletLarge: ImageVector
    get() {
        if (_toiletLarge != null) {
            return _toiletLarge!!
        }
        _toiletLarge = Builder(name = "ToiletLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 40.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(23.0f, 7.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(15.999f, 27.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(8.999f, 27.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(6.999f, 16.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(41.98f, 30.362f)
                lineTo(42.163f, 31.0f)
                lineTo(38.0f, 31.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-4.163f)
                lineToRelative(0.183f, -0.638f)
                lineTo(33.123f, 16.0f)
                horizontalLineToRelative(4.754f)
                close()
                moveTo(8.0f, 26.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(3.0f)
                lineTo(13.0f, 26.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-7.0f)
                close()
                moveTo(34.0f, 38.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(30.163f, 30.0f)
                horizontalLineToRelative(10.674f)
                lineToRelative(-3.714f, -13.0f)
                horizontalLineToRelative(-3.246f)
                close()
                moveTo(11.5f, 8.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.001f, 4.999f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 11.5f, 8.0f)
                moveTo(35.5f, 8.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.001f, 5.001f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 35.5f, 8.0f)
                moveTo(11.499f, 9.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -0.001f, 2.999f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.499f, 9.0f)
                moveTo(35.5f, 9.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -0.001f, 2.999f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 35.5f, 9.0f)
            }
        }
        .build()
        return _toiletLarge!!
    }

private var _toiletLarge: ImageVector? = null
