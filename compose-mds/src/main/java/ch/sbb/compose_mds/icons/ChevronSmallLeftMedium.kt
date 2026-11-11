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

public val SBBIcons.ChevronSmallLeftMedium: ImageVector
    get() {
        if (_chevronSmallLeftMedium != null) {
            return _chevronSmallLeftMedium!!
        }
        _chevronSmallLeftMedium = Builder(name = "ChevronSmallLeftMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.864f, 12.5f)
                lineTo(15.298f, 18.0f)
                lineToRelative(5.563f, 5.5f)
                lineToRelative(-0.703f, 0.711f)
                lineToRelative(-5.922f, -5.855f)
                lineToRelative(-0.36f, -0.357f)
                lineToRelative(0.36f, -0.355f)
                lineToRelative(5.924f, -5.856f)
                close()
            }
        }
        .build()
        return _chevronSmallLeftMedium!!
    }

private var _chevronSmallLeftMedium: ImageVector? = null
