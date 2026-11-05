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

public val SBBIcons.ChevronSmallUpSmall: ImageVector
    get() {
        if (_chevronSmallUpSmall != null) {
            return _chevronSmallUpSmall!!
        }
        _chevronSmallUpSmall = Builder(
            name = "ChevronSmallUpSmall",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveToRelative(11.996f, 9.013f)
                lineToRelative(0.356f, 0.36f)
                lineToRelative(3.904f, 3.95f)
                lineToRelative(-0.711f, 0.703f)
                lineToRelative(-3.549f, -3.59f)
                lineToRelative(-3.548f, 3.589f)
                lineToRelative(-0.711f, -0.703f)
                lineToRelative(3.904f, -3.949f)
                close()
            }
        }
            .build()
        return _chevronSmallUpSmall!!
    }

private var _chevronSmallUpSmall: ImageVector? = null
