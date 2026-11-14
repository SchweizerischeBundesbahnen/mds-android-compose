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

public val SBBIcons.MedalSmall: ImageVector
    get() {
        if (_medalSmall != null) {
            return _medalSmall!!
        }
        _medalSmall = Builder(name = "MedalSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.962f, 3.308f)
                lineTo(9.832f, 3.0f)
                lineTo(5.73f, 3.0f)
                lineToRelative(4.2f, 9.448f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, 4.14f, 0.0f)
                lineTo(18.27f, 3.0f)
                horizontalLineToRelative(-4.103f)
                lineToRelative(-0.13f, 0.308f)
                lineTo(12.0f, 8.198f)
                close()
                moveTo(12.455f, 9.708f)
                lineTo(12.462f, 9.692f)
                lineTo(14.834f, 4.0f)
                horizontalLineToRelative(1.896f)
                lineToRelative(-3.555f, 8.0f)
                horizontalLineToRelative(-1.867f)
                lineToRelative(1.14f, -2.276f)
                close()
                moveTo(11.45f, 9.481f)
                lineTo(10.526f, 11.328f)
                lineTo(7.27f, 4.0f)
                horizontalLineToRelative(1.897f)
                close()
                moveTo(16.0f, 17.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -8.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.0f)
            }
        }
        .build()
        return _medalSmall!!
    }

private var _medalSmall: ImageVector? = null
