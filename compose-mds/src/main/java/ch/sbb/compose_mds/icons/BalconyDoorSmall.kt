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

public val SBBIcons.BalconyDoorSmall: ImageVector
    get() {
        if (_balconyDoorSmall != null) {
            return _balconyDoorSmall!!
        }
        _balconyDoorSmall = Builder(
            name = "BalconyDoorSmall",
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
                moveTo(20.004f, 13.0f)
                lineTo(22.0f, 13.0f)
                verticalLineToRelative(9.0f)
                lineTo(3.0f, 22.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(2.0f)
                lineTo(5.0f, 2.0f)
                horizontalLineToRelative(15.004f)
                close()
                moveTo(4.0f, 21.0f)
                horizontalLineToRelative(17.0f)
                verticalLineToRelative(-1.0f)
                lineTo(4.0f, 20.0f)
                close()
                moveTo(20.004f, 19.0f)
                lineTo(21.0f, 19.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-0.996f)
                close()
                moveTo(4.0f, 19.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-5.0f)
                lineTo(4.0f, 14.0f)
                close()
                moveTo(6.0f, 19.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-5.0f)
                lineTo(6.0f, 14.0f)
                close()
                moveTo(8.0f, 19.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-5.0f)
                lineTo(8.0f, 14.0f)
                close()
                moveTo(13.0f, 19.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(18.0f, 19.0f)
                horizontalLineToRelative(1.004f)
                verticalLineToRelative(-5.0f)
                lineTo(18.0f, 14.0f)
                close()
                moveTo(6.0f, 13.0f)
                horizontalLineToRelative(1.0f)
                lineTo(7.0f, 4.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(1.004f)
                lineTo(19.004f, 3.0f)
                lineTo(6.0f, 3.0f)
                close()
                moveTo(8.0f, 13.0f)
                horizontalLineToRelative(4.0f)
                lineTo(12.0f, 5.0f)
                lineTo(8.0f, 5.0f)
                close()
                moveTo(13.0f, 13.0f)
                horizontalLineToRelative(4.0f)
                lineTo(17.0f, 5.0f)
                horizontalLineToRelative(-4.0f)
                close()
            }
        }
            .build()
        return _balconyDoorSmall!!
    }

private var _balconyDoorSmall: ImageVector? = null
