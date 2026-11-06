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

public val SBBIcons.WheelchairSectorLocationSmall: ImageVector
    get() {
        if (_wheelchairSectorLocationSmall != null) {
            return _wheelchairSectorLocationSmall!!
        }
        _wheelchairSectorLocationSmall = Builder(name = "WheelchairSectorLocationSmall",
                defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f,
                viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.99f, 2.98f)
                arcToRelative(4.01f, 4.01f, 0.0f, false, false, -4.01f, 4.01f)
                verticalLineToRelative(0.017f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, false, 0.563f, 1.832f)
                lineToRelative(0.005f, 0.009f)
                lineToRelative(3.03f, 4.78f)
                lineToRelative(0.422f, 0.666f)
                lineToRelative(0.423f, -0.666f)
                lineToRelative(3.03f, -4.78f)
                lineToRelative(0.007f, -0.012f)
                lineToRelative(0.007f, -0.012f)
                curveToRelative(0.307f, -0.548f, 0.522f, -1.14f, 0.533f, -1.825f)
                lineTo(21.0f, 6.99f)
                arcToRelative(4.01f, 4.01f, 0.0f, false, false, -4.01f, -4.01f)
                moveToRelative(-2.594f, 5.337f)
                arcToRelative(2.7f, 2.7f, 0.0f, false, true, -0.416f, -1.335f)
                arcToRelative(3.01f, 3.01f, 0.0f, false, true, 3.01f, -3.002f)
                arcTo(3.01f, 3.01f, 0.0f, false, true, 20.0f, 6.986f)
                curveToRelative(-0.008f, 0.468f, -0.151f, 0.892f, -0.4f, 1.338f)
                lineTo(17.0f, 12.426f)
                close()
                moveTo(15.99f, 6.98f)
                curveToRelative(0.0f, -0.554f, 0.446f, -1.0f, 1.0f, -1.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.446f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                curveToRelative(-0.554f, 0.0f, -1.0f, -0.446f, -1.0f, -1.0f)
                moveToRelative(1.0f, -2.0f)
                curveToRelative(-1.107f, 0.0f, -2.0f, 0.894f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.893f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.894f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.894f, -2.0f, -2.0f, -2.0f)
                moveToRelative(-9.471f, 0.04f)
                curveToRelative(-0.557f, 0.0f, -1.0f, 0.444f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.443f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.444f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.444f, -1.0f, -1.0f, -1.0f)
                moveToRelative(-0.5f, 3.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(5.492f, 10.504f)
                arcTo(4.52f, 4.52f, 0.0f, false, false, 3.02f, 14.52f)
                curveToRelative(0.0f, 2.476f, 2.023f, 4.5f, 4.5f, 4.5f)
                arcToRelative(4.53f, 4.53f, 0.0f, false, false, 4.071f, -2.586f)
                lineToRelative(-0.903f, -0.428f)
                arcTo(3.53f, 3.53f, 0.0f, false, true, 7.52f, 18.02f)
                arcToRelative(3.51f, 3.51f, 0.0f, false, true, -3.5f, -3.5f)
                arcToRelative(3.52f, 3.52f, 0.0f, false, true, 1.926f, -3.124f)
                close()
            }
        }
        .build()
        return _wheelchairSectorLocationSmall!!
    }

private var _wheelchairSectorLocationSmall: ImageVector? = null
