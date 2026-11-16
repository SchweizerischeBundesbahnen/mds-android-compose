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

public val SBBIcons.TabletSmartphoneMedium: ImageVector
    get() {
        if (_tabletSmartphoneMedium != null) {
            return _tabletSmartphoneMedium!!
        }
        _tabletSmartphoneMedium = Builder(name = "TabletSmartphoneMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.457f, 4.543f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.293f, 0.707f)
                lineTo(22.75f, 6.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.75f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(5.25f, 3.25f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                lineTo(16.5f, 31.25f)
                verticalLineToRelative(-1.0f)
                lineTo(5.25f, 30.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-24.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(16.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.707f, 0.293f)
                moveTo(16.5f, 5.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(31.75f, 9.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineToRelative(-10.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(10.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                close()
                moveTo(32.75f, 30.75f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-10.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-21.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(10.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
                moveTo(28.5f, 10.25f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(16.5f, 27.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _tabletSmartphoneMedium!!
    }

private var _tabletSmartphoneMedium: ImageVector? = null
