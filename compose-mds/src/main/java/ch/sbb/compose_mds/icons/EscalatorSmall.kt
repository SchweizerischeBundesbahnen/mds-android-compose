package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
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
                    pathFillType = NonZero) {
                moveTo(20.5f, 8.5f)
                curveToRelative(0.0f, -1.102f, -0.897f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(1.96f, 1.96f, 0.0f, false, false, -1.501f, 0.68f)
                lineToRelative(-0.004f, 0.004f)
                lineToRelative(-0.352f, -0.31f)
                lineToRelative(-0.024f, -0.02f)
                lineToRelative(0.376f, 0.33f)
                lineToRelative(-6.254f, 7.145f)
                lineToRelative(-0.15f, 0.171f)
                lineTo(4.5f, 14.5f)
                curveToRelative(-1.102f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.898f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(1.96f, 1.96f, 0.0f, false, false, 1.501f, -0.679f)
                lineToRelative(0.004f, -0.005f)
                lineToRelative(6.253f, -7.145f)
                lineToRelative(0.15f, -0.171f)
                lineTo(18.5f, 10.5f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.898f, 2.0f, -2.0f)
                moveTo(7.498f, 13.088f)
                lineToRelative(1.0f, -1.143f)
                lineTo(8.498f, 9.5f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(8.498f, 6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -1.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                moveTo(21.5f, 8.5f)
                curveToRelative(0.0f, 1.654f, -1.345f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-1.639f)
                lineToRelative(-6.104f, 6.976f)
                lineToRelative(-0.001f, -0.001f)
                arcTo(2.96f, 2.96f, 0.0f, false, true, 8.5f, 19.5f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                curveToRelative(0.0f, -1.655f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(1.998f)
                lineTo(6.498f, 8.499f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.304f)
                lineToRelative(3.745f, -4.279f)
                arcTo(2.96f, 2.96f, 0.0f, false, true, 15.5f, 5.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.655f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                moveTo(9.498f, 6.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.001f, -0.002f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.498f, 6.0f)
            }
        }
        .build()
        return _escalatorSmall!!
    }

private var _escalatorSmall: ImageVector? = null
