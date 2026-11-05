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

public val SBBIcons.ScannerMedium: ImageVector
    get() {
        if (_scannerMedium != null) {
            return _scannerMedium!!
        }
        _scannerMedium = Builder(name = "ScannerMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.25f, 5.75f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, 1.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(24.5f)
                verticalLineToRelative(-2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                close()
                moveTo(8.559f, 15.25f)
                lineTo(6.059f, 10.25f)
                horizontalLineToRelative(23.882f)
                lineToRelative(-2.5f, 5.0f)
                close()
                moveTo(8.61f, 16.25f)
                lineTo(5.944f, 24.25f)
                horizontalLineToRelative(24.112f)
                lineToRelative(-2.666f, -8.0f)
                close()
                moveTo(5.75f, 28.75f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(24.5f)
                verticalLineToRelative(3.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                lineTo(7.25f, 30.25f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, -1.5f)
                moveToRelative(-1.0f, -21.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, -2.5f)
                horizontalLineToRelative(21.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, 2.5f)
                verticalLineToRelative(2.618f)
                lineToRelative(-0.053f, 0.106f)
                lineToRelative(-2.907f, 5.814f)
                lineToRelative(2.934f, 8.804f)
                lineToRelative(0.026f, 0.077f)
                verticalLineToRelative(4.081f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, 2.5f)
                lineTo(7.25f, 31.25f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, -2.5f)
                verticalLineToRelative(-4.081f)
                lineToRelative(0.026f, -0.077f)
                lineToRelative(2.934f, -8.804f)
                lineToRelative(-2.907f, -5.814f)
                lineToRelative(-0.053f, -0.106f)
                lineTo(4.75f, 7.25f)
                moveToRelative(19.25f, 21.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _scannerMedium!!
    }

private var _scannerMedium: ImageVector? = null
