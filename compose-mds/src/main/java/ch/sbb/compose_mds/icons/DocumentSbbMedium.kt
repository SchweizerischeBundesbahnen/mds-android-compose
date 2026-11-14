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
        _documentSbbMedium = Builder(name = "DocumentSbbMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(18.957f, 6.25f)
                lineToRelative(7.793f, 7.794f)
                lineTo(26.75f, 29.75f)
                lineTo(9.25f, 29.75f)
                verticalLineToRelative(-0.5f)
                lineToRelative(0.013f, -22.5f)
                verticalLineToRelative(-0.5f)
                close()
                moveTo(10.25f, 28.75f)
                horizontalLineToRelative(15.5f)
                verticalLineToRelative(-14.0f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(-7.987f)
                close()
                moveTo(19.25f, 13.75f)
                horizontalLineToRelative(5.793f)
                lineTo(19.25f, 7.959f)
                close()
                moveTo(21.601f, 23.25f)
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
