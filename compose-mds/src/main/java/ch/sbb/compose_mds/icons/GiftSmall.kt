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

public val SBBIcons.GiftSmall: ImageVector
    get() {
        if (_giftSmall != null) {
            return _giftSmall!!
        }
        _giftSmall = Builder(name = "GiftSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.205f, 2.195f)
                arcToRelative(2.22f, 2.22f, 0.0f, false, false, -1.784f, -0.034f)
                arcToRelative(2.26f, 2.26f, 0.0f, false, false, -1.263f, 1.246f)
                curveToRelative(-0.24f, 0.603f, -0.197f, 1.315f, 0.206f, 2.037f)
                lineToRelative(0.015f, 0.028f)
                lineToRelative(0.019f, 0.025f)
                lineTo(9.508f, 7.0f)
                lineTo(3.0f, 7.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(16.0f)
                lineTo(20.0f, 11.0f)
                horizontalLineToRelative(1.0f)
                lineTo(21.0f, 7.0f)
                horizontalLineToRelative(-6.508f)
                lineToRelative(1.11f, -1.503f)
                lineToRelative(0.017f, -0.022f)
                lineToRelative(0.014f, -0.025f)
                curveToRelative(0.412f, -0.711f, 0.457f, -1.42f, 0.218f, -2.022f)
                curveToRelative(-0.234f, -0.588f, -0.718f, -1.02f, -1.266f, -1.243f)
                curveToRelative(-0.55f, -0.223f, -1.2f, -0.25f, -1.786f, 0.021f)
                arcToRelative(2.14f, 2.14f, 0.0f, false, false, -0.797f, 0.645f)
                arcToRelative(2.16f, 2.16f, 0.0f, false, false, -0.797f, -0.656f)
                moveToRelative(0.295f, 1.872f)
                curveToRelative(-0.162f, -0.552f, -0.446f, -0.837f, -0.724f, -0.969f)
                arcToRelative(1.22f, 1.22f, 0.0f, false, false, -0.98f, -0.01f)
                curveToRelative(-0.325f, 0.132f, -0.588f, 0.38f, -0.709f, 0.687f)
                curveToRelative(-0.114f, 0.289f, -0.123f, 0.679f, 0.138f, 1.158f)
                lineTo(10.752f, 7.0f)
                horizontalLineToRelative(0.745f)
                close()
                moveTo(15.633f, 5.45f)
                lineTo(15.2f, 5.2f)
                lineToRelative(0.003f, 0.001f)
                close()
                moveTo(8.363f, 5.444f)
                lineTo(8.8f, 5.2f)
                lineToRelative(-0.003f, 0.002f)
                close()
                moveTo(14.777f, 4.929f)
                lineTo(13.247f, 7.0f)
                horizontalLineToRelative(-0.75f)
                lineToRelative(0.002f, -2.926f)
                curveToRelative(0.159f, -0.55f, 0.443f, -0.83f, 0.722f, -0.96f)
                curveToRelative(0.3f, -0.14f, 0.659f, -0.136f, 0.988f, -0.002f)
                curveToRelative(0.33f, 0.134f, 0.592f, 0.383f, 0.712f, 0.685f)
                curveToRelative(0.113f, 0.284f, 0.12f, 0.665f, -0.144f, 1.132f)
                moveTo(14.0f, 11.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(14.0f, 10.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(10.0f, 8.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(15.0f, 10.0f)
                lineTo(15.0f, 8.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(15.0f, 11.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(4.0f)
                lineTo(19.0f, 11.0f)
                close()
                moveTo(4.0f, 10.0f)
                horizontalLineToRelative(5.0f)
                lineTo(9.0f, 8.0f)
                lineTo(4.0f, 8.0f)
                close()
                moveTo(9.0f, 21.0f)
                lineTo(9.0f, 11.0f)
                lineTo(5.0f, 11.0f)
                verticalLineToRelative(10.0f)
                close()
            }
        }
        .build()
        return _giftSmall!!
    }

private var _giftSmall: ImageVector? = null
