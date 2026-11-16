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

public val SBBIcons.WagonSmall: ImageVector
    get() {
        if (_wagonSmall != null) {
            return _wagonSmall!!
        }
        _wagonSmall = Builder(name = "WagonSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.0f, 11.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                lineToRelative(-15.003f, 0.001f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.49f, 0.4f)
                lineToRelative(-0.01f, 0.1f)
                lineTo(4.0f, 17.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(11.0f)
                close()
                moveTo(8.0f, 17.0f)
                lineTo(6.0f, 17.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(16.0f, 18.0f)
                lineTo(8.0f, 18.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                lineTo(3.0f, 18.0f)
                verticalLineToRelative(-1.0f)
                lineTo(2.0f, 17.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                lineToRelative(-0.003f, -4.499f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, -1.5f)
                lineTo(19.5f, 10.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                lineTo(21.0f, 16.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                close()
                moveTo(6.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                moveTo(19.0f, 16.0f)
                verticalLineToRelative(-3.0f)
                lineTo(10.0f, 13.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(18.0f, 15.0f)
                lineTo(11.0f, 15.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(7.001f)
                close()
            }
        }
        .build()
        return _wagonSmall!!
    }

private var _wagonSmall: ImageVector? = null
