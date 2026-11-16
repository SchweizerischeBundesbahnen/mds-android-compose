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

public val SBBIcons.TorchSmall: ImageVector
    get() {
        if (_torchSmall != null) {
            return _torchSmall!!
        }
        _torchSmall = Builder(name = "TorchSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.884f, 7.924f)
                curveToRelative(-0.304f, -1.5f, -1.107f, -3.372f, -3.088f, -4.827f)
                lineTo(11.0f, 2.513f)
                verticalLineToRelative(5.293f)
                lineToRelative(-2.342f, -0.78f)
                lineTo(8.0f, 6.805f)
                verticalLineTo(10.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.5f, 3.5f)
                curveToRelative(1.964f, 0.0f, 3.324f, -1.595f, 3.496f, -3.437f)
                lineToRelative(0.002f, -0.013f)
                lineToRelative(0.005f, -0.031f)
                lineToRelative(0.018f, -0.158f)
                curveToRelative(0.013f, -0.134f, 0.028f, -0.325f, 0.033f, -0.561f)
                arcToRelative(8.6f, 8.6f, 0.0f, false, false, -0.17f, -1.876f)
                moveTo(11.5f, 13.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 9.0f, 10.5f)
                verticalLineTo(8.193f)
                lineToRelative(2.342f, 0.782f)
                lineToRelative(0.658f, 0.218f)
                verticalLineTo(4.581f)
                arcToRelative(6.8f, 6.8f, 0.0f, false, true, 1.903f, 3.542f)
                curveToRelative(0.134f, 0.661f, 0.16f, 1.243f, 0.15f, 1.657f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -0.041f, 0.604f)
                lineToRelative(-0.004f, 0.028f)
                lineToRelative(-0.001f, 0.005f)
                lineToRelative(-0.003f, 0.02f)
                lineToRelative(-0.002f, 0.02f)
                curveTo(13.872f, 11.905f, 12.844f, 13.0f, 11.5f, 13.0f)
                moveToRelative(2.49f, 2.598f)
                lineToRelative(0.12f, -0.598f)
                horizontalLineTo(8.89f)
                lineToRelative(0.12f, 0.598f)
                lineToRelative(1.0f, 5.0f)
                lineToRelative(0.08f, 0.402f)
                horizontalLineToRelative(2.82f)
                lineToRelative(0.08f, -0.402f)
                close()
                moveTo(12.09f, 20.0f)
                horizontalLineToRelative(-1.18f)
                lineToRelative(-0.8f, -4.0f)
                horizontalLineToRelative(2.78f)
                close()
            }
        }
        .build()
        return _torchSmall!!
    }

private var _torchSmall: ImageVector? = null
