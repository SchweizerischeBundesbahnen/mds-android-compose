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

public val SBBIcons.GpsSmall: ImageVector
    get() {
        if (_gpsSmall != null) {
            return _gpsSmall!!
        }
        _gpsSmall = Builder(name = "GpsSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.004f, 5.017f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.016f)
                arcTo(7.484f, 7.484f, 0.0f, false, false, 5.016f, 12.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.016f)
                arcToRelative(7.485f, 7.485f, 0.0f, false, false, 6.988f, 6.984f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.016f)
                arcToRelative(7.485f, 7.485f, 0.0f, false, false, 6.98f, -6.988f)
                horizontalLineToRelative(2.015f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.016f)
                arcToRelative(7.484f, 7.484f, 0.0f, false, false, -6.98f, -6.98f)
                moveTo(6.0f, 12.5f)
                curveTo(6.0f, 8.9f, 8.9f, 6.0f, 12.5f, 6.0f)
                reflectiveCurveTo(19.0f, 8.9f, 19.0f, 12.5f)
                reflectiveCurveTo(16.1f, 19.0f, 12.5f, 19.0f)
                reflectiveCurveTo(6.0f, 16.1f, 6.0f, 12.5f)
                moveToRelative(3.0f, 0.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 7.0f, 0.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -7.0f, 0.0f)
                moveTo(12.5f, 8.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, false, 0.0f, 9.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 0.0f, -9.0f)
            }
        }
        .build()
        return _gpsSmall!!
    }

private var _gpsSmall: ImageVector? = null
