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
                moveToRelative(4.75f, 6.524f)
                lineToRelative(0.792f, 0.57f)
                lineToRelative(7.191f, 5.178f)
                lineToRelative(7.204f, -5.762f)
                lineToRelative(0.26f, -0.207f)
                lineToRelative(0.29f, 0.157f)
                lineToRelative(7.5f, 4.05f)
                lineToRelative(0.263f, 0.142f)
                lineTo(28.25f, 13.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.252f)
                lineToRelative(-6.5f, -3.51f)
                lineTo(20.75f, 19.91f)
                lineToRelative(1.073f, 1.208f)
                lineToRelative(-0.747f, 0.664f)
                lineToRelative(-0.885f, -0.995f)
                lineToRelative(-7.128f, 5.704f)
                lineToRelative(-0.3f, 0.238f)
                lineToRelative(-0.308f, -0.225f)
                lineToRelative(0.295f, -0.404f)
                horizontalLineToRelative(-0.002f)
                lineToRelative(-0.293f, 0.404f)
                lineToRelative(-7.5f, -5.475f)
                lineToRelative(-0.205f, -0.15f)
                close()
                moveTo(19.75f, 19.86f)
                lineTo(19.75f, 7.94f)
                lineToRelative(-6.5f, 5.2f)
                lineTo(13.25f, 25.06f)
                close()
                moveTo(5.75f, 8.475f)
                lineTo(12.25f, 13.157f)
                verticalLineToRelative(11.96f)
                lineToRelative(-6.5f, -4.746f)
                close()
                moveTo(27.0f, 15.251f)
                curveToRelative(2.379f, 0.0f, 4.246f, 2.064f, 4.246f, 4.532f)
                verticalLineToRelative(0.004f)
                curveToRelative(-0.007f, 0.76f, -0.231f, 1.432f, -0.56f, 2.052f)
                lineToRelative(-0.442f, -0.235f)
                verticalLineToRelative(0.001f)
                lineToRelative(0.443f, 0.234f)
                lineToRelative(-0.006f, 0.01f)
                lineToRelative(-0.005f, 0.01f)
                lineToRelative(-3.232f, 5.497f)
                lineToRelative(-0.432f, 0.733f)
                lineToRelative(-0.43f, -0.733f)
                lineToRelative(-3.236f, -5.497f)
                lineToRelative(-0.006f, -0.01f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, true, -0.584f, -2.048f)
                verticalLineToRelative(-0.018f)
                curveToRelative(0.0f, -2.468f, 1.867f, -4.532f, 4.244f, -4.532f)
                moveToRelative(0.0f, 1.0f)
                curveToRelative(-1.751f, 0.0f, -3.235f, 1.536f, -3.244f, 3.514f)
                lineToRelative(0.015f, 0.222f)
                curveToRelative(0.049f, 0.502f, 0.201f, 0.94f, 0.436f, 1.364f)
                lineToRelative(2.804f, 4.766f)
                lineToRelative(2.799f, -4.76f)
                curveToRelative(0.27f, -0.514f, 0.43f, -1.022f, 0.436f, -1.574f)
                lineToRelative(-0.004f, -0.186f)
                curveToRelative(-0.09f, -1.896f, -1.538f, -3.346f, -3.242f, -3.346f)
                moveToRelative(0.0f, 3.0f)
                curveToRelative(0.133f, 0.0f, 0.25f, 0.116f, 0.25f, 0.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.242f, 0.25f)
                arcToRelative(0.263f, 0.263f, 0.0f, false, true, -0.258f, -0.25f)
                curveToRelative(0.0f, -0.134f, 0.117f, -0.25f, 0.25f, -0.25f)
                moveToRelative(0.008f, 1.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, -1.258f, -1.25f)
                curveToRelative(0.0f, 0.691f, 0.579f, 1.25f, 1.258f, 1.25f)
            }
        }
        .build()
        return _locationPinMapMedium!!
    }

private var _locationPinMapMedium: ImageVector? = null
