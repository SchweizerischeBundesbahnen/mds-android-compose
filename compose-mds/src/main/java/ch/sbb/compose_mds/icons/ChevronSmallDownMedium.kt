package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.ChevronSmallDownMedium: ImageVector
    get() {
        if (_chevronSmallDownMedium != null) {
            return _chevronSmallDownMedium!!
        }
        _chevronSmallDownMedium = Builder(name = "ChevronSmallDownMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(17.639f, 21.801f)
                lineToRelative(-5.856f, -5.925f)
                lineToRelative(0.711f, -0.703f)
                lineToRelative(5.5f, 5.565f)
                lineToRelative(5.5f, -5.562f)
                lineToRelative(0.712f, 0.703f)
                lineToRelative(-5.856f, 5.922f)
                lineToRelative(-0.356f, 0.36f)
                close()
            }
        }
        .build()
        return _chevronSmallDownMedium!!
    }

private var _chevronSmallDownMedium: ImageVector? = null
