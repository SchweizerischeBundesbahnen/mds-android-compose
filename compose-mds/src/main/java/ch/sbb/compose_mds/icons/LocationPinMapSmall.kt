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

public val SBBIcons.LocationPinMapSmall: ImageVector
    get() {
        if (_locationPinMapSmall != null) {
            return _locationPinMapSmall!!
        }
        _locationPinMapSmall = Builder(name = "LocationPinMapSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(13.737f, 4.16f)
                lineToRelative(5.0f, 2.7f)
                lineToRelative(0.263f, 0.142f)
                lineTo(19.0f, 9.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(18.0f, 7.597f)
                lineToRelative(-4.0f, -2.16f)
                verticalLineToRelative(7.773f)
                lineToRelative(0.674f, 0.758f)
                lineToRelative(-0.747f, 0.664f)
                lineToRelative(-0.486f, -0.546f)
                lineToRelative(-4.629f, 3.705f)
                lineToRelative(-0.298f, 0.238f)
                lineToRelative(-0.309f, -0.225f)
                lineToRelative(-5.0f, -3.65f)
                lineToRelative(-0.205f, -0.15f)
                verticalLineToRelative(-9.98f)
                lineToRelative(0.792f, 0.57f)
                lineToRelative(4.691f, 3.378f)
                lineToRelative(4.704f, -3.762f)
                lineToRelative(0.26f, -0.207f)
                close()
                moveTo(13.0f, 13.16f)
                lineTo(13.0f, 5.64f)
                lineToRelative(-4.0f, 3.2f)
                verticalLineToRelative(7.518f)
                close()
                moveTo(4.0f, 5.975f)
                lineToRelative(4.0f, 2.88f)
                verticalLineToRelative(7.56f)
                lineToRelative(-4.0f, -2.92f)
                close()
                moveTo(18.439f, 18.321f)
                lineTo(18.009f, 19.053f)
                lineTo(17.577f, 18.321f)
                lineTo(18.008f, 18.068f)
                close()
                moveTo(20.605f, 14.636f)
                curveToRelative(0.199f, -0.376f, 0.346f, -0.785f, 0.383f, -1.244f)
                lineToRelative(0.01f, -0.2f)
                verticalLineToRelative(-0.004f)
                curveToRelative(0.0f, -1.726f, -1.309f, -3.188f, -2.998f, -3.188f)
                curveToRelative(-1.688f, 0.0f, -2.996f, 1.462f, -2.996f, 3.188f)
                verticalLineToRelative(0.017f)
                lineToRelative(0.014f, 0.203f)
                curveToRelative(0.045f, 0.463f, 0.189f, 0.866f, 0.396f, 1.238f)
                lineToRelative(0.006f, 0.01f)
                lineToRelative(2.157f, 3.665f)
                lineToRelative(0.431f, -0.254f)
                lineToRelative(0.43f, 0.254f)
                lineToRelative(2.156f, -3.665f)
                lineToRelative(0.006f, -0.01f)
                close()
                moveTo(20.605f, 14.636f)
                lineTo(20.162f, 14.402f)
                horizontalLineToRelative(0.001f)
                close()
                moveTo(18.0f, 11.001f)
                curveToRelative(-1.064f, 0.0f, -1.99f, 0.938f, -1.996f, 2.177f)
                curveToRelative(0.014f, 0.368f, 0.115f, 0.677f, 0.284f, 0.982f)
                lineToRelative(1.72f, 2.923f)
                lineToRelative(1.718f, -2.923f)
                curveToRelative(0.17f, -0.325f, 0.267f, -0.637f, 0.271f, -0.97f)
                lineToRelative(-0.01f, -0.231f)
                curveTo(19.88f, 11.83f, 19.002f, 11.0f, 18.0f, 11.0f)
                moveToRelative(1.0f, 2.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                curveToRelative(0.0f, 0.555f, 0.462f, 1.0f, 1.005f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 13.0f)
            }
        }
        .build()
        return _locationPinMapSmall!!
    }

private var _locationPinMapSmall: ImageVector? = null
