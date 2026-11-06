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

public val SBBIcons.ScreenInsideTrainLarge: ImageVector
    get() {
        if (_screenInsideTrainLarge != null) {
            return _screenInsideTrainLarge!!
        }
        _screenInsideTrainLarge = Builder(name = "ScreenInsideTrainLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(42.0f, 14.293f)
                lineTo(42.0f, 42.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(41.0f, 14.707f)
                lineTo(33.293f, 7.0f)
                lineTo(30.0f, 7.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(17.0f)
                lineTo(9.0f, 31.0f)
                lineTo(9.0f, 14.0f)
                horizontalLineToRelative(3.999f)
                lineTo(12.999f, 7.0f)
                lineTo(6.0f, 7.0f)
                lineTo(6.0f, 6.0f)
                horizontalLineToRelative(27.707f)
                close()
                moveTo(10.0f, 30.0f)
                horizontalLineToRelative(23.0f)
                lineTo(33.0f, 15.0f)
                lineTo(10.0f, 15.0f)
                close()
                moveTo(31.0f, 27.001f)
                lineTo(12.0f, 27.001f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(19.0f)
                close()
                moveTo(31.0f, 23.0f)
                lineTo(12.0f, 23.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(19.0f)
                close()
                moveTo(31.0f, 19.0f)
                lineTo(12.0f, 19.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(19.0f)
                close()
                moveTo(13.999f, 14.0f)
                lineTo(29.0f, 14.0f)
                lineTo(29.0f, 7.0f)
                lineTo(13.999f, 7.0f)
                close()
            }
        }
        .build()
        return _screenInsideTrainLarge!!
    }

private var _screenInsideTrainLarge: ImageVector? = null
