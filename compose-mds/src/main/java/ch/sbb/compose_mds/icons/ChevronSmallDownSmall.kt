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

public val SBBIcons.ChevronSmallDownSmall: ImageVector
    get() {
        if (_chevronSmallDownSmall != null) {
            return _chevronSmallDownSmall!!
        }
        _chevronSmallDownSmall = Builder(name = "ChevronSmallDownSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(11.64f, 14.651f)
                lineToRelative(-3.903f, -3.95f)
                lineToRelative(0.71f, -0.703f)
                lineToRelative(3.55f, 3.59f)
                lineTo(15.544f, 10.0f)
                lineToRelative(0.71f, 0.703f)
                lineToRelative(-3.903f, 3.948f)
                lineToRelative(-0.356f, 0.36f)
                close()
            }
        }
        .build()
        return _chevronSmallDownSmall!!
    }

private var _chevronSmallDownSmall: ImageVector? = null
