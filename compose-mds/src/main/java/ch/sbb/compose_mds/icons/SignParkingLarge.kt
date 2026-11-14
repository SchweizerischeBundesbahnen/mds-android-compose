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

public val SBBIcons.SignParkingLarge: ImageVector
    get() {
        if (_signParkingLarge != null) {
            return _signParkingLarge!!
        }
        _signParkingLarge = Builder(name = "SignParkingLarge", defaultWidth = 48.0.dp, defaultHeight
                = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(32.0f, 4.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 30.5f, 3.0f)
                horizontalLineToRelative(-14.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 15.0f, 4.5f)
                verticalLineToRelative(18.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, 1.5f)
                horizontalLineToRelative(14.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                close()
                moveTo(33.0f, 22.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, 2.5f)
                lineTo(24.0f, 25.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(23.0f, 25.0f)
                horizontalLineToRelative(-6.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, -2.5f)
                verticalLineToRelative(-18.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 16.5f, 2.0f)
                horizontalLineToRelative(14.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 33.0f, 4.5f)
                close()
                moveTo(19.426f, 13.42f)
                lineTo(19.426f, 7.276f)
                lineTo(23.7f, 7.276f)
                quadToRelative(1.098f, 0.0f, 1.667f, 0.107f)
                quadToRelative(0.569f, 0.108f, 1.04f, 0.406f)
                quadToRelative(1.292f, 0.8f, 1.292f, 2.553f)
                quadToRelative(0.0f, 1.723f, -1.333f, 2.553f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, true, -1.04f, 0.406f)
                quadToRelative(-0.58f, 0.117f, -1.553f, 0.117f)
                close()
                moveTo(23.999f, 6.047f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(14.991f)
                horizontalLineToRelative(1.427f)
                lineTo(19.426f, 14.65f)
                horizontalLineToRelative(4.747f)
                quadToRelative(2.123f, 0.0f, 3.292f, -0.83f)
                quadToRelative(1.66f, -1.17f, 1.66f, -3.549f)
                quadToRelative(0.0f, -2.337f, -1.712f, -3.476f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -1.374f, -0.584f)
                quadToRelative(-0.758f, -0.165f, -2.04f, -0.164f)
            }
        }
        .build()
        return _signParkingLarge!!
    }

private var _signParkingLarge: ImageVector? = null
