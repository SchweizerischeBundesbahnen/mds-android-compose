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

public val SBBIcons.TrashLarge: ImageVector
    get() {
        if (_trashLarge != null) {
            return _trashLarge!!
        }
        _trashLarge = Builder(
            name = "TrashLarge",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
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
                moveTo(27.43f, 4.01f)
                curveToRelative(0.813f, 0.0f, 1.57f, 0.604f, 1.57f, 1.46f)
                verticalLineToRelative(1.643f)
                quadToRelative(5.102f, 0.205f, 10.178f, 0.79f)
                lineToRelative(1.38f, 0.16f)
                lineToRelative(0.442f, 0.051f)
                lineTo(41.0f, 12.0f)
                horizontalLineToRelative(-2.03f)
                lineToRelative(-2.041f, 32.532f)
                lineToRelative(-0.03f, 0.468f)
                lineTo(10.101f, 45.0f)
                lineToRelative(-0.03f, -0.468f)
                lineTo(8.031f, 12.0f)
                lineTo(6.0f, 12.0f)
                lineTo(6.0f, 8.114f)
                lineToRelative(0.442f, -0.05f)
                lineToRelative(1.38f, -0.16f)
                lineToRelative(1.955f, -0.212f)
                arcTo(137.0f, 137.0f, 0.0f, false, true, 18.0f, 7.114f)
                lineTo(18.0f, 5.47f)
                curveToRelative(0.0f, -0.856f, 0.757f, -1.46f, 1.57f, -1.46f)
                close()
                moveTo(11.04f, 44.0f)
                horizontalLineToRelative(24.92f)
                lineToRelative(0.125f, -2.0f)
                horizontalLineToRelative(-25.17f)
                close()
                moveTo(9.22f, 15.0f)
                lineToRelative(1.632f, 26.0f)
                horizontalLineToRelative(25.296f)
                lineToRelative(1.631f, -26.0f)
                close()
                moveTo(14.5f, 38.978f)
                lineToRelative(-0.998f, 0.045f)
                lineToRelative(-1.0f, -22.0f)
                lineToRelative(0.998f, -0.045f)
                close()
                moveTo(19.5f, 38.978f)
                lineTo(18.502f, 39.023f)
                lineTo(17.502f, 17.023f)
                lineTo(18.5f, 16.978f)
                close()
                moveTo(29.5f, 17.023f)
                lineTo(28.5f, 39.023f)
                lineTo(27.502f, 38.978f)
                lineTo(28.502f, 16.978f)
                close()
                moveTo(34.5f, 17.023f)
                lineTo(33.5f, 39.023f)
                lineTo(32.502f, 38.978f)
                lineTo(33.502f, 16.978f)
                close()
                moveTo(24.0f, 39.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(23.0f, 17.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(9.157f, 14.0f)
                horizontalLineToRelative(28.686f)
                lineToRelative(0.125f, -2.0f)
                lineTo(9.032f, 12.0f)
                close()
                moveTo(39.063f, 8.897f)
                arcToRelative(135.5f, 135.5f, 0.0f, false, false, -29.185f, -0.21f)
                lineToRelative(-1.94f, 0.21f)
                lineTo(7.0f, 9.005f)
                lineTo(7.0f, 11.0f)
                horizontalLineToRelative(33.0f)
                lineTo(40.0f, 9.005f)
                close()
                moveTo(19.57f, 5.01f)
                curveToRelative(-0.366f, 0.0f, -0.57f, 0.256f, -0.57f, 0.46f)
                verticalLineToRelative(1.604f)
                quadToRelative(4.5f, -0.147f, 9.0f, 0.0f)
                lineTo(28.0f, 5.47f)
                curveToRelative(0.0f, -0.204f, -0.204f, -0.46f, -0.57f, -0.46f)
                close()
            }
        }
            .build()
        return _trashLarge!!
    }

private var _trashLarge: ImageVector? = null
