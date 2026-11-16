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

public val SBBIcons.FaceTearSmall: ImageVector
    get() {
        if (_faceTearSmall != null) {
            return _faceTearSmall!!
        }
        _faceTearSmall = Builder(name = "FaceTearSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 4.0f)
                curveToRelative(4.414f, 0.0f, 8.0f, 3.586f, 8.0f, 8.0f)
                quadToRelative(-0.002f, 0.419f, -0.047f, 0.839f)
                lineToRelative(0.994f, 0.102f)
                curveToRelative(0.032f, -0.302f, 0.053f, -0.62f, 0.053f, -0.941f)
                curveToRelative(0.0f, -4.966f, -4.034f, -9.0f, -9.0f, -9.0f)
                reflectiveCurveToRelative(-9.0f, 4.034f, -9.0f, 9.0f)
                reflectiveCurveToRelative(4.034f, 9.0f, 9.0f, 9.0f)
                arcToRelative(8.96f, 8.96f, 0.0f, false, false, 4.014f, -0.942f)
                lineToRelative(-0.448f, -0.895f)
                arcTo(7.96f, 7.96f, 0.0f, false, true, 12.0f, 20.0f)
                curveToRelative(-4.414f, 0.0f, -8.0f, -3.586f, -8.0f, -8.0f)
                reflectiveCurveToRelative(3.586f, -8.0f, 8.0f, -8.0f)
                moveToRelative(7.0f, 12.5f)
                curveToRelative(0.0f, -0.873f, -0.45f, -2.03f, -0.947f, -3.026f)
                curveToRelative(-0.194f, -0.388f, -0.39f, -0.736f, -0.553f, -1.016f)
                curveToRelative(-0.163f, 0.28f, -0.36f, 0.628f, -0.553f, 1.016f)
                curveTo(16.45f, 14.47f, 16.0f, 15.627f, 16.0f, 16.5f)
                curveToRelative(0.0f, 0.824f, 0.676f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.676f, 1.5f, -1.5f)
                moveToRelative(1.0f, 0.0f)
                curveToRelative(0.0f, 1.376f, -1.124f, 2.5f, -2.5f, 2.5f)
                arcToRelative(2.506f, 2.506f, 0.0f, false, true, -2.5f, -2.5f)
                curveToRelative(0.0f, -1.127f, 0.55f, -2.47f, 1.053f, -3.474f)
                arcToRelative(19.0f, 19.0f, 0.0f, false, true, 1.006f, -1.765f)
                lineToRelative(0.012f, -0.019f)
                lineToRelative(0.006f, -0.009f)
                lineToRelative(0.005f, -0.007f)
                lineToRelative(0.001f, -0.002f)
                lineToRelative(0.001f, -0.001f)
                lineToRelative(0.416f, -0.624f)
                lineToRelative(0.416f, 0.624f)
                horizontalLineToRelative(0.001f)
                lineToRelative(0.001f, 0.003f)
                lineToRelative(0.005f, 0.007f)
                lineToRelative(0.006f, 0.01f)
                quadToRelative(0.006f, 0.007f, 0.012f, 0.018f)
                arcToRelative(15.0f, 15.0f, 0.0f, false, true, 0.3f, 0.482f)
                curveToRelative(0.192f, 0.32f, 0.45f, 0.77f, 0.706f, 1.283f)
                curveTo(19.45f, 14.03f, 20.0f, 15.373f, 20.0f, 16.5f)
                moveTo(12.06f, 12.0f)
                curveToRelative(1.14f, 0.0f, 2.2f, 0.34f, 3.072f, 0.938f)
                lineToRelative(-0.564f, 0.825f)
                arcTo(4.4f, 4.4f, 0.0f, false, false, 12.06f, 13.0f)
                arcToRelative(4.415f, 4.415f, 0.0f, false, false, -4.091f, 2.697f)
                lineToRelative(-0.918f, -0.394f)
                curveTo(7.886f, 13.357f, 9.781f, 12.0f, 12.06f, 12.0f)
                moveTo(8.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                moveToRelative(7.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
            }
        }
        .build()
        return _faceTearSmall!!
    }

private var _faceTearSmall: ImageVector? = null
