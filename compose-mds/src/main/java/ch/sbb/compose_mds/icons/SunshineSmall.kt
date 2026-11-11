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

public val SBBIcons.SunshineSmall: ImageVector
    get() {
        if (_sunshineSmall != null) {
            return _sunshineSmall!!
        }
        _sunshineSmall = Builder(name = "SunshineSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.012f, 3.988f)
                verticalLineToRelative(3.014f)
                horizontalLineToRelative(-1.0f)
                lineTo(12.012f, 3.988f)
                close()
                moveTo(8.316f, 8.947f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(-2.277f, -2.278f)
                lineToRelative(-0.707f, 0.707f)
                close()
                moveTo(8.028f, 12.499f)
                curveTo(8.028f, 10.02f, 10.012f, 8.0f, 12.5f, 8.0f)
                curveToRelative(2.482f, 0.0f, 4.5f, 2.017f, 4.5f, 4.5f)
                arcToRelative(4.48f, 4.48f, 0.0f, false, true, -4.477f, 4.494f)
                arcTo(4.495f, 4.495f, 0.0f, false, true, 8.028f, 12.5f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(3.495f, 3.495f, 0.0f, false, false, 3.495f, 3.495f)
                arcTo(3.48f, 3.48f, 0.0f, false, false, 16.0f, 12.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                curveToRelative(-1.927f, 0.0f, -3.472f, 1.564f, -3.472f, 3.499f)
                moveTo(7.003f, 12.0f)
                verticalLineToRelative(1.0f)
                lineTo(4.0f, 13.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(16.745f, 9.001f)
                lineTo(19.008f, 6.763f)
                lineTo(18.305f, 6.053f)
                lineTo(16.042f, 8.291f)
                close()
                moveTo(21.0f, 13.0f)
                horizontalLineToRelative(-3.006f)
                verticalLineToRelative(-1.0f)
                lineTo(21.0f, 12.0f)
                close()
                moveTo(18.318f, 18.947f)
                lineTo(19.024f, 18.238f)
                lineTo(16.756f, 15.981f)
                lineTo(16.051f, 16.691f)
                close()
                moveTo(13.0f, 17.993f)
                verticalLineToRelative(3.003f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.003f)
                close()
                moveTo(6.749f, 19.016f)
                lineTo(9.01f, 16.755f)
                lineTo(8.303f, 16.048f)
                lineTo(6.042f, 18.308f)
                close()
            }
        }
        .build()
        return _sunshineSmall!!
    }

private var _sunshineSmall: ImageVector? = null
