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

public val SBBIcons.BackpackMedium: ImageVector
    get() {
        if (_backpackMedium != null) {
            return _backpackMedium!!
        }
        _backpackMedium = Builder(name = "BackpackMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.25f, 5.994f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 19.5f, 3.25f)
                horizontalLineToRelative(-2.994f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, -2.75f, 2.746f)
                lineToRelative(-0.003f, 0.36f)
                arcTo(7.25f, 7.25f, 0.0f, false, false, 7.75f, 13.5f)
                verticalLineToRelative(19.25f)
                horizontalLineToRelative(20.5f)
                lineTo(28.25f, 13.5f)
                arcToRelative(7.25f, 7.25f, 0.0f, false, false, -5.996f, -7.142f)
                close()
                moveTo(21.253f, 6.254f)
                lineTo(21.25f, 6.006f)
                lineTo(21.25f, 6.0f)
                lineToRelative(-0.009f, -0.179f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 19.5f, 4.25f)
                horizontalLineToRelative(-2.994f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 14.756f, 6.0f)
                verticalLineToRelative(0.004f)
                lineToRelative(-0.002f, 0.25f)
                quadToRelative(0.123f, -0.004f, 0.246f, -0.004f)
                horizontalLineToRelative(6.0f)
                quadToRelative(0.127f, 0.0f, 0.253f, 0.004f)
                moveTo(21.0f, 7.25f)
                arcToRelative(6.25f, 6.25f, 0.0f, false, true, 6.25f, 6.25f)
                verticalLineToRelative(18.25f)
                lineTo(8.75f, 31.75f)
                lineTo(8.75f, 13.5f)
                arcTo(6.25f, 6.25f, 0.0f, false, true, 15.0f, 7.25f)
                close()
                moveTo(22.5f, 19.75f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 2.75f, 2.75f)
                verticalLineToRelative(7.25f)
                horizontalLineToRelative(-14.5f)
                lineTo(10.75f, 22.5f)
                horizontalLineToRelative(0.006f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 2.75f, -2.75f)
                close()
                moveTo(11.75f, 22.5f)
                verticalLineToRelative(6.25f)
                horizontalLineToRelative(12.5f)
                lineTo(24.25f, 22.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, -1.75f, -1.75f)
                horizontalLineToRelative(-8.994f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, -1.75f, 1.75f)
                close()
                moveTo(13.5f, 22.75f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.75f)
                verticalLineToRelative(1.75f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.75f)
                lineTo(13.5f, 23.75f)
                close()
            }
        }
        .build()
        return _backpackMedium!!
    }

private var _backpackMedium: ImageVector? = null
