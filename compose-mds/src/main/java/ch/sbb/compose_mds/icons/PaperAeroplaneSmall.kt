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

public val SBBIcons.PaperAeroplaneSmall: ImageVector
    get() {
        if (_paperAeroplaneSmall != null) {
            return _paperAeroplaneSmall!!
        }
        _paperAeroplaneSmall = Builder(name = "PaperAeroplaneSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(19.998f, 4.548f)
                lineToRelative(-1.5f, 15.5f)
                lineToRelative(-0.084f, 0.862f)
                lineToRelative(-0.705f, -0.503f)
                lineToRelative(-4.575f, -3.268f)
                lineToRelative(-1.696f, 3.09f)
                lineToRelative(-0.437f, -0.24f)
                lineTo(11.0f, 19.989f)
                lineToRelative(0.438f, 0.24f)
                lineToRelative(-0.938f, 1.709f)
                lineTo(10.5f, 15.39f)
                lineToRelative(-7.621f, -1.905f)
                lineToRelative(-1.287f, -0.322f)
                lineToRelative(1.18f, -0.608f)
                lineToRelative(16.5f, -8.5f)
                lineToRelative(0.814f, -0.42f)
                close()
                moveTo(11.5f, 15.972f)
                lineToRelative(0.814f, 0.582f)
                lineToRelative(-0.814f, 1.483f)
                close()
                moveTo(11.723f, 14.902f)
                lineTo(18.841f, 6.108f)
                lineTo(17.585f, 19.088f)
                close()
                moveTo(10.813f, 14.437f)
                lineTo(4.408f, 12.836f)
                lineTo(17.618f, 6.03f)
                close()
            }
        }
        .build()
        return _paperAeroplaneSmall!!
    }

private var _paperAeroplaneSmall: ImageVector? = null
