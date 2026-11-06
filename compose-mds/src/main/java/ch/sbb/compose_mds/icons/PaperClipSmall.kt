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

public val SBBIcons.PaperClipSmall: ImageVector
    get() {
        if (_paperClipSmall != null) {
            return _paperClipSmall!!
        }
        _paperClipSmall = Builder(name = "PaperClipSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 4.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(9.985f)
                lineToRelative(-0.18f, 0.15f)
                lineToRelative(-1.505f, 1.25f)
                lineToRelative(-0.321f, 0.266f)
                lineToRelative(-0.32f, -0.267f)
                lineToRelative(-1.495f, -1.25f)
                lineToRelative(-0.179f, -0.15f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(6.516f)
                lineToRelative(0.996f, 0.833f)
                lineTo(13.0f, 13.515f)
                verticalLineTo(5.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(11.501f)
                lineToRelative(3.0f, 2.272f)
                lineToRelative(3.0f, -2.272f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(12.999f)
                lineToRelative(-0.198f, 0.15f)
                lineToRelative(-3.5f, 2.65f)
                lineToRelative(-0.302f, 0.228f)
                lineToRelative(-0.302f, -0.228f)
                lineToRelative(-3.5f, -2.65f)
                lineToRelative(-0.198f, -0.15f)
                verticalLineTo(4.0f)
            }
        }
        .build()
        return _paperClipSmall!!
    }

private var _paperClipSmall: ImageVector? = null
