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

public val SBBIcons.DoubleDeckWagonSmall: ImageVector
    get() {
        if (_doubleDeckWagonSmall != null) {
            return _doubleDeckWagonSmall!!
        }
        _doubleDeckWagonSmall = Builder(name = "DoubleDeckWagonSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.0f, 8.497f)
                horizontalLineToRelative(-0.001f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                lineToRelative(-15.003f, 0.001f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.49f, 0.4f)
                lineToRelative(-0.01f, 0.1f)
                lineToRelative(0.002f, 8.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                lineTo(20.0f, 16.998f)
                close()
                moveTo(7.999f, 16.998f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(20.999f, 17.998f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                lineTo(2.998f, 17.998f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                lineToRelative(-0.002f, -7.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, -1.5f)
                horizontalLineToRelative(15.003f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(17.999f, 18.998f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                moveToRelative(-12.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                moveToRelative(13.001f, -7.0f)
                verticalLineToRelative(-3.0f)
                lineTo(4.999f, 8.998f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(18.0f, 10.998f)
                lineTo(5.999f, 10.998f)
                verticalLineToRelative(-1.0f)
                lineTo(18.0f, 9.998f)
                close()
                moveTo(19.0f, 12.998f)
                verticalLineToRelative(3.0f)
                lineTo(9.999f, 15.998f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(10.999f, 14.998f)
                lineTo(18.0f, 14.998f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-7.001f)
                close()
            }
        }
        .build()
        return _doubleDeckWagonSmall!!
    }

private var _doubleDeckWagonSmall: ImageVector? = null
