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

public val SBBIcons.ClipboardEmptyMedium: ImageVector
    get() {
        if (_clipboardEmptyMedium != null) {
            return _clipboardEmptyMedium!!
        }
        _clipboardEmptyMedium = Builder(name = "ClipboardEmptyMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.25f, 3.25f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(28.0f)
                horizontalLineToRelative(26.5f)
                verticalLineToRelative(-28.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-8.0f)
                moveToRelative(0.5f, 2.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(1.5f)
                moveToRelative(7.5f, 0.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-8.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(26.0f)
                horizontalLineToRelative(24.5f)
                verticalLineToRelative(-26.0f)
                close()
            }
        }
        .build()
        return _clipboardEmptyMedium!!
    }

private var _clipboardEmptyMedium: ImageVector? = null
