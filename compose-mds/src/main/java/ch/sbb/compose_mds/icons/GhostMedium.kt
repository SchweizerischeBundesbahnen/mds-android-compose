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

public val SBBIcons.GhostMedium: ImageVector
    get() {
        if (_ghostMedium != null) {
            return _ghostMedium!!
        }
        _ghostMedium = Builder(name = "GhostMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.979f, 3.25f)
                curveToRelative(5.66f, 0.0f, 10.25f, 4.59f, 10.25f, 10.25f)
                verticalLineToRelative(19.25f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.959f, 0.0f, -1.475f, -0.514f, -1.907f, -0.86f)
                arcToRelative(2.9f, 2.9f, 0.0f, false, false, -0.71f, -0.444f)
                curveToRelative(-0.273f, -0.113f, -0.63f, -0.196f, -1.133f, -0.196f)
                curveToRelative(-0.976f, 0.0f, -1.445f, 0.309f, -1.992f, 0.668f)
                curveToRelative(-0.594f, 0.39f, -1.266f, 0.832f, -2.54f, 0.832f)
                curveToRelative(-0.623f, 0.0f, -1.106f, -0.104f, -1.518f, -0.27f)
                curveToRelative(-0.405f, -0.164f, -0.723f, -0.38f, -0.996f, -0.566f)
                curveToRelative(-0.281f, -0.19f, -0.518f, -0.348f, -0.81f, -0.466f)
                curveToRelative(-0.286f, -0.115f, -0.642f, -0.198f, -1.144f, -0.198f)
                curveToRelative(-0.504f, 0.0f, -0.86f, 0.083f, -1.133f, 0.196f)
                curveToRelative(-0.276f, 0.114f, -0.49f, 0.268f, -0.711f, 0.445f)
                curveToRelative(-0.432f, 0.345f, -0.948f, 0.859f, -1.906f, 0.859f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(13.5f)
                curveToRelative(0.0f, -5.66f, 4.589f, -10.25f, 10.25f, -10.25f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(9.25f, 9.25f, 0.0f, false, false, -9.25f, 9.25f)
                verticalLineToRelative(18.25f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.541f, 0.0f, 0.775f, -0.236f, 1.28f, -0.64f)
                curveToRelative(0.248f, -0.199f, 0.55f, -0.42f, 0.954f, -0.587f)
                curveToRelative(0.407f, -0.169f, 0.895f, -0.273f, 1.516f, -0.273f)
                reflectiveCurveToRelative(1.105f, 0.104f, 1.517f, 0.27f)
                curveToRelative(0.404f, 0.164f, 0.723f, 0.38f, 0.996f, 0.566f)
                curveToRelative(0.281f, 0.19f, 0.518f, 0.348f, 0.81f, 0.466f)
                curveToRelative(0.286f, 0.115f, 0.642f, 0.198f, 1.144f, 0.198f)
                curveToRelative(0.976f, 0.0f, 1.445f, -0.309f, 1.991f, -0.668f)
                curveToRelative(0.595f, -0.39f, 1.267f, -0.832f, 2.541f, -0.832f)
                curveToRelative(0.621f, 0.0f, 1.11f, 0.104f, 1.516f, 0.273f)
                curveToRelative(0.405f, 0.167f, 0.706f, 0.388f, 0.953f, 0.586f)
                curveToRelative(0.506f, 0.405f, 0.74f, 0.641f, 1.282f, 0.641f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(13.5f)
                arcToRelative(9.25f, 9.25f, 0.0f, false, false, -9.25f, -9.25f)
                moveToRelative(-3.783f, 6.25f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, true, 0.0f, 4.5f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 0.0f, -4.5f)
                moveToRelative(7.5f, 0.0f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, true, 0.0f, 4.5f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 0.0f, -4.5f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, -2.5f)
                moveToRelative(-7.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, -2.5f)
            }
        }
        .build()
        return _ghostMedium!!
    }

private var _ghostMedium: ImageVector? = null
