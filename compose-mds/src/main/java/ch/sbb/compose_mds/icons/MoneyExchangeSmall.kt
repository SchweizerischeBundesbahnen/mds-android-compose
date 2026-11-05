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

public val SBBIcons.MoneyExchangeSmall: ImageVector
    get() {
        if (_moneyExchangeSmall != null) {
            return _moneyExchangeSmall!!
        }
        _moneyExchangeSmall = Builder(
            name = "MoneyExchangeSmall",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
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
                moveTo(12.328f, 3.0f)
                curveTo(7.147f, 2.99f, 3.01f, 7.03f, 3.0f, 12.001f)
                lineTo(2.0f, 12.0f)
                curveTo(2.01f, 6.448f, 6.624f, 1.99f, 12.33f, 2.0f)
                curveToRelative(3.53f, 0.007f, 6.782f, 1.7f, 8.67f, 4.523f)
                lineTo(21.0f, 4.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(17.0f, 8.0f)
                horizontalLineToRelative(3.707f)
                curveToRelative(-1.557f, -3.077f, -4.793f, -4.993f, -8.379f, -5.0f)
                lineToRelative(0.001f, -0.5f)
                close()
                moveTo(21.0f, 11.998f)
                curveToRelative(-0.02f, 4.983f, -4.126f, 9.021f, -9.29f, 9.002f)
                curveToRelative(-3.516f, -0.013f, -6.797f, -1.985f, -8.38f, -5.0f)
                lineTo(7.0f, 16.0f)
                verticalLineToRelative(-1.0f)
                lineTo(2.0f, 15.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.606f)
                curveToRelative(1.901f, 2.819f, 5.203f, 4.593f, 8.706f, 4.606f)
                curveToRelative(5.698f, 0.021f, 10.272f, -4.445f, 10.294f, -9.998f)
                close()
                moveTo(9.14f, 12.384f)
                verticalLineToRelative(0.047f)
                horizontalLineToRelative(-0.732f)
                lineToRelative(-0.363f, 0.836f)
                horizontalLineToRelative(1.17f)
                quadToRelative(0.587f, 3.765f, 3.63f, 3.765f)
                quadToRelative(1.29f, 0.0f, 2.295f, -0.497f)
                quadToRelative(0.07f, -0.035f, 0.377f, -0.21f)
                verticalLineToRelative(-1.34f)
                quadToRelative(-1.094f, 0.592f, -1.545f, 0.755f)
                quadToRelative(-0.45f, 0.16f, -1.032f, 0.16f)
                quadToRelative(-0.704f, 0.0f, -1.21f, -0.322f)
                quadToRelative(-0.486f, -0.31f, -0.834f, -1.018f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -0.41f, -1.293f)
                horizontalLineToRelative(3.2f)
                lineToRelative(0.374f, -0.835f)
                horizontalLineToRelative(-3.67f)
                verticalLineToRelative(-0.003f)
                lineToRelative(-0.007f, -0.287f)
                quadToRelative(0.0f, -0.188f, 0.014f, -0.56f)
                horizontalLineToRelative(4.033f)
                lineToRelative(0.376f, -0.835f)
                horizontalLineToRelative(-4.293f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, 0.212f, -0.835f)
                quadToRelative(0.601f, -1.825f, 2.167f, -1.825f)
                quadToRelative(0.854f, 0.0f, 1.674f, 0.466f)
                quadToRelative(0.337f, 0.196f, 0.951f, 0.598f)
                lineToRelative(0.485f, -1.09f)
                quadToRelative(-1.387f, -1.072f, -3.09f, -1.072f)
                quadToRelative(-2.412f, 0.0f, -3.322f, 2.486f)
                quadToRelative(-0.219f, 0.593f, -0.335f, 1.273f)
                horizontalLineToRelative(-0.847f)
                lineToRelative(-0.363f, 0.835f)
                lineTo(9.16f, 11.583f)
                lineToRelative(-0.007f, 0.047f)
                quadToRelative(-0.014f, 0.377f, -0.014f, 0.478f)
                close()
            }
        }
            .build()
        return _moneyExchangeSmall!!
    }

private var _moneyExchangeSmall: ImageVector? = null
