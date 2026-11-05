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

public val SBBIcons.DoorArrowRightLeftLarge: ImageVector
    get() {
        if (_doorArrowRightLeftLarge != null) {
            return _doorArrowRightLeftLarge!!
        }
        _doorArrowRightLeftLarge = Builder(
            name = "DoorArrowRightLeftLarge",
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
                moveTo(35.0f, 38.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(1.0f)
                lineTo(5.0f, 39.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(15.0f)
                lineTo(20.0f, 21.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(13.0f)
                lineTo(34.0f, 9.0f)
                lineTo(21.0f, 9.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(20.0f, 8.0f)
                horizontalLineToRelative(15.0f)
                close()
                moveTo(32.0f, 25.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(31.207f, 18.5f)
                lineTo(25.854f, 23.854f)
                lineTo(25.147f, 23.147f)
                lineTo(29.293f, 19.0f)
                lineTo(11.707f, 19.0f)
                lineToRelative(4.147f, 4.147f)
                lineToRelative(-0.707f, 0.707f)
                lineTo(9.793f, 18.5f)
                lineToRelative(5.354f, -5.353f)
                lineToRelative(0.707f, 0.707f)
                lineTo(11.707f, 18.0f)
                horizontalLineToRelative(17.586f)
                lineToRelative(-4.146f, -4.146f)
                lineToRelative(0.707f, -0.707f)
                close()
            }
        }
            .build()
        return _doorArrowRightLeftLarge!!
    }

private var _doorArrowRightLeftLarge: ImageVector? = null
