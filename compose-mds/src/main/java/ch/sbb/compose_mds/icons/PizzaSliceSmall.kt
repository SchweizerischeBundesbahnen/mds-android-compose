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

public val SBBIcons.PizzaSliceSmall: ImageVector
    get() {
        if (_pizzaSliceSmall != null) {
            return _pizzaSliceSmall!!
        }
        _pizzaSliceSmall = Builder(name = "PizzaSliceSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.619f, 3.057f)
                curveToRelative(0.294f, -0.826f, 1.228f, -1.294f, 2.07f, -0.937f)
                curveToRelative(5.592f, 2.372f, 10.026f, 6.968f, 12.21f, 12.705f)
                curveToRelative(0.322f, 0.848f, -0.155f, 1.776f, -0.988f, 2.052f)
                lineToRelative(-2.645f, 0.877f)
                arcToRelative(1.58f, 1.58f, 0.0f, false, true, -1.482f, -0.258f)
                lineTo(3.507f, 21.939f)
                curveToRelative(-0.917f, 0.307f, -1.753f, -0.586f, -1.44f, -1.477f)
                lineToRelative(0.003f, -0.006f)
                lineTo(6.916f, 7.237f)
                arcToRelative(1.62f, 1.62f, 0.0f, false, true, -0.24f, -1.535f)
                close()
                moveTo(7.759f, 7.843f)
                lineTo(7.064f, 9.739f)
                curveToRelative(0.58f, 0.428f, 0.955f, 1.12f, 0.955f, 1.899f)
                arcToRelative(2.34f, 2.34f, 0.0f, false, true, -2.511f, 2.344f)
                lineTo(3.01f, 20.795f)
                arcToRelative(0.149f, 0.149f, 0.0f, false, false, 0.18f, 0.197f)
                lineToRelative(1.803f, -0.604f)
                arcToRelative(2.11f, 2.11f, 0.0f, false, true, 2.096f, -2.385f)
                curveToRelative(0.782f, 0.005f, 1.457f, 0.44f, 1.815f, 1.076f)
                lineToRelative(7.285f, -2.439f)
                arcToRelative(16.5f, 16.5f, 0.0f, false, false, -8.43f, -8.797f)
                moveToRelative(0.163f, 11.565f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, false, -0.84f, -0.405f)
                arcToRelative(1.11f, 1.11f, 0.0f, false, false, -1.104f, 1.055f)
                close()
                moveTo(5.877f, 12.976f)
                lineTo(6.693f, 10.75f)
                curveToRelative(0.203f, 0.237f, 0.326f, 0.548f, 0.326f, 0.888f)
                curveToRelative(0.0f, 0.686f, -0.5f, 1.245f, -1.142f, 1.338f)
                moveToRelative(3.42f, -9.935f)
                curveToRelative(-0.273f, -0.116f, -0.62f, 0.028f, -0.736f, 0.352f)
                lineToRelative(-0.943f, 2.645f)
                arcToRelative(0.65f, 0.65f, 0.0f, false, false, 0.37f, 0.812f)
                arcToRelative(17.5f, 17.5f, 0.0f, false, true, 9.184f, 9.555f)
                curveToRelative(0.137f, 0.345f, 0.48f, 0.499f, 0.78f, 0.4f)
                lineToRelative(2.644f, -0.877f)
                arcToRelative(0.583f, 0.583f, 0.0f, false, false, 0.369f, -0.747f)
                curveTo(18.877f, 9.697f, 14.639f, 5.307f, 9.298f, 3.04f)
                moveTo(12.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
            }
        }
        .build()
        return _pizzaSliceSmall!!
    }

private var _pizzaSliceSmall: ImageVector? = null
