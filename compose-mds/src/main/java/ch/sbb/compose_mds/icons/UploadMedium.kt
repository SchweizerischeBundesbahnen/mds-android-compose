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

public val SBBIcons.UploadMedium: ImageVector
    get() {
        if (_uploadMedium != null) {
            return _uploadMedium!!
        }
        _uploadMedium = Builder(name = "UploadMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.106f, 12.712f)
                lineToRelative(5.862f, 5.905f)
                lineToRelative(-0.356f, 0.352f)
                lineToRelative(-0.354f, 0.352f)
                lineToRelative(-5.008f, -5.043f)
                verticalLineToRelative(11.225f)
                horizontalLineToRelative(-1.0f)
                lineTo(18.25f, 14.28f)
                lineToRelative(-5.0f, 5.042f)
                lineToRelative(-0.355f, -0.352f)
                lineToRelative(-0.356f, -0.352f)
                lineToRelative(5.856f, -5.905f)
                lineToRelative(0.355f, -0.357f)
                close()
                moveTo(29.75f, 13.501f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.264f)
                horizontalLineToRelative(-20.0f)
                verticalLineToRelative(3.25f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-4.25f)
                horizontalLineToRelative(22.0f)
                close()
            }
        }
        .build()
        return _uploadMedium!!
    }

private var _uploadMedium: ImageVector? = null
