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

public val SBBIcons.MoneyExchangeMedium: ImageVector
    get() {
        if (_moneyExchangeMedium != null) {
            return _moneyExchangeMedium!!
        }
        _moneyExchangeMedium = Builder(name = "MoneyExchangeMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.493f, 4.25f)
                curveTo(10.589f, 4.237f, 4.264f, 10.399f, 4.25f, 18.003f)
                lineToRelative(-1.0f, -0.002f)
                curveToRelative(0.016f, -8.183f, 6.816f, -14.765f, 15.244f, -14.75f)
                curveToRelative(5.514f, 0.01f, 10.562f, 2.807f, 13.256f, 7.404f)
                lineTo(31.75f, 6.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(7.25f)
                lineTo(25.5f, 13.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.96f)
                lineToRelative(-0.055f, -0.119f)
                curveToRelative(-2.333f, -4.847f, -7.351f, -7.87f, -12.912f, -7.88f)
                moveTo(31.75f, 18.0f)
                curveToRelative(-0.03f, 7.616f, -6.306f, 13.78f, -14.186f, 13.752f)
                curveToRelative(-5.5f, -0.02f, -10.627f, -3.184f, -12.97f, -7.99f)
                lineToRelative(-0.005f, -0.011f)
                lineTo(10.5f, 23.751f)
                verticalLineToRelative(-1.0f)
                lineTo(3.25f, 22.751f)
                lineTo(3.25f, 30.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-4.771f)
                curveToRelative(2.71f, 4.575f, 7.842f, 7.501f, 13.31f, 7.522f)
                curveToRelative(8.414f, 0.03f, 15.157f, -6.561f, 15.19f, -14.748f)
                close()
                moveTo(13.709f, 18.578f)
                verticalLineToRelative(0.07f)
                horizontalLineToRelative(-1.097f)
                lineToRelative(-0.544f, 1.253f)
                horizontalLineToRelative(1.753f)
                quadToRelative(0.882f, 5.649f, 5.445f, 5.649f)
                quadToRelative(1.938f, 0.0f, 3.444f, -0.747f)
                quadToRelative(0.104f, -0.053f, 0.566f, -0.314f)
                verticalLineToRelative(-2.011f)
                quadToRelative(-1.641f, 0.888f, -2.318f, 1.132f)
                quadToRelative(-0.675f, 0.241f, -1.548f, 0.242f)
                quadToRelative(-1.056f, 0.0f, -1.815f, -0.485f)
                quadToRelative(-0.73f, -0.464f, -1.25f, -1.525f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, -0.616f, -1.941f)
                horizontalLineToRelative(4.799f)
                lineToRelative(0.562f, -1.253f)
                horizontalLineToRelative(-5.505f)
                verticalLineToRelative(-0.004f)
                quadToRelative(-0.01f, -0.29f, -0.01f, -0.43f)
                quadToRelative(0.0f, -0.283f, 0.02f, -0.84f)
                horizontalLineToRelative(6.05f)
                lineToRelative(0.564f, -1.252f)
                horizontalLineToRelative(-6.44f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.319f, -1.252f)
                quadToRelative(0.901f, -2.738f, 3.25f, -2.738f)
                quadToRelative(1.28f, 0.0f, 2.511f, 0.698f)
                quadToRelative(0.506f, 0.293f, 1.427f, 0.898f)
                lineToRelative(0.727f, -1.636f)
                quadToRelative(-2.08f, -1.607f, -4.635f, -1.607f)
                quadToRelative(-3.619f, 0.0f, -4.983f, 3.728f)
                quadToRelative(-0.327f, 0.889f, -0.502f, 1.91f)
                horizontalLineToRelative(-1.27f)
                lineToRelative(-0.545f, 1.252f)
                horizontalLineToRelative(1.672f)
                lineToRelative(-0.01f, 0.072f)
                quadToRelative(-0.022f, 0.564f, -0.021f, 0.717f)
                close()
            }
        }
        .build()
        return _moneyExchangeMedium!!
    }

private var _moneyExchangeMedium: ImageVector? = null
