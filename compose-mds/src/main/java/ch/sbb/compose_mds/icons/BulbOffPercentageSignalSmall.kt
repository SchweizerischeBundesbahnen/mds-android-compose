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

public val SBBIcons.BulbOffPercentageSignalSmall: ImageVector
    get() {
        if (_bulbOffPercentageSignalSmall != null) {
            return _bulbOffPercentageSignalSmall!!
        }
        _bulbOffPercentageSignalSmall = Builder(name = "BulbOffPercentageSignalSmall", defaultWidth
                = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.374f, 13.426f)
                lineToRelative(-7.0f, 7.875f)
                lineToRelative(-0.748f, -0.664f)
                lineToRelative(7.0f, -7.875f)
                close()
                moveTo(17.5f, 18.03f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveTo(8.001f, 8.0f)
                arcToRelative(4.98f, 4.98f, 0.0f, false, true, 4.872f, 3.862f)
                lineToRelative(-0.975f, 0.224f)
                arcTo(3.98f, 3.98f, 0.0f, false, false, 8.001f, 9.0f)
                curveToRelative(-2.224f, 0.0f, -4.0f, 1.776f, -4.0f, 4.0f)
                curveToRelative(0.0f, 1.456f, 0.836f, 2.765f, 2.041f, 3.5f)
                lineTo(11.0f, 16.5f)
                verticalLineToRelative(2.955f)
                lineToRelative(-0.335f, 0.117f)
                lineTo(9.0f, 20.154f)
                lineTo(9.0f, 21.0f)
                lineTo(7.0f, 21.0f)
                verticalLineToRelative(-0.846f)
                lineToRelative(-1.665f, -0.582f)
                lineTo(5.0f, 19.455f)
                lineTo(5.0f, 16.99f)
                curveToRelative(-1.189f, -0.934f, -1.999f, -2.372f, -1.999f, -3.99f)
                curveToRelative(0.0f, -2.776f, 2.224f, -5.0f, 5.0f, -5.0f)
                moveTo(17.5f, 19.031f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveTo(6.0f, 18.745f)
                lineToRelative(1.665f, 0.583f)
                lineToRelative(0.335f, 0.117f)
                lineToRelative(0.335f, -0.117f)
                lineTo(10.0f, 18.745f)
                lineTo(10.0f, 17.5f)
                lineTo(6.0f, 17.5f)
                close()
                moveTo(13.5f, 13.031f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveTo(14.0f, 2.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -9.0f, -9.0f)
                close()
                moveTo(16.0f, 2.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -7.0f, -7.0f)
                close()
                moveTo(18.0f, 2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -5.0f, -5.0f)
                close()
                moveTo(20.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _bulbOffPercentageSignalSmall!!
    }

private var _bulbOffPercentageSignalSmall: ImageVector? = null
