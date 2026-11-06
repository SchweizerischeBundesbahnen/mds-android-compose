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
                moveTo(14.0f, 6.066f)
                lineTo(14.0f, 5.0f)
                lineToRelative(-0.82f, 0.682f)
                lineTo(8.0f, 9.994f)
                lineTo(4.0f, 9.994f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(5.18f, 4.321f)
                lineTo(14.0f, 19.0f)
                lineTo(14.0f, 6.066f)
                moveTo(8.5f, 10.88f)
                lineTo(13.0f, 7.133f)
                verticalLineToRelative(9.73f)
                lineToRelative(-4.499f, -3.754f)
                lineToRelative(-0.139f, -0.116f)
                lineTo(5.0f, 12.993f)
                verticalLineToRelative(-1.999f)
                horizontalLineToRelative(3.361f)
                close()
                moveTo(18.535f, 17.477f)
                lineTo(16.27f, 16.076f)
                lineTo(15.744f, 16.926f)
                lineTo(18.01f, 18.327f)
                close()
                moveTo(15.744f, 7.075f)
                lineToRelative(2.266f, -1.401f)
                lineToRelative(0.525f, 0.85f)
                lineToRelative(-2.265f, 1.401f)
                close()
                moveTo(19.484f, 8.623f)
                lineTo(15.886f, 9.515f)
                lineTo(16.126f, 10.485f)
                lineTo(19.724f, 9.594f)
                close()
                moveTo(19.482f, 15.378f)
                lineTo(15.886f, 14.485f)
                lineTo(16.127f, 13.515f)
                lineTo(19.723f, 14.408f)
                close()
                moveTo(20.0f, 11.5f)
                horizontalLineToRelative(-3.993f)
                verticalLineToRelative(1.0f)
                lineTo(20.0f, 12.5f)
                close()
            }
        }
        .build()
        return _speakerSmall!!
    }

private var _speakerSmall: ImageVector? = null
