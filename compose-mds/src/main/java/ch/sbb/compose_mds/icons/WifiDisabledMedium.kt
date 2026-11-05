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

public val SBBIcons.WifiDisabledMedium: ImageVector
    get() {
        if (_wifiDisabledMedium != null) {
            return _wifiDisabledMedium!!
        }
        _wifiDisabledMedium = Builder(
            name = "WifiDisabledMedium",
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
                moveToRelative(8.096f, 8.803f)
                lineToRelative(-3.2f, -3.2f)
                lineToRelative(0.708f, -0.707f)
                lineToRelative(22.5f, 22.5f)
                lineToRelative(-0.707f, 0.708f)
                lineToRelative(-6.719f, -6.719f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, -2.677f, -0.634f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, -4.521f, 1.956f)
                lineToRelative(-0.726f, -0.688f)
                arcToRelative(7.2f, 7.2f, 0.0f, false, true, 5.247f, -2.268f)
                quadToRelative(0.585f, 0.001f, 1.139f, 0.095f)
                lineToRelative(-3.35f, -3.349f)
                arcToRelative(10.73f, 10.73f, 0.0f, false, false, -5.57f, 3.114f)
                lineToRelative(-0.725f, -0.688f)
                arcToRelative(11.74f, 11.74f, 0.0f, false, true, 5.466f, -3.255f)
                lineToRelative(-2.752f, -2.752f)
                arcToRelative(15.3f, 15.3f, 0.0f, false, false, -5.257f, 3.593f)
                lineToRelative(-0.726f, -0.688f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, true, 5.221f, -3.667f)
                lineTo(8.835f, 9.542f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, -5.142f, 3.87f)
                lineToRelative(-0.725f, -0.688f)
                arcToRelative(20.8f, 20.8f, 0.0f, false, true, 5.128f, -3.921f)
                moveTo(18.0f, 25.25f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 0.0f, 3.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 0.0f, -3.5f)
                moveTo(15.25f, 27.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, 5.5f, 0.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -5.5f, 0.0f)
                moveTo(10.845f, 7.55f)
                curveToRelative(2.23f, -0.825f, 4.632f, -1.3f, 7.155f, -1.3f)
                curveToRelative(5.924f, 0.0f, 11.253f, 2.496f, 15.033f, 6.473f)
                lineToRelative(-0.725f, 0.69f)
                curveTo(28.708f, 9.622f, 23.636f, 7.25f, 18.0f, 7.25f)
                curveToRelative(-2.396f, 0.0f, -4.68f, 0.451f, -6.809f, 1.238f)
                close()
                moveTo(18.0f, 10.75f)
                curveToRelative(-1.2f, 0.0f, -2.366f, 0.137f, -3.487f, 0.383f)
                lineToRelative(0.215f, 0.977f)
                arcTo(15.3f, 15.3f, 0.0f, false, true, 18.0f, 11.75f)
                curveToRelative(4.352f, 0.0f, 8.268f, 1.831f, 11.048f, 4.759f)
                lineToRelative(0.725f, -0.689f)
                curveToRelative(-2.96f, -3.117f, -7.134f, -5.07f, -11.773f, -5.07f)
                moveToRelative(0.761f, 5.546f)
                curveToRelative(2.76f, 0.193f, 5.231f, 1.42f, 7.027f, 3.308f)
                lineToRelative(0.725f, -0.69f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, -7.682f, -3.616f)
                close()
            }
        }
            .build()
        return _wifiDisabledMedium!!
    }

private var _wifiDisabledMedium: ImageVector? = null
