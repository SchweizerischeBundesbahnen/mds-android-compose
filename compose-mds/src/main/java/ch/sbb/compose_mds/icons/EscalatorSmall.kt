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

public val SBBIcons.EscalatorSmall: ImageVector
    get() {
        if (_escalatorSmall != null) {
            return _escalatorSmall!!
        }
        _escalatorSmall = Builder(name = "EscalatorSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.998f, 5.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveToRelative(-1.5f, 0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 2.999f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                moveToRelative(6.743f, 0.526f)
                arcTo(2.96f, 2.96f, 0.0f, false, true, 15.5f, 5.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.655f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.345f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-1.64f)
                lineToRelative(-6.1f, 6.973f)
                arcTo(2.96f, 2.96f, 0.0f, false, true, 8.5f, 19.5f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                curveToRelative(0.0f, -1.655f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(1.998f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.303f)
                close()
                moveTo(8.497f, 11.946f)
                lineTo(8.497f, 9.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.59f)
                close()
                moveTo(15.5f, 6.5f)
                arcToRelative(1.96f, 1.96f, 0.0f, false, false, -1.501f, 0.68f)
                lineToRelative(-0.004f, 0.003f)
                lineToRelative(-6.254f, 7.146f)
                lineToRelative(-0.15f, 0.171f)
                lineTo(4.5f, 14.5f)
                curveToRelative(-1.102f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.898f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.582f, 0.0f, 1.126f, -0.241f, 1.501f, -0.68f)
                lineToRelative(0.004f, -0.003f)
                lineToRelative(6.253f, -7.146f)
                lineToRelative(0.15f, -0.171f)
                lineTo(18.5f, 10.5f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.898f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.897f, -2.0f, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _escalatorSmall!!
    }

private var _escalatorSmall: ImageVector? = null
