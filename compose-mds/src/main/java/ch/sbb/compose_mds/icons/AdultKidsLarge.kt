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

public val SBBIcons.AdultKidsLarge: ImageVector
    get() {
        if (_adultKidsLarge != null) {
            return _adultKidsLarge!!
        }
        _adultKidsLarge = Builder(
            name = "AdultKidsLarge",
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
                pathFillType = EvenOdd,
            ) {
                moveTo(8.0f, 12.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.001f, 0.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.0f, 12.5f)
                moveTo(9.5f, 10.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.002f, 5.002f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 9.5f, 10.0f)
                moveToRelative(17.001f, 15.0f)
                horizontalLineToRelative(-0.448f)
                lineToRelative(-0.049f, 0.445f)
                lineToRelative(-1.0f, 9.0f)
                lineToRelative(0.994f, 0.11f)
                lineToRelative(0.173f, -1.554f)
                lineTo(27.0f, 33.001f)
                verticalLineToRelative(6.998f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-6.998f)
                horizontalLineToRelative(3.001f)
                verticalLineToRelative(6.998f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-6.998f)
                horizontalLineToRelative(0.83f)
                lineToRelative(0.172f, 1.554f)
                lineToRelative(0.994f, -0.11f)
                lineToRelative(-1.0f, -9.0f)
                lineToRelative(-0.05f, -0.445f)
                horizontalLineToRelative(-6.447f)
                moveToRelative(6.22f, 7.001f)
                lineTo(32.053f, 26.0f)
                horizontalLineToRelative(-5.106f)
                lineToRelative(-0.666f, 6.001f)
                close()
                moveTo(7.0f, 28.001f)
                verticalLineToRelative(11.998f)
                horizontalLineToRelative(1.0f)
                lineTo(8.0f, 28.001f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(11.998f)
                horizontalLineToRelative(1.0f)
                lineTo(12.0f, 28.001f)
                horizontalLineToRelative(1.0f)
                lineTo(13.0f, 29.5f)
                horizontalLineToRelative(1.0f)
                lineTo(14.0f, 17.0f)
                lineTo(5.0f, 17.0f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.499f)
                close()
                moveTo(13.0f, 27.001f)
                lineTo(13.0f, 18.0f)
                lineTo(6.0f, 18.0f)
                verticalLineToRelative(9.001f)
                close()
                moveTo(29.501f, 19.001f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.001f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.001f, -3.0f)
                moveToRelative(-2.5f, 1.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.001f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -5.001f, 0.0f)
                moveTo(36.054f, 25.0f)
                horizontalLineToRelative(6.895f)
                lineToRelative(0.05f, 0.445f)
                lineToRelative(1.0f, 9.0f)
                lineToRelative(-0.994f, 0.11f)
                lineToRelative(-0.173f, -1.554f)
                horizontalLineToRelative(-0.83f)
                verticalLineToRelative(6.998f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-6.998f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(6.998f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-6.998f)
                horizontalLineToRelative(-0.83f)
                lineToRelative(-0.173f, 1.554f)
                lineToRelative(-0.994f, -0.11f)
                lineToRelative(1.0f, -9.0f)
                close()
                moveTo(42.054f, 26.0f)
                lineTo(42.721f, 32.001f)
                horizontalLineToRelative(-6.438f)
                lineTo(36.949f, 26.0f)
                close()
                moveTo(38.002f, 20.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.001f, 0.002f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.001f, -0.002f)
                moveToRelative(1.5f, -2.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.001f, 5.002f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 39.502f, 18.0f)
                moveToRelative(-23.001f, 7.0f)
                horizontalLineToRelative(-0.448f)
                lineToRelative(-0.049f, 0.445f)
                lineToRelative(-1.0f, 9.0f)
                lineToRelative(0.994f, 0.11f)
                lineToRelative(0.173f, -1.554f)
                lineTo(17.0f, 33.001f)
                verticalLineToRelative(6.998f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-6.998f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(6.998f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-6.998f)
                horizontalLineToRelative(0.83f)
                lineToRelative(0.173f, 1.554f)
                lineToRelative(0.994f, -0.11f)
                lineToRelative(-1.001f, -9.0f)
                lineToRelative(-0.05f, -0.445f)
                horizontalLineToRelative(-6.446f)
                moveToRelative(6.219f, 7.001f)
                lineTo(22.052f, 26.0f)
                lineTo(16.95f, 26.0f)
                lineToRelative(-0.667f, 6.001f)
                close()
                moveTo(19.499f, 19.001f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.002f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.002f, -3.0f)
                moveTo(17.0f, 20.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.002f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -5.001f, 0.0f)
            }
        }
            .build()
        return _adultKidsLarge!!
    }

private var _adultKidsLarge: ImageVector? = null
