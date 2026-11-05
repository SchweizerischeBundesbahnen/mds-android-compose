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

public val SBBIcons.CreateLarge: ImageVector
    get() {
        if (_createLarge != null) {
            return _createLarge!!
        }
        _createLarge = Builder(name = "CreateLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(25.0f, 15.0f)
                lineTo(10.0f, 15.0f)
                verticalLineToRelative(23.0f)
                horizontalLineToRelative(23.0f)
                lineTo(33.0f, 23.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(16.0f)
                lineTo(9.0f, 39.0f)
                lineTo(9.0f, 14.0f)
                horizontalLineToRelative(16.0f)
                close()
                moveTo(33.21f, 18.503f)
                lineTo(32.85f, 18.856f)
                lineTo(20.65f, 30.856f)
                lineTo(20.505f, 31.0f)
                lineTo(17.0f, 31.0f)
                verticalLineToRelative(-3.707f)
                lineToRelative(12.5f, -12.5f)
                close()
                moveTo(18.0f, 27.707f)
                lineTo(18.0f, 30.0f)
                horizontalLineToRelative(2.095f)
                lineToRelative(11.694f, -11.504f)
                lineToRelative(-2.289f, -2.29f)
                close()
                moveTo(35.71f, 9.177f)
                lineTo(38.682f, 12.147f)
                lineTo(39.035f, 12.5f)
                lineTo(35.357f, 16.177f)
                lineTo(35.004f, 15.824f)
                lineTo(32.035f, 12.854f)
                lineTo(31.682f, 12.5f)
                lineTo(32.035f, 12.146f)
                lineTo(35.004f, 9.176f)
                lineTo(35.357f, 8.823f)
                close()
                moveTo(33.096f, 12.5f)
                lineToRelative(2.262f, 2.262f)
                lineTo(37.62f, 12.5f)
                lineToRelative(-2.263f, -2.263f)
                close()
            }
        }
        .build()
        return _createLarge!!
    }

private var _createLarge: ImageVector? = null
