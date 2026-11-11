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

public val SBBIcons.ThumbDownSmall: ImageVector
    get() {
        if (_thumbDownSmall != null) {
            return _thumbDownSmall!!
        }
        _thumbDownSmall = Builder(name = "ThumbDownSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 13.008f)
                lineTo(8.0f, 6.0f)
                lineTo(5.999f, 6.0f)
                verticalLineToRelative(7.008f)
                close()
                moveTo(9.0f, 5.782f)
                lineTo(9.0f, 5.0f)
                lineTo(4.999f, 5.0f)
                verticalLineToRelative(9.008f)
                lineTo(9.28f, 14.008f)
                lineToRelative(4.14f, 4.542f)
                lineToRelative(0.008f, 0.007f)
                lineToRelative(0.007f, 0.008f)
                arcTo(1.498f, 1.498f, 0.0f, false, false, 16.0f, 17.51f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.053f, -0.397f)
                lineToRelative(-0.04f, -0.128f)
                lineToRelative(-0.004f, -0.007f)
                lineToRelative(-1.169f, -2.969f)
                lineTo(17.5f, 14.009f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.115f, -2.5f)
                arcToRelative(1.49f, 1.49f, 0.0f, false, false, 0.0f, -2.0f)
                arcToRelative(1.499f, 1.499f, 0.0f, false, false, -0.723f, -2.447f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.5f, 5.008f)
                horizontalLineToRelative(-4.999f)
                curveToRelative(-0.792f, 0.0f, -1.68f, 0.128f, -2.373f, 0.669f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.0f, 5.782f)
                moveTo(9.0f, 8.51f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(0.72f)
                lineToRelative(0.15f, 0.163f)
                lineToRelative(4.275f, 4.688f)
                lineToRelative(0.075f, 0.063f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.75f, -0.586f)
                verticalLineToRelative(-0.001f)
                lineToRelative(-1.435f, -3.644f)
                lineToRelative(-0.27f, -0.684f)
                lineTo(17.5f, 13.009f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, -1.0f)
                lineTo(16.0f, 12.009f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, -1.0f)
                lineTo(16.0f, 10.009f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, -1.0f)
                lineTo(16.0f, 8.009f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.716f, 0.0f, -1.328f, 0.123f, -1.758f, 0.458f)
                curveTo(9.338f, 6.78f, 9.0f, 7.36f, 9.0f, 8.509f)
            }
        }
        .build()
        return _thumbDownSmall!!
    }

private var _thumbDownSmall: ImageVector? = null
