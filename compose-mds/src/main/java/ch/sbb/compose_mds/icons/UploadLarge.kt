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

public val SBBIcons.UploadLarge: ImageVector
    get() {
        if (_uploadLarge != null) {
            return _uploadLarge!!
        }
        _uploadLarge = Builder(name = "UploadLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.856f, 17.566f)
                lineToRelative(7.815f, 7.872f)
                lineToRelative(-0.71f, 0.705f)
                lineTo(25.0f, 19.131f)
                verticalLineToRelative(15.871f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-15.87f)
                lineToRelative(-6.952f, 7.01f)
                lineToRelative(-0.356f, -0.351f)
                lineToRelative(-0.355f, -0.353f)
                lineToRelative(7.808f, -7.872f)
                lineToRelative(0.355f, -0.357f)
                close()
                moveTo(39.0f, 19.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.018f)
                horizontalLineTo(11.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(29.0f)
                close()
            }
        }
        .build()
        return _uploadLarge!!
    }

private var _uploadLarge: ImageVector? = null
