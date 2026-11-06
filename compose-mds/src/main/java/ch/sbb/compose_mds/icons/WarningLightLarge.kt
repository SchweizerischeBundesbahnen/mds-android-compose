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

public val SBBIcons.WarningLightLarge: ImageVector
    get() {
        if (_warningLightLarge != null) {
            return _warningLightLarge!!
        }
        _warningLightLarge = Builder(name = "WarningLightLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(24.5f, 11.499f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(11.625f, 10.417f)
                lineTo(15.868f, 14.66f)
                lineTo(15.16f, 15.367f)
                lineTo(10.917f, 11.124f)
                close()
                moveTo(5.998f, 22.999f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(10.076f, 36.999f)
                horizontalLineToRelative(3.923f)
                lineTo(13.999f, 24.0f)
                curveToRelative(0.0f, -5.521f, 4.477f, -10.0f, 10.0f, -10.0f)
                curveToRelative(5.524f, 0.0f, 10.0f, 4.479f, 10.0f, 10.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(3.924f)
                lineToRelative(0.07f, 0.418f)
                lineToRelative(1.0f, 6.0f)
                lineToRelative(0.097f, 0.583f)
                lineTo(8.91f, 44.001f)
                lineToRelative(0.096f, -0.583f)
                lineToRelative(1.0f, -6.0f)
                close()
                moveTo(32.999f, 36.999f)
                lineTo(32.999f, 24.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -18.0f, 0.0f)
                verticalLineToRelative(13.0f)
                lineTo(21.0f, 37.0f)
                verticalLineToRelative(-7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.002f)
                verticalLineToRelative(0.004f)
                lineTo(26.999f, 37.0f)
                close()
                moveTo(21.999f, 29.999f)
                lineTo(22.0f, 37.0f)
                lineTo(26.0f, 37.0f)
                verticalLineToRelative(-6.998f)
                arcTo(2.0f, 2.0f, 0.0f, true, false, 22.0f, 30.0f)
                moveToRelative(-11.076f, 8.0f)
                lineToRelative(-0.833f, 5.0f)
                horizontalLineToRelative(27.82f)
                lineToRelative(-0.834f, -5.0f)
                close()
                moveTo(24.0f, 17.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -7.0f, 7.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                close()
                moveTo(42.0f, 24.002f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(32.84f, 15.369f)
                lineTo(37.082f, 11.127f)
                lineTo(36.375f, 10.42f)
                lineTo(32.132f, 14.662f)
                close()
            }
        }
        .build()
        return _warningLightLarge!!
    }

private var _warningLightLarge: ImageVector? = null
