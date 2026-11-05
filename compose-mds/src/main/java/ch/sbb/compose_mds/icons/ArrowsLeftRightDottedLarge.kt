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

public val SBBIcons.ArrowsLeftRightDottedLarge: ImageVector
    get() {
        if (_arrowsLeftRightDottedLarge != null) {
            return _arrowsLeftRightDottedLarge!!
        }
        _arrowsLeftRightDottedLarge = Builder(name = "ArrowsLeftRightDottedLarge", defaultWidth =
                48.0.dp, defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight =
                48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.854f, 26.854f)
                lineTo(10.707f, 32.0f)
                lineTo(18.0f, 32.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-7.293f)
                lineToRelative(5.147f, 5.147f)
                lineToRelative(-0.707f, 0.706f)
                lineToRelative(-6.0f, -6.0f)
                lineToRelative(-0.355f, -0.353f)
                lineToRelative(0.355f, -0.353f)
                lineToRelative(6.0f, -6.0f)
                close()
                moveTo(24.024f, 33.0f)
                horizontalLineToRelative(-3.048f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.048f)
                close()
                moveTo(30.024f, 33.0f)
                horizontalLineToRelative(-3.048f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.048f)
                close()
                moveTo(36.024f, 33.0f)
                horizontalLineToRelative(-3.048f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.048f)
                close()
                moveTo(41.024f, 33.0f)
                horizontalLineToRelative(-2.048f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.048f)
                close()
                moveTo(40.207f, 14.5f)
                lineTo(33.854f, 20.854f)
                lineTo(33.147f, 20.147f)
                lineTo(38.293f, 15.0f)
                lineTo(31.0f, 15.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(7.293f)
                lineToRelative(-5.146f, -5.146f)
                lineToRelative(0.707f, -0.708f)
                close()
                moveTo(10.024f, 15.0f)
                lineTo(7.976f, 15.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.048f)
                close()
                moveTo(16.024f, 15.0f)
                horizontalLineToRelative(-3.048f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.048f)
                close()
                moveTo(22.024f, 15.0f)
                horizontalLineToRelative(-3.048f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.048f)
                close()
                moveTo(28.024f, 15.0f)
                horizontalLineToRelative(-3.048f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.048f)
                close()
            }
        }
        .build()
        return _arrowsLeftRightDottedLarge!!
    }

private var _arrowsLeftRightDottedLarge: ImageVector? = null
