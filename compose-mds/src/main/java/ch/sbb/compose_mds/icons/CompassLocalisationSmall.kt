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
        _compassLocalisationSmall = Builder(
            name = "CompassLocalisationSmall",
            defaultWidth =
                24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight =
            24.0f,
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
                moveToRelative(12.0f, 2.0f)
                lineToRelative(-4.0f, 9.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(12.547f, 19.768f)
                lineTo(12.0f, 21.0f)
                lineToRelative(-0.547f, -1.232f)
                lineTo(8.444f, 13.0f)
                lineTo(8.0f, 12.0f)
                horizontalLineToRelative(7.996f)
                lineToRelative(-0.444f, 1.0f)
                close()
                moveTo(14.458f, 13.0f)
                lineTo(12.0f, 18.537f)
                lineTo(9.539f, 13.0f)
                close()
            }
        }
            .build()
        return _compassLocalisationSmall!!
    }

private var _compassLocalisationSmall: ImageVector? = null
