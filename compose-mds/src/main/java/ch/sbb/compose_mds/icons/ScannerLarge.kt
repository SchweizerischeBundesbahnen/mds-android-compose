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

public val SBBIcons.ScannerLarge: ImageVector
    get() {
        if (_scannerLarge != null) {
            return _scannerLarge!!
        }
        _scannerLarge = Builder(
            name = "ScannerLarge",
            defaultWidth = 48.0.dp,
            defaultHeight =
                48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
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
                moveTo(38.5f, 6.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 41.0f, 8.5f)
                verticalLineToRelative(4.118f)
                lineToRelative(-3.96f, 7.92f)
                lineToRelative(3.935f, 11.804f)
                lineToRelative(0.025f, 0.077f)
                lineTo(41.0f, 38.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, 2.5f)
                horizontalLineToRelative(-30.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 6.0f, 38.5f)
                verticalLineToRelative(-6.081f)
                lineToRelative(0.025f, -0.077f)
                lineTo(9.96f, 20.538f)
                lineTo(6.0f, 12.618f)
                lineTo(6.0f, 8.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 8.5f, 6.0f)
                close()
                moveTo(7.0f, 38.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.5f, 40.0f)
                horizontalLineToRelative(30.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                lineTo(40.0f, 33.0f)
                lineTo(7.0f, 33.0f)
                close()
                moveTo(12.5f, 35.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveTo(30.0f, 37.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(36.0f, 37.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(7.194f, 32.0f)
                horizontalLineToRelative(32.612f)
                lineTo(36.14f, 21.0f)
                lineTo(10.86f, 21.0f)
                close()
                moveTo(10.81f, 20.0f)
                horizontalLineToRelative(25.38f)
                lineToRelative(3.5f, -7.0f)
                lineTo(7.31f, 13.0f)
                close()
                moveTo(8.5f, 7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 7.0f, 8.5f)
                lineTo(7.0f, 12.0f)
                horizontalLineToRelative(33.0f)
                lineTo(40.0f, 8.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 38.5f, 7.0f)
                close()
            }
        }
            .build()
        return _scannerLarge!!
    }

private var _scannerLarge: ImageVector? = null
