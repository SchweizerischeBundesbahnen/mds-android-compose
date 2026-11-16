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
                moveTo(12.0f, 3.999f)
                verticalLineToRelative(-1.0f)
                lineTo(2.0f, 2.999f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(7.0f, 4.999f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(2.0f)
                lineTo(9.0f, 5.0f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(0.001f)
                curveToRelative(1.685f, -0.015f, 2.963f, 0.26f, 3.974f, 0.833f)
                curveToRelative(1.016f, 0.578f, 1.71f, 1.426f, 2.276f, 2.455f)
                lineToRelative(0.01f, 0.02f)
                lineToRelative(-0.449f, 0.22f)
                lineToRelative(-0.008f, 0.006f)
                lineToRelative(0.457f, -0.227f)
                lineToRelative(3.563f, 7.187f)
                lineToRelative(-0.454f, 0.224f)
                lineToRelative(0.006f, -0.002f)
                lineToRelative(0.448f, -0.222f)
                lineToRelative(0.009f, 0.018f)
                lineToRelative(0.008f, 0.02f)
                curveToRelative(0.405f, 1.018f, 0.581f, 1.897f, 0.495f, 2.646f)
                arcToRelative(2.51f, 2.51f, 0.0f, false, true, -1.049f, 1.808f)
                curveToRelative(-0.573f, 0.418f, -1.336f, 0.666f, -2.21f, 0.813f)
                curveToRelative(-0.881f, 0.149f, -1.919f, 0.202f, -3.076f, 0.201f)
                lineTo(9.0f, 21.001f)
                lineTo(9.0f, 18.5f)
                lineTo(7.0f, 18.5f)
                lineTo(7.0f, 21.0f)
                lineTo(2.0f, 21.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.0f)
                lineTo(6.0f, 6.0f)
                lineTo(2.0f, 6.0f)
                lineTo(2.0f, 5.0f)
                close()
                moveTo(15.309f, 8.999f)
                lineTo(15.447f, 9.276f)
                lineTo(18.447f, 15.276f)
                lineTo(18.809f, 16.0f)
                lineTo(11.0f, 16.0f)
                lineTo(11.0f, 9.0f)
                close()
                moveTo(12.0f, 15.0f)
                horizontalLineToRelative(5.191f)
                lineToRelative(-2.5f, -5.0f)
                lineTo(12.0f, 10.0f)
                close()
                moveTo(15.5f, 20.002f)
                lineTo(10.0f, 20.002f)
                lineTo(10.0f, 6.0f)
                horizontalLineToRelative(1.505f)
                curveToRelative(1.578f, -0.016f, 2.666f, 0.244f, 3.474f, 0.704f)
                curveToRelative(0.803f, 0.455f, 1.381f, 1.135f, 1.891f, 2.06f)
                lineToRelative(3.545f, 7.151f)
                curveToRelative(0.371f, 0.938f, 0.486f, 1.635f, 0.427f, 2.149f)
                arcToRelative(1.51f, 1.51f, 0.0f, false, true, -0.646f, 1.114f)
                curveToRelative(-0.393f, 0.287f, -0.98f, 0.5f, -1.787f, 0.635f)
                curveToRelative(-0.8f, 0.135f, -1.775f, 0.188f, -2.909f, 0.188f)
            }
        }
        .build()
        return _locomotiveSmall!!
    }

private var _locomotiveSmall: ImageVector? = null
