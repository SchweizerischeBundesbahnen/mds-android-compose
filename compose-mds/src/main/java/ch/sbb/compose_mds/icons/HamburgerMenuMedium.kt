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

public val SBBIcons.HamburgerMenuMedium: ImageVector
    get() {
        if (_hamburgerMenuMedium != null) {
            return _hamburgerMenuMedium!!
        }
        _hamburgerMenuMedium = Builder(name = "HamburgerMenuMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.0f, 7.75f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(1.0f)
                lineTo(6.0f, 8.75f)
                close()
                moveTo(6.0f, 28.75f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(1.0f)
                lineTo(6.0f, 29.75f)
                close()
                moveTo(30.0f, 18.25f)
                lineTo(6.0f, 18.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(24.0f)
                close()
            }
        }
        .build()
        return _hamburgerMenuMedium!!
    }

private var _hamburgerMenuMedium: ImageVector? = null
