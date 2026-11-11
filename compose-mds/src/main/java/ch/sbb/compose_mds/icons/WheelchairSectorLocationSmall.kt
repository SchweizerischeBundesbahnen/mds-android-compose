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
                moveTo(21.0f, 6.99f)
                arcToRelative(4.01f, 4.01f, 0.0f, false, false, -4.01f, -4.01f)
                arcToRelative(4.01f, 4.01f, 0.0f, false, false, -4.01f, 4.01f)
                verticalLineToRelative(0.016f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, false, 0.562f, 1.831f)
                verticalLineToRelative(0.001f)
                lineToRelative(0.006f, 0.01f)
                lineToRelative(3.03f, 4.78f)
                lineToRelative(0.422f, 0.665f)
                lineToRelative(0.423f, -0.666f)
                lineToRelative(3.03f, -4.779f)
                lineToRelative(0.014f, -0.023f)
                curveToRelative(0.307f, -0.549f, 0.521f, -1.14f, 0.533f, -1.826f)
                close()
                moveTo(13.98f, 6.973f)
                arcToRelative(3.01f, 3.01f, 0.0f, false, true, 3.01f, -2.993f)
                arcTo(3.01f, 3.01f, 0.0f, false, true, 20.0f, 6.99f)
                horizontalLineToRelative(0.001f)
                curveToRelative(-0.01f, 0.47f, -0.156f, 0.895f, -0.406f, 1.343f)
                lineTo(17.0f, 12.425f)
                lineToRelative(-2.607f, -4.113f)
                arcToRelative(2.7f, 2.7f, 0.0f, false, true, -0.4f, -1.154f)
                close()
                moveTo(16.99f, 5.98f)
                curveToRelative(0.554f, 0.0f, 1.0f, 0.446f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.446f, 1.0f, -1.0f, 1.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.446f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.446f, -1.0f, 1.0f, -1.0f)
                moveToRelative(0.0f, 3.0f)
                curveToRelative(1.106f, 0.0f, 2.0f, -0.894f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.894f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.894f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.894f, 2.0f, 2.0f, 2.0f)
                moveTo(5.493f, 10.504f)
                arcTo(4.52f, 4.52f, 0.0f, false, false, 3.02f, 14.52f)
                curveToRelative(0.0f, 2.476f, 2.023f, 4.5f, 4.5f, 4.5f)
                arcToRelative(4.53f, 4.53f, 0.0f, false, false, 4.072f, -2.586f)
                lineToRelative(-0.905f, -0.429f)
                arcTo(3.53f, 3.53f, 0.0f, false, true, 7.52f, 18.02f)
                arcToRelative(3.51f, 3.51f, 0.0f, false, true, -3.5f, -3.5f)
                arcToRelative(3.52f, 3.52f, 0.0f, false, true, 1.926f, -3.124f)
                close()
                moveTo(8.02f, 13.02f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(7.52f, 5.02f)
                curveToRelative(-0.557f, 0.0f, -1.0f, 0.444f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.443f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.444f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.444f, -1.0f, -1.0f, -1.0f)
            }
        }
        .build()
        return _wheelchairSectorLocationSmall!!
    }

private var _wheelchairSectorLocationSmall: ImageVector? = null
