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

public val SBBIcons.ClipboardListMedium: ImageVector
    get() {
        if (_clipboardListMedium != null) {
            return _clipboardListMedium!!
        }
        _clipboardListMedium = Builder(name = "ClipboardListMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.25f, 4.75f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-8.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(28.0f)
                horizontalLineToRelative(26.5f)
                verticalLineToRelative(-28.0f)
                close()
                moveTo(5.75f, 5.75f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(26.0f)
                lineTo(5.75f, 31.75f)
                close()
                moveTo(21.25f, 4.25f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(-2.0f)
                moveTo(27.0f, 14.0f)
                verticalLineToRelative(1.0f)
                lineTo(9.0f, 15.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(27.0f, 19.5f)
                verticalLineToRelative(-1.0f)
                lineTo(9.0f, 18.5f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(27.0f, 23.0f)
                verticalLineToRelative(1.0f)
                lineTo(9.0f, 24.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(27.0f, 28.5f)
                verticalLineToRelative(-1.0f)
                lineTo(9.0f, 27.5f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _clipboardListMedium!!
    }

private var _clipboardListMedium: ImageVector? = null
