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

public val SBBIcons.StrollerSmall: ImageVector
    get() {
        if (_strollerSmall != null) {
            return _strollerSmall!!
        }
        _strollerSmall = Builder(name = "StrollerSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                moveToRelative(7.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                moveToRelative(-4.004f, -7.003f)
                horizontalLineToRelative(5.984f)
                arcToRelative(6.495f, 6.495f, 0.0f, false, false, -5.978f, -5.976f)
                close()
                moveTo(18.992f, 12.0f)
                lineTo(5.998f, 12.0f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 0.894f, 0.618f, 1.791f, 1.457f, 2.229f)
                arcTo(1.997f, 1.997f, 0.0f, false, true, 10.73f, 17.0f)
                horizontalLineToRelative(3.54f)
                arcToRelative(1.997f, 1.997f, 0.0f, false, true, 3.274f, -0.271f)
                curveToRelative(0.834f, -0.437f, 1.448f, -1.333f, 1.448f, -2.229f)
                close()
                moveTo(19.992f, 14.5f)
                curveToRelative(0.0f, 1.327f, -0.877f, 2.551f, -2.027f, 3.136f)
                quadToRelative(0.034f, 0.177f, 0.035f, 0.364f)
                curveToRelative(0.0f, 1.106f, -0.894f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.894f, -2.0f, -2.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -3.966f, -0.364f)
                curveToRelative(-1.071f, -0.543f, -1.911f, -1.639f, -2.023f, -2.859f)
                lineToRelative(-0.013f, -0.277f)
                lineTo(4.998f, 9.0f)
                lineTo(2.0f, 9.0f)
                lineTo(2.0f, 8.0f)
                horizontalLineToRelative(3.998f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(5.998f)
                lineToRelative(0.007f, -6.501f)
                lineTo(12.003f, 4.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(7.495f, 7.495f, 0.0f, false, true, 7.478f, 7.0f)
                horizontalLineToRelative(0.011f)
                verticalLineToRelative(0.188f)
                quadToRelative(0.007f, 0.154f, 0.008f, 0.31f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-0.008f)
                close()
            }
        }
        .build()
        return _strollerSmall!!
    }

private var _strollerSmall: ImageVector? = null
