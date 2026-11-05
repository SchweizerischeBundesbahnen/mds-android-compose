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

public val SBBIcons.TabletSmartphoneLarge: ImageVector
    get() {
        if (_tabletSmartphoneLarge != null) {
            return _tabletSmartphoneLarge!!
        }
        _tabletSmartphoneLarge = Builder(name = "TabletSmartphoneLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.0f, 6.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 5.5f, 3.0f)
                horizontalLineToRelative(22.834f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, true, 1.938f, 0.58f)
                lineToRelative(-0.543f, 0.84f)
                arcTo(2.6f, 2.6f, 0.0f, false, false, 28.328f, 4.0f)
                lineTo(5.5f, 4.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 3.0f, 6.5f)
                lineTo(3.0f, 9.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(1.0f)
                lineTo(3.0f, 10.0f)
                verticalLineToRelative(27.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(1.0f)
                lineTo(3.0f, 38.0f)
                verticalLineToRelative(2.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 5.5f, 43.0f)
                lineTo(23.0f, 43.0f)
                verticalLineToRelative(1.0f)
                lineTo(5.5f, 44.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 2.0f, 40.5f)
                close()
                moveTo(15.0f, 41.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(15.0f, 7.0f)
                horizontalLineToRelative(6.0f)
                lineTo(21.0f, 6.0f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(14.0f, 7.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(13.0f, 6.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(38.0f, 43.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(45.0f, 39.0f)
                lineTo(45.0f, 8.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 42.5f, 6.0f)
                horizontalLineToRelative(-15.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 25.0f, 8.5f)
                lineTo(25.0f, 39.0f)
                close()
                moveTo(45.0f, 40.0f)
                lineTo(25.0f, 40.0f)
                verticalLineToRelative(2.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.5f, 2.5f)
                horizontalLineToRelative(15.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.5f, -2.5f)
                close()
                moveTo(39.0f, 9.0f)
                horizontalLineToRelative(-6.0f)
                lineTo(33.0f, 8.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(31.0f, 9.0f)
                horizontalLineToRelative(1.0f)
                lineTo(32.0f, 8.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(27.5f, 5.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 24.0f, 8.5f)
                verticalLineToRelative(34.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.5f, 3.5f)
                horizontalLineToRelative(15.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.5f, -3.5f)
                verticalLineToRelative(-34.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 42.5f, 5.0f)
                close()
            }
        }
        .build()
        return _tabletSmartphoneLarge!!
    }

private var _tabletSmartphoneLarge: ImageVector? = null
