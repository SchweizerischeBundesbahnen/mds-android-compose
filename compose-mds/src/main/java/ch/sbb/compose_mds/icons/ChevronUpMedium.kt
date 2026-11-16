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

public val SBBIcons.ChevronUpMedium: ImageVector
    get() {
        if (_chevronUpMedium != null) {
            return _chevronUpMedium!!
        }
        _chevronUpMedium = Builder(name = "ChevronUpMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(30.354f, 23.647f)
                lineToRelative(-0.707f, 0.707f)
                lineTo(18.0f, 12.707f)
                lineTo(6.354f, 24.354f)
                lineToRelative(-0.707f, -0.707f)
                lineTo(18.0f, 11.293f)
                close()
            }
        }
        .build()
        return _chevronUpMedium!!
    }

private var _chevronUpMedium: ImageVector? = null
