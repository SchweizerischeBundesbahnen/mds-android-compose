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

public val SBBIcons.MetadataMedium: ImageVector
    get() {
        if (_metadataMedium != null) {
            return _metadataMedium!!
        }
        _metadataMedium = Builder(
            name = "MetadataMedium",
            defaultWidth = 36.0.dp,
            defaultHeight =
                36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
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
                moveTo(3.75f, 4.75f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(26.5f)
                horizontalLineToRelative(29.5f)
                lineTo(32.75f, 4.75f)
                horizontalLineToRelative(-29.0f)
                moveToRelative(0.5f, 25.5f)
                lineTo(4.25f, 5.75f)
                horizontalLineToRelative(27.5f)
                verticalLineToRelative(24.5f)
                close()
                moveTo(8.646f, 13.146f)
                lineTo(11.646f, 10.146f)
                lineTo(12.354f, 10.854f)
                lineTo(9.707f, 13.5f)
                lineToRelative(2.647f, 2.646f)
                lineToRelative(-0.708f, 0.708f)
                lineToRelative(-3.0f, -3.0f)
                lineToRelative(-0.353f, -0.354f)
                close()
                moveTo(24.354f, 19.146f)
                lineTo(27.354f, 22.146f)
                lineTo(27.707f, 22.5f)
                lineTo(27.354f, 22.854f)
                lineTo(24.354f, 25.854f)
                lineTo(23.646f, 25.146f)
                lineTo(26.293f, 22.5f)
                lineTo(23.646f, 19.854f)
                close()
                moveTo(27.0f, 11.75f)
                lineTo(15.0f, 11.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(9.0f, 24.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(22.5f, 16.25f)
                lineTo(15.0f, 16.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(7.5f)
                close()
                moveTo(24.0f, 16.25f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(12.0f, 20.75f)
                lineTo(9.0f, 20.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(13.5f, 20.75f)
                lineTo(21.0f, 20.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-7.5f)
                close()
            }
        }
            .build()
        return _metadataMedium!!
    }

private var _metadataMedium: ImageVector? = null
