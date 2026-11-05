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

public val SBBIcons.CupHotSmall: ImageVector
    get() {
        if (_cupHotSmall != null) {
            return _cupHotSmall!!
        }
        _cupHotSmall = Builder(
            name = "CupHotSmall",
            defaultWidth = 24.0.dp,
            defaultHeight =
                24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
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
                moveTo(11.0f, 3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(1.0f)
                lineTo(12.0f, 3.0f)
                close()
                moveTo(5.5f, 10.0f)
                lineTo(5.0f, 10.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 2.702f, 1.65f, 5.02f, 3.996f, 6.0f)
                lineTo(4.0f, 20.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-4.996f)
                arcToRelative(6.52f, 6.52f, 0.0f, false, false, 3.682f, -4.0f)
                lineTo(19.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.0f)
                lineTo(5.5f, 10.0f)
                moveTo(19.0f, 15.0f)
                horizontalLineToRelative(-1.076f)
                quadToRelative(0.076f, -0.49f, 0.076f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                moveTo(6.0f, 14.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -11.0f, 0.0f)
                moveToRelative(8.0f, -6.0f)
                lineTo(14.0f, 4.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(8.0f, 4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(1.0f)
                lineTo(9.0f, 4.0f)
                close()
            }
        }
            .build()
        return _cupHotSmall!!
    }

private var _cupHotSmall: ImageVector? = null
