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
                moveTo(26.75f, 15.003f)
                arcToRelative(8.75f, 8.75f, 0.0f, false, false, -17.5f, 0.0f)
                verticalLineToRelative(0.02f)
                curveToRelative(0.06f, 1.51f, 0.509f, 2.78f, 1.219f, 3.965f)
                lineToRelative(0.007f, 0.01f)
                lineTo(17.6f, 30.248f)
                lineToRelative(0.422f, 0.667f)
                lineToRelative(0.422f, -0.667f)
                lineToRelative(7.126f, -11.248f)
                lineToRelative(0.012f, -0.02f)
                curveToRelative(0.694f, -1.217f, 1.152f, -2.513f, 1.167f, -3.97f)
                close()
                moveTo(25.571f, 19.0f)
                lineToRelative(-0.423f, -0.268f)
                horizontalLineToRelative(0.001f)
                close()
                moveTo(10.25f, 14.984f)
                arcToRelative(7.75f, 7.75f, 0.0f, false, true, 15.5f, 0.02f)
                curveToRelative(-0.013f, 1.236f, -0.4f, 2.36f, -1.03f, 3.47f)
                lineToRelative(-6.697f, 10.57f)
                lineToRelative(-6.703f, -10.58f)
                curveToRelative(-0.593f, -0.994f, -0.969f, -2.027f, -1.056f, -3.235f)
                close()
                moveTo(17.974f, 10.351f)
                lineTo(19.764f, 15.176f)
                horizontalLineToRelative(-3.587f)
                close()
                moveTo(22.876f, 19.508f)
                lineTo(18.784f, 8.998f)
                lineTo(17.23f, 8.998f)
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
