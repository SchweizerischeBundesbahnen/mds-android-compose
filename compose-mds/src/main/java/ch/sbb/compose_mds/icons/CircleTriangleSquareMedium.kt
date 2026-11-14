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

public val SBBIcons.CircleTriangleSquareMedium: ImageVector
    get() {
        if (_circleTriangleSquareMedium != null) {
            return _circleTriangleSquareMedium!!
        }
        _circleTriangleSquareMedium = Builder(name = "CircleTriangleSquareMedium", defaultWidth =
                36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.25f, 9.75f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 11.0f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, true, -13.0f, 0.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 13.0f, 0.0f)
                moveToRelative(16.5f, -2.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(-13.0f)
                verticalLineToRelative(-13.0f)
                close()
                moveTo(20.75f, 19.75f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-11.0f)
                horizontalLineToRelative(-11.0f)
                close()
                moveTo(21.883f, 32.75f)
                lineTo(14.679f, 20.743f)
                lineTo(14.25f, 20.028f)
                lineTo(13.821f, 20.743f)
                lineTo(6.617f, 32.75f)
                close()
                moveTo(20.117f, 31.75f)
                lineTo(8.383f, 31.75f)
                lineToRelative(5.867f, -9.78f)
                close()
            }
        }
        .build()
        return _circleTriangleSquareMedium!!
    }

private var _circleTriangleSquareMedium: ImageVector? = null
