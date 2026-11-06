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

public val SBBIcons.PercentSmall: ImageVector
    get() {
        if (_percentSmall != null) {
            return _percentSmall!!
        }
        _percentSmall = Builder(name = "PercentSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.998f, 8.997f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -0.002f, 1.999f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.002f, -1.999f)
                moveToRelative(-2.0f, 1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 3.998f, -0.001f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.998f, 0.001f)
                moveTo(14.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.001f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 15.0f)
                moveToRelative(-2.0f, 1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.001f, 0.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 16.0f)
                moveToRelative(-4.146f, 1.853f)
                lineToRelative(9.0f, -9.0f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(-9.0f, 9.0f)
                close()
            }
        }
        .build()
        return _percentSmall!!
    }

private var _percentSmall: ImageVector? = null
