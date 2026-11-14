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

public val SBBIcons.UserTieMedium: ImageVector
    get() {
        if (_userTieMedium != null) {
            return _userTieMedium!!
        }
        _userTieMedium = Builder(name = "UserTieMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.0f, 13.5f)
                curveToRelative(0.0f, -2.698f, -1.86f, -4.75f, -4.0f, -4.75f)
                reflectiveCurveToRelative(-4.0f, 2.052f, -4.0f, 4.75f)
                reflectiveCurveToRelative(1.86f, 4.75f, 4.0f, 4.75f)
                reflectiveCurveToRelative(4.0f, -2.052f, 4.0f, -4.75f)
                moveToRelative(1.0f, 0.0f)
                curveToRelative(0.0f, 1.46f, -0.48f, 2.82f, -1.285f, 3.85f)
                curveToRelative(4.25f, 1.939f, 6.535f, 7.126f, 6.535f, 11.9f)
                verticalLineToRelative(0.5f)
                lineTo(7.75f, 29.75f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -4.747f, 2.281f, -9.95f, 6.535f, -11.9f)
                curveTo(13.48f, 16.32f, 13.0f, 14.96f, 13.0f, 13.5f)
                curveToRelative(0.0f, -3.1f, 2.169f, -5.75f, 5.0f, -5.75f)
                reflectiveCurveToRelative(5.0f, 2.65f, 5.0f, 5.75f)
                moveToRelative(-4.126f, 5.664f)
                arcToRelative(4.45f, 4.45f, 0.0f, false, true, -1.752f, -0.001f)
                lineTo(18.0f, 20.217f)
                close()
                moveTo(14.972f, 18.142f)
                curveToRelative(-3.795f, 1.57f, -6.055f, 6.13f, -6.212f, 10.608f)
                horizontalLineToRelative(8.783f)
                lineToRelative(-1.597f, -1.597f)
                lineToRelative(0.069f, -0.274f)
                lineToRelative(1.437f, -5.754f)
                close()
                moveTo(18.457f, 28.75f)
                horizontalLineToRelative(8.784f)
                curveToRelative(-0.157f, -4.505f, -2.422f, -9.052f, -6.217f, -10.61f)
                lineToRelative(-2.478f, 2.984f)
                lineToRelative(1.44f, 5.755f)
                lineToRelative(0.068f, 0.274f)
                close()
                moveTo(18.0f, 27.793f)
                lineToRelative(-0.946f, -0.946f)
                lineToRelative(0.946f, -3.783f)
                lineToRelative(0.945f, 3.783f)
                close()
            }
        }
        .build()
        return _userTieMedium!!
    }

private var _userTieMedium: ImageVector? = null
