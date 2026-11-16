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

public val SBBIcons.HomePowerPlugMedium: ImageVector
    get() {
        if (_homePowerPlugMedium != null) {
            return _homePowerPlugMedium!!
        }
        _homePowerPlugMedium = Builder(name = "HomePowerPlugMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(23.647f, 16.853f)
                lineToRelative(0.707f, -0.707f)
                lineTo(13.5f, 5.292f)
                lineTo(2.646f, 16.146f)
                lineToRelative(0.708f, 0.707f)
                lineToRelative(1.396f, -1.397f)
                lineTo(4.75f, 28.25f)
                horizontalLineToRelative(6.985f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(7.015f)
                verticalLineToRelative(-4.5f)
                lineTo(24.0f, 23.75f)
                curveToRelative(0.672f, 0.0f, 1.075f, 0.166f, 1.318f, 0.411f)
                curveToRelative(0.216f, 0.217f, 0.373f, 0.563f, 0.42f, 1.106f)
                lineToRelative(0.012f, 0.245f)
                verticalLineToRelative(1.521f)
                curveToRelative(0.0f, 0.376f, 0.002f, 1.018f, 0.225f, 1.572f)
                curveToRelative(0.12f, 0.297f, 0.31f, 0.591f, 0.618f, 0.81f)
                curveToRelative(0.31f, 0.22f, 0.697f, 0.335f, 1.157f, 0.335f)
                curveToRelative(0.458f, 0.0f, 0.846f, -0.11f, 1.156f, -0.327f)
                arcToRelative(1.77f, 1.77f, 0.0f, false, false, 0.623f, -0.804f)
                curveToRelative(0.174f, -0.426f, 0.212f, -0.906f, 0.22f, -1.284f)
                lineToRelative(0.001f, -0.338f)
                verticalLineToRelative(-4.782f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.0f, -3.465f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.5f)
                lineTo(31.25f, 13.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.25f)
                horizontalLineToRelative(-2.0f)
                lineTo(28.25f, 13.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.25f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(2.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.0f, 3.465f)
                verticalLineToRelative(4.788f)
                curveToRelative(0.002f, 0.426f, -0.003f, 0.886f, -0.146f, 1.24f)
                arcToRelative(0.78f, 0.78f, 0.0f, false, true, -0.269f, 0.36f)
                curveToRelative(-0.113f, 0.078f, -0.29f, 0.147f, -0.585f, 0.147f)
                curveToRelative(-0.29f, 0.0f, -0.465f, -0.07f, -0.577f, -0.15f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, -0.272f, -0.37f)
                curveToRelative(-0.145f, -0.36f, -0.15f, -0.822f, -0.151f, -1.23f)
                verticalLineToRelative(-1.512f)
                curveToRelative(-0.019f, -0.824f, -0.226f, -1.533f, -0.722f, -2.032f)
                curveToRelative(-0.498f, -0.502f, -1.203f, -0.706f, -2.028f, -0.706f)
                horizontalLineToRelative(-1.75f)
                verticalLineToRelative(-7.293f)
                close()
                moveTo(21.25f, 14.456f)
                lineTo(13.5f, 6.706f)
                lineTo(5.75f, 14.456f)
                lineTo(5.75f, 27.25f)
                horizontalLineToRelative(4.985f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(5.015f)
                close()
                moveTo(26.75f, 17.749f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, true, -5.0f, 0.0f)
                close()
            }
        }
        .build()
        return _homePowerPlugMedium!!
    }

private var _homePowerPlugMedium: ImageVector? = null
