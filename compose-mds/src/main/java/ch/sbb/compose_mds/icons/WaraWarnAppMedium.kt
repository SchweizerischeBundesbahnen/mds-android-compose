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

public val SBBIcons.WaraWarnAppMedium: ImageVector
    get() {
        if (_waraWarnAppMedium != null) {
            return _waraWarnAppMedium!!
        }
        _waraWarnAppMedium = Builder(
            name = "WaraWarnAppMedium",
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
                pathFillType = EvenOdd,
            ) {
                moveToRelative(25.804f, 7.699f)
                lineToRelative(-5.609f, -2.805f)
                lineToRelative(0.447f, -0.894f)
                lineToRelative(6.407f, 3.203f)
                lineToRelative(0.797f, 0.399f)
                lineToRelative(-0.756f, 0.472f)
                lineToRelative(-4.927f, 3.08f)
                horizontalLineToRelative(5.463f)
                verticalLineToRelative(1.0f)
                lineTo(11.31f, 12.154f)
                verticalLineToRelative(6.407f)
                lineTo(4.903f, 18.561f)
                verticalLineToRelative(7.008f)
                horizontalLineToRelative(14.651f)
                verticalLineToRelative(1.0f)
                lineTo(9.672f, 26.569f)
                quadToRelative(0.035f, 0.145f, 0.035f, 0.3f)
                arcToRelative(1.3f, 1.3f, 0.0f, true, true, -2.566f, -0.3f)
                lineTo(3.903f, 26.569f)
                verticalLineToRelative(-1.601f)
                lineTo(2.0f, 24.968f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.903f)
                lineTo(3.903f, 17.56f)
                horizontalLineToRelative(6.406f)
                verticalLineToRelative(-5.407f)
                lineTo(6.805f, 12.153f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(13.471f)
                close()
                moveTo(22.021f, 18.561f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-4.204f)
                horizontalLineToRelative(-9.009f)
                verticalLineToRelative(4.204f)
                horizontalLineToRelative(8.508f)
                moveToRelative(-0.5f, -3.204f)
                verticalLineToRelative(2.204f)
                horizontalLineToRelative(-7.009f)
                verticalLineToRelative(-2.204f)
                close()
                moveTo(27.281f, 16.257f)
                lineTo(26.824f, 15.229f)
                lineTo(26.368f, 16.257f)
                lineTo(19.961f, 30.671f)
                lineTo(19.648f, 31.374f)
                horizontalLineToRelative(14.353f)
                lineToRelative(-0.313f, -0.703f)
                close()
                moveTo(26.824f, 17.691f)
                lineTo(32.461f, 30.374f)
                lineTo(21.188f, 30.374f)
                close()
                moveTo(26.324f, 28.471f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.6f)
                close()
                moveTo(27.324f, 25.268f)
                verticalLineToRelative(-3.203f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.203f)
                close()
                moveTo(8.105f, 26.87f)
                arcToRelative(0.3f, 0.3f, 0.0f, true, true, 0.602f, 0.0f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, true, -0.601f, 0.0f)
            }
        }
            .build()
        return _waraWarnAppMedium!!
    }

private var _waraWarnAppMedium: ImageVector? = null
