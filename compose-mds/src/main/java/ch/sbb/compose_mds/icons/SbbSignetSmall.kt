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

public val SBBIcons.SbbSignetSmall: ImageVector
    get() {
        if (_sbbSignetSmall != null) {
            return _sbbSignetSmall!!
        }
        _sbbSignetSmall = Builder(name = "SbbSignetSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(13.264f, 9.0f)
                lineToRelative(2.352f, 2.318f)
                horizontalLineToRelative(-2.924f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(-1.383f)
                verticalLineToRelative(2.318f)
                horizontalLineTo(8.401f)
                lineTo(10.753f, 9.0f)
                horizontalLineTo(9.004f)
                lineTo(6.0f, 12.0f)
                lineToRelative(3.004f, 3.0f)
                horizontalLineToRelative(1.749f)
                lineTo(8.4f, 12.698f)
                horizontalLineToRelative(2.908f)
                verticalLineTo(15.0f)
                horizontalLineToRelative(1.383f)
                verticalLineToRelative(-2.302f)
                horizontalLineToRelative(2.924f)
                lineTo(13.264f, 15.0f)
                horizontalLineToRelative(1.748f)
                lineTo(18.0f, 12.0f)
                lineToRelative(-2.988f, -3.0f)
                close()
            }
        }
        .build()
        return _sbbSignetSmall!!
    }

private var _sbbSignetSmall: ImageVector? = null
