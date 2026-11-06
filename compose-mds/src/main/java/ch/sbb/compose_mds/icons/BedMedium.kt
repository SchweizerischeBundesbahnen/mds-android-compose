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

public val SBBIcons.BedMedium: ImageVector
    get() {
        if (_bedMedium != null) {
            return _bedMedium!!
        }
        _bedMedium = Builder(name = "BedMedium", defaultWidth = 36.0.dp, defaultHeight = 36.0.dp,
                viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.25f, 25.75f)
                horizontalLineToRelative(9.5f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(15.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.5f, 3.5f)
                lineTo(32.75f, 33.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-6.25f)
                lineTo(4.25f, 26.75f)
                lineTo(4.25f, 33.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(3.25f, 16.5f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(14.75f, 25.75f)
                horizontalLineToRelative(17.0f)
                verticalLineToRelative(-2.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.5f, -2.5f)
                horizontalLineToRelative(-14.5f)
                close()
                moveTo(9.0f, 18.25f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, 0.0f, 5.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 0.0f, -5.5f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 0.0f, 3.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 0.0f, -3.5f)
            }
        }
        .build()
        return _bedMedium!!
    }

private var _bedMedium: ImageVector? = null
