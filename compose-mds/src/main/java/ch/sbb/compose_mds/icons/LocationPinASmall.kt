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

public val SBBIcons.LocationPinASmall: ImageVector
    get() {
        if (_locationPinASmall != null) {
            return _locationPinASmall!!
        }
        _locationPinASmall = Builder(
            name = "LocationPinASmall",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveTo(12.0f, 4.002f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(0.02f)
                curveToRelative(0.041f, 1.039f, 0.35f, 1.913f, 0.836f, 2.722f)
                lineToRelative(0.007f, 0.01f)
                lineToRelative(4.75f, 7.5f)
                lineToRelative(0.422f, 0.666f)
                lineToRelative(0.422f, -0.666f)
                lineToRelative(4.751f, -7.5f)
                lineToRelative(0.007f, -0.009f)
                lineToRelative(0.005f, -0.01f)
                curveToRelative(0.473f, -0.829f, 0.79f, -1.72f, 0.8f, -2.728f)
                verticalLineToRelative(-0.005f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                moveToRelative(-4.31f, 8.223f)
                curveToRelative(-0.409f, -0.684f, -0.655f, -1.392f, -0.69f, -2.233f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 17.0f, 10.0f)
                curveToRelative(-0.008f, 0.787f, -0.253f, 1.508f, -0.663f, 2.23f)
                lineToRelative(-4.322f, 6.822f)
                close()
                moveTo(11.984f, 6.9f)
                lineToRelative(1.193f, 3.217f)
                horizontalLineToRelative(-2.391f)
                close()
                moveTo(15.252f, 13.005f)
                lineTo(12.524f, 5.998f)
                horizontalLineToRelative(-1.036f)
                lineToRelative(-2.74f, 7.007f)
                horizontalLineToRelative(0.974f)
                lineToRelative(0.797f, -2.143f)
                horizontalLineToRelative(2.93f)
                lineToRelative(0.778f, 2.143f)
                close()
            }
        }
            .build()
        return _locationPinASmall!!
    }

private var _locationPinASmall: ImageVector? = null
