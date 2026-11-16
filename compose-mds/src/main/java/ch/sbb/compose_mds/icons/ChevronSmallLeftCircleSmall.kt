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

public val SBBIcons.ChevronSmallLeftCircleSmall: ImageVector
    get() {
        if (_chevronSmallLeftCircleSmall != null) {
            return _chevronSmallLeftCircleSmall!!
        }
        _chevronSmallLeftCircleSmall = Builder(name = "ChevronSmallLeftCircleSmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 5.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 7.0f, 7.0f)
                curveToRelative(0.0f, 3.867f, -3.133f, 7.0f, -7.0f, 7.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, true, 0.0f, -14.0f)
                moveToRelative(0.0f, 15.0f)
                curveToRelative(4.42f, 0.0f, 8.0f, -3.581f, 8.0f, -8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.0f, 8.0f)
                moveToRelative(-1.564f, -8.0f)
                lineToRelative(3.59f, -3.549f)
                lineToRelative(-0.703f, -0.71f)
                lineToRelative(-3.95f, 3.904f)
                lineToRelative(-0.36f, 0.355f)
                lineToRelative(0.36f, 0.356f)
                lineToRelative(3.949f, 3.903f)
                lineToRelative(0.703f, -0.711f)
                close()
            }
        }
        .build()
        return _chevronSmallLeftCircleSmall!!
    }

private var _chevronSmallLeftCircleSmall: ImageVector? = null
