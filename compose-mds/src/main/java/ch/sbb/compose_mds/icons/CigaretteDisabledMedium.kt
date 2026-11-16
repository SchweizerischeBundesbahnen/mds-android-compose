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

public val SBBIcons.CigaretteDisabledMedium: ImageVector
    get() {
        if (_cigaretteDisabledMedium != null) {
            return _cigaretteDisabledMedium!!
        }
        _cigaretteDisabledMedium = Builder(name = "CigaretteDisabledMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(27.75f, 4.203f)
                curveToRelative(2.205f, 0.0f, 4.0f, 1.795f, 4.0f, 4.0f)
                curveToRelative(0.0f, 1.208f, -0.562f, 2.35f, -1.505f, 3.107f)
                lineToRelative(-0.283f, 0.227f)
                lineToRelative(0.128f, 0.339f)
                curveToRelative(0.105f, 0.278f, 0.16f, 0.573f, 0.16f, 0.874f)
                curveToRelative(0.0f, 1.378f, -1.122f, 2.5f, -2.5f, 2.5f)
                arcToRelative(2.504f, 2.504f, 0.0f, false, true, -2.5f, -2.5f)
                curveToRelative(0.0f, -0.3f, 0.055f, -0.596f, 0.16f, -0.874f)
                lineToRelative(0.128f, -0.339f)
                lineToRelative(-0.283f, -0.227f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.505f, -3.107f)
                curveToRelative(0.0f, -2.205f, 1.795f, -4.0f, 4.0f, -4.0f)
                moveToRelative(3.383f, 7.66f)
                arcToRelative(4.99f, 4.99f, 0.0f, false, false, 1.617f, -3.66f)
                curveToRelative(0.0f, -2.757f, -2.242f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.243f, -5.0f, 5.0f)
                curveToRelative(0.0f, 1.402f, 0.602f, 2.724f, 1.616f, 3.66f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -0.116f, 0.887f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                quadToRelative(-0.002f, -0.454f, -0.117f, -0.888f)
                moveToRelative(1.47f, 20.033f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-8.853f, -8.853f)
                lineTo(3.25f, 23.749f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(14.293f)
                lineTo(3.396f, 4.104f)
                lineToRelative(0.708f, -0.708f)
                close()
                moveTo(18.543f, 19.25f)
                lineToRelative(3.5f, 3.5f)
                lineTo(14.75f, 22.75f)
                verticalLineToRelative(-3.5f)
                close()
                moveTo(11.75f, 19.25f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(10.75f, 22.75f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(3.5f)
                close()
                moveTo(32.75f, 18.25f)
                verticalLineToRelative(5.5f)
                lineTo(27.0f, 23.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(-3.5f)
                lineTo(22.5f, 19.25f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(29.75f, 19.25f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _cigaretteDisabledMedium!!
    }

private var _cigaretteDisabledMedium: ImageVector? = null
