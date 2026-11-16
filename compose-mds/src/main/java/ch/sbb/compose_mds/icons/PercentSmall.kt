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
                moveTo(10.998f, 9.997f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                moveTo(15.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.001f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 16.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                moveToRelative(-8.146f, 1.853f)
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
