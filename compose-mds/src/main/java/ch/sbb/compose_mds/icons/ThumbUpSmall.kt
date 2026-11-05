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

public val SBBIcons.ThumbUpSmall: ImageVector
    get() {
        if (_thumbUpSmall != null) {
            return _thumbUpSmall!!
        }
        _thumbUpSmall = Builder(name = "ThumbUpSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(9.87f, 10.837f)
                lineToRelative(4.28f, -4.695f)
                arcToRelative(0.501f, 0.501f, 0.0f, false, true, 0.821f, 0.526f)
                lineToRelative(-1.436f, 3.65f)
                lineToRelative(-0.27f, 0.682f)
                horizontalLineTo(17.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, 1.0f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, 1.0f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, 1.0f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                verticalLineToRelative(0.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.716f, 0.0f, -1.328f, -0.122f, -1.758f, -0.457f)
                curveToRelative(-0.403f, -0.313f, -0.739f, -0.89f, -0.742f, -2.026f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(0.72f)
                close()
                moveTo(8.0f, 10.001f)
                horizontalLineToRelative(1.28f)
                lineToRelative(4.14f, -4.543f)
                lineToRelative(0.008f, -0.008f)
                lineToRelative(0.008f, -0.008f)
                arcToRelative(1.502f, 1.502f, 0.0f, false, true, 2.47f, 1.583f)
                lineToRelative(-0.003f, 0.005f)
                lineTo(14.734f, 10.0f)
                horizontalLineTo(17.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.118f, 2.5f)
                curveToRelative(0.238f, 0.266f, 0.382f, 0.616f, 0.382f, 1.0f)
                reflectiveCurveToRelative(-0.144f, 0.735f, -0.382f, 1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -0.723f, 2.448f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.5f, 19.0f)
                verticalLineToRelative(-0.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.792f, 0.0f, -1.68f, -0.128f, -2.373f, -0.668f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 9.0f, 18.226f)
                verticalLineToRelative(0.783f)
                horizontalLineTo(4.999f)
                verticalLineToRelative(-9.008f)
                horizontalLineTo(8.0f)
                moveToRelative(0.0f, 1.0f)
                horizontalLineTo(5.999f)
                verticalLineToRelative(7.008f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(-7.008f)
            }
        }
        .build()
        return _thumbUpSmall!!
    }

private var _thumbUpSmall: ImageVector? = null
