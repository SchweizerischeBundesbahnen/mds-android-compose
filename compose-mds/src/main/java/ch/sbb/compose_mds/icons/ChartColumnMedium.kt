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

public val SBBIcons.ChartColumnMedium: ImageVector
    get() {
        if (_chartColumnMedium != null) {
            return _chartColumnMedium!!
        }
        _chartColumnMedium = Builder(name = "ChartColumnMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(27.75f, 6.25f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(22.0f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(-22.0f)
                horizontalLineToRelative(-5.0f)
                moveToRelative(0.5f, 21.0f)
                verticalLineToRelative(-20.0f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(20.0f)
                close()
                moveTo(12.75f, 10.75f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(-17.5f)
                horizontalLineToRelative(-5.0f)
                moveToRelative(0.5f, 16.5f)
                verticalLineToRelative(-15.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(15.5f)
                close()
                moveTo(4.75f, 22.75f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-5.5f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-3.5f)
                close()
                moveTo(33.0f, 31.25f)
                lineTo(4.5f, 31.25f)
                verticalLineToRelative(-1.0f)
                lineTo(33.0f, 30.25f)
                close()
                moveTo(19.75f, 13.75f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(14.5f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-14.5f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-12.5f)
                close()
            }
        }
        .build()
        return _chartColumnMedium!!
    }

private var _chartColumnMedium: ImageVector? = null
