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

public val SBBIcons.StovePanLarge: ImageVector
    get() {
        if (_stovePanLarge != null) {
            return _stovePanLarge!!
        }
        _stovePanLarge = Builder(
            name = "StovePanLarge",
            defaultWidth = 48.0.dp,
            defaultHeight =
                48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(30.001f, 5.0f)
                lineTo(23.0f, 5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(35.0f)
                lineTo(8.0f, 43.0f)
                lineTo(8.0f, 8.0f)
                horizontalLineToRelative(6.0f)
                lineTo(14.0f, 4.0f)
                horizontalLineToRelative(16.001f)
                close()
                moveTo(9.0f, 42.0f)
                horizontalLineToRelative(29.0f)
                lineTo(38.0f, 19.0f)
                lineTo(9.0f, 19.0f)
                close()
                moveTo(35.0f, 37.0f)
                lineTo(12.0f, 37.0f)
                lineTo(12.0f, 24.0f)
                horizontalLineToRelative(23.0f)
                close()
                moveTo(13.0f, 36.0f)
                horizontalLineToRelative(21.0f)
                lineTo(34.0f, 25.0f)
                lineTo(13.0f, 25.0f)
                close()
                moveTo(9.0f, 18.0f)
                horizontalLineToRelative(29.0f)
                lineTo(38.0f, 9.0f)
                lineTo(9.0f, 9.0f)
                close()
                moveTo(13.5f, 12.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(6.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(6.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(-12.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveToRelative(6.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveToRelative(6.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveToRelative(10.501f, 0.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(15.0f, 8.0f)
                horizontalLineToRelative(7.0f)
                lineTo(22.0f, 5.0f)
                horizontalLineToRelative(-7.0f)
                close()
            }
        }
            .build()
        return _stovePanLarge!!
    }

private var _stovePanLarge: ImageVector? = null
