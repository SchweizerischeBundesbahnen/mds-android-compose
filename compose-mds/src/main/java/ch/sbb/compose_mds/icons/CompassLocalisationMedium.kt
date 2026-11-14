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

public val SBBIcons.CompassLocalisationMedium: ImageVector
    get() {
        if (_compassLocalisationMedium != null) {
            return _compassLocalisationMedium!!
        }
        _compassLocalisationMedium = Builder(name = "CompassLocalisationMedium", defaultWidth =
                36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(18.0f, 3.0f)
                lineToRelative(-6.0f, 13.5f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(12.0f, 18.0f)
                lineTo(18.0f, 31.5f)
                lineTo(23.995f, 18.0f)
                close()
                moveTo(22.456f, 19.0f)
                lineTo(18.0f, 29.037f)
                lineTo(13.539f, 19.0f)
                close()
            }
        }
        .build()
        return _compassLocalisationMedium!!
    }

private var _compassLocalisationMedium: ImageVector? = null
