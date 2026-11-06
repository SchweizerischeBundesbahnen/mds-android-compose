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

public val SBBIcons.StovePanSmall: ImageVector
    get() {
        if (_stovePanSmall != null) {
            return _stovePanSmall!!
        }
        _stovePanSmall = Builder(name = "StovePanSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.001f, 3.0f)
                lineTo(12.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(18.0f)
                lineTo(4.0f, 22.0f)
                lineTo(4.0f, 4.0f)
                horizontalLineToRelative(3.0f)
                lineTo(7.0f, 2.0f)
                horizontalLineToRelative(8.001f)
                close()
                moveTo(5.0f, 21.0f)
                horizontalLineToRelative(14.0f)
                lineTo(19.0f, 10.0f)
                lineTo(5.0f, 10.0f)
                close()
                moveTo(18.0f, 19.0f)
                lineTo(6.0f, 19.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(7.0f, 18.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-5.0f)
                lineTo(7.0f, 13.0f)
                close()
                moveTo(5.0f, 9.0f)
                horizontalLineToRelative(14.0f)
                lineTo(19.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(7.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                moveToRelative(3.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                moveToRelative(3.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                moveToRelative(5.001f, 1.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(15.001f, 6.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(8.0f, 4.0f)
                horizontalLineToRelative(3.0f)
                lineTo(11.0f, 3.0f)
                lineTo(8.0f, 3.0f)
                close()
            }
        }
        .build()
        return _stovePanSmall!!
    }

private var _stovePanSmall: ImageVector? = null
