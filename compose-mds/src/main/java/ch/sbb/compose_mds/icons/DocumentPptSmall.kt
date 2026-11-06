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

public val SBBIcons.DocumentPptSmall: ImageVector
    get() {
        if (_documentPptSmall != null) {
            return _documentPptSmall!!
        }
        _documentPptSmall = Builder(name = "DocumentPptSmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 9.293f)
                lineTo(18.0f, 20.0f)
                lineTo(6.0f, 20.0f)
                verticalLineToRelative(-0.5f)
                lineToRelative(0.008f, -15.0f)
                lineTo(6.01f, 4.0f)
                horizontalLineToRelative(6.698f)
                close()
                moveTo(7.0f, 19.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(12.0f, 5.0f)
                lineTo(7.009f, 5.0f)
                close()
                moveTo(9.235f, 15.002f)
                quadToRelative(0.312f, 0.0f, 0.491f, 0.037f)
                quadToRelative(0.18f, 0.039f, 0.324f, 0.135f)
                quadToRelative(0.4f, 0.263f, 0.4f, 0.792f)
                quadToRelative(0.0f, 0.47f, -0.331f, 0.738f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, true, -0.32f, 0.165f)
                quadToRelative(-0.18f, 0.05f, -0.444f, 0.05f)
                horizontalLineToRelative(-0.687f)
                lineTo(8.668f, 18.0f)
                lineTo(8.0f, 18.0f)
                verticalLineToRelative(-2.998f)
                close()
                moveTo(12.051f, 15.002f)
                quadToRelative(0.311f, 0.0f, 0.49f, 0.037f)
                quadToRelative(0.18f, 0.039f, 0.325f, 0.135f)
                quadToRelative(0.4f, 0.263f, 0.4f, 0.792f)
                quadToRelative(0.0f, 0.47f, -0.33f, 0.738f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, true, -0.322f, 0.165f)
                quadToRelative(-0.18f, 0.05f, -0.443f, 0.05f)
                horizontalLineToRelative(-0.687f)
                lineTo(11.484f, 18.0f)
                horizontalLineToRelative(-0.668f)
                verticalLineToRelative(-2.998f)
                close()
                moveTo(16.001f, 15.557f)
                horizontalLineToRelative(-0.931f)
                lineTo(15.07f, 18.0f)
                horizontalLineToRelative(-0.668f)
                verticalLineToRelative(-2.443f)
                horizontalLineToRelative(-0.925f)
                verticalLineToRelative(-0.554f)
                lineTo(16.0f, 15.003f)
                close()
                moveTo(8.668f, 16.405f)
                horizontalLineToRelative(0.597f)
                quadToRelative(0.264f, 0.0f, 0.382f, -0.092f)
                quadToRelative(0.145f, -0.115f, 0.145f, -0.338f)
                quadToRelative(0.0f, -0.226f, -0.167f, -0.336f)
                quadToRelative(-0.12f, -0.082f, -0.396f, -0.082f)
                horizontalLineToRelative(-0.56f)
                close()
                moveTo(11.484f, 16.405f)
                horizontalLineToRelative(0.597f)
                quadToRelative(0.265f, 0.0f, 0.382f, -0.092f)
                quadToRelative(0.145f, -0.115f, 0.145f, -0.338f)
                quadToRelative(0.0f, -0.226f, -0.167f, -0.336f)
                quadToRelative(-0.121f, -0.082f, -0.396f, -0.082f)
                horizontalLineToRelative(-0.561f)
                close()
                moveTo(13.0f, 9.0f)
                horizontalLineToRelative(3.292f)
                lineTo(13.0f, 5.708f)
                close()
            }
        }
        .build()
        return _documentPptSmall!!
    }

private var _documentPptSmall: ImageVector? = null
