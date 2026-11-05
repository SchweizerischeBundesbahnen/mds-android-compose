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

public val SBBIcons.LocationPinBMedium: ImageVector
    get() {
        if (_locationPinBMedium != null) {
            return _locationPinBMedium!!
        }
        _locationPinBMedium = Builder(
            name = "LocationPinBMedium",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveTo(18.0f, 6.262f)
                arcToRelative(8.75f, 8.75f, 0.0f, false, false, -8.75f, 8.75f)
                verticalLineToRelative(0.02f)
                curveToRelative(0.06f, 1.51f, 0.509f, 2.78f, 1.22f, 3.965f)
                lineToRelative(0.007f, 0.01f)
                lineToRelative(7.125f, 11.249f)
                lineToRelative(0.422f, 0.667f)
                lineToRelative(0.422f, -0.667f)
                lineToRelative(7.125f, -11.249f)
                lineToRelative(0.007f, -0.01f)
                lineToRelative(0.005f, -0.01f)
                curveToRelative(0.694f, -1.216f, 1.154f, -2.512f, 1.167f, -3.97f)
                verticalLineToRelative(-0.005f)
                arcTo(8.75f, 8.75f, 0.0f, false, false, 18.0f, 6.262f)
                moveToRelative(-6.675f, 12.215f)
                curveToRelative(-0.635f, -1.058f, -1.022f, -2.163f, -1.075f, -3.475f)
                arcToRelative(7.75f, 7.75f, 0.0f, false, true, 15.5f, 0.008f)
                curveToRelative(-0.011f, 1.237f, -0.398f, 2.362f, -1.03f, 3.472f)
                lineToRelative(-6.696f, 10.572f)
                close()
                moveTo(16.248f, 19.805f)
                verticalLineToRelative(-3.7f)
                horizontalLineToRelative(2.29f)
                quadToRelative(1.282f, 0.0f, 1.683f, 0.173f)
                quadToRelative(1.03f, 0.43f, 1.03f, 1.709f)
                quadToRelative(-0.001f, 1.136f, -0.764f, 1.566f)
                quadToRelative(-0.448f, 0.252f, -1.741f, 0.252f)
                close()
                moveTo(16.248f, 14.985f)
                verticalLineToRelative(-3.268f)
                horizontalLineToRelative(2.374f)
                quadToRelative(1.004f, 0.0f, 1.346f, 0.136f)
                quadToRelative(0.41f, 0.164f, 0.634f, 0.554f)
                quadToRelative(0.229f, 0.388f, 0.229f, 0.933f)
                quadToRelative(-0.001f, 0.546f, -0.263f, 0.955f)
                quadToRelative(-0.262f, 0.41f, -0.702f, 0.554f)
                quadToRelative(-0.44f, 0.136f, -1.366f, 0.136f)
                close()
                moveTo(18.804f, 10.511f)
                horizontalLineToRelative(-3.805f)
                verticalLineToRelative(10.501f)
                horizontalLineToRelative(4.394f)
                quadToRelative(1.068f, 0.0f, 1.721f, -0.38f)
                quadToRelative(1.391f, -0.821f, 1.392f, -2.695f)
                quadToRelative(0.0f, -1.429f, -0.996f, -2.176f)
                quadToRelative(-0.293f, -0.223f, -0.822f, -0.381f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, false, 1.026f, -0.876f)
                quadToRelative(0.372f, -0.596f, 0.372f, -1.365f)
                quadToRelative(0.0f, -0.725f, -0.34f, -1.34f)
                arcToRelative(2.34f, 2.34f, 0.0f, false, false, -0.923f, -0.937f)
                quadToRelative(-0.634f, -0.351f, -2.019f, -0.351f)
            }
        }
            .build()
        return _locationPinBMedium!!
    }

private var _locationPinBMedium: ImageVector? = null
