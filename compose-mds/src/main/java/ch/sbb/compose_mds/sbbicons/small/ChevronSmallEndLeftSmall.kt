package ch.sbb.compose_mds.sbbicons.small

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.SmallGroup

public val SmallGroup.ChevronSmallEndLeftSmall: ImageVector
    get() {
        if (_chevronSmallEndLeftSmall != null) {
            return _chevronSmallEndLeftSmall!!
        }
        _chevronSmallEndLeftSmall = Builder(name = "ChevronSmallEndLeftSmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(16.323f, 7.74f)
                lineToRelative(-3.95f, 3.904f)
                lineToRelative(-0.36f, 0.356f)
                lineToRelative(0.36f, 0.355f)
                lineToRelative(3.948f, 3.904f)
                lineToRelative(0.703f, -0.71f)
                lineTo(13.436f, 12.0f)
                lineToRelative(3.59f, -3.549f)
                close()
                moveTo(9.0f, 9.0f)
                verticalLineToRelative(6.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _chevronSmallEndLeftSmall!!
    }

private var _chevronSmallEndLeftSmall: ImageVector? = null
