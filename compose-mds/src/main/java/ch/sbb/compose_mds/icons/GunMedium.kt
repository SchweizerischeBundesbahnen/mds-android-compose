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

public val SBBIcons.GunMedium: ImageVector
    get() {
        if (_gunMedium != null) {
            return _gunMedium!!
        }
        _gunMedium = Builder(name = "GunMedium", defaultWidth = 36.0.dp, defaultHeight = 36.0.dp,
                viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(29.75f, 7.813f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.75f)
                horizontalLineToRelative(-22.0f)
                curveToRelative(-0.932f, 0.0f, -1.715f, 0.638f, -1.937f, 1.5f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(4.002f)
                curveToRelative(0.0f, 1.104f, 0.896f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(0.001f)
                lineToRelative(0.933f, -0.002f)
                lineToRelative(-1.43f, 11.44f)
                lineToRelative(-0.004f, 0.03f)
                verticalLineToRelative(0.032f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.086f, 0.0f, 1.97f, -0.867f, 1.997f, -1.948f)
                lineToRelative(0.685f, -5.483f)
                quadToRelative(0.197f, 0.02f, 0.45f, 0.027f)
                curveToRelative(0.6f, 0.014f, 1.425f, -0.048f, 2.288f, -0.365f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, false, 2.504f, -1.89f)
                curveToRelative(0.675f, -0.914f, 1.195f, -2.16f, 1.44f, -3.843f)
                horizontalLineToRelative(8.945f)
                lineToRelative(0.138f, -0.276f)
                lineToRelative(1.553f, -3.106f)
                verticalLineTo(11.75f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-1.561f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.439f, -1.437f)
                moveTo(6.254f, 27.689f)
                lineToRelative(0.496f, 0.063f)
                horizontalLineToRelative(0.004f)
                close()
                moveTo(30.252f, 9.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineTo(6.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(24.5f)
                close()
                moveTo(5.75f, 14.252f)
                verticalLineTo(13.25f)
                horizontalLineToRelative(24.19f)
                lineToRelative(-0.999f, 2.0f)
                horizontalLineTo(13.81f)
                lineToRelative(-0.055f, 0.438f)
                lineToRelative(-1.5f, 12.001f)
                lineToRelative(-0.004f, 0.032f)
                verticalLineToRelative(0.031f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.999f, -0.979f)
                lineToRelative(1.495f, -11.961f)
                lineToRelative(0.07f, -0.563f)
                lineToRelative(-0.567f, 0.001f)
                lineToRelative(-1.5f, 0.001f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.999f, -0.999f)
                moveToRelative(6.504f, 13.437f)
                lineToRelative(0.5f, 0.063f)
                horizontalLineToRelative(-0.004f)
                close()
                moveTo(31.25f, 10.75f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(0.499f)
                verticalLineToRelative(0.5f)
                close()
                moveTo(14.057f, 21.329f)
                quadToRelative(0.154f, 0.015f, 0.348f, 0.02f)
                arcToRelative(5.3f, 5.3f, 0.0f, false, false, 1.92f, -0.305f)
                arcTo(4.4f, 4.4f, 0.0f, false, false, 18.37f, 19.5f)
                curveToRelative(0.542f, -0.733f, 1.0f, -1.773f, 1.233f, -3.249f)
                horizontalLineToRelative(-4.912f)
                lineToRelative(-0.03f, 0.25f)
                horizontalLineToRelative(0.09f)
                curveToRelative(0.0f, 0.967f, 0.784f, 1.75f, 1.75f, 1.75f)
                verticalLineToRelative(1.0f)
                arcToRelative(2.74f, 2.74f, 0.0f, false, true, -2.068f, -0.937f)
                close()
            }
        }
        .build()
        return _gunMedium!!
    }

private var _gunMedium: ImageVector? = null
