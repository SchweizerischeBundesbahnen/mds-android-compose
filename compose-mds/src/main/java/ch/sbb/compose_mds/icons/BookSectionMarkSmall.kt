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

public val SBBIcons.BookSectionMarkSmall: ImageVector
    get() {
        if (_bookSectionMarkSmall != null) {
            return _bookSectionMarkSmall!!
        }
        _bookSectionMarkSmall = Builder(
            name = "BookSectionMarkSmall",
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
                moveTo(6.5f, 4.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 5.0f, 5.5f)
                verticalLineToRelative(11.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 1.5f, -0.499f)
                lineTo(19.0f, 16.001f)
                lineTo(19.0f, 4.0f)
                close()
                moveTo(4.0f, 18.5f)
                verticalLineToRelative(-13.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 6.5f, 3.0f)
                lineTo(20.0f, 3.0f)
                verticalLineToRelative(14.001f)
                lineTo(6.5f, 17.001f)
                arcToRelative(1.499f, 1.499f, 0.0f, true, false, 0.0f, 3.0f)
                lineTo(20.0f, 20.0f)
                verticalLineToRelative(1.0f)
                lineTo(6.5f, 21.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 4.0f, 18.5f)
                moveToRelative(16.0f, 0.5f)
                lineTo(7.0f, 19.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(13.0f)
                close()
                moveTo(11.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                moveToRelative(2.323f, 1.5f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -3.323f, 1.5f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, 1.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 3.323f, -1.5f)
            }
        }
            .build()
        return _bookSectionMarkSmall!!
    }

private var _bookSectionMarkSmall: ImageVector? = null
