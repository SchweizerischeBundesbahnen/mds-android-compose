package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.PaperClipMedium: ImageVector
    get() {
        if (_paperClipMedium != null) {
            return _paperClipMedium!!
        }
        _paperClipMedium = Builder(name = "PaperClipMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.75f, 6.0f)
                verticalLineToRelative(19.374f)
                lineToRelative(-0.198f, 0.15f)
                lineToRelative(-5.25f, 3.975f)
                lineToRelative(-0.302f, 0.229f)
                lineToRelative(-0.302f, -0.229f)
                lineToRelative(-5.25f, -3.976f)
                lineToRelative(-0.198f, -0.149f)
                verticalLineTo(6.25f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(14.61f)
                lineToRelative(-0.18f, 0.15f)
                lineToRelative(-2.259f, 1.875f)
                lineToRelative(-0.32f, 0.265f)
                lineToRelative(-0.32f, -0.266f)
                lineToRelative(-2.241f, -1.875f)
                lineToRelative(-0.18f, -0.15f)
                verticalLineTo(10.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(9.89f)
                lineToRelative(1.743f, 1.459f)
                lineToRelative(1.757f, -1.46f)
                verticalLineTo(7.25f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(17.626f)
                lineTo(18.0f, 28.473f)
                lineToRelative(4.75f, -3.597f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _paperClipMedium!!
    }

private var _paperClipMedium: ImageVector? = null
