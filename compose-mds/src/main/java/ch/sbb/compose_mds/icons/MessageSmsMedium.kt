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

public val SBBIcons.MessageSmsMedium: ImageVector
    get() {
        if (_messageSmsMedium != null) {
            return _messageSmsMedium!!
        }
        _messageSmsMedium = Builder(name = "MessageSmsMedium", defaultWidth = 36.0.dp, defaultHeight
                = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 9.0f)
                lineTo(4.0f, 9.0f)
                curveToRelative(-0.524f, 0.0f, -1.0f, 0.476f, -1.0f, 1.0f)
                verticalLineToRelative(21.0f)
                curveToRelative(0.0f, 0.524f, 0.476f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(10.5f)
                curveToRelative(0.524f, 0.0f, 1.0f, -0.476f, 1.0f, -1.0f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(1.0f)
                lineTo(16.5f, 31.0f)
                curveToRelative(0.0f, 1.076f, -0.924f, 2.0f, -2.0f, 2.0f)
                lineTo(4.0f, 33.0f)
                curveToRelative(-1.076f, 0.0f, -2.0f, -0.924f, -2.0f, -2.0f)
                lineTo(2.0f, 10.0f)
                curveToRelative(0.0f, -1.076f, 0.924f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(34.0f, 18.0f)
                lineTo(19.707f, 18.0f)
                lineTo(15.0f, 22.707f)
                lineTo(15.0f, 18.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(10.0f, 2.0f)
                horizontalLineToRelative(24.0f)
                close()
                moveTo(11.0f, 17.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(3.293f)
                lineTo(19.293f, 17.0f)
                lineTo(33.0f, 17.0f)
                lineTo(33.0f, 3.0f)
                lineTo(11.0f, 3.0f)
                close()
                moveTo(28.0f, 13.0f)
                lineTo(13.0f, 13.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(15.0f)
                close()
                moveTo(9.0f, 11.0f)
                lineTo(6.2f, 11.0f)
                verticalLineToRelative(-1.0f)
                lineTo(9.0f, 10.0f)
                close()
                moveTo(31.0f, 10.0f)
                lineTo(13.0f, 10.0f)
                lineTo(13.0f, 9.0f)
                horizontalLineToRelative(18.0f)
                close()
                moveTo(31.0f, 7.0f)
                lineTo(13.0f, 7.0f)
                lineTo(13.0f, 6.0f)
                horizontalLineToRelative(18.0f)
                close()
            }
        }
        .build()
        return _messageSmsMedium!!
    }

private var _messageSmsMedium: ImageVector? = null
