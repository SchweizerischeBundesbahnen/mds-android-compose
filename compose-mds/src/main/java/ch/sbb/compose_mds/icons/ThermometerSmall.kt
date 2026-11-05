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

public val SBBIcons.ThermometerSmall: ImageVector
    get() {
        if (_thermometerSmall != null) {
            return _thermometerSmall!!
        }
        _thermometerSmall = Builder(
            name = "ThermometerSmall",
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
                pathFillType = NonZero,
            ) {
                moveTo(14.0f, 14.884f)
                arcTo(3.99f, 3.99f, 0.0f, false, true, 15.5f, 18.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                curveToRelative(0.0f, -1.264f, 0.589f, -2.385f, 1.5f, -3.116f)
                lineTo(9.0f, 3.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(10.0f, 15.394f)
                lineTo(9.786f, 15.543f)
                arcTo(2.99f, 2.99f, 0.0f, false, false, 8.5f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 6.0f, 0.0f)
                curveToRelative(0.0f, -0.953f, -0.447f, -1.8f, -1.144f, -2.35f)
                lineToRelative(-0.142f, -0.107f)
                lineToRelative(-0.214f, -0.15f)
                lineTo(13.0f, 4.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(12.0f, 16.065f)
                arcTo(1.999f, 1.999f, 0.0f, true, true, 9.5f, 18.0f)
                curveToRelative(0.0f, -0.932f, 0.638f, -1.712f, 1.5f, -1.935f)
                lineTo(11.0f, 8.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(11.5f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(5.5f, -4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(17.0f, 11.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(17.0f, 9.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(15.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(17.0f, 7.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(15.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
            .build()
        return _thermometerSmall!!
    }

private var _thermometerSmall: ImageVector? = null
