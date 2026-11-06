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
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, -3.628f, 1.216f)
                lineToRelative(0.55f, 0.836f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 12.5f, 6.0f)
                curveToRelative(3.6f, 0.0f, 6.5f, 2.9f, 6.5f, 6.5f)
                curveToRelative(0.0f, 1.323f, -0.394f, 2.55f, -1.068f, 3.575f)
                lineToRelative(0.835f, 0.549f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, 1.217f, -3.628f)
                horizontalLineToRelative(2.015f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.016f)
                arcToRelative(7.484f, 7.484f, 0.0f, false, false, -6.98f, -6.98f)
                lineTo(13.003f, 3.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(3.0f, 12.0f)
                horizontalLineToRelative(2.017f)
                arcTo(7.47f, 7.47f, 0.0f, false, true, 6.85f, 7.558f)
                lineTo(4.721f, 5.43f)
                lineToRelative(0.708f, -0.707f)
                lineToRelative(14.85f, 14.849f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-2.13f, -2.129f)
                arcToRelative(7.47f, 7.47f, 0.0f, false, true, -4.438f, 1.835f)
                lineTo(13.004f, 22.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.016f)
                arcTo(7.484f, 7.484f, 0.0f, false, true, 5.017f, 13.0f)
                lineTo(3.0f, 13.0f)
                close()
                moveTo(16.734f, 17.44f)
                lineTo(15.309f, 16.016f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 8.984f, 9.69f)
                lineTo(7.56f, 8.267f)
                arcTo(6.48f, 6.48f, 0.0f, false, false, 6.0f, 12.5f)
                curveToRelative(0.0f, 3.601f, 2.9f, 6.5f, 6.5f, 6.5f)
                arcToRelative(6.48f, 6.48f, 0.0f, false, false, 4.234f, -1.56f)
                moveToRelative(-7.037f, -7.036f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 4.9f, 4.9f)
                close()
                moveTo(12.5f, 9.0f)
                curveToRelative(-0.51f, 0.0f, -0.992f, 0.115f, -1.435f, 0.315f)
                lineToRelative(-0.412f, -0.911f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 12.5f, 8.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 4.5f, 4.5f)
                curveToRelative(0.0f, 0.664f, -0.15f, 1.285f, -0.404f, 1.847f)
                lineToRelative(-0.911f, -0.412f)
                curveToRelative(0.2f, -0.443f, 0.315f, -0.926f, 0.315f, -1.434f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 12.5f, 9.0f)
            }
        }
        .build()
        return _gpsDisabledSmall!!
    }

private var _gpsDisabledSmall: ImageVector? = null
