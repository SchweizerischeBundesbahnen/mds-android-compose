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

public val SBBIcons.BackpackLarge: ImageVector
    get() {
        if (_backpackLarge != null) {
            return _backpackLarge!!
        }
        _backpackLarge = Builder(
            name = "BackpackLarge",
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
                moveTo(34.18f, 6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.466f, 0.315f)
                lineTo(32.32f, 9.803f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, true, 1.667f, 0.943f)
                lineToRelative(2.005f, -4.337f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 35.5f, 6.0f)
                close()
                moveTo(35.218f, 11.783f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -0.424f, -0.4f)
                lineTo(36.0f, 8.774f)
                verticalLineToRelative(3.896f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -0.782f, -0.886f)
                moveToRelative(-2.433f, -5.838f)
                lineToRelative(-1.4f, 3.503f)
                arcTo(9.5f, 9.5f, 0.0f, false, false, 30.0f, 9.12f)
                lineTo(30.0f, 8.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 26.5f, 5.0f)
                horizontalLineToRelative(-4.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 19.0f, 8.5f)
                verticalLineToRelative(0.62f)
                quadToRelative(-0.706f, 0.112f, -1.384f, 0.328f)
                lineToRelative(-1.401f, -3.503f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 14.82f, 5.0f)
                lineTo(13.5f, 5.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.0f, 6.5f)
                verticalLineToRelative(7.757f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, false, -1.0f, 4.243f)
                lineTo(11.0f, 44.0f)
                horizontalLineToRelative(27.0f)
                lineTo(38.0f, 18.5f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, false, -1.0f, -4.243f)
                lineTo(37.0f, 6.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 35.5f, 5.0f)
                horizontalLineToRelative(-1.32f)
                verticalLineToRelative(0.5f)
                lineTo(34.18f, 5.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.394f, 0.945f)
                moveToRelative(-17.5f, 0.37f)
                lineToRelative(1.395f, 3.487f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, false, -1.667f, 0.943f)
                lineToRelative(-2.005f, -4.337f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 13.5f, 6.0f)
                horizontalLineToRelative(1.32f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.466f, 0.315f)
                moveToRelative(-1.079f, 5.069f)
                lineTo(13.0f, 8.774f)
                verticalLineToRelative(3.895f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, true, 1.206f, -1.285f)
                moveTo(29.0f, 8.5f)
                verticalLineToRelative(0.513f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 28.5f, 9.0f)
                lineTo(28.0f, 9.0f)
                verticalLineToRelative(-0.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 26.5f, 7.0f)
                horizontalLineToRelative(-4.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 21.0f, 8.5f)
                lineTo(21.0f, 9.0f)
                horizontalLineToRelative(-0.5f)
                quadToRelative(-0.25f, 0.0f, -0.5f, 0.013f)
                lineTo(20.0f, 8.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 22.5f, 6.0f)
                horizontalLineToRelative(4.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 29.0f, 8.5f)
                moveTo(22.0f, 9.0f)
                verticalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                lineTo(27.0f, 9.0f)
                close()
                moveTo(20.5f, 10.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, -8.5f, 8.5f)
                lineTo(12.0f, 43.0f)
                horizontalLineToRelative(25.0f)
                lineTo(37.0f, 18.5f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, -8.5f, -8.5f)
                close()
                moveTo(17.51f, 28.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(19.0f)
                verticalLineToRelative(-0.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.5f, -2.5f)
                close()
                moveTo(29.0f, 32.0f)
                lineTo(15.01f, 32.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(19.0f)
                verticalLineToRelative(-8.0f)
                lineTo(32.0f, 32.0f)
                verticalLineToRelative(3.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
                close()
                moveTo(30.0f, 32.0f)
                verticalLineToRelative(3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                lineTo(31.0f, 32.0f)
                close()
                moveTo(15.035f, 28.025f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 17.51f, 27.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.5f, 3.5f)
                lineTo(35.01f, 41.0f)
                horizontalLineToRelative(-21.0f)
                lineTo(14.01f, 30.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 1.025f, -2.475f)
                moveTo(20.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
                moveTo(30.0f, 17.0f)
                verticalLineToRelative(4.0f)
                lineTo(19.0f, 21.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(18.586f, 13.586f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 13.0f)
                horizontalLineToRelative(9.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(7.0f)
                lineTo(18.0f, 22.0f)
                verticalLineToRelative(-7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.586f, -1.414f)
            }
        }
            .build()
        return _backpackLarge!!
    }

private var _backpackLarge: ImageVector? = null
