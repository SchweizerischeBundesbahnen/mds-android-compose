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

public val SBBIcons.LocationPinCameraMedium: ImageVector
    get() {
        if (_locationPinCameraMedium != null) {
            return _locationPinCameraMedium!!
        }
        _locationPinCameraMedium = Builder(
            name = "LocationPinCameraMedium",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
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
                moveTo(7.75f, 13.51f)
                curveTo(7.75f, 7.843f, 12.339f, 3.25f, 18.0f, 3.25f)
                reflectiveCurveToRelative(10.25f, 4.594f, 10.25f, 10.26f)
                verticalLineToRelative(0.004f)
                curveToRelative(-0.015f, 1.706f, -0.552f, 3.224f, -1.367f, 4.653f)
                lineToRelative(-0.005f, 0.008f)
                lineToRelative(-0.005f, 0.008f)
                lineToRelative(-8.42f, 13.58f)
                lineToRelative(-0.425f, 0.686f)
                lineToRelative(-0.425f, -0.685f)
                lineToRelative(-8.42f, -13.58f)
                lineToRelative(-0.005f, -0.008f)
                curveTo(8.346f, 16.788f, 7.82f, 15.3f, 7.75f, 13.53f)
                verticalLineToRelative(-0.02f)
                moveToRelative(1.0f, -0.01f)
                curveToRelative(0.063f, 1.571f, 0.527f, 2.894f, 1.284f, 4.16f)
                lineToRelative(7.994f, 12.891f)
                lineToRelative(7.99f, -12.887f)
                curveToRelative(0.754f, -1.324f, 1.218f, -2.671f, 1.232f, -4.157f)
                curveTo(27.249f, 8.394f, 23.107f, 4.25f, 18.0f, 4.25f)
                curveToRelative(-5.105f, 0.0f, -9.245f, 4.14f, -9.25f, 9.25f)
                moveToRelative(9.25f, 0.367f)
                arcToRelative(0.202f, 0.202f, 0.0f, true, false, 0.0f, 0.405f)
                arcToRelative(0.202f, 0.202f, 0.0f, false, false, 0.0f, -0.405f)
                moveToRelative(-1.202f, 0.203f)
                arcToRelative(1.202f, 1.202f, 0.0f, true, true, 2.404f, 0.0f)
                arcToRelative(1.202f, 1.202f, 0.0f, false, true, -2.404f, 0.0f)
                moveTo(16.5f, 9.25f)
                horizontalLineToRelative(-0.309f)
                lineToRelative(-0.138f, 0.276f)
                lineToRelative(-0.612f, 1.224f)
                horizontalLineTo(12.25f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(11.5f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-3.191f)
                lineToRelative(-0.612f, -1.224f)
                lineToRelative(-0.138f, -0.276f)
                horizontalLineTo(16.5f)
                moveToRelative(-0.303f, 2.224f)
                lineToRelative(0.612f, -1.224f)
                horizontalLineToRelative(2.382f)
                lineToRelative(0.612f, 1.224f)
                lineToRelative(0.138f, 0.276f)
                horizontalLineToRelative(2.809f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-9.5f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(2.809f)
                close()
            }
        }
            .build()
        return _locationPinCameraMedium!!
    }

private var _locationPinCameraMedium: ImageVector? = null
