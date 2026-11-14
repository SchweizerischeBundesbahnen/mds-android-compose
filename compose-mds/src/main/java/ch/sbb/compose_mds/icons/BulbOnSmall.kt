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
                moveTo(12.5f, 5.5f)
                lineTo(12.5f, 4.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(15.682f, 6.577f)
                lineTo(16.384f, 5.29f)
                lineTo(15.506f, 4.812f)
                lineTo(14.804f, 6.099f)
                close()
                moveTo(16.0f, 12.0f)
                curveToRelative(0.0f, -2.224f, -1.776f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.776f, -4.0f, 4.0f)
                curveToRelative(0.0f, 1.455f, 0.834f, 2.764f, 2.038f, 3.5f)
                horizontalLineToRelative(3.939f)
                curveTo(15.15f, 14.861f, 16.0f, 13.475f, 16.0f, 12.0f)
                moveToRelative(-9.0f, 0.0f)
                curveToRelative(0.0f, 1.62f, 0.81f, 3.06f, 2.0f, 3.995f)
                verticalLineToRelative(2.46f)
                lineToRelative(0.335f, 0.117f)
                lineToRelative(1.665f, 0.582f)
                lineTo(11.0f, 20.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-0.846f)
                lineToRelative(1.665f, -0.582f)
                lineToRelative(0.335f, -0.117f)
                verticalLineToRelative(-2.427f)
                curveToRelative(1.205f, -0.905f, 2.0f, -2.428f, 2.0f, -4.028f)
                curveToRelative(0.0f, -2.776f, -2.224f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.224f, -5.0f, 5.0f)
                moveToRelative(3.0f, 5.745f)
                lineToRelative(1.665f, 0.583f)
                lineToRelative(0.335f, 0.117f)
                lineToRelative(0.335f, -0.117f)
                lineTo(14.0f, 17.745f)
                lineTo(14.0f, 16.5f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(19.085f, 8.389f)
                lineTo(17.802f, 9.097f)
                lineTo(17.32f, 8.221f)
                lineTo(18.602f, 7.513f)
                close()
                moveTo(20.0f, 12.504f)
                lineToRelative(0.002f, -1.0f)
                lineToRelative(-1.5f, -0.004f)
                lineToRelative(-0.002f, 1.0f)
                close()
                moveTo(19.09f, 15.604f)
                lineTo(18.62f, 16.487f)
                lineTo(17.32f, 15.794f)
                lineTo(17.791f, 14.911f)
                close()
                moveTo(5.3f, 16.466f)
                lineTo(6.609f, 15.687f)
                lineTo(6.099f, 14.827f)
                lineTo(4.788f, 15.607f)
                close()
                moveTo(5.5f, 11.5f)
                verticalLineToRelative(1.0f)
                lineTo(4.0f, 12.5f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(6.12f, 9.234f)
                lineTo(6.662f, 8.393f)
                lineTo(5.38f, 7.57f)
                lineToRelative(-0.54f, 0.84f)
                close()
                moveTo(9.195f, 6.102f)
                lineTo(8.318f, 6.584f)
                lineTo(7.608f, 5.294f)
                lineTo(8.486f, 4.813f)
                close()
            }
        }
        .build()
        return _bulbOnSmall!!
    }

private var _bulbOnSmall: ImageVector? = null
