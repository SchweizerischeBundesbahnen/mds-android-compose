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

public val SBBIcons.EntranceSmall: ImageVector
    get() {
        if (_entranceSmall != null) {
            return _entranceSmall!!
        }
        _entranceSmall = Builder(name = "EntranceSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.0f, 7.0f)
                lineTo(16.0f, 4.0f)
                lineTo(3.0f, 4.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 19.0f)
                lineTo(4.0f, 5.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(11.005f, 9.704f)
                lineTo(8.714f, 12.0f)
                lineTo(21.01f, 12.0f)
                verticalLineToRelative(1.0f)
                lineTo(8.717f, 13.0f)
                lineToRelative(2.287f, 2.287f)
                lineToRelative(-0.707f, 0.707f)
                lineTo(6.803f, 12.5f)
                lineToRelative(0.353f, -0.353f)
                lineToRelative(3.141f, -3.15f)
                close()
            }
        }
        .build()
        return _entranceSmall!!
    }

private var _entranceSmall: ImageVector? = null
