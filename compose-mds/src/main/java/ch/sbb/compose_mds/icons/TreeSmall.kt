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

public val SBBIcons.TreeSmall: ImageVector
    get() {
        if (_treeSmall != null) {
            return _treeSmall!!
        }
        _treeSmall = Builder(
            name = "TreeSmall",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
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
                moveTo(11.5f, 2.008f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -5.464f, 6.116f)
                curveTo(3.74f, 8.573f, 2.0f, 10.575f, 2.0f, 13.008f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 5.0f, 5.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(12.0f)
                verticalLineToRelative(-2.992f)
                horizontalLineToRelative(6.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                curveToRelative(0.0f, -1.191f, -0.524f, -2.256f, -1.347f, -2.986f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 17.5f, 6.008f)
                quadToRelative(-0.365f, 0.002f, -0.704f, 0.075f)
                curveToRelative(-0.627f, -2.343f, -2.75f, -4.075f, -5.296f, -4.075f)
                moveToRelative(0.5f, 15.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                arcToRelative(2.99f, 2.99f, 0.0f, false, false, -1.28f, -2.451f)
                lineToRelative(-0.396f, -0.279f)
                lineToRelative(0.266f, -0.405f)
                curveToRelative(0.259f, -0.394f, 0.41f, -0.861f, 0.41f, -1.365f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.5f, -2.5f)
                curveToRelative(-0.313f, 0.0f, -0.613f, 0.064f, -0.898f, 0.175f)
                lineToRelative(-0.578f, 0.225f)
                lineToRelative(-0.098f, -0.612f)
                curveToRelative(-0.343f, -2.147f, -2.188f, -3.788f, -4.426f, -3.788f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -4.5f, 4.5f)
                quadToRelative(0.002f, 0.479f, 0.1f, 0.934f)
                lineToRelative(0.12f, 0.554f)
                lineToRelative(-0.565f, 0.049f)
                curveTo(4.606f, 9.223f, 3.0f, 10.922f, 3.0f, 13.008f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(13.24f)
                lineToRelative(-2.312f, -1.85f)
                lineToRelative(0.625f, -0.78f)
                lineTo(11.0f, 11.96f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(5.67f)
                lineToRelative(2.624f, -3.0f)
                lineToRelative(0.752f, 0.66f)
                lineTo(12.0f, 16.187f)
                close()
            }
        }
            .build()
        return _treeSmall!!
    }

private var _treeSmall: ImageVector? = null
