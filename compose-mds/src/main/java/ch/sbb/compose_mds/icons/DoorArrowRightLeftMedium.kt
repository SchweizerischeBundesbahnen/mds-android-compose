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

public val SBBIcons.DoorArrowRightLeftMedium: ImageVector
    get() {
        if (_doorArrowRightLeftMedium != null) {
            return _doorArrowRightLeftMedium!!
        }
        _doorArrowRightLeftMedium = Builder(name = "DoorArrowRightLeftMedium", defaultWidth =
                36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(26.75f, 28.75f)
                horizontalLineToRelative(4.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-27.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(10.75f)
                lineTo(15.25f, 16.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(12.25f)
                horizontalLineToRelative(9.5f)
                lineTo(25.75f, 7.25f)
                horizontalLineToRelative(-9.5f)
                lineTo(16.25f, 12.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(15.25f, 6.25f)
                horizontalLineToRelative(11.5f)
                close()
                moveTo(24.0f, 19.25f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-1.0f)
                lineTo(24.0f, 18.25f)
                close()
                moveTo(23.957f, 14.25f)
                lineTo(19.854f, 18.354f)
                lineTo(19.147f, 17.647f)
                lineTo(22.043f, 14.75f)
                lineTo(9.457f, 14.75f)
                lineToRelative(2.896f, 2.896f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-4.103f, -4.103f)
                lineToRelative(4.103f, -4.103f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(-2.896f, 2.896f)
                horizontalLineToRelative(12.586f)
                lineToRelative(-2.896f, -2.896f)
                lineToRelative(0.707f, -0.707f)
                close()
            }
        }
        .build()
        return _doorArrowRightLeftMedium!!
    }

private var _doorArrowRightLeftMedium: ImageVector? = null
