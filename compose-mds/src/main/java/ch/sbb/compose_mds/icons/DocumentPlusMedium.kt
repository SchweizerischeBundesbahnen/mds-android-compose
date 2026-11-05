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

public val SBBIcons.DocumentPlusMedium: ImageVector
    get() {
        if (_documentPlusMedium != null) {
            return _documentPlusMedium!!
        }
        _documentPlusMedium = Builder(
            name = "DocumentPlusMedium",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
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
                moveTo(9.75f, 6.25f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(23.5f)
                lineTo(19.5f, 29.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-9.25f)
                lineTo(10.25f, 7.25f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(7.494f)
                horizontalLineToRelative(7.5f)
                lineTo(25.75f, 22.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-8.458f)
                lineToRelative(-0.146f, -0.146f)
                lineToRelative(-7.5f, -7.5f)
                lineToRelative(-0.147f, -0.146f)
                lineTo(9.75f, 6.25f)
                moveToRelative(15.288f, 7.494f)
                lineTo(19.25f, 7.957f)
                verticalLineToRelative(5.787f)
                close()
                moveTo(22.5f, 19.25f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(13.496f, 22.25f)
                lineTo(22.5f, 22.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-9.003f)
                close()
                moveTo(22.5f, 25.25f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(25.75f, 25.5f)
                verticalLineToRelative(3.25f)
                horizontalLineToRelative(-3.251f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.251f)
                lineTo(25.75f, 33.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-3.25f)
                horizontalLineToRelative(3.249f)
                verticalLineToRelative(-1.0f)
                lineTo(26.75f, 28.75f)
                lineTo(26.75f, 25.5f)
                close()
            }
        }
            .build()
        return _documentPlusMedium!!
    }

private var _documentPlusMedium: ImageVector? = null
