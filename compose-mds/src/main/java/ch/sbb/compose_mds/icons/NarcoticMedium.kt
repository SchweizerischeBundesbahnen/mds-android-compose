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

public val SBBIcons.NarcoticMedium: ImageVector
    get() {
        if (_narcoticMedium != null) {
            return _narcoticMedium!!
        }
        _narcoticMedium = Builder(name = "NarcoticMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(29.75f, 7.748f)
                lineToRelative(0.002f, -4.749f)
                horizontalLineToRelative(-1.0f)
                lineToRelative(-0.002f, 4.749f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(3.002f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(3.002f)
                lineToRelative(-0.002f, 5.0f)
                lineTo(25.5f, 31.75f)
                verticalLineToRelative(1.0f)
                lineTo(33.0f, 32.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.25f)
                lineToRelative(0.002f, -5.0f)
                horizontalLineToRelative(2.998f)
                verticalLineToRelative(-16.0f)
                horizontalLineToRelative(-1.5f)
                lineTo(31.25f, 7.748f)
                close()
                moveTo(22.274f, 4.728f)
                arcToRelative(5.05f, 5.05f, 0.0f, false, false, -7.142f, 0.0f)
                lineToRelative(-10.401f, 10.4f)
                arcToRelative(5.05f, 5.05f, 0.0f, false, false, 3.537f, 8.622f)
                arcToRelative(6.3f, 6.3f, 0.0f, false, false, -0.518f, 2.5f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, false, 6.642f, -6.498f)
                lineToRelative(7.882f, -7.883f)
                arcToRelative(5.05f, 5.05f, 0.0f, false, false, 0.0f, -7.14f)
                moveTo(9.035f, 22.68f)
                arcToRelative(4.05f, 4.05f, 0.0f, false, false, 2.132f, -1.117f)
                lineToRelative(1.544f, -1.546f)
                lineToRelative(0.106f, -0.106f)
                horizontalLineToRelative(0.003f)
                lineToRelative(3.193f, -3.194f)
                lineToRelative(-5.728f, -5.728f)
                lineToRelative(-4.847f, 4.846f)
                arcToRelative(4.05f, 4.05f, 0.0f, false, false, 3.421f, 6.877f)
                close()
                moveTo(10.992f, 10.282f)
                lineTo(16.721f, 16.009f)
                lineTo(21.567f, 11.162f)
                arcToRelative(4.05f, 4.05f, 0.0f, false, false, -5.728f, -5.726f)
                close()
                moveTo(8.775f, 25.753f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 0.672f, -2.133f)
                lineToRelative(0.005f, -0.01f)
                arcToRelative(5.04f, 5.04f, 0.0f, false, false, 2.278f, -1.201f)
                lineToRelative(0.144f, -0.138f)
                horizontalLineToRelative(0.001f)
                lineToRelative(1.436f, -1.437f)
                quadToRelative(0.46f, -0.082f, 0.94f, -0.083f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 5.478f, 5.002f)
                close()
                moveTo(8.774f, 26.753f)
                arcToRelative(5.501f, 5.501f, 0.0f, false, false, 10.954f, 0.0f)
                close()
                moveTo(30.25f, 8.748f)
                verticalLineToRelative(2.002f)
                horizontalLineToRelative(-2.0f)
                lineTo(28.25f, 8.748f)
                close()
                moveTo(26.75f, 25.75f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-14.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.0f)
                lineTo(30.0f, 13.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.25f)
                verticalLineToRelative(2.0f)
                lineTo(30.0f, 16.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.25f)
                verticalLineToRelative(2.0f)
                lineTo(30.0f, 19.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.25f)
                verticalLineToRelative(2.0f)
                lineTo(30.0f, 22.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.25f)
                close()
            }
        }
        .build()
        return _narcoticMedium!!
    }

private var _narcoticMedium: ImageVector? = null
