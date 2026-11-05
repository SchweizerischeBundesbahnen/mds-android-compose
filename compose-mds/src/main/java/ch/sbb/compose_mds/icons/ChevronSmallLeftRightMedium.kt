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

public val SBBIcons.ChevronSmallLeftRightMedium: ImageVector
    get() {
        if (_chevronSmallLeftRightMedium != null) {
            return _chevronSmallLeftRightMedium!!
        }
        _chevronSmallLeftRightMedium = Builder(name = "ChevronSmallLeftRightMedium", defaultWidth =
                36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.858f, 12.5f)
                lineTo(6.293f, 18.0f)
                lineToRelative(5.562f, 5.5f)
                lineToRelative(-0.703f, 0.711f)
                lineToRelative(-5.922f, -5.855f)
                lineTo(4.87f, 18.0f)
                lineToRelative(0.36f, -0.355f)
                lineToRelative(5.926f, -5.857f)
                close()
                moveTo(30.83f, 17.645f)
                lineTo(31.19f, 18.0f)
                lineTo(30.83f, 18.356f)
                lineTo(24.908f, 24.211f)
                lineTo(24.205f, 23.501f)
                lineTo(29.767f, 18.001f)
                lineTo(24.202f, 12.499f)
                lineTo(24.905f, 11.789f)
                close()
            }
        }
        .build()
        return _chevronSmallLeftRightMedium!!
    }

private var _chevronSmallLeftRightMedium: ImageVector? = null
