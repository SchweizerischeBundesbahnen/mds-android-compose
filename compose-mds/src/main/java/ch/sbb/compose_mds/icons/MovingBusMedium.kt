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

public val SBBIcons.MovingBusMedium: ImageVector
    get() {
        if (_movingBusMedium != null) {
            return _movingBusMedium!!
        }
        _movingBusMedium = Builder(
            name = "MovingBusMedium",
            defaultWidth = 36.0.dp,
            defaultHeight =
                36.0.dp,
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
                moveTo(10.25f, 10.499f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 3.25f, -3.25f)
                horizontalLineToRelative(9.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 3.25f, 3.25f)
                verticalLineToRelative(6.251f)
                horizontalLineToRelative(-15.5f)
                close()
                moveTo(10.25f, 17.749f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(15.5f)
                verticalLineToRelative(-6.498f)
                close()
                moveTo(13.5f, 6.249f)
                arcToRelative(4.25f, 4.25f, 0.0f, false, false, -4.25f, 4.25f)
                verticalLineToRelative(3.25f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(6.502f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(5.498f)
                verticalLineToRelative(-12.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-3.25f)
                arcToRelative(4.25f, 4.25f, 0.0f, false, false, -4.25f, -4.25f)
                close()
                moveTo(22.252f, 27.249f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.498f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(26.75f, 14.749f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-0.5f)
                close()
                moveTo(13.75f, 25.249f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.5f)
                close()
                moveTo(9.25f, 15.249f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(0.5f)
                close()
                moveTo(13.5f, 19.749f)
                arcToRelative(1.251f, 1.251f, 0.0f, false, false, 0.0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, -2.5f)
                moveToRelative(-0.25f, 1.25f)
                curveToRelative(0.0f, -0.137f, 0.113f, -0.25f, 0.25f, -0.25f)
                reflectiveCurveToRelative(0.25f, 0.113f, 0.25f, 0.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.5f, 0.0f)
                moveToRelative(8.0f, 0.0f)
                arcToRelative(1.251f, 1.251f, 0.0f, false, true, 2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, -2.5f, 0.0f)
                moveToRelative(1.25f, -0.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, false, 0.0f, 0.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.0f, -0.5f)
                moveToRelative(6.25f, 1.75f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(32.75f, 23.999f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(6.25f, 19.499f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(3.25f, 23.999f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(22.5f, 9.251f)
                lineToRelative(-9.0f, -0.002f)
                verticalLineToRelative(1.0f)
                lineToRelative(9.0f, 0.002f)
                close()
            }
        }
            .build()
        return _movingBusMedium!!
    }

private var _movingBusMedium: ImageVector? = null
