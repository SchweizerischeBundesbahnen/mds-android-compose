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

public val SBBIcons.LocationPinSmall: ImageVector
    get() {
        if (_locationPinSmall != null) {
            return _locationPinSmall!!
        }
        _locationPinSmall = Builder(name = "LocationPinSmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.984f, 3.014f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(0.02f)
                curveToRelative(0.042f, 1.04f, 0.351f, 1.913f, 0.838f, 2.724f)
                lineToRelative(0.006f, 0.01f)
                lineToRelative(4.75f, 7.498f)
                lineToRelative(0.422f, 0.667f)
                lineToRelative(0.423f, -0.667f)
                lineToRelative(4.75f, -7.498f)
                lineToRelative(0.006f, -0.01f)
                lineToRelative(0.006f, -0.01f)
                curveToRelative(0.472f, -0.828f, 0.79f, -1.72f, 0.8f, -2.73f)
                verticalLineToRelative(-0.004f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                moveToRelative(-4.308f, 8.224f)
                curveToRelative(-0.41f, -0.685f, -0.657f, -1.393f, -0.692f, -2.233f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 10.0f, 0.007f)
                curveToRelative(-0.007f, 0.788f, -0.252f, 1.509f, -0.662f, 2.23f)
                lineTo(12.0f, 18.065f)
                close()
                moveTo(8.993f, 9.007f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -6.0f, 0.0f)
                moveToRelative(3.0f, -4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
            }
        }
        .build()
        return _locationPinSmall!!
    }

private var _locationPinSmall: ImageVector? = null
