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

public val SBBIcons.SpeakerMedium: ImageVector
    get() {
        if (_speakerMedium != null) {
            return _speakerMedium!!
        }
        _speakerMedium = Builder(name = "SpeakerMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.75f, 9.1f)
                lineTo(20.75f, 8.033f)
                lineToRelative(-0.82f, 0.682f)
                lineToRelative(-7.84f, 6.527f)
                lineTo(6.25f, 15.242f)
                verticalLineToRelative(5.498f)
                horizontalLineToRelative(5.84f)
                lineToRelative(7.84f, 6.541f)
                lineToRelative(0.82f, 0.684f)
                lineTo(20.75f, 9.1f)
                moveToRelative(-8.159f, 7.026f)
                lineToRelative(7.159f, -5.96f)
                lineTo(19.75f, 25.83f)
                lineToRelative(-7.158f, -5.973f)
                lineToRelative(-0.14f, -0.116f)
                lineTo(7.25f, 19.741f)
                verticalLineToRelative(-3.498f)
                horizontalLineToRelative(5.202f)
                close()
                moveTo(27.671f, 26.426f)
                lineTo(24.273f, 24.325f)
                lineTo(23.747f, 25.175f)
                lineTo(27.146f, 27.277f)
                close()
                moveTo(23.747f, 10.825f)
                lineTo(27.146f, 8.723f)
                lineTo(27.672f, 9.573f)
                lineTo(24.272f, 11.675f)
                close()
                moveTo(29.285f, 13.178f)
                lineTo(23.89f, 14.516f)
                lineTo(24.13f, 15.486f)
                lineTo(29.526f, 14.148f)
                close()
                moveTo(29.284f, 22.824f)
                lineTo(23.89f, 21.484f)
                lineTo(24.13f, 20.514f)
                lineTo(29.525f, 21.854f)
                close()
                moveTo(30.0f, 17.5f)
                horizontalLineToRelative(-5.99f)
                verticalLineToRelative(1.0f)
                lineTo(30.0f, 18.5f)
                close()
            }
        }
        .build()
        return _speakerMedium!!
    }

private var _speakerMedium: ImageVector? = null
