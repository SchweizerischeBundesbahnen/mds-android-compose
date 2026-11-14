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

public val SBBIcons.SpeakerSmall: ImageVector
    get() {
        if (_speakerSmall != null) {
            return _speakerSmall!!
        }
        _speakerSmall = Builder(name = "SpeakerSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.18f, 18.315f)
                lineTo(14.0f, 19.0f)
                lineTo(14.0f, 5.0f)
                lineToRelative(-0.82f, 0.683f)
                lineTo(8.0f, 9.994f)
                lineTo(4.0f, 9.994f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(8.18f, 10.493f)
                lineTo(8.501f, 10.879f)
                lineTo(8.181f, 10.494f)
                moveToRelative(0.321f, 0.386f)
                lineTo(13.0f, 7.133f)
                verticalLineToRelative(9.73f)
                lineTo(8.501f, 13.11f)
                lineToRelative(-0.139f, -0.116f)
                lineTo(5.0f, 12.994f)
                verticalLineToRelative(-1.999f)
                horizontalLineToRelative(3.362f)
                close()
                moveTo(18.011f, 18.327f)
                lineTo(18.537f, 17.477f)
                lineTo(16.27f, 16.077f)
                lineTo(15.745f, 16.926f)
                close()
                moveTo(18.537f, 6.525f)
                lineTo(16.27f, 7.926f)
                lineTo(15.745f, 7.076f)
                lineTo(18.01f, 5.676f)
                close()
                moveTo(16.127f, 10.487f)
                lineTo(19.725f, 9.595f)
                lineTo(19.485f, 8.624f)
                lineTo(15.887f, 9.517f)
                close()
                moveTo(19.725f, 14.408f)
                lineTo(19.483f, 15.378f)
                lineTo(15.888f, 14.486f)
                lineTo(16.128f, 13.516f)
                close()
                moveTo(20.0f, 12.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.993f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _speakerSmall!!
    }

private var _speakerSmall: ImageVector? = null
