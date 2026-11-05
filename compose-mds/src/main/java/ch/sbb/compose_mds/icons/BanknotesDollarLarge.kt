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

public val SBBIcons.BanknotesDollarLarge: ImageVector
    get() {
        if (_banknotesDollarLarge != null) {
            return _banknotesDollarLarge!!
        }
        _banknotesDollarLarge = Builder(
            name = "BanknotesDollarLarge",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
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
                moveTo(45.0f, 29.0f)
                horizontalLineToRelative(-1.99f)
                verticalLineToRelative(3.0f)
                lineTo(41.0f, 32.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 34.0f)
                lineTo(2.0f, 17.0f)
                horizontalLineToRelative(1.997f)
                lineToRelative(-0.007f, -1.497f)
                lineTo(3.987f, 15.0f)
                lineTo(6.0f, 15.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(39.0f)
                close()
                moveTo(3.0f, 33.0f)
                horizontalLineToRelative(37.0f)
                lineTo(40.0f, 18.0f)
                lineTo(3.0f, 18.0f)
                close()
                moveTo(37.0f, 19.5f)
                curveToRelative(0.0f, 0.824f, 0.676f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.824f, 0.0f, -1.5f, 0.676f, -1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                lineTo(6.0f, 32.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.824f, -0.676f, -1.5f, -1.5f, -1.5f)
                lineTo(4.0f, 30.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.824f, 0.0f, 1.5f, -0.676f, 1.5f, -1.5f)
                lineTo(6.0f, 19.0f)
                horizontalLineToRelative(31.0f)
                close()
                moveTo(4.998f, 17.0f)
                lineTo(41.0f, 17.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(1.01f)
                lineTo(42.01f, 16.0f)
                lineTo(4.993f, 16.0f)
                close()
                moveTo(6.949f, 20.0f)
                curveToRelative(-0.2f, 0.977f, -0.972f, 1.75f, -1.949f, 1.95f)
                verticalLineToRelative(7.1f)
                curveToRelative(0.977f, 0.2f, 1.75f, 0.973f, 1.95f, 1.95f)
                horizontalLineToRelative(29.1f)
                curveToRelative(0.2f, -0.977f, 0.973f, -1.75f, 1.95f, -1.95f)
                verticalLineToRelative(-7.1f)
                arcTo(2.51f, 2.51f, 0.0f, false, true, 36.05f, 20.0f)
                close()
                moveTo(21.5f, 21.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, 0.0f, 9.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 0.0f, -9.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, -7.0f)
                moveTo(7.0f, 15.0f)
                horizontalLineToRelative(36.01f)
                verticalLineToRelative(13.0f)
                lineTo(44.0f, 28.0f)
                lineTo(44.0f, 14.0f)
                lineTo(7.0f, 14.0f)
                close()
                moveTo(10.5f, 23.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, -5.0f)
                moveToRelative(22.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, -5.0f)
                moveToRelative(-22.0f, 1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                moveToRelative(22.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
            }
        }
            .build()
        return _banknotesDollarLarge!!
    }

private var _banknotesDollarLarge: ImageVector? = null
