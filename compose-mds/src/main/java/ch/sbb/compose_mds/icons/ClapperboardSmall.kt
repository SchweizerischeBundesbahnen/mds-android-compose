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

public val SBBIcons.ClapperboardSmall: ImageVector
    get() {
        if (_clapperboardSmall != null) {
            return _clapperboardSmall!!
        }
        _clapperboardSmall = Builder(name = "ClapperboardSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.531f, 3.0f)
                arcTo(0.531f, 0.531f, 0.0f, false, false, 3.0f, 3.531f)
                lineTo(3.0f, 6.0f)
                horizontalLineToRelative(4.691f)
                lineToRelative(1.5f, -3.0f)
                close()
                moveTo(13.691f, 6.0f)
                lineTo(8.809f, 6.0f)
                lineToRelative(1.5f, -3.0f)
                horizontalLineToRelative(4.882f)
                close()
                moveTo(16.309f, 3.0f)
                lineTo(14.809f, 6.0f)
                lineTo(21.0f, 6.0f)
                lineTo(21.0f, 3.531f)
                arcTo(0.53f, 0.53f, 0.0f, false, false, 20.469f, 3.0f)
                close()
                moveTo(2.449f, 2.448f)
                arcTo(1.53f, 1.53f, 0.0f, false, true, 3.53f, 2.0f)
                lineTo(20.47f, 2.0f)
                arcTo(1.53f, 1.53f, 0.0f, false, true, 22.0f, 3.531f)
                lineTo(22.0f, 7.0f)
                lineTo(2.0f, 7.0f)
                lineTo(2.0f, 3.531f)
                curveToRelative(0.0f, -0.406f, 0.161f, -0.795f, 0.448f, -1.083f)
                moveTo(3.0f, 21.027f)
                verticalLineToRelative(-13.0f)
                lineTo(2.0f, 8.027f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(-14.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(13.0f)
                close()
                moveTo(9.74f, 10.56f)
                lineTo(9.0f, 10.158f)
                verticalLineToRelative(7.684f)
                lineToRelative(0.74f, -0.403f)
                lineToRelative(5.5f, -3.0f)
                lineToRelative(0.804f, -0.439f)
                lineToRelative(-0.805f, -0.439f)
                close()
                moveTo(13.955f, 14.0f)
                lineTo(10.0f, 16.158f)
                verticalLineToRelative(-4.316f)
                close()
            }
        }
        .build()
        return _clapperboardSmall!!
    }

private var _clapperboardSmall: ImageVector? = null
