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
        _serviceBellSmall = Builder(name = "ServiceBellSmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.5f, 5.0f)
                horizontalLineToRelative(2.48f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.52f)
                verticalLineToRelative(1.013f)
                curveToRelative(-1.355f, 0.077f, -2.452f, 0.463f, -3.33f, 1.07f)
                curveToRelative(-0.981f, 0.677f, -1.657f, 1.605f, -2.123f, 2.607f)
                curveTo(5.124f, 11.678f, 5.0f, 14.022f, 5.0f, 15.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(14.002f)
                lineTo(19.0f, 15.498f)
                curveToRelative(-0.005f, -1.476f, -0.128f, -3.82f, -1.05f, -5.808f)
                curveToRelative(-0.464f, -1.002f, -1.14f, -1.93f, -2.12f, -2.607f)
                curveToRelative(-0.878f, -0.607f, -1.975f, -0.994f, -3.33f, -1.07f)
                close()
                moveTo(12.0f, 7.0f)
                curveToRelative(-1.411f, 0.0f, -2.465f, 0.355f, -3.262f, 0.905f)
                curveToRelative(-0.801f, 0.553f, -1.375f, 1.325f, -1.785f, 2.207f)
                curveToRelative(-0.736f, 1.585f, -0.916f, 3.469f, -0.947f, 4.888f)
                horizontalLineToRelative(11.986f)
                curveToRelative(-0.034f, -1.42f, -0.214f, -3.304f, -0.949f, -4.889f)
                curveToRelative(-0.409f, -0.882f, -0.982f, -1.654f, -1.781f, -2.206f)
                curveTo(14.466f, 7.355f, 13.412f, 7.0f, 12.0f, 7.0f)
                moveToRelative(8.0f, 12.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _serviceBellSmall!!
    }

private var _serviceBellSmall: ImageVector? = null
