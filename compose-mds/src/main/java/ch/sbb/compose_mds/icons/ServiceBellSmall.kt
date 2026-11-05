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

public val SBBIcons.ServiceBellSmall: ImageVector
    get() {
        if (_serviceBellSmall != null) {
            return _serviceBellSmall!!
        }
        _serviceBellSmall = Builder(
            name = "ServiceBellSmall",
            defaultWidth = 24.0.dp,
            defaultHeight =
                24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
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
                moveTo(12.5f, 5.0f)
                horizontalLineToRelative(2.48f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.52f)
                verticalLineToRelative(1.013f)
                curveToRelative(-1.355f, 0.076f, -2.452f, 0.463f, -3.33f, 1.07f)
                curveToRelative(-0.981f, 0.676f, -1.658f, 1.605f, -2.123f, 2.607f)
                curveTo(5.123f, 11.68f, 5.0f, 14.022f, 5.0f, 15.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(14.002f)
                lineTo(19.0f, 15.498f)
                curveToRelative(-0.005f, -1.476f, -0.128f, -3.82f, -1.05f, -5.807f)
                curveToRelative(-0.465f, -1.002f, -1.14f, -1.931f, -2.12f, -2.608f)
                curveToRelative(-0.878f, -0.607f, -1.975f, -0.994f, -3.33f, -1.07f)
                close()
                moveTo(6.006f, 15.0f)
                horizontalLineToRelative(11.988f)
                curveToRelative(-0.035f, -1.42f, -0.216f, -3.304f, -0.951f, -4.889f)
                curveToRelative(-0.41f, -0.881f, -0.982f, -1.653f, -1.781f, -2.206f)
                curveTo(14.465f, 7.355f, 13.412f, 7.0f, 12.0f, 7.0f)
                reflectiveCurveToRelative(-2.465f, 0.355f, -3.263f, 0.905f)
                curveToRelative(-0.8f, 0.553f, -1.374f, 1.325f, -1.783f, 2.207f)
                curveToRelative(-0.736f, 1.584f, -0.918f, 3.469f, -0.948f, 4.888f)
                moveTo(20.0f, 18.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(16.0f)
                close()
            }
        }
            .build()
        return _serviceBellSmall!!
    }

private var _serviceBellSmall: ImageVector? = null
