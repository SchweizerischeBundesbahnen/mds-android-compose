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

public val SBBIcons.ServiceBellMedium: ImageVector
    get() {
        if (_serviceBellMedium != null) {
            return _serviceBellMedium!!
        }
        _serviceBellMedium = Builder(name = "ServiceBellMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.5f, 7.25f)
                horizontalLineToRelative(3.97f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.03f)
                verticalLineToRelative(2.009f)
                curveToRelative(-2.102f, 0.079f, -3.778f, 0.655f, -5.104f, 1.57f)
                curveToRelative(-1.426f, 0.985f, -2.415f, 2.339f, -3.1f, 3.812f)
                curveToRelative(-1.36f, 2.93f, -1.546f, 6.398f, -1.546f, 8.609f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(20.502f)
                lineToRelative(-0.002f, -0.502f)
                curveToRelative(-0.007f, -2.209f, -0.193f, -5.677f, -1.552f, -8.607f)
                curveToRelative(-0.683f, -1.473f, -1.67f, -2.827f, -3.095f, -3.812f)
                curveToRelative(-1.325f, -0.915f, -3.0f, -1.492f, -5.103f, -1.57f)
                close()
                moveTo(8.754f, 22.75f)
                horizontalLineToRelative(18.491f)
                curveToRelative(-0.036f, -2.167f, -0.285f, -5.168f, -1.454f, -7.688f)
                curveToRelative(-0.627f, -1.353f, -1.512f, -2.55f, -2.757f, -3.41f)
                curveToRelative(-1.24f, -0.857f, -2.872f, -1.402f, -5.034f, -1.402f)
                reflectiveCurveToRelative(-3.793f, 0.545f, -5.036f, 1.402f)
                curveToRelative(-1.246f, 0.86f, -2.132f, 2.057f, -2.76f, 3.41f)
                curveToRelative(-1.171f, 2.52f, -1.42f, 5.522f, -1.45f, 7.688f)
                moveTo(30.0f, 27.25f)
                lineTo(6.0f, 27.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(24.0f)
                close()
            }
        }
        .build()
        return _serviceBellMedium!!
    }

private var _serviceBellMedium: ImageVector? = null
