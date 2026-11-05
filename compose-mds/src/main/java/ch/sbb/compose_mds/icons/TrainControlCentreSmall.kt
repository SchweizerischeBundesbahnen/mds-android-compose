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

public val SBBIcons.TrainControlCentreSmall: ImageVector
    get() {
        if (_trainControlCentreSmall != null) {
            return _trainControlCentreSmall!!
        }
        _trainControlCentreSmall = Builder(name = "TrainControlCentreSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.65f, 3.023f)
                lineToRelative(8.0f, 2.5f)
                lineToRelative(0.35f, 0.11f)
                verticalLineToRelative(6.934f)
                lineToRelative(-4.0f, -0.5f)
                lineTo(18.0f, 22.0f)
                lineTo(5.0f, 22.0f)
                verticalLineToRelative(-6.64f)
                lineToRelative(-2.658f, -0.885f)
                lineTo(2.0f, 14.361f)
                lineTo(2.0f, 6.119f)
                lineToRelative(0.368f, -0.1f)
                lineToRelative(11.0f, -3.0f)
                lineToRelative(0.142f, -0.039f)
                close()
                moveTo(14.0f, 21.001f)
                horizontalLineToRelative(3.0f)
                lineTo(17.0f, 10.934f)
                lineToRelative(4.0f, 0.5f)
                lineTo(21.0f, 6.368f)
                lineTo(14.0f, 4.18f)
                close()
                moveTo(3.0f, 6.882f)
                verticalLineToRelative(6.757f)
                lineToRelative(2.658f, 0.887f)
                lineToRelative(0.342f, 0.114f)
                lineTo(6.0f, 21.0f)
                horizontalLineToRelative(7.0f)
                lineTo(13.0f, 4.154f)
                close()
                moveTo(5.0f, 12.001f)
                lineTo(4.0f, 12.001f)
                lineTo(4.0f, 9.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(7.0f, 11.501f)
                lineTo(6.0f, 11.501f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(9.0f, 11.001f)
                lineTo(8.0f, 11.001f)
                lineTo(8.0f, 8.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _trainControlCentreSmall!!
    }

private var _trainControlCentreSmall: ImageVector? = null
