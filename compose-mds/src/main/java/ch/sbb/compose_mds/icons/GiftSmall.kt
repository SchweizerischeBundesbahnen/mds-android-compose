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
                moveTo(12.002f, 2.851f)
                arcToRelative(2.17f, 2.17f, 0.0f, false, false, -0.797f, -0.656f)
                arcToRelative(2.22f, 2.22f, 0.0f, false, false, -1.783f, -0.034f)
                arcToRelative(2.26f, 2.26f, 0.0f, false, false, -1.264f, 1.246f)
                curveToRelative(-0.239f, 0.603f, -0.198f, 1.316f, 0.205f, 2.037f)
                lineToRelative(0.016f, 0.028f)
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
                horizontalLineToRelative(-6.509f)
                lineToRelative(1.111f, -1.503f)
                lineToRelative(0.017f, -0.022f)
                lineToRelative(0.014f, -0.024f)
                curveToRelative(0.412f, -0.712f, 0.457f, -1.42f, 0.218f, -2.023f)
                curveToRelative(-0.234f, -0.588f, -0.718f, -1.02f, -1.266f, -1.243f)
                curveToRelative(-0.549f, -0.223f, -1.2f, -0.25f, -1.786f, 0.021f)
                arcToRelative(2.14f, 2.14f, 0.0f, false, false, -0.797f, 0.645f)
                moveTo(11.5f, 4.07f)
                curveToRelative(-0.161f, -0.554f, -0.446f, -0.839f, -0.725f, -0.971f)
                arcToRelative(1.22f, 1.22f, 0.0f, false, false, -0.98f, -0.01f)
                arcToRelative(1.26f, 1.26f, 0.0f, false, false, -0.707f, 0.687f)
                curveToRelative(-0.114f, 0.288f, -0.125f, 0.677f, 0.134f, 1.155f)
                lineTo(10.752f, 7.0f)
                horizontalLineToRelative(0.745f)
                close()
                moveTo(12.5f, 4.07f)
                lineTo(12.497f, 7.0f)
                horizontalLineToRelative(0.75f)
                lineToRelative(1.534f, -2.073f)
                curveToRelative(0.262f, -0.466f, 0.253f, -0.846f, 0.14f, -1.13f)
                arcToRelative(1.27f, 1.27f, 0.0f, false, false, -0.712f, -0.685f)
                arcToRelative(1.24f, 1.24f, 0.0f, false, false, -0.989f, 0.001f)
                curveToRelative(-0.277f, 0.13f, -0.561f, 0.408f, -0.72f, 0.955f)
                moveTo(15.0f, 11.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(4.0f)
                lineTo(19.0f, 11.0f)
                close()
                moveTo(14.0f, 21.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(10.0f, 11.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(15.0f, 10.0f)
                lineTo(15.0f, 8.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-5.0f)
                moveToRelative(-1.0f, 0.0f)
                lineTo(14.0f, 8.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(9.0f, 10.0f)
                lineTo(9.0f, 8.0f)
                lineTo(4.0f, 8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                moveToRelative(0.0f, 11.0f)
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
