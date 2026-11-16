package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.ShipSteeringWheelSmall: ImageVector
    get() {
        if (_shipSteeringWheelSmall != null) {
            return _shipSteeringWheelSmall!!
        }
        _shipSteeringWheelSmall = Builder(name = "ShipSteeringWheelSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                verticalLineToRelative(2.019f)
                arcToRelative(7.47f, 7.47f, 0.0f, false, true, 4.436f, 1.836f)
                lineToRelative(1.428f, -1.426f)
                lineToRelative(0.707f, 0.708f)
                lineToRelative(-1.427f, 1.426f)
                arcTo(7.46f, 7.46f, 0.0f, false, true, 18.98f, 11.0f)
                lineTo(21.0f, 11.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.019f)
                arcToRelative(7.46f, 7.46f, 0.0f, false, true, -1.837f, 4.436f)
                lineToRelative(1.427f, 1.428f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-1.428f, -1.427f)
                arcTo(7.46f, 7.46f, 0.0f, false, true, 12.0f, 18.98f)
                lineTo(12.0f, 21.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.019f)
                arcToRelative(7.47f, 7.47f, 0.0f, false, true, -4.437f, -1.837f)
                lineTo(5.136f, 18.57f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(1.426f, -1.428f)
                arcTo(7.46f, 7.46f, 0.0f, false, true, 4.02f, 12.0f)
                lineTo(2.0f, 12.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.019f)
                arcToRelative(7.47f, 7.47f, 0.0f, false, true, 1.836f, -4.437f)
                lineTo(4.43f, 5.137f)
                lineToRelative(0.707f, -0.708f)
                lineToRelative(1.426f, 1.427f)
                arcTo(7.47f, 7.47f, 0.0f, false, true, 11.0f, 4.02f)
                lineTo(11.0f, 2.0f)
                close()
                moveTo(11.5f, 5.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, false, 0.0f, 13.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, 0.0f, -13.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 0.0f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 0.0f, -11.0f)
                moveToRelative(-2.809f, 9.015f)
                curveToRelative(0.648f, 0.518f, 1.44f, 0.86f, 2.309f, 0.956f)
                verticalLineToRelative(-2.022f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -0.879f, -0.364f)
                close()
                moveTo(12.878f, 13.585f)
                curveToRelative(-0.262f, 0.174f, -0.559f, 0.3f, -0.878f, 0.364f)
                verticalLineToRelative(2.022f)
                arcToRelative(4.47f, 4.47f, 0.0f, false, false, 2.308f, -0.956f)
                close()
                moveTo(7.028f, 12.0f)
                curveToRelative(0.096f, 0.868f, 0.439f, 1.66f, 0.956f, 2.308f)
                lineToRelative(1.43f, -1.43f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 9.05f, 12.0f)
                close()
                moveTo(13.95f, 12.0f)
                curveToRelative(-0.065f, 0.32f, -0.191f, 0.616f, -0.365f, 0.878f)
                lineToRelative(1.43f, 1.43f)
                curveToRelative(0.517f, -0.648f, 0.86f, -1.44f, 0.957f, -2.308f)
                close()
                moveTo(11.5f, 10.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.001f, 3.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.5f, 10.0f)
                moveToRelative(2.085f, 0.121f)
                curveToRelative(0.174f, 0.263f, 0.3f, 0.56f, 0.365f, 0.879f)
                horizontalLineToRelative(2.022f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -0.957f, -2.31f)
                close()
                moveTo(7.985f, 8.691f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 7.027f, 11.0f)
                lineTo(9.05f, 11.0f)
                curveToRelative(0.065f, -0.32f, 0.19f, -0.617f, 0.364f, -0.879f)
                close()
                moveTo(11.0f, 7.027f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -2.309f, 0.956f)
                lineToRelative(1.43f, 1.43f)
                curveToRelative(0.262f, -0.174f, 0.56f, -0.3f, 0.879f, -0.364f)
                close()
                moveTo(12.0f, 9.049f)
                curveToRelative(0.319f, 0.065f, 0.616f, 0.19f, 0.878f, 0.364f)
                lineToRelative(1.43f, -1.43f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 12.0f, 7.028f)
                close()
            }
        }
        .build()
        return _shipSteeringWheelSmall!!
    }

private var _shipSteeringWheelSmall: ImageVector? = null
