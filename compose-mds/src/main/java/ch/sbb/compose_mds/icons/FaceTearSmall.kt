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
                moveTo(4.0f, 12.0f)
                curveToRelative(0.0f, -4.414f, 3.586f, -8.0f, 8.0f, -8.0f)
                reflectiveCurveToRelative(8.0f, 3.586f, 8.0f, 8.0f)
                curveToRelative(0.0f, 0.278f, -0.019f, 0.56f, -0.047f, 0.839f)
                lineToRelative(0.994f, 0.102f)
                curveToRelative(0.032f, -0.302f, 0.053f, -0.62f, 0.053f, -0.941f)
                curveToRelative(0.0f, -4.966f, -4.034f, -9.0f, -9.0f, -9.0f)
                reflectiveCurveToRelative(-9.0f, 4.034f, -9.0f, 9.0f)
                reflectiveCurveToRelative(4.034f, 9.0f, 9.0f, 9.0f)
                arcToRelative(8.96f, 8.96f, 0.0f, false, false, 4.014f, -0.943f)
                lineToRelative(-0.448f, -0.894f)
                arcTo(7.96f, 7.96f, 0.0f, false, true, 12.0f, 20.0f)
                curveToRelative(-4.414f, 0.0f, -8.0f, -3.586f, -8.0f, -8.0f)
                moveToRelative(13.916f, -0.777f)
                lineToRelative(-0.416f, 0.277f)
                lineToRelative(-0.416f, -0.277f)
                lineToRelative(0.416f, -0.624f)
                close()
                moveTo(17.5f, 11.5f)
                lineTo(17.084f, 11.223f)
                lineTo(17.082f, 11.226f)
                lineTo(17.077f, 11.233f)
                lineTo(17.059f, 11.261f)
                arcToRelative(13.0f, 13.0f, 0.0f, false, false, -0.3f, 0.482f)
                curveToRelative(-0.192f, 0.32f, -0.45f, 0.77f, -0.706f, 1.283f)
                curveTo(15.55f, 14.03f, 15.0f, 15.373f, 15.0f, 16.5f)
                curveToRelative(0.0f, 1.376f, 1.124f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.124f, 2.5f, -2.5f)
                curveToRelative(0.0f, -1.127f, -0.55f, -2.47f, -1.053f, -3.474f)
                arcToRelative(19.0f, 19.0f, 0.0f, false, false, -1.006f, -1.765f)
                lineToRelative(-0.018f, -0.028f)
                lineToRelative(-0.005f, -0.007f)
                lineToRelative(-0.001f, -0.002f)
                verticalLineToRelative(-0.001f)
                close()
                moveTo(17.5f, 12.454f)
                curveToRelative(-0.164f, 0.28f, -0.358f, 0.63f, -0.553f, 1.02f)
                curveTo(16.45f, 14.47f, 16.0f, 15.627f, 16.0f, 16.5f)
                curveToRelative(0.0f, 0.824f, 0.676f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.676f, 1.5f, -1.5f)
                curveToRelative(0.0f, -0.873f, -0.45f, -2.03f, -0.947f, -3.026f)
                curveToRelative(-0.195f, -0.39f, -0.39f, -0.74f, -0.553f, -1.02f)
                moveTo(7.05f, 15.303f)
                curveTo(7.887f, 13.357f, 9.782f, 12.0f, 12.06f, 12.0f)
                curveToRelative(1.14f, 0.0f, 2.2f, 0.34f, 3.072f, 0.937f)
                lineToRelative(-0.564f, 0.826f)
                arcTo(4.4f, 4.4f, 0.0f, false, false, 12.06f, 13.0f)
                arcToRelative(4.41f, 4.41f, 0.0f, false, false, -4.09f, 2.697f)
                close()
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
