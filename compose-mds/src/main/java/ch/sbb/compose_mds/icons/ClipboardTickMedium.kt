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

public val SBBIcons.ClipboardTickMedium: ImageVector
    get() {
        if (_clipboardTickMedium != null) {
            return _clipboardTickMedium!!
        }
        _clipboardTickMedium = Builder(name = "ClipboardTickMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.25f, 3.25f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(28.0f)
                lineTo(4.75f, 32.75f)
                verticalLineToRelative(-28.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(13.75f, 5.75f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(26.0f)
                horizontalLineToRelative(24.5f)
                verticalLineToRelative(-26.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-8.5f)
                close()
                moveTo(14.75f, 4.25f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(-2.0f)
                moveToRelative(0.648f, 21.927f)
                lineToRelative(10.5f, -13.875f)
                lineToRelative(-0.796f, -0.604f)
                lineTo(14.913f, 25.16f)
                lineToRelative(-5.598f, -4.548f)
                lineToRelative(-0.63f, 0.776f)
                lineToRelative(6.0f, 4.875f)
                lineToRelative(0.4f, 0.327f)
                close()
            }
        }
        .build()
        return _clipboardTickMedium!!
    }

private var _clipboardTickMedium: ImageVector? = null
