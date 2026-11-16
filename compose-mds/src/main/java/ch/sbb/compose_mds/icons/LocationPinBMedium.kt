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
        _locationPinBMedium = Builder(name = "LocationPinBMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(26.75f, 15.012f)
                arcToRelative(8.75f, 8.75f, 0.0f, false, false, -17.5f, 0.0f)
                verticalLineToRelative(0.02f)
                curveToRelative(0.06f, 1.51f, 0.51f, 2.781f, 1.22f, 3.966f)
                lineToRelative(0.007f, 0.01f)
                lineToRelative(7.125f, 11.247f)
                lineToRelative(0.422f, 0.667f)
                lineToRelative(0.422f, -0.667f)
                lineToRelative(7.125f, -11.248f)
                lineToRelative(0.012f, -0.02f)
                curveToRelative(0.694f, -1.216f, 1.154f, -2.512f, 1.167f, -3.97f)
                close()
                moveTo(25.571f, 19.007f)
                lineTo(25.148f, 18.74f)
                horizontalLineToRelative(0.001f)
                close()
                moveTo(10.25f, 14.993f)
                arcToRelative(7.75f, 7.75f, 0.0f, false, true, 15.5f, 0.02f)
                curveToRelative(-0.012f, 1.236f, -0.4f, 2.36f, -1.032f, 3.47f)
                lineToRelative(-6.695f, 10.57f)
                lineToRelative(-6.702f, -10.58f)
                curveToRelative(-0.595f, -0.994f, -0.97f, -2.028f, -1.057f, -3.235f)
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
