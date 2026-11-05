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

public val SBBIcons.StovePanMedium: ImageVector
    get() {
        if (_stovePanMedium != null) {
            return _stovePanMedium!!
        }
        _stovePanMedium = Builder(name = "StovePanMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.501f, 4.25f)
                lineTo(17.75f, 4.25f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(26.5f)
                lineTo(6.25f, 32.75f)
                lineTo(6.25f, 6.25f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(11.751f)
                close()
                moveTo(7.25f, 31.75f)
                horizontalLineToRelative(21.5f)
                verticalLineToRelative(-17.0f)
                lineTo(7.25f, 14.75f)
                close()
                moveTo(26.75f, 28.25f)
                lineTo(9.25f, 28.25f)
                verticalLineToRelative(-10.0f)
                horizontalLineToRelative(17.5f)
                close()
                moveTo(10.25f, 27.25f)
                horizontalLineToRelative(15.5f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-15.5f)
                close()
                moveTo(7.25f, 13.75f)
                horizontalLineToRelative(21.5f)
                verticalLineToRelative(-6.5f)
                lineTo(7.25f, 7.25f)
                close()
                moveTo(10.5f, 9.25f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 0.0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 0.0f, -2.5f)
                moveToRelative(4.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 0.0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 0.0f, -2.5f)
                moveToRelative(4.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 0.0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 0.0f, -2.5f)
                moveToRelative(-9.0f, 1.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, false, 0.0f, 0.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.0f, -0.5f)
                moveToRelative(4.5f, 0.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, false, 0.0f, 0.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.0f, -0.5f)
                moveToRelative(4.5f, 0.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, false, 0.0f, 0.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.0f, -0.5f)
                moveToRelative(7.501f, 0.0f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.5f)
                close()
                moveTo(11.75f, 6.25f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-5.0f)
                close()
            }
        }
        .build()
        return _stovePanMedium!!
    }

private var _stovePanMedium: ImageVector? = null
