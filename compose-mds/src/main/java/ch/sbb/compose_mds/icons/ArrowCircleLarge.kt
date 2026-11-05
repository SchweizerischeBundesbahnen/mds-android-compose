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

public val SBBIcons.ArrowCircleLarge: ImageVector
    get() {
        if (_arrowCircleLarge != null) {
            return _arrowCircleLarge!!
        }
        _arrowCircleLarge = Builder(name = "ArrowCircleLarge", defaultWidth = 48.0.dp, defaultHeight
                = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.5f, 8.999f)
                curveToRelative(6.08f, 0.0f, 11.763f, 3.357f, 14.5f, 8.209f)
                verticalLineTo(10.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(10.0f)
                horizontalLineTo(30.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(8.768f)
                curveTo(36.57f, 13.803f, 30.782f, 9.999f, 24.5f, 9.999f)
                curveToRelative(-8.422f, 0.0f, -14.5f, 6.078f, -14.5f, 14.5f)
                curveToRelative(0.0f, 8.424f, 6.078f, 14.5f, 14.5f, 14.5f)
                curveToRelative(7.079f, 0.0f, 12.482f, -4.288f, 14.043f, -10.622f)
                lineToRelative(0.485f, 0.12f)
                lineToRelative(0.486f, 0.12f)
                curveTo(37.839f, 35.413f, 32.02f, 39.998f, 24.5f, 39.998f)
                curveToRelative(-8.974f, 0.0f, -15.5f, -6.524f, -15.5f, -15.5f)
                curveToRelative(0.0f, -8.974f, 6.526f, -15.5f, 15.5f, -15.5f)
            }
        }
        .build()
        return _arrowCircleLarge!!
    }

private var _arrowCircleLarge: ImageVector? = null
