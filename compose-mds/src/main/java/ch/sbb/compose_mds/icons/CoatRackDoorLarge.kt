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

public val SBBIcons.CoatRackDoorLarge: ImageVector
    get() {
        if (_coatRackDoorLarge != null) {
            return _coatRackDoorLarge!!
        }
        _coatRackDoorLarge = Builder(name = "CoatRackDoorLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 16.964f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.0f, -3.464f)
                horizontalLineToRelative(1.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -4.0f, 4.47f)
                verticalLineToRelative(6.994f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.0f, -3.464f)
                horizontalLineToRelative(1.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -4.0f, 4.47f)
                verticalLineToRelative(8.058f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 16.972f, 38.0f)
                lineTo(24.0f, 38.0f)
                lineTo(24.0f, 8.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(30.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.0f)
                lineTo(3.001f, 39.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.027f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 12.0f, 34.028f)
                lineTo(12.0f, 21.971f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 8.0f, 17.5f)
                horizontalLineToRelative(1.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.0f, 3.464f)
                lineTo(12.0f, 13.97f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 8.0f, 9.5f)
                horizontalLineToRelative(1.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.0f, 3.464f)
                lineTo(12.0f, 8.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(12.5f, 35.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.464f, 3.0f)
                horizontalLineToRelative(6.928f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.464f, -3.0f)
                moveTo(25.0f, 38.0f)
                horizontalLineToRelative(13.0f)
                lineTo(38.0f, 9.0f)
                lineTo(25.0f, 9.0f)
                close()
                moveTo(36.0f, 36.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(28.0f, 35.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-7.0f)
                close()
                moveTo(36.0f, 25.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(36.0f, 21.0f)
                horizontalLineToRelative(-9.0f)
                lineTo(27.0f, 11.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(28.0f, 20.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-7.0f)
                close()
            }
        }
        .build()
        return _coatRackDoorLarge!!
    }

private var _coatRackDoorLarge: ImageVector? = null
