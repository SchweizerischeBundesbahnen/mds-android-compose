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

public val SBBIcons.DocumentLockLarge: ImageVector
    get() {
        if (_documentLockLarge != null) {
            return _documentLockLarge!!
        }
        _documentLockLarge = Builder(name = "DocumentLockLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.5f, 24.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, 2.5f)
                lineTo(35.0f, 30.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(11.0f)
                lineTo(26.0f, 41.0f)
                lineTo(26.0f, 30.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-3.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, -2.5f)
                moveTo(27.0f, 40.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-9.0f)
                lineTo(27.0f, 31.0f)
                close()
                moveTo(35.0f, 18.293f)
                lineTo(35.0f, 22.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                lineTo(24.0f, 19.0f)
                lineTo(24.0f, 9.0f)
                lineTo(13.0f, 9.0f)
                verticalLineToRelative(29.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(1.0f)
                lineTo(12.0f, 39.0f)
                lineTo(12.0f, 8.0f)
                horizontalLineToRelative(12.707f)
                close()
                moveTo(33.0f, 37.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(23.0f, 33.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(32.5f, 25.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, 1.5f)
                lineTo(31.0f, 30.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                moveToRelative(-9.505f, 4.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(27.0f, 25.0f)
                lineTo(17.0f, 25.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(10.0f)
                close()
                moveTo(25.0f, 18.0f)
                horizontalLineToRelative(8.293f)
                lineTo(25.0f, 9.707f)
                close()
            }
        }
        .build()
        return _documentLockLarge!!
    }

private var _documentLockLarge: ImageVector? = null
