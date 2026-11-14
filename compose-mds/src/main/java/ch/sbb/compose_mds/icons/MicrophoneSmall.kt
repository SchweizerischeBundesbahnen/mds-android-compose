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

public val SBBIcons.MicrophoneSmall: ImageVector
    get() {
        if (_microphoneSmall != null) {
            return _microphoneSmall!!
        }
        _microphoneSmall = Builder(name = "MicrophoneSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.5f, 3.0f)
                arcTo(2.51f, 2.51f, 0.0f, false, true, 14.0f, 5.5f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 1.373f, -1.126f, 2.5f, -2.5f, 2.5f)
                arcTo(2.51f, 2.51f, 0.0f, false, true, 9.0f, 13.5f)
                verticalLineToRelative(-8.0f)
                arcTo(2.51f, 2.51f, 0.0f, false, true, 11.5f, 3.0f)
                moveToRelative(0.0f, 14.0f)
                curveToRelative(1.926f, 0.0f, 3.5f, -1.574f, 3.5f, -3.5f)
                verticalLineToRelative(-8.0f)
                arcTo(3.51f, 3.51f, 0.0f, false, false, 11.5f, 2.0f)
                arcTo(3.51f, 3.51f, 0.0f, false, false, 8.0f, 5.5f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 1.926f, 1.574f, 3.5f, 3.5f, 3.5f)
                moveTo(9.0f, 21.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(18.98f)
                curveToRelative(-2.744f, -0.2f, -5.0f, -2.052f, -5.0f, -4.982f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.0f, 2.42f, 1.943f, 4.0f, 4.5f, 4.0f)
                reflectiveCurveToRelative(4.5f, -1.58f, 4.5f, -4.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.0f, 2.93f, -2.255f, 4.782f, -5.0f, 4.982f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _microphoneSmall!!
    }

private var _microphoneSmall: ImageVector? = null
