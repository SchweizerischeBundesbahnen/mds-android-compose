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
                moveToRelative(19.93f, 27.281f)
                lineToRelative(0.82f, 0.685f)
                lineTo(20.75f, 8.033f)
                lineToRelative(-0.82f, 0.683f)
                lineToRelative(-7.84f, 6.525f)
                lineTo(6.25f, 15.241f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(5.84f)
                close()
                moveTo(12.452f, 16.241f)
                lineTo(12.592f, 16.126f)
                lineTo(19.75f, 10.166f)
                verticalLineToRelative(15.663f)
                lineToRelative(-7.158f, -5.973f)
                lineToRelative(-0.139f, -0.116f)
                lineTo(7.25f, 19.74f)
                verticalLineToRelative(-3.499f)
                close()
                moveTo(27.146f, 27.276f)
                lineTo(27.672f, 26.426f)
                lineTo(24.272f, 24.326f)
                lineTo(23.747f, 25.175f)
                close()
                moveTo(27.672f, 9.573f)
                lineTo(24.272f, 11.675f)
                lineTo(23.747f, 10.825f)
                lineTo(27.146f, 8.724f)
                close()
                moveTo(24.13f, 15.486f)
                lineTo(29.526f, 14.148f)
                lineTo(29.286f, 13.178f)
                lineTo(23.89f, 14.516f)
                close()
                moveTo(29.525f, 21.854f)
                lineTo(29.284f, 22.824f)
                lineTo(23.89f, 21.484f)
                lineTo(24.13f, 20.514f)
                close()
                moveTo(30.0f, 18.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-5.99f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _speakerMedium!!
    }

private var _speakerMedium: ImageVector? = null
