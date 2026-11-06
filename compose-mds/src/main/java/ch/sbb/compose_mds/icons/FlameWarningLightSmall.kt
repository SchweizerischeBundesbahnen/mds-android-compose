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

public val SBBIcons.FlameWarningLightSmall: ImageVector
    get() {
        if (_flameWarningLightSmall != null) {
            return _flameWarningLightSmall!!
        }
        _flameWarningLightSmall = Builder(name = "FlameWarningLightSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(7.501f, 2.193f)
                lineToRelative(0.873f, 0.973f)
                arcToRelative(125.0f, 125.0f, 0.0f, false, false, 2.444f, 2.64f)
                lineToRelative(0.002f, 0.001f)
                lineToRelative(0.423f, 0.449f)
                curveToRelative(0.798f, 0.846f, 1.482f, 1.589f, 2.15f, 2.434f)
                lineToRelative(-0.785f, 0.62f)
                curveToRelative(-0.64f, -0.81f, -1.297f, -1.525f, -2.092f, -2.368f)
                lineToRelative(-0.422f, -0.446f)
                curveToRelative(-0.49f, -0.518f, -1.031f, -1.09f, -1.643f, -1.757f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -0.478f, 2.234f)
                curveToRelative(-0.401f, 1.131f, -1.066f, 2.278f, -2.106f, 3.652f)
                curveTo(5.17f, 11.544f, 4.0f, 13.439f, 4.0f, 15.532f)
                curveToRelative(0.0f, 1.63f, 0.785f, 3.044f, 1.928f, 4.089f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -0.234f, -1.134f)
                curveToRelative(0.0f, -0.957f, 0.274f, -1.692f, 0.835f, -2.48f)
                curveToRelative(0.256f, -0.359f, 0.505f, -0.662f, 0.726f, -0.931f)
                lineToRelative(0.085f, -0.105f)
                curveToRelative(0.245f, -0.3f, 0.448f, -0.556f, 0.616f, -0.834f)
                curveToRelative(0.32f, -0.53f, 0.542f, -1.183f, 0.542f, -2.387f)
                verticalLineToRelative(-1.368f)
                lineToRelative(0.882f, 1.046f)
                curveToRelative(1.181f, 1.399f, 1.938f, 2.332f, 2.625f, 3.278f)
                lineToRelative(-0.81f, 0.588f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, -1.79f, -2.28f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -0.593f, 1.64f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.698f, 0.95f)
                lineToRelative(-0.087f, 0.107f)
                curveToRelative(-0.222f, 0.27f, -0.449f, 0.547f, -0.684f, 0.877f)
                curveToRelative(-0.459f, 0.644f, -0.65f, 1.181f, -0.65f, 1.9f)
                curveToRelative(0.0f, 0.454f, 0.196f, 0.937f, 0.518f, 1.412f)
                curveToRelative(0.319f, 0.472f, 0.736f, 0.896f, 1.115f, 1.22f)
                lineTo(8.0f, 21.5f)
                lineToRelative(-0.187f, 0.464f)
                curveTo(5.351f, 20.973f, 3.0f, 18.65f, 3.0f, 15.532f)
                curveToRelative(0.0f, -2.427f, 1.335f, -4.54f, 2.07f, -5.51f)
                curveToRelative(1.004f, -1.328f, 1.606f, -2.383f, 1.96f, -3.383f)
                curveToRelative(0.353f, -0.996f, 0.471f, -1.965f, 0.471f, -3.139f)
                close()
                moveTo(16.5f, 12.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(13.184f, 10.502f)
                lineTo(14.184f, 12.252f)
                lineTo(13.316f, 12.748f)
                lineTo(12.316f, 10.998f)
                close()
                moveTo(12.0f, 19.0f)
                horizontalLineToRelative(-0.39f)
                lineToRelative(-0.095f, 0.379f)
                lineToRelative(-0.5f, 2.0f)
                lineToRelative(-0.155f, 0.621f)
                horizontalLineToRelative(10.28f)
                lineToRelative(-0.155f, -0.621f)
                lineToRelative(-0.5f, -2.0f)
                lineTo(20.39f, 19.0f)
                lineTo(19.0f, 19.0f)
                verticalLineToRelative(-3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -6.0f, 0.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(18.0f, 16.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                moveToRelative(-5.86f, 5.0f)
                lineToRelative(0.25f, -1.0f)
                horizontalLineToRelative(7.22f)
                lineToRelative(0.25f, 1.0f)
                close()
                moveTo(18.684f, 12.748f)
                lineTo(19.684f, 10.998f)
                lineTo(18.816f, 10.502f)
                lineTo(17.816f, 12.252f)
                close()
            }
        }
        .build()
        return _flameWarningLightSmall!!
    }

private var _flameWarningLightSmall: ImageVector? = null
