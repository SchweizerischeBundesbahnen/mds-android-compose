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

public val SBBIcons.HeartFilledMedium: ImageVector
    get() {
        if (_heartFilledMedium != null) {
            return _heartFilledMedium!!
        }
        _heartFilledMedium = Builder(
            name = "HeartFilledMedium",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(23.25f, 6.25f)
                arcToRelative(7.97f, 7.97f, 0.0f, false, true, 7.519f, 5.243f)
                lineToRelative(0.11f, 0.325f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.371f, 2.427f)
                curveToRelative(0.0f, 1.45f, -0.38f, 2.81f, -1.048f, 3.98f)
                curveToRelative(-0.235f, 0.415f, -0.9f, 1.27f, -1.168f, 1.593f)
                lineToRelative(-0.014f, 0.02f)
                lineToRelative(-0.018f, 0.016f)
                lineToRelative(-11.398f, 11.4f)
                lineToRelative(-0.354f, 0.354f)
                lineToRelative(-0.354f, -0.354f)
                lineTo(5.483f, 19.84f)
                lineToRelative(-0.007f, -0.008f)
                lineToRelative(0.36f, -0.346f)
                verticalLineToRelative(-0.002f)
                lineToRelative(-0.36f, 0.348f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.267f, -1.75f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.968f, -3.836f)
                arcTo(7.975f, 7.975f, 0.0f, false, true, 11.25f, 6.25f)
                arcToRelative(7.94f, 7.94f, 0.0f, false, true, 6.004f, 2.736f)
                arcTo(7.91f, 7.91f, 0.0f, false, true, 23.25f, 6.25f)
            }
        }
            .build()
        return _heartFilledMedium!!
    }

private var _heartFilledMedium: ImageVector? = null
