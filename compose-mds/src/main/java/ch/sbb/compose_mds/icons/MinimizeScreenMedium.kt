package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.MinimizeScreenMedium: ImageVector
    get() {
        if (_minimizeScreenMedium != null) {
            return _minimizeScreenMedium!!
        }
        _minimizeScreenMedium = Builder(name = "MinimizeScreenMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.75f, 13.75f)
                lineTo(13.75f, 6.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(8.75f)
                lineTo(6.0f, 14.75f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(6.0f, 22.25f)
                horizontalLineToRelative(7.75f)
                lineTo(13.75f, 30.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-8.75f)
                lineTo(6.0f, 21.25f)
                close()
                moveTo(21.75f, 21.25f)
                horizontalLineToRelative(-0.5f)
                lineTo(21.25f, 30.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-7.75f)
                lineTo(30.0f, 22.25f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(22.25f, 6.0f)
                verticalLineToRelative(7.75f)
                lineTo(30.0f, 13.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-8.75f)
                lineTo(21.25f, 6.0f)
                close()
            }
        }
        .build()
        return _minimizeScreenMedium!!
    }

private var _minimizeScreenMedium: ImageVector? = null
