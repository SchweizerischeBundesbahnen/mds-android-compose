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
                moveTo(17.75f, 8.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                moveToRelative(1.0f, -2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.723f, 3.016f)
                lineToRelative(-7.761f, 7.76f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, 3.446f)
                lineToRelative(7.76f, 7.762f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 3.446f, 0.0f)
                lineToRelative(7.762f, -7.761f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -3.446f)
                lineToRelative(-7.76f, -7.761f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 18.75f, 6.25f)
                moveToRelative(8.563f, 13.0f)
                horizontalLineToRelative(-5.098f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -2.966f, 2.965f)
                verticalLineToRelative(5.098f)
                quadToRelative(0.277f, 0.072f, 0.517f, 0.214f)
                lineToRelative(7.76f, -7.761f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.213f, -0.516f)
                moveToRelative(0.0f, -1.0f)
                horizontalLineToRelative(-5.098f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -2.965f, -2.965f)
                verticalLineToRelative(-5.098f)
                quadToRelative(0.276f, -0.072f, 0.516f, -0.214f)
                lineToRelative(7.76f, 7.761f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.213f, 0.516f)
                moveToRelative(-12.028f, 1.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 2.964f, 2.965f)
                verticalLineToRelative(5.098f)
                quadToRelative(-0.276f, 0.072f, -0.515f, 0.214f)
                lineToRelative(-7.76f, -7.761f)
                quadToRelative(0.141f, -0.24f, 0.213f, -0.517f)
                close()
                moveTo(10.187f, 18.25f)
                horizontalLineToRelative(5.099f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 2.964f, -2.965f)
                verticalLineToRelative(-5.098f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.516f, -0.214f)
                lineToRelative(-7.761f, 7.76f)
                quadToRelative(0.142f, 0.24f, 0.214f, 0.516f)
                moveToRelative(8.563f, -2.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -5.0f)
                moveToRelative(10.5f, 1.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(-11.5f, 11.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                moveToRelative(-9.5f, -11.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
            }
        }
        .build()
        return _fiveCirclesInterconnectedMedium!!
    }

private var _fiveCirclesInterconnectedMedium: ImageVector? = null
