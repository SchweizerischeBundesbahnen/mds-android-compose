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

public val SBBIcons.CigaretteSmall: ImageVector
    get() {
        if (_cigaretteSmall != null) {
            return _cigaretteSmall!!
        }
        _cigaretteSmall = Builder(name = "CigaretteSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.5f, 2.969f)
                curveToRelative(1.378f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                curveToRelative(0.0f, 0.753f, -0.35f, 1.468f, -0.94f, 1.941f)
                lineToRelative(-0.284f, 0.227f)
                lineToRelative(0.128f, 0.34f)
                quadTo(20.0f, 8.228f, 20.0f, 8.5f)
                curveToRelative(0.0f, 0.826f, -0.674f, 1.5f, -1.5f, 1.5f)
                arcToRelative(1.503f, 1.503f, 0.0f, false, true, -1.404f, -2.023f)
                lineToRelative(0.128f, -0.34f)
                lineToRelative(-0.284f, -0.227f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 16.0f, 5.47f)
                curveToRelative(0.0f, -1.378f, 1.122f, -2.5f, 2.5f, -2.5f)
                moveToRelative(2.439f, 4.994f)
                arcTo(3.49f, 3.49f, 0.0f, false, false, 22.0f, 5.469f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                curveToRelative(0.0f, 0.949f, 0.394f, 1.844f, 1.06f, 2.494f)
                quadToRelative(-0.058f, 0.263f, -0.06f, 0.537f)
                curveToRelative(0.0f, 1.379f, 1.121f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveTo(21.0f, 9.879f, 21.0f, 8.5f)
                curveToRelative(0.0f, -0.182f, -0.023f, -0.362f, -0.061f, -0.537f)
                moveTo(22.0f, 12.0f)
                verticalLineToRelative(4.0f)
                lineTo(2.0f, 16.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(3.0f, 15.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                lineTo(3.0f, 13.0f)
                close()
                moveTo(8.0f, 13.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(10.0f, 13.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-9.0f)
                close()
                moveTo(21.0f, 13.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _cigaretteSmall!!
    }

private var _cigaretteSmall: ImageVector? = null
