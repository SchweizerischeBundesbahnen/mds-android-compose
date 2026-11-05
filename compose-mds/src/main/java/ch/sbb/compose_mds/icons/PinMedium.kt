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

public val SBBIcons.PinMedium: ImageVector
    get() {
        if (_pinMedium != null) {
            return _pinMedium!!
        }
        _pinMedium = Builder(name = "PinMedium", defaultWidth = 36.0.dp, defaultHeight = 36.0.dp,
                viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(25.228f, 8.397f)
                lineToRelative(-2.973f, 9.659f)
                lineToRelative(0.369f, 5.159f)
                lineToRelative(0.038f, 0.535f)
                lineTo(18.5f, 23.75f)
                verticalLineToRelative(4.75f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-4.75f)
                horizontalLineToRelative(-4.179f)
                lineToRelative(0.04f, -0.537f)
                lineToRelative(0.382f, -5.158f)
                lineToRelative(-2.97f, -9.658f)
                lineToRelative(-0.2f, -0.647f)
                horizontalLineToRelative(14.854f)
                close()
                moveTo(14.728f, 17.852f)
                lineTo(14.756f, 17.943f)
                lineTo(14.749f, 18.037f)
                lineTo(14.399f, 22.75f)
                horizontalLineToRelative(7.189f)
                lineToRelative(-0.337f, -4.715f)
                lineToRelative(-0.007f, -0.093f)
                lineToRelative(0.029f, -0.09f)
                lineToRelative(2.8f, -9.102f)
                lineTo(11.927f, 8.75f)
                close()
            }
        }
        .build()
        return _pinMedium!!
    }

private var _pinMedium: ImageVector? = null
