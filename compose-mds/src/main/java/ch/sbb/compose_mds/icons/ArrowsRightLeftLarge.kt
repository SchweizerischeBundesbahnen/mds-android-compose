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

public val SBBIcons.ArrowsRightLeftLarge: ImageVector
    get() {
        if (_arrowsRightLeftLarge != null) {
            return _arrowsRightLeftLarge!!
        }
        _arrowsRightLeftLarge = Builder(name = "ArrowsRightLeftLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.48f, 24.5f)
                lineToRelative(0.354f, 0.355f)
                lineToRelative(-7.129f, 7.13f)
                lineTo(37.0f, 31.985f)
                verticalLineToRelative(1.0f)
                lineTo(12.705f, 32.985f)
                lineToRelative(7.129f, 7.163f)
                lineToRelative(-0.354f, 0.353f)
                lineToRelative(-0.354f, 0.352f)
                lineToRelative(-7.98f, -8.017f)
                lineToRelative(-0.352f, -0.354f)
                lineToRelative(0.352f, -0.352f)
                lineToRelative(7.98f, -7.983f)
                close()
                moveTo(35.834f, 14.128f)
                lineTo(36.186f, 14.48f)
                lineTo(35.834f, 14.834f)
                lineTo(27.854f, 22.852f)
                lineTo(27.145f, 22.146f)
                lineTo(34.275f, 14.982f)
                lineTo(10.0f, 14.982f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(24.273f)
                lineToRelative(-7.127f, -7.13f)
                lineToRelative(0.707f, -0.707f)
                close()
            }
        }
        .build()
        return _arrowsRightLeftLarge!!
    }

private var _arrowsRightLeftLarge: ImageVector? = null
