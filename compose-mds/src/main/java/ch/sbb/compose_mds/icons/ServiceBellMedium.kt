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
                curveToRelative(-1.426f, 0.985f, -2.415f, 2.34f, -3.099f, 3.812f)
                curveToRelative(-1.36f, 2.93f, -1.547f, 6.398f, -1.547f, 8.609f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(20.502f)
                lineToRelative(-0.002f, -0.502f)
                curveToRelative(-0.007f, -2.21f, -0.192f, -5.677f, -1.551f, -8.607f)
                curveToRelative(-0.684f, -1.473f, -1.671f, -2.827f, -3.096f, -3.811f)
                curveToRelative(-1.325f, -0.916f, -3.0f, -1.493f, -5.103f, -1.571f)
                close()
                moveTo(18.0f, 10.25f)
                curveToRelative(-2.16f, 0.0f, -3.793f, 0.544f, -5.036f, 1.402f)
                curveToRelative(-1.246f, 0.86f, -2.132f, 2.057f, -2.76f, 3.41f)
                curveToRelative(-1.171f, 2.52f, -1.417f, 5.522f, -1.448f, 7.688f)
                horizontalLineToRelative(18.487f)
                curveToRelative(-0.037f, -2.167f, -0.283f, -5.168f, -1.452f, -7.688f)
                curveToRelative(-0.627f, -1.353f, -1.512f, -2.55f, -2.756f, -3.41f)
                curveToRelative(-1.242f, -0.858f, -2.873f, -1.402f, -5.035f, -1.402f)
                moveToRelative(12.0f, 18.0f)
                verticalLineToRelative(-1.0f)
                lineTo(6.0f, 27.25f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _serviceBellMedium!!
    }

private var _serviceBellMedium: ImageVector? = null
