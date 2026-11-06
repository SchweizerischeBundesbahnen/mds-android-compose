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

public val SBBIcons.LocationPinAMedium: ImageVector
    get() {
        if (_locationPinAMedium != null) {
            return _locationPinAMedium!!
        }
        _locationPinAMedium = Builder(name = "LocationPinAMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.0f, 6.253f)
                arcToRelative(8.75f, 8.75f, 0.0f, false, false, -8.75f, 8.75f)
                verticalLineToRelative(0.02f)
                curveToRelative(0.06f, 1.51f, 0.509f, 2.781f, 1.219f, 3.965f)
                lineToRelative(0.006f, 0.01f)
                lineTo(17.6f, 30.248f)
                lineToRelative(0.422f, 0.667f)
                lineToRelative(0.423f, -0.667f)
                lineToRelative(7.126f, -11.248f)
                lineToRelative(0.007f, -0.01f)
                lineToRelative(0.005f, -0.01f)
                curveToRelative(0.694f, -1.217f, 1.152f, -2.513f, 1.167f, -3.97f)
                verticalLineToRelative(-0.006f)
                arcTo(8.75f, 8.75f, 0.0f, false, false, 18.0f, 6.253f)
                moveTo(11.323f, 18.47f)
                curveToRelative(-0.634f, -1.06f, -1.02f, -2.164f, -1.073f, -3.475f)
                arcToRelative(7.75f, 7.75f, 0.0f, false, true, 15.5f, 0.007f)
                curveToRelative(-0.013f, 1.237f, -0.398f, 2.362f, -1.03f, 3.472f)
                lineToRelative(-6.697f, 10.572f)
                close()
                moveTo(17.974f, 10.352f)
                lineTo(19.764f, 15.177f)
                horizontalLineToRelative(-3.587f)
                close()
                moveTo(22.876f, 19.509f)
                lineTo(18.784f, 8.999f)
                lineTo(17.23f, 8.999f)
                lineToRelative(-4.11f, 10.51f)
                horizontalLineToRelative(1.461f)
                lineToRelative(1.196f, -3.214f)
                horizontalLineToRelative(4.395f)
                lineToRelative(1.167f, 3.214f)
                close()
            }
        }
        .build()
        return _locationPinAMedium!!
    }

private var _locationPinAMedium: ImageVector? = null
