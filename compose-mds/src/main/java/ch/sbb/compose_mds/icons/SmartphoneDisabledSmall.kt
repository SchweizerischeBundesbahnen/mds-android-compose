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

public val SBBIcons.SmartphoneDisabledSmall: ImageVector
    get() {
        if (_smartphoneDisabledSmall != null) {
            return _smartphoneDisabledSmall!!
        }
        _smartphoneDisabledSmall = Builder(
            name = "SmartphoneDisabledSmall",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
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
                moveToRelative(17.0f, 17.707f)
                lineToRelative(3.646f, 3.647f)
                lineToRelative(0.708f, -0.707f)
                lineToRelative(-18.0f, -18.0f)
                lineToRelative(-0.708f, 0.707f)
                lineTo(7.0f, 7.707f)
                lineTo(7.0f, 19.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.5f, 21.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                close()
                moveTo(16.0f, 16.707f)
                lineTo(16.0f, 19.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                lineTo(8.0f, 8.707f)
                close()
                moveTo(8.5f, 4.0f)
                horizontalLineToRelative(7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 17.0f, 5.5f)
                lineTo(17.0f, 14.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(16.0f, 5.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                lineTo(14.0f, 5.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(10.0f, 5.0f)
                lineTo(8.5f, 5.0f)
                curveToRelative(-0.104f, 0.0f, -0.247f, 0.075f, -0.386f, 0.28f)
                lineToRelative(-0.828f, -0.56f)
                curveTo(7.506f, 4.393f, 7.914f, 4.0f, 8.5f, 4.0f)
            }
        }
            .build()
        return _smartphoneDisabledSmall!!
    }

private var _smartphoneDisabledSmall: ImageVector? = null
