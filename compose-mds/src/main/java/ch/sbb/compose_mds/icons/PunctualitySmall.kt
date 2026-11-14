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

public val SBBIcons.PunctualitySmall: ImageVector
    get() {
        if (_punctualitySmall != null) {
            return _punctualitySmall!!
        }
        _punctualitySmall = Builder(name = "PunctualitySmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.0f, 3.0f)
                lineTo(13.0f, 2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(0.5f)
                arcTo(7.5f, 7.5f, 0.0f, true, true, 4.0f, 12.5f)
                verticalLineToRelative(-0.494f)
                lineTo(3.0f, 12.006f)
                verticalLineToRelative(0.495f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, false, 9.0f, -8.486f)
                lineTo(12.0f, 3.0f)
                close()
                moveTo(11.407f, 16.29f)
                lineToRelative(5.0f, -7.0f)
                lineToRelative(-0.814f, -0.582f)
                lineToRelative(-4.658f, 6.52f)
                lineToRelative(-2.581f, -2.582f)
                lineToRelative(-0.708f, 0.707f)
                lineToRelative(3.417f, 3.417f)
                close()
                moveTo(10.041f, 5.126f)
                lineToRelative(-0.965f, 0.259f)
                lineToRelative(-0.26f, -0.966f)
                lineToRelative(0.967f, -0.259f)
                close()
                moveTo(7.317f, 6.255f)
                lineToRelative(0.866f, -0.5f)
                lineToRelative(-0.5f, -0.866f)
                lineToRelative(-0.866f, 0.5f)
                close()
                moveTo(6.55f, 6.843f)
                lineTo(5.843f, 7.55f)
                lineTo(5.136f, 6.843f)
                lineTo(5.843f, 6.136f)
                close()
                moveTo(4.754f, 9.183f)
                lineTo(5.254f, 8.317f)
                lineTo(4.389f, 7.817f)
                lineTo(3.889f, 8.682f)
                close()
                moveTo(4.385f, 10.076f)
                lineTo(4.126f, 11.041f)
                lineTo(3.16f, 10.783f)
                lineTo(3.42f, 9.817f)
                close()
            }
        }
        .build()
        return _punctualitySmall!!
    }

private var _punctualitySmall: ImageVector? = null
