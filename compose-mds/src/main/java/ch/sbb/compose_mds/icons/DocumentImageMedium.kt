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

public val SBBIcons.DocumentImageMedium: ImageVector
    get() {
        if (_documentImageMedium != null) {
            return _documentImageMedium!!
        }
        _documentImageMedium = Builder(name = "DocumentImageMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.25f, 6.25f)
                horizontalLineToRelative(9.707f)
                lineToRelative(0.147f, 0.147f)
                lineToRelative(7.5f, 7.5f)
                lineToRelative(0.146f, 0.146f)
                verticalLineToRelative(15.708f)
                lineTo(9.25f, 29.751f)
                lineTo(9.25f, 6.25f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(15.5f)
                verticalLineToRelative(-14.0f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(-7.5f)
                close()
                moveTo(19.25f, 7.958f)
                lineTo(25.043f, 13.751f)
                lineTo(19.25f, 13.751f)
                close()
                moveTo(16.224f, 14.092f)
                lineTo(15.714f, 12.559f)
                lineTo(15.269f, 14.112f)
                lineTo(12.269f, 24.605f)
                lineTo(12.087f, 25.242f)
                lineTo(23.89f, 25.242f)
                lineToRelative(-0.155f, -0.62f)
                lineToRelative(-1.5f, -6.008f)
                lineToRelative(-0.274f, -1.099f)
                lineToRelative(-0.627f, 0.943f)
                lineToRelative(-2.433f, 3.658f)
                close()
                moveTo(13.413f, 24.242f)
                lineTo(15.787f, 15.94f)
                lineTo(18.276f, 23.403f)
                lineTo(18.556f, 24.243f)
                close()
                moveTo(22.61f, 24.242f)
                horizontalLineToRelative(-3.923f)
                lineToRelative(0.48f, -0.72f)
                lineToRelative(2.372f, -3.567f)
                close()
            }
        }
        .build()
        return _documentImageMedium!!
    }

private var _documentImageMedium: ImageVector? = null
