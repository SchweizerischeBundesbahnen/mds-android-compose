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

public val SBBIcons.ArrowsLeftRightDottedSmall: ImageVector
    get() {
        if (_arrowsLeftRightDottedSmall != null) {
            return _arrowsLeftRightDottedSmall!!
        }
        _arrowsLeftRightDottedSmall = Builder(name = "ArrowsLeftRightDottedSmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.853f, 13.854f)
                lineTo(5.707f, 16.0f)
                lineTo(9.0f, 16.0f)
                verticalLineToRelative(1.0f)
                lineTo(5.707f, 17.0f)
                lineToRelative(2.146f, 2.146f)
                lineToRelative(-0.707f, 0.707f)
                lineTo(3.793f, 16.5f)
                lineToRelative(3.353f, -3.354f)
                close()
                moveTo(12.013f, 17.0f)
                lineTo(9.987f, 17.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.024f)
                close()
                moveTo(15.013f, 17.0f)
                horizontalLineToRelative(-2.025f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.024f)
                close()
                moveTo(18.013f, 17.0f)
                horizontalLineToRelative(-2.025f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.024f)
                close()
                moveTo(20.013f, 17.0f)
                horizontalLineToRelative(-1.025f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.024f)
                close()
                moveTo(20.207f, 7.5f)
                lineTo(16.853f, 10.854f)
                lineTo(16.146f, 10.147f)
                lineTo(18.293f, 8.0f)
                lineTo(15.0f, 8.0f)
                lineTo(15.0f, 7.0f)
                horizontalLineToRelative(3.293f)
                lineToRelative(-2.147f, -2.146f)
                lineToRelative(0.707f, -0.708f)
                close()
                moveTo(5.012f, 8.0f)
                lineTo(3.988f, 8.0f)
                lineTo(3.988f, 7.0f)
                horizontalLineToRelative(1.024f)
                close()
                moveTo(8.012f, 8.0f)
                lineTo(5.988f, 8.0f)
                lineTo(5.988f, 7.0f)
                horizontalLineToRelative(2.024f)
                close()
                moveTo(11.012f, 8.0f)
                lineTo(8.988f, 8.0f)
                lineTo(8.988f, 7.0f)
                horizontalLineToRelative(2.024f)
                close()
                moveTo(14.012f, 8.0f)
                horizontalLineToRelative(-2.024f)
                lineTo(11.988f, 7.0f)
                horizontalLineToRelative(2.024f)
                close()
            }
        }
        .build()
        return _arrowsLeftRightDottedSmall!!
    }

private var _arrowsLeftRightDottedSmall: ImageVector? = null
