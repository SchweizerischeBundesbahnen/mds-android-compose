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

public val SBBIcons.LocationPinMapMedium: ImageVector
    get() {
        if (_locationPinMapMedium != null) {
            return _locationPinMapMedium!!
        }
        _locationPinMapMedium = Builder(name = "LocationPinMapMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(20.196f, 6.303f)
                lineToRelative(0.292f, 0.157f)
                lineToRelative(7.5f, 4.05f)
                lineToRelative(0.262f, 0.142f)
                lineTo(28.25f, 13.5f)
                horizontalLineToRelative(-1.0f)
                lineTo(27.25f, 11.25f)
                lineToRelative(-6.5f, -3.51f)
                lineTo(20.75f, 19.91f)
                lineToRelative(1.074f, 1.208f)
                lineToRelative(-0.748f, 0.664f)
                lineToRelative(-0.884f, -0.995f)
                lineToRelative(-7.13f, 5.704f)
                lineToRelative(-0.298f, 0.239f)
                lineToRelative(-0.309f, -0.226f)
                lineToRelative(-7.5f, -5.475f)
                lineToRelative(-0.205f, -0.15f)
                lineTo(4.75f, 6.524f)
                lineToRelative(0.792f, 0.57f)
                lineToRelative(7.192f, 5.179f)
                lineToRelative(7.204f, -5.763f)
                close()
                moveTo(19.75f, 19.86f)
                lineTo(19.75f, 7.94f)
                lineToRelative(-6.5f, 5.2f)
                verticalLineToRelative(11.92f)
                close()
                moveTo(5.75f, 8.476f)
                lineTo(12.25f, 13.156f)
                verticalLineToRelative(11.96f)
                lineToRelative(-6.5f, -4.745f)
                close()
                moveTo(22.756f, 19.783f)
                curveToRelative(0.0f, -2.468f, 1.867f, -4.532f, 4.244f, -4.532f)
                curveToRelative(2.379f, 0.0f, 4.246f, 2.063f, 4.246f, 4.532f)
                verticalLineToRelative(0.004f)
                curveToRelative(-0.007f, 0.761f, -0.231f, 1.432f, -0.56f, 2.052f)
                lineToRelative(-0.005f, 0.01f)
                lineToRelative(-0.005f, 0.01f)
                lineToRelative(-3.233f, 5.497f)
                lineToRelative(-0.43f, 0.733f)
                lineToRelative(-0.432f, -0.732f)
                lineToRelative(-3.235f, -5.498f)
                lineToRelative(-0.006f, -0.01f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, true, -0.584f, -2.049f)
                verticalLineToRelative(-0.017f)
                moveToRelative(1.0f, -0.009f)
                curveToRelative(0.022f, 0.596f, 0.185f, 1.097f, 0.455f, 1.583f)
                lineToRelative(2.801f, 4.76f)
                lineToRelative(2.796f, -4.755f)
                curveToRelative(0.271f, -0.516f, 0.432f, -1.026f, 0.438f, -1.581f)
                curveToRelative(-0.001f, -1.986f, -1.488f, -3.53f, -3.246f, -3.53f)
                curveToRelative(-1.754f, 0.0f, -3.24f, 1.54f, -3.244f, 3.523f)
                moveToRelative(2.994f, -0.274f)
                curveToRelative(0.0f, -0.133f, 0.117f, -0.25f, 0.25f, -0.25f)
                reflectiveCurveToRelative(0.25f, 0.117f, 0.25f, 0.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.242f, 0.25f)
                arcToRelative(0.263f, 0.263f, 0.0f, false, true, -0.258f, -0.25f)
                moveToRelative(0.25f, -1.25f)
                curveToRelative(-0.686f, 0.0f, -1.25f, 0.564f, -1.25f, 1.25f)
                curveToRelative(0.0f, 0.692f, 0.578f, 1.25f, 1.258f, 1.25f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, -0.008f, -2.5f)
            }
        }
        .build()
        return _locationPinMapMedium!!
    }

private var _locationPinMapMedium: ImageVector? = null
