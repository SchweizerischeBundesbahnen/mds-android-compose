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

public val SBBIcons.NarcoticSmall: ImageVector
    get() {
        if (_narcoticSmall != null) {
            return _narcoticSmall!!
        }
        _narcoticSmall = Builder(name = "NarcoticSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(20.0f, 4.999f)
                lineToRelative(0.001f, -3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.0f)
                lineTo(18.0f, 4.999f)
                lineTo(18.0f, 7.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                lineTo(22.0f, 7.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(21.0f, 4.999f)
                horizontalLineToRelative(-1.0f)
                moveToRelative(-9.323f, -1.257f)
                arcToRelative(2.533f, 2.533f, 0.0f, true, true, 3.583f, 3.582f)
                lineToRelative(-3.113f, 3.113f)
                lineToRelative(-3.583f, -3.582f)
                close()
                moveTo(6.857f, 7.562f)
                lineTo(3.743f, 10.675f)
                arcToRelative(2.533f, 2.533f, 0.0f, false, false, 2.141f, 4.3f)
                lineToRelative(0.11f, -0.02f)
                arcToRelative(2.53f, 2.53f, 0.0f, false, false, 1.332f, -0.697f)
                lineToRelative(0.49f, -0.49f)
                lineToRelative(0.54f, -0.54f)
                lineToRelative(0.107f, -0.107f)
                lineToRelative(1.977f, -1.977f)
                close()
                moveTo(14.967f, 8.031f)
                lineTo(9.973f, 13.025f)
                arcTo(4.5f, 4.5f, 0.0f, true, true, 5.0f, 17.5f)
                curveToRelative(0.0f, -0.533f, 0.098f, -1.04f, 0.27f, -1.51f)
                arcToRelative(3.533f, 3.533f, 0.0f, false, true, -2.234f, -6.022f)
                lineTo(9.97f, 3.035f)
                arcToRelative(3.533f, 3.533f, 0.0f, true, true, 4.997f, 4.996f)
                moveToRelative(-6.013f, 6.013f)
                lineToRelative(-0.432f, 0.433f)
                lineToRelative(-0.488f, 0.488f)
                arcToRelative(3.512f, 3.512f, 0.0f, false, true, -1.626f, 0.926f)
                curveToRelative(-0.183f, 0.344f, -0.311f, 0.717f, -0.37f, 1.111f)
                horizontalLineToRelative(6.927f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -4.011f, -2.958f)
                moveToRelative(4.01f, 3.958f)
                lineTo(6.036f, 18.002f)
                arcToRelative(3.501f, 3.501f, 0.0f, false, false, 6.928f, 0.0f)
                moveTo(20.0f, 5.999f)
                lineTo(20.0f, 7.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(19.0f, 5.999f)
                close()
                moveTo(18.0f, 16.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.0f)
                lineTo(21.0f, 8.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _narcoticSmall!!
    }

private var _narcoticSmall: ImageVector? = null
