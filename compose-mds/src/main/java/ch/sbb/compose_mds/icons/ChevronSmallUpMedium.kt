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

public val SBBIcons.ChevronSmallUpMedium: ImageVector
    get() {
        if (_chevronSmallUpMedium != null) {
            return _chevronSmallUpMedium!!
        }
        _chevronSmallUpMedium = Builder(name = "ChevronSmallUpMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.35f, 14.235f)
                lineToRelative(5.856f, 5.925f)
                lineToRelative(-0.711f, 0.703f)
                lineToRelative(-5.501f, -5.565f)
                lineToRelative(-5.5f, 5.564f)
                lineToRelative(-0.711f, -0.703f)
                lineToRelative(5.855f, -5.924f)
                lineToRelative(0.357f, -0.36f)
                close()
            }
        }
        .build()
        return _chevronSmallUpMedium!!
    }

private var _chevronSmallUpMedium: ImageVector? = null
