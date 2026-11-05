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

public val SBBIcons.ScannerSmall: ImageVector
    get() {
        if (_scannerSmall != null) {
            return _scannerSmall!!
        }
        _scannerSmall = Builder(
            name = "ScannerSmall",
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
                moveTo(5.5f, 4.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 4.0f, 5.5f)
                lineTo(4.0f, 6.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-0.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 18.5f, 4.0f)
                close()
                moveTo(5.809f, 10.0f)
                lineTo(4.309f, 7.0f)
                horizontalLineToRelative(15.382f)
                lineToRelative(-1.5f, 3.0f)
                close()
                moveTo(5.86f, 11.0f)
                lineTo(4.194f, 16.0f)
                horizontalLineToRelative(15.612f)
                lineToRelative(-1.666f, -5.0f)
                close()
                moveTo(4.0f, 18.5f)
                lineTo(4.0f, 17.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-13.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.0f, 18.5f)
                moveToRelative(-1.0f, -13.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 5.5f, 3.0f)
                horizontalLineToRelative(13.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 21.0f, 5.5f)
                verticalLineToRelative(1.118f)
                lineToRelative(-0.053f, 0.106f)
                lineToRelative(-1.907f, 3.814f)
                lineToRelative(1.934f, 5.804f)
                lineToRelative(0.026f, 0.077f)
                lineTo(21.0f, 18.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, 2.5f)
                horizontalLineToRelative(-13.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 3.0f, 18.5f)
                verticalLineToRelative(-2.081f)
                lineToRelative(0.026f, -0.077f)
                lineToRelative(1.934f, -5.804f)
                lineToRelative(-1.907f, -3.814f)
                lineTo(3.0f, 6.618f)
                lineTo(3.0f, 5.5f)
                moveTo(16.0f, 19.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
            .build()
        return _scannerSmall!!
    }

private var _scannerSmall: ImageVector? = null
