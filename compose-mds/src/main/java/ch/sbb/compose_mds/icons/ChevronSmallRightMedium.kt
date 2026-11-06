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

public val SBBIcons.ChevronSmallRightMedium: ImageVector
    get() {
        if (_chevronSmallRightMedium != null) {
            return _chevronSmallRightMedium!!
        }
        _chevronSmallRightMedium = Builder(name = "ChevronSmallRightMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(15.84f, 11.789f)
                lineToRelative(5.924f, 5.856f)
                lineToRelative(0.36f, 0.355f)
                lineToRelative(-0.36f, 0.356f)
                lineToRelative(-5.925f, 5.856f)
                lineToRelative(-0.703f, -0.712f)
                lineToRelative(5.566f, -5.5f)
                lineToRelative(-5.564f, -5.5f)
                close()
            }
        }
        .build()
        return _chevronSmallRightMedium!!
    }

private var _chevronSmallRightMedium: ImageVector? = null
