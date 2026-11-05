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

public val SBBIcons.DocumentSbbMedium: ImageVector
    get() {
        if (_documentSbbMedium != null) {
            return _documentSbbMedium!!
        }
        _documentSbbMedium = Builder(
            name = "DocumentSbbMedium",
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
                moveTo(9.263f, 6.25f)
                horizontalLineToRelative(9.694f)
                lineToRelative(0.146f, 0.147f)
                lineToRelative(7.5f, 7.5f)
                lineToRelative(0.147f, 0.146f)
                verticalLineToRelative(15.708f)
                lineTo(9.25f, 29.751f)
                verticalLineToRelative(-0.5f)
                lineToRelative(0.013f, -22.5f)
                close()
                moveTo(10.263f, 7.25f)
                lineTo(10.25f, 28.75f)
                horizontalLineToRelative(15.5f)
                verticalLineToRelative(-14.0f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(-7.5f)
                close()
                moveTo(19.25f, 7.958f)
                lineTo(25.043f, 13.751f)
                lineTo(19.25f, 13.751f)
                close()
                moveTo(21.6f, 23.25f)
                lineTo(19.2f, 21.0f)
                lineTo(21.0f, 21.0f)
                lineToRelative(3.0f, 3.0f)
                lineToRelative(-3.0f, 3.0f)
                horizontalLineToRelative(-1.8f)
                lineToRelative(2.401f, -2.25f)
                lineTo(18.75f, 24.75f)
                lineTo(18.75f, 27.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-2.25f)
                lineTo(14.4f, 24.75f)
                lineTo(16.8f, 27.0f)
                lineTo(15.0f, 27.0f)
                lineToRelative(-3.0f, -3.0f)
                lineToRelative(3.0f, -3.0f)
                horizontalLineToRelative(1.8f)
                lineToRelative(-2.4f, 2.25f)
                horizontalLineToRelative(2.85f)
                lineTo(17.25f, 21.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(2.25f)
                close()
            }
        }
            .build()
        return _documentSbbMedium!!
    }

private var _documentSbbMedium: ImageVector? = null
