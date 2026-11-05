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

public val SBBIcons.AppIconSmall: ImageVector
    get() {
        if (_appIconSmall != null) {
            return _appIconSmall!!
        }
        _appIconSmall = Builder(name = "AppIconSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 6.36f)
                arcTo(3.36f, 3.36f, 0.0f, false, true, 6.359f, 3.0f)
                horizontalLineToRelative(11.282f)
                arcTo(3.36f, 3.36f, 0.0f, false, true, 21.0f, 6.36f)
                verticalLineToRelative(11.28f)
                arcTo(3.36f, 3.36f, 0.0f, false, true, 17.641f, 21.0f)
                lineTo(6.359f, 21.0f)
                arcTo(3.36f, 3.36f, 0.0f, false, true, 3.0f, 17.64f)
                close()
                moveTo(6.359f, 2.0f)
                arcTo(4.36f, 4.36f, 0.0f, false, false, 2.0f, 6.36f)
                verticalLineToRelative(11.28f)
                arcTo(4.36f, 4.36f, 0.0f, false, false, 6.359f, 22.0f)
                horizontalLineToRelative(11.282f)
                arcTo(4.36f, 4.36f, 0.0f, false, false, 22.0f, 17.64f)
                lineTo(22.0f, 6.36f)
                arcTo(4.36f, 4.36f, 0.0f, false, false, 17.641f, 2.0f)
                close()
                moveTo(15.616f, 11.318f)
                lineTo(13.264f, 9.0f)
                horizontalLineToRelative(1.748f)
                lineTo(18.0f, 12.0f)
                lineToRelative(-2.988f, 3.0f)
                horizontalLineToRelative(-1.748f)
                lineToRelative(2.352f, -2.302f)
                horizontalLineToRelative(-2.924f)
                lineTo(12.692f, 15.0f)
                horizontalLineToRelative(-1.383f)
                verticalLineToRelative(-2.302f)
                lineTo(8.401f, 12.698f)
                lineTo(10.753f, 15.0f)
                lineTo(9.004f, 15.0f)
                lineTo(6.0f, 12.0f)
                lineToRelative(3.004f, -3.0f)
                horizontalLineToRelative(1.749f)
                lineTo(8.4f, 11.318f)
                horizontalLineToRelative(2.908f)
                lineTo(11.308f, 9.0f)
                horizontalLineToRelative(1.383f)
                verticalLineToRelative(2.318f)
                close()
            }
        }
        .build()
        return _appIconSmall!!
    }

private var _appIconSmall: ImageVector? = null
