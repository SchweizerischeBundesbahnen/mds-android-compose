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

public val SBBIcons.CompassLocalisationSmall: ImageVector
    get() {
        if (_compassLocalisationSmall != null) {
            return _compassLocalisationSmall!!
        }
        _compassLocalisationSmall = Builder(name = "CompassLocalisationSmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(12.0f, 2.0f)
                lineToRelative(-4.0f, 9.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(8.0f, 12.0f)
                lineToRelative(4.0f, 9.0f)
                lineToRelative(3.996f, -9.0f)
                close()
                moveTo(14.458f, 13.0f)
                lineTo(11.998f, 18.535f)
                lineTo(9.539f, 13.0f)
                close()
            }
        }
        .build()
        return _compassLocalisationSmall!!
    }

private var _compassLocalisationSmall: ImageVector? = null
