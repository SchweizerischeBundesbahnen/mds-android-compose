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

public val SBBIcons.ChevronSmallLeftMedium: ImageVector
    get() {
        if (_chevronSmallLeftMedium != null) {
            return _chevronSmallLeftMedium!!
        }
        _chevronSmallLeftMedium = Builder(name = "ChevronSmallLeftMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(14.236f, 17.644f)
                lineToRelative(5.925f, -5.856f)
                lineToRelative(0.703f, 0.711f)
                lineToRelative(-5.565f, 5.5f)
                lineTo(20.86f, 23.5f)
                lineToRelative(-0.703f, 0.711f)
                lineToRelative(-5.922f, -5.856f)
                lineToRelative(-0.36f, -0.355f)
                close()
            }
        }
        .build()
        return _chevronSmallLeftMedium!!
    }

private var _chevronSmallLeftMedium: ImageVector? = null
