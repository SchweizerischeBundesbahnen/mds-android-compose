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

public val SBBIcons.ChevronSmallEndLeftMedium: ImageVector
    get() {
        if (_chevronSmallEndLeftMedium != null) {
            return _chevronSmallEndLeftMedium!!
        }
        _chevronSmallEndLeftMedium = Builder(name = "ChevronSmallEndLeftMedium", defaultWidth =
                36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(19.798f, 18.0f)
                lineToRelative(5.566f, -5.5f)
                lineToRelative(-0.704f, -0.712f)
                lineToRelative(-5.924f, 5.856f)
                lineToRelative(-0.36f, 0.355f)
                lineToRelative(0.36f, 0.357f)
                lineToRelative(5.922f, 5.855f)
                lineToRelative(0.703f, -0.71f)
                close()
                moveTo(13.5f, 22.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _chevronSmallEndLeftMedium!!
    }

private var _chevronSmallEndLeftMedium: ImageVector? = null
