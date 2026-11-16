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

public val SBBIcons.FiveCirclesInterconnectedMedium: ImageVector
    get() {
        if (_fiveCirclesInterconnectedMedium != null) {
            return _fiveCirclesInterconnectedMedium!!
        }
        _fiveCirclesInterconnectedMedium = Builder(name = "FiveCirclesInterconnectedMedium",
                defaultWidth = 36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f,
                viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.75f, 7.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                moveToRelative(0.5f, 8.035f)
                verticalLineToRelative(-5.098f)
                quadToRelative(0.276f, -0.072f, 0.516f, -0.214f)
                lineToRelative(7.76f, 7.761f)
                quadToRelative(-0.141f, 0.24f, -0.213f, 0.516f)
                horizontalLineToRelative(-5.098f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -2.965f, -2.965f)
                moveToRelative(2.965f, 3.965f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -2.966f, 2.965f)
                verticalLineToRelative(5.098f)
                quadToRelative(0.277f, 0.072f, 0.517f, 0.214f)
                lineToRelative(7.76f, -7.761f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.213f, -0.516f)
                close()
                moveTo(18.249f, 22.215f)
                verticalLineToRelative(5.098f)
                quadToRelative(-0.276f, 0.072f, -0.515f, 0.214f)
                lineToRelative(-7.76f, -7.761f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.213f, -0.517f)
                horizontalLineToRelative(5.098f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 2.964f, 2.966f)
                moveToRelative(-2.963f, -3.966f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 2.964f, -2.964f)
                verticalLineToRelative(-5.098f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.516f, -0.214f)
                lineToRelative(-7.76f, 7.761f)
                quadToRelative(0.141f, 0.24f, 0.213f, 0.515f)
                close()
                moveTo(20.473f, 28.234f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -3.446f, 0.0f)
                lineToRelative(-7.761f, -7.76f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.0f, -3.446f)
                lineToRelative(7.76f, -7.762f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 3.446f, 0.0f)
                lineToRelative(7.762f, 7.76f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.0f, 3.446f)
                close()
                moveTo(21.25f, 18.75f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, -5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 5.0f, 0.0f)
                moveToRelative(9.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                moveToRelative(-11.5f, 9.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                moveToRelative(-9.5f, -9.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
            }
        }
        .build()
        return _fiveCirclesInterconnectedMedium!!
    }

private var _fiveCirclesInterconnectedMedium: ImageVector? = null
