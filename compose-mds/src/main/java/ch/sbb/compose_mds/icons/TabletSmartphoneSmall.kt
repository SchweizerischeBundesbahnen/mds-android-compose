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

public val SBBIcons.TabletSmartphoneSmall: ImageVector
    get() {
        if (_tabletSmartphoneSmall != null) {
            return _tabletSmartphoneSmall!!
        }
        _tabletSmartphoneSmall = Builder(name = "TabletSmartphoneSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.854f, 3.146f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 15.0f, 3.5f)
                lineTo(15.0f, 4.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 14.5f, 2.0f)
                horizontalLineToRelative(-11.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 2.0f, 3.5f)
                verticalLineToRelative(16.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 3.5f, 21.0f)
                lineTo(11.0f, 21.0f)
                verticalLineToRelative(-1.0f)
                lineTo(3.5f, 20.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-16.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                lineTo(7.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.0f)
                lineTo(11.0f, 3.0f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.354f, 0.146f)
                moveTo(21.0f, 6.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                lineTo(19.0f, 6.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(15.0f, 6.0f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(14.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                close()
                moveTo(22.0f, 20.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, -1.5f)
                verticalLineToRelative(-14.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.5f, 5.0f)
                horizontalLineToRelative(7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 22.0f, 6.5f)
                close()
                moveTo(11.0f, 18.0f)
                verticalLineToRelative(1.0f)
                lineTo(7.0f, 19.0f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _tabletSmartphoneSmall!!
    }

private var _tabletSmartphoneSmall: ImageVector? = null
