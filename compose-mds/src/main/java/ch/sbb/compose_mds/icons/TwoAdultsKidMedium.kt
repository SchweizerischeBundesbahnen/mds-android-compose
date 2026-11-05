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

public val SBBIcons.TwoAdultsKidMedium: ImageVector
    get() {
        if (_twoAdultsKidMedium != null) {
            return _twoAdultsKidMedium!!
        }
        _twoAdultsKidMedium = Builder(
            name = "TwoAdultsKidMedium",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveTo(8.25f, 7.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(-2.0f, 1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                moveToRelative(21.5f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(-2.0f, 1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                moveToRelative(-19.0f, -2.0f)
                horizontalLineToRelative(-0.377f)
                lineToRelative(-0.104f, 0.363f)
                lineToRelative(-3.0f, 10.5f)
                lineToRelative(-0.182f, 0.637f)
                horizontalLineToRelative(10.326f)
                lineToRelative(-0.182f, -0.637f)
                lineToRelative(-3.0f, -10.5f)
                lineToRelative(-0.104f, -0.363f)
                horizontalLineTo(6.75f)
                moveToRelative(-2.337f, 10.5f)
                lineToRelative(2.714f, -9.5f)
                horizontalLineToRelative(2.246f)
                lineToRelative(2.714f, 9.5f)
                close()
                moveTo(18.75f, 7.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(-2.0f, 1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                moveToRelative(-1.0f, 4.0f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-8.5f)
                horizontalLineToRelative(-6.5f)
                moveToRelative(0.5f, 7.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-1.5f)
                moveToRelative(8.0f, -1.5f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-7.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(6.25f, 24.0f)
                verticalLineToRelative(5.75f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(4.75f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(24.0f)
                close()
            }
        }
            .build()
        return _twoAdultsKidMedium!!
    }

private var _twoAdultsKidMedium: ImageVector? = null
