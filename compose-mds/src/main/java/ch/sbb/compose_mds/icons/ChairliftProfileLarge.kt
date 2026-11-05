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

public val SBBIcons.ChairliftProfileLarge: ImageVector
    get() {
        if (_chairliftProfileLarge != null) {
            return _chairliftProfileLarge!!
        }
        _chairliftProfileLarge = Builder(name = "ChairliftProfileLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(43.798f, 4.97f)
                lineTo(15.2f, 10.69f)
                verticalLineToRelative(2.14f)
                lineToRelative(-0.005f, 0.218f)
                arcTo(2.494f, 2.494f, 0.0f, false, true, 13.2f, 15.33f)
                horizontalLineToRelative(-0.002f)
                lineTo(6.4f, 16.689f)
                curveToRelative(-0.344f, 0.07f, -0.653f, 0.26f, -0.871f, 0.533f)
                verticalLineToRelative(0.001f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.329f, 0.967f)
                verticalLineToRelative(18.29f)
                arcToRelative(1.497f, 1.497f, 0.0f, false, false, 1.5f, 1.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-10.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(6.0f)
                horizontalLineTo(18.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-5.8f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(7.783f)
                lineToRelative(0.146f, 0.243f)
                lineToRelative(3.0f, 5.0f)
                lineToRelative(-0.858f, 0.514f)
                lineToRelative(-2.854f, -4.757f)
                horizontalLineTo(6.7f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, -2.5f)
                verticalLineTo(18.2f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.0f, -2.49f)
                horizontalLineToRelative(0.002f)
                lineToRelative(6.8f, -1.36f)
                curveToRelative(0.343f, -0.07f, 0.651f, -0.259f, 0.87f, -0.532f)
                verticalLineToRelative(-0.001f)
                curveToRelative(0.22f, -0.273f, 0.335f, -0.616f, 0.328f, -0.967f)
                verticalLineToRelative(-1.96f)
                lineTo(3.798f, 12.97f)
                lineToRelative(-0.196f, -0.98f)
                lineToRelative(40.0f, -8.0f)
                close()
                moveTo(10.7f, 19.98f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, -5.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.001f, 3.001f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.001f, -3.001f)
            }
        }
        .build()
        return _chairliftProfileLarge!!
    }

private var _chairliftProfileLarge: ImageVector? = null
