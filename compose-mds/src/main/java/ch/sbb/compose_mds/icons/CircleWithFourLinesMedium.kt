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

public val SBBIcons.CircleWithFourLinesMedium: ImageVector
    get() {
        if (_circleWithFourLinesMedium != null) {
            return _circleWithFourLinesMedium!!
        }
        _circleWithFourLinesMedium = Builder(name = "CircleWithFourLinesMedium", defaultWidth =
                36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.25f, 10.019f)
                arcToRelative(7.25f, 7.25f, 0.0f, false, true, 6.73f, 6.731f)
                lineTo(33.0f, 16.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-7.02f)
                arcToRelative(7.25f, 7.25f, 0.0f, false, true, -6.73f, 6.73f)
                verticalLineToRelative(7.02f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-7.02f)
                arcToRelative(7.25f, 7.25f, 0.0f, false, true, -6.73f, -6.73f)
                lineTo(4.5f, 17.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(7.02f)
                arcToRelative(7.25f, 7.25f, 0.0f, false, true, 6.73f, -6.731f)
                lineTo(18.25f, 3.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(18.75f, 11.0f)
                arcToRelative(6.25f, 6.25f, 0.0f, true, false, 0.0f, 12.5f)
                arcToRelative(6.25f, 6.25f, 0.0f, false, false, 0.0f, -12.5f)
            }
        }
        .build()
        return _circleWithFourLinesMedium!!
    }

private var _circleWithFourLinesMedium: ImageVector? = null
