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

public val SBBIcons.FourSquaresMedium: ImageVector
    get() {
        if (_fourSquaresMedium != null) {
            return _fourSquaresMedium!!
        }
        _fourSquaresMedium = Builder(name = "FourSquaresMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.75f, 16.25f)
                verticalLineToRelative(-8.5f)
                horizontalLineToRelative(-8.5f)
                verticalLineToRelative(8.5f)
                close()
                moveTo(13.75f, 15.25f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(6.5f)
                close()
                moveTo(28.25f, 16.25f)
                verticalLineToRelative(-8.5f)
                horizontalLineToRelative(-8.5f)
                verticalLineToRelative(8.5f)
                close()
                moveTo(27.25f, 15.25f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(6.5f)
                close()
                moveTo(14.75f, 21.25f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(-8.5f)
                verticalLineToRelative(-8.5f)
                close()
                moveTo(7.25f, 28.75f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(-6.5f)
                close()
                moveTo(28.25f, 29.75f)
                verticalLineToRelative(-8.5f)
                horizontalLineToRelative(-8.5f)
                verticalLineToRelative(8.5f)
                close()
                moveTo(27.25f, 28.75f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(6.5f)
                close()
            }
        }
        .build()
        return _fourSquaresMedium!!
    }

private var _fourSquaresMedium: ImageVector? = null
