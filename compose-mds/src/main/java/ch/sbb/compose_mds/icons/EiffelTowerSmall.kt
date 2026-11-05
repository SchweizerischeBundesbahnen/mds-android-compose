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

public val SBBIcons.EiffelTowerSmall: ImageVector
    get() {
        if (_eiffelTowerSmall != null) {
            return _eiffelTowerSmall!!
        }
        _eiffelTowerSmall = Builder(
            name = "EiffelTowerSmall",
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
                moveTo(11.5f, 2.0f)
                horizontalLineToRelative(-0.449f)
                lineToRelative(-0.048f, 0.446f)
                arcToRelative(72.6f, 72.6f, 0.0f, false, true, -2.9f, 13.903f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -2.047f, 4.921f)
                lineToRelative(-0.378f, 0.73f)
                lineTo(10.5f, 22.0f)
                verticalLineToRelative(-0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(4.83f)
                lineToRelative(-0.388f, -0.734f)
                curveToRelative(-1.865f, -3.524f, -3.104f, -8.216f, -3.877f, -12.057f)
                arcToRelative(85.0f, 85.0f, 0.0f, false, true, -1.01f, -6.246f)
                lineToRelative(-0.044f, -0.383f)
                lineToRelative(-0.01f, -0.098f)
                lineToRelative(-0.003f, -0.025f)
                lineTo(12.998f, 2.45f)
                lineToRelative(-0.498f, 0.05f)
                lineToRelative(0.497f, -0.05f)
                lineToRelative(-0.045f, -0.45f)
                lineTo(11.5f, 2.0f)
                moveToRelative(0.447f, 1.0f)
                horizontalLineToRelative(0.106f)
                lineToRelative(0.01f, 0.081f)
                arcTo(69.0f, 69.0f, 0.0f, false, false, 12.318f, 5.0f)
                horizontalLineToRelative(-0.628f)
                quadToRelative(0.142f, -0.998f, 0.256f, -2.0f)
                moveToRelative(-0.405f, 3.0f)
                arcToRelative(74.0f, 74.0f, 0.0f, false, true, -0.959f, 5.0f)
                horizontalLineToRelative(2.84f)
                arcToRelative(85.174f, 85.174f, 0.0f, false, true, -0.95f, -5.0f)
                close()
                moveTo(13.652f, 12.0f)
                horizontalLineToRelative(-3.305f)
                arcToRelative(74.0f, 74.0f, 0.0f, false, true, -1.09f, 4.0f)
                horizontalLineToRelative(5.488f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, -1.093f, -4.0f)
                moveToRelative(1.419f, 5.0f)
                horizontalLineToRelative(-6.13f)
                arcToRelative(33.0f, 33.0f, 0.0f, false, true, -1.632f, 4.0f)
                horizontalLineToRelative(2.24f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 4.9f, 0.0f)
                horizontalLineToRelative(2.236f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, -1.614f, -4.0f)
            }
        }
            .build()
        return _eiffelTowerSmall!!
    }

private var _eiffelTowerSmall: ImageVector? = null
