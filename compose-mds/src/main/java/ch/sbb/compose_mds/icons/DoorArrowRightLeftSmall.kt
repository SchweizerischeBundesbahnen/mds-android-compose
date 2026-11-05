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

public val SBBIcons.DoorArrowRightLeftSmall: ImageVector
    get() {
        if (_doorArrowRightLeftSmall != null) {
            return _doorArrowRightLeftSmall!!
        }
        _doorArrowRightLeftSmall = Builder(
            name = "DoorArrowRightLeftSmall",
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
                pathFillType = NonZero,
            ) {
                moveTo(18.0f, 19.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.0f)
                lineTo(3.0f, 20.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(6.0f)
                lineTo(17.0f, 5.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(10.0f, 4.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(16.0f, 13.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(16.207f, 9.5f)
                lineTo(13.353f, 12.354f)
                lineTo(12.646f, 11.647f)
                lineTo(14.294f, 10.0f)
                lineTo(6.707f, 10.0f)
                lineToRelative(1.647f, 1.646f)
                lineToRelative(-0.708f, 0.707f)
                lineTo(4.793f, 9.5f)
                lineToRelative(2.853f, -2.854f)
                lineToRelative(0.708f, 0.708f)
                lineTo(6.707f, 9.0f)
                horizontalLineToRelative(7.586f)
                lineToRelative(-1.646f, -1.646f)
                lineToRelative(0.707f, -0.708f)
                close()
            }
        }
            .build()
        return _doorArrowRightLeftSmall!!
    }

private var _doorArrowRightLeftSmall: ImageVector? = null
