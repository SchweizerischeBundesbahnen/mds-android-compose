package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.SquareCirclePentagonSmall: ImageVector
    get() {
        if (_squareCirclePentagonSmall != null) {
            return _squareCirclePentagonSmall!!
        }
        _squareCirclePentagonSmall = Builder(
            name = "SquareCirclePentagonSmall",
            defaultWidth =
                24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight =
            24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(22.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                lineTo(2.0f, 2.0f)
                horizontalLineToRelative(20.0f)
                close()
                moveTo(3.0f, 21.0f)
                horizontalLineToRelative(18.0f)
                lineTo(21.0f, 3.0f)
                lineTo(3.0f, 3.0f)
                close()
                moveTo(12.0f, 4.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 0.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, 0.0f, 14.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 0.0f, -14.0f)
                moveToRelative(0.248f, 2.565f)
                lineToRelative(3.5f, 2.0f)
                lineTo(16.0f, 9.71f)
                lineTo(16.0f, 16.0f)
                lineTo(8.0f, 16.0f)
                lineTo(8.0f, 9.71f)
                lineToRelative(0.252f, -0.145f)
                lineToRelative(3.5f, -2.0f)
                lineTo(12.0f, 7.424f)
                close()
                moveTo(9.0f, 10.29f)
                lineTo(9.0f, 15.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-4.71f)
                lineToRelative(-3.0f, -1.714f)
                close()
            }
        }
            .build()
        return _squareCirclePentagonSmall!!
    }

private var _squareCirclePentagonSmall: ImageVector? = null
