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

public val SBBIcons.ShelvesPansBottlesPlatesMedium: ImageVector
    get() {
        if (_shelvesPansBottlesPlatesMedium != null) {
            return _shelvesPansBottlesPlatesMedium!!
        }
        _shelvesPansBottlesPlatesMedium = Builder(
            name = "ShelvesPansBottlesPlatesMedium",
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
                moveTo(4.25f, 16.75f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-8.0f)
                lineTo(6.001f, 8.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.749f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(4.751f)
                verticalLineToRelative(1.0f)
                lineTo(16.25f, 8.75f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(3.498f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(1.503f)
                lineTo(21.251f, 6.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.25f)
                horizontalLineToRelative(1.502f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(1.995f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(1.503f)
                lineTo(27.251f, 6.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.25f)
                horizontalLineToRelative(1.502f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(1.997f)
                lineTo(31.75f, 3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(30.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.25f)
                lineTo(4.25f, 29.75f)
                lineTo(4.25f, 33.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(3.25f, 3.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(4.25f, 28.75f)
                horizontalLineToRelative(4.012f)
                lineToRelative(-1.226f, -3.064f)
                lineTo(6.762f, 25.0f)
                lineTo(7.96f, 25.0f)
                lineToRelative(-0.925f, -2.314f)
                lineTo(6.762f, 22.0f)
                horizontalLineToRelative(8.976f)
                lineToRelative(-0.274f, 0.686f)
                lineTo(14.539f, 25.0f)
                horizontalLineToRelative(1.2f)
                lineToRelative(-0.275f, 0.686f)
                lineToRelative(-1.226f, 3.064f)
                horizontalLineToRelative(7.012f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-3.249f)
                verticalLineToRelative(-1.0f)
                lineTo(28.25f, 22.75f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-11.0f)
                lineTo(4.25f, 17.75f)
                close()
                moveTo(9.338f, 28.75f)
                horizontalLineToRelative(3.824f)
                lineToRelative(1.1f, -2.75f)
                lineTo(8.238f, 26.0f)
                close()
                moveTo(22.25f, 28.75f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(9.038f, 25.0f)
                horizontalLineToRelative(4.424f)
                lineToRelative(0.8f, -2.0f)
                lineTo(8.238f, 23.0f)
                close()
                moveTo(8.75f, 16.75f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-6.5f)
                close()
                moveTo(26.748f, 16.75f)
                horizontalLineToRelative(2.005f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(-2.005f)
                close()
                moveTo(20.748f, 16.75f)
                horizontalLineToRelative(2.005f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(-2.005f)
                close()
                moveTo(11.75f, 7.75f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-0.5f)
                close()
            }
        }
            .build()
        return _shelvesPansBottlesPlatesMedium!!
    }

private var _shelvesPansBottlesPlatesMedium: ImageVector? = null
