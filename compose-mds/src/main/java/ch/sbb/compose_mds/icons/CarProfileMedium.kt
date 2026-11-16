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

public val SBBIcons.CarProfileMedium: ImageVector
    get() {
        if (_carProfileMedium != null) {
            return _carProfileMedium!!
        }
        _carProfileMedium = Builder(name = "CarProfileMedium", defaultWidth = 36.0.dp, defaultHeight
                = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.25f, 16.314f)
                curveToRelative(0.0f, -0.485f, 0.176f, -0.954f, 0.495f, -1.319f)
                horizontalLineToRelative(0.001f)
                lineToRelative(4.429f, -5.062f)
                curveToRelative(0.38f, -0.434f, 0.93f, -0.684f, 1.506f, -0.684f)
                horizontalLineToRelative(10.697f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.414f, 0.587f)
                horizontalLineToRelative(0.001f)
                lineToRelative(5.414f, 5.413f)
                lineToRelative(3.537f, 0.003f)
                verticalLineToRelative(0.513f)
                verticalLineToRelative(-0.513f)
                horizontalLineToRelative(0.02f)
                curveToRelative(0.326f, 0.013f, 0.804f, 0.122f, 1.213f, 0.42f)
                curveToRelative(0.407f, 0.297f, 0.728f, 0.769f, 0.766f, 1.442f)
                lineToRelative(0.004f, 0.138f)
                lineToRelative(0.003f, 5.997f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-4.536f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.464f, 3.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.464f, -3.0f)
                horizontalLineToRelative(-8.072f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.464f, 3.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.464f, -3.0f)
                lineTo(3.25f, 23.749f)
                close()
                moveTo(9.75f, 20.749f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, false, 0.0f, 5.0f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, false, 0.0f, -5.0f)
                moveToRelative(15.0f, 0.0f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, false, 0.0f, 5.0f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, false, 0.0f, -5.0f)
                moveToRelative(-15.07f, -10.5f)
                curveToRelative(-0.287f, 0.0f, -0.563f, 0.124f, -0.753f, 0.342f)
                lineTo(4.85f, 15.249f)
                horizontalLineToRelative(8.899f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(14.75f, 15.249f)
                horizontalLineToRelative(11.042f)
                lineToRelative(-4.706f, -4.705f)
                lineToRelative(-0.074f, -0.067f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.634f, -0.228f)
                lineTo(14.75f, 10.249f)
                close()
                moveTo(4.25f, 22.749f)
                horizontalLineToRelative(2.036f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.464f, -3.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.464f, 3.0f)
                horizontalLineToRelative(8.072f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.464f, -3.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.464f, 3.0f)
                horizontalLineToRelative(3.536f)
                lineToRelative(-0.003f, -5.497f)
                curveToRelative(0.0f, -0.406f, -0.165f, -0.63f, -0.358f, -0.771f)
                arcToRelative(1.3f, 1.3f, 0.0f, false, false, -0.664f, -0.23f)
                lineTo(27.0f, 16.249f)
                lineTo(4.252f, 16.249f)
                lineToRelative(-0.002f, 0.065f)
                close()
            }
        }
        .build()
        return _carProfileMedium!!
    }

private var _carProfileMedium: ImageVector? = null
