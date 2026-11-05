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

public val SBBIcons.CarProfileRoofSmall: ImageVector
    get() {
        if (_carProfileRoofSmall != null) {
            return _carProfileRoofSmall!!
        }
        _carProfileRoofSmall = Builder(name = "CarProfileRoofSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.085f, 13.0f)
                curveToRelative(0.323f, 0.0f, 0.626f, 0.135f, 0.846f, 0.365f)
                lineToRelative(2.387f, 2.498f)
                lineToRelative(1.495f, 0.002f)
                horizontalLineToRelative(0.02f)
                curveToRelative(0.195f, 0.008f, 0.472f, 0.075f, 0.712f, 0.258f)
                curveToRelative(0.262f, 0.2f, 0.454f, 0.522f, 0.454f, 0.958f)
                lineTo(19.0f, 19.943f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-2.118f)
                curveToRelative(-0.212f, 0.813f, -0.924f, 1.432f, -1.803f, 1.432f)
                curveToRelative(-0.88f, 0.0f, -1.591f, -0.619f, -1.803f, -1.432f)
                lineTo(10.04f, 20.443f)
                curveToRelative(-0.211f, 0.813f, -0.924f, 1.432f, -1.803f, 1.432f)
                reflectiveCurveToRelative(-1.592f, -0.619f, -1.803f, -1.432f)
                lineTo(5.0f, 20.443f)
                verticalLineToRelative(-3.81f)
                curveToRelative(0.0f, -0.288f, 0.1f, -0.57f, 0.286f, -0.792f)
                lineToRelative(2.02f, -2.417f)
                lineToRelative(0.089f, -0.094f)
                curveToRelative(0.215f, -0.208f, 0.504f, -0.33f, 0.81f, -0.33f)
                close()
                moveTo(8.237f, 19.012f)
                curveToRelative(-0.458f, 0.0f, -0.869f, 0.395f, -0.869f, 0.931f)
                reflectiveCurveToRelative(0.411f, 0.932f, 0.87f, 0.932f)
                curveToRelative(0.457f, 0.0f, 0.867f, -0.396f, 0.867f, -0.932f)
                curveToRelative(0.0f, -0.535f, -0.41f, -0.931f, -0.868f, -0.931f)
                moveToRelative(6.842f, 0.0f)
                curveToRelative(-0.458f, 0.0f, -0.868f, 0.395f, -0.868f, 0.931f)
                reflectiveCurveToRelative(0.41f, 0.932f, 0.868f, 0.932f)
                reflectiveCurveToRelative(0.868f, -0.396f, 0.868f, -0.932f)
                curveToRelative(0.0f, -0.535f, -0.41f, -0.931f, -0.868f, -0.931f)
                moveTo(6.0f, 19.443f)
                horizontalLineToRelative(0.434f)
                curveToRelative(0.211f, -0.812f, 0.924f, -1.431f, 1.803f, -1.431f)
                curveToRelative(0.88f, 0.0f, 1.592f, 0.619f, 1.803f, 1.431f)
                horizontalLineToRelative(3.236f)
                curveToRelative(0.212f, -0.812f, 0.924f, -1.431f, 1.803f, -1.431f)
                curveToRelative(0.88f, 0.0f, 1.591f, 0.619f, 1.803f, 1.431f)
                lineTo(18.0f, 19.443f)
                lineToRelative(-0.001f, -2.362f)
                arcToRelative(0.26f, 0.26f, 0.0f, false, false, -0.022f, -0.118f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, false, -0.038f, -0.045f)
                arcToRelative(0.276f, 0.276f, 0.0f, false, false, -0.146f, -0.053f)
                lineToRelative(-1.688f, -0.002f)
                lineTo(6.0f, 16.863f)
                close()
                moveTo(8.205f, 14.0f)
                arcToRelative(0.17f, 0.17f, 0.0f, false, false, -0.132f, 0.065f)
                lineTo(6.57f, 15.863f)
                horizontalLineToRelative(3.22f)
                lineTo(9.79f, 14.0f)
                close()
                moveTo(10.789f, 15.863f)
                horizontalLineToRelative(4.147f)
                lineToRelative(-1.729f, -1.807f)
                arcToRelative(0.17f, 0.17f, 0.0f, false, false, -0.122f, -0.056f)
                horizontalLineToRelative(-2.296f)
                close()
                moveTo(16.277f, 7.584f)
                lineTo(22.277f, 11.584f)
                lineTo(21.723f, 12.416f)
                lineTo(15.915f, 8.544f)
                lineTo(2.138f, 12.48f)
                lineToRelative(-0.276f, -0.96f)
                lineToRelative(14.0f, -4.0f)
                lineToRelative(0.223f, -0.064f)
                close()
            }
        }
        .build()
        return _carProfileRoofSmall!!
    }

private var _carProfileRoofSmall: ImageVector? = null
