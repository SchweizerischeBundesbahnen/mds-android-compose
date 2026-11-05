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

public val SBBIcons.ParkAndRailLarge: ImageVector
    get() {
        if (_parkAndRailLarge != null) {
            return _parkAndRailLarge!!
        }
        _parkAndRailLarge = Builder(
            name = "ParkAndRailLarge",
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
                moveTo(43.0f, 37.02f)
                lineTo(5.0f, 37.02f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(38.0f)
                close()
                moveTo(12.46f, 15.0f)
                curveToRelative(0.861f, -0.017f, 1.722f, 0.05f, 2.57f, 0.2f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 1.69f, 0.72f)
                arcToRelative(4.74f, 4.74f, 0.0f, false, true, 2.09f, 4.22f)
                arcToRelative(4.84f, 4.84f, 0.0f, false, true, -1.73f, 3.94f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, true, -1.67f, 0.89f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -2.027f, 0.26f)
                lineTo(9.47f, 25.23f)
                lineTo(9.47f, 31.0f)
                lineTo(6.0f, 31.0f)
                lineTo(6.0f, 15.0f)
                close()
                moveTo(35.75f, 15.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 3.52f, 0.72f)
                curveToRelative(0.656f, 0.372f, 1.196f, 0.92f, 1.56f, 1.58f)
                arcToRelative(4.53f, 4.53f, 0.0f, false, true, 0.54f, 2.22f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, true, -0.64f, 2.48f)
                arcToRelative(3.74f, 3.74f, 0.0f, false, true, -1.87f, 1.49f)
                arcToRelative(2.7f, 2.7f, 0.0f, false, true, 1.66f, 1.18f)
                curveToRelative(0.236f, 0.357f, 0.4f, 0.758f, 0.48f, 1.18f)
                curveToRelative(0.09f, 0.42f, 0.2f, 1.38f, 0.34f, 2.9f)
                curveToRelative(0.0f, 0.713f, 0.161f, 1.417f, 0.47f, 2.06f)
                lineTo(42.0f, 31.0f)
                horizontalLineToRelative(-3.65f)
                arcToRelative(2.9f, 2.9f, 0.0f, false, true, -0.27f, -0.87f)
                curveToRelative(0.0f, -0.34f, -0.12f, -1.16f, -0.21f, -2.42f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -0.87f, -2.35f)
                arcToRelative(3.45f, 3.45f, 0.0f, false, false, -2.37f, -0.65f)
                horizontalLineToRelative(-3.1f)
                lineTo(31.53f, 31.0f)
                lineTo(28.0f, 31.0f)
                lineTo(28.0f, 15.0f)
                close()
                moveTo(23.68f, 23.21f)
                horizontalLineToRelative(3.1f)
                lineTo(26.78f, 25.0f)
                horizontalLineToRelative(-3.1f)
                verticalLineToRelative(3.08f)
                horizontalLineToRelative(-1.77f)
                lineTo(21.91f, 25.0f)
                horizontalLineToRelative(-3.08f)
                verticalLineToRelative(-1.79f)
                horizontalLineToRelative(3.08f)
                verticalLineToRelative(-3.08f)
                horizontalLineToRelative(1.77f)
                close()
                moveTo(12.41f, 18.0f)
                lineTo(9.47f, 18.0f)
                verticalLineToRelative(4.54f)
                horizontalLineToRelative(3.12f)
                arcToRelative(3.22f, 3.22f, 0.0f, false, false, 2.0f, -0.5f)
                arcToRelative(2.18f, 2.18f, 0.0f, false, false, 0.75f, -1.8f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.87f, -1.8f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, -2.06f, -0.44f)
                moveTo(35.0f, 17.75f)
                horizontalLineToRelative(-3.51f)
                verticalLineToRelative(4.4f)
                horizontalLineToRelative(3.34f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 2.27f, -0.46f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.9f, -1.75f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.71f, -1.67f)
                arcToRelative(3.83f, 3.83f, 0.0f, false, false, -2.29f, -0.52f)
                moveTo(43.0f, 10.0f)
                lineTo(5.0f, 10.0f)
                lineTo(5.0f, 9.0f)
                horizontalLineToRelative(38.0f)
                close()
            }
        }
            .build()
        return _parkAndRailLarge!!
    }

private var _parkAndRailLarge: ImageVector? = null
