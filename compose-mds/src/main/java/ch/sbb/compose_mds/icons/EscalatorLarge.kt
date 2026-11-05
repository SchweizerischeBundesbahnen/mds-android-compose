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

public val SBBIcons.EscalatorLarge: ImageVector
    get() {
        if (_escalatorLarge != null) {
            return _escalatorLarge!!
        }
        _escalatorLarge = Builder(
            name = "EscalatorLarge",
            defaultWidth = 48.0.dp,
            defaultHeight =
                48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(37.5f, 11.0f)
                curveToRelative(3.034f, 0.0f, 5.5f, 2.468f, 5.5f, 5.5f)
                reflectiveCurveTo(40.534f, 22.0f, 37.5f, 22.0f)
                horizontalLineToRelative(-3.505f)
                lineTo(21.64f, 36.121f)
                horizontalLineToRelative(-0.001f)
                curveTo(20.59f, 37.34f, 19.08f, 38.0f, 17.5f, 38.0f)
                horizontalLineToRelative(-8.0f)
                arcTo(5.507f, 5.507f, 0.0f, false, true, 4.0f, 32.5f)
                curveTo(4.0f, 29.466f, 6.468f, 27.0f, 9.5f, 27.0f)
                horizontalLineToRelative(4.496f)
                lineTo(13.996f, 16.999f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(5.438f)
                lineToRelative(8.365f, -9.558f)
                curveTo(28.411f, 11.658f, 29.92f, 11.0f, 31.5f, 11.0f)
                close()
                moveTo(31.5f, 12.0f)
                curveToRelative(-1.302f, 0.0f, -2.532f, 0.54f, -3.383f, 1.533f)
                lineToRelative(-0.003f, 0.004f)
                lineTo(15.606f, 27.83f)
                lineToRelative(-0.149f, 0.171f)
                lineTo(9.5f, 28.001f)
                curveTo(7.02f, 28.0f, 5.0f, 30.018f, 5.0f, 32.5f)
                curveTo(5.0f, 34.98f, 7.02f, 37.0f, 9.5f, 37.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(1.303f, 0.0f, 2.533f, -0.541f, 3.382f, -1.533f)
                lineToRelative(0.004f, -0.004f)
                lineTo(33.392f, 21.17f)
                lineTo(33.54f, 21.0f)
                lineTo(37.5f, 21.0f)
                curveToRelative(2.482f, 0.0f, 4.5f, -2.02f, 4.5f, -4.5f)
                reflectiveCurveTo(39.982f, 12.0f, 37.5f, 12.0f)
                close()
                moveTo(14.996f, 27.0f)
                horizontalLineToRelative(0.007f)
                lineToRelative(2.993f, -3.42f)
                verticalLineToRelative(-5.581f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(16.496f, 9.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.0f, 4.999f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, -4.999f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -0.002f, 2.999f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.495f, 10.0f)
            }
        }
            .build()
        return _escalatorLarge!!
    }

private var _escalatorLarge: ImageVector? = null
