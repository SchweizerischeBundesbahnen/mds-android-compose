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

public val SBBIcons.ChevronSmallLeftRightSmall: ImageVector
    get() {
        if (_chevronSmallLeftRightSmall != null) {
            return _chevronSmallLeftRightSmall!!
        }
        _chevronSmallLeftRightSmall = Builder(name = "ChevronSmallLeftRightSmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.023f, 8.451f)
                lineTo(4.433f, 12.0f)
                lineToRelative(3.588f, 3.548f)
                lineToRelative(-0.703f, 0.712f)
                lineToRelative(-3.949f, -3.905f)
                lineTo(3.01f, 12.0f)
                lineToRelative(0.36f, -0.355f)
                lineTo(7.32f, 7.74f)
                close()
                moveTo(20.67f, 11.645f)
                lineTo(21.03f, 12.0f)
                lineTo(20.67f, 12.355f)
                lineTo(16.722f, 16.26f)
                lineTo(16.019f, 15.548f)
                lineTo(19.608f, 12.0f)
                lineToRelative(-3.59f, -3.549f)
                lineToRelative(0.702f, -0.71f)
                close()
            }
        }
        .build()
        return _chevronSmallLeftRightSmall!!
    }

private var _chevronSmallLeftRightSmall: ImageVector? = null
