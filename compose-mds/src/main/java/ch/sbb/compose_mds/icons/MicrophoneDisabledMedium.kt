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

public val SBBIcons.MicrophoneDisabledMedium: ImageVector
    get() {
        if (_microphoneDisabledMedium != null) {
            return _microphoneDisabledMedium!!
        }
        _microphoneDisabledMedium = Builder(name = "MicrophoneDisabledMedium", defaultWidth =
                36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.25f, 8.25f)
                curveToRelative(0.0f, -2.199f, 1.801f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.801f, 4.0f, 4.0f)
                lineTo(21.25f, 18.0f)
                horizontalLineToRelative(1.0f)
                lineTo(22.25f, 8.25f)
                curveToRelative(0.0f, -2.751f, -2.249f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.249f, -5.0f, 5.0f)
                lineTo(12.25f, 9.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(24.133f, 24.84f)
                lineTo(31.147f, 31.854f)
                lineTo(31.854f, 31.146f)
                lineTo(4.854f, 4.146f)
                lineTo(4.146f, 4.854f)
                lineTo(12.25f, 12.957f)
                verticalLineToRelative(7.293f)
                curveToRelative(0.0f, 2.751f, 2.249f, 5.0f, 5.0f, 5.0f)
                arcToRelative(5.01f, 5.01f, 0.0f, false, false, 4.49f, -2.804f)
                lineToRelative(1.667f, 1.668f)
                curveToRelative(-1.16f, 1.95f, -3.442f, 3.136f, -6.157f, 3.136f)
                curveToRelative(-3.938f, 0.0f, -7.0f, -2.451f, -7.0f, -6.25f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, 4.312f, 3.377f, 7.034f, 7.5f, 7.238f)
                verticalLineToRelative(3.512f)
                lineTo(13.5f, 31.75f)
                verticalLineToRelative(1.0f)
                lineTo(21.0f, 32.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.25f)
                verticalLineToRelative(-3.512f)
                curveToRelative(2.697f, -0.134f, 5.06f, -1.35f, 6.383f, -3.398f)
                moveTo(13.25f, 20.25f)
                verticalLineToRelative(-6.293f)
                lineToRelative(7.731f, 7.731f)
                arcToRelative(4.02f, 4.02f, 0.0f, false, true, -3.73f, 2.562f)
                curveToRelative(-2.2f, 0.0f, -4.0f, -1.801f, -4.0f, -4.0f)
            }
        }
        .build()
        return _microphoneDisabledMedium!!
    }

private var _microphoneDisabledMedium: ImageVector? = null
