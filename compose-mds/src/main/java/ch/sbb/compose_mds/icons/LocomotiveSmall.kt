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

public val SBBIcons.LocomotiveSmall: ImageVector
    get() {
        if (_locomotiveSmall != null) {
            return _locomotiveSmall!!
        }
        _locomotiveSmall = Builder(name = "LocomotiveSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.0f, 3.999f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-1.0f)
                lineTo(2.0f, 2.999f)
                close()
                moveTo(2.0f, 4.999f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(2.0f)
                lineTo(9.0f, 5.0f)
                horizontalLineToRelative(2.498f)
                curveToRelative(1.685f, -0.016f, 2.964f, 0.26f, 3.975f, 0.835f)
                curveToRelative(1.017f, 0.577f, 1.71f, 1.425f, 2.277f, 2.454f)
                lineToRelative(0.005f, 0.01f)
                lineToRelative(0.005f, 0.01f)
                lineToRelative(3.563f, 7.186f)
                lineToRelative(0.01f, 0.019f)
                lineToRelative(0.007f, 0.019f)
                curveToRelative(0.404f, 1.018f, 0.58f, 1.897f, 0.495f, 2.646f)
                arcToRelative(2.51f, 2.51f, 0.0f, false, true, -1.049f, 1.807f)
                curveToRelative(-0.573f, 0.419f, -1.336f, 0.666f, -2.21f, 0.814f)
                curveToRelative(-0.881f, 0.148f, -1.919f, 0.202f, -3.076f, 0.201f)
                lineTo(9.0f, 21.001f)
                lineTo(9.0f, 18.5f)
                lineTo(7.0f, 18.5f)
                lineTo(7.0f, 21.0f)
                lineTo(2.0f, 21.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.0f)
                lineTo(6.0f, 6.0f)
                lineTo(2.0f, 6.0f)
                close()
                moveTo(11.0f, 8.999f)
                horizontalLineToRelative(4.309f)
                lineToRelative(0.138f, 0.277f)
                lineToRelative(3.0f, 6.0f)
                lineToRelative(0.362f, 0.724f)
                lineTo(11.0f, 16.0f)
                lineTo(11.0f, 9.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.191f)
                lineToRelative(-2.5f, -5.0f)
                close()
                moveTo(11.505f, 6.0f)
                curveToRelative(1.578f, -0.015f, 2.666f, 0.245f, 3.475f, 0.704f)
                curveToRelative(0.801f, 0.456f, 1.38f, 1.135f, 1.889f, 2.058f)
                lineToRelative(3.549f, 7.159f)
                curveToRelative(0.37f, 0.935f, 0.482f, 1.63f, 0.423f, 2.143f)
                arcToRelative(1.51f, 1.51f, 0.0f, false, true, -0.645f, 1.115f)
                curveToRelative(-0.393f, 0.287f, -0.98f, 0.499f, -1.787f, 0.635f)
                curveToRelative(-0.8f, 0.135f, -1.775f, 0.188f, -2.909f, 0.187f)
                lineTo(10.0f, 20.001f)
                lineTo(10.0f, 6.0f)
                horizontalLineToRelative(1.505f)
            }
        }
        .build()
        return _locomotiveSmall!!
    }

private var _locomotiveSmall: ImageVector? = null
