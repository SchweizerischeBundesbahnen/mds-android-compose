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

public val SBBIcons.DisplayMedium: ImageVector
    get() {
        if (_displayMedium != null) {
            return _displayMedium!!
        }
        _displayMedium = Builder(name = "DisplayMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.75f, 6.25f)
                horizontalLineToRelative(26.5f)
                verticalLineToRelative(19.0f)
                horizontalLineToRelative(-12.0f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(6.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-15.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.25f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-12.0f)
                verticalLineToRelative(-19.0f)
                moveToRelative(13.5f, 22.5f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(0.5f)
                close()
                moveTo(30.25f, 24.25f)
                lineTo(5.75f, 24.25f)
                verticalLineToRelative(-17.0f)
                horizontalLineToRelative(24.5f)
                close()
            }
        }
        .build()
        return _displayMedium!!
    }

private var _displayMedium: ImageVector? = null
