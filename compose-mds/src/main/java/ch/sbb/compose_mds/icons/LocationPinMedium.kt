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

public val SBBIcons.LocationPinMedium: ImageVector
    get() {
        if (_locationPinMedium != null) {
            return _locationPinMedium!!
        }
        _locationPinMedium = Builder(name = "LocationPinMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(26.727f, 13.522f)
                arcToRelative(8.75f, 8.75f, 0.0f, false, false, -17.5f, 0.0f)
                verticalLineToRelative(0.019f)
                curveToRelative(0.059f, 1.51f, 0.508f, 2.78f, 1.22f, 3.966f)
                lineToRelative(0.006f, 0.01f)
                lineToRelative(7.125f, 11.248f)
                lineToRelative(0.423f, 0.667f)
                lineToRelative(0.422f, -0.667f)
                lineToRelative(7.125f, -11.247f)
                lineToRelative(0.012f, -0.02f)
                curveToRelative(0.693f, -1.216f, 1.154f, -2.512f, 1.167f, -3.972f)
                close()
                moveTo(25.547f, 17.518f)
                lineTo(25.133f, 17.255f)
                lineTo(25.138f, 17.257f)
                close()
                moveTo(10.227f, 13.502f)
                arcToRelative(7.75f, 7.75f, 0.0f, false, true, 15.5f, 0.02f)
                curveToRelative(-0.012f, 1.236f, -0.399f, 2.358f, -1.029f, 3.466f)
                lineTo(18.0f, 27.563f)
                lineToRelative(-6.695f, -10.57f)
                curveToRelative(-0.599f, -0.998f, -0.977f, -2.034f, -1.065f, -3.246f)
                close()
                moveTo(17.988f, 8.76f)
                arcToRelative(4.75f, 4.75f, 0.0f, true, true, 0.0f, 9.5f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, true, 0.0f, -9.5f)
                moveToRelative(0.0f, 10.5f)
                arcToRelative(5.75f, 5.75f, 0.0f, true, false, 0.0f, -11.5f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, false, 0.0f, 11.5f)
            }
        }
        .build()
        return _locationPinMedium!!
    }

private var _locationPinMedium: ImageVector? = null
