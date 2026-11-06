package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.ComputerChipLarge: ImageVector
    get() {
        if (_computerChipLarge != null) {
            return _computerChipLarge!!
        }
        _computerChipLarge = Builder(name = "ComputerChipLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 12.0f)
                horizontalLineToRelative(5.0f)
                lineTo(23.5f, 5.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(5.0f)
                lineTo(29.5f, 5.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(7.0f)
                lineTo(37.0f, 12.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-6.0f)
                lineTo(37.0f, 37.0f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-6.0f)
                lineTo(12.0f, 37.0f)
                verticalLineToRelative(-6.5f)
                lineTo(5.0f, 30.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-5.0f)
                lineTo(5.0f, 24.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-5.0f)
                lineTo(5.0f, 18.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(7.0f)
                lineTo(12.0f, 12.0f)
                horizontalLineToRelative(5.5f)
                lineTo(17.5f, 5.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(13.0f, 36.0f)
                horizontalLineToRelative(23.0f)
                lineTo(36.0f, 13.0f)
                lineTo(13.0f, 13.0f)
                close()
                moveTo(33.5f, 32.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveTo(31.0f, 31.0f)
                lineTo(18.0f, 31.0f)
                lineTo(18.0f, 18.0f)
                horizontalLineToRelative(13.0f)
                close()
                moveTo(19.0f, 30.0f)
                horizontalLineToRelative(11.0f)
                lineTo(30.0f, 19.0f)
                lineTo(19.0f, 19.0f)
                close()
                moveTo(15.5f, 14.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
            }
        }
        .build()
        return _computerChipLarge!!
    }

private var _computerChipLarge: ImageVector? = null
