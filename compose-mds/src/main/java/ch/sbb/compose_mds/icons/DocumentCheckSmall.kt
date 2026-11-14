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

public val SBBIcons.DocumentCheckSmall: ImageVector
    get() {
        if (_documentCheckSmall != null) {
            return _documentCheckSmall!!
        }
        _documentCheckSmall = Builder(name = "DocumentCheckSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.853f, 4.146f)
                lineTo(12.707f, 4.0f)
                lineTo(5.996f, 4.0f)
                verticalLineToRelative(0.5f)
                lineTo(6.0f, 19.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-0.5f)
                lineToRelative(-0.002f, -10.006f)
                verticalLineToRelative(-0.207f)
                lineToRelative(-0.147f, -0.146f)
                close()
                moveTo(17.0f, 19.0f)
                lineTo(7.0f, 19.0f)
                lineTo(6.996f, 5.0f)
                lineTo(12.0f, 5.0f)
                verticalLineToRelative(5.001f)
                lineToRelative(0.501f, -0.001f)
                lineToRelative(4.497f, -0.005f)
                close()
                moveTo(16.29f, 8.995f)
                lineToRelative(-3.29f, -3.288f)
                verticalLineToRelative(3.292f)
                close()
                moveTo(11.001f, 14.0f)
                verticalLineToRelative(-1.0f)
                lineTo(8.0f, 13.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(11.001f, 16.0f)
                verticalLineToRelative(1.0f)
                lineTo(8.0f, 17.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(13.001f, 14.707f)
                lineTo(16.354f, 11.353f)
                lineTo(15.647f, 10.646f)
                lineTo(13.0f, 13.294f)
                lineToRelative(-0.646f, -0.646f)
                lineToRelative(-0.707f, 0.707f)
                close()
                moveTo(16.354f, 14.353f)
                lineTo(13.0f, 17.708f)
                lineToRelative(-1.353f, -1.354f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(0.646f, 0.647f)
                lineToRelative(2.647f, -2.646f)
                close()
            }
        }
        .build()
        return _documentCheckSmall!!
    }

private var _documentCheckSmall: ImageVector? = null
