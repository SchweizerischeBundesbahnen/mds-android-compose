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

public val SBBIcons.UploadSmall: ImageVector
    get() {
        if (_uploadSmall != null) {
            return _uploadSmall!!
        }
        _uploadSmall = Builder(name = "UploadSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.856f, 8.357f)
                lineToRelative(3.908f, 3.937f)
                lineToRelative(-0.356f, 0.351f)
                lineToRelative(-0.354f, 0.353f)
                lineTo(13.0f, 9.923f)
                verticalLineToRelative(7.079f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(9.924f)
                lineToRelative(-3.048f, 3.074f)
                lineToRelative(-0.355f, -0.352f)
                lineToRelative(-0.356f, -0.352f)
                lineToRelative(3.905f, -3.937f)
                lineTo(12.5f, 8.0f)
                close()
                moveTo(20.0f, 9.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(6.991f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(15.0f)
                close()
            }
        }
        .build()
        return _uploadSmall!!
    }

private var _uploadSmall: ImageVector? = null
