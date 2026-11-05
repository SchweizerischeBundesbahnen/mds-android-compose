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

public val SBBIcons.SignNoEntryMedium: ImageVector
    get() {
        if (_signNoEntryMedium != null) {
            return _signNoEntryMedium!!
        }
        _signNoEntryMedium = Builder(
            name = "SignNoEntryMedium",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(33.0f, 11.787f)
                verticalLineToRelative(12.425f)
                lineTo(24.213f, 33.0f)
                lineTo(11.787f, 33.0f)
                lineTo(3.0f, 24.212f)
                lineTo(3.0f, 11.787f)
                lineTo(11.787f, 3.0f)
                horizontalLineToRelative(12.426f)
                close()
                moveTo(4.0f, 12.2f)
                verticalLineToRelative(11.597f)
                lineTo(12.201f, 32.0f)
                lineTo(23.8f, 32.0f)
                lineTo(32.0f, 23.798f)
                lineTo(32.0f, 12.201f)
                lineTo(23.799f, 4.0f)
                lineTo(12.2f, 4.0f)
                close()
                moveTo(27.0f, 21.0f)
                lineTo(9.0f, 21.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(18.0f)
                close()
                moveTo(10.0f, 20.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-4.0f)
                lineTo(10.0f, 16.0f)
                close()
            }
        }
            .build()
        return _signNoEntryMedium!!
    }

private var _signNoEntryMedium: ImageVector? = null
