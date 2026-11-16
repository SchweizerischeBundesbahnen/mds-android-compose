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
                moveToRelative(18.957f, 6.25f)
                lineToRelative(7.793f, 7.794f)
                lineTo(26.75f, 29.75f)
                lineTo(9.25f, 29.75f)
                lineTo(9.25f, 6.25f)
                close()
                moveTo(10.25f, 28.75f)
                horizontalLineToRelative(15.5f)
                verticalLineToRelative(-14.0f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(-8.0f)
                close()
                moveTo(19.25f, 7.958f)
                lineTo(25.043f, 13.751f)
                lineTo(19.25f, 13.751f)
                close()
                moveTo(18.9f, 22.116f)
                lineTo(16.225f, 14.092f)
                lineTo(15.713f, 12.559f)
                lineTo(15.27f, 14.112f)
                lineTo(12.27f, 24.605f)
                lineTo(12.087f, 25.242f)
                lineTo(23.89f, 25.242f)
                lineToRelative(-0.156f, -0.621f)
                lineToRelative(-1.5f, -6.007f)
                lineToRelative(-0.274f, -1.099f)
                lineToRelative(-0.627f, 0.943f)
                close()
                moveTo(18.688f, 24.242f)
                lineTo(19.166f, 23.522f)
                lineTo(21.538f, 19.954f)
                lineTo(22.609f, 24.242f)
                close()
                moveTo(18.556f, 24.242f)
                horizontalLineToRelative(-5.143f)
                lineToRelative(2.373f, -8.302f)
                lineToRelative(2.49f, 7.463f)
                close()
            }
        }
        .build()
        return _documentImageMedium!!
    }

private var _documentImageMedium: ImageVector? = null
