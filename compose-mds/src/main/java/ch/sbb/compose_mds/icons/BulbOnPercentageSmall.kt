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

public val SBBIcons.BulbOnPercentageSmall: ImageVector
    get() {
        if (_bulbOnPercentageSmall != null) {
            return _bulbOnPercentageSmall!!
        }
        _bulbOnPercentageSmall = Builder(name = "BulbOnPercentageSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.374f, 12.426f)
                lineToRelative(-7.0f, 7.875f)
                lineToRelative(-0.748f, -0.664f)
                lineToRelative(7.0f, -7.875f)
                close()
                moveTo(19.5f, 17.03f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveTo(10.001f, 7.0f)
                arcToRelative(4.98f, 4.98f, 0.0f, false, true, 4.872f, 3.862f)
                lineToRelative(-0.974f, 0.224f)
                arcTo(3.98f, 3.98f, 0.0f, false, false, 10.0f, 8.0f)
                curveToRelative(-2.224f, 0.0f, -4.0f, 1.776f, -4.0f, 4.0f)
                curveToRelative(0.0f, 1.456f, 0.836f, 2.765f, 2.041f, 3.5f)
                lineTo(13.0f, 15.5f)
                verticalLineToRelative(2.955f)
                lineToRelative(-0.335f, 0.117f)
                lineToRelative(-1.665f, 0.582f)
                lineTo(11.0f, 20.0f)
                lineTo(9.0f, 20.0f)
                verticalLineToRelative(-0.846f)
                lineToRelative(-1.665f, -0.582f)
                lineTo(7.0f, 18.455f)
                lineTo(7.0f, 15.99f)
                curveToRelative(-1.189f, -0.934f, -1.999f, -2.372f, -1.999f, -3.99f)
                curveToRelative(0.0f, -2.776f, 2.224f, -5.0f, 5.0f, -5.0f)
                moveToRelative(9.5f, 11.031f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveTo(8.0f, 17.745f)
                lineToRelative(1.664f, 0.583f)
                lineToRelative(0.335f, 0.117f)
                lineToRelative(0.335f, -0.117f)
                lineTo(12.0f, 17.745f)
                lineTo(12.0f, 16.5f)
                lineTo(8.0f, 16.5f)
                close()
                moveTo(4.61f, 15.686f)
                lineToRelative(-1.311f, 0.78f)
                lineToRelative(-0.51f, -0.859f)
                lineToRelative(1.309f, -0.78f)
                close()
                moveTo(15.5f, 12.031f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveTo(3.501f, 12.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.5f)
                close()
                moveTo(4.662f, 8.394f)
                lineTo(4.122f, 9.234f)
                lineTo(2.84f, 8.41f)
                lineToRelative(0.541f, -0.84f)
                close()
                moveTo(17.086f, 8.389f)
                lineTo(15.804f, 9.097f)
                lineTo(15.32f, 8.221f)
                lineTo(16.604f, 7.513f)
                close()
                moveTo(7.196f, 6.102f)
                lineTo(6.319f, 6.584f)
                lineTo(5.61f, 5.294f)
                lineTo(6.486f, 4.813f)
                close()
                moveTo(14.385f, 5.29f)
                lineTo(13.684f, 6.577f)
                lineTo(12.806f, 6.099f)
                lineTo(13.508f, 4.812f)
                close()
                moveTo(10.5f, 5.5f)
                horizontalLineToRelative(-1.0f)
                lineTo(9.5f, 4.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _bulbOnPercentageSmall!!
    }

private var _bulbOnPercentageSmall: ImageVector? = null
