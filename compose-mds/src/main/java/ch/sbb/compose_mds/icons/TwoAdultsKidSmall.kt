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

public val SBBIcons.TwoAdultsKidSmall: ImageVector
    get() {
        if (_twoAdultsKidSmall != null) {
            return _twoAdultsKidSmall!!
        }
        _twoAdultsKidSmall = Builder(name = "TwoAdultsKidSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.0f, 5.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -1.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                moveToRelative(12.0f, 4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -1.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                moveTo(8.98f, 15.362f)
                lineTo(6.877f, 8.0f)
                lineTo(4.123f, 8.0f)
                lineTo(2.02f, 15.362f)
                lineTo(1.837f, 16.0f)
                lineTo(4.0f, 16.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.163f)
                close()
                moveTo(6.0f, 16.0f)
                lineTo(5.0f, 16.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(7.837f, 15.0f)
                lineTo(3.163f, 15.0f)
                lineToRelative(1.714f, -6.0f)
                horizontalLineToRelative(1.246f)
                close()
                moveTo(13.0f, 5.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -1.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                moveToRelative(1.0f, 8.5f)
                lineTo(15.0f, 8.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(12.0f, 13.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(11.0f, 9.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(21.0f, 12.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(17.0f, 16.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _twoAdultsKidSmall!!
    }

private var _twoAdultsKidSmall: ImageVector? = null
