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

public val SBBIcons.ChevronSmallDownFlatMedium: ImageVector
    get() {
        if (_chevronSmallDownFlatMedium != null) {
            return _chevronSmallDownFlatMedium!!
        }
        _chevronSmallDownFlatMedium = Builder(name = "ChevronSmallDownFlatMedium", defaultWidth =
                36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.176f, 17.718f)
                lineToRelative(-6.006f, 2.25f)
                lineToRelative(-0.176f, -0.469f)
                verticalLineToRelative(0.001f)
                lineToRelative(0.176f, 0.468f)
                lineToRelative(-0.176f, 0.066f)
                lineToRelative(-0.176f, -0.066f)
                lineToRelative(-5.994f, -2.25f)
                lineToRelative(0.352f, -0.936f)
                lineToRelative(5.818f, 2.184f)
                lineToRelative(5.83f, -2.184f)
                close()
            }
        }
        .build()
        return _chevronSmallDownFlatMedium!!
    }

private var _chevronSmallDownFlatMedium: ImageVector? = null
