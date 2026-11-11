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

public val SBBIcons.LocationPinSurroundingAreaMedium: ImageVector
    get() {
        if (_locationPinSurroundingAreaMedium != null) {
            return _locationPinSurroundingAreaMedium!!
        }
        _locationPinSurroundingAreaMedium = Builder(name = "LocationPinSurroundingAreaMedium",
                defaultWidth = 36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f,
                viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.0f, 3.272f)
                arcToRelative(8.75f, 8.75f, 0.0f, false, true, 8.75f, 8.75f)
                verticalLineToRelative(0.005f)
                curveToRelative(-0.013f, 1.46f, -0.474f, 2.755f, -1.167f, 3.972f)
                lineToRelative(-0.012f, 0.02f)
                lineToRelative(-0.41f, -0.262f)
                lineToRelative(-0.005f, -0.002f)
                lineToRelative(0.415f, 0.263f)
                lineToRelative(-7.125f, 11.247f)
                lineToRelative(-0.422f, 0.667f)
                lineToRelative(-0.423f, -0.667f)
                lineToRelative(-7.125f, -11.247f)
                lineToRelative(-0.005f, -0.01f)
                lineToRelative(-0.255f, -0.448f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.966f, -3.519f)
                verticalLineToRelative(-0.019f)
                arcTo(8.75f, 8.75f, 0.0f, false, true, 18.0f, 3.272f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(7.75f, 7.75f, 0.0f, false, false, -7.75f, 7.73f)
                lineToRelative(0.014f, 0.246f)
                curveToRelative(0.087f, 1.207f, 0.462f, 2.242f, 1.057f, 3.235f)
                lineToRelative(6.702f, 10.58f)
                lineToRelative(6.699f, -10.574f)
                curveToRelative(0.63f, -1.109f, 1.016f, -2.23f, 1.028f, -3.467f)
                arcTo(7.75f, 7.75f, 0.0f, false, false, 18.0f, 4.272f)
                moveToRelative(4.762f, 7.738f)
                arcToRelative(4.75f, 4.75f, 0.0f, true, false, -9.5f, 0.0f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, false, 9.5f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(5.75f, 5.75f, 0.0f, true, true, -11.5f, 0.0f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, true, 11.5f, 0.0f)
                moveTo(4.102f, 25.998f)
                curveToRelative(-0.513f, 0.495f, -0.852f, 1.085f, -0.852f, 1.752f)
                curveToRelative(0.0f, 0.847f, 0.543f, 1.567f, 1.315f, 2.144f)
                curveToRelative(0.78f, 0.584f, 1.88f, 1.09f, 3.195f, 1.507f)
                curveToRelative(2.636f, 0.836f, 6.252f, 1.348f, 10.24f, 1.348f)
                reflectiveCurveToRelative(7.604f, -0.512f, 10.24f, -1.348f)
                curveToRelative(1.315f, -0.417f, 2.413f, -0.924f, 3.194f, -1.508f)
                curveToRelative(0.771f, -0.577f, 1.315f, -1.296f, 1.315f, -2.143f)
                curveToRelative(0.0f, -0.662f, -0.334f, -1.247f, -0.84f, -1.74f)
                reflectiveCurveToRelative(-1.218f, -0.93f, -2.073f, -1.311f)
                curveToRelative(-1.711f, -0.764f, -4.098f, -1.347f, -6.856f, -1.668f)
                lineToRelative(-0.115f, 0.993f)
                curveToRelative(2.699f, 0.314f, 4.977f, 0.88f, 6.564f, 1.588f)
                curveToRelative(0.795f, 0.354f, 1.391f, 0.734f, 1.781f, 1.114f)
                reflectiveCurveToRelative(0.54f, 0.723f, 0.54f, 1.024f)
                curveToRelative(0.0f, 0.385f, -0.25f, 0.845f, -0.916f, 1.343f)
                curveToRelative(-0.656f, 0.491f, -1.638f, 0.955f, -2.897f, 1.355f)
                curveToRelative(-2.514f, 0.797f, -6.023f, 1.302f, -9.937f, 1.302f)
                curveToRelative(-3.915f, 0.0f, -7.424f, -0.505f, -9.938f, -1.302f)
                curveToRelative(-1.26f, -0.4f, -2.241f, -0.864f, -2.897f, -1.355f)
                curveToRelative(-0.666f, -0.498f, -0.915f, -0.958f, -0.915f, -1.343f)
                curveToRelative(0.0f, -0.304f, 0.152f, -0.65f, 0.547f, -1.033f)
                curveToRelative(0.397f, -0.383f, 1.002f, -0.766f, 1.809f, -1.122f)
                curveToRelative(1.61f, -0.711f, 3.92f, -1.276f, 6.652f, -1.586f)
                lineToRelative(-0.112f, -0.994f)
                curveToRelative(-2.791f, 0.316f, -5.208f, 0.9f, -6.943f, 1.666f)
                curveToRelative(-0.866f, 0.383f, -1.588f, 0.821f, -2.101f, 1.317f)
            }
        }
        .build()
        return _locationPinSurroundingAreaMedium!!
    }

private var _locationPinSurroundingAreaMedium: ImageVector? = null
