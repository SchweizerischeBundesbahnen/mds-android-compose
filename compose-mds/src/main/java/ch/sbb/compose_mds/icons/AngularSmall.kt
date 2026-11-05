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

public val SBBIcons.AngularSmall: ImageVector
    get() {
        if (_angularSmall != null) {
            return _angularSmall!!
        }
        _angularSmall = Builder(
            name = "AngularSmall",
            defaultWidth = 24.0.dp,
            defaultHeight =
                24.0.dp,
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
                moveTo(12.158f, 2.026f)
                lineTo(12.0f, 1.973f)
                lineToRelative(-0.158f, 0.053f)
                lineToRelative(-9.0f, 3.0f)
                lineToRelative(-0.389f, 0.13f)
                lineToRelative(0.05f, 0.406f)
                lineToRelative(1.5f, 12.0f)
                lineToRelative(0.033f, 0.257f)
                lineToRelative(0.229f, 0.122f)
                lineToRelative(7.5f, 4.0f)
                lineToRelative(0.235f, 0.126f)
                lineToRelative(0.235f, -0.126f)
                lineToRelative(7.5f, -4.0f)
                lineToRelative(0.229f, -0.122f)
                lineToRelative(0.023f, -0.185f)
                lineToRelative(0.032f, -0.253f)
                lineToRelative(1.477f, -11.756f)
                lineToRelative(-0.008f, -0.001f)
                lineToRelative(0.008f, -0.062f)
                lineToRelative(0.051f, -0.407f)
                lineToRelative(-0.389f, -0.13f)
                close()
                moveTo(19.058f, 17.005f)
                lineTo(20.453f, 5.845f)
                lineTo(12.5f, 3.194f)
                lineTo(12.5f, 6.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(11.5f, 3.194f)
                lineToRelative(-7.953f, 2.65f)
                lineToRelative(1.417f, 11.337f)
                lineToRelative(6.536f, 3.486f)
                lineTo(11.5f, 14.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(6.13f)
                close()
                moveTo(12.0f, 7.057f)
                lineToRelative(0.424f, 0.678f)
                lineToRelative(5.0f, 8.0f)
                lineToRelative(-0.848f, 0.53f)
                lineToRelative(-1.728f, -2.765f)
                lineTo(9.152f, 13.5f)
                lineToRelative(-1.728f, 2.765f)
                lineToRelative(-0.848f, -0.53f)
                lineToRelative(5.0f, -8.0f)
                close()
                moveTo(9.777f, 12.5f)
                lineTo(12.0f, 8.943f)
                lineToRelative(2.223f, 3.557f)
                close()
            }
        }
            .build()
        return _angularSmall!!
    }

private var _angularSmall: ImageVector? = null
