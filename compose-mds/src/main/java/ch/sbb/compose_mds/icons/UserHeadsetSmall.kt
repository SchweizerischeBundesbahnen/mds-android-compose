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

public val SBBIcons.UserHeadsetSmall: ImageVector
    get() {
        if (_userHeadsetSmall != null) {
            return _userHeadsetSmall!!
        }
        _userHeadsetSmall = Builder(name = "UserHeadsetSmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.115f, 8.0f)
                horizontalLineToRelative(0.849f)
                curveToRelative(0.59f, -1.18f, 1.692f, -2.0f, 3.036f, -2.0f)
                reflectiveCurveToRelative(2.447f, 0.82f, 3.036f, 2.0f)
                horizontalLineToRelative(0.776f)
                curveTo(14.75f, 4.138f, 9.38f, 3.935f, 8.115f, 8.0f)
                moveToRelative(8.727f, 0.0f)
                horizontalLineTo(17.0f)
                curveToRelative(0.282f, 0.0f, 0.553f, 0.093f, 0.749f, 0.308f)
                curveToRelative(0.188f, 0.206f, 0.251f, 0.464f, 0.251f, 0.692f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.271f, -0.09f, 0.536f, -0.294f, 0.731f)
                curveToRelative(-0.2f, 0.192f, -0.459f, 0.269f, -0.706f, 0.269f)
                horizontalLineToRelative(-1.964f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.34f, 0.562f)
                curveToRelative(3.0f, 1.661f, 4.304f, 4.943f, 4.304f, 7.938f)
                verticalLineToRelative(0.5f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -3.384f, 1.6f, -6.451f, 4.301f, -7.94f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.337f, -0.56f)
                horizontalLineTo(7.0f)
                curveToRelative(-0.27f, 0.0f, -0.515f, -0.12f, -0.687f, -0.285f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 11.0f)
                verticalLineTo(9.006f)
                curveToRelative(0.0f, -0.293f, 0.135f, -0.543f, 0.308f, -0.712f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 8.0f)
                horizontalLineToRelative(0.075f)
                curveToRelative(1.388f, -5.377f, 8.61f, -5.218f, 9.767f, 0.0f)
                moveTo(14.5f, 10.0f)
                curveToRelative(0.0f, -1.741f, -1.172f, -3.0f, -2.5f, -3.0f)
                reflectiveCurveToRelative(-2.5f, 1.259f, -2.5f, 3.0f)
                reflectiveCurveToRelative(1.172f, 3.0f, 2.5f, 3.0f)
                curveToRelative(0.725f, 0.0f, 1.404f, -0.376f, 1.87f, -1.0f)
                horizontalLineTo(12.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.362f)
                quadToRelative(0.136f, -0.465f, 0.138f, -1.0f)
                moveTo(12.0f, 14.0f)
                curveToRelative(0.75f, 0.0f, 1.425f, -0.256f, 1.978f, -0.687f)
                curveToRelative(2.598f, 1.313f, 3.867f, 4.018f, 4.008f, 6.687f)
                horizontalLineTo(6.013f)
                curveToRelative(0.153f, -2.976f, 1.67f, -5.52f, 4.008f, -6.688f)
                arcTo(3.2f, 3.2f, 0.0f, false, false, 12.0f, 14.0f)
                moveTo(7.0f, 9.017f)
                lineToRelative(0.008f, -0.01f)
                lineTo(7.017f, 9.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-0.984f)
                lineToRelative(-0.002f, -0.001f)
                lineToRelative(-0.01f, -0.007f)
                lineToRelative(-0.003f, -0.005f)
                lineTo(7.0f, 10.985f)
                close()
                moveTo(16.0f, 11.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _userHeadsetSmall!!
    }

private var _userHeadsetSmall: ImageVector? = null
