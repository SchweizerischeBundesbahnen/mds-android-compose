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

public val SBBIcons.ArrowTurnUpMedium: ImageVector
    get() {
        if (_arrowTurnUpMedium != null) {
            return _arrowTurnUpMedium!!
        }
        _arrowTurnUpMedium = Builder(name = "ArrowTurnUpMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.25f, 15.75f)
                curveToRelative(0.0f, 4.377f, -1.308f, 7.222f, -3.342f, 8.982f)
                curveToRelative(-2.047f, 1.772f, -4.91f, 2.518f, -8.158f, 2.518f)
                verticalLineToRelative(1.0f)
                curveToRelative(3.38f, 0.0f, 6.516f, -0.774f, 8.813f, -2.762f)
                curveToRelative(2.309f, -2.0f, 3.687f, -5.155f, 3.687f, -9.738f)
                verticalLineTo(9.482f)
                lineToRelative(3.857f, 3.849f)
                lineToRelative(0.707f, -0.708f)
                lineTo(22.09f, 7.91f)
                lineToRelative(-0.353f, -0.353f)
                lineToRelative(-0.353f, 0.354f)
                lineToRelative(-4.712f, 4.713f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(3.871f, -3.872f)
                close()
            }
        }
        .build()
        return _arrowTurnUpMedium!!
    }

private var _arrowTurnUpMedium: ImageVector? = null
