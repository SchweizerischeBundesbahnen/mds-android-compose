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

public val SBBIcons.MessageSmsSmall: ImageVector
    get() {
        if (_messageSmsSmall != null) {
            return _messageSmsSmall!!
        }
        _messageSmsSmall = Builder(name = "MessageSmsSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 6.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                lineTo(3.0f, 5.5f)
                arcToRelative(0.52f, 0.52f, 0.0f, false, false, -0.3f, 0.072f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, -0.128f, 0.152f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, false, -0.071f, 0.268f)
                lineToRelative(-0.001f, 0.014f)
                lineTo(2.5f, 20.0f)
                curveToRelative(0.0f, 0.163f, 0.04f, 0.251f, 0.072f, 0.3f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, 0.152f, 0.128f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, false, 0.268f, 0.071f)
                lineToRelative(0.014f, 0.001f)
                horizontalLineToRelative(6.988f)
                lineToRelative(0.014f, -0.001f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, false, 0.268f, -0.071f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, 0.152f, -0.127f)
                arcTo(0.52f, 0.52f, 0.0f, false, false, 10.5f, 20.0f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(1.0f)
                lineTo(11.5f, 20.0f)
                curveToRelative(0.0f, 0.337f, -0.086f, 0.624f, -0.24f, 0.855f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, true, -0.536f, 0.467f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, true, -0.646f, 0.175f)
                quadToRelative(-0.03f, 0.002f, -0.05f, 0.002f)
                lineToRelative(-0.017f, 0.001f)
                lineTo(3.0f, 21.5f)
                lineTo(3.0f, 21.0f)
                lineToRelative(-0.001f, 0.5f)
                horizontalLineToRelative(-0.01f)
                lineToRelative(-0.017f, -0.001f)
                quadToRelative(-0.02f, 0.0f, -0.05f, -0.002f)
                arcToRelative(1.728f, 1.728f, 0.0f, false, true, -0.646f, -0.175f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, true, -0.536f, -0.466f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 1.5f, 20.0f)
                lineTo(1.5f, 6.0f)
                lineTo(2.0f, 6.0f)
                lineToRelative(-0.5f, -0.001f)
                verticalLineToRelative(-0.01f)
                lineToRelative(0.001f, -0.017f)
                quadToRelative(0.0f, -0.02f, 0.002f, -0.05f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, 0.175f, -0.646f)
                curveToRelative(0.092f, -0.184f, 0.238f, -0.383f, 0.467f, -0.536f)
                curveToRelative(0.231f, -0.154f, 0.518f, -0.24f, 0.855f, -0.24f)
                horizontalLineToRelative(3.5f)
                close()
                moveTo(21.5f, 13.5f)
                horizontalLineToRelative(-8.293f)
                lineTo(10.5f, 16.207f)
                lineTo(10.5f, 13.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-12.0f)
                horizontalLineToRelative(14.0f)
                close()
                moveTo(8.5f, 12.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.293f)
                lineToRelative(1.293f, -1.293f)
                lineTo(20.5f, 12.5f)
                verticalLineToRelative(-10.0f)
                horizontalLineToRelative(-12.0f)
                close()
                moveTo(16.5f, 9.5f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(18.5f, 7.5f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(18.5f, 5.5f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _messageSmsSmall!!
    }

private var _messageSmsSmall: ImageVector? = null
