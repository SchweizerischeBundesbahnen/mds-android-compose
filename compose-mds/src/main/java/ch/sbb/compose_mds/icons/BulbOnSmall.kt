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

public val SBBIcons.BulbOnSmall: ImageVector
    get() {
        if (_bulbOnSmall != null) {
            return _bulbOnSmall!!
        }
        _bulbOnSmall = Builder(name = "BulbOnSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.5f, 4.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(1.0f)
                lineTo(12.5f, 4.0f)
                close()
                moveTo(15.506f, 4.811f)
                lineTo(14.804f, 6.098f)
                lineTo(15.682f, 6.578f)
                lineTo(16.384f, 5.29f)
                close()
                moveTo(12.0f, 8.0f)
                curveToRelative(-2.224f, 0.0f, -4.0f, 1.776f, -4.0f, 4.0f)
                curveToRelative(0.0f, 1.455f, 0.833f, 2.764f, 2.037f, 3.5f)
                horizontalLineToRelative(3.94f)
                curveTo(15.151f, 14.861f, 16.0f, 13.475f, 16.0f, 12.0f)
                curveToRelative(0.0f, -2.224f, -1.776f, -4.0f, -4.0f, -4.0f)
                moveToRelative(-5.0f, 4.0f)
                curveToRelative(0.0f, 1.62f, 0.81f, 3.06f, 2.0f, 3.995f)
                verticalLineToRelative(2.46f)
                lineToRelative(0.335f, 0.117f)
                lineToRelative(1.665f, 0.583f)
                lineTo(11.0f, 20.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-0.845f)
                lineToRelative(1.665f, -0.583f)
                lineToRelative(0.335f, -0.117f)
                verticalLineToRelative(-2.427f)
                curveToRelative(1.205f, -0.905f, 2.0f, -2.428f, 2.0f, -4.028f)
                curveToRelative(0.0f, -2.776f, -2.224f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.224f, -5.0f, 5.0f)
                moveToRelative(3.0f, 4.5f)
                verticalLineToRelative(1.245f)
                lineToRelative(1.665f, 0.583f)
                lineToRelative(0.335f, 0.117f)
                lineToRelative(0.335f, -0.117f)
                lineTo(14.0f, 17.745f)
                lineTo(14.0f, 16.5f)
                close()
                moveTo(17.32f, 8.22f)
                lineTo(18.602f, 7.513f)
                lineTo(19.085f, 8.388f)
                lineTo(17.802f, 9.096f)
                close()
                moveTo(18.499f, 12.5f)
                lineTo(19.999f, 12.504f)
                lineTo(20.001f, 11.504f)
                lineTo(18.501f, 11.5f)
                close()
                moveTo(18.619f, 16.487f)
                lineTo(17.319f, 15.794f)
                lineTo(17.79f, 14.911f)
                lineTo(19.089f, 15.604f)
                close()
                moveTo(5.299f, 16.467f)
                lineTo(6.609f, 15.687f)
                lineTo(6.097f, 14.827f)
                lineTo(4.787f, 15.607f)
                close()
                moveTo(5.5f, 12.5f)
                lineTo(4.0f, 12.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.5f)
                close()
                moveTo(4.84f, 8.41f)
                lineTo(6.12f, 9.234f)
                lineTo(6.661f, 8.394f)
                lineTo(5.381f, 7.569f)
                close()
                moveTo(8.318f, 6.584f)
                lineTo(7.609f, 5.294f)
                lineTo(8.485f, 4.813f)
                lineTo(9.195f, 6.102f)
                close()
            }
        }
        .build()
        return _bulbOnSmall!!
    }

private var _bulbOnSmall: ImageVector? = null
