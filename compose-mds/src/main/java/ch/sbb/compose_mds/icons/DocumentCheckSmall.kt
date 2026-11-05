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
        _documentCheckSmall = Builder(
            name = "DocumentCheckSmall",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveTo(6.496f, 4.0f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(0.5f)
                lineTo(6.0f, 19.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-0.5f)
                lineToRelative(-0.002f, -10.006f)
                verticalLineToRelative(-0.207f)
                lineToRelative(-0.147f, -0.147f)
                lineToRelative(-4.998f, -4.994f)
                lineTo(12.707f, 4.0f)
                lineTo(6.496f, 4.0f)
                moveTo(7.0f, 19.0f)
                lineTo(6.996f, 5.0f)
                lineTo(12.0f, 5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(0.5f)
                lineToRelative(4.498f, -0.005f)
                lineTo(17.0f, 19.0f)
                close()
                moveTo(16.29f, 8.995f)
                lineToRelative(-3.29f, -3.288f)
                verticalLineToRelative(3.292f)
                close()
                moveTo(8.001f, 14.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.0f)
                lineTo(8.0f, 13.0f)
                close()
                moveTo(11.001f, 17.0f)
                lineTo(8.0f, 17.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(13.354f, 14.354f)
                lineTo(16.354f, 11.354f)
                lineTo(15.647f, 10.646f)
                lineTo(13.0f, 13.293f)
                lineToRelative(-0.646f, -0.647f)
                lineToRelative(-0.707f, 0.708f)
                lineToRelative(1.0f, 1.0f)
                lineToRelative(0.353f, 0.353f)
                close()
                moveTo(16.354f, 14.354f)
                lineTo(13.354f, 17.354f)
                lineTo(13.0f, 17.707f)
                lineTo(12.647f, 17.354f)
                lineTo(11.647f, 16.354f)
                lineTo(12.354f, 15.646f)
                lineTo(13.0f, 16.293f)
                lineTo(15.647f, 13.646f)
                close()
            }
        }
            .build()
        return _documentCheckSmall!!
    }

private var _documentCheckSmall: ImageVector? = null
