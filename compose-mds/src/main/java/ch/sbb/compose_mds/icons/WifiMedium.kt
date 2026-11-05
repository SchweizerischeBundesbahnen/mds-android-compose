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

public val SBBIcons.WifiMedium: ImageVector
    get() {
        if (_wifiMedium != null) {
            return _wifiMedium!!
        }
        _wifiMedium = Builder(
            name = "WifiMedium",
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
                moveTo(2.966f, 12.724f)
                curveTo(6.746f, 8.746f, 12.075f, 6.25f, 18.0f, 6.25f)
                curveToRelative(5.923f, 0.0f, 11.253f, 2.496f, 15.032f, 6.474f)
                lineToRelative(-0.725f, 0.689f)
                curveTo(28.707f, 9.623f, 23.635f, 7.25f, 18.0f, 7.25f)
                curveToRelative(-5.637f, 0.0f, -10.709f, 2.373f, -14.31f, 6.163f)
                close()
                moveTo(18.0f, 25.25f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 0.0f, 3.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 0.0f, -3.5f)
                moveTo(15.25f, 27.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, 5.5f, 0.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -5.5f, 0.0f)
                moveTo(18.0f, 10.75f)
                curveToRelative(-4.64f, 0.0f, -8.814f, 1.954f, -11.773f, 5.07f)
                lineToRelative(0.725f, 0.689f)
                curveTo(9.732f, 13.582f, 13.648f, 11.75f, 18.0f, 11.75f)
                reflectiveCurveToRelative(8.268f, 1.832f, 11.048f, 4.759f)
                lineToRelative(0.725f, -0.69f)
                curveTo(26.813f, 12.705f, 22.639f, 10.75f, 18.0f, 10.75f)
                moveToRelative(-8.506f, 8.173f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, true, 8.514f, -3.668f)
                curveToRelative(3.352f, 0.0f, 6.367f, 1.41f, 8.506f, 3.658f)
                lineToRelative(-0.725f, 0.69f)
                arcToRelative(10.7f, 10.7f, 0.0f, false, false, -7.781f, -3.348f)
                curveToRelative(-3.068f, 0.0f, -5.83f, 1.292f, -7.788f, 3.356f)
                close()
                moveTo(18.0f, 19.75f)
                curveToRelative(-2.072f, 0.0f, -3.928f, 0.88f, -5.246f, 2.267f)
                lineToRelative(0.725f, 0.69f)
                arcToRelative(6.22f, 6.22f, 0.0f, false, true, 4.521f, -1.957f)
                curveToRelative(1.781f, 0.0f, 3.382f, 0.755f, 4.522f, 1.956f)
                lineToRelative(0.725f, -0.688f)
                arcTo(7.22f, 7.22f, 0.0f, false, false, 18.0f, 19.75f)
            }
        }
            .build()
        return _wifiMedium!!
    }

private var _wifiMedium: ImageVector? = null
