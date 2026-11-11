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

public val SBBIcons.ChevronSmallRightMedium: ImageVector
    get() {
        if (_chevronSmallRightMedium != null) {
            return _chevronSmallRightMedium!!
        }
        _chevronSmallRightMedium = Builder(name = "ChevronSmallRightMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.764f, 17.644f)
                lineToRelative(0.36f, 0.357f)
                lineToRelative(-0.36f, 0.355f)
                lineToRelative(-5.925f, 5.855f)
                lineToRelative(-0.703f, -0.71f)
                lineTo(20.701f, 18.0f)
                lineToRelative(-5.563f, -5.5f)
                lineToRelative(0.702f, -0.711f)
                close()
            }
        }
        .build()
        return _chevronSmallRightMedium!!
    }

private var _chevronSmallRightMedium: ImageVector? = null
