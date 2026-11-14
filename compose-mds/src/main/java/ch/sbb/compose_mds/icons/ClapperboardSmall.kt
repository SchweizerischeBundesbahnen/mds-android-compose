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
                moveTo(21.0f, 3.531f)
                arcTo(0.53f, 0.53f, 0.0f, false, false, 20.469f, 3.0f)
                horizontalLineToRelative(-4.16f)
                lineToRelative(-1.5f, 3.0f)
                lineTo(21.0f, 6.0f)
                close()
                moveTo(13.69f, 6.0f)
                lineTo(8.81f, 6.0f)
                lineToRelative(1.5f, -3.0f)
                horizontalLineToRelative(4.88f)
                close()
                moveTo(3.0f, 6.0f)
                horizontalLineToRelative(4.69f)
                lineToRelative(1.5f, -3.0f)
                lineTo(3.532f, 3.0f)
                arcTo(0.53f, 0.53f, 0.0f, false, false, 3.0f, 3.531f)
                close()
                moveTo(22.0f, 7.0f)
                lineTo(2.0f, 7.0f)
                lineTo(2.0f, 3.531f)
                arcTo(1.53f, 1.53f, 0.0f, false, true, 3.531f, 2.0f)
                lineTo(20.47f, 2.0f)
                arcTo(1.53f, 1.53f, 0.0f, false, true, 22.0f, 3.531f)
                close()
                moveTo(3.0f, 8.027f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-13.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(14.0f)
                lineTo(2.0f, 22.027f)
                verticalLineToRelative(-14.0f)
                close()
                moveTo(15.24f, 13.562f)
                lineTo(9.74f, 10.562f)
                lineTo(9.0f, 10.158f)
                verticalLineToRelative(7.684f)
                lineToRelative(0.74f, -0.403f)
                lineToRelative(5.5f, -3.0f)
                lineToRelative(0.804f, -0.439f)
                close()
                moveTo(13.955f, 14.0f)
                lineTo(10.0f, 16.158f)
                verticalLineToRelative(-4.317f)
                close()
            }
        }
        .build()
        return _clapperboardSmall!!
    }

private var _clapperboardSmall: ImageVector? = null
