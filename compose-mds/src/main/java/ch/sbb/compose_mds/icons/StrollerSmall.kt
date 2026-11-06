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

public val SBBIcons.StrollerSmall: ImageVector
    get() {
        if (_strollerSmall != null) {
            return _strollerSmall!!
        }
        _strollerSmall = Builder(name = "StrollerSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.004f, 4.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(7.497f, 7.497f, 0.0f, false, true, 7.48f, 7.0f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.142f)
                quadToRelative(0.008f, 0.177f, 0.008f, 0.355f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-0.008f)
                lineTo(19.992f, 14.5f)
                curveToRelative(0.0f, 1.326f, -0.875f, 2.552f, -2.025f, 3.137f)
                quadTo(18.0f, 17.813f, 18.0f, 18.0f)
                curveToRelative(0.0f, 1.106f, -0.894f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.894f, -2.0f, -2.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -3.967f, -0.363f)
                curveToRelative(-1.152f, -0.583f, -2.035f, -1.809f, -2.035f, -3.137f)
                lineTo(4.998f, 9.0f)
                lineTo(2.0f, 9.0f)
                lineTo(2.0f, 8.0f)
                horizontalLineToRelative(3.998f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(5.998f)
                lineToRelative(0.007f, -6.5f)
                close()
                moveTo(18.981f, 10.997f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -5.978f, -5.978f)
                lineToRelative(-0.007f, 5.978f)
                close()
                moveTo(18.991f, 12.0f)
                lineTo(5.999f, 12.0f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 0.894f, 0.617f, 1.793f, 1.457f, 2.23f)
                arcToRelative(1.998f, 1.998f, 0.0f, false, true, 3.278f, 0.27f)
                horizontalLineToRelative(3.534f)
                arcToRelative(1.998f, 1.998f, 0.0f, false, true, 3.278f, -0.27f)
                curveToRelative(0.834f, -0.437f, 1.447f, -1.334f, 1.447f, -2.23f)
                close()
                moveTo(9.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.001f, 2.001f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 17.0f)
                moveToRelative(7.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
            }
        }
        .build()
        return _strollerSmall!!
    }

private var _strollerSmall: ImageVector? = null
