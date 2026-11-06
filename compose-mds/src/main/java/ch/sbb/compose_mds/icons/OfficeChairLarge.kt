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

public val SBBIcons.OfficeChairLarge: ImageVector
    get() {
        if (_officeChairLarge != null) {
            return _officeChairLarge!!
        }
        _officeChairLarge = Builder(name = "OfficeChairLarge", defaultWidth = 48.0.dp, defaultHeight
                = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 41.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(14.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(-14.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveToRelative(14.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveToRelative(0.5f, -17.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(6.999f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-6.0f)
                lineTo(25.0f, 41.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-0.001f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.0f)
                lineTo(22.0f, 33.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-6.0f)
                lineTo(16.0f, 8.0f)
                horizontalLineToRelative(15.0f)
                close()
                moveTo(23.0f, 39.999f)
                horizontalLineToRelative(1.0f)
                lineTo(24.0f, 33.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(15.0f, 32.0f)
                horizontalLineToRelative(17.0f)
                verticalLineToRelative(-3.0f)
                lineTo(15.0f, 29.0f)
                close()
                moveTo(23.0f, 28.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(13.0f, 27.999f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(35.0f, 27.999f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(17.0f, 24.0f)
                horizontalLineToRelative(13.0f)
                lineTo(30.0f, 9.0f)
                lineTo(17.0f, 9.0f)
                close()
                moveTo(29.0f, 17.0f)
                lineTo(18.0f, 17.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(11.0f)
                close()
            }
        }
        .build()
        return _officeChairLarge!!
    }

private var _officeChairLarge: ImageVector? = null
