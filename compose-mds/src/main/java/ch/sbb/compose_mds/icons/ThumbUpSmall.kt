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
                moveTo(14.5f, 6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.473f, 0.664f)
                lineToRelative(-1.438f, 3.653f)
                lineToRelative(-0.27f, 0.683f)
                lineTo(17.5f, 11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, 1.0f)
                lineTo(16.0f, 12.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, 1.0f)
                lineTo(16.0f, 14.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, 1.0f)
                lineTo(16.0f, 16.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.716f, 0.0f, -1.328f, -0.122f, -1.758f, -0.457f)
                curveTo(9.338f, 17.228f, 9.0f, 16.648f, 9.0f, 15.5f)
                lineTo(9.0f, 11.0f)
                horizontalLineToRelative(0.72f)
                lineToRelative(0.15f, -0.163f)
                lineToRelative(4.274f, -4.688f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 14.5f, 6.0f)
                moveTo(8.0f, 10.001f)
                horizontalLineToRelative(1.28f)
                lineToRelative(4.14f, -4.543f)
                lineToRelative(0.009f, -0.009f)
                lineToRelative(0.008f, -0.007f)
                arcToRelative(1.502f, 1.502f, 0.0f, false, true, 2.468f, 1.583f)
                lineToRelative(-0.002f, 0.006f)
                lineTo(14.734f, 10.0f)
                lineTo(17.5f, 10.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.116f, 2.5f)
                arcToRelative(1.494f, 1.494f, 0.0f, false, true, 0.0f, 2.0f)
                arcToRelative(1.499f, 1.499f, 0.0f, false, true, -0.724f, 2.446f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.5f, 19.0f)
                horizontalLineToRelative(-4.999f)
                curveToRelative(-0.792f, 0.0f, -1.68f, -0.129f, -2.373f, -0.669f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 9.0f, 18.227f)
                verticalLineToRelative(0.782f)
                lineTo(4.999f, 19.009f)
                lineTo(4.999f, 10.0f)
                close()
                moveTo(8.0f, 11.001f)
                lineTo(5.999f, 11.001f)
                verticalLineToRelative(7.008f)
                lineTo(8.0f, 18.009f)
                lineTo(8.0f, 11.0f)
            }
        }
        .build()
        return _thumbUpSmall!!
    }

private var _thumbUpSmall: ImageVector? = null
