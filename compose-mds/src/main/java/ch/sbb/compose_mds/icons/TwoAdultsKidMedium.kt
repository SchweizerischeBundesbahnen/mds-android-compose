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
        _twoAdultsKidMedium = Builder(name = "TwoAdultsKidMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.25f, 8.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                moveToRelative(18.5f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                moveToRelative(-16.52f, 8.862f)
                lineTo(10.128f, 12.25f)
                lineTo(6.373f, 12.25f)
                lineTo(3.27f, 23.112f)
                lineToRelative(-0.183f, 0.638f)
                horizontalLineToRelative(10.326f)
                close()
                moveTo(12.087f, 22.75f)
                lineTo(4.413f, 22.75f)
                lineToRelative(2.714f, -9.5f)
                horizontalLineToRelative(2.246f)
                close()
                moveTo(19.75f, 8.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                moveToRelative(1.5f, 12.5f)
                verticalLineToRelative(-8.5f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-9.0f)
                close()
                moveTo(17.75f, 19.75f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(31.25f, 18.25f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(25.25f, 24.25f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(7.25f, 28.75f)
                lineTo(7.25f, 24.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(5.75f)
                horizontalLineToRelative(4.0f)
                lineTo(10.25f, 24.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(4.75f)
                close()
            }
        }
        .build()
        return _twoAdultsKidMedium!!
    }

private var _twoAdultsKidMedium: ImageVector? = null
