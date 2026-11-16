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

public val SBBIcons.GpsDisabledSmall: ImageVector
    get() {
        if (_gpsDisabledSmall != null) {
            return _gpsDisabledSmall!!
        }
        _gpsDisabledSmall = Builder(name = "GpsDisabledSmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.004f, 5.016f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, -3.628f, 1.217f)
                lineToRelative(0.55f, 0.835f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 12.498f, 6.0f)
                curveTo(16.1f, 6.0f, 19.0f, 8.9f, 19.0f, 12.5f)
                curveToRelative(0.0f, 1.323f, -0.393f, 2.55f, -1.067f, 3.575f)
                lineToRelative(0.836f, 0.55f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, 1.215f, -3.63f)
                lineTo(22.0f, 12.995f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.016f)
                arcToRelative(7.484f, 7.484f, 0.0f, false, false, -6.98f, -6.978f)
                lineTo(13.004f, 3.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(6.85f, 7.558f)
                arcTo(7.47f, 7.47f, 0.0f, false, false, 5.017f, 12.0f)
                lineTo(3.0f, 12.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.017f)
                arcToRelative(7.484f, 7.484f, 0.0f, false, false, 6.987f, 6.984f)
                lineTo(12.004f, 22.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.016f)
                arcToRelative(7.47f, 7.47f, 0.0f, false, false, 4.439f, -1.835f)
                lineToRelative(2.128f, 2.129f)
                lineToRelative(0.707f, -0.707f)
                lineTo(5.428f, 4.72f)
                lineToRelative(-0.706f, 0.708f)
                close()
                moveTo(7.559f, 8.267f)
                arcTo(6.48f, 6.48f, 0.0f, false, false, 6.0f, 12.5f)
                curveToRelative(0.0f, 3.601f, 2.9f, 6.5f, 6.5f, 6.5f)
                curveToRelative(1.62f, 0.0f, 3.098f, -0.587f, 4.234f, -1.56f)
                lineToRelative(-1.425f, -1.424f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -6.325f, -6.325f)
                close()
                moveTo(9.696f, 10.404f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 4.9f, 4.9f)
                close()
                moveTo(16.0f, 12.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 12.5f, 9.0f)
                curveToRelative(-0.51f, 0.0f, -0.992f, 0.114f, -1.435f, 0.314f)
                lineToRelative(-0.412f, -0.911f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 12.5f, 8.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 4.5f, 4.5f)
                curveToRelative(0.0f, 0.663f, -0.15f, 1.285f, -0.404f, 1.846f)
                lineToRelative(-0.911f, -0.412f)
                curveToRelative(0.2f, -0.443f, 0.315f, -0.925f, 0.315f, -1.433f)
            }
        }
        .build()
        return _gpsDisabledSmall!!
    }

private var _gpsDisabledSmall: ImageVector? = null
