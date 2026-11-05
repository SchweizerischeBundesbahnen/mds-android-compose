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

public val SBBIcons.WashingMachineMedium: ImageVector
    get() {
        if (_washingMachineMedium != null) {
            return _washingMachineMedium!!
        }
        _washingMachineMedium = Builder(name = "WashingMachineMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.25f, 3.25f)
                horizontalLineToRelative(23.5f)
                verticalLineToRelative(29.5f)
                lineTo(6.25f, 32.75f)
                lineTo(6.25f, 3.25f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(21.5f)
                verticalLineToRelative(-6.5f)
                close()
                moveTo(28.75f, 11.75f)
                lineTo(7.25f, 11.75f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(21.5f)
                close()
                moveTo(11.751f, 22.386f)
                lineToRelative(-0.001f, 0.114f)
                arcToRelative(6.25f, 6.25f, 0.0f, false, false, 12.393f, 1.16f)
                curveToRelative(-0.523f, -0.166f, -0.848f, -0.527f, -1.097f, -0.804f)
                lineToRelative(-0.02f, -0.021f)
                curveToRelative(-0.34f, -0.378f, -0.545f, -0.585f, -0.98f, -0.585f)
                curveToRelative(-0.436f, 0.0f, -0.64f, 0.207f, -0.981f, 0.585f)
                lineToRelative(-0.02f, 0.021f)
                curveToRelative(-0.334f, 0.371f, -0.804f, 0.894f, -1.704f, 0.894f)
                curveToRelative(-0.898f, 0.0f, -1.369f, -0.523f, -1.702f, -0.894f)
                lineToRelative(-0.02f, -0.022f)
                curveToRelative(-0.34f, -0.378f, -0.544f, -0.584f, -0.978f, -0.584f)
                curveToRelative(-0.431f, 0.0f, -0.635f, 0.206f, -0.975f, 0.584f)
                lineToRelative(-0.02f, 0.022f)
                curveToRelative(-0.332f, 0.37f, -0.801f, 0.894f, -1.698f, 0.894f)
                curveToRelative(-0.899f, 0.0f, -1.369f, -0.523f, -1.702f, -0.894f)
                lineToRelative(-0.019f, -0.022f)
                curveToRelative(-0.179f, -0.198f, -0.32f, -0.35f, -0.476f, -0.448f)
                moveToRelative(12.498f, 0.23f)
                curveToRelative(-0.158f, -0.1f, -0.3f, -0.251f, -0.48f, -0.45f)
                lineToRelative(-0.02f, -0.022f)
                curveToRelative(-0.333f, -0.371f, -0.804f, -0.894f, -1.703f, -0.894f)
                curveToRelative(-0.9f, 0.0f, -1.37f, 0.523f, -1.705f, 0.894f)
                lineToRelative(-0.019f, 0.021f)
                curveToRelative(-0.34f, 0.378f, -0.546f, 0.585f, -0.98f, 0.585f)
                curveToRelative(-0.435f, 0.0f, -0.639f, -0.206f, -0.98f, -0.584f)
                lineToRelative(-0.018f, -0.022f)
                curveToRelative(-0.334f, -0.37f, -0.804f, -0.894f, -1.703f, -0.894f)
                curveToRelative(-0.897f, 0.0f, -1.367f, 0.523f, -1.7f, 0.894f)
                lineToRelative(-0.019f, 0.022f)
                curveToRelative(-0.34f, 0.378f, -0.543f, 0.584f, -0.974f, 0.584f)
                curveToRelative(-0.434f, 0.0f, -0.637f, -0.206f, -0.977f, -0.584f)
                lineToRelative(-0.02f, -0.022f)
                curveToRelative(-0.248f, -0.276f, -0.573f, -0.637f, -1.094f, -0.803f)
                arcToRelative(6.25f, 6.25f, 0.0f, false, true, 12.392f, 1.275f)
                moveTo(10.5f, 7.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, false, 0.0f, 0.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.0f, -0.5f)
                moveToRelative(-1.25f, 0.25f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, -2.5f, 0.0f)
                moveToRelative(13.25f, -0.25f)
                lineTo(27.0f, 7.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-4.5f)
                close()
                moveTo(19.5f, 7.25f)
                lineTo(15.0f, 7.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.5f)
                close()
                moveTo(18.0f, 15.25f)
                arcToRelative(7.25f, 7.25f, 0.0f, true, false, 0.0f, 14.5f)
                arcToRelative(7.25f, 7.25f, 0.0f, false, false, 0.0f, -14.5f)
            }
        }
        .build()
        return _washingMachineMedium!!
    }

private var _washingMachineMedium: ImageVector? = null
