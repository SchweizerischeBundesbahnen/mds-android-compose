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

public val SBBIcons.ArrowsLeftRightDottedMedium: ImageVector
    get() {
        if (_arrowsLeftRightDottedMedium != null) {
            return _arrowsLeftRightDottedMedium!!
        }
        _arrowsLeftRightDottedMedium = Builder(
            name = "ArrowsLeftRightDottedMedium",
            defaultWidth =
                36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight =
            36.0f,
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
                moveTo(11.604f, 20.604f)
                lineTo(7.957f, 24.25f)
                lineTo(13.5f, 24.25f)
                verticalLineToRelative(1.0f)
                lineTo(7.957f, 25.25f)
                lineToRelative(3.647f, 3.646f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-4.5f, -4.5f)
                lineToRelative(-0.355f, -0.353f)
                lineToRelative(0.355f, -0.354f)
                lineToRelative(4.5f, -4.5f)
                close()
                moveTo(18.018f, 25.25f)
                horizontalLineToRelative(-3.036f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.036f)
                close()
                moveTo(22.518f, 25.25f)
                horizontalLineToRelative(-3.036f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.036f)
                close()
                moveTo(27.018f, 25.25f)
                horizontalLineToRelative(-3.036f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.036f)
                close()
                moveTo(30.018f, 25.25f)
                horizontalLineToRelative(-1.536f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.536f)
                close()
                moveTo(29.958f, 11.25f)
                lineTo(25.104f, 16.104f)
                lineTo(24.397f, 15.397f)
                lineTo(28.043f, 11.75f)
                lineTo(22.5f, 11.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.543f)
                lineToRelative(-3.646f, -3.646f)
                lineToRelative(0.707f, -0.708f)
                close()
                moveTo(7.518f, 11.75f)
                lineTo(5.982f, 11.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.536f)
                close()
                moveTo(12.018f, 11.75f)
                lineTo(8.982f, 11.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.036f)
                close()
                moveTo(16.518f, 11.75f)
                horizontalLineToRelative(-3.036f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.036f)
                close()
                moveTo(21.018f, 11.75f)
                horizontalLineToRelative(-3.036f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.036f)
                close()
            }
        }
            .build()
        return _arrowsLeftRightDottedMedium!!
    }

private var _arrowsLeftRightDottedMedium: ImageVector? = null
