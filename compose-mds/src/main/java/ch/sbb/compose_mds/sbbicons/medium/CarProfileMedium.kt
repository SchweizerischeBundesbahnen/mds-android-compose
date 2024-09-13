package ch.sbb.compose_mds.sbbicons.medium

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.MediumGroup

public val MediumGroup.CarProfileMedium: ImageVector
    get() {
        if (_carProfileMedium != null) {
            return _carProfileMedium!!
        }
        _carProfileMedium = Builder(name = "CarProfileMedium", defaultWidth = 36.0.dp, defaultHeight
                = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.928f, 10.591f)
                curveToRelative(0.19f, -0.217f, 0.466f, -0.342f, 0.753f, -0.342f)
                close()
                moveTo(8.928f, 10.591f)
                lineTo(4.852f, 15.25f)
                horizontalLineToRelative(8.898f)
                verticalLineToRelative(-5.001f)
                lineTo(9.681f, 10.249f)
                moveToRelative(5.069f, 0.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(11.043f)
                lineToRelative(-4.707f, -4.705f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.708f, -0.295f)
                close()
                moveTo(27.0f, 16.249f)
                lineTo(4.252f, 16.249f)
                lineToRelative(-0.002f, 0.064f)
                verticalLineToRelative(6.436f)
                horizontalLineToRelative(2.035f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.465f, -3.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.464f, 3.0f)
                horizontalLineToRelative(8.071f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.465f, -3.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.465f, 3.0f)
                horizontalLineToRelative(3.535f)
                lineToRelative(-0.003f, -5.497f)
                curveToRelative(0.0f, -0.406f, -0.165f, -0.63f, -0.358f, -0.771f)
                arcToRelative(1.3f, 1.3f, 0.0f, false, false, -0.656f, -0.229f)
                close()
                moveTo(28.215f, 23.749f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.465f, 3.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.465f, -3.0f)
                horizontalLineToRelative(-8.07f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.465f, 3.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.465f, -3.0f)
                lineTo(3.25f, 23.749f)
                verticalLineToRelative(-7.436f)
                curveToRelative(0.0f, -0.484f, 0.176f, -0.952f, 0.496f, -1.318f)
                lineToRelative(4.43f, -5.062f)
                curveToRelative(0.379f, -0.434f, 0.928f, -0.684f, 1.505f, -0.684f)
                horizontalLineToRelative(10.697f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.415f, 0.587f)
                lineToRelative(5.414f, 5.413f)
                lineToRelative(3.537f, 0.003f)
                horizontalLineToRelative(0.02f)
                curveToRelative(0.326f, 0.013f, 0.804f, 0.121f, 1.214f, 0.42f)
                curveToRelative(0.433f, 0.317f, 0.769f, 0.833f, 0.769f, 1.58f)
                lineToRelative(0.003f, 5.997f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-4.535f)
                moveToRelative(-18.465f, -3.0f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, false, 0.0f, 5.0f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, false, 0.0f, -5.0f)
                moveToRelative(15.0f, 0.0f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, false, 0.0f, 5.0f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, false, 0.0f, -5.0f)
            }
        }
        .build()
        return _carProfileMedium!!
    }

private var _carProfileMedium: ImageVector? = null
