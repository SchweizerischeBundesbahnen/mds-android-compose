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

public val SBBIcons.MountainPlusMedium: ImageVector
    get() {
        if (_mountainPlusMedium != null) {
            return _mountainPlusMedium!!
        }
        _mountainPlusMedium = Builder(
            name = "MountainPlusMedium",
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
                moveTo(27.25f, 10.253f)
                lineTo(27.25f, 13.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-3.247f)
                horizontalLineToRelative(3.257f)
                verticalLineToRelative(-1.0f)
                lineTo(28.25f, 9.253f)
                lineTo(28.25f, 6.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.253f)
                horizontalLineToRelative(-3.34f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(17.686f, 7.255f)
                lineTo(17.248f, 6.476f)
                lineTo(16.813f, 7.256f)
                lineTo(7.498f, 23.977f)
                lineTo(3.693f, 30.498f)
                lineTo(3.254f, 31.25f)
                horizontalLineToRelative(27.991f)
                lineToRelative(-0.438f, -0.752f)
                lineToRelative(-1.269f, -2.175f)
                close()
                moveTo(17.761f, 17.641f)
                lineTo(9.293f, 22.81f)
                lineToRelative(7.96f, -14.285f)
                lineToRelative(9.79f, 17.405f)
                lineToRelative(-8.677f, -8.224f)
                lineToRelative(-0.278f, -0.263f)
                close()
                moveTo(17.956f, 18.694f)
                lineTo(28.706f, 28.882f)
                lineTo(29.505f, 30.25f)
                lineTo(4.994f, 30.25f)
                lineTo(8.3f, 24.586f)
                close()
            }
        }
            .build()
        return _mountainPlusMedium!!
    }

private var _mountainPlusMedium: ImageVector? = null
