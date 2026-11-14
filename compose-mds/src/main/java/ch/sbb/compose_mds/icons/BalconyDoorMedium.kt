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

public val SBBIcons.BalconyDoorMedium: ImageVector
    get() {
        if (_balconyDoorMedium != null) {
            return _balconyDoorMedium!!
        }
        _balconyDoorMedium = Builder(name = "BalconyDoorMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(29.755f, 19.75f)
                horizontalLineToRelative(2.995f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(-28.0f)
                verticalLineToRelative(-13.0f)
                horizontalLineToRelative(3.0f)
                lineTo(7.75f, 3.25f)
                horizontalLineToRelative(22.005f)
                close()
                moveTo(5.75f, 31.75f)
                horizontalLineToRelative(26.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-26.0f)
                close()
                moveTo(29.755f, 28.75f)
                horizontalLineToRelative(1.995f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-1.995f)
                close()
                moveTo(5.75f, 28.75f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(8.75f, 28.75f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(11.75f, 28.75f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-6.5f)
                close()
                moveTo(19.25f, 28.75f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-6.5f)
                close()
                moveTo(26.75f, 28.75f)
                horizontalLineToRelative(2.005f)
                verticalLineToRelative(-8.0f)
                lineTo(26.75f, 20.75f)
                close()
                moveTo(8.75f, 19.75f)
                horizontalLineToRelative(2.0f)
                lineTo(10.75f, 6.25f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(13.5f)
                horizontalLineToRelative(2.005f)
                lineTo(28.755f, 4.25f)
                lineTo(8.75f, 4.25f)
                close()
                moveTo(11.75f, 19.75f)
                horizontalLineToRelative(6.5f)
                lineTo(18.25f, 7.25f)
                horizontalLineToRelative(-6.5f)
                close()
                moveTo(19.25f, 19.75f)
                horizontalLineToRelative(6.5f)
                lineTo(25.75f, 7.25f)
                horizontalLineToRelative(-6.5f)
                close()
            }
        }
        .build()
        return _balconyDoorMedium!!
    }

private var _balconyDoorMedium: ImageVector? = null
