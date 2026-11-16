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

public val SBBIcons.DocumentSoundMedium: ImageVector
    get() {
        if (_documentSoundMedium != null) {
            return _documentSoundMedium!!
        }
        _documentSoundMedium = Builder(name = "DocumentSoundMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(18.944f, 6.246f)
                lineToRelative(0.146f, 0.147f)
                lineToRelative(7.514f, 7.509f)
                lineToRelative(0.146f, 0.146f)
                verticalLineToRelative(15.707f)
                lineTo(9.25f, 29.755f)
                lineTo(9.25f, 6.256f)
                horizontalLineToRelative(0.5f)
                lineToRelative(8.987f, -0.01f)
                close()
                moveTo(10.25f, 7.254f)
                verticalLineToRelative(21.501f)
                horizontalLineToRelative(15.5f)
                verticalLineToRelative(-14.0f)
                horizontalLineToRelative(-7.499f)
                lineToRelative(-0.001f, -0.499f)
                lineToRelative(-0.013f, -7.01f)
                close()
                moveTo(19.239f, 7.956f)
                lineTo(25.042f, 13.756f)
                lineTo(19.25f, 13.756f)
                close()
                moveTo(22.244f, 26.748f)
                lineTo(22.244f, 16.75f)
                horizontalLineToRelative(-2.627f)
                lineToRelative(-3.0f, 3.0f)
                horizontalLineToRelative(-2.873f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.873f)
                lineToRelative(2.853f, 2.862f)
                lineToRelative(0.147f, 0.147f)
                horizontalLineToRelative(0.21f)
                lineToRelative(1.92f, -0.01f)
                close()
                moveTo(14.744f, 20.75f)
                horizontalLineToRelative(2.287f)
                lineToRelative(3.0f, -3.0f)
                horizontalLineToRelative(1.213f)
                verticalLineToRelative(8.002f)
                lineToRelative(-1.213f, 0.005f)
                lineToRelative(-2.852f, -2.86f)
                lineToRelative(-0.148f, -0.147f)
                horizontalLineToRelative(-2.287f)
                close()
            }
        }
        .build()
        return _documentSoundMedium!!
    }

private var _documentSoundMedium: ImageVector? = null
